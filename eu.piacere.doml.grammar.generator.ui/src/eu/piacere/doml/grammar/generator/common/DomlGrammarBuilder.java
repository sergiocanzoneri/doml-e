package eu.piacere.doml.grammar.generator.common;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * A class used to build a full Xtext syntax for DOML starting
 * from the Ecore and an optional JSON configuration file.
 */
public final class DomlGrammarBuilder {
	
	/** Singleton instance. */
	private static DomlGrammarBuilder domlGrammarBuilder;
	
	/*
	 * A String containing the JSON configuration file path.
	 * Such a file will contain keywords to be used and several other
	 * elements to define the structure of the syntax.
	 * It may also contain DOML syntax fixed content, which
	 * could potentially be updated for next releases of DOML.
	 */
	private String jsonFilePath;
	
	// A map to store the content of the JSON configuration file.
	private Map<String, JsonElement> jsonFileContent;

	// The terminals associated with the different types used in DOML.
	private static final String XTEXT_STRING_ELEM = "STRING";
	private static final String XTEXT_INT_ELEM = "INT";
	private static final String XTEXT_FLOAT_ELEM = "FLOAT";
	private static final String XTEXT_BOOLEAN_ELEM = "Boolean";
	
	// Two maps for easily accessing sub-types and super-types of a given DOML EClassifier.
	private Map<EClassifier, List<EClassifier>> subtypesHierarchy;
	private Map<EClassifier, List<EClassifier>> supertypesHierarchy;
	
	// A map containing the rule names associated with the classifiers.
	private Map<EClassifier, String> rulesNames;
	
	// The classifier of the special elements "DOMLElement" and "ConcreteElement".
	private EClassifier domlElementEClassifier;
	private EClassifier concreteElementEClassifier;

	// StringBuilders to build the full syntax.
	private StringBuilder grammarDeclaration;
	private StringBuilder unchangeables;
	private StringBuilder datatypes;
	private StringBuilder terminals;
	
	// Constant JSON keys to access fixed DOML content.
	private static final String JSON_KEY_GRAMMAR_DECLARATION = "GrammarDeclaration";
	private static final String JSON_KEY_UNCHANGEABLES = "UnchangeableRules";
	private static final String JSON_KEY_DATATYPES = "DatatypeRules";
	private static final String JSON_KEY_TERMINALS = "TerminalRules";
	
	/*
	 * Special JSON key used to retrieve the name of the class whose
	 * keyword will be replaced by an enumeration value.
	 */
	private static final String JSON_KEY_REPLACE_KEYWORD_WITH_ENUM = "Replace";
	
	// Two JSON keys used to retrieve the chosen symbols to enclose multiple attributes or references.
	private static final String JSON_KEY_MULTIPLE_ENCLOSING_OPEN = "EnclosingOpen";
	private static final String JSON_KEY_MULTIPLE_ENCLOSING_CLOSE = "EnclosingClose";

	// Singleton instance.
	public static DomlGrammarBuilder getInstance() {
		if (domlGrammarBuilder == null) {
			domlGrammarBuilder = new DomlGrammarBuilder();
		}
		return domlGrammarBuilder;
	}

	private DomlGrammarBuilder() {
		initializeDomlGrammarBuilder();
	}
	
	// An Exception used to report issues in the syntax building process.
	public class DomlGrammarBuilderException extends Exception {

		private static final long serialVersionUID = 7638529711627627474L;
		
		public DomlGrammarBuilderException(String message){
	        super(message);
	    }
		
		public DomlGrammarBuilderException() {
			super();
		}
		
	}
	
	/*
	 * As soon as the JSON configuration file is selected by the user,
	 * its path is stored within the builder and its content is loaded
	 * to be stored within the "jsonFileContent" map.
	 */
	public void setJsonFilePath(String filePath) {
		jsonFilePath = filePath;
		this.loadJsonContent();
	}

	/*
	 * Initialization of the DOML fixed content, currently using DOML 3.1 syntax.
	 * This could be replaced by content to be loaded from the JSON file
	 * (e.g., in case such fixed content will be changed in next releases of DOML).
	 */
	private void initializeDomlGrammarBuilder() {
		fillGrammarDeclaration();
		fillUnchangeableRules();
		fillDatatypeRules();
		fillTerminalRules();
	}
	
	/*
	 * Loading the fixed content from the JSON file.
	 * This method is public and is called only if the user chooses to
	 * dynamically load the content from the file instead of using
	 * the default one contained in the filling methods.
	 */
	public void loadFixedRulesFromJson() {
		loadGrammarDeclaration();
		loadUnchangeableRules();
		loadDatatypeRules();
		loadTerminalRules();
	}

	
	public StringBuilder generateGrammar(IFile ecoreFile) throws DomlGrammarBuilderException {
		final EPackage metamodelRootPackage = loadMetamodel(ecoreFile);
		final StringBuilder grammarBody = generateGrammarBody(metamodelRootPackage);
		final StringBuilder xtextContent = buildGrammar(grammarBody);
		return xtextContent;
	}

	// Load the Ecore metamodel resources by getting DOML root package.
	private EPackage loadMetamodel(IFile ecoreFile) {
		ResourceSet set = new ResourceSetImpl();
		Resource.Factory ecoreResourceFactory = new EcoreResourceFactoryImpl();
		// EcorePackage.eNS_PREFIX could be EcoreEditor.ECORE_FILE_EXTENSION, but that's actually the same value.
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EcorePackage.eNS_PREFIX, ecoreResourceFactory);
		URI fileURI = URI.createFileURI(ecoreFile.getRawLocation().makeAbsolute().toString());
		Resource res = set.getResource(fileURI, true);
		EPackage ePackage = (EPackage) res.getContents().get(0);
		return ePackage;
	}
	
	// Using Gson library to load content from the JSON file, then storing it in the jsonFileContent map.
	private void loadJsonContent() {
		Gson gson = new Gson();
		try {
			JsonObject jsonObject = gson.fromJson(new FileReader(jsonFilePath), JsonObject.class); 
			jsonFileContent = jsonObject.asMap();
		} catch (Exception e) {
			e.printStackTrace();
			jsonFileContent = null;
		}
	}

	/*
	 * Generating the grammar body by initializing the classifier hierarchy and adding
	 * the subpackages imports and the grammar rules.
	 */
	private StringBuilder generateGrammarBody(EPackage rootPackage) throws DomlGrammarBuilderException {
		final StringBuilder grammarBody = new StringBuilder();

		getImportsFromSubpackages(rootPackage, grammarBody);
		
		initializeEClassifierHierarchy(rootPackage);
		
		createRulesForPackage(rootPackage, grammarBody);

		return grammarBody;
	}
	
	@SuppressWarnings("unchecked") // The check is actually done by using the method "isEListOfEClassifier".
	/***
	 * Initializes two maps storing the EClassifier hierarchy within the DOML metamodel:
	 * one will be containing the list of all super-types for each EClassifier, the other
	 * one will be containing the list of all sub-types for each of them.
	 * @param rootPackage the DOML root package
	 * @throws DomlGrammarBuilderException either if the eAllSuperTypes lists is not instance of EList<EClassifier>
	 * or if the DOMLElement or the ConcreteElement class is not found.
	 * This is supposed to never happen.
	 */
	private void initializeEClassifierHierarchy(EPackage rootPackage) throws DomlGrammarBuilderException {
		boolean domlElementEClassifierFound = false;
		boolean concreteElementEClassifierFound = false;
		subtypesHierarchy = new HashMap<EClassifier, List<EClassifier>>();
		supertypesHierarchy = new HashMap<EClassifier, List<EClassifier>>();
		
		for(EPackage ePackage : rootPackage.getESubpackages()) {
			for(EClassifier eClassifier : ePackage.getEClassifiers()) {
				if(eClassifier instanceof EClass) {
					
					if(!DomlReservedClasses.getClassNames().contains(eClassifier.getName())) {
					
						// Look for "DOMLElement" and "ConcreteElement" classes.
						if(!domlElementEClassifierFound || !concreteElementEClassifierFound) {
							if(eClassifier.getName().equals(DomlSpecialClasses.DOML_ELEMENT.getClassName())) {
								domlElementEClassifier = eClassifier;
								domlElementEClassifierFound = true;
							}
							else if(eClassifier.getName().equals(DomlSpecialClasses.CONCRETE_ELEMENT.getClassName())) {
								concreteElementEClassifier = eClassifier;
								concreteElementEClassifierFound = true;
							}
						}
						
						
						Object eAllSuperTypesObject = eClassifier.eGet(EcorePackage.eINSTANCE.getEClass_EAllSuperTypes());
						EList<EClassifier> eAllSuperTypes;
						
						if(isEListOfEClassifier(eAllSuperTypesObject)) { 
							eAllSuperTypes = (EList<EClassifier>)eAllSuperTypesObject;
							
							if(!eAllSuperTypes.isEmpty()) {
								
								supertypesHierarchy.put(eClassifier, eAllSuperTypes);
							}
						}
						else {
							throw new DomlGrammarBuilderException("Error while initializing EClassifier Hierarchy: eAllSuperTypesObject of "
									+ eClassifier.getName() + " is not of type EList<EClassifier>.");
						}
						
						if(!eAllSuperTypes.isEmpty()) {
							
							for(EClassifier eSuperType : eAllSuperTypes) {
								if(subtypesHierarchy.containsKey(eSuperType)) {
									subtypesHierarchy.get(eSuperType).add(eClassifier);
								} else { 
									List<EClassifier> eSubTypes = new ArrayList<EClassifier>();
									eSubTypes.add(eClassifier);
									subtypesHierarchy.put(eSuperType, eSubTypes); 
								} 
							}
						}
					}
				}
				// Else: Basically, EEnum instead of EClass.
			}
		}
		if(!domlElementEClassifierFound) {
			throw new DomlGrammarBuilderException("DomlGrammarBuilder: EClassifier not found for DOMLElement class.");
		}
		if(!concreteElementEClassifierFound) {
			throw new DomlGrammarBuilderException("DomlGrammarBuilder: EClassifier not found for ConcreteElement class.");
		}
	}
	
	/*
	 * Since it is not possible to directly check if an EObject is instance of
	 * EList<EClassifier> at compile time, this method allows to perform a
	 * safe check before casting the object.
	 */
	private boolean isEListOfEClassifier(Object objectToCheck) {
		if(objectToCheck instanceof EList) { 
			EList<?> eList = (EList<?>)objectToCheck;
			for(Object obj : eList) {
				if(!(obj instanceof EClassifier)) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * For each classifier, it stores the associated rule name within the "rulesNames" map.
	 * Please note that within two different packages, there could be two classifiers
	 * sharing the same name: therefore, there is the need to distinguish them by
	 * assigning a different rule name to each classifier.
	 * To do so, a check to see whether the classifier name is present within the map
	 * values is done: if such condition happens to be true, then a new rule name
	 * is built by adding the package name as a prefix to the classifier name.
	 */
	private void fillRulesNames(EPackage rootPackage) {
		
		rulesNames = new HashMap<EClassifier, String>();
		
		for(EPackage ePackage : rootPackage.getESubpackages()) {
			
			for(EClassifier eClassifier : ePackage.getEClassifiers()) {
				
				String className = eClassifier.getName();
				
				// Include only actually generated rules names.
				if(!DomlReservedClasses.getClassNames().contains(className)) {
					
					// If the rule is not included in the fixed content, build the rule name string.
					if(!DomlSpecialClasses.getClassNames().contains(className)) {
						
						String ruleName = new String();
						
						// Handling duplicated names in different layers by inserting the package name as prefix.
						if(rulesNames.containsValue(className)) {
							String packageName = eClassifier.getEPackage().getName();
							// Capitalize first letter.
							String rulePrefix = packageName.substring(0,1).toUpperCase() + packageName.substring(1);
							ruleName+=rulePrefix;
						}
						ruleName+=className;
						
						rulesNames.put(eClassifier, ruleName);
					}
					// Otherwise, retrieve its name from the enumeration.
					else {
						String ruleName = DomlSpecialClasses.getRuleName(className);
						/*
						 * No need to check if null, since it is impossible by construction (entering
						 * else condition only if className is contained in DomlSpecialClasses).
						 */
						rulesNames.put(eClassifier, ruleName);
					}
					
				}
			}
		}
	}

	/*
	 * Scans the metamodel and creates an Xtext rule for each EClass or EEnum.
	 * It also creates a fragment rule for two specific abstract EClass instances (DOMLElement and ConcreteElement).
	 * The rules are appended to the StringBuilder argument "bld".
	 */
	private void createRulesForPackage(EPackage rootPackage, StringBuilder bld) throws DomlGrammarBuilderException {
		
		StringBuilder tmpBld = new StringBuilder();		
		fillRulesNames(rootPackage);

		for(EPackage ePackage : rootPackage.getESubpackages()) {
			// Exclude Optimization Layer: since it is completely unchangeable, each class will be loaded from JSON.
			if(!ePackage.getNsURI().equals(DomlPackage.OPTIMIZATION.getNsURI())) {
				
				for(EClassifier eClassifier : ePackage.getEClassifiers()) {
					
					// Create rules only for currently implemented classes in DOML.
					if(!DomlReservedClasses.getClassNames().contains(eClassifier.getName())) {
						
						if(eClassifier.eClass().equals(EcorePackage.eINSTANCE.getEClass())) {
							// ABSTRACT CLASSES
							if((boolean) eClassifier.eGet(EcorePackage.eINSTANCE.getEClass_Abstract())) {
								// NOTE: Currently generating fragment only for two abstract classes (DomlElement, ConcreteElement).
								if(eClassifier == domlElementEClassifier) {
									tmpBld.append(buildAbstractClassFragment(eClassifier, true));
								}
								else if(eClassifier == concreteElementEClassifier) {
									tmpBld.append(buildAbstractClassFragment(eClassifier, false));
								}
								else if(!DomlSpecialClasses.getClassNames().contains(eClassifier.getName())){
									tmpBld.append(buildAbstractClassRule(eClassifier));
								}
							} 
							// CONCRETE CLASSES
							else {
								if(eClassifier.getName().equals(DomlSpecialClasses.DOML_MODEL.getClassName())) {
									tmpBld.append(buildDomlModelRule(eClassifier));
								}
								else if(!DomlSpecialClasses.getClassNames().contains(eClassifier.getName())) {
									tmpBld.append(buildConcreteClassRule(eClassifier));
								}
								// Else: if it is unchangeable and not DOMLModel, then ignore it, as it is loaded as fixed content.
							}
						}
						else if(eClassifier.eClass().equals(EcorePackage.eINSTANCE.getEEnum())) {
							tmpBld.append(buildEnumRule(eClassifier));
						}
						
					}
					
				}
			}
			
		}
		
		bld.append(tmpBld);
	}
	
	/*
	 * Builds the Xtext rule associated with the "DOMLModel" class, which is handled as a special case.
	 */
	private String buildDomlModelRule(EClassifier eClassifier) throws DomlGrammarBuilderException {
		String rule;
		StringBuilder bld = new StringBuilder();
		String name = eClassifier.getName();
		String ruleName = rulesNames.get(eClassifier);
		EReference concretizationsRef = null;
		EReference activeInfrastructureRef = null;

		// Append the rule name, getting it from rulesNames.
		bld.append(ruleName);
		
		bld.append(" returns ");
		bld.append(eClassifier.getEPackage().getNsPrefix() + "::" + name);
		bld.append(':' + System.lineSeparator());
		bld.append("\t");
		bld.append(getClassKeyword(ruleName));
		bld.append(" name=ID" + System.lineSeparator());
		bld.append("\t(" + System.lineSeparator());
		bld.append("\t\t'{' ");

		EList<EObject> eAllContents = getAllEContents(eClassifier);
		
		if(eAllContents != null) {
			
			// Delete EObjects not being neither attributes nor references.
			EList<EObject> eAttributesAndReferences = ECollections.newBasicEList();
			
			for(EObject obj : eAllContents) {
				if(obj instanceof EReference) {
					EReference eRef = (EReference) obj;
					if(eRef.getName().equals(DomlSpecialClasses.DOML_MODEL_CONCRETIZATIONS_REF)) {
						eAttributesAndReferences.add(obj);
						concretizationsRef = eRef;
					}
					else if(eRef.getName().equals(DomlSpecialClasses.DOML_MODEL_ACTIVE_CONCRETE_INFRASTRUCTURE_REF)) {
						activeInfrastructureRef = eRef;
					}
					else {
						eAttributesAndReferences.add(obj);
					}
				}
				else if(obj instanceof EAttribute) {
					EAttribute eAttr = (EAttribute) obj;
					if(eAttr.getName().equals(DomlSpecialClasses.DOML_MODEL_VERSION_ATTR)) {
						bld.append(handleAttribute(eClassifier, eAttr, DomlSpecialClasses.DOML_MODEL_VERSION_ATTR_KEYWORD) + System.lineSeparator());
					}
					else {
						eAttributesAndReferences.add(obj);
					}
				}
			}
			
			bld.append("\t\t\t" + rulesNames.get(domlElementEClassifier) + System.lineSeparator());
			
			int eAttributesAndReferencesSize = eAttributesAndReferences.size();
			int lastIndex = eAttributesAndReferencesSize - 1;
			int numOfTabs = ((eAttributesAndReferencesSize > 1) ? 4 : 3);
			
			if(eAttributesAndReferencesSize > 0) {
				bld.append("\t\t\t(" + System.lineSeparator());
				
				for(int i = 0; i < eAttributesAndReferencesSize; i++) {
					EObject obj = eAttributesAndReferences.get(i);
					bld.append("\t\t\t");
					if(eAttributesAndReferencesSize>1)
						bld.append("\t");
					if(obj instanceof EReference) {
						// Please note that if isContainment() == true -> val, else -> ref (Emfatic notation).
						EReference eRef = (EReference) obj;
						if(eRef.equals(concretizationsRef)) {
							bld.append(handleCompositeSelectionReference(eClassifier, eRef,
									DomlSpecialClasses.DOML_MODEL_CONCRETIZATIONS_REF_KEYWORD, activeInfrastructureRef,
									DomlSpecialClasses.DOML_MODEL_ACTIVE_CONCRETE_INFRASTRUCTURE_REF_KEYWORD, numOfTabs));
						}
						else {
							bld.append(handleReference(eClassifier, eRef, null));
						}
						
						if(i < lastIndex) {
							bld.append(" &");
						}
						bld.append(System.lineSeparator());
					} 
					/* 
					 * Please note else condition is sufficient, since only EAttribute and
					 * EReference objects are included in the list.
					*/
					// if(obj instanceof EAttribute)
					else {
						EAttribute eAttr = (EAttribute) obj;
						bld.append(handleAttribute(eClassifier, eAttr, null));
						
						if(i < lastIndex) {
							bld.append(" &");
						}
						bld.append(System.lineSeparator());
					}
				}
				
				bld.append("\t\t\t)" + System.lineSeparator());
			}
			
		}
		
		
		bld.append("\t\t'}'" + System.lineSeparator());
		bld.append("\t)" + System.lineSeparator());
		bld.append(";" + System.lineSeparator() + System.lineSeparator());
		
		rule = bld.toString();
		
		return rule;
	}
	
	/*
	 * Builds the Xtext rule for an EEnum.
	 */
	private String buildEnumRule(EClassifier eClassifier) {
		String rule;
		StringBuilder bld = new StringBuilder();
		
		EEnum eEnum = (EEnum)eClassifier;
		String name = eEnum.getName();
		String ruleName = rulesNames.get(eClassifier);
		
		bld.append("enum ");
		
		// Append the rule name, getting it from rulesNames.
		bld.append(ruleName);
		
		bld.append(" returns ");
		bld.append(eClassifier.getEPackage().getNsPrefix() + "::" + name);
		bld.append(':' + System.lineSeparator() + "\t");
		
		List<EEnumLiteral> literals = eEnum.getELiterals();
		int literalsSize = eEnum.getELiterals().size();
		
		for(int i=0; i < literalsSize; i++) {
			String keyword = null;
			bld.append(literals.get(i));
			bld.append("=");
			keyword = getSubKeywordFromJson(ruleName, literals.get(i).getName());
			if(keyword == null)
				keyword = DomlKeywordBuilder.buildKeyword(literals.get(i).getName());
			bld.append(keyword);
			
			if(i<eEnum.getELiterals().size()-1) {
				bld.append(" | ");
			}
		}
		
		bld.append(System.lineSeparator());
		
		bld.append(";" + System.lineSeparator() + System.lineSeparator());
		
		rule = bld.toString();
		
		return rule;
	}
	
	/***
	 * This method is used to build fragments for abstract classes.
	 * Currently, this is used only for the "DOMLElement" and "ConcreteElement" classes.
	 * @param eClassifier
	 * @return
	 * @throws DomlGrammarBuilderException
	 */
	private String buildAbstractClassFragment(EClassifier eClassifier, boolean isDomlElementClass) throws DomlGrammarBuilderException {
		StringBuilder bld = new StringBuilder();
		String name = eClassifier.getName();
		
		bld.append("fragment ");
		
		// Append the rule name, getting it from rulesNames.
		bld.append(rulesNames.get(eClassifier));
		
		bld.append(" returns ");
		bld.append(eClassifier.getEPackage().getNsPrefix() + "::" + name);
		bld.append(':' + System.lineSeparator());
		
		EList<EObject> eAllContents = getAllEContents(eClassifier);
		if(eAllContents != null) {
			
			// Delete EObjects not being neither attributes nor references.
			EList<EObject> eAttributesAndReferences = ECollections.newBasicEList();
			
			for(EObject obj : eAllContents) {
				if((obj instanceof EReference)) {
					eAttributesAndReferences.add(obj);
				}
				else if((obj instanceof EAttribute)) {
					if(isDomlElementClass) {
						EAttribute eAttr = (EAttribute) obj;
						if(!eAttr.getName().equals(DomlSpecialClasses.DOML_ELEMENT_NAME_ATTR)) {
							eAttributesAndReferences.add(obj);
						}
					}
					else {
						eAttributesAndReferences.add(obj);
					}
				}
			}
			
			bld.append(buildClassContent(eClassifier, false, eAttributesAndReferences, null));
		}
			
		bld.append(";" + System.lineSeparator() + System.lineSeparator());
		
		return bld.toString();
	}
	
	private String buildAbstractClassRule(EClassifier eClassifier) throws DomlGrammarBuilderException {
		StringBuilder bld = new StringBuilder();
		String name = eClassifier.getName();
		String ruleName = rulesNames.get(eClassifier);
		
		// Append the rule name, getting it from rulesNames.
		bld.append(ruleName);
		
		bld.append(" returns ");
		bld.append(eClassifier.getEPackage().getNsPrefix() + "::" + name);
		bld.append(':' + System.lineSeparator());
		bld.append("\t");
		
		List<EClassifier> subtypes = subtypesHierarchy.get(eClassifier);
		
		int subtypesSize = subtypes.size();
		int lastIndex = subtypesSize - 1;
		
		for(int i = 0; i < subtypesSize; i++) {
			String subtypeRuleName = rulesNames.get(subtypes.get(i));
			if(subtypeRuleName != null) {
				bld.append(subtypeRuleName);
				if(i < lastIndex) {
					bld.append(" | ");
				}
			}

		}

		bld.append(System.lineSeparator());
		
		bld.append(";" + System.lineSeparator() + System.lineSeparator());
		
		return bld.toString();
	}
	
	/*
	 * Builds the Xtext rule for a concrete EClass.
	 * Rules can be currently divided into two categories:
	 * - Unordered content:
	 * 		The EClass only contains containment references being multiple and optional.
	 * 		Elements belonging to each reference can be instantiated in any order within
	 * 		the container EClass, therefore allowing the user to build the desired custom order.
	 * 		This currently happens to be true only for classes representing the main layers.
	 * 		These classes are references in the DomlUnorderedClasses enumeration.
	 * - Regular content:
	 * 		Each reference or attribute can be specified at any point within the container
	 * 		EClass, but elements belonging to the same references need to be grouped
	 * 		and, therefore, specified all consecutively.
	 */
	private String buildConcreteClassRule(EClassifier eClassifier) throws DomlGrammarBuilderException {
		String rule;
		StringBuilder bld = new StringBuilder();
		String name = eClassifier.getName();
		String ruleName = rulesNames.get(eClassifier);
		
		EList<EObject> eAllContents = getAllEContents(eClassifier);
		EList<EObject> eAttributesAndReferences = null;
		
		if(eAllContents != null) {
			// Delete EObjects not being neither attributes nor references.
			eAttributesAndReferences = ECollections.newBasicEList();
			for(EObject obj : eAllContents) {
				if((obj instanceof EReference) || (obj instanceof EAttribute)) {
					eAttributesAndReferences.add(obj);
				}
			}
		}
		
		/*
		 * NOTE: It was decided to check the content condition rather than using an enumeration.
		 * This will allow to automatically detect whether new classes for which content
		 * could be presented in unspecified order have been introduced (mainly, introduction
		 * of new layers classes, but potentially also other kinds of elements).
		 */
		//boolean isUnordered = DomlUnorderedClasses.getClassNames().contains(name);
		boolean isUnordered = isUnorderedClass(eAttributesAndReferences);
		
		
		/*
		 * Retrieve attributes having Enumeration type and check through the JSON content
		 * if some keyword has to be replaced with that enumeration attribute.
		 * If this happens, then put in the replaceKeywordWithEnum map the name of the
		 * element whose keyword needs to be replaced together with the enumeration
		 * rule, contained in the enumKeyword string.
		 */
		List<EAttribute> containedEnumAttrs = containedEnumAttributes(eAttributesAndReferences);
		Map<String, String> replaceKeywordWithEnum = new HashMap<String, String>();
		
		if(!containedEnumAttrs.isEmpty()) {
			for(EAttribute enumAttr : containedEnumAttrs) {
				String replaceKeywordElemName = getElemToReplaceWithEnum(eClassifier.getName(), enumAttr.getName());
				if(replaceKeywordElemName != null) {
					eAttributesAndReferences.remove(enumAttr);
					// Parenthesis are actually optional.
					String enumKeyword = "(" + enumAttr.getName() + "=" + getAttributeTypeString(enumAttr) + ")";
					replaceKeywordWithEnum.put(replaceKeywordElemName, enumKeyword);
				}
			}
		}
		
		// Append the rule name, getting it from rulesNames.
		bld.append(ruleName);
		
		bld.append(" returns ");
		bld.append(eClassifier.getEPackage().getNsPrefix() + "::" + name);
		bld.append(':' + System.lineSeparator());
		bld.append("\t");
		bld.append((replaceKeywordWithEnum.containsKey(ruleName))
				? replaceKeywordWithEnum.get(ruleName)
				: getClassKeyword(ruleName));
		
		List<EClassifier> supertypes = supertypesHierarchy.get(eClassifier);
		boolean extendsDomlElement;
		boolean extendsConcreteElement;
		
		if(supertypes != null) {
			extendsDomlElement = supertypes.contains(domlElementEClassifier);
			extendsConcreteElement = supertypes.contains(concreteElementEClassifier);
		}
		else {
			extendsDomlElement = false;
			extendsConcreteElement = false;
		}

		if(extendsDomlElement) {
			bld.append(" name=ID '{' ");
			bld.append(rulesNames.get(domlElementEClassifier) + System.lineSeparator());
		}
		else {
			bld.append(" '{'" + System.lineSeparator());
		}
		
		if(extendsConcreteElement) {
			bld.append("\t\t");
			bld.append(rulesNames.get(concreteElementEClassifier) + System.lineSeparator());
		}
			
		if(isUnordered) {
			bld.append(buildUnorderedClassContent(eClassifier, eAttributesAndReferences));
		}
		else {
			bld.append(buildClassContent(eClassifier, true, eAttributesAndReferences, replaceKeywordWithEnum));
		}
		
		bld.append("\t'}'" + System.lineSeparator());
		bld.append(";" + System.lineSeparator() + System.lineSeparator());
		
		rule = bld.toString();
		
		return rule;
	}
	
	/*
	 * Builds the Xtext content for an unordered class.
	 */
	private String buildUnorderedClassContent(EClassifier eClassifier, EList<EObject> eAttrAndRefs) throws DomlGrammarBuilderException {
		StringBuilder bld = new StringBuilder();
		
		if(eAttrAndRefs != null) {
			
			EList<EObject> eReferences = ECollections.newBasicEList();
			
			for(EObject obj : eAttrAndRefs) {
				if(obj instanceof EReference) {
					eReferences.add(obj);
				}
				else if(obj instanceof EAttribute) {
					EAttribute eAttr = (EAttribute) obj;
					throw new DomlGrammarBuilderException("Content not suitable for unordered class: "
							+ eAttr.getName() + " is instanceof EAttribute.");
				}
			}
			
			int eReferencesSize = eReferences.size();
			int lastIndex = eReferencesSize - 1;
			

			bld.append("\t\t(" + System.lineSeparator());
			
			for(int i = 0; i < eReferencesSize; i++) {
				EObject obj = eReferences.get(i);
				bld.append("\t\t\t");

				EReference eRef = (EReference) obj;
				bld.append(handleReferenceUnordered(eClassifier, eRef));
				
				if(i < lastIndex) {
					bld.append(" |");
				}
				bld.append(System.lineSeparator());

			}

			bld.append("\t\t)*" + System.lineSeparator());
		}
		
		return bld.toString();
	}
	
	/*
	 * Builds the Xtext content for a regular class.
	 */
	private String buildClassContent(EClassifier eClassifier, boolean isConcrete, EList<EObject> eAttrAndRefs, Map<String, String> replaceKeywordWithEnum) throws DomlGrammarBuilderException {
		
		StringBuilder bld = new StringBuilder();
		
		if(eAttrAndRefs != null) {
			
			int eAttributesAndReferencesSize = eAttrAndRefs.size();
			int lastIndex = eAttributesAndReferencesSize - 1;
			
			if(eAttributesAndReferencesSize>1) {
				if(isConcrete) 
					bld.append("\t");
				bld.append("\t(" + System.lineSeparator());
			}
			
			for(int i = 0; i < eAttributesAndReferencesSize; i++) {
				EObject obj = eAttrAndRefs.get(i);
				if(isConcrete) 
					bld.append("\t");
				bld.append("\t");
				if(eAttributesAndReferencesSize>1)
					bld.append("\t");
				if(obj instanceof EReference) {
					EReference eRef = (EReference) obj;
					if(replaceKeywordWithEnum != null && replaceKeywordWithEnum.containsKey(eRef.getName())) {
						bld.append(handleReference(eClassifier, eRef, replaceKeywordWithEnum.get(eRef.getName())));
					}
					else {
						bld.append(handleReference(eClassifier, eRef, null));
					}
					
					if(i < lastIndex) {
						bld.append(" &");
					}
					bld.append(System.lineSeparator());
				} 
				/* Please note else condition is sufficient, since only EAttribute and
				 * EReference objects are included in the list.
				*/
				// if(obj instanceof EAttribute)
				else {
					EAttribute eAttr = (EAttribute) obj;
					if(replaceKeywordWithEnum != null && replaceKeywordWithEnum.containsKey(eAttr.getName())) {
						bld.append(handleAttribute(eClassifier, eAttr, replaceKeywordWithEnum.get(eAttr.getName())));
					}
					else {
						bld.append(handleAttribute(eClassifier, eAttr, null));
					}
					
					if(i < lastIndex) {
						bld.append(" &");
					}
					bld.append(System.lineSeparator());
				}
			}
			if(eAttributesAndReferencesSize>1) {
				if(isConcrete) 
					bld.append("\t");
				bld.append("\t)" + System.lineSeparator());
			}
		}
		
		return bld.toString();
	}

	/*
	 * Given a list of attributes and references of an EClassifier, it returns
	 * the list of EAttribute having an EEnum as attribute type.
	 */
	private List<EAttribute> containedEnumAttributes(EList<EObject> attrAndRefs) {
		List<EAttribute> enumAttrs = new ArrayList<EAttribute>();
		
		if(attrAndRefs==null || attrAndRefs.isEmpty())
			return enumAttrs;
		
		for(EObject eObj : attrAndRefs) {
			if(eObj instanceof EAttribute) {
				EAttribute eAttr = (EAttribute)eObj;
				EDataType attrType = eAttr.getEAttributeType();
				if(EcorePackage.eINSTANCE.getEEnum().isSuperTypeOf(attrType.eClass())) {
					enumAttrs.add(eAttr);
				}
			}
		}
		
		return enumAttrs;
	}
	
	/*
	 * Checks whether the condition for unordered classes is satisfied: only containment
	 * multiple and optional references should be contained within such classes.
	 */
	private boolean isUnorderedClass(EList<EObject> attrAndRefs) {
		
		if(attrAndRefs==null || attrAndRefs.isEmpty())
			return false;
		
		for(EObject eObj : attrAndRefs) {
			if(eObj instanceof EReference) {
				EReference eRef = (EReference)eObj;
				int lowerBound = eRef.getLowerBound();
				int upperBound = eRef.getUpperBound();
				boolean isVal = eRef.isContainment();
				boolean isMultiple, isOptional;
				isOptional = lowerBound == 0;
				isMultiple = upperBound == (-1) || upperBound > 1;
				if(!isVal || !isMultiple || !isOptional) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * Builds the Xtext content for a reference in an unordered class.
	 */
	private String handleReferenceUnordered(EClassifier eClassifier, EReference eRef) throws DomlGrammarBuilderException {
		StringBuilder refBld = new StringBuilder();
		
		int lowerBound = eRef.getLowerBound();
		int upperBound = eRef.getUpperBound();
		boolean isVal = eRef.isContainment();
		boolean isMultiple, isOptional;
		
		isOptional = lowerBound == 0;
		isMultiple = upperBound == (-1) || upperBound > 1;
		
		if(!isVal || !isMultiple || !isOptional) {
			throw new DomlGrammarBuilderException("Content not suitable for unordered class: " 
					+ eRef.getName() + ": isVal=" + isVal + ", isMultiple=" 
					+ isMultiple + ", isOptional=" + isOptional);
		}

		EClass refClass = eRef.getEReferenceType();

		EClassifier refClassifier = refClass.getEPackage().getEClassifier(refClass.getName());
		String ruleName = rulesNames.get(refClassifier);
		
		refBld.append(eRef.getName());
		refBld.append("+=");
		refBld.append(ruleName);
		
		return refBld.toString();
	}
	
	/*
	 * Builds the Xtext content for composite selection references.
	 * By composite selection reference, we mean:
	 * - A main containment multiple reference
	 * - A non-containment single reference of the same type as the main one,
	 * 	to specify one element among the ones defined within the main reference
	 * 
	 * The group will be introduced by a given keyword and will enclose both
	 * references, attaching them to each other.
	 * A keyword will be used to introduce the selected element reference.
	 * 
	 * Currently, the only case present in DOML (3.1) is represented by the
	 * Concretizations contained in the DOMLModel class definition: in fact,
	 * within the same group, the active concrete infrastructure is specified.
	 */
	private String handleCompositeSelectionReference(EClassifier eClassifier, 
			EReference mainRef, String mainKeyword, EReference selectedElemRef,
			String selectedElemKeyword, int numOfTabs) throws DomlGrammarBuilderException {
		if(!mainRef.getEReferenceType().equals(selectedElemRef.getEReferenceType())) {
			throw new DomlGrammarBuilderException(mainRef.getName() + " is not a composite reference.\n"
					+ "Main Reference type: " + mainRef.getEReferenceType()
					+ ", Selected Element Reference type: " + selectedElemRef.getEReferenceType());
		}
		
		StringBuilder refBld = new StringBuilder();
		
		int mainRefLowerBound = mainRef.getLowerBound();
		int mainRefUpperBound = mainRef.getUpperBound();
		boolean isMainRefVal = mainRef.isContainment();
		boolean isMainRefMultiple, isMainRefOptional;
		isMainRefOptional = mainRefLowerBound == 0;
		isMainRefMultiple = mainRefUpperBound == (-1) || mainRefUpperBound > 1;
		
		// A composite reference consists of a multiple containment reference and a selected element.
		// Therefore, only multiple references for which isContainment is true can be accepted.
		if(!isMainRefMultiple || !isMainRefVal) {
			throw new DomlGrammarBuilderException(mainRef.getName() + " is not a composite reference: isVal=" + isMainRefVal + ", isMultiple=" + isMainRefMultiple);
		}
		
		String mainRefKeyword;
		
		if(mainKeyword != null) {
			mainRefKeyword = mainKeyword;
		}
		else {
			// This keyword can't be null.
			mainRefKeyword = getReferenceKeyword(rulesNames.get(eClassifier), mainRef.getName(), false);
		}
		EClass mainRefClass = mainRef.getEReferenceType();
		EClassifier mainRefClassifier = mainRefClass.getEPackage().getEClassifier(mainRefClass.getName());
		String mainRefRuleName = rulesNames.get(mainRefClassifier);
		
		// Handle main reference, which is multiple
		refBld.append("(");
		refBld.append(mainRefKeyword);
		refBld.append(" ");
		String mainEnclosingOpen = getEnclosingSymbol(rulesNames.get(eClassifier), mainRef.getName(), true);
		String mainEnclosingClose = getEnclosingSymbol(rulesNames.get(eClassifier), mainRef.getName(), false);
		refBld.append(
				(mainEnclosingOpen != null)
				? mainEnclosingOpen
				: "'{'"
					);
		refBld.append(System.lineSeparator());
		for(int i=0; i < numOfTabs; i++)
			refBld.append('\t');
		refBld.append("\t(");
		refBld.append(mainRef.getName());
		refBld.append("+=");
		refBld.append(mainRefRuleName);
		refBld.append(")");
		refBld.append("*" + System.lineSeparator());
		
		int selectedElemRefLowerBound = selectedElemRef.getLowerBound();
		int selectedElemRefUpperBound = selectedElemRef.getUpperBound();
		boolean isSelectedElemRefVal = selectedElemRef.isContainment();
		boolean isSelectedElemRefMultiple, isSelectedElemRefOptional;
		isSelectedElemRefOptional = selectedElemRefLowerBound == 0;
		isSelectedElemRefMultiple = selectedElemRefUpperBound == (-1) || selectedElemRefUpperBound > 1;
		
		if(isSelectedElemRefVal) {
			throw new DomlGrammarBuilderException(selectedElemRef.getName() + " is not a containment reference: isVal=" + isSelectedElemRefVal);
		}
		
		String selectedElemRefKeyword;
		
		if(selectedElemKeyword != null) {
			selectedElemRefKeyword = selectedElemKeyword;
		}
		else {
			// This keyword can't be null. 
			selectedElemRefKeyword = getReferenceKeyword(eClassifier.getName(), selectedElemRef.getName(), false);
		}
		EClass selectedElemRefClass = selectedElemRef.getEReferenceType();
		String selectedElemRefValue = "[" + selectedElemRefClass.getEPackage().getNsPrefix() + "::" + selectedElemRefClass.getName() + "]";
		
		// Handle selectedElemRef, which is not a containment reference,
		// but it could be multiple, in case more than one element is selected.
		for(int i=0; i < numOfTabs; i++)
			refBld.append('\t');
		refBld.append("\t(");
		refBld.append(selectedElemRefKeyword);
		refBld.append(" ");
		
		if(isSelectedElemRefMultiple) {
			String selectedElemEnclosingOpen = getEnclosingSymbol(rulesNames.get(eClassifier), selectedElemRef.getName(), true);
			String selectedElemEnclosingClose = getEnclosingSymbol(rulesNames.get(eClassifier), selectedElemRef.getName(), false);
			
			refBld.append(
					(selectedElemEnclosingOpen != null)
					? selectedElemEnclosingOpen
					: "'{'"
						);
			refBld.append(selectedElemRef.getName());
			refBld.append("+=");
			refBld.append(selectedElemRefValue);
			refBld.append("*");
			refBld.append(
					(selectedElemEnclosingClose != null)
					? selectedElemEnclosingClose
					: "'}'"
						);
		}
		else {
			refBld.append(selectedElemRef.getName());
			refBld.append("=");
			refBld.append(selectedElemRefValue);
		}
		
		refBld.append(")");
		if(isSelectedElemRefOptional)
			refBld.append("?");
		refBld.append(System.lineSeparator());
		
		for(int i=0; i < numOfTabs; i++)
			refBld.append('\t');
		
		refBld.append(
				(mainEnclosingClose != null)
				? mainEnclosingClose
				: "'}'"
					);
		refBld.append(")");
		
		if(isMainRefOptional) {
			refBld.append("?");
		}
		
		return refBld.toString();
	}
	
	/*
	 * Builds the Xtext content for a reference in a regular class.
	 */
	private String handleReference(EClassifier eClassifier, EReference eRef, String enumKeyword) {
		StringBuilder refBld = new StringBuilder();
		
		int lowerBound = eRef.getLowerBound();
		int upperBound = eRef.getUpperBound();
		boolean isVal = eRef.isContainment();
		boolean isMultiple, isOptional;
		
		isOptional = lowerBound == 0;
		isMultiple = upperBound == (-1) || upperBound > 1;
		
		// Please note that this could be null, since for containment references we could choose not to use keywords.
		String keyword;
		
		if(eRef.getName().equals(DomlSpecialClasses.NODE_SPECIFIC_MONITORING_REF)) {
			keyword = DomlSpecialClasses.NODE_SPECIFIC_MONITORING_REF_KEYWORD;
		}
		else {
			keyword = (enumKeyword != null && !enumKeyword.isEmpty())
					? enumKeyword
					: getReferenceKeyword(rulesNames.get(eClassifier), eRef.getName(), isVal);
		}
		

		
		EClass refClass = eRef.getEReferenceType();
		String refValue = "[" + refClass.getEPackage().getNsPrefix() + "::" + refClass.getName() + "]";
		
		EClassifier refClassifier = refClass.getEPackage().getEClassifier(refClass.getName());
		String refRuleName = rulesNames.get(refClassifier);
		
		
		refBld.append("(");
		
		if(keyword != null) {
			refBld.append(keyword);
			refBld.append(" ");
		}
		
		// UpperBound > 1 (Possibly infinite)
		if(isMultiple) {
			if(keyword != null) {
				String enclosingOpen = getEnclosingSymbol(rulesNames.get(eClassifier), eRef.getName(), true);
				refBld.append(
						(enclosingOpen != null)
						? enclosingOpen
						: "'{'"
						);
				refBld.append(" ");
			}
			refBld.append(eRef.getName());
			refBld.append("+=");
			if(isVal) {
				refBld.append(refRuleName);
			}
			else {
				refBld.append(refValue);
			}
			refBld.append("*");
			if(keyword != null) {
				String enclosingClose = getEnclosingSymbol(rulesNames.get(eClassifier), eRef.getName(), false);
				refBld.append(" ");
				refBld.append(
						(enclosingClose != null)
						? enclosingClose
						: "'}'"
						);
			}
		} // UpperBound == 1
		else {
			refBld.append(eRef.getName());
			refBld.append("=");
			if(isVal) {
				refBld.append(refRuleName);
			}
			else {
				refBld.append(refValue);
			}
		}
		
		refBld.append(")");
		
		if(isOptional) {
			if((isMultiple && keyword != null) || !isMultiple)
				refBld.append("?");
		}
		
		return refBld.toString();
	}
	
	/*
	 * Builds the Xtext content for an attribute.
	 */
	private String handleAttribute(EClassifier eClassifier, EAttribute eAttr, String enumKeyword) throws DomlGrammarBuilderException {
		StringBuilder attrBld = new StringBuilder();
		
		int lowerBound = eAttr.getLowerBound();
		int upperBound = eAttr.getUpperBound();

		boolean isMultiple, isOptional; //atLeastOne;
		
		isOptional = lowerBound == 0;
		isMultiple = upperBound == (-1) || upperBound > 1;
		
		String keyword;
		boolean isDisabledMonitoringsAttr = eAttr.getName().equals(DomlSpecialClasses.DISABLED_MONITORINGS_ATTR);
		
		if(isDisabledMonitoringsAttr) {
			keyword = DomlSpecialClasses.DISABLED_MONITORINGS_ATTR_KEYWORD;
		}
		else {
			keyword = (enumKeyword != null && !enumKeyword.isEmpty())
						? enumKeyword
						// Get keyword from JSON file if present, otherwise build a keyword.
						: getAttributeKeyword(rulesNames.get(eClassifier), eAttr.getName());
		}

		
		
		attrBld.append("(");
		attrBld.append(keyword);
		attrBld.append(" ");
		
		// UpperBound > 1 (Possibly infinite)
		if(isMultiple) {
			String enclosingOpen;
			String enclosingClose;
			
			// Special handling for disabled monitoring rules attribute to let self-monitoring work properly.
			if(isDisabledMonitoringsAttr) {
				enclosingOpen = DomlSpecialClasses.DISABLED_MONITORINGS_ATTR_ENCLOSING_OPEN;
				enclosingClose = DomlSpecialClasses.DISABLED_MONITORINGS_ATTR_ENCLOSING_CLOSE;
			}
			else {
				enclosingOpen = getEnclosingSymbol(rulesNames.get(eClassifier), eAttr.getName(), true);
				enclosingClose = getEnclosingSymbol(rulesNames.get(eClassifier), eAttr.getName(), false);
			}

			attrBld.append(
					(enclosingOpen != null)
					? enclosingOpen
					: "'['"
					);
			attrBld.append(" ");
			attrBld.append(eAttr.getName());
			attrBld.append("+=");
			attrBld.append(getAttributeTypeString(eAttr));
			attrBld.append("* ");
			attrBld.append(
					(enclosingClose != null)
					? enclosingClose
					: "']'"
					);
		} // UpperBound == 1
		else {
			attrBld.append(eAttr.getName());
			attrBld.append("=");
			attrBld.append(getAttributeTypeString(eAttr));
		}
		
		
		attrBld.append(")");
		
		if(isOptional) {
			attrBld.append("?");
		}
		
		return attrBld.toString();
	}
	
	/*
	 * Returns the string to be used in the Xtext syntax for a given attribute type.
	 * Currently, DOML supports four types (String, Integer, Float, Boolean) plus
	 * attributes having enumeration values.
	 * If none of these types is detected, then an exception is thrown.
	 */
	private String getAttributeTypeString(EAttribute eAttr) throws DomlGrammarBuilderException {
		EDataType attrType = eAttr.getEAttributeType();
		if(attrType.equals(EcorePackage.eINSTANCE.getEString())) {
			return XTEXT_STRING_ELEM;
		}
		else if(attrType.equals(EcorePackage.eINSTANCE.getEIntegerObject())) {
			return XTEXT_INT_ELEM;
		}
		else if(attrType.equals(EcorePackage.eINSTANCE.getEFloatObject())) {
			return XTEXT_FLOAT_ELEM;
		}
		else if(attrType.equals(EcorePackage.eINSTANCE.getEBooleanObject())) {
			return XTEXT_BOOLEAN_ELEM;
		} // EEnum attribute.
		else if(EcorePackage.eINSTANCE.getEEnum().isSuperTypeOf(attrType.eClass())) {
			// Return rule name.
			return rulesNames.get(attrType);
		}
		else {
			throw new DomlGrammarBuilderException("DomlGrammarBuilder: Unhandled attribute type found: " + attrType.getName()
				+ ", EAttribute: " + eAttr.getName());
		}
	}
	
	/***
	 * Get all attributes and references (attr, val, ref) of a given class.
	 * @param eClassifier the EClassifier of the chosen class.
	 * @return an EList containing all the attributes and references of a given class as EObject elements.
	 */
	private EList<EObject> getAllEContents (EClassifier eClassifier) {
		// Create an empty EList
		EList<EObject> eAllContents = ECollections.newBasicEList();
		
		// Add indirect elements, excluding the ones from DOMLElement and ConcreteElement (using fragments)
		if(supertypesHierarchy.get(eClassifier) != null) {
			for(EClassifier supertype : supertypesHierarchy.get(eClassifier)) {
				if(!supertype.getName().equals(DomlSpecialClasses.DOML_ELEMENT.getClassName()) && !supertype.getName().equals(DomlSpecialClasses.CONCRETE_ELEMENT.getClassName()))
					eAllContents.addAll(supertype.eContents());
			}
		}
		// Add direct elements
		eAllContents.addAll(eClassifier.eContents());
		return eAllContents;
	}
	
	/*
	 * Given a class name, it returns the corresponding keyword by either
	 * loading it from the JSON file or building it using the DomlKeywordBuilder.
	 */
	private String getClassKeyword(String name) {
		String keyword = getClassKeywordFromJson(name);
		if(keyword == null)
			keyword = DomlKeywordBuilder.buildKeyword(name);
		return keyword;
	}
	
	/*
	 * Given an attribute name and the one of its parent class, it returns the corresponding
	 * keyword by either loading it from the JSON file or building it using the DomlKeywordBuilder.
	 */
	private String getAttributeKeyword(String parentClassName, String requiredElemName) {
		String keyword = getSubKeywordFromJson(parentClassName, requiredElemName);
		if(keyword == null)
			keyword = DomlKeywordBuilder.buildKeyword(requiredElemName);
		return keyword;
	}
	
	/*
	 * Given a reference name and the one of its parent class, it returns the corresponding
	 * keyword by either loading it from the JSON file or building it using the DomlKeywordBuilder.
	 * The boolean argument "canBeNull" specifies whether the keyword can be null or not.
	 * If it is set to true, then the keyword is not built in case it is not present in the JSON file.
	 * Mainly, this is used because containment references may use no keyword to be introduced.
	 */
	private String getReferenceKeyword(String parentClassName, String requiredElemName, boolean canBeNull) {
		String keyword = getSubKeywordFromJson(parentClassName, requiredElemName);
		if(keyword == null && !canBeNull)
			keyword = DomlKeywordBuilder.buildKeyword(requiredElemName);
		return keyword;
	}
	
	/***
	 * Get keyword for a required class element from the JSON file.
	 * Please note that for composite elements, the key must be repeated
	 * within the object definition in the JSON file.
	 * @param name the name of the class for which the keyword is required.
	 * @return the keyword for the required class.
	 */
	private String getClassKeywordFromJson(String name) {
		String keyword = null;
		if(jsonFileContent != null) {
			JsonElement jsonElem = jsonFileContent.get(name);
			if(jsonElem != null) {
				/*
				 * Composite element: to find the class keyword, get the element
				 * using the same class name within the obtained JSON object.
				 */
				if(jsonElem.isJsonObject()) {
					jsonElem = jsonElem.getAsJsonObject().get(name);
					if(jsonElem != null)
						if(jsonElem.isJsonPrimitive())
							keyword = "'" + jsonElem.getAsString() + "'";
				}
				else if(jsonElem.isJsonPrimitive()) {
					keyword = "'" +  jsonElem.getAsString() + "'";
				}
			}
		}
		return keyword;
	}
	
	
	/***
	 * Get keyword for an attribute, a reference or a value of a given parent class from the JSON file.
	 * @param parentClassName
	 * @param requiredElemName the required sub-element (attr, ref or val).
	 * @return the attribute for the required sub-element or null if nothing is found.
	 */
	private String getSubKeywordFromJson(String parentClassName, String requiredElemName) {
		String keyword = null;
		if(jsonFileContent != null) {
			JsonElement parentJsonElem = jsonFileContent.get(parentClassName);
			if(parentJsonElem != null) {
				if(parentJsonElem.isJsonObject()) {
					JsonElement requiredJsonElem = parentJsonElem.getAsJsonObject().get(requiredElemName);
					if(requiredJsonElem != null) {
						if(requiredJsonElem.isJsonPrimitive())
							keyword = "'" + requiredJsonElem.getAsString() + "'";
						// Composite keyword (e.g., "'active' 'deployment'").
						else if(requiredJsonElem.isJsonArray()) {
							JsonArray jsonArray = requiredJsonElem.getAsJsonArray();
							if(!jsonArray.isEmpty()) {
								StringBuilder tmp = new StringBuilder();
								for(JsonElement elem : jsonArray) {
									tmp.append(" '");
									tmp.append(elem.getAsString());
									tmp.append("'");
								}
								// Cut the first blank space.
								keyword = tmp.substring(1);
							}
						}
						// Multiple attributes / references may contain information about enclosing symbols.
						else if(requiredJsonElem.isJsonObject()) {
							JsonObject jsonObject = requiredJsonElem.getAsJsonObject();
							if(!jsonObject.isEmpty()) {
								requiredJsonElem = jsonObject.get(requiredElemName);
								if(requiredJsonElem != null) {
									if(requiredJsonElem.isJsonPrimitive())
										keyword = "'" + requiredJsonElem.getAsString() + "'";
								}
							}
						}
					}
				}
			}
		}
		return keyword;
	}

	/*
	 * Multiple attributes and references use enclose symbols, which users may want to specify themselves.
	 * This method allows to get the chosen ones from the JSON file, by specifying
	 * the parent class name and the attribute/reference name.
	 * The boolean argument "isOpen" is used to distinguish enclosing open symbols from the closing ones.
	 * Please note that fixed JSON keys are used to retrieve such symbols.
	 * Keys to be used are specified above in this class.
	 */
	private String getEnclosingSymbol(String parentClassName, String requiredElemName, boolean isOpen) {
		String encloseSymbol = null;
		if(jsonFileContent != null) {
			JsonElement parentJsonElem = jsonFileContent.get(parentClassName);
			if(parentJsonElem != null) {
				if(parentJsonElem.isJsonObject()) {
					JsonElement requiredJsonElem = parentJsonElem.getAsJsonObject().get(requiredElemName);
					if(requiredJsonElem != null) {
						// Multiple attributes / references may contain information about enclosing symbols.
						if(requiredJsonElem.isJsonObject()) {
							JsonObject jsonObject = requiredJsonElem.getAsJsonObject();
							if(!jsonObject.isEmpty()) {
								if(isOpen)
									requiredJsonElem = jsonObject.get(JSON_KEY_MULTIPLE_ENCLOSING_OPEN);
								else
									requiredJsonElem = jsonObject.get(JSON_KEY_MULTIPLE_ENCLOSING_CLOSE);
								
								if(requiredJsonElem != null) {
									if(requiredJsonElem.isJsonPrimitive())
										encloseSymbol = "'" + requiredJsonElem.getAsString() + "'";
								}
							}
						}
					}
				}
			}
		}
		return encloseSymbol;
	}
	
	/*
	 * Within the DOML syntax, some classes, attributes and references do not require any
	 * keyword to be introduced. Instead, they make use of enumeration values, as they can
	 * be directly connected by the same concept (e.g., the VMImage class requires a URI
	 * associated to either its image or script; instead of using a keyword to introduce
	 * such URI, DOML (3.1) currently requires to specify either the keyword "script"
	 * or the keyword "image", as they are possible values of the "GeneratorKind" enumeration).
	 * This method allows to detect such cases, that need to be specified by users:
	 * to do so, a special JSON key is used to retrieve the name of the element the keyword
	 * of which needs to be replaced by the enumeration value; such a JSON key will be
	 * used within the definition of the enumeration attribute in the JSON file.
	 */
	private String getElemToReplaceWithEnum(String parentClassName, String enumClassName) {
		String elemToReplace = null;
		if(jsonFileContent != null) {
			JsonElement parentJsonElem = jsonFileContent.get(parentClassName);
			if(parentJsonElem != null) {
				if(parentJsonElem.isJsonObject()) {
					JsonElement requiredJsonElem = parentJsonElem.getAsJsonObject().get(enumClassName);
					if(requiredJsonElem != null) {
						if(requiredJsonElem.isJsonObject()) {
							requiredJsonElem = requiredJsonElem.getAsJsonObject().get(JSON_KEY_REPLACE_KEYWORD_WITH_ENUM);
							if(requiredJsonElem != null)
								if(requiredJsonElem.isJsonPrimitive())
									elemToReplace = requiredJsonElem.getAsString();
						}
					}
				}
			}
		}
		return elemToReplace;
	}
	
	/*
	 * Concatenates the contents of several StringBuilder objects to build
	 * the full grammar and returns a StringBuilder object containing the
	 * full concatenation result (to be written in the generated Xtext file).
	 */
	private StringBuilder buildGrammar(StringBuilder grammarBody) {
		final StringBuilder xtextContent = new StringBuilder();
		xtextContent.append(grammarDeclaration);
		// Importing Eclipse Ecore.
		appendString(xtextContent, "import \"" + EcorePackage.eNS_URI + "\" as " + EcorePackage.eNS_PREFIX + System.lineSeparator());
		xtextContent.append(grammarBody);
		xtextContent.append(unchangeables);
		xtextContent.append(datatypes);
		xtextContent.append(terminals);
		// Delete last line separator.
		xtextContent.setLength(xtextContent.length()-2);
		return xtextContent;
	}

	/*
	 * Scans DOML root package to build the required import statement for each subpackage.
	 */
	private void getImportsFromSubpackages(EPackage rootPackage, StringBuilder importsBuilder) {
		for (EPackage ePackage : rootPackage.getESubpackages()) {
			String packagePrefix = ePackage.getNsPrefix();
			String packageURI = ePackage.getNsURI();
			appendString(importsBuilder, "import \"" + packageURI + "\" as " + packagePrefix);
		}
		importsBuilder.append(System.lineSeparator());
	}
	
	/***
	 * Loads an array of strings (as JsonArray) into a StringBuilder object.
	 * @param jsonKey The string used as key in the JSON file to get the desired content.
	 * @param bld The builder in which the array of string contained within the
	 * JSON file is copied.
	 * @throws DomlGrammarBuilderException 
	 */
	private void loadArrayFromJson(String jsonKey, StringBuilder bld) throws DomlGrammarBuilderException {
		if(jsonFileContent != null) {
			JsonElement requiredJsonElem = jsonFileContent.get(jsonKey);
			if(requiredJsonElem != null) {
				if(requiredJsonElem.isJsonArray()) { 
					JsonArray jsonArray = requiredJsonElem.getAsJsonArray();
					if(!jsonArray.isEmpty()) {
						for(JsonElement elem : jsonArray) {
							appendString(bld, elem.getAsString());
						}
					}
				}
				else { 
					throw new DomlGrammarBuilderException("Required element having key '"
							+ jsonKey + "' is not a JSON Array.");
				}
			}
			else { 
				throw new DomlGrammarBuilderException("Required element having key '"
						+ jsonKey + "' was not found within the specified JSON file.");
			}
		}
		else {
			throw new DomlGrammarBuilderException("JSON content could not be loaded (null pointer).");
		}
	}

	/***
	 * Loads a String (JsonPrimitive, getAsString) into a StringBuilder object.
	 * @param jsonKey The string used as key in the JSON file to get the desired content.
	 * @param bld The builder in which the string contained within the JSON file is copied.
	 * @throws DomlGrammarBuilderException 
	 */
	private void loadElementFromJson(String jsonKey, StringBuilder bld) throws DomlGrammarBuilderException {
		if(jsonFileContent != null) {
			JsonElement requiredJsonElem = jsonFileContent.get(jsonKey);
			if(requiredJsonElem != null) {
				if(requiredJsonElem.isJsonPrimitive()) { 
					appendString(bld, requiredJsonElem.getAsString());
				}
				else { 
					throw new DomlGrammarBuilderException("Required element having key '"
							+ jsonKey + "' is not a JSON Primitive.");
				}
			}
			else { 
				throw new DomlGrammarBuilderException("Required element having key '"
						+ jsonKey + "' was not found within the specified JSON file."); 
			}
		}
		else {
			throw new DomlGrammarBuilderException("JSON content could not be loaded (null pointer).");
		}
	}
	
	/*
	 * The load methods presented below all try to load specific fixed content from
	 * the JSON file. In case of failure, they simply reload the fixed content associated
	 * with the latest DOML version currently available (3.1).
	 */
	private void loadGrammarDeclaration() {
		try {
			grammarDeclaration = new StringBuilder();
			loadElementFromJson(JSON_KEY_GRAMMAR_DECLARATION, grammarDeclaration);
			grammarDeclaration.append(System.lineSeparator());
		} 
		catch (DomlGrammarBuilderException e) {
			e.printStackTrace();
			fillGrammarDeclaration();
		}
	}
	
	private void loadTerminalRules() {
		try {
			terminals = new StringBuilder();
			loadArrayFromJson(JSON_KEY_TERMINALS, terminals);
		} 
		catch (DomlGrammarBuilderException e) {
			e.printStackTrace();
			fillTerminalRules();
		}
	}
	
	private void loadDatatypeRules() {
		try {
			datatypes = new StringBuilder();
			loadArrayFromJson(JSON_KEY_DATATYPES, datatypes);
			datatypes.append(System.lineSeparator());
		}
		catch (DomlGrammarBuilderException e) {
			e.printStackTrace();
			fillDatatypeRules();
		}
	}
	
	
	private void loadUnchangeableRules() {
		try {
			unchangeables = new StringBuilder();
			loadArrayFromJson(JSON_KEY_UNCHANGEABLES, unchangeables);
			unchangeables.append(System.lineSeparator());
		}
		catch (DomlGrammarBuilderException e) {
			e.printStackTrace();
			fillUnchangeableRules();
		}
	}
	
	/*
	 * The fill methods presented below load specific fixed content associated
	 * with the latest DOML version currently available (3.1) in some StringBuilders.
	 */
	private void fillGrammarDeclaration() {
		grammarDeclaration = new StringBuilder();
		appendString(grammarDeclaration, "grammar eu.piacere.doml.Doml hidden(WS, ML_COMMENT, SL_COMMENT)");
		grammarDeclaration.append(System.lineSeparator());
	}
	
	private void fillTerminalRules() {
		terminals = new StringBuilder();
		List<String> terminalRules = new ArrayList<String>();

		terminalRules.add("terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;"); //$NON-NLS-1$
		terminalRules.add("terminal FLOAT returns ecore::EFloat: '-'?DIGITS'.'DIGITS;"); //$NON-NLS-1$
		terminalRules.add("terminal INT returns ecore::EInt: '-'?DIGITS;"); //$NON-NLS-1$
		terminalRules.add("terminal fragment DIGITS: ('0'..'9')+;"); //$NON-NLS-1$
		terminalRules.add(
				"terminal STRING: '\"' ( '\\\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'\"'|\"'\"|'\\\\' */ | !('\\\\'|'\"') )* '\"' | \"'\" ( '\\\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'\"'|\"'\"|'\\\\' */ | !('\\\\'|\"'\") )* \"'\";"); //$NON-NLS-1$
		terminalRules.add("terminal STATEMENTS returns ecore::EString: '```' -> '```';"); //$NON-NLS-1$
		terminalRules.add("terminal ML_COMMENT : '/*' -> '*/';"); //$NON-NLS-1$
		terminalRules.add("terminal SL_COMMENT : '//' !('\\n'|'\\r')* ('\\r'? '\\n')?;"); //$NON-NLS-1$
		terminalRules.add("terminal WS : (' '|'\\t'|'\\r'|'\\n')+;"); //$NON-NLS-1$
		terminalRules.add("terminal ANY_OTHER: .;"); //$NON-NLS-1$

		for (final String terminalRule : terminalRules) {
			appendString(terminals, terminalRule);
		}
	}

	
	private void fillDatatypeRules() {
		datatypes = new StringBuilder();
		List<String> datatypeRules = new ArrayList<String>();

		datatypeRules.add("Datatype: 'Integer' | 'Double' | 'Date' | 'String' | 'Object';"); //$NON-NLS-1$
		datatypeRules.add("Boolean returns ecore::EBoolean: 'true' | 'false';"); //$NON-NLS-1$

		for (final String datatypeRule : datatypeRules) {
			appendString(datatypes, datatypeRule);
		}
		datatypes.append(System.lineSeparator());
	}

	private void fillUnchangeableRules() {
		unchangeables = new StringBuilder();
		List<String> unchangeableRules = new ArrayList<String>();
		
		unchangeableRules.add("Property returns commons::Property:\n\t(SProperty | BProperty | IProperty | FProperty | ListProperty)\n;\n");
		unchangeableRules.add("SProperty returns commons::SProperty:\n\tkey=ID('='value=STRING)\n;\n");
		unchangeableRules.add("BProperty returns commons::BProperty:\n\tkey=ID('='value=Boolean)\n;\n");
		unchangeableRules.add("IProperty returns commons::IProperty:\n\tkey=ID('='value=INT)\n;\n");
		unchangeableRules.add("FProperty returns commons::FProperty:\n\tkey=ID('='value=FLOAT)\n;\n");
		unchangeableRules.add("ListProperty returns commons::ListProperty:\n\tkey=ID('=' '[' values+=Property* ']')\n;\n");
		unchangeableRules.add("Deployment returns commons::Deployment:\n\tcomponent=[commons::DeployableElement] '=>' node=[infra::InfrastructureElement]\n;\n");
		unchangeableRules.add("InterfaceDefinition returns app::SoftwareInterface:\n\t{app::SoftwareInterface} name=ID DOMLElement ('@' endPoint=STRING)?\n;\n");
		unchangeableRules.add("MonitoringRule returns infra::MonitoringRule:\n\t'monitoring_rule' name=ID '{' DOMLElement\n\t\t(\n\t\t\t('cond' condition=STRING) &\n\t\t\t('strat' strategy=STRING) &\n\t\t\t('config' strategyConfigurationString=STRING)?\n\t\t)\n\t'}'\n;\n");
		unchangeableRules.add("RequirementDefinition returns commons::Requirement:\n\t(=>RangedRequirement | =>EnumeratedRequirement | NormalRequirement)\n;\n");
		unchangeableRules.add("fragment PartOfRequirement returns commons::Requirement:\n\tname=ID (description=(STRING | STATEMENTS))?\n;\n");
		unchangeableRules.add("RangedRequirement returns commons::RangedRequirement: \n\tPartOfRequirement\n\t(\n\t\t('@' '{' predicatesOn+=[commons::DOMLElement]+ '}')?\n\t\t('min' min=FLOAT ('max' max=FLOAT)? | 'max' max=FLOAT)\n\t\t'=>' property=STRING\n\t)\n;\n");
		unchangeableRules.add("EnumeratedRequirement returns commons::EnumeratedRequirement: \n\tPartOfRequirement\n\t(\n\t\t('@' '{' predicatesOn+=[commons::DOMLElement]+ '}')?\n\t\t'values' values+=STRING*\n\t\t'=>' property=STRING\n\t)\n;\n");
		unchangeableRules.add("NormalRequirement returns commons::Requirement:\n\tPartOfRequirement\n\t(\n\t\t('@' '{' predicatesOn+=[commons::DOMLElement]+ '}')?\n\t\t'=>' property=STRING\n\t)?\n;\n");
		unchangeableRules.add("Optimization returns opt::OptimizationLayer:\n\t'optimization' name=ID '{' DOMLElement\n\t\t(\n\t\t\t('hint' startingHint=[commons::Configuration])? &\n\t\t\t('objectives' '{'(objectives+=OptimizationObjective)*'}')? &\n\t\t\t('runtime' '{'('value' runtime=FLOAT 'seconds')?'}')? &\n\t\t\t('nonfunctional_requirements' '{'(nonfunctionalRequirements+=RequirementDefinition)*'}')? &\n\t\t\t(solutions+=OptimizationSolution*)\n\t\t)\n\t'}'\n;\n");
		unchangeableRules.add("OptimizationSolution returns opt::OptimizationSolution:\n\t'solution' name=ID '{' DOMLElement\n\t\t(\n\t\t\t(objectives=ObjectiveValue) &\n\t\t\t('decisions' '[' decisions+=STRING* ']')\n\t\t)\n\t'}'\n;\n");
		unchangeableRules.add("ObjectiveValue returns opt::ObjectiveValue:\n\t{opt::ObjectiveValue}\n\t'objectives' '{'\n\t\t(\n\t\t\t('cost' cost=FLOAT 'euro')? &\n\t\t\t('availability' availability=FLOAT '%')? &\n\t\t\t('performance' performance=FLOAT 'metric')?\n\t\t)\n\t'}'\n;\n");
		unchangeableRules.add("OptimizationObjective returns opt::OptimizationObjective:\n\t(=>CountObjective | MeasurableObjective)\n;\n");
		unchangeableRules.add("CountObjective returns opt::CountObjective:\n\t'numberOf' property=STRING '=>' kind=ObjectiveKind\n;\n");
		unchangeableRules.add("MeasurableObjective returns opt::MeasurableObjective:\n\tproperty=STRING '=>' kind=ObjectiveKind\n;\n");
		unchangeableRules.add("ObjectiveKind: 'max' | 'min';\n");
		
		for (final String rule : unchangeableRules) {
			appendString(unchangeables, rule);
		}
	}

	/*
	 * Appends a string and a line separator to a given StringBuilder object.
	 */
	private void appendString(StringBuilder builder, String string) {
		builder.append(string + System.lineSeparator());
	}

}

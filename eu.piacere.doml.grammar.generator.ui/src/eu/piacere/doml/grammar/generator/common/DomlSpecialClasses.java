package eu.piacere.doml.grammar.generator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * An enumeration to represent DOML special classes, which are supposed
 * to remain unchanged and require to be managed as exceptions.
 */
public enum DomlSpecialClasses {
	
	/* 
	 * Classes that need to remain unchanged (or can be only partially extended) in order for DOML to work properly.
	 * Please note that all classes belonging to Optimization layer are included in this list,
	 * as they are unchangeable in order for the optimizer to keep working even when DOML is updated.
	 * 
	 * With the exception of the first three classes, which are built dynamically,
	 * all the others are loaded as fixed content.
	 */
	DOML_MODEL(DomlPackage.COMMONS, "DOMLModel", "DOMLModel"),
	DOML_ELEMENT(DomlPackage.COMMONS, "DOMLElement", "DOMLElement"),
	CONCRETE_ELEMENT(DomlPackage.CONCRETE, "ConcreteElement", "ConcreteElement"),
	
	PROPERTY(DomlPackage.COMMONS, "Property", "Property"),
	SPROPERTY(DomlPackage.COMMONS, "SProperty", "SProperty"),
	BPROPERTY(DomlPackage.COMMONS, "BProperty", "BProperty"),
	IPROPERTY(DomlPackage.COMMONS, "IProperty", "IProperty"),
	FPROPERTY(DomlPackage.COMMONS, "FProperty", "FProperty"),
	LIST_PROPERTY(DomlPackage.COMMONS, "ListProperty", "ListProperty"),
	DEPLOYMENT(DomlPackage.COMMONS, "Deployment", "Deployment"),
	SOFTWARE_INTERFACE(DomlPackage.APPLICATION, "SoftwareInterface", "InterfaceDefinition"),
	MONITORING_RULE(DomlPackage.INFRASTRUCTURE, "MonitoringRule", "MonitoringRule"),
	REQUIREMENT(DomlPackage.COMMONS, "Requirement", "RequirementDefinition"),
	RANGED_REQUIREMENT(DomlPackage.COMMONS, "RangedRequirement", "RangedRequirement"),
	ENUMERATED_REQUIREMENT(DomlPackage.COMMONS, "EnumeratedRequirement", "EnumeratedRequirement"),
	
	OPTIMIZATION_LAYER(DomlPackage.OPTIMIZATION, "OptimizationLayer", "Optimization"),
	OPTIMIZATION_SOLUTION(DomlPackage.OPTIMIZATION, "OptimizationSolution", "OptimizationSolution"),
	OBJECTIVE_VALUE(DomlPackage.OPTIMIZATION, "ObjectiveValue", "ObjectiveValue"),
	OPTIMIZATION_OBJECTIVE(DomlPackage.OPTIMIZATION, "OptimizationObjective", "OptimizationObjective"),
	COUNT_OBJECTIVE(DomlPackage.OPTIMIZATION, "CountObjective", "CountObjective"),
	MEASURABLE_OBJECTIVE(DomlPackage.OPTIMIZATION, "MeasurableObjective", "MeasurableObjective");
	
	// This value refers to the special attribute "name", used as ID for DOMLElement class instances.
	public static final String DOML_ELEMENT_NAME_ATTR = "name";

	/*
	 * These values refer to the special reference "nodeSpecificMonitoring" and to
	 * the special attribute "disabledMonitorings", both related to the same concept
	 * and used by several classes in DOML. This reference needs not to be modified
	 * for the PIACERE self-monitoring tools to work properly.
	 */
	public static final String NODE_SPECIFIC_MONITORING_REF = "nodeSpecificMonitoring";
	public static final String NODE_SPECIFIC_MONITORING_REF_KEYWORD = "'monitoring_rules'";
	
	public static final String DISABLED_MONITORINGS_ATTR = "disabledMonitorings";
	public static final String DISABLED_MONITORINGS_ATTR_KEYWORD = "'disabled_monitorings'";
	public static final String DISABLED_MONITORINGS_ATTR_ENCLOSING_OPEN = "'{'";
	public static final String DISABLED_MONITORINGS_ATTR_ENCLOSING_CLOSE = "'}'";
	
	/*
	 * These values refer to special attributes and references within the DOMLModel class,
	 * which should not be modified by the user for DOML, DOML-E tools and optimizer to work properly.
	 */
	public static final String DOML_MODEL_VERSION_ATTR = "version";
	public static final String DOML_MODEL_VERSION_ATTR_KEYWORD = "'version'";
	public static final String DOML_MODEL_CONCRETIZATIONS_REF = "concretizations";
	public static final String DOML_MODEL_CONCRETIZATIONS_REF_KEYWORD = "'concretizations'";
	public static final String DOML_MODEL_ACTIVE_CONCRETE_INFRASTRUCTURE_REF = "activeInfrastructure";
	public static final String DOML_MODEL_ACTIVE_CONCRETE_INFRASTRUCTURE_REF_KEYWORD = "'active'";
	
	
	private DomlPackage domlPackage;
	private String className;
	private String ruleName;
	
	DomlSpecialClasses(DomlPackage domlPackage, String className, String ruleName) {
		this.domlPackage = domlPackage;
		this.className = className;
		this.ruleName = ruleName;
	}

	public DomlPackage getDomlPackage() {
		return domlPackage;
	}

	public String getClassName() {
		return className;
	}
	
	public static List<String> getClassNames() {
		List<String> classNames = new ArrayList<String>();
		for(DomlSpecialClasses specialClass : values()) {
			classNames.add(specialClass.getClassName());
		}
		return classNames;
	}

	public String getRuleName() {
		return ruleName;
	}
	
	public static String getRuleName(String className) {
		for(DomlSpecialClasses specialClass : values()) {
			if(className.equals(specialClass.getClassName())) {
				return specialClass.ruleName;
			}
		}
		return null;
	}
}

package eu.piacere.doml.grammar.generator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * NOTE: CURRENTLY UNUSED
 * 
 * An enumeration to represent class which can contain unordered multiple references.
 * These class are typically the representations of the main layers.
 */
public enum DomlUnorderedClasses {
	
	/* 
	 * These classes have only containment references (no attributes other than the
	 * ones inherited from DomlElement) and each reference is optional and multiple.
	 * Ideally, we could check these conditions before filling the rules if we don't
	 * want to keep them as exceptions (currently done in DomlGrammarBuilder class).
	 * No keywords are used for such references.
	 */
	APPLICATION_LAYER(DomlPackage.APPLICATION, "ApplicationLayer"),
	INFRASTRUCTURE_LAYER(DomlPackage.INFRASTRUCTURE, "InfrastructureLayer"),
	// Concrete layer classes
	CONCRETE_INFRASTRUCTURE(DomlPackage.CONCRETE, "ConcreteInfrastructure"),
	RUNTIME_PROVIDER(DomlPackage.CONCRETE, "RuntimeProvider");
	
	private DomlPackage domlPackage;
	private String className;
	
	DomlUnorderedClasses(DomlPackage domlPackage, String className) {
		this.domlPackage = domlPackage;
		this.className = className;
	}

	public DomlPackage getDomlPackage() {
		return domlPackage;
	}

	public String getClassName() {
		return className;
	}
	
	public static List<String> getClassNames() {
		List<String> classNames = new ArrayList<String>();
		for(DomlUnorderedClasses unorderedClass : values()) {
			classNames.add(unorderedClass.getClassName());
		}
		return classNames;
	}
}
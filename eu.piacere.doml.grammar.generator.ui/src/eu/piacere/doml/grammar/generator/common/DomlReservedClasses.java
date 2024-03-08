package eu.piacere.doml.grammar.generator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * An enumeration to represent classes belonging to DOML metamodel,
 * but currently excluded from its syntax.
 */
public enum DomlReservedClasses {
	/*
	 * These classes are not present in DOML grammar and they are currently not used in DOML.
	 * As a consequence, they are not going to be considered by DomlGrammarBuilder.
	 */
	EXTENSION_ELEMENT(DomlPackage.COMMONS, "ExtensionElement"),
	EXT_APPLICATION_COMPONENT(DomlPackage.APPLICATION, "ExtApplicationComponent"),
	EXT_INFRASTRUCTURE_ELEMENT(DomlPackage.INFRASTRUCTURE, "ExtInfrastructureElement"),
	EXT_CONCRETE_ELEMENT(DomlPackage.CONCRETE, "ExtConcreteElement"),
	EXT_OPTIMIZATION_OBJECTIVE(DomlPackage.OPTIMIZATION, "ExtOptimizationObjective"),
	DEPLOYMENT_REQUIREMENT(DomlPackage.COMMONS, "DeploymentRequirement"),
	DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT(DomlPackage.COMMONS, "DeploymentToNodeTypeRequirement"),
	DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT(DomlPackage.COMMONS, "DeploymentToNodeWithPropertyRequirement"),
	DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT(DomlPackage.COMMONS, "DeploymentToSpecificNodeRequirement");
	
	private DomlPackage domlPackage;
	private String className;
	
	DomlReservedClasses(DomlPackage domlPackage, String className) {
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
		for(DomlReservedClasses reservedClass : values()) {
			classNames.add(reservedClass.getClassName());
		}
		return classNames;
	}

}
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
	 * Please note that all classes belonging to Optimization layer are not
	 * included in this list, but they are unchangeable in order for the optimizer
	 * to keep working even when DOML is updated. For this reason, they are loaded
	 * as fixed content.
	 */
	DOML_MODEL(DomlPackage.COMMONS, "DOMLModel"),
	DOML_ELEMENT(DomlPackage.COMMONS, "DOMLElement"),
	PROPERTY(DomlPackage.COMMONS, "Property"),
	SPROPERTY(DomlPackage.COMMONS, "SProperty"),
	BPROPERTY(DomlPackage.COMMONS, "BProperty"),
	IPROPERTY(DomlPackage.COMMONS, "IProperty"),
	FPROPERTY(DomlPackage.COMMONS, "FProperty"),
	LIST_PROPERTY(DomlPackage.COMMONS, "ListProperty"),
	CONFIGURATION(DomlPackage.COMMONS, "Configuration"),
	SOFTWARE_INTERFACE(DomlPackage.APPLICATION, "SoftwareInterface"),
	MONITORING_RULE(DomlPackage.INFRASTRUCTURE, "MonitoringRule"),
	CONCRETE_ELEMENT(DomlPackage.CONCRETE, "ConcreteElement"),
	REQUIREMENT(DomlPackage.COMMONS, "Requirement"),
	RANGED_REQUIREMENT(DomlPackage.COMMONS, "RangedRequirement"),
	ENUMERATED_REQUIREMENT(DomlPackage.COMMONS, "EnumeratedRequirement");

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
	 * which should not be modified by the user for DOML and DOML-E tools to work properly.
	 */
	public static final String DOML_MODEL_VERSION_ATTRIBUTE = "version";
	public static final String DOML_MODEL_CONCRETIZATIONS_REFERENCE = "concretizations";
	public static final String DOML_MODEL_ACTIVE_CONCRETE_INFRASTRUCTURE_REFERENCE = "activeInfrastructure";
	
	
	private DomlPackage domlPackage;
	private String className;
	
	DomlSpecialClasses(DomlPackage domlPackage, String className) {
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
		for(DomlSpecialClasses specialClass : values()) {
			classNames.add(specialClass.getClassName());
		}
		return classNames;
	}
}

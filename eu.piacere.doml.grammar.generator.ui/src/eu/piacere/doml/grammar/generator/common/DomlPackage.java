package eu.piacere.doml.grammar.generator.common;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * An enumeration to represent the DOML packages.
 */
public enum DomlPackage {
	
	/*
	 * This enumeration contains the representation of the DOML packages included in DOML 3.1.
	 * The packages number, URIs, names and prefixes are supposed to remain unchanged.
	 */
	COMMONS("commons", "http://www.piacere-project.eu/doml/commons", "commons"),
	APPLICATION("application", "http://www.piacere-project.eu/doml/application", "app"),
	INFRASTRUCTURE("infrastructure", "http://www.piacere-project.eu/doml/infrastructure", "infra"),
	CONCRETE("concrete", "http://www.piacere-project.eu/doml/concrete", "concrete"),
	OPTIMIZATION("optimization", "http://www.piacere-project.eu/doml/optimization", "opt");
	
	private String name;
	private String nsURI;
	private String prefix;
	
	DomlPackage(String name, String nsURI, String prefix) {
		this.name = name;
		this.nsURI = nsURI;
		this.prefix = prefix;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNsURI() {
		return nsURI;
	}
	
	public String getPrefix() {
		return prefix;
	}
}

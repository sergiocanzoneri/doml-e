/**
 *
 * $Id$
 */
package eu.piacere.doml.doml.infrastructure.validation;


/**
 * A sample validator interface for {@link eu.piacere.doml.doml.infrastructure.MonitoringRule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MonitoringRuleValidator {
	boolean validate();

	boolean validateCondition(String value);
	boolean validateStrategy(String value);
	boolean validateStrategyConfigurationString(String value);
}

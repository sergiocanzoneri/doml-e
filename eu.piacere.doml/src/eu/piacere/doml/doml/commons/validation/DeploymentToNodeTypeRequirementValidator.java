/**
 *
 * $Id$
 */
package eu.piacere.doml.doml.commons.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DeploymentToNodeTypeRequirementValidator {
	boolean validate();

	boolean validateValidTypes(EList<String> value);
}

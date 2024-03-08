/**
 *
 * $Id$
 */
package eu.piacere.doml.doml.concrete.validation;

import eu.piacere.doml.doml.infrastructure.ComputingGroup;

/**
 * A sample validator interface for {@link eu.piacere.doml.doml.concrete.ComputingGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComputingGroupValidator {
	boolean validate();

	boolean validateMaps(ComputingGroup value);
}

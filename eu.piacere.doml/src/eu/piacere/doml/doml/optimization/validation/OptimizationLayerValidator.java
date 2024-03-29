/**
 *
 * $Id$
 */
package eu.piacere.doml.doml.optimization.validation;

import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.Requirement;

import eu.piacere.doml.doml.optimization.OptimizationObjective;
import eu.piacere.doml.doml.optimization.OptimizationSolution;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eu.piacere.doml.doml.optimization.OptimizationLayer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OptimizationLayerValidator {
	boolean validate();

	boolean validateStartingHint(Configuration value);
	boolean validateSolutions(EList<OptimizationSolution> value);
	boolean validateObjectives(EList<OptimizationObjective> value);
	boolean validateNonfunctionalRequirements(EList<Requirement> value);
}

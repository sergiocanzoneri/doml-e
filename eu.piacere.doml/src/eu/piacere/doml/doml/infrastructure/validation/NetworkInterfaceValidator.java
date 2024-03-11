/**
 *
 * $Id$
 */
package eu.piacere.doml.doml.infrastructure.validation;

import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link eu.piacere.doml.doml.infrastructure.NetworkInterface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NetworkInterfaceValidator {
	boolean validate();

	boolean validateSpeed(String value);
	boolean validateEndPoint(String value);
	boolean validateBelongsTo(Network value);
	boolean validateAssociated(EList<SecurityGroup> value);
}
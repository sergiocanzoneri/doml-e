/**
 */
package eu.piacere.doml.doml.commons;

import eu.piacere.doml.doml.infrastructure.InfrastructureElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment To Specific Node Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement#getValidElements <em>Valid Elements</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToSpecificNodeRequirement()
 * @model
 * @generated
 */
public interface DeploymentToSpecificNodeRequirement extends DeploymentRequirement {
	/**
	 * Returns the value of the '<em><b>Valid Elements</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.InfrastructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Elements</em>' reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToSpecificNodeRequirement_ValidElements()
	 * @model
	 * @generated
	 */
	EList<InfrastructureElement> getValidElements();

} // DeploymentToSpecificNodeRequirement

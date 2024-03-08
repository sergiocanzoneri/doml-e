/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment To Node Type Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement#getValidTypes <em>Valid Types</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeTypeRequirement()
 * @model
 * @generated
 */
public interface DeploymentToNodeTypeRequirement extends DeploymentRequirement {
	/**
	 * Returns the value of the '<em><b>Valid Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Types</em>' attribute list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeTypeRequirement_ValidTypes()
	 * @model
	 * @generated
	 */
	EList<String> getValidTypes();

} // DeploymentToNodeTypeRequirement

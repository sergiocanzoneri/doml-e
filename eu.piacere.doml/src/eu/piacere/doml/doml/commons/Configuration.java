/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.Configuration#getDeployments <em>Deployments</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getConfiguration_Deployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployments();

} // Configuration

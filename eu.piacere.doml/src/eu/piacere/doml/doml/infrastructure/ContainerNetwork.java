/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerNetwork#getContainerNetworkName <em>Container Network Name</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerNetwork()
 * @model
 * @generated
 */
public interface ContainerNetwork extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Container Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Network Name</em>' attribute.
	 * @see #setContainerNetworkName(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerNetwork_ContainerNetworkName()
	 * @model
	 * @generated
	 */
	String getContainerNetworkName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerNetwork#getContainerNetworkName <em>Container Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Network Name</em>' attribute.
	 * @see #getContainerNetworkName()
	 * @generated
	 */
	void setContainerNetworkName(String value);

} // ContainerNetwork

/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getContainer_port <em>Container port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getVm_port <em>Vm port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getIface <em>Iface</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerConfig()
 * @model
 * @generated
 */
public interface ContainerConfig extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Container port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container port</em>' attribute.
	 * @see #setContainer_port(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerConfig_Container_port()
	 * @model
	 * @generated
	 */
	Integer getContainer_port();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getContainer_port <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container port</em>' attribute.
	 * @see #getContainer_port()
	 * @generated
	 */
	void setContainer_port(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm port</em>' attribute.
	 * @see #setVm_port(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerConfig_Vm_port()
	 * @model
	 * @generated
	 */
	Integer getVm_port();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getVm_port <em>Vm port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm port</em>' attribute.
	 * @see #getVm_port()
	 * @generated
	 */
	void setVm_port(Integer value);

	/**
	 * Returns the value of the '<em><b>Iface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iface</em>' reference.
	 * @see #setIface(NetworkInterface)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getContainerConfig_Iface()
	 * @model
	 * @generated
	 */
	NetworkInterface getIface();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getIface <em>Iface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iface</em>' reference.
	 * @see #getIface()
	 * @generated
	 */
	void setIface(NetworkInterface value);

} // ContainerConfig

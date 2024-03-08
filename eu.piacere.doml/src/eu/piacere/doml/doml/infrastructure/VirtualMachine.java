/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom <em>Generated From</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getConfigInterface <em>Config Interface</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends ComputingNode {
	/**
	 * Returns the value of the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Description</em>' attribute.
	 * @see #setSizeDescription(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVirtualMachine_SizeDescription()
	 * @model
	 * @generated
	 */
	String getSizeDescription();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getSizeDescription <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Description</em>' attribute.
	 * @see #getSizeDescription()
	 * @generated
	 */
	void setSizeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generated From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.VMImage#getGeneratedVMs <em>Generated VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated From</em>' reference.
	 * @see #setGeneratedFrom(VMImage)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVirtualMachine_GeneratedFrom()
	 * @see eu.piacere.doml.doml.infrastructure.VMImage#getGeneratedVMs
	 * @model opposite="generatedVMs"
	 * @generated
	 */
	VMImage getGeneratedFrom();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom <em>Generated From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated From</em>' reference.
	 * @see #getGeneratedFrom()
	 * @generated
	 */
	void setGeneratedFrom(VMImage value);

	/**
	 * Returns the value of the '<em><b>Config Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Interface</em>' reference.
	 * @see #setConfigInterface(NetworkInterface)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getVirtualMachine_ConfigInterface()
	 * @model
	 * @generated
	 */
	NetworkInterface getConfigInterface();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getConfigInterface <em>Config Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Interface</em>' reference.
	 * @see #getConfigInterface()
	 * @generated
	 */
	void setConfigInterface(NetworkInterface value);

} // VirtualMachine

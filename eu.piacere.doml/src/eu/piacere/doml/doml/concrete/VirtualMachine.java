/**
 */
package eu.piacere.doml.doml.concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.VirtualMachine#getVm_type <em>Vm type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.VirtualMachine#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Vm type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm type</em>' attribute.
	 * @see #setVm_type(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVirtualMachine_Vm_type()
	 * @model
	 * @generated
	 */
	String getVm_type();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.VirtualMachine#getVm_type <em>Vm type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm type</em>' attribute.
	 * @see #getVm_type()
	 * @generated
	 */
	void setVm_type(String value);

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.VirtualMachine)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getVirtualMachine_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.VirtualMachine getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.VirtualMachine#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.VirtualMachine value);

} // VirtualMachine

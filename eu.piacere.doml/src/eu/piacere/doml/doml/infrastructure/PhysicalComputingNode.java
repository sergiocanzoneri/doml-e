/**
 */
package eu.piacere.doml.doml.infrastructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Computing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.PhysicalComputingNode#getConfigInterface <em>Config Interface</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getPhysicalComputingNode()
 * @model
 * @generated
 */
public interface PhysicalComputingNode extends ComputingNode {

	/**
	 * Returns the value of the '<em><b>Config Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Interface</em>' reference.
	 * @see #setConfigInterface(NetworkInterface)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getPhysicalComputingNode_ConfigInterface()
	 * @model
	 * @generated
	 */
	NetworkInterface getConfigInterface();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.PhysicalComputingNode#getConfigInterface <em>Config Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Interface</em>' reference.
	 * @see #getConfigInterface()
	 * @generated
	 */
	void setConfigInterface(NetworkInterface value);
} // PhysicalComputingNode

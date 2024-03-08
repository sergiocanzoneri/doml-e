/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSize <em>Size</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getNetwork <em>Network</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment()
 * @model
 * @generated
 */
public interface ExecutionEnvironment extends InfrastructureElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment_Size()
	 * @model
	 * @generated
	 */
	Float getSize();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Float value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment_MaxSize()
	 * @model
	 * @generated
	 */
	Float getMaxSize();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(Float value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getExecutionEnvironment_SecurityGroups()
	 * @model
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

} // ExecutionEnvironment

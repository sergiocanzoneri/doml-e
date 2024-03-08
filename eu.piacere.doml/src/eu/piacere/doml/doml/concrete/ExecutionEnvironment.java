/**
 */
package eu.piacere.doml.doml.concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getInstance_type <em>Instance type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getStorage_type <em>Storage type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getExecutionEnvironment()
 * @model
 * @generated
 */
public interface ExecutionEnvironment extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Instance type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance type</em>' attribute.
	 * @see #setInstance_type(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getExecutionEnvironment_Instance_type()
	 * @model
	 * @generated
	 */
	String getInstance_type();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getInstance_type <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance type</em>' attribute.
	 * @see #getInstance_type()
	 * @generated
	 */
	void setInstance_type(String value);

	/**
	 * Returns the value of the '<em><b>Storage type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage type</em>' attribute.
	 * @see #setStorage_type(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getExecutionEnvironment_Storage_type()
	 * @model
	 * @generated
	 */
	String getStorage_type();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getStorage_type <em>Storage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage type</em>' attribute.
	 * @see #getStorage_type()
	 * @generated
	 */
	void setStorage_type(String value);

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.ExecutionEnvironment)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getExecutionEnvironment_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.ExecutionEnvironment getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ExecutionEnvironment#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.ExecutionEnvironment value);

} // ExecutionEnvironment

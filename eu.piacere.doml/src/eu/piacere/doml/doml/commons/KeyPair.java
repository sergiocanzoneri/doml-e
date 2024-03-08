/**
 */
package eu.piacere.doml.doml.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.KeyPair#getUser <em>User</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.KeyPair#getKey <em>Key</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.KeyPair#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.KeyPair#getBits <em>Bits</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getKeyPair()
 * @model
 * @generated
 */
public interface KeyPair extends Credentials {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getKeyPair_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.KeyPair#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getKeyPair_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.KeyPair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getKeyPair_Algorithm()
	 * @model
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.KeyPair#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits</em>' attribute.
	 * @see #setBits(Integer)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getKeyPair_Bits()
	 * @model
	 * @generated
	 */
	Integer getBits();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.KeyPair#getBits <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits</em>' attribute.
	 * @see #getBits()
	 * @generated
	 */
	void setBits(Integer value);

} // KeyPair

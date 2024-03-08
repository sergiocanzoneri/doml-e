/**
 */
package eu.piacere.doml.doml.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Pass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.UserPass#getUsername <em>Username</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.UserPass#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getUserPass()
 * @model
 * @generated
 */
public interface UserPass extends Credentials {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getUserPass_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.UserPass#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getUserPass_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.UserPass#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // UserPass

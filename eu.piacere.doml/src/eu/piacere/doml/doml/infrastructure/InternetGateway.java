/**
 */
package eu.piacere.doml.doml.infrastructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internet Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InternetGateway#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInternetGateway()
 * @model
 * @generated
 */
public interface InternetGateway extends Node {

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInternetGateway_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.InternetGateway#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);
} // InternetGateway

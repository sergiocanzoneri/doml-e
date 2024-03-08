/**
 */
package eu.piacere.doml.doml.concrete;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.Network#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.Network#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.Network#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.Network#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends ConcreteElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getNetwork_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.Network#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Address Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Range</em>' attribute.
	 * @see #setAddressRange(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getNetwork_AddressRange()
	 * @model
	 * @generated
	 */
	String getAddressRange();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.Network#getAddressRange <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Range</em>' attribute.
	 * @see #getAddressRange()
	 * @generated
	 */
	void setAddressRange(String value);

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getNetwork_Subnets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(eu.piacere.doml.doml.infrastructure.Network)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getNetwork_Maps()
	 * @model
	 * @generated
	 */
	eu.piacere.doml.doml.infrastructure.Network getMaps();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.Network#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(eu.piacere.doml.doml.infrastructure.Network value);

} // Network

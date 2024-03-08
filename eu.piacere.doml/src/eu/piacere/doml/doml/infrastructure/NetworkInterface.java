/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getSpeed <em>Speed</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getAssociated <em>Associated</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetworkInterface()
 * @model
 * @generated
 */
public interface NetworkInterface extends InfrastructureElement {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetworkInterface_Speed()
	 * @model
	 * @generated
	 */
	String getSpeed();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(String value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetworkInterface_EndPoint()
	 * @model
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.Network#getConnectedIfaces <em>Connected Ifaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(Network)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetworkInterface_BelongsTo()
	 * @see eu.piacere.doml.doml.infrastructure.Network#getConnectedIfaces
	 * @model opposite="connectedIfaces"
	 * @generated
	 */
	Network getBelongsTo();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Network value);

	/**
	 * Returns the value of the '<em><b>Associated</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.SecurityGroup}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.SecurityGroup#getIfaces <em>Ifaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetworkInterface_Associated()
	 * @see eu.piacere.doml.doml.infrastructure.SecurityGroup#getIfaces
	 * @model opposite="ifaces"
	 * @generated
	 */
	EList<SecurityGroup> getAssociated();

} // NetworkInterface

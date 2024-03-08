/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

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
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Network#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Network#getConnectedIfaces <em>Connected Ifaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Network#getGateways <em>Gateways</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Network#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The default value is <code>"TCP/IP"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetwork_Protocol()
	 * @model default="TCP/IP"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Network#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Connected Ifaces</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.NetworkInterface}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Ifaces</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetwork_ConnectedIfaces()
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<NetworkInterface> getConnectedIfaces();

	/**
	 * Returns the value of the '<em><b>Gateways</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.InternetGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateways</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetwork_Gateways()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternetGateway> getGateways();

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNetwork_Subnets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnets();

} // Network

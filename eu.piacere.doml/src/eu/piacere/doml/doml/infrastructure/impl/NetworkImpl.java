/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.InternetGateway;
import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.Subnet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl#getConnectedIfaces <em>Connected Ifaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl#getGateways <em>Gateways</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends DOMLElementImpl implements Network {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = "TCP/IP";

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedIfaces() <em>Connected Ifaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedIfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkInterface> connectedIfaces;

	/**
	 * The cached value of the '{@link #getGateways() <em>Gateways</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateways()
	 * @generated
	 * @ordered
	 */
	protected EList<InternetGateway> gateways;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkInterface> getConnectedIfaces() {
		if (connectedIfaces == null) {
			connectedIfaces = new EObjectWithInverseResolvingEList<NetworkInterface>(NetworkInterface.class, this, InfrastructurePackage.NETWORK__CONNECTED_IFACES, InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO);
		}
		return connectedIfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternetGateway> getGateways() {
		if (gateways == null) {
			gateways = new EObjectContainmentEList<InternetGateway>(InternetGateway.class, this, InfrastructurePackage.NETWORK__GATEWAYS);
		}
		return gateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectContainmentEList<Subnet>(Subnet.class, this, InfrastructurePackage.NETWORK__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedIfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				return ((InternalEList<?>)getConnectedIfaces()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.NETWORK__GATEWAYS:
				return ((InternalEList<?>)getGateways()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.NETWORK__SUBNETS:
				return ((InternalEList<?>)getSubnets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__PROTOCOL:
				return getProtocol();
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				return getConnectedIfaces();
			case InfrastructurePackage.NETWORK__GATEWAYS:
				return getGateways();
			case InfrastructurePackage.NETWORK__SUBNETS:
				return getSubnets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				getConnectedIfaces().clear();
				getConnectedIfaces().addAll((Collection<? extends NetworkInterface>)newValue);
				return;
			case InfrastructurePackage.NETWORK__GATEWAYS:
				getGateways().clear();
				getGateways().addAll((Collection<? extends InternetGateway>)newValue);
				return;
			case InfrastructurePackage.NETWORK__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				getConnectedIfaces().clear();
				return;
			case InfrastructurePackage.NETWORK__GATEWAYS:
				getGateways().clear();
				return;
			case InfrastructurePackage.NETWORK__SUBNETS:
				getSubnets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.NETWORK__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case InfrastructurePackage.NETWORK__CONNECTED_IFACES:
				return connectedIfaces != null && !connectedIfaces.isEmpty();
			case InfrastructurePackage.NETWORK__GATEWAYS:
				return gateways != null && !gateways.isEmpty();
			case InfrastructurePackage.NETWORK__SUBNETS:
				return subnets != null && !subnets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl

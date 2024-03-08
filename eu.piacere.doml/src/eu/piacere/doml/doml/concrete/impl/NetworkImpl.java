/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.Network;

import eu.piacere.doml.doml.concrete.Subnet;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl#getAddressRange <em>Address Range</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.NetworkImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends ConcreteElementImpl implements Network {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;
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
	 * The default value of the '{@link #getAddressRange() <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRange()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_RANGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAddressRange() <em>Address Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressRange()
	 * @generated
	 * @ordered
	 */
	protected String addressRange = ADDRESS_RANGE_EDEFAULT;
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
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected eu.piacere.doml.doml.infrastructure.Network maps;

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
		return ConcretePackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.NETWORK__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressRange() {
		return addressRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressRange(String newAddressRange) {
		String oldAddressRange = addressRange;
		addressRange = newAddressRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.NETWORK__ADDRESS_RANGE, oldAddressRange, addressRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectContainmentEList<Subnet>(Subnet.class, this, ConcretePackage.NETWORK__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.Network getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (eu.piacere.doml.doml.infrastructure.Network)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.NETWORK__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.piacere.doml.doml.infrastructure.Network basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaps(eu.piacere.doml.doml.infrastructure.Network newMaps) {
		eu.piacere.doml.doml.infrastructure.Network oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.NETWORK__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.NETWORK__SUBNETS:
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
			case ConcretePackage.NETWORK__PROTOCOL:
				return getProtocol();
			case ConcretePackage.NETWORK__ADDRESS_RANGE:
				return getAddressRange();
			case ConcretePackage.NETWORK__SUBNETS:
				return getSubnets();
			case ConcretePackage.NETWORK__MAPS:
				if (resolve) return getMaps();
				return basicGetMaps();
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
			case ConcretePackage.NETWORK__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ConcretePackage.NETWORK__ADDRESS_RANGE:
				setAddressRange((String)newValue);
				return;
			case ConcretePackage.NETWORK__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
				return;
			case ConcretePackage.NETWORK__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.Network)newValue);
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
			case ConcretePackage.NETWORK__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ConcretePackage.NETWORK__ADDRESS_RANGE:
				setAddressRange(ADDRESS_RANGE_EDEFAULT);
				return;
			case ConcretePackage.NETWORK__SUBNETS:
				getSubnets().clear();
				return;
			case ConcretePackage.NETWORK__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.Network)null);
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
			case ConcretePackage.NETWORK__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ConcretePackage.NETWORK__ADDRESS_RANGE:
				return ADDRESS_RANGE_EDEFAULT == null ? addressRange != null : !ADDRESS_RANGE_EDEFAULT.equals(addressRange);
			case ConcretePackage.NETWORK__SUBNETS:
				return subnets != null && !subnets.isEmpty();
			case ConcretePackage.NETWORK__MAPS:
				return maps != null;
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
		result.append(", addressRange: ");
		result.append(addressRange);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl

/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.ExecutionEnvironment;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.Location;
import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl#getSecurityGroups <em>Security Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEnvironmentImpl extends InfrastructureElementImpl implements ExecutionEnvironment {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Float size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float MAX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected Float maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The cached value of the '{@link #getSecurityGroups() <em>Security Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securityGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.EXECUTION_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Float newSize) {
		Float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EXECUTION_ENVIRONMENT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(Float newMaxSize) {
		Float oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EXECUTION_ENVIRONMENT__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, InfrastructurePackage.EXECUTION_ENVIRONMENT__SECURITY_GROUPS);
		}
		return securityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION:
				return basicSetLocation(null, msgs);
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
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SIZE:
				return getSize();
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__MAX_SIZE:
				return getMaxSize();
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION:
				return getLocation();
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SECURITY_GROUPS:
				return getSecurityGroups();
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
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SIZE:
				setSize((Float)newValue);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__MAX_SIZE:
				setMaxSize((Float)newValue);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION:
				setLocation((Location)newValue);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SECURITY_GROUPS:
				getSecurityGroups().clear();
				getSecurityGroups().addAll((Collection<? extends SecurityGroup>)newValue);
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
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION:
				setLocation((Location)null);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK:
				setNetwork((Network)null);
				return;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SECURITY_GROUPS:
				getSecurityGroups().clear();
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
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__MAX_SIZE:
				return MAX_SIZE_EDEFAULT == null ? maxSize != null : !MAX_SIZE_EDEFAULT.equals(maxSize);
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__LOCATION:
				return location != null;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__NETWORK:
				return network != null;
			case InfrastructurePackage.EXECUTION_ENVIRONMENT__SECURITY_GROUPS:
				return securityGroups != null && !securityGroups.isEmpty();
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
		result.append(" (size: ");
		result.append(size);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(')');
		return result.toString();
	}

} //ExecutionEnvironmentImpl

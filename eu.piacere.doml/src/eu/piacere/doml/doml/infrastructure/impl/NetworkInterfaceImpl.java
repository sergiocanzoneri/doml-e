/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl#getAssociated <em>Associated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkInterfaceImpl extends InfrastructureElementImpl implements NetworkInterface {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected String speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected String endPoint = END_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected Network belongsTo;

	/**
	 * The cached value of the '{@link #getAssociated() <em>Associated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociated()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> associated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.NETWORK_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(String newSpeed) {
		String oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK_INTERFACE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPoint(String newEndPoint) {
		String oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK_INTERFACE__END_POINT, oldEndPoint, endPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (Network)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(Network newBelongsTo, NotificationChain msgs) {
		Network oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO, oldBelongsTo, newBelongsTo);
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
	public void setBelongsTo(Network newBelongsTo) {
		if (newBelongsTo != belongsTo) {
			NotificationChain msgs = null;
			if (belongsTo != null)
				msgs = ((InternalEObject)belongsTo).eInverseRemove(this, InfrastructurePackage.NETWORK__CONNECTED_IFACES, Network.class, msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, InfrastructurePackage.NETWORK__CONNECTED_IFACES, Network.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getAssociated() {
		if (associated == null) {
			associated = new EObjectWithInverseResolvingEList.ManyInverse<SecurityGroup>(SecurityGroup.class, this, InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED, InfrastructurePackage.SECURITY_GROUP__IFACES);
		}
		return associated;
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
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				if (belongsTo != null)
					msgs = ((InternalEObject)belongsTo).eInverseRemove(this, InfrastructurePackage.NETWORK__CONNECTED_IFACES, Network.class, msgs);
				return basicSetBelongsTo((Network)otherEnd, msgs);
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociated()).basicAdd(otherEnd, msgs);
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
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				return ((InternalEList<?>)getAssociated()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.NETWORK_INTERFACE__SPEED:
				return getSpeed();
			case InfrastructurePackage.NETWORK_INTERFACE__END_POINT:
				return getEndPoint();
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				return getAssociated();
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
			case InfrastructurePackage.NETWORK_INTERFACE__SPEED:
				setSpeed((String)newValue);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__END_POINT:
				setEndPoint((String)newValue);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				setBelongsTo((Network)newValue);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				getAssociated().clear();
				getAssociated().addAll((Collection<? extends SecurityGroup>)newValue);
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
			case InfrastructurePackage.NETWORK_INTERFACE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__END_POINT:
				setEndPoint(END_POINT_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				setBelongsTo((Network)null);
				return;
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				getAssociated().clear();
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
			case InfrastructurePackage.NETWORK_INTERFACE__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case InfrastructurePackage.NETWORK_INTERFACE__END_POINT:
				return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
			case InfrastructurePackage.NETWORK_INTERFACE__BELONGS_TO:
				return belongsTo != null;
			case InfrastructurePackage.NETWORK_INTERFACE__ASSOCIATED:
				return associated != null && !associated.isEmpty();
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", endPoint: ");
		result.append(endPoint);
		result.append(')');
		return result.toString();
	}

} //NetworkInterfaceImpl

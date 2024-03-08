/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.Container;
import eu.piacere.doml.doml.infrastructure.ContainerNetwork;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

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
 * An implementation of the model object '<em><b>Container Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerNetworkImpl#getContainerNetworkName <em>Container Network Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerNetworkImpl extends DOMLElementImpl implements ContainerNetwork {
	/**
	 * The default value of the '{@link #getContainerNetworkName() <em>Container Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerNetworkName() <em>Container Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String containerNetworkName = CONTAINER_NETWORK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerNetworkName() {
		return containerNetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerNetworkName(String newContainerNetworkName) {
		String oldContainerNetworkName = containerNetworkName;
		containerNetworkName = newContainerNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_NETWORK__CONTAINER_NETWORK_NAME, oldContainerNetworkName, containerNetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_NETWORK__CONTAINER_NETWORK_NAME:
				return getContainerNetworkName();
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
			case InfrastructurePackage.CONTAINER_NETWORK__CONTAINER_NETWORK_NAME:
				setContainerNetworkName((String)newValue);
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
			case InfrastructurePackage.CONTAINER_NETWORK__CONTAINER_NETWORK_NAME:
				setContainerNetworkName(CONTAINER_NETWORK_NAME_EDEFAULT);
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
			case InfrastructurePackage.CONTAINER_NETWORK__CONTAINER_NETWORK_NAME:
				return CONTAINER_NETWORK_NAME_EDEFAULT == null ? containerNetworkName != null : !CONTAINER_NETWORK_NAME_EDEFAULT.equals(containerNetworkName);
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
		result.append(" (containerNetworkName: ");
		result.append(containerNetworkName);
		result.append(')');
		return result.toString();
	}

} //ContainerNetworkImpl

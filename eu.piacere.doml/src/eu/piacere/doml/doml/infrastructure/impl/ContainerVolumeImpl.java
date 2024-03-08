/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.Container;
import eu.piacere.doml.doml.infrastructure.ContainerVolume;
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
 * An implementation of the model object '<em><b>Container Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl#getContainerVolumeName <em>Container Volume Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerVolumeImpl extends DOMLElementImpl implements ContainerVolume {
	/**
	 * The default value of the '{@link #getContainerVolumeName() <em>Container Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerVolumeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_VOLUME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerVolumeName() <em>Container Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerVolumeName()
	 * @generated
	 * @ordered
	 */
	protected String containerVolumeName = CONTAINER_VOLUME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerVolumeName() {
		return containerVolumeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerVolumeName(String newContainerVolumeName) {
		String oldContainerVolumeName = containerVolumeName;
		containerVolumeName = newContainerVolumeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_VOLUME__CONTAINER_VOLUME_NAME, oldContainerVolumeName, containerVolumeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_VOLUME__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_VOLUME__CONTAINER_VOLUME_NAME:
				return getContainerVolumeName();
			case InfrastructurePackage.CONTAINER_VOLUME__PATH:
				return getPath();
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
			case InfrastructurePackage.CONTAINER_VOLUME__CONTAINER_VOLUME_NAME:
				setContainerVolumeName((String)newValue);
				return;
			case InfrastructurePackage.CONTAINER_VOLUME__PATH:
				setPath((String)newValue);
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
			case InfrastructurePackage.CONTAINER_VOLUME__CONTAINER_VOLUME_NAME:
				setContainerVolumeName(CONTAINER_VOLUME_NAME_EDEFAULT);
				return;
			case InfrastructurePackage.CONTAINER_VOLUME__PATH:
				setPath(PATH_EDEFAULT);
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
			case InfrastructurePackage.CONTAINER_VOLUME__CONTAINER_VOLUME_NAME:
				return CONTAINER_VOLUME_NAME_EDEFAULT == null ? containerVolumeName != null : !CONTAINER_VOLUME_NAME_EDEFAULT.equals(containerVolumeName);
			case InfrastructurePackage.CONTAINER_VOLUME__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (containerVolumeName: ");
		result.append(containerVolumeName);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ContainerVolumeImpl

/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.ContainerImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ContainerImageImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImageImpl extends ConcreteElementImpl implements ContainerImage {
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected eu.piacere.doml.doml.infrastructure.ContainerImage maps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.CONTAINER_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.ContainerImage getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (eu.piacere.doml.doml.infrastructure.ContainerImage)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.CONTAINER_IMAGE__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.piacere.doml.doml.infrastructure.ContainerImage basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaps(eu.piacere.doml.doml.infrastructure.ContainerImage newMaps) {
		eu.piacere.doml.doml.infrastructure.ContainerImage oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CONTAINER_IMAGE__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.CONTAINER_IMAGE__MAPS:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConcretePackage.CONTAINER_IMAGE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.ContainerImage)newValue);
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
			case ConcretePackage.CONTAINER_IMAGE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.ContainerImage)null);
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
			case ConcretePackage.CONTAINER_IMAGE__MAPS:
				return maps != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImageImpl

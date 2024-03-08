/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.VMImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.VMImageImpl#getImage_name <em>Image name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.VMImageImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMImageImpl extends ConcreteElementImpl implements VMImage {
	/**
	 * The default value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImage_name() <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_name()
	 * @generated
	 * @ordered
	 */
	protected String image_name = IMAGE_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected eu.piacere.doml.doml.infrastructure.VMImage maps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.VM_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage_name() {
		return image_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage_name(String newImage_name) {
		String oldImage_name = image_name;
		image_name = newImage_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.VM_IMAGE__IMAGE_NAME, oldImage_name, image_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.VMImage getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (eu.piacere.doml.doml.infrastructure.VMImage)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.VM_IMAGE__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.piacere.doml.doml.infrastructure.VMImage basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaps(eu.piacere.doml.doml.infrastructure.VMImage newMaps) {
		eu.piacere.doml.doml.infrastructure.VMImage oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.VM_IMAGE__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.VM_IMAGE__IMAGE_NAME:
				return getImage_name();
			case ConcretePackage.VM_IMAGE__MAPS:
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
			case ConcretePackage.VM_IMAGE__IMAGE_NAME:
				setImage_name((String)newValue);
				return;
			case ConcretePackage.VM_IMAGE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.VMImage)newValue);
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
			case ConcretePackage.VM_IMAGE__IMAGE_NAME:
				setImage_name(IMAGE_NAME_EDEFAULT);
				return;
			case ConcretePackage.VM_IMAGE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.VMImage)null);
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
			case ConcretePackage.VM_IMAGE__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? image_name != null : !IMAGE_NAME_EDEFAULT.equals(image_name);
			case ConcretePackage.VM_IMAGE__MAPS:
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
		result.append(" (image_name: ");
		result.append(image_name);
		result.append(')');
		return result.toString();
	}

} //VMImageImpl

/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.ExtConcreteElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Concrete Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ExtConcreteElementImpl#getMetaclassName <em>Metaclass Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtConcreteElementImpl extends ConcreteElementImpl implements ExtConcreteElement {
	/**
	 * The default value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected String metaclassName = METACLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtConcreteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.EXT_CONCRETE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaclassName() {
		return metaclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaclassName(String newMetaclassName) {
		String oldMetaclassName = metaclassName;
		metaclassName = newMetaclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME, oldMetaclassName, metaclassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME:
				return getMetaclassName();
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
			case ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME:
				setMetaclassName((String)newValue);
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
			case ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME:
				setMetaclassName(METACLASS_NAME_EDEFAULT);
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
			case ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME:
				return METACLASS_NAME_EDEFAULT == null ? metaclassName != null : !METACLASS_NAME_EDEFAULT.equals(metaclassName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ExtensionElement.class) {
			switch (derivedFeatureID) {
				case ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME: return CommonsPackage.EXTENSION_ELEMENT__METACLASS_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ExtensionElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.EXTENSION_ELEMENT__METACLASS_NAME: return ConcretePackage.EXT_CONCRETE_ELEMENT__METACLASS_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (metaclassName: ");
		result.append(metaclassName);
		result.append(')');
		return result.toString();
	}

} //ExtConcreteElementImpl

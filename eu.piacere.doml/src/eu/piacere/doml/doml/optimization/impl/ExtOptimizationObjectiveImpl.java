/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.optimization.ExtOptimizationObjective;
import eu.piacere.doml.doml.optimization.OptimizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Optimization Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.ExtOptimizationObjectiveImpl#getMetaclassName <em>Metaclass Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtOptimizationObjectiveImpl extends OptimizationObjectiveImpl implements ExtOptimizationObjective {
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
	protected ExtOptimizationObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationPackage.Literals.EXT_OPTIMIZATION_OBJECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME, oldMetaclassName, metaclassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME:
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
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME:
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
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME:
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
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME:
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
				case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME: return CommonsPackage.EXTENSION_ELEMENT__METACLASS_NAME;
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
				case CommonsPackage.EXTENSION_ELEMENT__METACLASS_NAME: return OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME;
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

} //ExtOptimizationObjectiveImpl

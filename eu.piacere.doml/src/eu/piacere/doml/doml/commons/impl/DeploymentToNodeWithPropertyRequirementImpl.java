/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment To Node With Property Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentToNodeWithPropertyRequirementImpl extends DeploymentRequirementImpl implements DeploymentToNodeWithPropertyRequirement {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Float MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Float min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Float MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Float max = MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentToNodeWithPropertyRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(Float newMin) {
		Float oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(Float newMax) {
		Float oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN:
				return getMin();
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX:
				return getMax();
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES:
				return getValues();
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN:
				setMin((Float)newValue);
				return;
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX:
				setMax((Float)newValue);
				return;
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES:
				getValues().clear();
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
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case CommonsPackage.DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //DeploymentToNodeWithPropertyRequirementImpl

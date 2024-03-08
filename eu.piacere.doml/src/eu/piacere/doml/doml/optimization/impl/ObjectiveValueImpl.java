/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.optimization.ObjectiveValue;
import eu.piacere.doml.doml.optimization.OptimizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveValueImpl extends EObjectImpl implements ObjectiveValue {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Float COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Float AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Float availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final Float PERFORMANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected Float performance = PERFORMANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationPackage.Literals.OBJECTIVE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(Float newCost) {
		Float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OBJECTIVE_VALUE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailability(Float newAvailability) {
		Float oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OBJECTIVE_VALUE__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformance(Float newPerformance) {
		Float oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OBJECTIVE_VALUE__PERFORMANCE, oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationPackage.OBJECTIVE_VALUE__COST:
				return getCost();
			case OptimizationPackage.OBJECTIVE_VALUE__AVAILABILITY:
				return getAvailability();
			case OptimizationPackage.OBJECTIVE_VALUE__PERFORMANCE:
				return getPerformance();
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
			case OptimizationPackage.OBJECTIVE_VALUE__COST:
				setCost((Float)newValue);
				return;
			case OptimizationPackage.OBJECTIVE_VALUE__AVAILABILITY:
				setAvailability((Float)newValue);
				return;
			case OptimizationPackage.OBJECTIVE_VALUE__PERFORMANCE:
				setPerformance((Float)newValue);
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
			case OptimizationPackage.OBJECTIVE_VALUE__COST:
				setCost(COST_EDEFAULT);
				return;
			case OptimizationPackage.OBJECTIVE_VALUE__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case OptimizationPackage.OBJECTIVE_VALUE__PERFORMANCE:
				setPerformance(PERFORMANCE_EDEFAULT);
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
			case OptimizationPackage.OBJECTIVE_VALUE__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case OptimizationPackage.OBJECTIVE_VALUE__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case OptimizationPackage.OBJECTIVE_VALUE__PERFORMANCE:
				return PERFORMANCE_EDEFAULT == null ? performance != null : !PERFORMANCE_EDEFAULT.equals(performance);
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", availability: ");
		result.append(availability);
		result.append(", performance: ");
		result.append(performance);
		result.append(')');
		return result.toString();
	}

} //ObjectiveValueImpl

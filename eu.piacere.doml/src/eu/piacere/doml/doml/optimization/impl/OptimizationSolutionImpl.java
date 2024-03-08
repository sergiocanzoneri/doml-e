/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.commons.impl.ConfigurationImpl;

import eu.piacere.doml.doml.optimization.ObjectiveValue;
import eu.piacere.doml.doml.optimization.OptimizationPackage;
import eu.piacere.doml.doml.optimization.OptimizationSolution;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl#getDecisions <em>Decisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimizationSolutionImpl extends ConfigurationImpl implements OptimizationSolution {
	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected ObjectiveValue objectives;

	/**
	 * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> decisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizationSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationPackage.Literals.OPTIMIZATION_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveValue getObjectives() {
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectives(ObjectiveValue newObjectives, NotificationChain msgs) {
		ObjectiveValue oldObjectives = objectives;
		objectives = newObjectives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES, oldObjectives, newObjectives);
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
	public void setObjectives(ObjectiveValue newObjectives) {
		if (newObjectives != objectives) {
			NotificationChain msgs = null;
			if (objectives != null)
				msgs = ((InternalEObject)objectives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES, null, msgs);
			if (newObjectives != null)
				msgs = ((InternalEObject)newObjectives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES, null, msgs);
			msgs = basicSetObjectives(newObjectives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES, newObjectives, newObjectives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDecisions() {
		if (decisions == null) {
			decisions = new EDataTypeUniqueEList<String>(String.class, this, OptimizationPackage.OPTIMIZATION_SOLUTION__DECISIONS);
		}
		return decisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES:
				return basicSetObjectives(null, msgs);
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
			case OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES:
				return getObjectives();
			case OptimizationPackage.OPTIMIZATION_SOLUTION__DECISIONS:
				return getDecisions();
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
			case OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES:
				setObjectives((ObjectiveValue)newValue);
				return;
			case OptimizationPackage.OPTIMIZATION_SOLUTION__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends String>)newValue);
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
			case OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES:
				setObjectives((ObjectiveValue)null);
				return;
			case OptimizationPackage.OPTIMIZATION_SOLUTION__DECISIONS:
				getDecisions().clear();
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
			case OptimizationPackage.OPTIMIZATION_SOLUTION__OBJECTIVES:
				return objectives != null;
			case OptimizationPackage.OPTIMIZATION_SOLUTION__DECISIONS:
				return decisions != null && !decisions.isEmpty();
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
		result.append(" (decisions: ");
		result.append(decisions);
		result.append(')');
		return result.toString();
	}

} //OptimizationSolutionImpl

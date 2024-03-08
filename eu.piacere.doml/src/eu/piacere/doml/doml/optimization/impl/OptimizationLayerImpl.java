/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.Requirement;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.optimization.OptimizationLayer;
import eu.piacere.doml.doml.optimization.OptimizationObjective;
import eu.piacere.doml.doml.optimization.OptimizationPackage;
import eu.piacere.doml.doml.optimization.OptimizationSolution;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl#getStartingHint <em>Starting Hint</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl#getNonfunctionalRequirements <em>Nonfunctional Requirements</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimizationLayerImpl extends DOMLElementImpl implements OptimizationLayer {
	/**
	 * The cached value of the '{@link #getStartingHint() <em>Starting Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingHint()
	 * @generated
	 * @ordered
	 */
	protected Configuration startingHint;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<OptimizationSolution> solutions;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<OptimizationObjective> objectives;

	/**
	 * The cached value of the '{@link #getNonfunctionalRequirements() <em>Nonfunctional Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonfunctionalRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> nonfunctionalRequirements;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final Float RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected Float runtime = RUNTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizationLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationPackage.Literals.OPTIMIZATION_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getStartingHint() {
		if (startingHint != null && startingHint.eIsProxy()) {
			InternalEObject oldStartingHint = (InternalEObject)startingHint;
			startingHint = (Configuration)eResolveProxy(oldStartingHint);
			if (startingHint != oldStartingHint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT, oldStartingHint, startingHint));
			}
		}
		return startingHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetStartingHint() {
		return startingHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartingHint(Configuration newStartingHint) {
		Configuration oldStartingHint = startingHint;
		startingHint = newStartingHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT, oldStartingHint, startingHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptimizationSolution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<OptimizationSolution>(OptimizationSolution.class, this, OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OptimizationObjective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<OptimizationObjective>(OptimizationObjective.class, this, OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getNonfunctionalRequirements() {
		if (nonfunctionalRequirements == null) {
			nonfunctionalRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS);
		}
		return nonfunctionalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(Float newRuntime) {
		Float oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_LAYER__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
			case OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS:
				return ((InternalEList<?>)getNonfunctionalRequirements()).basicRemove(otherEnd, msgs);
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
			case OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT:
				if (resolve) return getStartingHint();
				return basicGetStartingHint();
			case OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS:
				return getSolutions();
			case OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES:
				return getObjectives();
			case OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS:
				return getNonfunctionalRequirements();
			case OptimizationPackage.OPTIMIZATION_LAYER__RUNTIME:
				return getRuntime();
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
			case OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT:
				setStartingHint((Configuration)newValue);
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends OptimizationSolution>)newValue);
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends OptimizationObjective>)newValue);
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS:
				getNonfunctionalRequirements().clear();
				getNonfunctionalRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__RUNTIME:
				setRuntime((Float)newValue);
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
			case OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT:
				setStartingHint((Configuration)null);
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS:
				getSolutions().clear();
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES:
				getObjectives().clear();
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS:
				getNonfunctionalRequirements().clear();
				return;
			case OptimizationPackage.OPTIMIZATION_LAYER__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
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
			case OptimizationPackage.OPTIMIZATION_LAYER__STARTING_HINT:
				return startingHint != null;
			case OptimizationPackage.OPTIMIZATION_LAYER__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case OptimizationPackage.OPTIMIZATION_LAYER__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
			case OptimizationPackage.OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS:
				return nonfunctionalRequirements != null && !nonfunctionalRequirements.isEmpty();
			case OptimizationPackage.OPTIMIZATION_LAYER__RUNTIME:
				return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
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
		result.append(" (runtime: ");
		result.append(runtime);
		result.append(')');
		return result.toString();
	}

} //OptimizationLayerImpl

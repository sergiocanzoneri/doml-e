/**
 */
package eu.piacere.doml.doml.optimization.util;

import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.optimization.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage
 * @generated
 */
public class OptimizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationSwitch() {
		if (modelPackage == null) {
			modelPackage = OptimizationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OptimizationPackage.OPTIMIZATION_LAYER: {
				OptimizationLayer optimizationLayer = (OptimizationLayer)theEObject;
				T result = caseOptimizationLayer(optimizationLayer);
				if (result == null) result = caseDOMLElement(optimizationLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.OBJECTIVE_VALUE: {
				ObjectiveValue objectiveValue = (ObjectiveValue)theEObject;
				T result = caseObjectiveValue(objectiveValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.OPTIMIZATION_SOLUTION: {
				OptimizationSolution optimizationSolution = (OptimizationSolution)theEObject;
				T result = caseOptimizationSolution(optimizationSolution);
				if (result == null) result = caseConfiguration(optimizationSolution);
				if (result == null) result = caseDOMLElement(optimizationSolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.OPTIMIZATION_OBJECTIVE: {
				OptimizationObjective optimizationObjective = (OptimizationObjective)theEObject;
				T result = caseOptimizationObjective(optimizationObjective);
				if (result == null) result = caseDOMLElement(optimizationObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.COUNT_OBJECTIVE: {
				CountObjective countObjective = (CountObjective)theEObject;
				T result = caseCountObjective(countObjective);
				if (result == null) result = caseOptimizationObjective(countObjective);
				if (result == null) result = caseDOMLElement(countObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.MEASURABLE_OBJECTIVE: {
				MeasurableObjective measurableObjective = (MeasurableObjective)theEObject;
				T result = caseMeasurableObjective(measurableObjective);
				if (result == null) result = caseOptimizationObjective(measurableObjective);
				if (result == null) result = caseDOMLElement(measurableObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE: {
				ExtOptimizationObjective extOptimizationObjective = (ExtOptimizationObjective)theEObject;
				T result = caseExtOptimizationObjective(extOptimizationObjective);
				if (result == null) result = caseOptimizationObjective(extOptimizationObjective);
				if (result == null) result = caseExtensionElement(extOptimizationObjective);
				if (result == null) result = caseDOMLElement(extOptimizationObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationLayer(OptimizationLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveValue(ObjectiveValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationSolution(OptimizationSolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationObjective(OptimizationObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountObjective(CountObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurable Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurable Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurableObjective(MeasurableObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Optimization Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Optimization Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtOptimizationObjective(ExtOptimizationObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMLElement(DOMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElement(ExtensionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OptimizationSwitch

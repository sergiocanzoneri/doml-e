/**
 */
package eu.piacere.doml.doml.optimization.util;

import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.optimization.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage
 * @generated
 */
public class OptimizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OptimizationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizationSwitch<Adapter> modelSwitch =
		new OptimizationSwitch<Adapter>() {
			@Override
			public Adapter caseOptimizationLayer(OptimizationLayer object) {
				return createOptimizationLayerAdapter();
			}
			@Override
			public Adapter caseObjectiveValue(ObjectiveValue object) {
				return createObjectiveValueAdapter();
			}
			@Override
			public Adapter caseOptimizationSolution(OptimizationSolution object) {
				return createOptimizationSolutionAdapter();
			}
			@Override
			public Adapter caseOptimizationObjective(OptimizationObjective object) {
				return createOptimizationObjectiveAdapter();
			}
			@Override
			public Adapter caseCountObjective(CountObjective object) {
				return createCountObjectiveAdapter();
			}
			@Override
			public Adapter caseMeasurableObjective(MeasurableObjective object) {
				return createMeasurableObjectiveAdapter();
			}
			@Override
			public Adapter caseExtOptimizationObjective(ExtOptimizationObjective object) {
				return createExtOptimizationObjectiveAdapter();
			}
			@Override
			public Adapter caseDOMLElement(DOMLElement object) {
				return createDOMLElementAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseExtensionElement(ExtensionElement object) {
				return createExtensionElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.OptimizationLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer
	 * @generated
	 */
	public Adapter createOptimizationLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.ObjectiveValue <em>Objective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.ObjectiveValue
	 * @generated
	 */
	public Adapter createObjectiveValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.OptimizationSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.OptimizationSolution
	 * @generated
	 */
	public Adapter createOptimizationSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.OptimizationObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.OptimizationObjective
	 * @generated
	 */
	public Adapter createOptimizationObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.CountObjective <em>Count Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.CountObjective
	 * @generated
	 */
	public Adapter createCountObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.MeasurableObjective <em>Measurable Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.MeasurableObjective
	 * @generated
	 */
	public Adapter createMeasurableObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.optimization.ExtOptimizationObjective <em>Ext Optimization Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.optimization.ExtOptimizationObjective
	 * @generated
	 */
	public Adapter createExtOptimizationObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DOMLElement <em>DOML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DOMLElement
	 * @generated
	 */
	public Adapter createDOMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.ExtensionElement <em>Extension Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.ExtensionElement
	 * @generated
	 */
	public Adapter createExtensionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OptimizationAdapterFactory

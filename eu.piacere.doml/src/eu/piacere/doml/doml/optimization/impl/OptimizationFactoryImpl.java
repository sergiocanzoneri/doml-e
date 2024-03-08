/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.optimization.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimizationFactoryImpl extends EFactoryImpl implements OptimizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptimizationFactory init() {
		try {
			OptimizationFactory theOptimizationFactory = (OptimizationFactory)EPackage.Registry.INSTANCE.getEFactory(OptimizationPackage.eNS_URI);
			if (theOptimizationFactory != null) {
				return theOptimizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptimizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OptimizationPackage.OPTIMIZATION_LAYER: return createOptimizationLayer();
			case OptimizationPackage.OBJECTIVE_VALUE: return createObjectiveValue();
			case OptimizationPackage.OPTIMIZATION_SOLUTION: return createOptimizationSolution();
			case OptimizationPackage.COUNT_OBJECTIVE: return createCountObjective();
			case OptimizationPackage.MEASURABLE_OBJECTIVE: return createMeasurableObjective();
			case OptimizationPackage.EXT_OPTIMIZATION_OBJECTIVE: return createExtOptimizationObjective();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimizationLayer createOptimizationLayer() {
		OptimizationLayerImpl optimizationLayer = new OptimizationLayerImpl();
		return optimizationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveValue createObjectiveValue() {
		ObjectiveValueImpl objectiveValue = new ObjectiveValueImpl();
		return objectiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimizationSolution createOptimizationSolution() {
		OptimizationSolutionImpl optimizationSolution = new OptimizationSolutionImpl();
		return optimizationSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountObjective createCountObjective() {
		CountObjectiveImpl countObjective = new CountObjectiveImpl();
		return countObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurableObjective createMeasurableObjective() {
		MeasurableObjectiveImpl measurableObjective = new MeasurableObjectiveImpl();
		return measurableObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtOptimizationObjective createExtOptimizationObjective() {
		ExtOptimizationObjectiveImpl extOptimizationObjective = new ExtOptimizationObjectiveImpl();
		return extOptimizationObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimizationPackage getOptimizationPackage() {
		return (OptimizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptimizationPackage getPackage() {
		return OptimizationPackage.eINSTANCE;
	}

} //OptimizationFactoryImpl

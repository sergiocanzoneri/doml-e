/**
 */
package eu.piacere.doml.doml.optimization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage
 * @generated
 */
public interface OptimizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimizationFactory eINSTANCE = eu.piacere.doml.doml.optimization.impl.OptimizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	OptimizationLayer createOptimizationLayer();

	/**
	 * Returns a new object of class '<em>Objective Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Value</em>'.
	 * @generated
	 */
	ObjectiveValue createObjectiveValue();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	OptimizationSolution createOptimizationSolution();

	/**
	 * Returns a new object of class '<em>Count Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Objective</em>'.
	 * @generated
	 */
	CountObjective createCountObjective();

	/**
	 * Returns a new object of class '<em>Measurable Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurable Objective</em>'.
	 * @generated
	 */
	MeasurableObjective createMeasurableObjective();

	/**
	 * Returns a new object of class '<em>Ext Optimization Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Optimization Objective</em>'.
	 * @generated
	 */
	ExtOptimizationObjective createExtOptimizationObjective();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptimizationPackage getOptimizationPackage();

} //OptimizationFactory

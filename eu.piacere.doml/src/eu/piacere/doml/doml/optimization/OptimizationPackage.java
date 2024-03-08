/**
 */
package eu.piacere.doml.doml.optimization;

import eu.piacere.doml.doml.commons.CommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.optimization.OptimizationFactory
 * @model kind="package"
 * @generated
 */
public interface OptimizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "optimization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.piacere-project.eu/doml/optimization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimizationPackage eINSTANCE = eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationLayer()
	 * @generated
	 */
	int OPTIMIZATION_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Starting Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__STARTING_HINT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__SOLUTIONS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__OBJECTIVES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nonfunctional Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER__RUNTIME = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_LAYER_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl <em>Objective Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getObjectiveValue()
	 * @generated
	 */
	int OBJECTIVE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_VALUE__COST = 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_VALUE__AVAILABILITY = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_VALUE__PERFORMANCE = 2;

	/**
	 * The number of structural features of the '<em>Objective Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationSolution()
	 * @generated
	 */
	int OPTIMIZATION_SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__NAME = CommonsPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__DESCRIPTION = CommonsPackage.CONFIGURATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__ANNOTATIONS = CommonsPackage.CONFIGURATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__CONTRIBUTES_TO = CommonsPackage.CONFIGURATION__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__DEPLOYMENTS = CommonsPackage.CONFIGURATION__DEPLOYMENTS;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__OBJECTIVES = CommonsPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION__DECISIONS = CommonsPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_SOLUTION_FEATURE_COUNT = CommonsPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationObjectiveImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationObjective()
	 * @generated
	 */
	int OPTIMIZATION_OBJECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__KIND = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE__PROPERTY = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_OBJECTIVE_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.CountObjectiveImpl <em>Count Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.CountObjectiveImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getCountObjective()
	 * @generated
	 */
	int COUNT_OBJECTIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__NAME = OPTIMIZATION_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__DESCRIPTION = OPTIMIZATION_OBJECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__ANNOTATIONS = OPTIMIZATION_OBJECTIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__CONTRIBUTES_TO = OPTIMIZATION_OBJECTIVE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__KIND = OPTIMIZATION_OBJECTIVE__KIND;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE__PROPERTY = OPTIMIZATION_OBJECTIVE__PROPERTY;

	/**
	 * The number of structural features of the '<em>Count Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OBJECTIVE_FEATURE_COUNT = OPTIMIZATION_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.MeasurableObjectiveImpl <em>Measurable Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.MeasurableObjectiveImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getMeasurableObjective()
	 * @generated
	 */
	int MEASURABLE_OBJECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__NAME = OPTIMIZATION_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__DESCRIPTION = OPTIMIZATION_OBJECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__ANNOTATIONS = OPTIMIZATION_OBJECTIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__CONTRIBUTES_TO = OPTIMIZATION_OBJECTIVE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__KIND = OPTIMIZATION_OBJECTIVE__KIND;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE__PROPERTY = OPTIMIZATION_OBJECTIVE__PROPERTY;

	/**
	 * The number of structural features of the '<em>Measurable Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURABLE_OBJECTIVE_FEATURE_COUNT = OPTIMIZATION_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.optimization.impl.ExtOptimizationObjectiveImpl <em>Ext Optimization Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.optimization.impl.ExtOptimizationObjectiveImpl
	 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getExtOptimizationObjective()
	 * @generated
	 */
	int EXT_OPTIMIZATION_OBJECTIVE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__NAME = OPTIMIZATION_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__DESCRIPTION = OPTIMIZATION_OBJECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__ANNOTATIONS = OPTIMIZATION_OBJECTIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__CONTRIBUTES_TO = OPTIMIZATION_OBJECTIVE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__KIND = OPTIMIZATION_OBJECTIVE__KIND;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__PROPERTY = OPTIMIZATION_OBJECTIVE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE__METACLASS_NAME = OPTIMIZATION_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ext Optimization Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_OPTIMIZATION_OBJECTIVE_FEATURE_COUNT = OPTIMIZATION_OBJECTIVE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.OptimizationLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer
	 * @generated
	 */
	EClass getOptimizationLayer();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getStartingHint <em>Starting Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Hint</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer#getStartingHint()
	 * @see #getOptimizationLayer()
	 * @generated
	 */
	EReference getOptimizationLayer_StartingHint();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer#getSolutions()
	 * @see #getOptimizationLayer()
	 * @generated
	 */
	EReference getOptimizationLayer_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer#getObjectives()
	 * @see #getOptimizationLayer()
	 * @generated
	 */
	EReference getOptimizationLayer_Objectives();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getNonfunctionalRequirements <em>Nonfunctional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nonfunctional Requirements</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer#getNonfunctionalRequirements()
	 * @see #getOptimizationLayer()
	 * @generated
	 */
	EReference getOptimizationLayer_NonfunctionalRequirements();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.OptimizationLayer#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationLayer#getRuntime()
	 * @see #getOptimizationLayer()
	 * @generated
	 */
	EAttribute getOptimizationLayer_Runtime();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.ObjectiveValue <em>Objective Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Value</em>'.
	 * @see eu.piacere.doml.doml.optimization.ObjectiveValue
	 * @generated
	 */
	EClass getObjectiveValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see eu.piacere.doml.doml.optimization.ObjectiveValue#getCost()
	 * @see #getObjectiveValue()
	 * @generated
	 */
	EAttribute getObjectiveValue_Cost();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see eu.piacere.doml.doml.optimization.ObjectiveValue#getAvailability()
	 * @see #getObjectiveValue()
	 * @generated
	 */
	EAttribute getObjectiveValue_Availability();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see eu.piacere.doml.doml.optimization.ObjectiveValue#getPerformance()
	 * @see #getObjectiveValue()
	 * @generated
	 */
	EAttribute getObjectiveValue_Performance();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.OptimizationSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationSolution
	 * @generated
	 */
	EClass getOptimizationSolution();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.optimization.OptimizationSolution#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objectives</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationSolution#getObjectives()
	 * @see #getOptimizationSolution()
	 * @generated
	 */
	EReference getOptimizationSolution_Objectives();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.optimization.OptimizationSolution#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Decisions</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationSolution#getDecisions()
	 * @see #getOptimizationSolution()
	 * @generated
	 */
	EAttribute getOptimizationSolution_Decisions();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.OptimizationObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationObjective
	 * @generated
	 */
	EClass getOptimizationObjective();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationObjective#getKind()
	 * @see #getOptimizationObjective()
	 * @generated
	 */
	EAttribute getOptimizationObjective_Kind();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.optimization.OptimizationObjective#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see eu.piacere.doml.doml.optimization.OptimizationObjective#getProperty()
	 * @see #getOptimizationObjective()
	 * @generated
	 */
	EAttribute getOptimizationObjective_Property();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.CountObjective <em>Count Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Objective</em>'.
	 * @see eu.piacere.doml.doml.optimization.CountObjective
	 * @generated
	 */
	EClass getCountObjective();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.MeasurableObjective <em>Measurable Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurable Objective</em>'.
	 * @see eu.piacere.doml.doml.optimization.MeasurableObjective
	 * @generated
	 */
	EClass getMeasurableObjective();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.optimization.ExtOptimizationObjective <em>Ext Optimization Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Optimization Objective</em>'.
	 * @see eu.piacere.doml.doml.optimization.ExtOptimizationObjective
	 * @generated
	 */
	EClass getExtOptimizationObjective();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptimizationFactory getOptimizationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationLayerImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationLayer()
		 * @generated
		 */
		EClass OPTIMIZATION_LAYER = eINSTANCE.getOptimizationLayer();

		/**
		 * The meta object literal for the '<em><b>Starting Hint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_LAYER__STARTING_HINT = eINSTANCE.getOptimizationLayer_StartingHint();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_LAYER__SOLUTIONS = eINSTANCE.getOptimizationLayer_Solutions();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_LAYER__OBJECTIVES = eINSTANCE.getOptimizationLayer_Objectives();

		/**
		 * The meta object literal for the '<em><b>Nonfunctional Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS = eINSTANCE.getOptimizationLayer_NonfunctionalRequirements();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_LAYER__RUNTIME = eINSTANCE.getOptimizationLayer_Runtime();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl <em>Objective Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.ObjectiveValueImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getObjectiveValue()
		 * @generated
		 */
		EClass OBJECTIVE_VALUE = eINSTANCE.getObjectiveValue();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_VALUE__COST = eINSTANCE.getObjectiveValue_Cost();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_VALUE__AVAILABILITY = eINSTANCE.getObjectiveValue_Availability();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_VALUE__PERFORMANCE = eINSTANCE.getObjectiveValue_Performance();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationSolutionImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationSolution()
		 * @generated
		 */
		EClass OPTIMIZATION_SOLUTION = eINSTANCE.getOptimizationSolution();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_SOLUTION__OBJECTIVES = eINSTANCE.getOptimizationSolution_Objectives();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_SOLUTION__DECISIONS = eINSTANCE.getOptimizationSolution_Decisions();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.OptimizationObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationObjectiveImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getOptimizationObjective()
		 * @generated
		 */
		EClass OPTIMIZATION_OBJECTIVE = eINSTANCE.getOptimizationObjective();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_OBJECTIVE__KIND = eINSTANCE.getOptimizationObjective_Kind();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_OBJECTIVE__PROPERTY = eINSTANCE.getOptimizationObjective_Property();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.CountObjectiveImpl <em>Count Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.CountObjectiveImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getCountObjective()
		 * @generated
		 */
		EClass COUNT_OBJECTIVE = eINSTANCE.getCountObjective();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.MeasurableObjectiveImpl <em>Measurable Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.MeasurableObjectiveImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getMeasurableObjective()
		 * @generated
		 */
		EClass MEASURABLE_OBJECTIVE = eINSTANCE.getMeasurableObjective();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.optimization.impl.ExtOptimizationObjectiveImpl <em>Ext Optimization Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.optimization.impl.ExtOptimizationObjectiveImpl
		 * @see eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl#getExtOptimizationObjective()
		 * @generated
		 */
		EClass EXT_OPTIMIZATION_OBJECTIVE = eINSTANCE.getExtOptimizationObjective();

	}

} //OptimizationPackage

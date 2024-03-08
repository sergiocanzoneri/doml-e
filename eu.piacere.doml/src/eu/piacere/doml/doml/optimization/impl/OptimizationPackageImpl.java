/**
 */
package eu.piacere.doml.doml.optimization.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;

import eu.piacere.doml.doml.application.impl.ApplicationPackageImpl;

import eu.piacere.doml.doml.commons.CommonsPackage;

import eu.piacere.doml.doml.commons.impl.CommonsPackageImpl;

import eu.piacere.doml.doml.concrete.ConcretePackage;

import eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl;

import eu.piacere.doml.doml.optimization.CountObjective;
import eu.piacere.doml.doml.optimization.ExtOptimizationObjective;
import eu.piacere.doml.doml.optimization.MeasurableObjective;
import eu.piacere.doml.doml.optimization.ObjectiveValue;
import eu.piacere.doml.doml.optimization.OptimizationFactory;
import eu.piacere.doml.doml.optimization.OptimizationLayer;
import eu.piacere.doml.doml.optimization.OptimizationObjective;
import eu.piacere.doml.doml.optimization.OptimizationPackage;
import eu.piacere.doml.doml.optimization.OptimizationSolution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimizationPackageImpl extends EPackageImpl implements OptimizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizationLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizationSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizationObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurableObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extOptimizationObjectiveEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptimizationPackageImpl() {
		super(eNS_URI, OptimizationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OptimizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptimizationPackage init() {
		if (isInited) return (OptimizationPackage)EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOptimizationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OptimizationPackageImpl theOptimizationPackage = registeredOptimizationPackage instanceof OptimizationPackageImpl ? (OptimizationPackageImpl)registeredOptimizationPackage : new OptimizationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);
		ConcretePackageImpl theConcretePackage = (ConcretePackageImpl)(registeredPackage instanceof ConcretePackageImpl ? registeredPackage : ConcretePackage.eINSTANCE);

		// Create package meta-data objects
		theOptimizationPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theConcretePackage.createPackageContents();

		// Initialize created meta-data
		theOptimizationPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theConcretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOptimizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OptimizationPackage.eNS_URI, theOptimizationPackage);
		return theOptimizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptimizationLayer() {
		return optimizationLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimizationLayer_StartingHint() {
		return (EReference)optimizationLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimizationLayer_Solutions() {
		return (EReference)optimizationLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimizationLayer_Objectives() {
		return (EReference)optimizationLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimizationLayer_NonfunctionalRequirements() {
		return (EReference)optimizationLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptimizationLayer_Runtime() {
		return (EAttribute)optimizationLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectiveValue() {
		return objectiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveValue_Cost() {
		return (EAttribute)objectiveValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveValue_Availability() {
		return (EAttribute)objectiveValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveValue_Performance() {
		return (EAttribute)objectiveValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptimizationSolution() {
		return optimizationSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptimizationSolution_Objectives() {
		return (EReference)optimizationSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptimizationSolution_Decisions() {
		return (EAttribute)optimizationSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptimizationObjective() {
		return optimizationObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptimizationObjective_Kind() {
		return (EAttribute)optimizationObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOptimizationObjective_Property() {
		return (EAttribute)optimizationObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountObjective() {
		return countObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurableObjective() {
		return measurableObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtOptimizationObjective() {
		return extOptimizationObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimizationFactory getOptimizationFactory() {
		return (OptimizationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		optimizationLayerEClass = createEClass(OPTIMIZATION_LAYER);
		createEReference(optimizationLayerEClass, OPTIMIZATION_LAYER__STARTING_HINT);
		createEReference(optimizationLayerEClass, OPTIMIZATION_LAYER__SOLUTIONS);
		createEReference(optimizationLayerEClass, OPTIMIZATION_LAYER__OBJECTIVES);
		createEReference(optimizationLayerEClass, OPTIMIZATION_LAYER__NONFUNCTIONAL_REQUIREMENTS);
		createEAttribute(optimizationLayerEClass, OPTIMIZATION_LAYER__RUNTIME);

		objectiveValueEClass = createEClass(OBJECTIVE_VALUE);
		createEAttribute(objectiveValueEClass, OBJECTIVE_VALUE__COST);
		createEAttribute(objectiveValueEClass, OBJECTIVE_VALUE__AVAILABILITY);
		createEAttribute(objectiveValueEClass, OBJECTIVE_VALUE__PERFORMANCE);

		optimizationSolutionEClass = createEClass(OPTIMIZATION_SOLUTION);
		createEReference(optimizationSolutionEClass, OPTIMIZATION_SOLUTION__OBJECTIVES);
		createEAttribute(optimizationSolutionEClass, OPTIMIZATION_SOLUTION__DECISIONS);

		optimizationObjectiveEClass = createEClass(OPTIMIZATION_OBJECTIVE);
		createEAttribute(optimizationObjectiveEClass, OPTIMIZATION_OBJECTIVE__KIND);
		createEAttribute(optimizationObjectiveEClass, OPTIMIZATION_OBJECTIVE__PROPERTY);

		countObjectiveEClass = createEClass(COUNT_OBJECTIVE);

		measurableObjectiveEClass = createEClass(MEASURABLE_OBJECTIVE);

		extOptimizationObjectiveEClass = createEClass(EXT_OPTIMIZATION_OBJECTIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optimizationLayerEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		optimizationSolutionEClass.getESuperTypes().add(theCommonsPackage.getConfiguration());
		optimizationObjectiveEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		countObjectiveEClass.getESuperTypes().add(this.getOptimizationObjective());
		measurableObjectiveEClass.getESuperTypes().add(this.getOptimizationObjective());
		extOptimizationObjectiveEClass.getESuperTypes().add(this.getOptimizationObjective());
		extOptimizationObjectiveEClass.getESuperTypes().add(theCommonsPackage.getExtensionElement());

		// Initialize classes and features; add operations and parameters
		initEClass(optimizationLayerEClass, OptimizationLayer.class, "OptimizationLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimizationLayer_StartingHint(), theCommonsPackage.getConfiguration(), null, "startingHint", null, 0, 1, OptimizationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizationLayer_Solutions(), this.getOptimizationSolution(), null, "solutions", null, 0, -1, OptimizationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizationLayer_Objectives(), this.getOptimizationObjective(), null, "objectives", null, 0, -1, OptimizationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizationLayer_NonfunctionalRequirements(), theCommonsPackage.getRequirement(), null, "nonfunctionalRequirements", null, 0, -1, OptimizationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationLayer_Runtime(), ecorePackage.getEFloatObject(), "runtime", null, 0, 1, OptimizationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveValueEClass, ObjectiveValue.class, "ObjectiveValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveValue_Cost(), ecorePackage.getEFloatObject(), "cost", null, 0, 1, ObjectiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectiveValue_Availability(), ecorePackage.getEFloatObject(), "availability", null, 0, 1, ObjectiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectiveValue_Performance(), ecorePackage.getEFloatObject(), "performance", null, 0, 1, ObjectiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimizationSolutionEClass, OptimizationSolution.class, "OptimizationSolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimizationSolution_Objectives(), this.getObjectiveValue(), null, "objectives", null, 0, 1, OptimizationSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationSolution_Decisions(), ecorePackage.getEString(), "decisions", null, 0, -1, OptimizationSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimizationObjectiveEClass, OptimizationObjective.class, "OptimizationObjective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimizationObjective_Kind(), ecorePackage.getEString(), "kind", "Max", 1, 1, OptimizationObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationObjective_Property(), ecorePackage.getEString(), "property", null, 0, 1, OptimizationObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countObjectiveEClass, CountObjective.class, "CountObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurableObjectiveEClass, MeasurableObjective.class, "MeasurableObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extOptimizationObjectiveEClass, ExtOptimizationObjective.class, "ExtOptimizationObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OptimizationPackageImpl

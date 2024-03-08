/**
 */
package eu.piacere.doml.doml.application.impl;

import eu.piacere.doml.doml.application.ApplicationComponent;
import eu.piacere.doml.doml.application.ApplicationFactory;
import eu.piacere.doml.doml.application.ApplicationLayer;
import eu.piacere.doml.doml.application.ApplicationPackage;
import eu.piacere.doml.doml.application.ExtApplicationComponent;
import eu.piacere.doml.doml.application.SaaS;
import eu.piacere.doml.doml.application.SaaSDBMS;
import eu.piacere.doml.doml.application.SoftwareComponent;
import eu.piacere.doml.doml.application.SoftwareInterface;

import eu.piacere.doml.doml.commons.CommonsPackage;

import eu.piacere.doml.doml.commons.impl.CommonsPackageImpl;

import eu.piacere.doml.doml.concrete.ConcretePackage;

import eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl;

import eu.piacere.doml.doml.optimization.OptimizationPackage;

import eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl;

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
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saaSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saaSDBMSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extApplicationComponentEClass = null;

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
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationPackageImpl() {
		super(eNS_URI, ApplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationPackage init() {
		if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredApplicationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ApplicationPackageImpl theApplicationPackage = registeredApplicationPackage instanceof ApplicationPackageImpl ? (ApplicationPackageImpl)registeredApplicationPackage : new ApplicationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);
		ConcretePackageImpl theConcretePackage = (ConcretePackageImpl)(registeredPackage instanceof ConcretePackageImpl ? registeredPackage : ConcretePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);
		OptimizationPackageImpl theOptimizationPackage = (OptimizationPackageImpl)(registeredPackage instanceof OptimizationPackageImpl ? registeredPackage : OptimizationPackage.eINSTANCE);

		// Create package meta-data objects
		theApplicationPackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theConcretePackage.createPackageContents();
		theOptimizationPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationPackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theConcretePackage.initializePackageContents();
		theOptimizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
		return theApplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationLayer() {
		return applicationLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplicationLayer_Components() {
		return (EReference)applicationLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareComponent() {
		return softwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_IsPersistent() {
		return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_LicenseCost() {
		return (EAttribute)softwareComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_ExposedInterfaces() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_ConsumedInterfaces() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftwareComponent_Src() {
		return (EReference)softwareComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDBMS() {
		return dbmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaaS() {
		return saaSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaaS_LicenseCost() {
		return (EAttribute)saaSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSaaS_ExposedInterfaces() {
		return (EReference)saaSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSaaSDBMS() {
		return saaSDBMSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaaSDBMS_DatabaseName() {
		return (EAttribute)saaSDBMSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaaSDBMS_Engine() {
		return (EAttribute)saaSDBMSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSaaSDBMS_EngineVersion() {
		return (EAttribute)saaSDBMSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareInterface() {
		return softwareInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareInterface_EndPoint() {
		return (EAttribute)softwareInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtApplicationComponent() {
		return extApplicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationFactory getApplicationFactory() {
		return (ApplicationFactory)getEFactoryInstance();
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
		applicationLayerEClass = createEClass(APPLICATION_LAYER);
		createEReference(applicationLayerEClass, APPLICATION_LAYER__COMPONENTS);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);

		softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__IS_PERSISTENT);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__LICENSE_COST);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__EXPOSED_INTERFACES);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__CONSUMED_INTERFACES);
		createEReference(softwareComponentEClass, SOFTWARE_COMPONENT__SRC);

		dbmsEClass = createEClass(DBMS);

		saaSEClass = createEClass(SAA_S);
		createEAttribute(saaSEClass, SAA_S__LICENSE_COST);
		createEReference(saaSEClass, SAA_S__EXPOSED_INTERFACES);

		saaSDBMSEClass = createEClass(SAA_SDBMS);
		createEAttribute(saaSDBMSEClass, SAA_SDBMS__DATABASE_NAME);
		createEAttribute(saaSDBMSEClass, SAA_SDBMS__ENGINE);
		createEAttribute(saaSDBMSEClass, SAA_SDBMS__ENGINE_VERSION);

		softwareInterfaceEClass = createEClass(SOFTWARE_INTERFACE);
		createEAttribute(softwareInterfaceEClass, SOFTWARE_INTERFACE__END_POINT);

		extApplicationComponentEClass = createEClass(EXT_APPLICATION_COMPONENT);
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
		applicationLayerEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		applicationComponentEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		applicationComponentEClass.getESuperTypes().add(theCommonsPackage.getDeployableElement());
		softwareComponentEClass.getESuperTypes().add(this.getApplicationComponent());
		dbmsEClass.getESuperTypes().add(this.getSoftwareComponent());
		saaSEClass.getESuperTypes().add(this.getApplicationComponent());
		saaSDBMSEClass.getESuperTypes().add(this.getSaaS());
		softwareInterfaceEClass.getESuperTypes().add(this.getApplicationComponent());
		extApplicationComponentEClass.getESuperTypes().add(this.getApplicationComponent());
		extApplicationComponentEClass.getESuperTypes().add(theCommonsPackage.getExtensionElement());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationLayerEClass, ApplicationLayer.class, "ApplicationLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationLayer_Components(), this.getApplicationComponent(), null, "components", null, 0, -1, ApplicationLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationComponentEClass, ApplicationComponent.class, "ApplicationComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareComponent_IsPersistent(), ecorePackage.getEBooleanObject(), "isPersistent", "false", 0, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareComponent_LicenseCost(), ecorePackage.getEFloatObject(), "licenseCost", null, 0, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_ExposedInterfaces(), this.getSoftwareInterface(), null, "exposedInterfaces", null, 0, -1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_ConsumedInterfaces(), this.getSoftwareInterface(), null, "consumedInterfaces", null, 0, -1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareComponent_Src(), theCommonsPackage.getSource(), null, "src", null, 0, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbmsEClass, eu.piacere.doml.doml.application.DBMS.class, "DBMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(saaSEClass, SaaS.class, "SaaS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaaS_LicenseCost(), ecorePackage.getEFloatObject(), "licenseCost", null, 0, 1, SaaS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaaS_ExposedInterfaces(), this.getSoftwareInterface(), null, "exposedInterfaces", null, 0, -1, SaaS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saaSDBMSEClass, SaaSDBMS.class, "SaaSDBMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaaSDBMS_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, SaaSDBMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaaSDBMS_Engine(), ecorePackage.getEString(), "engine", null, 0, 1, SaaSDBMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSaaSDBMS_EngineVersion(), ecorePackage.getEString(), "engineVersion", null, 0, 1, SaaSDBMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareInterfaceEClass, SoftwareInterface.class, "SoftwareInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareInterface_EndPoint(), ecorePackage.getEString(), "endPoint", null, 0, 1, SoftwareInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extApplicationComponentEClass, ExtApplicationComponent.class, "ExtApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApplicationPackageImpl

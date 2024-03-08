/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;

import eu.piacere.doml.doml.application.impl.ApplicationPackageImpl;

import eu.piacere.doml.doml.commons.CommonsPackage;

import eu.piacere.doml.doml.commons.impl.CommonsPackageImpl;

import eu.piacere.doml.doml.concrete.AutoScalingGroup;
import eu.piacere.doml.doml.concrete.ComputingGroup;
import eu.piacere.doml.doml.concrete.ConcreteElement;
import eu.piacere.doml.doml.concrete.ConcreteFactory;
import eu.piacere.doml.doml.concrete.ConcreteInfrastructure;
import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.ContainerImage;
import eu.piacere.doml.doml.concrete.ExecutionEnvironment;
import eu.piacere.doml.doml.concrete.ExtConcreteElement;
import eu.piacere.doml.doml.concrete.FunctionAsAService;
import eu.piacere.doml.doml.concrete.GenericResource;
import eu.piacere.doml.doml.concrete.Network;
import eu.piacere.doml.doml.concrete.RuntimeProvider;
import eu.piacere.doml.doml.concrete.Storage;
import eu.piacere.doml.doml.concrete.Subnet;
import eu.piacere.doml.doml.concrete.VMImage;
import eu.piacere.doml.doml.concrete.VirtualMachine;

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
public class ConcretePackageImpl extends EPackageImpl implements ConcretePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAsAServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoScalingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extConcreteElementEClass = null;

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
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretePackageImpl() {
		super(eNS_URI, ConcreteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcretePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretePackage init() {
		if (isInited) return (ConcretePackage)EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConcretePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConcretePackageImpl theConcretePackage = registeredConcretePackage instanceof ConcretePackageImpl ? (ConcretePackageImpl)registeredConcretePackage : new ConcretePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);
		OptimizationPackageImpl theOptimizationPackage = (OptimizationPackageImpl)(registeredPackage instanceof OptimizationPackageImpl ? registeredPackage : OptimizationPackage.eINSTANCE);

		// Create package meta-data objects
		theConcretePackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theOptimizationPackage.createPackageContents();

		// Initialize created meta-data
		theConcretePackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theOptimizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretePackage.eNS_URI, theConcretePackage);
		return theConcretePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteInfrastructure() {
		return concreteInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteInfrastructure_Providers() {
		return (EReference)concreteInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeProvider() {
		return runtimeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_Resources() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_Vms() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_ExecutionEnvironments() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_VmImages() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_ContainerImages() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_Networks() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_Storages() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_Faas() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuntimeProvider_AutoScalingGroups() {
		return (EReference)runtimeProviderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteElement() {
		return concreteElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteElement_ResourceName() {
		return (EAttribute)concreteElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteElement_ConfigurationScript() {
		return (EAttribute)concreteElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteElement_Preexisting() {
		return (EAttribute)concreteElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteElement_Refs() {
		return (EReference)concreteElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericResource() {
		return genericResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericResource_Type() {
		return (EAttribute)genericResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualMachine_Vm_type() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_Maps() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVMImage() {
		return vmImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVMImage_Image_name() {
		return (EAttribute)vmImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVMImage_Maps() {
		return (EReference)vmImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerImage() {
		return containerImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerImage_Maps() {
		return (EReference)containerImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEnvironment_Instance_type() {
		return (EAttribute)executionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEnvironment_Storage_type() {
		return (EAttribute)executionEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_Maps() {
		return (EReference)executionEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_Protocol() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetwork_AddressRange() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Subnets() {
		return (EReference)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Maps() {
		return (EReference)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_Maps() {
		return (EReference)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionAsAService() {
		return functionAsAServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionAsAService_Maps() {
		return (EReference)functionAsAServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutoScalingGroup() {
		return autoScalingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_Vm_type() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutoScalingGroup_Maps() {
		return (EReference)autoScalingGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtConcreteElement() {
		return extConcreteElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteFactory getConcreteFactory() {
		return (ConcreteFactory)getEFactoryInstance();
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
		concreteInfrastructureEClass = createEClass(CONCRETE_INFRASTRUCTURE);
		createEReference(concreteInfrastructureEClass, CONCRETE_INFRASTRUCTURE__PROVIDERS);

		runtimeProviderEClass = createEClass(RUNTIME_PROVIDER);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__RESOURCES);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__VMS);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__VM_IMAGES);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__CONTAINER_IMAGES);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__NETWORKS);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__STORAGES);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__FAAS);
		createEReference(runtimeProviderEClass, RUNTIME_PROVIDER__AUTO_SCALING_GROUPS);

		concreteElementEClass = createEClass(CONCRETE_ELEMENT);
		createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__RESOURCE_NAME);
		createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__CONFIGURATION_SCRIPT);
		createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__PREEXISTING);
		createEReference(concreteElementEClass, CONCRETE_ELEMENT__REFS);

		genericResourceEClass = createEClass(GENERIC_RESOURCE);
		createEAttribute(genericResourceEClass, GENERIC_RESOURCE__TYPE);

		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__VM_TYPE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__MAPS);

		vmImageEClass = createEClass(VM_IMAGE);
		createEAttribute(vmImageEClass, VM_IMAGE__IMAGE_NAME);
		createEReference(vmImageEClass, VM_IMAGE__MAPS);

		containerImageEClass = createEClass(CONTAINER_IMAGE);
		createEReference(containerImageEClass, CONTAINER_IMAGE__MAPS);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__INSTANCE_TYPE);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__STORAGE_TYPE);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__MAPS);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__PROTOCOL);
		createEAttribute(networkEClass, NETWORK__ADDRESS_RANGE);
		createEReference(networkEClass, NETWORK__SUBNETS);
		createEReference(networkEClass, NETWORK__MAPS);

		subnetEClass = createEClass(SUBNET);

		storageEClass = createEClass(STORAGE);
		createEReference(storageEClass, STORAGE__MAPS);

		functionAsAServiceEClass = createEClass(FUNCTION_AS_ASERVICE);
		createEReference(functionAsAServiceEClass, FUNCTION_AS_ASERVICE__MAPS);

		autoScalingGroupEClass = createEClass(AUTO_SCALING_GROUP);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__VM_TYPE);
		createEReference(autoScalingGroupEClass, AUTO_SCALING_GROUP__MAPS);

		extConcreteElementEClass = createEClass(EXT_CONCRETE_ELEMENT);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		concreteInfrastructureEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		runtimeProviderEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		concreteElementEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		genericResourceEClass.getESuperTypes().add(this.getConcreteElement());
		virtualMachineEClass.getESuperTypes().add(this.getConcreteElement());
		vmImageEClass.getESuperTypes().add(this.getConcreteElement());
		containerImageEClass.getESuperTypes().add(this.getConcreteElement());
		executionEnvironmentEClass.getESuperTypes().add(this.getConcreteElement());
		networkEClass.getESuperTypes().add(this.getConcreteElement());
		subnetEClass.getESuperTypes().add(this.getNetwork());
		storageEClass.getESuperTypes().add(this.getConcreteElement());
		functionAsAServiceEClass.getESuperTypes().add(this.getConcreteElement());
		autoScalingGroupEClass.getESuperTypes().add(this.getConcreteElement());
		extConcreteElementEClass.getESuperTypes().add(this.getConcreteElement());
		extConcreteElementEClass.getESuperTypes().add(theCommonsPackage.getExtensionElement());

		// Initialize classes and features; add operations and parameters
		initEClass(concreteInfrastructureEClass, ConcreteInfrastructure.class, "ConcreteInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcreteInfrastructure_Providers(), this.getRuntimeProvider(), null, "providers", null, 0, -1, ConcreteInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeProviderEClass, RuntimeProvider.class, "RuntimeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeProvider_Resources(), this.getGenericResource(), null, "resources", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_Vms(), this.getVirtualMachine(), null, "vms", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_ExecutionEnvironments(), this.getExecutionEnvironment(), null, "executionEnvironments", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_VmImages(), this.getVMImage(), null, "vmImages", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_ContainerImages(), this.getContainerImage(), null, "containerImages", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_Networks(), this.getNetwork(), null, "networks", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_Storages(), this.getStorage(), null, "storages", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_Faas(), this.getFunctionAsAService(), null, "faas", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeProvider_AutoScalingGroups(), this.getAutoScalingGroup(), null, "autoScalingGroups", null, 0, -1, RuntimeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteElementEClass, ConcreteElement.class, "ConcreteElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteElement_ResourceName(), ecorePackage.getEString(), "resourceName", null, 0, 1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteElement_ConfigurationScript(), ecorePackage.getEString(), "configurationScript", null, 0, 1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteElement_Preexisting(), ecorePackage.getEBooleanObject(), "preexisting", "false", 0, 1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteElement_Refs(), this.getConcreteElement(), null, "refs", null, 0, -1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericResourceEClass, GenericResource.class, "GenericResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericResource_Type(), ecorePackage.getEString(), "type", null, 0, 1, GenericResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachine_Vm_type(), ecorePackage.getEString(), "vm_type", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Maps(), theInfrastructurePackage.getVirtualMachine(), null, "maps", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmImageEClass, VMImage.class, "VMImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVMImage_Image_name(), ecorePackage.getEString(), "image_name", null, 0, 1, VMImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVMImage_Maps(), theInfrastructurePackage.getVMImage(), null, "maps", null, 0, 1, VMImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerImageEClass, ContainerImage.class, "ContainerImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerImage_Maps(), theInfrastructurePackage.getContainerImage(), null, "maps", null, 0, 1, ContainerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionEnvironment_Instance_type(), ecorePackage.getEString(), "instance_type", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionEnvironment_Storage_type(), ecorePackage.getEString(), "storage_type", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_Maps(), theInfrastructurePackage.getExecutionEnvironment(), null, "maps", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_AddressRange(), ecorePackage.getEString(), "addressRange", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Subnets(), this.getSubnet(), null, "subnets", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Maps(), theInfrastructurePackage.getNetwork(), null, "maps", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorage_Maps(), theInfrastructurePackage.getStorage(), null, "maps", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionAsAServiceEClass, FunctionAsAService.class, "FunctionAsAService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionAsAService_Maps(), theInfrastructurePackage.getFunctionAsAService(), null, "maps", null, 0, 1, FunctionAsAService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoScalingGroupEClass, AutoScalingGroup.class, "AutoScalingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoScalingGroup_Vm_type(), ecorePackage.getEString(), "vm_type", null, 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutoScalingGroup_Maps(), theInfrastructurePackage.getAutoScalingGroup(), null, "maps", null, 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extConcreteElementEClass, ExtConcreteElement.class, "ExtConcreteElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ConcretePackageImpl

/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.*;

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
public class ConcreteFactoryImpl extends EFactoryImpl implements ConcreteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcreteFactory init() {
		try {
			ConcreteFactory theConcreteFactory = (ConcreteFactory)EPackage.Registry.INSTANCE.getEFactory(ConcretePackage.eNS_URI);
			if (theConcreteFactory != null) {
				return theConcreteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConcreteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteFactoryImpl() {
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
			case ConcretePackage.CONCRETE_INFRASTRUCTURE: return createConcreteInfrastructure();
			case ConcretePackage.RUNTIME_PROVIDER: return createRuntimeProvider();
			case ConcretePackage.GENERIC_RESOURCE: return createGenericResource();
			case ConcretePackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case ConcretePackage.VM_IMAGE: return createVMImage();
			case ConcretePackage.CONTAINER_IMAGE: return createContainerImage();
			case ConcretePackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case ConcretePackage.NETWORK: return createNetwork();
			case ConcretePackage.SUBNET: return createSubnet();
			case ConcretePackage.STORAGE: return createStorage();
			case ConcretePackage.FUNCTION_AS_ASERVICE: return createFunctionAsAService();
			case ConcretePackage.AUTO_SCALING_GROUP: return createAutoScalingGroup();
			case ConcretePackage.EXT_CONCRETE_ELEMENT: return createExtConcreteElement();
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
	public ConcreteInfrastructure createConcreteInfrastructure() {
		ConcreteInfrastructureImpl concreteInfrastructure = new ConcreteInfrastructureImpl();
		return concreteInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeProvider createRuntimeProvider() {
		RuntimeProviderImpl runtimeProvider = new RuntimeProviderImpl();
		return runtimeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericResource createGenericResource() {
		GenericResourceImpl genericResource = new GenericResourceImpl();
		return genericResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachine createVirtualMachine() {
		VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VMImage createVMImage() {
		VMImageImpl vmImage = new VMImageImpl();
		return vmImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerImage createContainerImage() {
		ContainerImageImpl containerImage = new ContainerImageImpl();
		return containerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionAsAService createFunctionAsAService() {
		FunctionAsAServiceImpl functionAsAService = new FunctionAsAServiceImpl();
		return functionAsAService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoScalingGroup createAutoScalingGroup() {
		AutoScalingGroupImpl autoScalingGroup = new AutoScalingGroupImpl();
		return autoScalingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtConcreteElement createExtConcreteElement() {
		ExtConcreteElementImpl extConcreteElement = new ExtConcreteElementImpl();
		return extConcreteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcretePackage getConcretePackage() {
		return (ConcretePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConcretePackage getPackage() {
		return ConcretePackage.eINSTANCE;
	}

} //ConcreteFactoryImpl

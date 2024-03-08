/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InfrastructureFactoryImpl extends EFactoryImpl implements InfrastructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureFactory init() {
		try {
			InfrastructureFactory theInfrastructureFactory = (InfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(InfrastructurePackage.eNS_URI);
			if (theInfrastructureFactory != null) {
				return theInfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactoryImpl() {
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
			case InfrastructurePackage.INFRASTRUCTURE_LAYER: return createInfrastructureLayer();
			case InfrastructurePackage.MONITORING_RULE: return createMonitoringRule();
			case InfrastructurePackage.AUTO_SCALING_GROUP: return createAutoScalingGroup();
			case InfrastructurePackage.RULE: return createRule();
			case InfrastructurePackage.SECURITY_GROUP: return createSecurityGroup();
			case InfrastructurePackage.VM_IMAGE: return createVMImage();
			case InfrastructurePackage.CONTAINER_IMAGE: return createContainerImage();
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE: return createPhysicalComputingNode();
			case InfrastructurePackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case InfrastructurePackage.LOCATION: return createLocation();
			case InfrastructurePackage.CONTAINER_CONFIG: return createContainerConfig();
			case InfrastructurePackage.CONTAINER_HOST_CONFIG: return createContainerHostConfig();
			case InfrastructurePackage.CONTAINER: return createContainer();
			case InfrastructurePackage.CONTAINER_GROUP: return createContainerGroup();
			case InfrastructurePackage.CONTAINER_NETWORK: return createContainerNetwork();
			case InfrastructurePackage.CONTAINER_VOLUME: return createContainerVolume();
			case InfrastructurePackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
			case InfrastructurePackage.NETWORK: return createNetwork();
			case InfrastructurePackage.SUBNET: return createSubnet();
			case InfrastructurePackage.NETWORK_INTERFACE: return createNetworkInterface();
			case InfrastructurePackage.INTERNET_GATEWAY: return createInternetGateway();
			case InfrastructurePackage.STORAGE: return createStorage();
			case InfrastructurePackage.FUNCTION_AS_ASERVICE: return createFunctionAsAService();
			case InfrastructurePackage.SWARM_ROLE: return createSwarmRole();
			case InfrastructurePackage.SWARM: return createSwarm();
			case InfrastructurePackage.EXT_INFRASTRUCTURE_ELEMENT: return createExtInfrastructureElement();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.LOAD_BALANCER_KIND:
				return createLoadBalancerKindFromString(eDataType, initialValue);
			case InfrastructurePackage.RULE_KIND:
				return createRuleKindFromString(eDataType, initialValue);
			case InfrastructurePackage.GENERATOR_KIND:
				return createGeneratorKindFromString(eDataType, initialValue);
			case InfrastructurePackage.ROLE_KIND:
				return createRoleKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.LOAD_BALANCER_KIND:
				return convertLoadBalancerKindToString(eDataType, instanceValue);
			case InfrastructurePackage.RULE_KIND:
				return convertRuleKindToString(eDataType, instanceValue);
			case InfrastructurePackage.GENERATOR_KIND:
				return convertGeneratorKindToString(eDataType, instanceValue);
			case InfrastructurePackage.ROLE_KIND:
				return convertRoleKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureLayer createInfrastructureLayer() {
		InfrastructureLayerImpl infrastructureLayer = new InfrastructureLayerImpl();
		return infrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringRule createMonitoringRule() {
		MonitoringRuleImpl monitoringRule = new MonitoringRuleImpl();
		return monitoringRule;
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
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
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
	public PhysicalComputingNode createPhysicalComputingNode() {
		PhysicalComputingNodeImpl physicalComputingNode = new PhysicalComputingNodeImpl();
		return physicalComputingNode;
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
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerConfig createContainerConfig() {
		ContainerConfigImpl containerConfig = new ContainerConfigImpl();
		return containerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerHostConfig createContainerHostConfig() {
		ContainerHostConfigImpl containerHostConfig = new ContainerHostConfigImpl();
		return containerHostConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerGroup createContainerGroup() {
		ContainerGroupImpl containerGroup = new ContainerGroupImpl();
		return containerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerNetwork createContainerNetwork() {
		ContainerNetworkImpl containerNetwork = new ContainerNetworkImpl();
		return containerNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerVolume createContainerVolume() {
		ContainerVolumeImpl containerVolume = new ContainerVolumeImpl();
		return containerVolume;
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
	public NetworkInterface createNetworkInterface() {
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternetGateway createInternetGateway() {
		InternetGatewayImpl internetGateway = new InternetGatewayImpl();
		return internetGateway;
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
	public SwarmRole createSwarmRole() {
		SwarmRoleImpl swarmRole = new SwarmRoleImpl();
		return swarmRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Swarm createSwarm() {
		SwarmImpl swarm = new SwarmImpl();
		return swarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtInfrastructureElement createExtInfrastructureElement() {
		ExtInfrastructureElementImpl extInfrastructureElement = new ExtInfrastructureElementImpl();
		return extInfrastructureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerKind createLoadBalancerKindFromString(EDataType eDataType, String initialValue) {
		LoadBalancerKind result = LoadBalancerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadBalancerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleKind createRuleKindFromString(EDataType eDataType, String initialValue) {
		RuleKind result = RuleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorKind createGeneratorKindFromString(EDataType eDataType, String initialValue) {
		GeneratorKind result = GeneratorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleKind createRoleKindFromString(EDataType eDataType, String initialValue) {
		RoleKind result = RoleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructurePackage getInfrastructurePackage() {
		return (InfrastructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfrastructurePackage getPackage() {
		return InfrastructurePackage.eINSTANCE;
	}

} //InfrastructureFactoryImpl

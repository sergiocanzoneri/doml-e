/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;

import eu.piacere.doml.doml.application.impl.ApplicationPackageImpl;

import eu.piacere.doml.doml.commons.CommonsPackage;

import eu.piacere.doml.doml.commons.impl.CommonsPackageImpl;

import eu.piacere.doml.doml.concrete.ConcretePackage;

import eu.piacere.doml.doml.concrete.impl.ConcretePackageImpl;

import eu.piacere.doml.doml.infrastructure.AutoScalingGroup;
import eu.piacere.doml.doml.infrastructure.AvailabilityGroup;
import eu.piacere.doml.doml.infrastructure.ComputingGroup;
import eu.piacere.doml.doml.infrastructure.ComputingNode;
import eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator;
import eu.piacere.doml.doml.infrastructure.ContainerConfig;
import eu.piacere.doml.doml.infrastructure.ContainerGroup;
import eu.piacere.doml.doml.infrastructure.ContainerHostConfig;
import eu.piacere.doml.doml.infrastructure.ContainerImage;
import eu.piacere.doml.doml.infrastructure.ContainerNetwork;
import eu.piacere.doml.doml.infrastructure.ContainerVolume;
import eu.piacere.doml.doml.infrastructure.ExecutionEnvironment;
import eu.piacere.doml.doml.infrastructure.ExtInfrastructureElement;
import eu.piacere.doml.doml.infrastructure.FunctionAsAService;
import eu.piacere.doml.doml.infrastructure.GeneratorKind;
import eu.piacere.doml.doml.infrastructure.InfrastructureElement;
import eu.piacere.doml.doml.infrastructure.InfrastructureFactory;
import eu.piacere.doml.doml.infrastructure.InfrastructureLayer;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.InternetGateway;
import eu.piacere.doml.doml.infrastructure.LoadBalancerKind;
import eu.piacere.doml.doml.infrastructure.Location;
import eu.piacere.doml.doml.infrastructure.MonitoringRule;
import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.Node;
import eu.piacere.doml.doml.infrastructure.PhysicalComputingNode;
import eu.piacere.doml.doml.infrastructure.RoleKind;
import eu.piacere.doml.doml.infrastructure.Rule;
import eu.piacere.doml.doml.infrastructure.RuleKind;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;
import eu.piacere.doml.doml.infrastructure.Storage;
import eu.piacere.doml.doml.infrastructure.Subnet;
import eu.piacere.doml.doml.infrastructure.Swarm;
import eu.piacere.doml.doml.infrastructure.SwarmRole;
import eu.piacere.doml.doml.infrastructure.VMImage;
import eu.piacere.doml.doml.infrastructure.VirtualMachine;

import eu.piacere.doml.doml.optimization.OptimizationPackage;

import eu.piacere.doml.doml.optimization.impl.OptimizationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingGroupEClass = null;

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
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingNodeGeneratorEClass = null;

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
	private EClass physicalComputingNodeEClass = null;

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
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerHostConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerVolumeEClass = null;

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
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internetGatewayEClass = null;

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
	private EClass swarmRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extInfrastructureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loadBalancerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleKindEEnum = null;

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
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited) return (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInfrastructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = registeredInfrastructurePackage instanceof InfrastructurePackageImpl ? (InfrastructurePackageImpl)registeredInfrastructurePackage : new InfrastructurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		CommonsPackageImpl theCommonsPackage = (CommonsPackageImpl)(registeredPackage instanceof CommonsPackageImpl ? registeredPackage : CommonsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);
		ConcretePackageImpl theConcretePackage = (ConcretePackageImpl)(registeredPackage instanceof ConcretePackageImpl ? registeredPackage : ConcretePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OptimizationPackage.eNS_URI);
		OptimizationPackageImpl theOptimizationPackage = (OptimizationPackageImpl)(registeredPackage instanceof OptimizationPackageImpl ? registeredPackage : OptimizationPackage.eINSTANCE);

		// Create package meta-data objects
		theInfrastructurePackage.createPackageContents();
		theCommonsPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theConcretePackage.createPackageContents();
		theOptimizationPackage.createPackageContents();

		// Initialize created meta-data
		theInfrastructurePackage.initializePackageContents();
		theCommonsPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theConcretePackage.initializePackageContents();
		theOptimizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInfrastructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureLayer() {
		return infrastructureLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Nodes() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Generators() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Storages() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Faas() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Credentials() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_ExecutionEnvironments() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Groups() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_SecurityGroups() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Networks() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureLayer_Rules() {
		return (EReference)infrastructureLayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringRule() {
		return monitoringRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Condition() {
		return (EAttribute)monitoringRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Strategy() {
		return (EAttribute)monitoringRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_StrategyConfigurationString() {
		return (EAttribute)monitoringRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingGroup() {
		return computingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingGroup_GroupedNodes() {
		return (EReference)computingGroupEClass.getEStructuralFeatures().get(0);
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
	public EReference getAutoScalingGroup_MachineDefinition() {
		return (EReference)autoScalingGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_Min() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_Max() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutoScalingGroup_LoadBalancer() {
		return (EAttribute)autoScalingGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Kind() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Protocol() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_FromPort() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_ToPort() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Cidr() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroup() {
		return securityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityGroup_Rules() {
		return (EReference)securityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityGroup_Ifaces() {
		return (EReference)securityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureElement() {
		return infrastructureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Ifaces() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingNode() {
		return computingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Architecture() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Os() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Memory_mb() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Storage() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Cpu_count() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_Cost() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingNode_Location() {
		return (EReference)computingNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingNode_Credentials() {
		return (EReference)computingNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingNode_Group() {
		return (EReference)computingNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingNode_NodeSpecificMonitoring() {
		return (EReference)computingNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNode_DisabledMonitorings() {
		return (EAttribute)computingNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingNodeGenerator() {
		return computingNodeGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNodeGenerator_Uri() {
		return (EAttribute)computingNodeGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingNodeGenerator_Kind() {
		return (EAttribute)computingNodeGeneratorEClass.getEStructuralFeatures().get(1);
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
	public EReference getVMImage_GeneratedVMs() {
		return (EReference)vmImageEClass.getEStructuralFeatures().get(0);
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
	public EReference getContainerImage_GeneratedContainers() {
		return (EReference)containerImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalComputingNode() {
		return physicalComputingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysicalComputingNode_ConfigInterface() {
		return (EReference)physicalComputingNodeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getVirtualMachine_SizeDescription() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_GeneratedFrom() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_ConfigInterface() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Region() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Zone() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerConfig() {
		return containerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerConfig_Container_port() {
		return (EAttribute)containerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerConfig_Vm_port() {
		return (EAttribute)containerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerConfig_Iface() {
		return (EReference)containerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerHostConfig() {
		return containerHostConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerHostConfig_Environment_variables() {
		return (EReference)containerHostConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerHostConfig_Host() {
		return (EReference)containerHostConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerHostConfig_Configurations() {
		return (EReference)containerHostConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_GeneratedFrom() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_HostConfigs() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Networks() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Volumes() {
		return (EReference)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_DependsOn() {
		return (EReference)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerGroup() {
		return containerGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerGroup_Services() {
		return (EReference)containerGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerGroup_Networks() {
		return (EReference)containerGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerGroup_Volumes() {
		return (EReference)containerGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerNetwork() {
		return containerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerNetwork_ContainerNetworkName() {
		return (EAttribute)containerNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerVolume() {
		return containerVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerVolume_ContainerVolumeName() {
		return (EAttribute)containerVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerVolume_Path() {
		return (EAttribute)containerVolumeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getExecutionEnvironment_Size() {
		return (EAttribute)executionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEnvironment_MaxSize() {
		return (EAttribute)executionEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_Location() {
		return (EReference)executionEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_Network() {
		return (EReference)executionEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_SecurityGroups() {
		return (EReference)executionEnvironmentEClass.getEStructuralFeatures().get(4);
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
	public EReference getNetwork_ConnectedIfaces() {
		return (EReference)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Gateways() {
		return (EReference)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetwork_Subnets() {
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
	public EReference getSubnet_ConnectedTo() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterface() {
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_Speed() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_EndPoint() {
		return (EAttribute)networkInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkInterface_BelongsTo() {
		return (EReference)networkInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkInterface_Associated() {
		return (EReference)networkInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternetGateway() {
		return internetGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternetGateway_Address() {
		return (EAttribute)internetGatewayEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getStorage_Label() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorage_Size_gb() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorage_Cost() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFunctionAsAService_Cost() {
		return (EAttribute)functionAsAServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwarmRole() {
		return swarmRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwarmRole_Kind() {
		return (EAttribute)swarmRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwarmRole_Nodes() {
		return (EReference)swarmRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwarm() {
		return swarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwarm_Roles() {
		return (EReference)swarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtInfrastructureElement() {
		return extInfrastructureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLoadBalancerKind() {
		return loadBalancerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRuleKind() {
		return ruleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeneratorKind() {
		return generatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRoleKind() {
		return roleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory)getEFactoryInstance();
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
		infrastructureLayerEClass = createEClass(INFRASTRUCTURE_LAYER);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__NODES);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__GENERATORS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__STORAGES);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__FAAS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__CREDENTIALS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__GROUPS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__SECURITY_GROUPS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__NETWORKS);
		createEReference(infrastructureLayerEClass, INFRASTRUCTURE_LAYER__RULES);

		monitoringRuleEClass = createEClass(MONITORING_RULE);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__CONDITION);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__STRATEGY);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__STRATEGY_CONFIGURATION_STRING);

		computingGroupEClass = createEClass(COMPUTING_GROUP);
		createEReference(computingGroupEClass, COMPUTING_GROUP__GROUPED_NODES);

		autoScalingGroupEClass = createEClass(AUTO_SCALING_GROUP);
		createEReference(autoScalingGroupEClass, AUTO_SCALING_GROUP__MACHINE_DEFINITION);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__MIN);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__MAX);
		createEAttribute(autoScalingGroupEClass, AUTO_SCALING_GROUP__LOAD_BALANCER);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__KIND);
		createEAttribute(ruleEClass, RULE__PROTOCOL);
		createEAttribute(ruleEClass, RULE__FROM_PORT);
		createEAttribute(ruleEClass, RULE__TO_PORT);
		createEAttribute(ruleEClass, RULE__CIDR);

		securityGroupEClass = createEClass(SECURITY_GROUP);
		createEReference(securityGroupEClass, SECURITY_GROUP__RULES);
		createEReference(securityGroupEClass, SECURITY_GROUP__IFACES);

		infrastructureElementEClass = createEClass(INFRASTRUCTURE_ELEMENT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__IFACES);

		computingNodeEClass = createEClass(COMPUTING_NODE);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__ARCHITECTURE);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__OS);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__MEMORY_MB);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__STORAGE);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__CPU_COUNT);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__COST);
		createEReference(computingNodeEClass, COMPUTING_NODE__LOCATION);
		createEReference(computingNodeEClass, COMPUTING_NODE__CREDENTIALS);
		createEReference(computingNodeEClass, COMPUTING_NODE__GROUP);
		createEReference(computingNodeEClass, COMPUTING_NODE__NODE_SPECIFIC_MONITORING);
		createEAttribute(computingNodeEClass, COMPUTING_NODE__DISABLED_MONITORINGS);

		computingNodeGeneratorEClass = createEClass(COMPUTING_NODE_GENERATOR);
		createEAttribute(computingNodeGeneratorEClass, COMPUTING_NODE_GENERATOR__URI);
		createEAttribute(computingNodeGeneratorEClass, COMPUTING_NODE_GENERATOR__KIND);

		vmImageEClass = createEClass(VM_IMAGE);
		createEReference(vmImageEClass, VM_IMAGE__GENERATED_VMS);

		containerImageEClass = createEClass(CONTAINER_IMAGE);
		createEReference(containerImageEClass, CONTAINER_IMAGE__GENERATED_CONTAINERS);

		physicalComputingNodeEClass = createEClass(PHYSICAL_COMPUTING_NODE);
		createEReference(physicalComputingNodeEClass, PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE);

		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__SIZE_DESCRIPTION);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__GENERATED_FROM);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__CONFIG_INTERFACE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__REGION);
		createEAttribute(locationEClass, LOCATION__ZONE);

		containerConfigEClass = createEClass(CONTAINER_CONFIG);
		createEAttribute(containerConfigEClass, CONTAINER_CONFIG__CONTAINER_PORT);
		createEAttribute(containerConfigEClass, CONTAINER_CONFIG__VM_PORT);
		createEReference(containerConfigEClass, CONTAINER_CONFIG__IFACE);

		containerHostConfigEClass = createEClass(CONTAINER_HOST_CONFIG);
		createEReference(containerHostConfigEClass, CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES);
		createEReference(containerHostConfigEClass, CONTAINER_HOST_CONFIG__HOST);
		createEReference(containerHostConfigEClass, CONTAINER_HOST_CONFIG__CONFIGURATIONS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__GENERATED_FROM);
		createEReference(containerEClass, CONTAINER__HOST_CONFIGS);
		createEReference(containerEClass, CONTAINER__NETWORKS);
		createEReference(containerEClass, CONTAINER__VOLUMES);
		createEReference(containerEClass, CONTAINER__DEPENDS_ON);

		containerGroupEClass = createEClass(CONTAINER_GROUP);
		createEReference(containerGroupEClass, CONTAINER_GROUP__SERVICES);
		createEReference(containerGroupEClass, CONTAINER_GROUP__NETWORKS);
		createEReference(containerGroupEClass, CONTAINER_GROUP__VOLUMES);

		containerNetworkEClass = createEClass(CONTAINER_NETWORK);
		createEAttribute(containerNetworkEClass, CONTAINER_NETWORK__CONTAINER_NETWORK_NAME);

		containerVolumeEClass = createEClass(CONTAINER_VOLUME);
		createEAttribute(containerVolumeEClass, CONTAINER_VOLUME__CONTAINER_VOLUME_NAME);
		createEAttribute(containerVolumeEClass, CONTAINER_VOLUME__PATH);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__SIZE);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__MAX_SIZE);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__LOCATION);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__NETWORK);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__SECURITY_GROUPS);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__PROTOCOL);
		createEReference(networkEClass, NETWORK__CONNECTED_IFACES);
		createEReference(networkEClass, NETWORK__GATEWAYS);
		createEReference(networkEClass, NETWORK__SUBNETS);

		subnetEClass = createEClass(SUBNET);
		createEReference(subnetEClass, SUBNET__CONNECTED_TO);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__SPEED);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__END_POINT);
		createEReference(networkInterfaceEClass, NETWORK_INTERFACE__BELONGS_TO);
		createEReference(networkInterfaceEClass, NETWORK_INTERFACE__ASSOCIATED);

		internetGatewayEClass = createEClass(INTERNET_GATEWAY);
		createEAttribute(internetGatewayEClass, INTERNET_GATEWAY__ADDRESS);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__LABEL);
		createEAttribute(storageEClass, STORAGE__SIZE_GB);
		createEAttribute(storageEClass, STORAGE__COST);

		functionAsAServiceEClass = createEClass(FUNCTION_AS_ASERVICE);
		createEAttribute(functionAsAServiceEClass, FUNCTION_AS_ASERVICE__COST);

		swarmRoleEClass = createEClass(SWARM_ROLE);
		createEAttribute(swarmRoleEClass, SWARM_ROLE__KIND);
		createEReference(swarmRoleEClass, SWARM_ROLE__NODES);

		swarmEClass = createEClass(SWARM);
		createEReference(swarmEClass, SWARM__ROLES);

		extInfrastructureElementEClass = createEClass(EXT_INFRASTRUCTURE_ELEMENT);

		// Create enums
		loadBalancerKindEEnum = createEEnum(LOAD_BALANCER_KIND);
		ruleKindEEnum = createEEnum(RULE_KIND);
		generatorKindEEnum = createEEnum(GENERATOR_KIND);
		roleKindEEnum = createEEnum(ROLE_KIND);
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
		infrastructureLayerEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		monitoringRuleEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		computingGroupEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		autoScalingGroupEClass.getESuperTypes().add(this.getComputingGroup());
		ruleEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		securityGroupEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		infrastructureElementEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		infrastructureElementEClass.getESuperTypes().add(theCommonsPackage.getDeployableElement());
		nodeEClass.getESuperTypes().add(this.getInfrastructureElement());
		computingNodeEClass.getESuperTypes().add(this.getNode());
		computingNodeGeneratorEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		vmImageEClass.getESuperTypes().add(this.getComputingNodeGenerator());
		containerImageEClass.getESuperTypes().add(this.getComputingNodeGenerator());
		physicalComputingNodeEClass.getESuperTypes().add(this.getComputingNode());
		virtualMachineEClass.getESuperTypes().add(this.getComputingNode());
		locationEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		containerConfigEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		containerHostConfigEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		containerEClass.getESuperTypes().add(this.getComputingNode());
		containerGroupEClass.getESuperTypes().add(this.getComputingGroup());
		containerNetworkEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		containerVolumeEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		executionEnvironmentEClass.getESuperTypes().add(this.getInfrastructureElement());
		networkEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		subnetEClass.getESuperTypes().add(this.getNetwork());
		networkInterfaceEClass.getESuperTypes().add(this.getInfrastructureElement());
		internetGatewayEClass.getESuperTypes().add(this.getNode());
		storageEClass.getESuperTypes().add(this.getInfrastructureElement());
		functionAsAServiceEClass.getESuperTypes().add(this.getInfrastructureElement());
		swarmRoleEClass.getESuperTypes().add(theCommonsPackage.getDOMLElement());
		swarmEClass.getESuperTypes().add(this.getComputingGroup());
		extInfrastructureElementEClass.getESuperTypes().add(this.getInfrastructureElement());
		extInfrastructureElementEClass.getESuperTypes().add(theCommonsPackage.getExtensionElement());

		// Initialize classes and features; add operations and parameters
		initEClass(infrastructureLayerEClass, InfrastructureLayer.class, "InfrastructureLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureLayer_Nodes(), this.getComputingNode(), null, "nodes", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Generators(), this.getComputingNodeGenerator(), null, "generators", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Storages(), this.getStorage(), null, "storages", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Faas(), this.getFunctionAsAService(), null, "faas", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Credentials(), theCommonsPackage.getCredentials(), null, "credentials", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_ExecutionEnvironments(), this.getExecutionEnvironment(), null, "executionEnvironments", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Groups(), this.getComputingGroup(), null, "groups", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Networks(), this.getNetwork(), null, "networks", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureLayer_Rules(), this.getMonitoringRule(), null, "rules", null, 0, -1, InfrastructureLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitoringRuleEClass, MonitoringRule.class, "MonitoringRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitoringRule_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_Strategy(), ecorePackage.getEString(), "strategy", null, 1, 1, MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_StrategyConfigurationString(), ecorePackage.getEString(), "strategyConfigurationString", null, 0, 1, MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingGroupEClass, ComputingGroup.class, "ComputingGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingGroup_GroupedNodes(), this.getComputingNode(), this.getComputingNode_Group(), "groupedNodes", null, 0, -1, ComputingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoScalingGroupEClass, AutoScalingGroup.class, "AutoScalingGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutoScalingGroup_MachineDefinition(), this.getVirtualMachine(), null, "machineDefinition", null, 1, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoScalingGroup_Min(), ecorePackage.getEIntegerObject(), "min", "1", 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoScalingGroup_Max(), ecorePackage.getEIntegerObject(), "max", "1", 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoScalingGroup_LoadBalancer(), this.getLoadBalancerKind(), "loadBalancer", "DEFAULT", 0, 1, AutoScalingGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Kind(), this.getRuleKind(), "kind", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_FromPort(), ecorePackage.getEIntegerObject(), "fromPort", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ToPort(), ecorePackage.getEIntegerObject(), "toPort", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Cidr(), ecorePackage.getEString(), "cidr", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupEClass, SecurityGroup.class, "SecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityGroup_Rules(), this.getRule(), null, "rules", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityGroup_Ifaces(), this.getNetworkInterface(), this.getNetworkInterface_Associated(), "ifaces", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureElementEClass, InfrastructureElement.class, "InfrastructureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Ifaces(), this.getNetworkInterface(), null, "ifaces", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingNodeEClass, ComputingNode.class, "ComputingNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingNode_Architecture(), ecorePackage.getEString(), "architecture", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_Os(), ecorePackage.getEString(), "os", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_Memory_mb(), ecorePackage.getEFloatObject(), "memory_mb", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_Storage(), ecorePackage.getEFloatObject(), "storage", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_Cpu_count(), ecorePackage.getEIntegerObject(), "cpu_count", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_Cost(), ecorePackage.getEFloatObject(), "cost", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingNode_Location(), this.getLocation(), null, "location", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingNode_Credentials(), theCommonsPackage.getCredentials(), null, "credentials", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingNode_Group(), this.getComputingGroup(), this.getComputingGroup_GroupedNodes(), "group", null, 0, 1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputingNode_NodeSpecificMonitoring(), this.getMonitoringRule(), null, "nodeSpecificMonitoring", null, 0, -1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNode_DisabledMonitorings(), ecorePackage.getEString(), "disabledMonitorings", null, 0, -1, ComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computingNodeGeneratorEClass, ComputingNodeGenerator.class, "ComputingNodeGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingNodeGenerator_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ComputingNodeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputingNodeGenerator_Kind(), this.getGeneratorKind(), "kind", null, 0, 1, ComputingNodeGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmImageEClass, VMImage.class, "VMImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMImage_GeneratedVMs(), this.getVirtualMachine(), this.getVirtualMachine_GeneratedFrom(), "generatedVMs", null, 0, -1, VMImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerImageEClass, ContainerImage.class, "ContainerImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerImage_GeneratedContainers(), this.getContainer(), this.getContainer_GeneratedFrom(), "generatedContainers", null, 0, -1, ContainerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComputingNodeEClass, PhysicalComputingNode.class, "PhysicalComputingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalComputingNode_ConfigInterface(), this.getNetworkInterface(), null, "configInterface", null, 0, 1, PhysicalComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachine_SizeDescription(), ecorePackage.getEString(), "sizeDescription", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_GeneratedFrom(), this.getVMImage(), this.getVMImage_GeneratedVMs(), "generatedFrom", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_ConfigInterface(), this.getNetworkInterface(), null, "configInterface", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Region(), ecorePackage.getEString(), "region", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Zone(), ecorePackage.getEString(), "zone", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerConfigEClass, ContainerConfig.class, "ContainerConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerConfig_Container_port(), ecorePackage.getEIntegerObject(), "container_port", null, 0, 1, ContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerConfig_Vm_port(), ecorePackage.getEIntegerObject(), "vm_port", null, 0, 1, ContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerConfig_Iface(), this.getNetworkInterface(), null, "iface", null, 0, 1, ContainerConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerHostConfigEClass, ContainerHostConfig.class, "ContainerHostConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerHostConfig_Environment_variables(), theCommonsPackage.getSProperty(), null, "environment_variables", null, 0, -1, ContainerHostConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerHostConfig_Host(), this.getComputingNode(), null, "host", null, 0, 1, ContainerHostConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerHostConfig_Configurations(), this.getContainerConfig(), null, "configurations", null, 0, -1, ContainerHostConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, eu.piacere.doml.doml.infrastructure.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_GeneratedFrom(), this.getContainerImage(), this.getContainerImage_GeneratedContainers(), "generatedFrom", null, 0, 1, eu.piacere.doml.doml.infrastructure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_HostConfigs(), this.getContainerHostConfig(), null, "hostConfigs", null, 0, -1, eu.piacere.doml.doml.infrastructure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Networks(), this.getContainerNetwork(), null, "networks", null, 0, -1, eu.piacere.doml.doml.infrastructure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Volumes(), this.getContainerVolume(), null, "volumes", null, 0, -1, eu.piacere.doml.doml.infrastructure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_DependsOn(), this.getContainer(), null, "dependsOn", null, 0, -1, eu.piacere.doml.doml.infrastructure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerGroupEClass, ContainerGroup.class, "ContainerGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerGroup_Services(), this.getContainer(), null, "services", null, 1, -1, ContainerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerGroup_Networks(), this.getContainerNetwork(), null, "networks", null, 0, -1, ContainerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerGroup_Volumes(), this.getContainerVolume(), null, "volumes", null, 0, -1, ContainerGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerNetworkEClass, ContainerNetwork.class, "ContainerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerNetwork_ContainerNetworkName(), ecorePackage.getEString(), "containerNetworkName", null, 0, 1, ContainerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerVolumeEClass, ContainerVolume.class, "ContainerVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerVolume_ContainerVolumeName(), ecorePackage.getEString(), "containerVolumeName", null, 0, 1, ContainerVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerVolume_Path(), ecorePackage.getEString(), "path", null, 0, 1, ContainerVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionEnvironment_Size(), ecorePackage.getEFloatObject(), "size", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionEnvironment_MaxSize(), ecorePackage.getEFloatObject(), "maxSize", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_Location(), this.getLocation(), null, "location", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_Network(), this.getNetwork(), null, "network", null, 0, 1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_SecurityGroups(), this.getSecurityGroup(), null, "securityGroups", null, 0, -1, ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Protocol(), ecorePackage.getEString(), "protocol", "TCP/IP", 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_ConnectedIfaces(), this.getNetworkInterface(), this.getNetworkInterface_BelongsTo(), "connectedIfaces", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Gateways(), this.getInternetGateway(), null, "gateways", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_Subnets(), this.getSubnet(), null, "subnets", null, 0, -1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubnet_ConnectedTo(), this.getSubnet(), null, "connectedTo", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInterface_Speed(), ecorePackage.getEString(), "speed", null, 0, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_EndPoint(), ecorePackage.getEString(), "endPoint", null, 0, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterface_BelongsTo(), this.getNetwork(), this.getNetwork_ConnectedIfaces(), "belongsTo", null, 0, 1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkInterface_Associated(), this.getSecurityGroup(), this.getSecurityGroup_Ifaces(), "associated", null, 0, -1, NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internetGatewayEClass, InternetGateway.class, "InternetGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternetGateway_Address(), ecorePackage.getEString(), "address", null, 0, 1, InternetGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_Label(), ecorePackage.getEString(), "label", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Size_gb(), ecorePackage.getEInt(), "size_gb", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Cost(), ecorePackage.getEFloatObject(), "cost", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionAsAServiceEClass, FunctionAsAService.class, "FunctionAsAService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionAsAService_Cost(), ecorePackage.getEFloatObject(), "cost", null, 0, 1, FunctionAsAService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swarmRoleEClass, SwarmRole.class, "SwarmRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwarmRole_Kind(), this.getRoleKind(), "kind", null, 0, 1, SwarmRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwarmRole_Nodes(), this.getComputingNode(), null, "nodes", null, 0, -1, SwarmRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swarmEClass, Swarm.class, "Swarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwarm_Roles(), this.getSwarmRole(), null, "roles", null, 0, -1, Swarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extInfrastructureElementEClass, ExtInfrastructureElement.class, "ExtInfrastructureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(loadBalancerKindEEnum, LoadBalancerKind.class, "LoadBalancerKind");
		addEEnumLiteral(loadBalancerKindEEnum, LoadBalancerKind.DEFAULT);
		addEEnumLiteral(loadBalancerKindEEnum, LoadBalancerKind.INTERNAL);
		addEEnumLiteral(loadBalancerKindEEnum, LoadBalancerKind.EXTERNAL);

		initEEnum(ruleKindEEnum, RuleKind.class, "RuleKind");
		addEEnumLiteral(ruleKindEEnum, RuleKind.EGRESS);
		addEEnumLiteral(ruleKindEEnum, RuleKind.INGRESS);

		initEEnum(generatorKindEEnum, GeneratorKind.class, "GeneratorKind");
		addEEnumLiteral(generatorKindEEnum, GeneratorKind.SCRIPT);
		addEEnumLiteral(generatorKindEEnum, GeneratorKind.IMAGE);

		initEEnum(roleKindEEnum, RoleKind.class, "RoleKind");
		addEEnumLiteral(roleKindEEnum, RoleKind.NONE);
		addEEnumLiteral(roleKindEEnum, RoleKind.MANAGER);
		addEEnumLiteral(roleKindEEnum, RoleKind.WORKER);
		addEEnumLiteral(roleKindEEnum, RoleKind.MASTER);

		// Create resource
		createResource(eNS_URI);
	}

} //InfrastructurePackageImpl

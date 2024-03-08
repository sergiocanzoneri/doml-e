/**
 */
package eu.piacere.doml.doml.infrastructure.util;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.DeployableElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.infrastructure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
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
	protected InfrastructureSwitch<Adapter> modelSwitch =
		new InfrastructureSwitch<Adapter>() {
			@Override
			public Adapter caseInfrastructureLayer(InfrastructureLayer object) {
				return createInfrastructureLayerAdapter();
			}
			@Override
			public Adapter caseMonitoringRule(MonitoringRule object) {
				return createMonitoringRuleAdapter();
			}
			@Override
			public Adapter caseComputingGroup(ComputingGroup object) {
				return createComputingGroupAdapter();
			}
			@Override
			public Adapter caseAutoScalingGroup(AutoScalingGroup object) {
				return createAutoScalingGroupAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseSecurityGroup(SecurityGroup object) {
				return createSecurityGroupAdapter();
			}
			@Override
			public Adapter caseInfrastructureElement(InfrastructureElement object) {
				return createInfrastructureElementAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseComputingNode(ComputingNode object) {
				return createComputingNodeAdapter();
			}
			@Override
			public Adapter caseComputingNodeGenerator(ComputingNodeGenerator object) {
				return createComputingNodeGeneratorAdapter();
			}
			@Override
			public Adapter caseVMImage(VMImage object) {
				return createVMImageAdapter();
			}
			@Override
			public Adapter caseContainerImage(ContainerImage object) {
				return createContainerImageAdapter();
			}
			@Override
			public Adapter casePhysicalComputingNode(PhysicalComputingNode object) {
				return createPhysicalComputingNodeAdapter();
			}
			@Override
			public Adapter caseVirtualMachine(VirtualMachine object) {
				return createVirtualMachineAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseContainerConfig(ContainerConfig object) {
				return createContainerConfigAdapter();
			}
			@Override
			public Adapter caseContainerHostConfig(ContainerHostConfig object) {
				return createContainerHostConfigAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseContainerGroup(ContainerGroup object) {
				return createContainerGroupAdapter();
			}
			@Override
			public Adapter caseContainerNetwork(ContainerNetwork object) {
				return createContainerNetworkAdapter();
			}
			@Override
			public Adapter caseContainerVolume(ContainerVolume object) {
				return createContainerVolumeAdapter();
			}
			@Override
			public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
				return createExecutionEnvironmentAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseSubnet(Subnet object) {
				return createSubnetAdapter();
			}
			@Override
			public Adapter caseNetworkInterface(NetworkInterface object) {
				return createNetworkInterfaceAdapter();
			}
			@Override
			public Adapter caseInternetGateway(InternetGateway object) {
				return createInternetGatewayAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseFunctionAsAService(FunctionAsAService object) {
				return createFunctionAsAServiceAdapter();
			}
			@Override
			public Adapter caseSwarmRole(SwarmRole object) {
				return createSwarmRoleAdapter();
			}
			@Override
			public Adapter caseSwarm(Swarm object) {
				return createSwarmAdapter();
			}
			@Override
			public Adapter caseExtInfrastructureElement(ExtInfrastructureElement object) {
				return createExtInfrastructureElementAdapter();
			}
			@Override
			public Adapter caseDOMLElement(DOMLElement object) {
				return createDOMLElementAdapter();
			}
			@Override
			public Adapter caseDeployableElement(DeployableElement object) {
				return createDeployableElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer
	 * @generated
	 */
	public Adapter createInfrastructureLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule <em>Monitoring Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.MonitoringRule
	 * @generated
	 */
	public Adapter createMonitoringRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ComputingGroup <em>Computing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingGroup
	 * @generated
	 */
	public Adapter createComputingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup
	 * @generated
	 */
	public Adapter createAutoScalingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.SecurityGroup
	 * @generated
	 */
	public Adapter createSecurityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.InfrastructureElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureElement
	 * @generated
	 */
	public Adapter createInfrastructureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ComputingNode <em>Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode
	 * @generated
	 */
	public Adapter createComputingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator <em>Computing Node Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator
	 * @generated
	 */
	public Adapter createComputingNodeGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.VMImage <em>VM Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.VMImage
	 * @generated
	 */
	public Adapter createVMImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerImage <em>Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerImage
	 * @generated
	 */
	public Adapter createContainerImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.PhysicalComputingNode <em>Physical Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.PhysicalComputingNode
	 * @generated
	 */
	public Adapter createPhysicalComputingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig <em>Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerConfig
	 * @generated
	 */
	public Adapter createContainerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig <em>Container Host Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerHostConfig
	 * @generated
	 */
	public Adapter createContainerHostConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerGroup <em>Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerGroup
	 * @generated
	 */
	public Adapter createContainerGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerNetwork <em>Container Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerNetwork
	 * @generated
	 */
	public Adapter createContainerNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume <em>Container Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerVolume
	 * @generated
	 */
	public Adapter createContainerVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Subnet
	 * @generated
	 */
	public Adapter createSubnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface
	 * @generated
	 */
	public Adapter createNetworkInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.InternetGateway
	 * @generated
	 */
	public Adapter createInternetGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.FunctionAsAService <em>Function As AService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.FunctionAsAService
	 * @generated
	 */
	public Adapter createFunctionAsAServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.SwarmRole <em>Swarm Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.SwarmRole
	 * @generated
	 */
	public Adapter createSwarmRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.Swarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.Swarm
	 * @generated
	 */
	public Adapter createSwarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.infrastructure.ExtInfrastructureElement <em>Ext Infrastructure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.infrastructure.ExtInfrastructureElement
	 * @generated
	 */
	public Adapter createExtInfrastructureElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link eu.piacere.doml.doml.commons.DeployableElement <em>Deployable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.piacere.doml.doml.commons.DeployableElement
	 * @generated
	 */
	public Adapter createDeployableElementAdapter() {
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

} //InfrastructureAdapterFactory

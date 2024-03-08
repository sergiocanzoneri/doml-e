/**
 */
package eu.piacere.doml.doml.infrastructure.util;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.DeployableElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import eu.piacere.doml.doml.infrastructure.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSwitch() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER: {
				InfrastructureLayer infrastructureLayer = (InfrastructureLayer)theEObject;
				T result = caseInfrastructureLayer(infrastructureLayer);
				if (result == null) result = caseDOMLElement(infrastructureLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.MONITORING_RULE: {
				MonitoringRule monitoringRule = (MonitoringRule)theEObject;
				T result = caseMonitoringRule(monitoringRule);
				if (result == null) result = caseDOMLElement(monitoringRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.COMPUTING_GROUP: {
				ComputingGroup computingGroup = (ComputingGroup)theEObject;
				T result = caseComputingGroup(computingGroup);
				if (result == null) result = caseDOMLElement(computingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.AUTO_SCALING_GROUP: {
				AutoScalingGroup autoScalingGroup = (AutoScalingGroup)theEObject;
				T result = caseAutoScalingGroup(autoScalingGroup);
				if (result == null) result = caseComputingGroup(autoScalingGroup);
				if (result == null) result = caseDOMLElement(autoScalingGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseDOMLElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.SECURITY_GROUP: {
				SecurityGroup securityGroup = (SecurityGroup)theEObject;
				T result = caseSecurityGroup(securityGroup);
				if (result == null) result = caseDOMLElement(securityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.INFRASTRUCTURE_ELEMENT: {
				InfrastructureElement infrastructureElement = (InfrastructureElement)theEObject;
				T result = caseInfrastructureElement(infrastructureElement);
				if (result == null) result = caseDOMLElement(infrastructureElement);
				if (result == null) result = caseDeployableElement(infrastructureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseInfrastructureElement(node);
				if (result == null) result = caseDOMLElement(node);
				if (result == null) result = caseDeployableElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.COMPUTING_NODE: {
				ComputingNode computingNode = (ComputingNode)theEObject;
				T result = caseComputingNode(computingNode);
				if (result == null) result = caseNode(computingNode);
				if (result == null) result = caseInfrastructureElement(computingNode);
				if (result == null) result = caseDOMLElement(computingNode);
				if (result == null) result = caseDeployableElement(computingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.COMPUTING_NODE_GENERATOR: {
				ComputingNodeGenerator computingNodeGenerator = (ComputingNodeGenerator)theEObject;
				T result = caseComputingNodeGenerator(computingNodeGenerator);
				if (result == null) result = caseDOMLElement(computingNodeGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.VM_IMAGE: {
				VMImage vmImage = (VMImage)theEObject;
				T result = caseVMImage(vmImage);
				if (result == null) result = caseComputingNodeGenerator(vmImage);
				if (result == null) result = caseDOMLElement(vmImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_IMAGE: {
				ContainerImage containerImage = (ContainerImage)theEObject;
				T result = caseContainerImage(containerImage);
				if (result == null) result = caseComputingNodeGenerator(containerImage);
				if (result == null) result = caseDOMLElement(containerImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE: {
				PhysicalComputingNode physicalComputingNode = (PhysicalComputingNode)theEObject;
				T result = casePhysicalComputingNode(physicalComputingNode);
				if (result == null) result = caseComputingNode(physicalComputingNode);
				if (result == null) result = caseNode(physicalComputingNode);
				if (result == null) result = caseInfrastructureElement(physicalComputingNode);
				if (result == null) result = caseDOMLElement(physicalComputingNode);
				if (result == null) result = caseDeployableElement(physicalComputingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				T result = caseVirtualMachine(virtualMachine);
				if (result == null) result = caseComputingNode(virtualMachine);
				if (result == null) result = caseNode(virtualMachine);
				if (result == null) result = caseInfrastructureElement(virtualMachine);
				if (result == null) result = caseDOMLElement(virtualMachine);
				if (result == null) result = caseDeployableElement(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDOMLElement(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_CONFIG: {
				ContainerConfig containerConfig = (ContainerConfig)theEObject;
				T result = caseContainerConfig(containerConfig);
				if (result == null) result = caseDOMLElement(containerConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_HOST_CONFIG: {
				ContainerHostConfig containerHostConfig = (ContainerHostConfig)theEObject;
				T result = caseContainerHostConfig(containerHostConfig);
				if (result == null) result = caseDOMLElement(containerHostConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseComputingNode(container);
				if (result == null) result = caseNode(container);
				if (result == null) result = caseInfrastructureElement(container);
				if (result == null) result = caseDOMLElement(container);
				if (result == null) result = caseDeployableElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_GROUP: {
				ContainerGroup containerGroup = (ContainerGroup)theEObject;
				T result = caseContainerGroup(containerGroup);
				if (result == null) result = caseComputingGroup(containerGroup);
				if (result == null) result = caseDOMLElement(containerGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_NETWORK: {
				ContainerNetwork containerNetwork = (ContainerNetwork)theEObject;
				T result = caseContainerNetwork(containerNetwork);
				if (result == null) result = caseDOMLElement(containerNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.CONTAINER_VOLUME: {
				ContainerVolume containerVolume = (ContainerVolume)theEObject;
				T result = caseContainerVolume(containerVolume);
				if (result == null) result = caseDOMLElement(containerVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.EXECUTION_ENVIRONMENT: {
				ExecutionEnvironment executionEnvironment = (ExecutionEnvironment)theEObject;
				T result = caseExecutionEnvironment(executionEnvironment);
				if (result == null) result = caseInfrastructureElement(executionEnvironment);
				if (result == null) result = caseDOMLElement(executionEnvironment);
				if (result == null) result = caseDeployableElement(executionEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseDOMLElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.SUBNET: {
				Subnet subnet = (Subnet)theEObject;
				T result = caseSubnet(subnet);
				if (result == null) result = caseNetwork(subnet);
				if (result == null) result = caseDOMLElement(subnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.NETWORK_INTERFACE: {
				NetworkInterface networkInterface = (NetworkInterface)theEObject;
				T result = caseNetworkInterface(networkInterface);
				if (result == null) result = caseInfrastructureElement(networkInterface);
				if (result == null) result = caseDOMLElement(networkInterface);
				if (result == null) result = caseDeployableElement(networkInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.INTERNET_GATEWAY: {
				InternetGateway internetGateway = (InternetGateway)theEObject;
				T result = caseInternetGateway(internetGateway);
				if (result == null) result = caseNode(internetGateway);
				if (result == null) result = caseInfrastructureElement(internetGateway);
				if (result == null) result = caseDOMLElement(internetGateway);
				if (result == null) result = caseDeployableElement(internetGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseInfrastructureElement(storage);
				if (result == null) result = caseDOMLElement(storage);
				if (result == null) result = caseDeployableElement(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.FUNCTION_AS_ASERVICE: {
				FunctionAsAService functionAsAService = (FunctionAsAService)theEObject;
				T result = caseFunctionAsAService(functionAsAService);
				if (result == null) result = caseInfrastructureElement(functionAsAService);
				if (result == null) result = caseDOMLElement(functionAsAService);
				if (result == null) result = caseDeployableElement(functionAsAService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.SWARM_ROLE: {
				SwarmRole swarmRole = (SwarmRole)theEObject;
				T result = caseSwarmRole(swarmRole);
				if (result == null) result = caseDOMLElement(swarmRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.SWARM: {
				Swarm swarm = (Swarm)theEObject;
				T result = caseSwarm(swarm);
				if (result == null) result = caseComputingGroup(swarm);
				if (result == null) result = caseDOMLElement(swarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.EXT_INFRASTRUCTURE_ELEMENT: {
				ExtInfrastructureElement extInfrastructureElement = (ExtInfrastructureElement)theEObject;
				T result = caseExtInfrastructureElement(extInfrastructureElement);
				if (result == null) result = caseInfrastructureElement(extInfrastructureElement);
				if (result == null) result = caseExtensionElement(extInfrastructureElement);
				if (result == null) result = caseDOMLElement(extInfrastructureElement);
				if (result == null) result = caseDeployableElement(extInfrastructureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureLayer(InfrastructureLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringRule(MonitoringRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingGroup(ComputingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Scaling Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoScalingGroup(AutoScalingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroup(SecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureElement(InfrastructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingNode(ComputingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Node Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Node Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingNodeGenerator(ComputingNodeGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMImage(VMImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerImage(ContainerImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Computing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalComputingNode(PhysicalComputingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerConfig(ContainerConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Host Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Host Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerHostConfig(ContainerHostConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerGroup(ContainerGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerNetwork(ContainerNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerVolume(ContainerVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnet(Subnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internet Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internet Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternetGateway(InternetGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function As AService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function As AService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAsAService(FunctionAsAService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarmRole(SwarmRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwarm(Swarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Infrastructure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Infrastructure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtInfrastructureElement(ExtInfrastructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMLElement(DOMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableElement(DeployableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElement(ExtensionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfrastructureSwitch

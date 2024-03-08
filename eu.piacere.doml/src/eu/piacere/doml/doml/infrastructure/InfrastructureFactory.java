/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage
 * @generated
 */
public interface InfrastructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructureFactory eINSTANCE = eu.piacere.doml.doml.infrastructure.impl.InfrastructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	InfrastructureLayer createInfrastructureLayer();

	/**
	 * Returns a new object of class '<em>Monitoring Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring Rule</em>'.
	 * @generated
	 */
	MonitoringRule createMonitoringRule();

	/**
	 * Returns a new object of class '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Scaling Group</em>'.
	 * @generated
	 */
	AutoScalingGroup createAutoScalingGroup();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	SecurityGroup createSecurityGroup();

	/**
	 * Returns a new object of class '<em>VM Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Image</em>'.
	 * @generated
	 */
	VMImage createVMImage();

	/**
	 * Returns a new object of class '<em>Container Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Image</em>'.
	 * @generated
	 */
	ContainerImage createContainerImage();

	/**
	 * Returns a new object of class '<em>Physical Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Computing Node</em>'.
	 * @generated
	 */
	PhysicalComputingNode createPhysicalComputingNode();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Container Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Config</em>'.
	 * @generated
	 */
	ContainerConfig createContainerConfig();

	/**
	 * Returns a new object of class '<em>Container Host Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Host Config</em>'.
	 * @generated
	 */
	ContainerHostConfig createContainerHostConfig();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Container Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Group</em>'.
	 * @generated
	 */
	ContainerGroup createContainerGroup();

	/**
	 * Returns a new object of class '<em>Container Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Network</em>'.
	 * @generated
	 */
	ContainerNetwork createContainerNetwork();

	/**
	 * Returns a new object of class '<em>Container Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Volume</em>'.
	 * @generated
	 */
	ContainerVolume createContainerVolume();

	/**
	 * Returns a new object of class '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Environment</em>'.
	 * @generated
	 */
	ExecutionEnvironment createExecutionEnvironment();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subnet</em>'.
	 * @generated
	 */
	Subnet createSubnet();

	/**
	 * Returns a new object of class '<em>Network Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Interface</em>'.
	 * @generated
	 */
	NetworkInterface createNetworkInterface();

	/**
	 * Returns a new object of class '<em>Internet Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internet Gateway</em>'.
	 * @generated
	 */
	InternetGateway createInternetGateway();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Function As AService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function As AService</em>'.
	 * @generated
	 */
	FunctionAsAService createFunctionAsAService();

	/**
	 * Returns a new object of class '<em>Swarm Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swarm Role</em>'.
	 * @generated
	 */
	SwarmRole createSwarmRole();

	/**
	 * Returns a new object of class '<em>Swarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swarm</em>'.
	 * @generated
	 */
	Swarm createSwarm();

	/**
	 * Returns a new object of class '<em>Ext Infrastructure Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Infrastructure Element</em>'.
	 * @generated
	 */
	ExtInfrastructureElement createExtInfrastructureElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfrastructurePackage getInfrastructurePackage();

} //InfrastructureFactory

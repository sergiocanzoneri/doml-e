/**
 */
package eu.piacere.doml.doml.concrete;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.concrete.ConcretePackage
 * @generated
 */
public interface ConcreteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcreteFactory eINSTANCE = eu.piacere.doml.doml.concrete.impl.ConcreteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	ConcreteInfrastructure createConcreteInfrastructure();

	/**
	 * Returns a new object of class '<em>Runtime Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Provider</em>'.
	 * @generated
	 */
	RuntimeProvider createRuntimeProvider();

	/**
	 * Returns a new object of class '<em>Generic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Resource</em>'.
	 * @generated
	 */
	GenericResource createGenericResource();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

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
	 * Returns a new object of class '<em>Auto Scaling Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Scaling Group</em>'.
	 * @generated
	 */
	AutoScalingGroup createAutoScalingGroup();

	/**
	 * Returns a new object of class '<em>Ext Concrete Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Concrete Element</em>'.
	 * @generated
	 */
	ExtConcreteElement createExtConcreteElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConcretePackage getConcretePackage();

} //ConcreteFactory

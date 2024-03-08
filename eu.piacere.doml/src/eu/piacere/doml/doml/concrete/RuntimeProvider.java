/**
 */
package eu.piacere.doml.doml.concrete;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getResources <em>Resources</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getVms <em>Vms</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getExecutionEnvironments <em>Execution Environments</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getVmImages <em>Vm Images</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getContainerImages <em>Container Images</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getStorages <em>Storages</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getFaas <em>Faas</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.RuntimeProvider#getAutoScalingGroups <em>Auto Scaling Groups</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider()
 * @model
 * @generated
 */
public interface RuntimeProvider extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.GenericResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericResource> getResources();

	/**
	 * Returns the value of the '<em><b>Vms</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vms</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_Vms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMachine> getVms();

	/**
	 * Returns the value of the '<em><b>Execution Environments</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.ExecutionEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environments</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_ExecutionEnvironments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionEnvironment> getExecutionEnvironments();

	/**
	 * Returns the value of the '<em><b>Vm Images</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.VMImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Images</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_VmImages()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMImage> getVmImages();

	/**
	 * Returns the value of the '<em><b>Container Images</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.ContainerImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Images</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_ContainerImages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerImage> getContainerImages();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Storages</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.Storage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storages</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_Storages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Storage> getStorages();

	/**
	 * Returns the value of the '<em><b>Faas</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.FunctionAsAService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faas</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_Faas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionAsAService> getFaas();

	/**
	 * Returns the value of the '<em><b>Auto Scaling Groups</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.AutoScalingGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Scaling Groups</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getRuntimeProvider_AutoScalingGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutoScalingGroup> getAutoScalingGroups();

} // RuntimeProvider

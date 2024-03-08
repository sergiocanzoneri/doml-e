/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.Credentials;
import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNodes <em>Nodes</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGenerators <em>Generators</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getStorages <em>Storages</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getFaas <em>Faas</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getExecutionEnvironments <em>Execution Environments</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGroups <em>Groups</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getSecurityGroups <em>Security Groups</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer()
 * @model
 * @generated
 */
public interface InfrastructureLayer extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ComputingNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputingNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Generators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputingNodeGenerator> getGenerators();

	/**
	 * Returns the value of the '<em><b>Storages</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Storage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storages</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Storages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Storage> getStorages();

	/**
	 * Returns the value of the '<em><b>Faas</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.FunctionAsAService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faas</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Faas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionAsAService> getFaas();

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Credentials}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Credentials> getCredentials();

	/**
	 * Returns the value of the '<em><b>Execution Environments</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environments</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_ExecutionEnvironments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionEnvironment> getExecutionEnvironments();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ComputingGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputingGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Security Groups</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Groups</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_SecurityGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroups();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Network> getNetworks();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.MonitoringRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getInfrastructureLayer_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<MonitoringRule> getRules();

} // InfrastructureLayer

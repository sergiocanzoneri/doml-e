/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.Credentials;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.ComputingGroup;
import eu.piacere.doml.doml.infrastructure.ComputingNode;
import eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator;
import eu.piacere.doml.doml.infrastructure.ExecutionEnvironment;
import eu.piacere.doml.doml.infrastructure.FunctionAsAService;
import eu.piacere.doml.doml.infrastructure.InfrastructureLayer;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.MonitoringRule;
import eu.piacere.doml.doml.infrastructure.Network;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;
import eu.piacere.doml.doml.infrastructure.Storage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getStorages <em>Storages</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getFaas <em>Faas</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getExecutionEnvironments <em>Execution Environments</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getSecurityGroups <em>Security Groups</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureLayerImpl extends DOMLElementImpl implements InfrastructureLayer {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingNode> nodes;

	/**
	 * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerators()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingNodeGenerator> generators;

	/**
	 * The cached value of the '{@link #getStorages() <em>Storages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> storages;

	/**
	 * The cached value of the '{@link #getFaas() <em>Faas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaas()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionAsAService> faas;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected EList<Credentials> credentials;

	/**
	 * The cached value of the '{@link #getExecutionEnvironments() <em>Execution Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEnvironment> executionEnvironments;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingGroup> groups;

	/**
	 * The cached value of the '{@link #getSecurityGroups() <em>Security Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securityGroups;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoringRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.INFRASTRUCTURE_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ComputingNode>(ComputingNode.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingNodeGenerator> getGenerators() {
		if (generators == null) {
			generators = new EObjectContainmentEList<ComputingNodeGenerator>(ComputingNodeGenerator.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS);
		}
		return generators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Storage> getStorages() {
		if (storages == null) {
			storages = new EObjectContainmentEList<Storage>(Storage.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES);
		}
		return storages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionAsAService> getFaas() {
		if (faas == null) {
			faas = new EObjectContainmentEList<FunctionAsAService>(FunctionAsAService.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS);
		}
		return faas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Credentials> getCredentials() {
		if (credentials == null) {
			credentials = new EObjectContainmentEList<Credentials>(Credentials.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS);
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExecutionEnvironment> getExecutionEnvironments() {
		if (executionEnvironments == null) {
			executionEnvironments = new EObjectContainmentEList<ExecutionEnvironment>(ExecutionEnvironment.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS);
		}
		return executionEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<ComputingGroup>(ComputingGroup.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecurityGroups() {
		if (securityGroups == null) {
			securityGroups = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS);
		}
		return securityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonitoringRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<MonitoringRule>(MonitoringRule.class, this, InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES:
				return ((InternalEList<?>)getStorages()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS:
				return ((InternalEList<?>)getFaas()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS:
				return ((InternalEList<?>)getCredentials()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS:
				return ((InternalEList<?>)getExecutionEnvironments()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS:
				return ((InternalEList<?>)getSecurityGroups()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES:
				return getNodes();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS:
				return getGenerators();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES:
				return getStorages();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS:
				return getFaas();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS:
				return getCredentials();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS:
				return getExecutionEnvironments();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS:
				return getGroups();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS:
				return getSecurityGroups();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS:
				return getNetworks();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES:
				return getRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ComputingNode>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends ComputingNodeGenerator>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES:
				getStorages().clear();
				getStorages().addAll((Collection<? extends Storage>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS:
				getFaas().clear();
				getFaas().addAll((Collection<? extends FunctionAsAService>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS:
				getCredentials().clear();
				getCredentials().addAll((Collection<? extends Credentials>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				getExecutionEnvironments().addAll((Collection<? extends ExecutionEnvironment>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ComputingGroup>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS:
				getSecurityGroups().clear();
				getSecurityGroups().addAll((Collection<? extends SecurityGroup>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends MonitoringRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES:
				getNodes().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS:
				getGenerators().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES:
				getStorages().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS:
				getFaas().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS:
				getCredentials().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS:
				getGroups().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS:
				getSecurityGroups().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS:
				getNetworks().clear();
				return;
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES:
				getRules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NODES:
				return nodes != null && !nodes.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GENERATORS:
				return generators != null && !generators.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__STORAGES:
				return storages != null && !storages.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__FAAS:
				return faas != null && !faas.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__CREDENTIALS:
				return credentials != null && !credentials.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS:
				return executionEnvironments != null && !executionEnvironments.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__GROUPS:
				return groups != null && !groups.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__SECURITY_GROUPS:
				return securityGroups != null && !securityGroups.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__NETWORKS:
				return networks != null && !networks.isEmpty();
			case InfrastructurePackage.INFRASTRUCTURE_LAYER__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureLayerImpl

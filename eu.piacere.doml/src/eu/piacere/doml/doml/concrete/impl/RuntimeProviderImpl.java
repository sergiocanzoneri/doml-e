/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.concrete.AutoScalingGroup;
import eu.piacere.doml.doml.concrete.ComputingGroup;
import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.ContainerImage;
import eu.piacere.doml.doml.concrete.ExecutionEnvironment;
import eu.piacere.doml.doml.concrete.FunctionAsAService;
import eu.piacere.doml.doml.concrete.GenericResource;
import eu.piacere.doml.doml.concrete.Network;
import eu.piacere.doml.doml.concrete.RuntimeProvider;
import eu.piacere.doml.doml.concrete.Storage;
import eu.piacere.doml.doml.concrete.VMImage;
import eu.piacere.doml.doml.concrete.VirtualMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getVms <em>Vms</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getExecutionEnvironments <em>Execution Environments</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getVmImages <em>Vm Images</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getContainerImages <em>Container Images</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getStorages <em>Storages</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getFaas <em>Faas</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.RuntimeProviderImpl#getAutoScalingGroups <em>Auto Scaling Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeProviderImpl extends DOMLElementImpl implements RuntimeProvider {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericResource> resources;

	/**
	 * The cached value of the '{@link #getVms() <em>Vms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVms()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachine> vms;

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
	 * The cached value of the '{@link #getVmImages() <em>Vm Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmImages()
	 * @generated
	 * @ordered
	 */
	protected EList<VMImage> vmImages;

	/**
	 * The cached value of the '{@link #getContainerImages() <em>Container Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerImages()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerImage> containerImages;

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
	 * The cached value of the '{@link #getAutoScalingGroups() <em>Auto Scaling Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoScalingGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AutoScalingGroup> autoScalingGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.RUNTIME_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<GenericResource>(GenericResource.class, this, ConcretePackage.RUNTIME_PROVIDER__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualMachine> getVms() {
		if (vms == null) {
			vms = new EObjectContainmentEList<VirtualMachine>(VirtualMachine.class, this, ConcretePackage.RUNTIME_PROVIDER__VMS);
		}
		return vms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExecutionEnvironment> getExecutionEnvironments() {
		if (executionEnvironments == null) {
			executionEnvironments = new EObjectContainmentEList<ExecutionEnvironment>(ExecutionEnvironment.class, this, ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS);
		}
		return executionEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VMImage> getVmImages() {
		if (vmImages == null) {
			vmImages = new EObjectContainmentEList<VMImage>(VMImage.class, this, ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES);
		}
		return vmImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerImage> getContainerImages() {
		if (containerImages == null) {
			containerImages = new EObjectContainmentEList<ContainerImage>(ContainerImage.class, this, ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES);
		}
		return containerImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<Network>(Network.class, this, ConcretePackage.RUNTIME_PROVIDER__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Storage> getStorages() {
		if (storages == null) {
			storages = new EObjectContainmentEList<Storage>(Storage.class, this, ConcretePackage.RUNTIME_PROVIDER__STORAGES);
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
			faas = new EObjectContainmentEList<FunctionAsAService>(FunctionAsAService.class, this, ConcretePackage.RUNTIME_PROVIDER__FAAS);
		}
		return faas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AutoScalingGroup> getAutoScalingGroups() {
		if (autoScalingGroups == null) {
			autoScalingGroups = new EObjectContainmentEList<AutoScalingGroup>(AutoScalingGroup.class, this, ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS);
		}
		return autoScalingGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretePackage.RUNTIME_PROVIDER__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__VMS:
				return ((InternalEList<?>)getVms()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS:
				return ((InternalEList<?>)getExecutionEnvironments()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES:
				return ((InternalEList<?>)getVmImages()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES:
				return ((InternalEList<?>)getContainerImages()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__STORAGES:
				return ((InternalEList<?>)getStorages()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__FAAS:
				return ((InternalEList<?>)getFaas()).basicRemove(otherEnd, msgs);
			case ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS:
				return ((InternalEList<?>)getAutoScalingGroups()).basicRemove(otherEnd, msgs);
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
			case ConcretePackage.RUNTIME_PROVIDER__RESOURCES:
				return getResources();
			case ConcretePackage.RUNTIME_PROVIDER__VMS:
				return getVms();
			case ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS:
				return getExecutionEnvironments();
			case ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES:
				return getVmImages();
			case ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES:
				return getContainerImages();
			case ConcretePackage.RUNTIME_PROVIDER__NETWORKS:
				return getNetworks();
			case ConcretePackage.RUNTIME_PROVIDER__STORAGES:
				return getStorages();
			case ConcretePackage.RUNTIME_PROVIDER__FAAS:
				return getFaas();
			case ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS:
				return getAutoScalingGroups();
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
			case ConcretePackage.RUNTIME_PROVIDER__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends GenericResource>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__VMS:
				getVms().clear();
				getVms().addAll((Collection<? extends VirtualMachine>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				getExecutionEnvironments().addAll((Collection<? extends ExecutionEnvironment>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES:
				getVmImages().clear();
				getVmImages().addAll((Collection<? extends VMImage>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES:
				getContainerImages().clear();
				getContainerImages().addAll((Collection<? extends ContainerImage>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__STORAGES:
				getStorages().clear();
				getStorages().addAll((Collection<? extends Storage>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__FAAS:
				getFaas().clear();
				getFaas().addAll((Collection<? extends FunctionAsAService>)newValue);
				return;
			case ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS:
				getAutoScalingGroups().clear();
				getAutoScalingGroups().addAll((Collection<? extends AutoScalingGroup>)newValue);
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
			case ConcretePackage.RUNTIME_PROVIDER__RESOURCES:
				getResources().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__VMS:
				getVms().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS:
				getExecutionEnvironments().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES:
				getVmImages().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES:
				getContainerImages().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__NETWORKS:
				getNetworks().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__STORAGES:
				getStorages().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__FAAS:
				getFaas().clear();
				return;
			case ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS:
				getAutoScalingGroups().clear();
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
			case ConcretePackage.RUNTIME_PROVIDER__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__VMS:
				return vms != null && !vms.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__EXECUTION_ENVIRONMENTS:
				return executionEnvironments != null && !executionEnvironments.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__VM_IMAGES:
				return vmImages != null && !vmImages.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__CONTAINER_IMAGES:
				return containerImages != null && !containerImages.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__NETWORKS:
				return networks != null && !networks.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__STORAGES:
				return storages != null && !storages.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__FAAS:
				return faas != null && !faas.isEmpty();
			case ConcretePackage.RUNTIME_PROVIDER__AUTO_SCALING_GROUPS:
				return autoScalingGroups != null && !autoScalingGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuntimeProviderImpl

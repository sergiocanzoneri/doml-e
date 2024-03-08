/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.Container;
import eu.piacere.doml.doml.infrastructure.ContainerGroup;
import eu.piacere.doml.doml.infrastructure.ContainerNetwork;
import eu.piacere.doml.doml.infrastructure.ContainerVolume;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl#getServices <em>Services</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl#getVolumes <em>Volumes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerGroupImpl extends ComputingGroupImpl implements ContainerGroup {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> services;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerNetwork> networks;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerVolume> volumes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Container> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Container>(Container.class, this, InfrastructurePackage.CONTAINER_GROUP__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<ContainerNetwork>(ContainerNetwork.class, this, InfrastructurePackage.CONTAINER_GROUP__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerVolume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<ContainerVolume>(ContainerVolume.class, this, InfrastructurePackage.CONTAINER_GROUP__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_GROUP__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.CONTAINER_GROUP__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.CONTAINER_GROUP__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.CONTAINER_GROUP__SERVICES:
				return getServices();
			case InfrastructurePackage.CONTAINER_GROUP__NETWORKS:
				return getNetworks();
			case InfrastructurePackage.CONTAINER_GROUP__VOLUMES:
				return getVolumes();
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
			case InfrastructurePackage.CONTAINER_GROUP__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Container>)newValue);
				return;
			case InfrastructurePackage.CONTAINER_GROUP__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends ContainerNetwork>)newValue);
				return;
			case InfrastructurePackage.CONTAINER_GROUP__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends ContainerVolume>)newValue);
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
			case InfrastructurePackage.CONTAINER_GROUP__SERVICES:
				getServices().clear();
				return;
			case InfrastructurePackage.CONTAINER_GROUP__NETWORKS:
				getNetworks().clear();
				return;
			case InfrastructurePackage.CONTAINER_GROUP__VOLUMES:
				getVolumes().clear();
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
			case InfrastructurePackage.CONTAINER_GROUP__SERVICES:
				return services != null && !services.isEmpty();
			case InfrastructurePackage.CONTAINER_GROUP__NETWORKS:
				return networks != null && !networks.isEmpty();
			case InfrastructurePackage.CONTAINER_GROUP__VOLUMES:
				return volumes != null && !volumes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerGroupImpl

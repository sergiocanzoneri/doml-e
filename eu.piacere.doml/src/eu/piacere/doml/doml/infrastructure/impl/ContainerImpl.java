/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.Container;
import eu.piacere.doml.doml.infrastructure.ContainerConfig;
import eu.piacere.doml.doml.infrastructure.ContainerHostConfig;
import eu.piacere.doml.doml.infrastructure.ContainerImage;
import eu.piacere.doml.doml.infrastructure.ContainerNetwork;
import eu.piacere.doml.doml.infrastructure.ContainerVolume;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl#getGeneratedFrom <em>Generated From</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl#getHostConfigs <em>Host Configs</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ComputingNodeImpl implements Container {
	/**
	 * The cached value of the '{@link #getGeneratedFrom() <em>Generated From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedFrom()
	 * @generated
	 * @ordered
	 */
	protected ContainerImage generatedFrom;

	/**
	 * The cached value of the '{@link #getHostConfigs() <em>Host Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerHostConfig> hostConfigs;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerNetwork> networks;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerVolume> volumes;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> dependsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerImage getGeneratedFrom() {
		if (generatedFrom != null && generatedFrom.eIsProxy()) {
			InternalEObject oldGeneratedFrom = (InternalEObject)generatedFrom;
			generatedFrom = (ContainerImage)eResolveProxy(oldGeneratedFrom);
			if (generatedFrom != oldGeneratedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.CONTAINER__GENERATED_FROM, oldGeneratedFrom, generatedFrom));
			}
		}
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerImage basicGetGeneratedFrom() {
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedFrom(ContainerImage newGeneratedFrom, NotificationChain msgs) {
		ContainerImage oldGeneratedFrom = generatedFrom;
		generatedFrom = newGeneratedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER__GENERATED_FROM, oldGeneratedFrom, newGeneratedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratedFrom(ContainerImage newGeneratedFrom) {
		if (newGeneratedFrom != generatedFrom) {
			NotificationChain msgs = null;
			if (generatedFrom != null)
				msgs = ((InternalEObject)generatedFrom).eInverseRemove(this, InfrastructurePackage.CONTAINER_IMAGE__GENERATED_CONTAINERS, ContainerImage.class, msgs);
			if (newGeneratedFrom != null)
				msgs = ((InternalEObject)newGeneratedFrom).eInverseAdd(this, InfrastructurePackage.CONTAINER_IMAGE__GENERATED_CONTAINERS, ContainerImage.class, msgs);
			msgs = basicSetGeneratedFrom(newGeneratedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER__GENERATED_FROM, newGeneratedFrom, newGeneratedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerHostConfig> getHostConfigs() {
		if (hostConfigs == null) {
			hostConfigs = new EObjectContainmentEList<ContainerHostConfig>(ContainerHostConfig.class, this, InfrastructurePackage.CONTAINER__HOST_CONFIGS);
		}
		return hostConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectResolvingEList<ContainerNetwork>(ContainerNetwork.class, this, InfrastructurePackage.CONTAINER__NETWORKS);
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
			volumes = new EObjectResolvingEList<ContainerVolume>(ContainerVolume.class, this, InfrastructurePackage.CONTAINER__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Container> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<Container>(Container.class, this, InfrastructurePackage.CONTAINER__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				if (generatedFrom != null)
					msgs = ((InternalEObject)generatedFrom).eInverseRemove(this, InfrastructurePackage.CONTAINER_IMAGE__GENERATED_CONTAINERS, ContainerImage.class, msgs);
				return basicSetGeneratedFrom((ContainerImage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				return basicSetGeneratedFrom(null, msgs);
			case InfrastructurePackage.CONTAINER__HOST_CONFIGS:
				return ((InternalEList<?>)getHostConfigs()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				if (resolve) return getGeneratedFrom();
				return basicGetGeneratedFrom();
			case InfrastructurePackage.CONTAINER__HOST_CONFIGS:
				return getHostConfigs();
			case InfrastructurePackage.CONTAINER__NETWORKS:
				return getNetworks();
			case InfrastructurePackage.CONTAINER__VOLUMES:
				return getVolumes();
			case InfrastructurePackage.CONTAINER__DEPENDS_ON:
				return getDependsOn();
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
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				setGeneratedFrom((ContainerImage)newValue);
				return;
			case InfrastructurePackage.CONTAINER__HOST_CONFIGS:
				getHostConfigs().clear();
				getHostConfigs().addAll((Collection<? extends ContainerHostConfig>)newValue);
				return;
			case InfrastructurePackage.CONTAINER__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends ContainerNetwork>)newValue);
				return;
			case InfrastructurePackage.CONTAINER__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends ContainerVolume>)newValue);
				return;
			case InfrastructurePackage.CONTAINER__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends Container>)newValue);
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
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				setGeneratedFrom((ContainerImage)null);
				return;
			case InfrastructurePackage.CONTAINER__HOST_CONFIGS:
				getHostConfigs().clear();
				return;
			case InfrastructurePackage.CONTAINER__NETWORKS:
				getNetworks().clear();
				return;
			case InfrastructurePackage.CONTAINER__VOLUMES:
				getVolumes().clear();
				return;
			case InfrastructurePackage.CONTAINER__DEPENDS_ON:
				getDependsOn().clear();
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
			case InfrastructurePackage.CONTAINER__GENERATED_FROM:
				return generatedFrom != null;
			case InfrastructurePackage.CONTAINER__HOST_CONFIGS:
				return hostConfigs != null && !hostConfigs.isEmpty();
			case InfrastructurePackage.CONTAINER__NETWORKS:
				return networks != null && !networks.isEmpty();
			case InfrastructurePackage.CONTAINER__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case InfrastructurePackage.CONTAINER__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl

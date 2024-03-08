/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.SProperty;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.ComputingNode;
import eu.piacere.doml.doml.infrastructure.ContainerConfig;
import eu.piacere.doml.doml.infrastructure.ContainerHostConfig;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Host Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl#getEnvironment_variables <em>Environment variables</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl#getHost <em>Host</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerHostConfigImpl extends DOMLElementImpl implements ContainerHostConfig {
	/**
	 * The cached value of the '{@link #getEnvironment_variables() <em>Environment variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment_variables()
	 * @generated
	 * @ordered
	 */
	protected EList<SProperty> environment_variables;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ComputingNode host;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerConfig> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerHostConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER_HOST_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SProperty> getEnvironment_variables() {
		if (environment_variables == null) {
			environment_variables = new EObjectContainmentEList<SProperty>(SProperty.class, this, InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES);
		}
		return environment_variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingNode getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (ComputingNode)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingNode basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(ComputingNode newHost) {
		ComputingNode oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerConfig> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<ContainerConfig>(ContainerConfig.class, this, InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES:
				return ((InternalEList<?>)getEnvironment_variables()).basicRemove(otherEnd, msgs);
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES:
				return getEnvironment_variables();
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS:
				return getConfigurations();
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
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES:
				getEnvironment_variables().clear();
				getEnvironment_variables().addAll((Collection<? extends SProperty>)newValue);
				return;
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST:
				setHost((ComputingNode)newValue);
				return;
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends ContainerConfig>)newValue);
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
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES:
				getEnvironment_variables().clear();
				return;
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST:
				setHost((ComputingNode)null);
				return;
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS:
				getConfigurations().clear();
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
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES:
				return environment_variables != null && !environment_variables.isEmpty();
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__HOST:
				return host != null;
			case InfrastructurePackage.CONTAINER_HOST_CONFIG__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerHostConfigImpl

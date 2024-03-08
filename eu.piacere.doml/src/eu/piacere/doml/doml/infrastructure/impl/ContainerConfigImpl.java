/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.ComputingNode;
import eu.piacere.doml.doml.infrastructure.ContainerConfig;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl#getContainer_port <em>Container port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl#getVm_port <em>Vm port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl#getIface <em>Iface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerConfigImpl extends DOMLElementImpl implements ContainerConfig {
	/**
	 * The default value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTAINER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected Integer container_port = CONTAINER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVm_port() <em>Vm port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm_port()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVm_port() <em>Vm port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm_port()
	 * @generated
	 * @ordered
	 */
	protected Integer vm_port = VM_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIface() <em>Iface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIface()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface iface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.CONTAINER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getContainer_port() {
		return container_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer_port(Integer newContainer_port) {
		Integer oldContainer_port = container_port;
		container_port = newContainer_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_CONFIG__CONTAINER_PORT, oldContainer_port, container_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVm_port() {
		return vm_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVm_port(Integer newVm_port) {
		Integer oldVm_port = vm_port;
		vm_port = newVm_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_CONFIG__VM_PORT, oldVm_port, vm_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface getIface() {
		if (iface != null && iface.eIsProxy()) {
			InternalEObject oldIface = (InternalEObject)iface;
			iface = (NetworkInterface)eResolveProxy(oldIface);
			if (iface != oldIface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.CONTAINER_CONFIG__IFACE, oldIface, iface));
			}
		}
		return iface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetIface() {
		return iface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIface(NetworkInterface newIface) {
		NetworkInterface oldIface = iface;
		iface = newIface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.CONTAINER_CONFIG__IFACE, oldIface, iface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_CONFIG__CONTAINER_PORT:
				return getContainer_port();
			case InfrastructurePackage.CONTAINER_CONFIG__VM_PORT:
				return getVm_port();
			case InfrastructurePackage.CONTAINER_CONFIG__IFACE:
				if (resolve) return getIface();
				return basicGetIface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.CONTAINER_CONFIG__CONTAINER_PORT:
				setContainer_port((Integer)newValue);
				return;
			case InfrastructurePackage.CONTAINER_CONFIG__VM_PORT:
				setVm_port((Integer)newValue);
				return;
			case InfrastructurePackage.CONTAINER_CONFIG__IFACE:
				setIface((NetworkInterface)newValue);
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
			case InfrastructurePackage.CONTAINER_CONFIG__CONTAINER_PORT:
				setContainer_port(CONTAINER_PORT_EDEFAULT);
				return;
			case InfrastructurePackage.CONTAINER_CONFIG__VM_PORT:
				setVm_port(VM_PORT_EDEFAULT);
				return;
			case InfrastructurePackage.CONTAINER_CONFIG__IFACE:
				setIface((NetworkInterface)null);
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
			case InfrastructurePackage.CONTAINER_CONFIG__CONTAINER_PORT:
				return CONTAINER_PORT_EDEFAULT == null ? container_port != null : !CONTAINER_PORT_EDEFAULT.equals(container_port);
			case InfrastructurePackage.CONTAINER_CONFIG__VM_PORT:
				return VM_PORT_EDEFAULT == null ? vm_port != null : !VM_PORT_EDEFAULT.equals(vm_port);
			case InfrastructurePackage.CONTAINER_CONFIG__IFACE:
				return iface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (container_port: ");
		result.append(container_port);
		result.append(", vm_port: ");
		result.append(vm_port);
		result.append(')');
		return result.toString();
	}

} //ContainerConfigImpl

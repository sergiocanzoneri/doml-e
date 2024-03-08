/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.PhysicalComputingNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Computing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.PhysicalComputingNodeImpl#getConfigInterface <em>Config Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalComputingNodeImpl extends ComputingNodeImpl implements PhysicalComputingNode {
	/**
	 * The cached value of the '{@link #getConfigInterface() <em>Config Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigInterface()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface configInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComputingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.PHYSICAL_COMPUTING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface getConfigInterface() {
		if (configInterface != null && configInterface.eIsProxy()) {
			InternalEObject oldConfigInterface = (InternalEObject)configInterface;
			configInterface = (NetworkInterface)eResolveProxy(oldConfigInterface);
			if (configInterface != oldConfigInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE, oldConfigInterface, configInterface));
			}
		}
		return configInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetConfigInterface() {
		return configInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigInterface(NetworkInterface newConfigInterface) {
		NetworkInterface oldConfigInterface = configInterface;
		configInterface = newConfigInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE, oldConfigInterface, configInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE:
				if (resolve) return getConfigInterface();
				return basicGetConfigInterface();
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
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE:
				setConfigInterface((NetworkInterface)newValue);
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
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE:
				setConfigInterface((NetworkInterface)null);
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
			case InfrastructurePackage.PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE:
				return configInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalComputingNodeImpl

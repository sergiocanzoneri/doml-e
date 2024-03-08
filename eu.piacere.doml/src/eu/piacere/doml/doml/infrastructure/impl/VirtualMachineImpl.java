/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;
import eu.piacere.doml.doml.infrastructure.Storage;
import eu.piacere.doml.doml.infrastructure.VMImage;
import eu.piacere.doml.doml.infrastructure.VirtualMachine;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl#getGeneratedFrom <em>Generated From</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl#getConfigInterface <em>Config Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends ComputingNodeImpl implements VirtualMachine {
	/**
	 * The default value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeDescription()
	 * @generated
	 * @ordered
	 */
	protected String sizeDescription = SIZE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratedFrom() <em>Generated From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedFrom()
	 * @generated
	 * @ordered
	 */
	protected VMImage generatedFrom;

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
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSizeDescription() {
		return sizeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeDescription(String newSizeDescription) {
		String oldSizeDescription = sizeDescription;
		sizeDescription = newSizeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.VIRTUAL_MACHINE__SIZE_DESCRIPTION, oldSizeDescription, sizeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VMImage getGeneratedFrom() {
		if (generatedFrom != null && generatedFrom.eIsProxy()) {
			InternalEObject oldGeneratedFrom = (InternalEObject)generatedFrom;
			generatedFrom = (VMImage)eResolveProxy(oldGeneratedFrom);
			if (generatedFrom != oldGeneratedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM, oldGeneratedFrom, generatedFrom));
			}
		}
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMImage basicGetGeneratedFrom() {
		return generatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedFrom(VMImage newGeneratedFrom, NotificationChain msgs) {
		VMImage oldGeneratedFrom = generatedFrom;
		generatedFrom = newGeneratedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM, oldGeneratedFrom, newGeneratedFrom);
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
	public void setGeneratedFrom(VMImage newGeneratedFrom) {
		if (newGeneratedFrom != generatedFrom) {
			NotificationChain msgs = null;
			if (generatedFrom != null)
				msgs = ((InternalEObject)generatedFrom).eInverseRemove(this, InfrastructurePackage.VM_IMAGE__GENERATED_VMS, VMImage.class, msgs);
			if (newGeneratedFrom != null)
				msgs = ((InternalEObject)newGeneratedFrom).eInverseAdd(this, InfrastructurePackage.VM_IMAGE__GENERATED_VMS, VMImage.class, msgs);
			msgs = basicSetGeneratedFrom(newGeneratedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM, newGeneratedFrom, newGeneratedFrom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE, oldConfigInterface, configInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE, oldConfigInterface, configInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				if (generatedFrom != null)
					msgs = ((InternalEObject)generatedFrom).eInverseRemove(this, InfrastructurePackage.VM_IMAGE__GENERATED_VMS, VMImage.class, msgs);
				return basicSetGeneratedFrom((VMImage)otherEnd, msgs);
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
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				return basicSetGeneratedFrom(null, msgs);
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
			case InfrastructurePackage.VIRTUAL_MACHINE__SIZE_DESCRIPTION:
				return getSizeDescription();
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				if (resolve) return getGeneratedFrom();
				return basicGetGeneratedFrom();
			case InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.VIRTUAL_MACHINE__SIZE_DESCRIPTION:
				setSizeDescription((String)newValue);
				return;
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				setGeneratedFrom((VMImage)newValue);
				return;
			case InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE:
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
			case InfrastructurePackage.VIRTUAL_MACHINE__SIZE_DESCRIPTION:
				setSizeDescription(SIZE_DESCRIPTION_EDEFAULT);
				return;
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				setGeneratedFrom((VMImage)null);
				return;
			case InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE:
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
			case InfrastructurePackage.VIRTUAL_MACHINE__SIZE_DESCRIPTION:
				return SIZE_DESCRIPTION_EDEFAULT == null ? sizeDescription != null : !SIZE_DESCRIPTION_EDEFAULT.equals(sizeDescription);
			case InfrastructurePackage.VIRTUAL_MACHINE__GENERATED_FROM:
				return generatedFrom != null;
			case InfrastructurePackage.VIRTUAL_MACHINE__CONFIG_INTERFACE:
				return configInterface != null;
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
		result.append(" (sizeDescription: ");
		result.append(sizeDescription);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl

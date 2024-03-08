/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl#getVm_type <em>Vm type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.VirtualMachineImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends ConcreteElementImpl implements VirtualMachine {
	/**
	 * The default value of the '{@link #getVm_type() <em>Vm type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm_type()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVm_type() <em>Vm type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm_type()
	 * @generated
	 * @ordered
	 */
	protected String vm_type = VM_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected eu.piacere.doml.doml.infrastructure.VirtualMachine maps;

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
		return ConcretePackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVm_type() {
		return vm_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVm_type(String newVm_type) {
		String oldVm_type = vm_type;
		vm_type = newVm_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.VIRTUAL_MACHINE__VM_TYPE, oldVm_type, vm_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.VirtualMachine getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (eu.piacere.doml.doml.infrastructure.VirtualMachine)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.VIRTUAL_MACHINE__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.piacere.doml.doml.infrastructure.VirtualMachine basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaps(eu.piacere.doml.doml.infrastructure.VirtualMachine newMaps) {
		eu.piacere.doml.doml.infrastructure.VirtualMachine oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.VIRTUAL_MACHINE__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.VIRTUAL_MACHINE__VM_TYPE:
				return getVm_type();
			case ConcretePackage.VIRTUAL_MACHINE__MAPS:
				if (resolve) return getMaps();
				return basicGetMaps();
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
			case ConcretePackage.VIRTUAL_MACHINE__VM_TYPE:
				setVm_type((String)newValue);
				return;
			case ConcretePackage.VIRTUAL_MACHINE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.VirtualMachine)newValue);
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
			case ConcretePackage.VIRTUAL_MACHINE__VM_TYPE:
				setVm_type(VM_TYPE_EDEFAULT);
				return;
			case ConcretePackage.VIRTUAL_MACHINE__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.VirtualMachine)null);
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
			case ConcretePackage.VIRTUAL_MACHINE__VM_TYPE:
				return VM_TYPE_EDEFAULT == null ? vm_type != null : !VM_TYPE_EDEFAULT.equals(vm_type);
			case ConcretePackage.VIRTUAL_MACHINE__MAPS:
				return maps != null;
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
		result.append(" (vm_type: ");
		result.append(vm_type);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl

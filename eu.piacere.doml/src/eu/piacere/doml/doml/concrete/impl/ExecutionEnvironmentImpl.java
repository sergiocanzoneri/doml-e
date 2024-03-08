/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.concrete.ConcretePackage;
import eu.piacere.doml.doml.concrete.ExecutionEnvironment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl#getInstance_type <em>Instance type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl#getStorage_type <em>Storage type</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ExecutionEnvironmentImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEnvironmentImpl extends ConcreteElementImpl implements ExecutionEnvironment {
	/**
	 * The default value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_type()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_type()
	 * @generated
	 * @ordered
	 */
	protected String instance_type = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage_type() <em>Storage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_type()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorage_type() <em>Storage type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_type()
	 * @generated
	 * @ordered
	 */
	protected String storage_type = STORAGE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected eu.piacere.doml.doml.infrastructure.ExecutionEnvironment maps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.EXECUTION_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstance_type() {
		return instance_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstance_type(String newInstance_type) {
		String oldInstance_type = instance_type;
		instance_type = newInstance_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.EXECUTION_ENVIRONMENT__INSTANCE_TYPE, oldInstance_type, instance_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorage_type() {
		return storage_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage_type(String newStorage_type) {
		String oldStorage_type = storage_type;
		storage_type = newStorage_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.EXECUTION_ENVIRONMENT__STORAGE_TYPE, oldStorage_type, storage_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eu.piacere.doml.doml.infrastructure.ExecutionEnvironment getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (eu.piacere.doml.doml.infrastructure.ExecutionEnvironment)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretePackage.EXECUTION_ENVIRONMENT__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eu.piacere.doml.doml.infrastructure.ExecutionEnvironment basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaps(eu.piacere.doml.doml.infrastructure.ExecutionEnvironment newMaps) {
		eu.piacere.doml.doml.infrastructure.ExecutionEnvironment oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.EXECUTION_ENVIRONMENT__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.EXECUTION_ENVIRONMENT__INSTANCE_TYPE:
				return getInstance_type();
			case ConcretePackage.EXECUTION_ENVIRONMENT__STORAGE_TYPE:
				return getStorage_type();
			case ConcretePackage.EXECUTION_ENVIRONMENT__MAPS:
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
			case ConcretePackage.EXECUTION_ENVIRONMENT__INSTANCE_TYPE:
				setInstance_type((String)newValue);
				return;
			case ConcretePackage.EXECUTION_ENVIRONMENT__STORAGE_TYPE:
				setStorage_type((String)newValue);
				return;
			case ConcretePackage.EXECUTION_ENVIRONMENT__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.ExecutionEnvironment)newValue);
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
			case ConcretePackage.EXECUTION_ENVIRONMENT__INSTANCE_TYPE:
				setInstance_type(INSTANCE_TYPE_EDEFAULT);
				return;
			case ConcretePackage.EXECUTION_ENVIRONMENT__STORAGE_TYPE:
				setStorage_type(STORAGE_TYPE_EDEFAULT);
				return;
			case ConcretePackage.EXECUTION_ENVIRONMENT__MAPS:
				setMaps((eu.piacere.doml.doml.infrastructure.ExecutionEnvironment)null);
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
			case ConcretePackage.EXECUTION_ENVIRONMENT__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instance_type != null : !INSTANCE_TYPE_EDEFAULT.equals(instance_type);
			case ConcretePackage.EXECUTION_ENVIRONMENT__STORAGE_TYPE:
				return STORAGE_TYPE_EDEFAULT == null ? storage_type != null : !STORAGE_TYPE_EDEFAULT.equals(storage_type);
			case ConcretePackage.EXECUTION_ENVIRONMENT__MAPS:
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
		result.append(" (instance_type: ");
		result.append(instance_type);
		result.append(", storage_type: ");
		result.append(storage_type);
		result.append(')');
		return result.toString();
	}

} //ExecutionEnvironmentImpl

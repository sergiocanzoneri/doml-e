/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.Credentials;
import eu.piacere.doml.doml.commons.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.SourceImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.SourceImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.SourceImpl#getBackend <em>Backend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends DOMLElementImpl implements Source {
	/**
	 * The default value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected String entry = ENTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInventory() <em>Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected String inventory = INVENTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackend() <em>Backend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackend()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackend() <em>Backend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackend()
	 * @generated
	 * @ordered
	 */
	protected String backend = BACKEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntry(String newEntry) {
		String oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.SOURCE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventory() {
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventory(String newInventory) {
		String oldInventory = inventory;
		inventory = newInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.SOURCE__INVENTORY, oldInventory, inventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackend() {
		return backend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackend(String newBackend) {
		String oldBackend = backend;
		backend = newBackend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.SOURCE__BACKEND, oldBackend, backend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonsPackage.SOURCE__ENTRY:
				return getEntry();
			case CommonsPackage.SOURCE__INVENTORY:
				return getInventory();
			case CommonsPackage.SOURCE__BACKEND:
				return getBackend();
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
			case CommonsPackage.SOURCE__ENTRY:
				setEntry((String)newValue);
				return;
			case CommonsPackage.SOURCE__INVENTORY:
				setInventory((String)newValue);
				return;
			case CommonsPackage.SOURCE__BACKEND:
				setBackend((String)newValue);
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
			case CommonsPackage.SOURCE__ENTRY:
				setEntry(ENTRY_EDEFAULT);
				return;
			case CommonsPackage.SOURCE__INVENTORY:
				setInventory(INVENTORY_EDEFAULT);
				return;
			case CommonsPackage.SOURCE__BACKEND:
				setBackend(BACKEND_EDEFAULT);
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
			case CommonsPackage.SOURCE__ENTRY:
				return ENTRY_EDEFAULT == null ? entry != null : !ENTRY_EDEFAULT.equals(entry);
			case CommonsPackage.SOURCE__INVENTORY:
				return INVENTORY_EDEFAULT == null ? inventory != null : !INVENTORY_EDEFAULT.equals(inventory);
			case CommonsPackage.SOURCE__BACKEND:
				return BACKEND_EDEFAULT == null ? backend != null : !BACKEND_EDEFAULT.equals(backend);
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
		result.append(" (entry: ");
		result.append(entry);
		result.append(", inventory: ");
		result.append(inventory);
		result.append(", backend: ");
		result.append(backend);
		result.append(')');
		return result.toString();
	}

} //SourceImpl

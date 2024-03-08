/**
 */
package eu.piacere.doml.doml.application.impl;

import eu.piacere.doml.doml.application.ApplicationPackage;
import eu.piacere.doml.doml.application.SaaSDBMS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Saa SDBMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SaaSDBMSImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SaaSDBMSImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.impl.SaaSDBMSImpl#getEngineVersion <em>Engine Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaaSDBMSImpl extends SaaSImpl implements SaaSDBMS {
	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected String engine = ENGINE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEngineVersion() <em>Engine Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEngineVersion() <em>Engine Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineVersion()
	 * @generated
	 * @ordered
	 */
	protected String engineVersion = ENGINE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaaSDBMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SAA_SDBMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SAA_SDBMS__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngine(String newEngine) {
		String oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SAA_SDBMS__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngineVersion() {
		return engineVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineVersion(String newEngineVersion) {
		String oldEngineVersion = engineVersion;
		engineVersion = newEngineVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SAA_SDBMS__ENGINE_VERSION, oldEngineVersion, engineVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.SAA_SDBMS__DATABASE_NAME:
				return getDatabaseName();
			case ApplicationPackage.SAA_SDBMS__ENGINE:
				return getEngine();
			case ApplicationPackage.SAA_SDBMS__ENGINE_VERSION:
				return getEngineVersion();
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
			case ApplicationPackage.SAA_SDBMS__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case ApplicationPackage.SAA_SDBMS__ENGINE:
				setEngine((String)newValue);
				return;
			case ApplicationPackage.SAA_SDBMS__ENGINE_VERSION:
				setEngineVersion((String)newValue);
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
			case ApplicationPackage.SAA_SDBMS__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case ApplicationPackage.SAA_SDBMS__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
			case ApplicationPackage.SAA_SDBMS__ENGINE_VERSION:
				setEngineVersion(ENGINE_VERSION_EDEFAULT);
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
			case ApplicationPackage.SAA_SDBMS__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case ApplicationPackage.SAA_SDBMS__ENGINE:
				return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
			case ApplicationPackage.SAA_SDBMS__ENGINE_VERSION:
				return ENGINE_VERSION_EDEFAULT == null ? engineVersion != null : !ENGINE_VERSION_EDEFAULT.equals(engineVersion);
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
		result.append(" (databaseName: ");
		result.append(databaseName);
		result.append(", engine: ");
		result.append(engine);
		result.append(", engineVersion: ");
		result.append(engineVersion);
		result.append(')');
		return result.toString();
	}

} //SaaSDBMSImpl

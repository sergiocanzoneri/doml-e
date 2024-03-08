/**
 */
package eu.piacere.doml.doml.application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saa SDBMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.SaaSDBMS#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngine <em>Engine</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngineVersion <em>Engine Version</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaSDBMS()
 * @model
 * @generated
 */
public interface SaaSDBMS extends SaaS {

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaSDBMS_DatabaseName()
	 * @model
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SaaSDBMS#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see #setEngine(String)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaSDBMS_Engine()
	 * @model
	 * @generated
	 */
	String getEngine();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(String value);

	/**
	 * Returns the value of the '<em><b>Engine Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Version</em>' attribute.
	 * @see #setEngineVersion(String)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaSDBMS_EngineVersion()
	 * @model
	 * @generated
	 */
	String getEngineVersion();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngineVersion <em>Engine Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Version</em>' attribute.
	 * @see #getEngineVersion()
	 * @generated
	 */
	void setEngineVersion(String value);
} // SaaSDBMS

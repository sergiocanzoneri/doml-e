/**
 */
package eu.piacere.doml.doml.application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationFactory eINSTANCE = eu.piacere.doml.doml.application.impl.ApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	ApplicationLayer createApplicationLayer();

	/**
	 * Returns a new object of class '<em>Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Component</em>'.
	 * @generated
	 */
	SoftwareComponent createSoftwareComponent();

	/**
	 * Returns a new object of class '<em>DBMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBMS</em>'.
	 * @generated
	 */
	DBMS createDBMS();

	/**
	 * Returns a new object of class '<em>Saa S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saa S</em>'.
	 * @generated
	 */
	SaaS createSaaS();

	/**
	 * Returns a new object of class '<em>Saa SDBMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Saa SDBMS</em>'.
	 * @generated
	 */
	SaaSDBMS createSaaSDBMS();

	/**
	 * Returns a new object of class '<em>Software Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Interface</em>'.
	 * @generated
	 */
	SoftwareInterface createSoftwareInterface();

	/**
	 * Returns a new object of class '<em>Ext Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Application Component</em>'.
	 * @generated
	 */
	ExtApplicationComponent createExtApplicationComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory

/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.commons.CommonsPackage
 * @generated
 */
public interface CommonsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsFactory eINSTANCE = eu.piacere.doml.doml.commons.impl.CommonsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DOML Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DOML Model</em>'.
	 * @generated
	 */
	DOMLModel createDOMLModel();

	/**
	 * Returns a new object of class '<em>List Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Property</em>'.
	 * @generated
	 */
	ListProperty createListProperty();

	/**
	 * Returns a new object of class '<em>IProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProperty</em>'.
	 * @generated
	 */
	IProperty createIProperty();

	/**
	 * Returns a new object of class '<em>SProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SProperty</em>'.
	 * @generated
	 */
	SProperty createSProperty();

	/**
	 * Returns a new object of class '<em>FProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FProperty</em>'.
	 * @generated
	 */
	FProperty createFProperty();

	/**
	 * Returns a new object of class '<em>BProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BProperty</em>'.
	 * @generated
	 */
	BProperty createBProperty();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Ranged Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranged Requirement</em>'.
	 * @generated
	 */
	RangedRequirement createRangedRequirement();

	/**
	 * Returns a new object of class '<em>Enumerated Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Requirement</em>'.
	 * @generated
	 */
	EnumeratedRequirement createEnumeratedRequirement();

	/**
	 * Returns a new object of class '<em>Deployment To Node Type Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment To Node Type Requirement</em>'.
	 * @generated
	 */
	DeploymentToNodeTypeRequirement createDeploymentToNodeTypeRequirement();

	/**
	 * Returns a new object of class '<em>Deployment To Node With Property Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment To Node With Property Requirement</em>'.
	 * @generated
	 */
	DeploymentToNodeWithPropertyRequirement createDeploymentToNodeWithPropertyRequirement();

	/**
	 * Returns a new object of class '<em>Deployment To Specific Node Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment To Specific Node Requirement</em>'.
	 * @generated
	 */
	DeploymentToSpecificNodeRequirement createDeploymentToSpecificNodeRequirement();

	/**
	 * Returns a new object of class '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pair</em>'.
	 * @generated
	 */
	KeyPair createKeyPair();

	/**
	 * Returns a new object of class '<em>User Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Pass</em>'.
	 * @generated
	 */
	UserPass createUserPass();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonsPackage getCommonsPackage();

} //CommonsFactory

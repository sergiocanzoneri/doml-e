/**
 */
package eu.piacere.doml.doml.application;

import eu.piacere.doml.doml.commons.CommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.piacere-project.eu/doml/application";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = eu.piacere.doml.doml.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.ApplicationLayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.ApplicationLayerImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getApplicationLayer()
	 * @generated
	 */
	int APPLICATION_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER__COMPONENTS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYER_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.ApplicationComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.ApplicationComponentImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.SoftwareComponentImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSoftwareComponent()
	 * @generated
	 */
	int SOFTWARE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__NAME = APPLICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__DESCRIPTION = APPLICATION_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__ANNOTATIONS = APPLICATION_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__CONTRIBUTES_TO = APPLICATION_COMPONENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__IS_PERSISTENT = APPLICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__LICENSE_COST = APPLICATION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exposed Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__EXPOSED_INTERFACES = APPLICATION_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__CONSUMED_INTERFACES = APPLICATION_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT__SRC = APPLICATION_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Software Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_COMPONENT_FEATURE_COUNT = APPLICATION_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.DBMSImpl <em>DBMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.DBMSImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getDBMS()
	 * @generated
	 */
	int DBMS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__NAME = SOFTWARE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__DESCRIPTION = SOFTWARE_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__ANNOTATIONS = SOFTWARE_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__CONTRIBUTES_TO = SOFTWARE_COMPONENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__IS_PERSISTENT = SOFTWARE_COMPONENT__IS_PERSISTENT;

	/**
	 * The feature id for the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__LICENSE_COST = SOFTWARE_COMPONENT__LICENSE_COST;

	/**
	 * The feature id for the '<em><b>Exposed Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__EXPOSED_INTERFACES = SOFTWARE_COMPONENT__EXPOSED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__CONSUMED_INTERFACES = SOFTWARE_COMPONENT__CONSUMED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS__SRC = SOFTWARE_COMPONENT__SRC;

	/**
	 * The number of structural features of the '<em>DBMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBMS_FEATURE_COUNT = SOFTWARE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.SaaSImpl <em>Saa S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.SaaSImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSaaS()
	 * @generated
	 */
	int SAA_S = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__NAME = APPLICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__DESCRIPTION = APPLICATION_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__ANNOTATIONS = APPLICATION_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__CONTRIBUTES_TO = APPLICATION_COMPONENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__LICENSE_COST = APPLICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exposed Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S__EXPOSED_INTERFACES = APPLICATION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Saa S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_S_FEATURE_COUNT = APPLICATION_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.SaaSDBMSImpl <em>Saa SDBMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.SaaSDBMSImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSaaSDBMS()
	 * @generated
	 */
	int SAA_SDBMS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__NAME = SAA_S__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__DESCRIPTION = SAA_S__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__ANNOTATIONS = SAA_S__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__CONTRIBUTES_TO = SAA_S__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__LICENSE_COST = SAA_S__LICENSE_COST;

	/**
	 * The feature id for the '<em><b>Exposed Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__EXPOSED_INTERFACES = SAA_S__EXPOSED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__DATABASE_NAME = SAA_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__ENGINE = SAA_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engine Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS__ENGINE_VERSION = SAA_S_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Saa SDBMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAA_SDBMS_FEATURE_COUNT = SAA_S_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.SoftwareInterfaceImpl <em>Software Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.SoftwareInterfaceImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSoftwareInterface()
	 * @generated
	 */
	int SOFTWARE_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__NAME = APPLICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__DESCRIPTION = APPLICATION_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__ANNOTATIONS = APPLICATION_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__CONTRIBUTES_TO = APPLICATION_COMPONENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE__END_POINT = APPLICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INTERFACE_FEATURE_COUNT = APPLICATION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.application.impl.ExtApplicationComponentImpl <em>Ext Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.application.impl.ExtApplicationComponentImpl
	 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getExtApplicationComponent()
	 * @generated
	 */
	int EXT_APPLICATION_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT__NAME = APPLICATION_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT__DESCRIPTION = APPLICATION_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT__ANNOTATIONS = APPLICATION_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT__CONTRIBUTES_TO = APPLICATION_COMPONENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT__METACLASS_NAME = APPLICATION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ext Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_APPLICATION_COMPONENT_FEATURE_COUNT = APPLICATION_COMPONENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.ApplicationLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see eu.piacere.doml.doml.application.ApplicationLayer
	 * @generated
	 */
	EClass getApplicationLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.application.ApplicationLayer#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see eu.piacere.doml.doml.application.ApplicationLayer#getComponents()
	 * @see #getApplicationLayer()
	 * @generated
	 */
	EReference getApplicationLayer_Components();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.ApplicationComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see eu.piacere.doml.doml.application.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Component</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent
	 * @generated
	 */
	EClass getSoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SoftwareComponent#getIsPersistent <em>Is Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Persistent</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent#getIsPersistent()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_IsPersistent();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SoftwareComponent#getLicenseCost <em>License Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Cost</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent#getLicenseCost()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EAttribute getSoftwareComponent_LicenseCost();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.application.SoftwareComponent#getExposedInterfaces <em>Exposed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exposed Interfaces</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent#getExposedInterfaces()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_ExposedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.application.SoftwareComponent#getConsumedInterfaces <em>Consumed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumed Interfaces</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent#getConsumedInterfaces()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_ConsumedInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.application.SoftwareComponent#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareComponent#getSrc()
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	EReference getSoftwareComponent_Src();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.DBMS <em>DBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBMS</em>'.
	 * @see eu.piacere.doml.doml.application.DBMS
	 * @generated
	 */
	EClass getDBMS();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.SaaS <em>Saa S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saa S</em>'.
	 * @see eu.piacere.doml.doml.application.SaaS
	 * @generated
	 */
	EClass getSaaS();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SaaS#getLicenseCost <em>License Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Cost</em>'.
	 * @see eu.piacere.doml.doml.application.SaaS#getLicenseCost()
	 * @see #getSaaS()
	 * @generated
	 */
	EAttribute getSaaS_LicenseCost();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.application.SaaS#getExposedInterfaces <em>Exposed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exposed Interfaces</em>'.
	 * @see eu.piacere.doml.doml.application.SaaS#getExposedInterfaces()
	 * @see #getSaaS()
	 * @generated
	 */
	EReference getSaaS_ExposedInterfaces();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.SaaSDBMS <em>Saa SDBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saa SDBMS</em>'.
	 * @see eu.piacere.doml.doml.application.SaaSDBMS
	 * @generated
	 */
	EClass getSaaSDBMS();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SaaSDBMS#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see eu.piacere.doml.doml.application.SaaSDBMS#getDatabaseName()
	 * @see #getSaaSDBMS()
	 * @generated
	 */
	EAttribute getSaaSDBMS_DatabaseName();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see eu.piacere.doml.doml.application.SaaSDBMS#getEngine()
	 * @see #getSaaSDBMS()
	 * @generated
	 */
	EAttribute getSaaSDBMS_Engine();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SaaSDBMS#getEngineVersion <em>Engine Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Version</em>'.
	 * @see eu.piacere.doml.doml.application.SaaSDBMS#getEngineVersion()
	 * @see #getSaaSDBMS()
	 * @generated
	 */
	EAttribute getSaaSDBMS_EngineVersion();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.SoftwareInterface <em>Software Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Interface</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareInterface
	 * @generated
	 */
	EClass getSoftwareInterface();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.application.SoftwareInterface#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see eu.piacere.doml.doml.application.SoftwareInterface#getEndPoint()
	 * @see #getSoftwareInterface()
	 * @generated
	 */
	EAttribute getSoftwareInterface_EndPoint();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.application.ExtApplicationComponent <em>Ext Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Application Component</em>'.
	 * @see eu.piacere.doml.doml.application.ExtApplicationComponent
	 * @generated
	 */
	EClass getExtApplicationComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.ApplicationLayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.ApplicationLayerImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getApplicationLayer()
		 * @generated
		 */
		EClass APPLICATION_LAYER = eINSTANCE.getApplicationLayer();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LAYER__COMPONENTS = eINSTANCE.getApplicationLayer_Components();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.ApplicationComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.ApplicationComponentImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.SoftwareComponentImpl <em>Software Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.SoftwareComponentImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSoftwareComponent()
		 * @generated
		 */
		EClass SOFTWARE_COMPONENT = eINSTANCE.getSoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Is Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__IS_PERSISTENT = eINSTANCE.getSoftwareComponent_IsPersistent();

		/**
		 * The meta object literal for the '<em><b>License Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_COMPONENT__LICENSE_COST = eINSTANCE.getSoftwareComponent_LicenseCost();

		/**
		 * The meta object literal for the '<em><b>Exposed Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__EXPOSED_INTERFACES = eINSTANCE.getSoftwareComponent_ExposedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Consumed Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__CONSUMED_INTERFACES = eINSTANCE.getSoftwareComponent_ConsumedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_COMPONENT__SRC = eINSTANCE.getSoftwareComponent_Src();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.DBMSImpl <em>DBMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.DBMSImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getDBMS()
		 * @generated
		 */
		EClass DBMS = eINSTANCE.getDBMS();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.SaaSImpl <em>Saa S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.SaaSImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSaaS()
		 * @generated
		 */
		EClass SAA_S = eINSTANCE.getSaaS();

		/**
		 * The meta object literal for the '<em><b>License Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAA_S__LICENSE_COST = eINSTANCE.getSaaS_LicenseCost();

		/**
		 * The meta object literal for the '<em><b>Exposed Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAA_S__EXPOSED_INTERFACES = eINSTANCE.getSaaS_ExposedInterfaces();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.SaaSDBMSImpl <em>Saa SDBMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.SaaSDBMSImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSaaSDBMS()
		 * @generated
		 */
		EClass SAA_SDBMS = eINSTANCE.getSaaSDBMS();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAA_SDBMS__DATABASE_NAME = eINSTANCE.getSaaSDBMS_DatabaseName();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAA_SDBMS__ENGINE = eINSTANCE.getSaaSDBMS_Engine();

		/**
		 * The meta object literal for the '<em><b>Engine Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAA_SDBMS__ENGINE_VERSION = eINSTANCE.getSaaSDBMS_EngineVersion();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.SoftwareInterfaceImpl <em>Software Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.SoftwareInterfaceImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getSoftwareInterface()
		 * @generated
		 */
		EClass SOFTWARE_INTERFACE = eINSTANCE.getSoftwareInterface();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_INTERFACE__END_POINT = eINSTANCE.getSoftwareInterface_EndPoint();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.application.impl.ExtApplicationComponentImpl <em>Ext Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.application.impl.ExtApplicationComponentImpl
		 * @see eu.piacere.doml.doml.application.impl.ApplicationPackageImpl#getExtApplicationComponent()
		 * @generated
		 */
		EClass EXT_APPLICATION_COMPONENT = eINSTANCE.getExtApplicationComponent();

	}

} //ApplicationPackage

/**
 */
package eu.piacere.doml.doml.commons;

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
 * @see eu.piacere.doml.doml.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commons";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.piacere-project.eu/doml/commons";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commons";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonsPackage eINSTANCE = eu.piacere.doml.doml.commons.impl.CommonsPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DOMLElementImpl <em>DOML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DOMLElementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDOMLElement()
	 * @generated
	 */
	int DOML_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_ELEMENT__ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_ELEMENT__CONTRIBUTES_TO = 3;

	/**
	 * The number of structural features of the '<em>DOML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl <em>DOML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DOMLModelImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDOMLModel()
	 * @generated
	 */
	int DOML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__NAME = DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__DESCRIPTION = DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__ANNOTATIONS = DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__CONTRIBUTES_TO = DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__VERSION = DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__APPLICATION = DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__INFRASTRUCTURE = DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concretizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__CONCRETIZATIONS = DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Optimization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__OPTIMIZATION = DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__CONFIGURATIONS = DOML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Active Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__ACTIVE_CONFIGURATION = DOML_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Active Infrastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__ACTIVE_INFRASTRUCTURE = DOML_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Functional Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL__FUNCTIONAL_REQUIREMENTS = DOML_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>DOML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOML_MODEL_FEATURE_COUNT = DOML_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.PropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.ListPropertyImpl <em>List Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.ListPropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getListProperty()
	 * @generated
	 */
	int LIST_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY__VALUES = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.IPropertyImpl <em>IProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.IPropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getIProperty()
	 * @generated
	 */
	int IPROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.SPropertyImpl <em>SProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.SPropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getSProperty()
	 * @generated
	 */
	int SPROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.FPropertyImpl <em>FProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.FPropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getFProperty()
	 * @generated
	 */
	int FPROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.BPropertyImpl <em>BProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.BPropertyImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getBProperty()
	 * @generated
	 */
	int BPROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.ExtensionElementImpl <em>Extension Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.ExtensionElementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getExtensionElement()
	 * @generated
	 */
	int EXTENSION_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT__METACLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Extension Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.ConfigurationImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ANNOTATIONS = DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONTRIBUTES_TO = DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DEPLOYMENTS = DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeployableElementImpl <em>Deployable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeployableElementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeployableElement()
	 * @generated
	 */
	int DEPLOYABLE_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Deployable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeploymentImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 11;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NODE = 1;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.RequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PREDICATES_ON = 3;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.RangedRequirementImpl <em>Ranged Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.RangedRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getRangedRequirement()
	 * @generated
	 */
	int RANGED_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__PROPERTY = REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__PREDICATES_ON = REQUIREMENT__PREDICATES_ON;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__MIN = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT__MAX = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranged Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGED_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.EnumeratedRequirementImpl <em>Enumerated Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.EnumeratedRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getEnumeratedRequirement()
	 * @generated
	 */
	int ENUMERATED_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT__PROPERTY = REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT__PREDICATES_ON = REQUIREMENT__PREDICATES_ON;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT__VALUES = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentRequirementImpl <em>Deployment Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeploymentRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentRequirement()
	 * @generated
	 */
	int DEPLOYMENT_REQUIREMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REQUIREMENT__PROPERTY = REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REQUIREMENT__PREDICATES_ON = REQUIREMENT__PREDICATES_ON;

	/**
	 * The number of structural features of the '<em>Deployment Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeTypeRequirementImpl <em>Deployment To Node Type Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeploymentToNodeTypeRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToNodeTypeRequirement()
	 * @generated
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__NAME = DEPLOYMENT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__DESCRIPTION = DEPLOYMENT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__PROPERTY = DEPLOYMENT_REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__PREDICATES_ON = DEPLOYMENT_REQUIREMENT__PREDICATES_ON;

	/**
	 * The feature id for the '<em><b>Valid Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployment To Node Type Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT_FEATURE_COUNT = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl <em>Deployment To Node With Property Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToNodeWithPropertyRequirement()
	 * @generated
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__NAME = DEPLOYMENT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__DESCRIPTION = DEPLOYMENT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__PROPERTY = DEPLOYMENT_REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__PREDICATES_ON = DEPLOYMENT_REQUIREMENT__PREDICATES_ON;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment To Node With Property Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT_FEATURE_COUNT = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToSpecificNodeRequirementImpl <em>Deployment To Specific Node Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.DeploymentToSpecificNodeRequirementImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToSpecificNodeRequirement()
	 * @generated
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__NAME = DEPLOYMENT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__DESCRIPTION = DEPLOYMENT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__PROPERTY = DEPLOYMENT_REQUIREMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Predicates On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__PREDICATES_ON = DEPLOYMENT_REQUIREMENT__PREDICATES_ON;

	/**
	 * The feature id for the '<em><b>Valid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deployment To Specific Node Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT_FEATURE_COUNT = DEPLOYMENT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.CredentialsImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__NAME = DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__DESCRIPTION = DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ANNOTATIONS = DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__CONTRIBUTES_TO = DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.KeyPairImpl <em>Key Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.KeyPairImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getKeyPair()
	 * @generated
	 */
	int KEY_PAIR = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__NAME = CREDENTIALS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__DESCRIPTION = CREDENTIALS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__ANNOTATIONS = CREDENTIALS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__CONTRIBUTES_TO = CREDENTIALS__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__USER = CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__KEY = CREDENTIALS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__ALGORITHM = CREDENTIALS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR__BITS = CREDENTIALS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PAIR_FEATURE_COUNT = CREDENTIALS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.UserPassImpl <em>User Pass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.UserPassImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getUserPass()
	 * @generated
	 */
	int USER_PASS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__NAME = CREDENTIALS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__DESCRIPTION = CREDENTIALS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__ANNOTATIONS = CREDENTIALS__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__CONTRIBUTES_TO = CREDENTIALS__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__USERNAME = CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS__PASSWORD = CREDENTIALS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PASS_FEATURE_COUNT = CREDENTIALS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.commons.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.commons.impl.SourceImpl
	 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DESCRIPTION = DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ANNOTATIONS = DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CONTRIBUTES_TO = DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ENTRY = DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__INVENTORY = DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Backend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BACKEND = DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = DOML_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DOMLModel <em>DOML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOML Model</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel
	 * @generated
	 */
	EClass getDOMLModel();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.DOMLModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getVersion()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EAttribute getDOMLModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.commons.DOMLModel#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getApplication()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_Application();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.commons.DOMLModel#getInfrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructure</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getInfrastructure()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_Infrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.DOMLModel#getConcretizations <em>Concretizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concretizations</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getConcretizations()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_Concretizations();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.commons.DOMLModel#getOptimization <em>Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimization</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getOptimization()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_Optimization();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.DOMLModel#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getConfigurations()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_Configurations();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveConfiguration <em>Active Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Configuration</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getActiveConfiguration()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_ActiveConfiguration();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveInfrastructure <em>Active Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Infrastructure</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getActiveInfrastructure()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_ActiveInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.DOMLModel#getFunctionalRequirements <em>Functional Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Requirements</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLModel#getFunctionalRequirements()
	 * @see #getDOMLModel()
	 * @generated
	 */
	EReference getDOMLModel_FunctionalRequirements();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see eu.piacere.doml.doml.commons.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.piacere.doml.doml.commons.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property</em>'.
	 * @see eu.piacere.doml.doml.commons.ListProperty
	 * @generated
	 */
	EClass getListProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.ListProperty#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.piacere.doml.doml.commons.ListProperty#getValues()
	 * @see #getListProperty()
	 * @generated
	 */
	EReference getListProperty_Values();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProperty</em>'.
	 * @see eu.piacere.doml.doml.commons.IProperty
	 * @generated
	 */
	EClass getIProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.IProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.piacere.doml.doml.commons.IProperty#getValue()
	 * @see #getIProperty()
	 * @generated
	 */
	EAttribute getIProperty_Value();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.SProperty <em>SProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SProperty</em>'.
	 * @see eu.piacere.doml.doml.commons.SProperty
	 * @generated
	 */
	EClass getSProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.SProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.piacere.doml.doml.commons.SProperty#getValue()
	 * @see #getSProperty()
	 * @generated
	 */
	EAttribute getSProperty_Value();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.FProperty <em>FProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FProperty</em>'.
	 * @see eu.piacere.doml.doml.commons.FProperty
	 * @generated
	 */
	EClass getFProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.FProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.piacere.doml.doml.commons.FProperty#getValue()
	 * @see #getFProperty()
	 * @generated
	 */
	EAttribute getFProperty_Value();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.BProperty <em>BProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BProperty</em>'.
	 * @see eu.piacere.doml.doml.commons.BProperty
	 * @generated
	 */
	EClass getBProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.BProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.piacere.doml.doml.commons.BProperty#getValue()
	 * @see #getBProperty()
	 * @generated
	 */
	EAttribute getBProperty_Value();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.ExtensionElement <em>Extension Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Element</em>'.
	 * @see eu.piacere.doml.doml.commons.ExtensionElement
	 * @generated
	 */
	EClass getExtensionElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.ExtensionElement#getMetaclassName <em>Metaclass Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaclass Name</em>'.
	 * @see eu.piacere.doml.doml.commons.ExtensionElement#getMetaclassName()
	 * @see #getExtensionElement()
	 * @generated
	 */
	EAttribute getExtensionElement_MetaclassName();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DOMLElement <em>DOML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOML Element</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLElement
	 * @generated
	 */
	EClass getDOMLElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.DOMLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLElement#getName()
	 * @see #getDOMLElement()
	 * @generated
	 */
	EAttribute getDOMLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.DOMLElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLElement#getDescription()
	 * @see #getDOMLElement()
	 * @generated
	 */
	EAttribute getDOMLElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.DOMLElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLElement#getAnnotations()
	 * @see #getDOMLElement()
	 * @generated
	 */
	EReference getDOMLElement_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.commons.DOMLElement#getContributesTo <em>Contributes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributes To</em>'.
	 * @see eu.piacere.doml.doml.commons.DOMLElement#getContributesTo()
	 * @see #getDOMLElement()
	 * @generated
	 */
	EReference getDOMLElement_ContributesTo();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see eu.piacere.doml.doml.commons.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.commons.Configuration#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see eu.piacere.doml.doml.commons.Configuration#getDeployments()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Deployments();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DeployableElement <em>Deployable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Element</em>'.
	 * @see eu.piacere.doml.doml.commons.DeployableElement
	 * @generated
	 */
	EClass getDeployableElement();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see eu.piacere.doml.doml.commons.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.commons.Deployment#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see eu.piacere.doml.doml.commons.Deployment#getComponent()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Component();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.commons.Deployment#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see eu.piacere.doml.doml.commons.Deployment#getNode()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Node();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.piacere.doml.doml.commons.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.piacere.doml.doml.commons.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Requirement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see eu.piacere.doml.doml.commons.Requirement#getProperty()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Property();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.commons.Requirement#getPredicatesOn <em>Predicates On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicates On</em>'.
	 * @see eu.piacere.doml.doml.commons.Requirement#getPredicatesOn()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_PredicatesOn();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.RangedRequirement <em>Ranged Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranged Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.RangedRequirement
	 * @generated
	 */
	EClass getRangedRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.RangedRequirement#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see eu.piacere.doml.doml.commons.RangedRequirement#getMin()
	 * @see #getRangedRequirement()
	 * @generated
	 */
	EAttribute getRangedRequirement_Min();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.RangedRequirement#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see eu.piacere.doml.doml.commons.RangedRequirement#getMax()
	 * @see #getRangedRequirement()
	 * @generated
	 */
	EAttribute getRangedRequirement_Max();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.EnumeratedRequirement <em>Enumerated Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.EnumeratedRequirement
	 * @generated
	 */
	EClass getEnumeratedRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.commons.EnumeratedRequirement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see eu.piacere.doml.doml.commons.EnumeratedRequirement#getValues()
	 * @see #getEnumeratedRequirement()
	 * @generated
	 */
	EAttribute getEnumeratedRequirement_Values();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DeploymentRequirement <em>Deployment Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentRequirement
	 * @generated
	 */
	EClass getDeploymentRequirement();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement <em>Deployment To Node Type Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment To Node Type Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement
	 * @generated
	 */
	EClass getDeploymentToNodeTypeRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement#getValidTypes <em>Valid Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Types</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeTypeRequirement#getValidTypes()
	 * @see #getDeploymentToNodeTypeRequirement()
	 * @generated
	 */
	EAttribute getDeploymentToNodeTypeRequirement_ValidTypes();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement <em>Deployment To Node With Property Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment To Node With Property Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement
	 * @generated
	 */
	EClass getDeploymentToNodeWithPropertyRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMin()
	 * @see #getDeploymentToNodeWithPropertyRequirement()
	 * @generated
	 */
	EAttribute getDeploymentToNodeWithPropertyRequirement_Min();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMax()
	 * @see #getDeploymentToNodeWithPropertyRequirement()
	 * @generated
	 */
	EAttribute getDeploymentToNodeWithPropertyRequirement_Max();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getValues()
	 * @see #getDeploymentToNodeWithPropertyRequirement()
	 * @generated
	 */
	EAttribute getDeploymentToNodeWithPropertyRequirement_Values();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement <em>Deployment To Specific Node Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment To Specific Node Requirement</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement
	 * @generated
	 */
	EClass getDeploymentToSpecificNodeRequirement();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement#getValidElements <em>Valid Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Elements</em>'.
	 * @see eu.piacere.doml.doml.commons.DeploymentToSpecificNodeRequirement#getValidElements()
	 * @see #getDeploymentToSpecificNodeRequirement()
	 * @generated
	 */
	EReference getDeploymentToSpecificNodeRequirement_ValidElements();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see eu.piacere.doml.doml.commons.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.KeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pair</em>'.
	 * @see eu.piacere.doml.doml.commons.KeyPair
	 * @generated
	 */
	EClass getKeyPair();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.KeyPair#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see eu.piacere.doml.doml.commons.KeyPair#getUser()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_User();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.KeyPair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.piacere.doml.doml.commons.KeyPair#getKey()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Key();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.KeyPair#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see eu.piacere.doml.doml.commons.KeyPair#getAlgorithm()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.KeyPair#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see eu.piacere.doml.doml.commons.KeyPair#getBits()
	 * @see #getKeyPair()
	 * @generated
	 */
	EAttribute getKeyPair_Bits();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.UserPass <em>User Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Pass</em>'.
	 * @see eu.piacere.doml.doml.commons.UserPass
	 * @generated
	 */
	EClass getUserPass();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.UserPass#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see eu.piacere.doml.doml.commons.UserPass#getUsername()
	 * @see #getUserPass()
	 * @generated
	 */
	EAttribute getUserPass_Username();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.UserPass#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see eu.piacere.doml.doml.commons.UserPass#getPassword()
	 * @see #getUserPass()
	 * @generated
	 */
	EAttribute getUserPass_Password();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.commons.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see eu.piacere.doml.doml.commons.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Source#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry</em>'.
	 * @see eu.piacere.doml.doml.commons.Source#getEntry()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Entry();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Source#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory</em>'.
	 * @see eu.piacere.doml.doml.commons.Source#getInventory()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Inventory();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.commons.Source#getBackend <em>Backend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backend</em>'.
	 * @see eu.piacere.doml.doml.commons.Source#getBackend()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Backend();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonsFactory getCommonsFactory();

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
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl <em>DOML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DOMLModelImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDOMLModel()
		 * @generated
		 */
		EClass DOML_MODEL = eINSTANCE.getDOMLModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOML_MODEL__VERSION = eINSTANCE.getDOMLModel_Version();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__APPLICATION = eINSTANCE.getDOMLModel_Application();

		/**
		 * The meta object literal for the '<em><b>Infrastructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__INFRASTRUCTURE = eINSTANCE.getDOMLModel_Infrastructure();

		/**
		 * The meta object literal for the '<em><b>Concretizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__CONCRETIZATIONS = eINSTANCE.getDOMLModel_Concretizations();

		/**
		 * The meta object literal for the '<em><b>Optimization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__OPTIMIZATION = eINSTANCE.getDOMLModel_Optimization();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__CONFIGURATIONS = eINSTANCE.getDOMLModel_Configurations();

		/**
		 * The meta object literal for the '<em><b>Active Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__ACTIVE_CONFIGURATION = eINSTANCE.getDOMLModel_ActiveConfiguration();

		/**
		 * The meta object literal for the '<em><b>Active Infrastructure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__ACTIVE_INFRASTRUCTURE = eINSTANCE.getDOMLModel_ActiveInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Functional Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_MODEL__FUNCTIONAL_REQUIREMENTS = eINSTANCE.getDOMLModel_FunctionalRequirements();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.PropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.ListPropertyImpl <em>List Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.ListPropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getListProperty()
		 * @generated
		 */
		EClass LIST_PROPERTY = eINSTANCE.getListProperty();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_PROPERTY__VALUES = eINSTANCE.getListProperty_Values();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.IPropertyImpl <em>IProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.IPropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getIProperty()
		 * @generated
		 */
		EClass IPROPERTY = eINSTANCE.getIProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPROPERTY__VALUE = eINSTANCE.getIProperty_Value();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.SPropertyImpl <em>SProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.SPropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getSProperty()
		 * @generated
		 */
		EClass SPROPERTY = eINSTANCE.getSProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPROPERTY__VALUE = eINSTANCE.getSProperty_Value();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.FPropertyImpl <em>FProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.FPropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getFProperty()
		 * @generated
		 */
		EClass FPROPERTY = eINSTANCE.getFProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPROPERTY__VALUE = eINSTANCE.getFProperty_Value();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.BPropertyImpl <em>BProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.BPropertyImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getBProperty()
		 * @generated
		 */
		EClass BPROPERTY = eINSTANCE.getBProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPROPERTY__VALUE = eINSTANCE.getBProperty_Value();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.ExtensionElementImpl <em>Extension Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.ExtensionElementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getExtensionElement()
		 * @generated
		 */
		EClass EXTENSION_ELEMENT = eINSTANCE.getExtensionElement();

		/**
		 * The meta object literal for the '<em><b>Metaclass Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ELEMENT__METACLASS_NAME = eINSTANCE.getExtensionElement_MetaclassName();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DOMLElementImpl <em>DOML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DOMLElementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDOMLElement()
		 * @generated
		 */
		EClass DOML_ELEMENT = eINSTANCE.getDOMLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOML_ELEMENT__NAME = eINSTANCE.getDOMLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOML_ELEMENT__DESCRIPTION = eINSTANCE.getDOMLElement_Description();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_ELEMENT__ANNOTATIONS = eINSTANCE.getDOMLElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Contributes To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOML_ELEMENT__CONTRIBUTES_TO = eINSTANCE.getDOMLElement_ContributesTo();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.ConfigurationImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DEPLOYMENTS = eINSTANCE.getConfiguration_Deployments();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeployableElementImpl <em>Deployable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeployableElementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeployableElement()
		 * @generated
		 */
		EClass DEPLOYABLE_ELEMENT = eINSTANCE.getDeployableElement();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeploymentImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__COMPONENT = eINSTANCE.getDeployment_Component();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__NODE = eINSTANCE.getDeployment_Node();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.RequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PROPERTY = eINSTANCE.getRequirement_Property();

		/**
		 * The meta object literal for the '<em><b>Predicates On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PREDICATES_ON = eINSTANCE.getRequirement_PredicatesOn();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.RangedRequirementImpl <em>Ranged Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.RangedRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getRangedRequirement()
		 * @generated
		 */
		EClass RANGED_REQUIREMENT = eINSTANCE.getRangedRequirement();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGED_REQUIREMENT__MIN = eINSTANCE.getRangedRequirement_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGED_REQUIREMENT__MAX = eINSTANCE.getRangedRequirement_Max();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.EnumeratedRequirementImpl <em>Enumerated Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.EnumeratedRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getEnumeratedRequirement()
		 * @generated
		 */
		EClass ENUMERATED_REQUIREMENT = eINSTANCE.getEnumeratedRequirement();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATED_REQUIREMENT__VALUES = eINSTANCE.getEnumeratedRequirement_Values();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentRequirementImpl <em>Deployment Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeploymentRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentRequirement()
		 * @generated
		 */
		EClass DEPLOYMENT_REQUIREMENT = eINSTANCE.getDeploymentRequirement();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeTypeRequirementImpl <em>Deployment To Node Type Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeploymentToNodeTypeRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToNodeTypeRequirement()
		 * @generated
		 */
		EClass DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT = eINSTANCE.getDeploymentToNodeTypeRequirement();

		/**
		 * The meta object literal for the '<em><b>Valid Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TO_NODE_TYPE_REQUIREMENT__VALID_TYPES = eINSTANCE.getDeploymentToNodeTypeRequirement_ValidTypes();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl <em>Deployment To Node With Property Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeploymentToNodeWithPropertyRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToNodeWithPropertyRequirement()
		 * @generated
		 */
		EClass DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT = eINSTANCE.getDeploymentToNodeWithPropertyRequirement();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MIN = eINSTANCE.getDeploymentToNodeWithPropertyRequirement_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__MAX = eINSTANCE.getDeploymentToNodeWithPropertyRequirement_Max();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_TO_NODE_WITH_PROPERTY_REQUIREMENT__VALUES = eINSTANCE.getDeploymentToNodeWithPropertyRequirement_Values();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.DeploymentToSpecificNodeRequirementImpl <em>Deployment To Specific Node Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.DeploymentToSpecificNodeRequirementImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getDeploymentToSpecificNodeRequirement()
		 * @generated
		 */
		EClass DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT = eINSTANCE.getDeploymentToSpecificNodeRequirement();

		/**
		 * The meta object literal for the '<em><b>Valid Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_TO_SPECIFIC_NODE_REQUIREMENT__VALID_ELEMENTS = eINSTANCE.getDeploymentToSpecificNodeRequirement_ValidElements();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.CredentialsImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.KeyPairImpl <em>Key Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.KeyPairImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getKeyPair()
		 * @generated
		 */
		EClass KEY_PAIR = eINSTANCE.getKeyPair();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__USER = eINSTANCE.getKeyPair_User();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__KEY = eINSTANCE.getKeyPair_Key();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__ALGORITHM = eINSTANCE.getKeyPair_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PAIR__BITS = eINSTANCE.getKeyPair_Bits();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.UserPassImpl <em>User Pass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.UserPassImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getUserPass()
		 * @generated
		 */
		EClass USER_PASS = eINSTANCE.getUserPass();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PASS__USERNAME = eINSTANCE.getUserPass_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PASS__PASSWORD = eINSTANCE.getUserPass_Password();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.commons.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.commons.impl.SourceImpl
		 * @see eu.piacere.doml.doml.commons.impl.CommonsPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ENTRY = eINSTANCE.getSource_Entry();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__INVENTORY = eINSTANCE.getSource_Inventory();

		/**
		 * The meta object literal for the '<em><b>Backend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__BACKEND = eINSTANCE.getSource_Backend();

	}

} //CommonsPackage

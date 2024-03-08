/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.CommonsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eu.piacere.doml.doml.infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.piacere-project.eu/doml/infrastructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "infra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
	 * @generated
	 */
	int INFRASTRUCTURE_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__NODES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__GENERATORS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__STORAGES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Faas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__FAAS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__CREDENTIALS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__GROUPS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__SECURITY_GROUPS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__NETWORKS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER__RULES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_LAYER_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl <em>Monitoring Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getMonitoringRule()
	 * @generated
	 */
	int MONITORING_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__CONDITION = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__STRATEGY = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Configuration String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__STRATEGY_CONFIGURATION_STRING = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitoring Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingGroupImpl <em>Computing Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingGroupImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingGroup()
	 * @generated
	 */
	int COMPUTING_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Grouped Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP__GROUPED_NODES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_GROUP_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getAutoScalingGroup()
	 * @generated
	 */
	int AUTO_SCALING_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__NAME = COMPUTING_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__DESCRIPTION = COMPUTING_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__ANNOTATIONS = COMPUTING_GROUP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__CONTRIBUTES_TO = COMPUTING_GROUP__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Grouped Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__GROUPED_NODES = COMPUTING_GROUP__GROUPED_NODES;

	/**
	 * The feature id for the '<em><b>Machine Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MACHINE_DEFINITION = COMPUTING_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MIN = COMPUTING_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__MAX = COMPUTING_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load Balancer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP__LOAD_BALANCER = COMPUTING_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Auto Scaling Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_SCALING_GROUP_FEATURE_COUNT = COMPUTING_GROUP_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.RuleImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__KIND = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PROTOCOL = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM_PORT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TO_PORT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CIDR = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__RULES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__IFACES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructureElementImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureElement()
	 * @generated
	 */
	int INFRASTRUCTURE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ELEMENT__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ELEMENT__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ELEMENT__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_ELEMENT_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.NodeImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IFACES = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl <em>Computing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingNode()
	 * @generated
	 */
	int COMPUTING_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__CONTRIBUTES_TO = NODE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__IFACES = NODE__IFACES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__ARCHITECTURE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__OS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__MEMORY_MB = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__STORAGE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__CPU_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__COST = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__LOCATION = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__CREDENTIALS = NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__GROUP = NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Node Specific Monitoring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__NODE_SPECIFIC_MONITORING = NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Disabled Monitorings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE__DISABLED_MONITORINGS = NODE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeGeneratorImpl <em>Computing Node Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingNodeGeneratorImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingNodeGenerator()
	 * @generated
	 */
	int COMPUTING_NODE_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__URI = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR__KIND = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Computing Node Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_NODE_GENERATOR_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.VMImageImpl <em>VM Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.VMImageImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getVMImage()
	 * @generated
	 */
	int VM_IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__NAME = COMPUTING_NODE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__DESCRIPTION = COMPUTING_NODE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__ANNOTATIONS = COMPUTING_NODE_GENERATOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__CONTRIBUTES_TO = COMPUTING_NODE_GENERATOR__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__URI = COMPUTING_NODE_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__KIND = COMPUTING_NODE_GENERATOR__KIND;

	/**
	 * The feature id for the '<em><b>Generated VMs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE__GENERATED_VMS = COMPUTING_NODE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_IMAGE_FEATURE_COUNT = COMPUTING_NODE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImageImpl <em>Container Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerImageImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerImage()
	 * @generated
	 */
	int CONTAINER_IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__NAME = COMPUTING_NODE_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__DESCRIPTION = COMPUTING_NODE_GENERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__ANNOTATIONS = COMPUTING_NODE_GENERATOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__CONTRIBUTES_TO = COMPUTING_NODE_GENERATOR__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__URI = COMPUTING_NODE_GENERATOR__URI;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__KIND = COMPUTING_NODE_GENERATOR__KIND;

	/**
	 * The feature id for the '<em><b>Generated Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE__GENERATED_CONTAINERS = COMPUTING_NODE_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMAGE_FEATURE_COUNT = COMPUTING_NODE_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.PhysicalComputingNodeImpl <em>Physical Computing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.PhysicalComputingNodeImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getPhysicalComputingNode()
	 * @generated
	 */
	int PHYSICAL_COMPUTING_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__NAME = COMPUTING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__DESCRIPTION = COMPUTING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__ANNOTATIONS = COMPUTING_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__CONTRIBUTES_TO = COMPUTING_NODE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__IFACES = COMPUTING_NODE__IFACES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__ARCHITECTURE = COMPUTING_NODE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__OS = COMPUTING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__MEMORY_MB = COMPUTING_NODE__MEMORY_MB;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__STORAGE = COMPUTING_NODE__STORAGE;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__CPU_COUNT = COMPUTING_NODE__CPU_COUNT;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__COST = COMPUTING_NODE__COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__LOCATION = COMPUTING_NODE__LOCATION;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__CREDENTIALS = COMPUTING_NODE__CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__GROUP = COMPUTING_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Node Specific Monitoring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__NODE_SPECIFIC_MONITORING = COMPUTING_NODE__NODE_SPECIFIC_MONITORING;

	/**
	 * The feature id for the '<em><b>Disabled Monitorings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__DISABLED_MONITORINGS = COMPUTING_NODE__DISABLED_MONITORINGS;

	/**
	 * The feature id for the '<em><b>Config Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE = COMPUTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_COMPUTING_NODE_FEATURE_COUNT = COMPUTING_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = COMPUTING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DESCRIPTION = COMPUTING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ANNOTATIONS = COMPUTING_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CONTRIBUTES_TO = COMPUTING_NODE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__IFACES = COMPUTING_NODE__IFACES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__ARCHITECTURE = COMPUTING_NODE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__OS = COMPUTING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__MEMORY_MB = COMPUTING_NODE__MEMORY_MB;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__STORAGE = COMPUTING_NODE__STORAGE;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CPU_COUNT = COMPUTING_NODE__CPU_COUNT;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__COST = COMPUTING_NODE__COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOCATION = COMPUTING_NODE__LOCATION;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CREDENTIALS = COMPUTING_NODE__CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__GROUP = COMPUTING_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Node Specific Monitoring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NODE_SPECIFIC_MONITORING = COMPUTING_NODE__NODE_SPECIFIC_MONITORING;

	/**
	 * The feature id for the '<em><b>Disabled Monitorings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DISABLED_MONITORINGS = COMPUTING_NODE__DISABLED_MONITORINGS;

	/**
	 * The feature id for the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SIZE_DESCRIPTION = COMPUTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__GENERATED_FROM = COMPUTING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CONFIG_INTERFACE = COMPUTING_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = COMPUTING_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.LocationImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REGION = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ZONE = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl <em>Container Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerConfig()
	 * @generated
	 */
	int CONTAINER_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Container port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__CONTAINER_PORT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vm port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__VM_PORT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG__IFACE = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIG_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl <em>Container Host Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerHostConfig()
	 * @generated
	 */
	int CONTAINER_HOST_CONFIG = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Environment variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__HOST = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG__CONFIGURATIONS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Host Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_HOST_CONFIG_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMPUTING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = COMPUTING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ANNOTATIONS = COMPUTING_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTRIBUTES_TO = COMPUTING_NODE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IFACES = COMPUTING_NODE__IFACES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ARCHITECTURE = COMPUTING_NODE__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OS = COMPUTING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MEMORY_MB = COMPUTING_NODE__MEMORY_MB;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STORAGE = COMPUTING_NODE__STORAGE;

	/**
	 * The feature id for the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CPU_COUNT = COMPUTING_NODE__CPU_COUNT;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COST = COMPUTING_NODE__COST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LOCATION = COMPUTING_NODE__LOCATION;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CREDENTIALS = COMPUTING_NODE__CREDENTIALS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GROUP = COMPUTING_NODE__GROUP;

	/**
	 * The feature id for the '<em><b>Node Specific Monitoring</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NODE_SPECIFIC_MONITORING = COMPUTING_NODE__NODE_SPECIFIC_MONITORING;

	/**
	 * The feature id for the '<em><b>Disabled Monitorings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISABLED_MONITORINGS = COMPUTING_NODE__DISABLED_MONITORINGS;

	/**
	 * The feature id for the '<em><b>Generated From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATED_FROM = COMPUTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HOST_CONFIGS = COMPUTING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NETWORKS = COMPUTING_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = COMPUTING_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEPENDS_ON = COMPUTING_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMPUTING_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl <em>Container Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerGroup()
	 * @generated
	 */
	int CONTAINER_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__NAME = COMPUTING_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__DESCRIPTION = COMPUTING_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__ANNOTATIONS = COMPUTING_GROUP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__CONTRIBUTES_TO = COMPUTING_GROUP__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Grouped Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__GROUPED_NODES = COMPUTING_GROUP__GROUPED_NODES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__SERVICES = COMPUTING_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__NETWORKS = COMPUTING_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP__VOLUMES = COMPUTING_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GROUP_FEATURE_COUNT = COMPUTING_GROUP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerNetworkImpl <em>Container Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerNetworkImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerNetwork()
	 * @generated
	 */
	int CONTAINER_NETWORK = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Container Network Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK__CONTAINER_NETWORK_NAME = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl <em>Container Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerVolume()
	 * @generated
	 */
	int CONTAINER_VOLUME = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Container Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__CONTAINER_VOLUME_NAME = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME__PATH = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VOLUME_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__SIZE = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__MAX_SIZE = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__LOCATION = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__NETWORK = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Security Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__SECURITY_GROUPS = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.NetworkImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PROTOCOL = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Ifaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONNECTED_IFACES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__GATEWAYS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNETS = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.SubnetImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__NAME = NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__DESCRIPTION = NETWORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__ANNOTATIONS = NETWORK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CONTRIBUTES_TO = NETWORK__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__PROTOCOL = NETWORK__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Connected Ifaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CONNECTED_IFACES = NETWORK__CONNECTED_IFACES;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__GATEWAYS = NETWORK__GATEWAYS;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__SUBNETS = NETWORK__SUBNETS;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CONNECTED_TO = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__SPEED = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__END_POINT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__BELONGS_TO = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Associated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__ASSOCIATED = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.InternetGatewayImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInternetGateway()
	 * @generated
	 */
	int INTERNET_GATEWAY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__ANNOTATIONS = NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__CONTRIBUTES_TO = NODE__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Ifaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__IFACES = NODE__IFACES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__ADDRESS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internet Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.StorageImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__LABEL = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SIZE_GB = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__COST = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.FunctionAsAServiceImpl <em>Function As AService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.FunctionAsAServiceImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getFunctionAsAService()
	 * @generated
	 */
	int FUNCTION_AS_ASERVICE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE__COST = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function As AService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_AS_ASERVICE_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.SwarmRoleImpl <em>Swarm Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.SwarmRoleImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSwarmRole()
	 * @generated
	 */
	int SWARM_ROLE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__NAME = CommonsPackage.DOML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__DESCRIPTION = CommonsPackage.DOML_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__ANNOTATIONS = CommonsPackage.DOML_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__CONTRIBUTES_TO = CommonsPackage.DOML_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__KIND = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE__NODES = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Swarm Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_ROLE_FEATURE_COUNT = CommonsPackage.DOML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.SwarmImpl <em>Swarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.SwarmImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSwarm()
	 * @generated
	 */
	int SWARM = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__NAME = COMPUTING_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__DESCRIPTION = COMPUTING_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__ANNOTATIONS = COMPUTING_GROUP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__CONTRIBUTES_TO = COMPUTING_GROUP__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Grouped Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__GROUPED_NODES = COMPUTING_GROUP__GROUPED_NODES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM__ROLES = COMPUTING_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_FEATURE_COUNT = COMPUTING_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.impl.ExtInfrastructureElementImpl <em>Ext Infrastructure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.impl.ExtInfrastructureElementImpl
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getExtInfrastructureElement()
	 * @generated
	 */
	int EXT_INFRASTRUCTURE_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT__NAME = INFRASTRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT__DESCRIPTION = INFRASTRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT__ANNOTATIONS = INFRASTRUCTURE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contributes To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO = INFRASTRUCTURE_ELEMENT__CONTRIBUTES_TO;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT__METACLASS_NAME = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ext Infrastructure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_INFRASTRUCTURE_ELEMENT_FEATURE_COUNT = INFRASTRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.LoadBalancerKind <em>Load Balancer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.LoadBalancerKind
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getLoadBalancerKind()
	 * @generated
	 */
	int LOAD_BALANCER_KIND = 31;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.RuleKind <em>Rule Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.RuleKind
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRuleKind()
	 * @generated
	 */
	int RULE_KIND = 32;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.GeneratorKind <em>Generator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.GeneratorKind
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getGeneratorKind()
	 * @generated
	 */
	int GENERATOR_KIND = 33;

	/**
	 * The meta object id for the '{@link eu.piacere.doml.doml.infrastructure.RoleKind <em>Role Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.piacere.doml.doml.infrastructure.RoleKind
	 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRoleKind()
	 * @generated
	 */
	int ROLE_KIND = 34;


	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer
	 * @generated
	 */
	EClass getInfrastructureLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNodes()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGenerators()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Generators();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getStorages <em>Storages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storages</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getStorages()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Storages();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getFaas <em>Faas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faas</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getFaas()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Faas();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getCredentials()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Credentials();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getExecutionEnvironments <em>Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Environments</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getExecutionEnvironments()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_ExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getGroups()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Groups</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getSecurityGroups()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_SecurityGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getNetworks()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureLayer#getRules()
	 * @see #getInfrastructureLayer()
	 * @generated
	 */
	EReference getInfrastructureLayer_Rules();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule <em>Monitoring Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Rule</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.MonitoringRule
	 * @generated
	 */
	EClass getMonitoringRule();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.MonitoringRule#getCondition()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategy()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategyConfigurationString <em>Strategy Configuration String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Configuration String</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategyConfigurationString()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_StrategyConfigurationString();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ComputingGroup <em>Computing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Group</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingGroup
	 * @generated
	 */
	EClass getComputingGroup();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.ComputingGroup#getGroupedNodes <em>Grouped Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Nodes</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingGroup#getGroupedNodes()
	 * @see #getComputingGroup()
	 * @generated
	 */
	EReference getComputingGroup_GroupedNodes();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup <em>Auto Scaling Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Scaling Group</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup
	 * @generated
	 */
	EClass getAutoScalingGroup();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMachineDefinition <em>Machine Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Machine Definition</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMachineDefinition()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EReference getAutoScalingGroup_MachineDefinition();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMin()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_Min();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMax()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_Max();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getLoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balancer</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getLoadBalancer()
	 * @see #getAutoScalingGroup()
	 * @generated
	 */
	EAttribute getAutoScalingGroup_LoadBalancer();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Rule#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule#getKind()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Kind();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Rule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule#getProtocol()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Rule#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule#getFromPort()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_FromPort();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Rule#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule#getToPort()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ToPort();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.infrastructure.Rule#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cidr</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Rule#getCidr()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Cidr();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.SecurityGroup#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SecurityGroup#getRules()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Rules();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.SecurityGroup#getIfaces <em>Ifaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ifaces</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SecurityGroup#getIfaces()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Ifaces();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.InfrastructureElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructureElement
	 * @generated
	 */
	EClass getInfrastructureElement();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.Node#getIfaces <em>Ifaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifaces</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Node#getIfaces()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Ifaces();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ComputingNode <em>Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Node</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode
	 * @generated
	 */
	EClass getComputingNode();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getArchitecture()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getOs()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Os();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getMemory_mb <em>Memory mb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory mb</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getMemory_mb()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Memory_mb();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getStorage()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Storage();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCpu_count <em>Cpu count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu count</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getCpu_count()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Cpu_count();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getCost()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_Cost();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getLocation()
	 * @see #getComputingNode()
	 * @generated
	 */
	EReference getComputingNode_Location();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credentials</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getCredentials()
	 * @see #getComputingNode()
	 * @generated
	 */
	EReference getComputingNode_Credentials();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup()
	 * @see #getComputingNode()
	 * @generated
	 */
	EReference getComputingNode_Group();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getNodeSpecificMonitoring <em>Node Specific Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Specific Monitoring</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getNodeSpecificMonitoring()
	 * @see #getComputingNode()
	 * @generated
	 */
	EReference getComputingNode_NodeSpecificMonitoring();

	/**
	 * Returns the meta object for the attribute list '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getDisabledMonitorings <em>Disabled Monitorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Disabled Monitorings</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getDisabledMonitorings()
	 * @see #getComputingNode()
	 * @generated
	 */
	EAttribute getComputingNode_DisabledMonitorings();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator <em>Computing Node Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Node Generator</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator
	 * @generated
	 */
	EClass getComputingNodeGenerator();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getUri()
	 * @see #getComputingNodeGenerator()
	 * @generated
	 */
	EAttribute getComputingNodeGenerator_Uri();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNodeGenerator#getKind()
	 * @see #getComputingNodeGenerator()
	 * @generated
	 */
	EAttribute getComputingNodeGenerator_Kind();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.VMImage <em>VM Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Image</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VMImage
	 * @generated
	 */
	EClass getVMImage();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.VMImage#getGeneratedVMs <em>Generated VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated VMs</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VMImage#getGeneratedVMs()
	 * @see #getVMImage()
	 * @generated
	 */
	EReference getVMImage_GeneratedVMs();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerImage <em>Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Image</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerImage
	 * @generated
	 */
	EClass getContainerImage();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerImage#getGeneratedContainers <em>Generated Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Containers</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerImage#getGeneratedContainers()
	 * @see #getContainerImage()
	 * @generated
	 */
	EReference getContainerImage_GeneratedContainers();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.PhysicalComputingNode <em>Physical Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Computing Node</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.PhysicalComputingNode
	 * @generated
	 */
	EClass getPhysicalComputingNode();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.PhysicalComputingNode#getConfigInterface <em>Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Interface</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.PhysicalComputingNode#getConfigInterface()
	 * @see #getPhysicalComputingNode()
	 * @generated
	 */
	EReference getPhysicalComputingNode_ConfigInterface();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getSizeDescription <em>Size Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Description</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine#getSizeDescription()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_SizeDescription();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generated From</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine#getGeneratedFrom()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_GeneratedFrom();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.VirtualMachine#getConfigInterface <em>Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Interface</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.VirtualMachine#getConfigInterface()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_ConfigInterface();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Location#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Location#getRegion()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Region();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Location#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Location#getZone()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Zone();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig <em>Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Config</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerConfig
	 * @generated
	 */
	EClass getContainerConfig();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getContainer_port <em>Container port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container port</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerConfig#getContainer_port()
	 * @see #getContainerConfig()
	 * @generated
	 */
	EAttribute getContainerConfig_Container_port();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getVm_port <em>Vm port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm port</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerConfig#getVm_port()
	 * @see #getContainerConfig()
	 * @generated
	 */
	EAttribute getContainerConfig_Vm_port();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.ContainerConfig#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iface</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerConfig#getIface()
	 * @see #getContainerConfig()
	 * @generated
	 */
	EReference getContainerConfig_Iface();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig <em>Container Host Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Host Config</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerHostConfig
	 * @generated
	 */
	EClass getContainerHostConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getEnvironment_variables <em>Environment variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment variables</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getEnvironment_variables()
	 * @see #getContainerHostConfig()
	 * @generated
	 */
	EReference getContainerHostConfig_Environment_variables();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getHost()
	 * @see #getContainerHostConfig()
	 * @generated
	 */
	EReference getContainerHostConfig_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerHostConfig#getConfigurations()
	 * @see #getContainerHostConfig()
	 * @generated
	 */
	EReference getContainerHostConfig_Configurations();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom <em>Generated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generated From</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container#getGeneratedFrom()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_GeneratedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.Container#getHostConfigs <em>Host Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Configs</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container#getHostConfigs()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_HostConfigs();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.Container#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networks</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container#getNetworks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Networks();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Volumes();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.Container#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Container#getDependsOn()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DependsOn();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerGroup <em>Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Group</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerGroup
	 * @generated
	 */
	EClass getContainerGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerGroup#getServices()
	 * @see #getContainerGroup()
	 * @generated
	 */
	EReference getContainerGroup_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerGroup#getNetworks()
	 * @see #getContainerGroup()
	 * @generated
	 */
	EReference getContainerGroup_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.ContainerGroup#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerGroup#getVolumes()
	 * @see #getContainerGroup()
	 * @generated
	 */
	EReference getContainerGroup_Volumes();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerNetwork <em>Container Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Network</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerNetwork
	 * @generated
	 */
	EClass getContainerNetwork();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ContainerNetwork#getContainerNetworkName <em>Container Network Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Network Name</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerNetwork#getContainerNetworkName()
	 * @see #getContainerNetwork()
	 * @generated
	 */
	EAttribute getContainerNetwork_ContainerNetworkName();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume <em>Container Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Volume</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerVolume
	 * @generated
	 */
	EClass getContainerVolume();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getContainerVolumeName <em>Container Volume Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Volume Name</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerVolume#getContainerVolumeName()
	 * @see #getContainerVolume()
	 * @generated
	 */
	EAttribute getContainerVolume_ContainerVolumeName();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ContainerVolume#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ContainerVolume#getPath()
	 * @see #getContainerVolume()
	 * @generated
	 */
	EAttribute getContainerVolume_Path();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSize()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_Size();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getMaxSize()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_MaxSize();

	/**
	 * Returns the meta object for the containment reference '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getLocation()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Location();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getNetwork()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Network();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSecurityGroups <em>Security Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Groups</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExecutionEnvironment#getSecurityGroups()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_SecurityGroups();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Network#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Network#getProtocol()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Protocol();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.Network#getConnectedIfaces <em>Connected Ifaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Ifaces</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Network#getConnectedIfaces()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_ConnectedIfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.Network#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gateways</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Network#getGateways()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Gateways();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.Network#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Network#getSubnets()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnets();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.Subnet#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Subnet#getConnectedTo()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getSpeed()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_Speed();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getEndPoint()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_EndPoint();

	/**
	 * Returns the meta object for the reference '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getBelongsTo()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EReference getNetworkInterface_BelongsTo();

	/**
	 * Returns the meta object for the reference list '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getAssociated <em>Associated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getAssociated()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EReference getNetworkInterface_Associated();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internet Gateway</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InternetGateway
	 * @generated
	 */
	EClass getInternetGateway();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.InternetGateway#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.InternetGateway#getAddress()
	 * @see #getInternetGateway()
	 * @generated
	 */
	EAttribute getInternetGateway_Address();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Storage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Storage#getLabel()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Label();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Storage#getSize_gb <em>Size gb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size gb</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Storage#getSize_gb()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Size_gb();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.Storage#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Storage#getCost()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Cost();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.FunctionAsAService <em>Function As AService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function As AService</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.FunctionAsAService
	 * @generated
	 */
	EClass getFunctionAsAService();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.FunctionAsAService#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.FunctionAsAService#getCost()
	 * @see #getFunctionAsAService()
	 * @generated
	 */
	EAttribute getFunctionAsAService_Cost();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.SwarmRole <em>Swarm Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Role</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SwarmRole
	 * @generated
	 */
	EClass getSwarmRole();

	/**
	 * Returns the meta object for the attribute '{@link eu.piacere.doml.doml.infrastructure.SwarmRole#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SwarmRole#getKind()
	 * @see #getSwarmRole()
	 * @generated
	 */
	EAttribute getSwarmRole_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.SwarmRole#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.SwarmRole#getNodes()
	 * @see #getSwarmRole()
	 * @generated
	 */
	EReference getSwarmRole_Nodes();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.Swarm <em>Swarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Swarm
	 * @generated
	 */
	EClass getSwarm();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.piacere.doml.doml.infrastructure.Swarm#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.Swarm#getRoles()
	 * @see #getSwarm()
	 * @generated
	 */
	EReference getSwarm_Roles();

	/**
	 * Returns the meta object for class '{@link eu.piacere.doml.doml.infrastructure.ExtInfrastructureElement <em>Ext Infrastructure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Infrastructure Element</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.ExtInfrastructureElement
	 * @generated
	 */
	EClass getExtInfrastructureElement();

	/**
	 * Returns the meta object for enum '{@link eu.piacere.doml.doml.infrastructure.LoadBalancerKind <em>Load Balancer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Balancer Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.LoadBalancerKind
	 * @generated
	 */
	EEnum getLoadBalancerKind();

	/**
	 * Returns the meta object for enum '{@link eu.piacere.doml.doml.infrastructure.RuleKind <em>Rule Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.RuleKind
	 * @generated
	 */
	EEnum getRuleKind();

	/**
	 * Returns the meta object for enum '{@link eu.piacere.doml.doml.infrastructure.GeneratorKind <em>Generator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.GeneratorKind
	 * @generated
	 */
	EEnum getGeneratorKind();

	/**
	 * Returns the meta object for enum '{@link eu.piacere.doml.doml.infrastructure.RoleKind <em>Role Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Kind</em>'.
	 * @see eu.piacere.doml.doml.infrastructure.RoleKind
	 * @generated
	 */
	EEnum getRoleKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

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
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructureLayerImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureLayer()
		 * @generated
		 */
		EClass INFRASTRUCTURE_LAYER = eINSTANCE.getInfrastructureLayer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__NODES = eINSTANCE.getInfrastructureLayer_Nodes();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__GENERATORS = eINSTANCE.getInfrastructureLayer_Generators();

		/**
		 * The meta object literal for the '<em><b>Storages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__STORAGES = eINSTANCE.getInfrastructureLayer_Storages();

		/**
		 * The meta object literal for the '<em><b>Faas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__FAAS = eINSTANCE.getInfrastructureLayer_Faas();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__CREDENTIALS = eINSTANCE.getInfrastructureLayer_Credentials();

		/**
		 * The meta object literal for the '<em><b>Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__EXECUTION_ENVIRONMENTS = eINSTANCE.getInfrastructureLayer_ExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__GROUPS = eINSTANCE.getInfrastructureLayer_Groups();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__SECURITY_GROUPS = eINSTANCE.getInfrastructureLayer_SecurityGroups();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__NETWORKS = eINSTANCE.getInfrastructureLayer_Networks();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_LAYER__RULES = eINSTANCE.getInfrastructureLayer_Rules();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl <em>Monitoring Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getMonitoringRule()
		 * @generated
		 */
		EClass MONITORING_RULE = eINSTANCE.getMonitoringRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__CONDITION = eINSTANCE.getMonitoringRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__STRATEGY = eINSTANCE.getMonitoringRule_Strategy();

		/**
		 * The meta object literal for the '<em><b>Strategy Configuration String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__STRATEGY_CONFIGURATION_STRING = eINSTANCE.getMonitoringRule_StrategyConfigurationString();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingGroupImpl <em>Computing Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingGroupImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingGroup()
		 * @generated
		 */
		EClass COMPUTING_GROUP = eINSTANCE.getComputingGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_GROUP__GROUPED_NODES = eINSTANCE.getComputingGroup_GroupedNodes();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl <em>Auto Scaling Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getAutoScalingGroup()
		 * @generated
		 */
		EClass AUTO_SCALING_GROUP = eINSTANCE.getAutoScalingGroup();

		/**
		 * The meta object literal for the '<em><b>Machine Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTO_SCALING_GROUP__MACHINE_DEFINITION = eINSTANCE.getAutoScalingGroup_MachineDefinition();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__MIN = eINSTANCE.getAutoScalingGroup_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__MAX = eINSTANCE.getAutoScalingGroup_Max();

		/**
		 * The meta object literal for the '<em><b>Load Balancer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_SCALING_GROUP__LOAD_BALANCER = eINSTANCE.getAutoScalingGroup_LoadBalancer();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.RuleImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__KIND = eINSTANCE.getRule_Kind();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PROTOCOL = eINSTANCE.getRule_Protocol();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__FROM_PORT = eINSTANCE.getRule_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TO_PORT = eINSTANCE.getRule_ToPort();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CIDR = eINSTANCE.getRule_Cidr();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.SecurityGroupImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__RULES = eINSTANCE.getSecurityGroup_Rules();

		/**
		 * The meta object literal for the '<em><b>Ifaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__IFACES = eINSTANCE.getSecurityGroup_Ifaces();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.InfrastructureElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructureElementImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInfrastructureElement()
		 * @generated
		 */
		EClass INFRASTRUCTURE_ELEMENT = eINSTANCE.getInfrastructureElement();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.NodeImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Ifaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IFACES = eINSTANCE.getNode_Ifaces();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl <em>Computing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingNode()
		 * @generated
		 */
		EClass COMPUTING_NODE = eINSTANCE.getComputingNode();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__ARCHITECTURE = eINSTANCE.getComputingNode_Architecture();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__OS = eINSTANCE.getComputingNode_Os();

		/**
		 * The meta object literal for the '<em><b>Memory mb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__MEMORY_MB = eINSTANCE.getComputingNode_Memory_mb();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__STORAGE = eINSTANCE.getComputingNode_Storage();

		/**
		 * The meta object literal for the '<em><b>Cpu count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__CPU_COUNT = eINSTANCE.getComputingNode_Cpu_count();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__COST = eINSTANCE.getComputingNode_Cost();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_NODE__LOCATION = eINSTANCE.getComputingNode_Location();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_NODE__CREDENTIALS = eINSTANCE.getComputingNode_Credentials();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_NODE__GROUP = eINSTANCE.getComputingNode_Group();

		/**
		 * The meta object literal for the '<em><b>Node Specific Monitoring</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_NODE__NODE_SPECIFIC_MONITORING = eINSTANCE.getComputingNode_NodeSpecificMonitoring();

		/**
		 * The meta object literal for the '<em><b>Disabled Monitorings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE__DISABLED_MONITORINGS = eINSTANCE.getComputingNode_DisabledMonitorings();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeGeneratorImpl <em>Computing Node Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ComputingNodeGeneratorImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getComputingNodeGenerator()
		 * @generated
		 */
		EClass COMPUTING_NODE_GENERATOR = eINSTANCE.getComputingNodeGenerator();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE_GENERATOR__URI = eINSTANCE.getComputingNodeGenerator_Uri();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_NODE_GENERATOR__KIND = eINSTANCE.getComputingNodeGenerator_Kind();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.VMImageImpl <em>VM Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.VMImageImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getVMImage()
		 * @generated
		 */
		EClass VM_IMAGE = eINSTANCE.getVMImage();

		/**
		 * The meta object literal for the '<em><b>Generated VMs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_IMAGE__GENERATED_VMS = eINSTANCE.getVMImage_GeneratedVMs();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImageImpl <em>Container Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerImageImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerImage()
		 * @generated
		 */
		EClass CONTAINER_IMAGE = eINSTANCE.getContainerImage();

		/**
		 * The meta object literal for the '<em><b>Generated Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_IMAGE__GENERATED_CONTAINERS = eINSTANCE.getContainerImage_GeneratedContainers();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.PhysicalComputingNodeImpl <em>Physical Computing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.PhysicalComputingNodeImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getPhysicalComputingNode()
		 * @generated
		 */
		EClass PHYSICAL_COMPUTING_NODE = eINSTANCE.getPhysicalComputingNode();

		/**
		 * The meta object literal for the '<em><b>Config Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_COMPUTING_NODE__CONFIG_INTERFACE = eINSTANCE.getPhysicalComputingNode_ConfigInterface();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.VirtualMachineImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Size Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__SIZE_DESCRIPTION = eINSTANCE.getVirtualMachine_SizeDescription();

		/**
		 * The meta object literal for the '<em><b>Generated From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__GENERATED_FROM = eINSTANCE.getVirtualMachine_GeneratedFrom();

		/**
		 * The meta object literal for the '<em><b>Config Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__CONFIG_INTERFACE = eINSTANCE.getVirtualMachine_ConfigInterface();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.LocationImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__REGION = eINSTANCE.getLocation_Region();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ZONE = eINSTANCE.getLocation_Zone();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl <em>Container Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerConfigImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerConfig()
		 * @generated
		 */
		EClass CONTAINER_CONFIG = eINSTANCE.getContainerConfig();

		/**
		 * The meta object literal for the '<em><b>Container port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CONFIG__CONTAINER_PORT = eINSTANCE.getContainerConfig_Container_port();

		/**
		 * The meta object literal for the '<em><b>Vm port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CONFIG__VM_PORT = eINSTANCE.getContainerConfig_Vm_port();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CONFIG__IFACE = eINSTANCE.getContainerConfig_Iface();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl <em>Container Host Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerHostConfigImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerHostConfig()
		 * @generated
		 */
		EClass CONTAINER_HOST_CONFIG = eINSTANCE.getContainerHostConfig();

		/**
		 * The meta object literal for the '<em><b>Environment variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_HOST_CONFIG__ENVIRONMENT_VARIABLES = eINSTANCE.getContainerHostConfig_Environment_variables();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_HOST_CONFIG__HOST = eINSTANCE.getContainerHostConfig_Host();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_HOST_CONFIG__CONFIGURATIONS = eINSTANCE.getContainerHostConfig_Configurations();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Generated From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__GENERATED_FROM = eINSTANCE.getContainer_GeneratedFrom();

		/**
		 * The meta object literal for the '<em><b>Host Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__HOST_CONFIGS = eINSTANCE.getContainer_HostConfigs();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__NETWORKS = eINSTANCE.getContainer_Networks();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DEPENDS_ON = eINSTANCE.getContainer_DependsOn();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl <em>Container Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerGroupImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerGroup()
		 * @generated
		 */
		EClass CONTAINER_GROUP = eINSTANCE.getContainerGroup();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_GROUP__SERVICES = eINSTANCE.getContainerGroup_Services();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_GROUP__NETWORKS = eINSTANCE.getContainerGroup_Networks();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_GROUP__VOLUMES = eINSTANCE.getContainerGroup_Volumes();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerNetworkImpl <em>Container Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerNetworkImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerNetwork()
		 * @generated
		 */
		EClass CONTAINER_NETWORK = eINSTANCE.getContainerNetwork();

		/**
		 * The meta object literal for the '<em><b>Container Network Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK__CONTAINER_NETWORK_NAME = eINSTANCE.getContainerNetwork_ContainerNetworkName();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl <em>Container Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ContainerVolumeImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getContainerVolume()
		 * @generated
		 */
		EClass CONTAINER_VOLUME = eINSTANCE.getContainerVolume();

		/**
		 * The meta object literal for the '<em><b>Container Volume Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_VOLUME__CONTAINER_VOLUME_NAME = eINSTANCE.getContainerVolume_ContainerVolumeName();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_VOLUME__PATH = eINSTANCE.getContainerVolume_Path();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ExecutionEnvironmentImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__SIZE = eINSTANCE.getExecutionEnvironment_Size();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__MAX_SIZE = eINSTANCE.getExecutionEnvironment_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__LOCATION = eINSTANCE.getExecutionEnvironment_Location();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__NETWORK = eINSTANCE.getExecutionEnvironment_Network();

		/**
		 * The meta object literal for the '<em><b>Security Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__SECURITY_GROUPS = eINSTANCE.getExecutionEnvironment_SecurityGroups();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.NetworkImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PROTOCOL = eINSTANCE.getNetwork_Protocol();

		/**
		 * The meta object literal for the '<em><b>Connected Ifaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__CONNECTED_IFACES = eINSTANCE.getNetwork_ConnectedIfaces();

		/**
		 * The meta object literal for the '<em><b>Gateways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__GATEWAYS = eINSTANCE.getNetwork_Gateways();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SUBNETS = eINSTANCE.getNetwork_Subnets();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.SubnetImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__CONNECTED_TO = eINSTANCE.getSubnet_ConnectedTo();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.NetworkInterfaceImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__SPEED = eINSTANCE.getNetworkInterface_Speed();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__END_POINT = eINSTANCE.getNetworkInterface_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE__BELONGS_TO = eINSTANCE.getNetworkInterface_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Associated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INTERFACE__ASSOCIATED = eINSTANCE.getNetworkInterface_Associated();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.InternetGatewayImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getInternetGateway()
		 * @generated
		 */
		EClass INTERNET_GATEWAY = eINSTANCE.getInternetGateway();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNET_GATEWAY__ADDRESS = eINSTANCE.getInternetGateway_Address();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.StorageImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__LABEL = eINSTANCE.getStorage_Label();

		/**
		 * The meta object literal for the '<em><b>Size gb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__SIZE_GB = eINSTANCE.getStorage_Size_gb();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__COST = eINSTANCE.getStorage_Cost();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.FunctionAsAServiceImpl <em>Function As AService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.FunctionAsAServiceImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getFunctionAsAService()
		 * @generated
		 */
		EClass FUNCTION_AS_ASERVICE = eINSTANCE.getFunctionAsAService();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_AS_ASERVICE__COST = eINSTANCE.getFunctionAsAService_Cost();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.SwarmRoleImpl <em>Swarm Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.SwarmRoleImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSwarmRole()
		 * @generated
		 */
		EClass SWARM_ROLE = eINSTANCE.getSwarmRole();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_ROLE__KIND = eINSTANCE.getSwarmRole_Kind();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM_ROLE__NODES = eINSTANCE.getSwarmRole_Nodes();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.SwarmImpl <em>Swarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.SwarmImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getSwarm()
		 * @generated
		 */
		EClass SWARM = eINSTANCE.getSwarm();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWARM__ROLES = eINSTANCE.getSwarm_Roles();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.impl.ExtInfrastructureElementImpl <em>Ext Infrastructure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.impl.ExtInfrastructureElementImpl
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getExtInfrastructureElement()
		 * @generated
		 */
		EClass EXT_INFRASTRUCTURE_ELEMENT = eINSTANCE.getExtInfrastructureElement();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.LoadBalancerKind <em>Load Balancer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.LoadBalancerKind
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getLoadBalancerKind()
		 * @generated
		 */
		EEnum LOAD_BALANCER_KIND = eINSTANCE.getLoadBalancerKind();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.RuleKind <em>Rule Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.RuleKind
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRuleKind()
		 * @generated
		 */
		EEnum RULE_KIND = eINSTANCE.getRuleKind();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.GeneratorKind <em>Generator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.GeneratorKind
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getGeneratorKind()
		 * @generated
		 */
		EEnum GENERATOR_KIND = eINSTANCE.getGeneratorKind();

		/**
		 * The meta object literal for the '{@link eu.piacere.doml.doml.infrastructure.RoleKind <em>Role Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.piacere.doml.doml.infrastructure.RoleKind
		 * @see eu.piacere.doml.doml.infrastructure.impl.InfrastructurePackageImpl#getRoleKind()
		 * @generated
		 */
		EEnum ROLE_KIND = eINSTANCE.getRoleKind();

	}

} //InfrastructurePackage

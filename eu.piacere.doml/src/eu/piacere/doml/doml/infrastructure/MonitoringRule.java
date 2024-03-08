/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategyConfigurationString <em>Strategy Configuration String</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getMonitoringRule()
 * @model
 * @generated
 */
public interface MonitoringRule extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getMonitoringRule_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see #setStrategy(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getMonitoringRule_Strategy()
	 * @model required="true"
	 * @generated
	 */
	String getStrategy();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Strategy Configuration String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Configuration String</em>' attribute.
	 * @see #setStrategyConfigurationString(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getMonitoringRule_StrategyConfigurationString()
	 * @model
	 * @generated
	 */
	String getStrategyConfigurationString();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.MonitoringRule#getStrategyConfigurationString <em>Strategy Configuration String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Configuration String</em>' attribute.
	 * @see #getStrategyConfigurationString()
	 * @generated
	 */
	void setStrategyConfigurationString(String value);

} // MonitoringRule

/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.MonitoringRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.MonitoringRuleImpl#getStrategyConfigurationString <em>Strategy Configuration String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringRuleImpl extends DOMLElementImpl implements MonitoringRule {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrategyConfigurationString() <em>Strategy Configuration String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyConfigurationString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_CONFIGURATION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategyConfigurationString() <em>Strategy Configuration String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyConfigurationString()
	 * @generated
	 * @ordered
	 */
	protected String strategyConfigurationString = STRATEGY_CONFIGURATION_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.MONITORING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.MONITORING_RULE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.MONITORING_RULE__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategyConfigurationString() {
		return strategyConfigurationString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategyConfigurationString(String newStrategyConfigurationString) {
		String oldStrategyConfigurationString = strategyConfigurationString;
		strategyConfigurationString = newStrategyConfigurationString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.MONITORING_RULE__STRATEGY_CONFIGURATION_STRING, oldStrategyConfigurationString, strategyConfigurationString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.MONITORING_RULE__CONDITION:
				return getCondition();
			case InfrastructurePackage.MONITORING_RULE__STRATEGY:
				return getStrategy();
			case InfrastructurePackage.MONITORING_RULE__STRATEGY_CONFIGURATION_STRING:
				return getStrategyConfigurationString();
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
			case InfrastructurePackage.MONITORING_RULE__CONDITION:
				setCondition((String)newValue);
				return;
			case InfrastructurePackage.MONITORING_RULE__STRATEGY:
				setStrategy((String)newValue);
				return;
			case InfrastructurePackage.MONITORING_RULE__STRATEGY_CONFIGURATION_STRING:
				setStrategyConfigurationString((String)newValue);
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
			case InfrastructurePackage.MONITORING_RULE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case InfrastructurePackage.MONITORING_RULE__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case InfrastructurePackage.MONITORING_RULE__STRATEGY_CONFIGURATION_STRING:
				setStrategyConfigurationString(STRATEGY_CONFIGURATION_STRING_EDEFAULT);
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
			case InfrastructurePackage.MONITORING_RULE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case InfrastructurePackage.MONITORING_RULE__STRATEGY:
				return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
			case InfrastructurePackage.MONITORING_RULE__STRATEGY_CONFIGURATION_STRING:
				return STRATEGY_CONFIGURATION_STRING_EDEFAULT == null ? strategyConfigurationString != null : !STRATEGY_CONFIGURATION_STRING_EDEFAULT.equals(strategyConfigurationString);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", strategy: ");
		result.append(strategy);
		result.append(", strategyConfigurationString: ");
		result.append(strategyConfigurationString);
		result.append(')');
		return result.toString();
	}

} //MonitoringRuleImpl

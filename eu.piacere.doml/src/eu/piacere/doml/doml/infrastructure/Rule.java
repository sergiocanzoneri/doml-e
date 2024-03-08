/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Rule#getKind <em>Kind</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Rule#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Rule#getFromPort <em>From Port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Rule#getToPort <em>To Port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Rule#getCidr <em>Cidr</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.piacere.doml.doml.infrastructure.RuleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.RuleKind
	 * @see #setKind(RuleKind)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule_Kind()
	 * @model
	 * @generated
	 */
	RuleKind getKind();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Rule#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.RuleKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RuleKind value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Rule#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' attribute.
	 * @see #setFromPort(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule_FromPort()
	 * @model
	 * @generated
	 */
	Integer getFromPort();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Rule#getFromPort <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' attribute.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Integer value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' attribute.
	 * @see #setToPort(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule_ToPort()
	 * @model
	 * @generated
	 */
	Integer getToPort();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.Rule#getToPort <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' attribute.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRule_Cidr()
	 * @model
	 * @generated
	 */
	EList<String> getCidr();

} // Rule

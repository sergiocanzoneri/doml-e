/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.SecurityGroup#getRules <em>Rules</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.SecurityGroup#getIfaces <em>Ifaces</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSecurityGroup_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Ifaces</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.NetworkInterface}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.NetworkInterface#getAssociated <em>Associated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifaces</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSecurityGroup_Ifaces()
	 * @see eu.piacere.doml.doml.infrastructure.NetworkInterface#getAssociated
	 * @model opposite="associated"
	 * @generated
	 */
	EList<NetworkInterface> getIfaces();

} // SecurityGroup

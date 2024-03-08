/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.SwarmRole#getKind <em>Kind</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.SwarmRole#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSwarmRole()
 * @model
 * @generated
 */
public interface SwarmRole extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.piacere.doml.doml.infrastructure.RoleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.RoleKind
	 * @see #setKind(RoleKind)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSwarmRole_Kind()
	 * @model
	 * @generated
	 */
	RoleKind getKind();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.SwarmRole#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.RoleKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RoleKind value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ComputingNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSwarmRole_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputingNode> getNodes();

} // SwarmRole

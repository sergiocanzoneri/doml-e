/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Swarm#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSwarm()
 * @model
 * @generated
 */
public interface Swarm extends ComputingGroup {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.SwarmRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSwarm_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwarmRole> getRoles();

} // Swarm

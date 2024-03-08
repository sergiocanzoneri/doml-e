/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Node#getIfaces <em>Ifaces</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends InfrastructureElement {
	/**
	 * Returns the value of the '<em><b>Ifaces</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifaces</em>' containment reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getNode_Ifaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkInterface> getIfaces();

} // Node

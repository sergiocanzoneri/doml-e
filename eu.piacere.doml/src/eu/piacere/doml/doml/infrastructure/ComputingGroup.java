/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingGroup#getGroupedNodes <em>Grouped Nodes</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingGroup()
 * @model abstract="true"
 * @generated
 */
public interface ComputingGroup extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Grouped Nodes</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.ComputingNode}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Nodes</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingGroup_GroupedNodes()
	 * @see eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<ComputingNode> getGroupedNodes();

} // ComputingGroup

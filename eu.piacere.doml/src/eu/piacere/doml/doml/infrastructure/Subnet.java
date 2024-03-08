/**
 */
package eu.piacere.doml.doml.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.Subnet#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends Network {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getSubnet_ConnectedTo()
	 * @model
	 * @generated
	 */
	EList<Subnet> getConnectedTo();

} // Subnet

/**
 */
package eu.piacere.doml.doml.concrete;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.ConcreteInfrastructure#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteInfrastructure()
 * @model
 * @generated
 */
public interface ConcreteInfrastructure extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.RuntimeProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteInfrastructure_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeProvider> getProviders();

} // ConcreteInfrastructure

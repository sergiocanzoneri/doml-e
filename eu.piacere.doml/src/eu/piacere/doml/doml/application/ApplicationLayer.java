/**
 */
package eu.piacere.doml.doml.application;

import eu.piacere.doml.doml.commons.DOMLElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.ApplicationLayer#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.application.ApplicationPackage#getApplicationLayer()
 * @model
 * @generated
 */
public interface ApplicationLayer extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.application.ApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getApplicationLayer_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationComponent> getComponents();

} // ApplicationLayer

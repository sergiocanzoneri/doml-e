/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.ReferenceElement#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getReferenceElement()
 * @model
 * @generated
 */
public interface ReferenceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.ReferenceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getReferenceElement_Refs()
	 * @model
	 * @generated
	 */
	EList<ReferenceElement> getRefs();

} // ReferenceElement

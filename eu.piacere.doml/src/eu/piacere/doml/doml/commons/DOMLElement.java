/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLElement#getName <em>Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLElement#getDescription <em>Description</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLElement#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLElement#getContributesTo <em>Contributes To</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLElement()
 * @model abstract="true"
 * @generated
 */
public interface DOMLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLElement_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Contributes To</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Requirement}.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.commons.Requirement#getPredicatesOn <em>Predicates On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To</em>' reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLElement_ContributesTo()
	 * @see eu.piacere.doml.doml.commons.Requirement#getPredicatesOn
	 * @model opposite="predicatesOn"
	 * @generated
	 */
	EList<Requirement> getContributesTo();

} // DOMLElement

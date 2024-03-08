/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.ExtensionElement#getMetaclassName <em>Metaclass Name</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getExtensionElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtensionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Name</em>' attribute.
	 * @see #setMetaclassName(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getExtensionElement_MetaclassName()
	 * @model
	 * @generated
	 */
	String getMetaclassName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.ExtensionElement#getMetaclassName <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass Name</em>' attribute.
	 * @see #getMetaclassName()
	 * @generated
	 */
	void setMetaclassName(String value);

} // ExtensionElement

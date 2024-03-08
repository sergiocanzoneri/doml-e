/**
 */
package eu.piacere.doml.doml.concrete;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.ReferenceElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.ConcreteElement#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.ConcreteElement#getConfigurationScript <em>Configuration Script</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.ConcreteElement#getPreexisting <em>Preexisting</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.ConcreteElement#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteElement()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteElement extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteElement_ResourceName()
	 * @model
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Script</em>' attribute.
	 * @see #setConfigurationScript(String)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteElement_ConfigurationScript()
	 * @model
	 * @generated
	 */
	String getConfigurationScript();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getConfigurationScript <em>Configuration Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Script</em>' attribute.
	 * @see #getConfigurationScript()
	 * @generated
	 */
	void setConfigurationScript(String value);

	/**
	 * Returns the value of the '<em><b>Preexisting</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preexisting</em>' attribute.
	 * @see #setPreexisting(Boolean)
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteElement_Preexisting()
	 * @model default="false"
	 * @generated
	 */
	Boolean getPreexisting();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.concrete.ConcreteElement#getPreexisting <em>Preexisting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preexisting</em>' attribute.
	 * @see #getPreexisting()
	 * @generated
	 */
	void setPreexisting(Boolean value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.ConcreteElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see eu.piacere.doml.doml.concrete.ConcretePackage#getConcreteElement_Refs()
	 * @model
	 * @generated
	 */
	EList<ConcreteElement> getRefs();

} // ConcreteElement

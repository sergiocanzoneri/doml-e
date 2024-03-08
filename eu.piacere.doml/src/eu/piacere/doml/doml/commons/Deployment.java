/**
 */
package eu.piacere.doml.doml.commons;

import eu.piacere.doml.doml.infrastructure.InfrastructureElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.Deployment#getComponent <em>Component</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.Deployment#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(DeployableElement)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeployment_Component()
	 * @model required="true"
	 * @generated
	 */
	DeployableElement getComponent();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Deployment#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(DeployableElement value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(InfrastructureElement)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeployment_Node()
	 * @model required="true"
	 * @generated
	 */
	InfrastructureElement getNode();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.Deployment#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(InfrastructureElement value);

} // Deployment

/**
 */
package eu.piacere.doml.doml.commons;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment To Node With Property Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMin <em>Min</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMax <em>Max</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeWithPropertyRequirement()
 * @model
 * @generated
 */
public interface DeploymentToNodeWithPropertyRequirement extends DeploymentRequirement {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Float)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeWithPropertyRequirement_Min()
	 * @model
	 * @generated
	 */
	Float getMin();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Float value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Float)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeWithPropertyRequirement_Max()
	 * @model
	 * @generated
	 */
	Float getMax();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DeploymentToNodeWithPropertyRequirement#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Float value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDeploymentToNodeWithPropertyRequirement_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // DeploymentToNodeWithPropertyRequirement

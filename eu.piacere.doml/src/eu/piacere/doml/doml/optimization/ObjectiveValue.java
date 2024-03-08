/**
 */
package eu.piacere.doml.doml.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getCost <em>Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getAvailability <em>Availability</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getObjectiveValue()
 * @model
 * @generated
 */
public interface ObjectiveValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Float)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getObjectiveValue_Cost()
	 * @model
	 * @generated
	 */
	Float getCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Float value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(Float)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getObjectiveValue_Availability()
	 * @model
	 * @generated
	 */
	Float getAvailability();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Float value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see #setPerformance(Float)
	 * @see eu.piacere.doml.doml.optimization.OptimizationPackage#getObjectiveValue_Performance()
	 * @model
	 * @generated
	 */
	Float getPerformance();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.optimization.ObjectiveValue#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Float value);

} // ObjectiveValue

/**
 */
package eu.piacere.doml.doml.commons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranged Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.RangedRequirement#getMin <em>Min</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.RangedRequirement#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRangedRequirement()
 * @model
 * @generated
 */
public interface RangedRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Float)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRangedRequirement_Min()
	 * @model
	 * @generated
	 */
	Float getMin();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.RangedRequirement#getMin <em>Min</em>}' attribute.
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
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getRangedRequirement_Max()
	 * @model
	 * @generated
	 */
	Float getMax();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.RangedRequirement#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Float value);

} // RangedRequirement

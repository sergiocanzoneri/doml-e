/**
 */
package eu.piacere.doml.doml.application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareInterface#getEndPoint <em>End Point</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareInterface()
 * @model
 * @generated
 */
public interface SoftwareInterface extends ApplicationComponent {
	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareInterface_EndPoint()
	 * @model
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SoftwareInterface#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

} // SoftwareInterface

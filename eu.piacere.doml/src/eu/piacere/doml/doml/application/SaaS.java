/**
 */
package eu.piacere.doml.doml.application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saa S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.SaaS#getLicenseCost <em>License Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SaaS#getExposedInterfaces <em>Exposed Interfaces</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaS()
 * @model
 * @generated
 */
public interface SaaS extends ApplicationComponent {
	/**
	 * Returns the value of the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Cost</em>' attribute.
	 * @see #setLicenseCost(Float)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaS_LicenseCost()
	 * @model
	 * @generated
	 */
	Float getLicenseCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SaaS#getLicenseCost <em>License Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Cost</em>' attribute.
	 * @see #getLicenseCost()
	 * @generated
	 */
	void setLicenseCost(Float value);

	/**
	 * Returns the value of the '<em><b>Exposed Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.application.SoftwareInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Interfaces</em>' containment reference list.
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSaaS_ExposedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareInterface> getExposedInterfaces();

} // SaaS

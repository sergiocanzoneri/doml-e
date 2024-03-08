/**
 */
package eu.piacere.doml.doml.application;

import eu.piacere.doml.doml.commons.Source;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareComponent#getIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareComponent#getLicenseCost <em>License Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareComponent#getExposedInterfaces <em>Exposed Interfaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareComponent#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.application.SoftwareComponent#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent()
 * @model
 * @generated
 */
public interface SoftwareComponent extends ApplicationComponent {
	/**
	 * Returns the value of the '<em><b>Is Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persistent</em>' attribute.
	 * @see #setIsPersistent(Boolean)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent_IsPersistent()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsPersistent();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SoftwareComponent#getIsPersistent <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persistent</em>' attribute.
	 * @see #getIsPersistent()
	 * @generated
	 */
	void setIsPersistent(Boolean value);

	/**
	 * Returns the value of the '<em><b>License Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Cost</em>' attribute.
	 * @see #setLicenseCost(Float)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent_LicenseCost()
	 * @model
	 * @generated
	 */
	Float getLicenseCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SoftwareComponent#getLicenseCost <em>License Cost</em>}' attribute.
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
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent_ExposedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareInterface> getExposedInterfaces();

	/**
	 * Returns the value of the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.application.SoftwareInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Interfaces</em>' reference list.
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent_ConsumedInterfaces()
	 * @model
	 * @generated
	 */
	EList<SoftwareInterface> getConsumedInterfaces();

	/**
	 * Returns the value of the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' containment reference.
	 * @see #setSrc(Source)
	 * @see eu.piacere.doml.doml.application.ApplicationPackage#getSoftwareComponent_Src()
	 * @model containment="true"
	 * @generated
	 */
	Source getSrc();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.application.SoftwareComponent#getSrc <em>Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' containment reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Source value);

} // SoftwareComponent

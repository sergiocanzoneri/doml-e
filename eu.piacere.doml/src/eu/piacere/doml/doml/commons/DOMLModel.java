/**
 */
package eu.piacere.doml.doml.commons;

import eu.piacere.doml.doml.application.ApplicationLayer;

import eu.piacere.doml.doml.concrete.ConcreteInfrastructure;

import eu.piacere.doml.doml.infrastructure.InfrastructureLayer;

import eu.piacere.doml.doml.optimization.OptimizationLayer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getConcretizations <em>Concretizations</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getOptimization <em>Optimization</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveConfiguration <em>Active Configuration</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveInfrastructure <em>Active Infrastructure</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.DOMLModel#getFunctionalRequirements <em>Functional Requirements</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel()
 * @model
 * @generated
 */
public interface DOMLModel extends DOMLElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"3.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Version()
	 * @model default="3.1" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(ApplicationLayer)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Application()
	 * @model containment="true"
	 * @generated
	 */
	ApplicationLayer getApplication();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(ApplicationLayer value);

	/**
	 * Returns the value of the '<em><b>Infrastructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure</em>' containment reference.
	 * @see #setInfrastructure(InfrastructureLayer)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Infrastructure()
	 * @model containment="true"
	 * @generated
	 */
	InfrastructureLayer getInfrastructure();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getInfrastructure <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure</em>' containment reference.
	 * @see #getInfrastructure()
	 * @generated
	 */
	void setInfrastructure(InfrastructureLayer value);

	/**
	 * Returns the value of the '<em><b>Concretizations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.concrete.ConcreteInfrastructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concretizations</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Concretizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteInfrastructure> getConcretizations();

	/**
	 * Returns the value of the '<em><b>Optimization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization</em>' containment reference.
	 * @see #setOptimization(OptimizationLayer)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Optimization()
	 * @model containment="true"
	 * @generated
	 */
	OptimizationLayer getOptimization();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getOptimization <em>Optimization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization</em>' containment reference.
	 * @see #getOptimization()
	 * @generated
	 */
	void setOptimization(OptimizationLayer value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Active Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Configuration</em>' reference.
	 * @see #setActiveConfiguration(Configuration)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_ActiveConfiguration()
	 * @model
	 * @generated
	 */
	Configuration getActiveConfiguration();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveConfiguration <em>Active Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Configuration</em>' reference.
	 * @see #getActiveConfiguration()
	 * @generated
	 */
	void setActiveConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Active Infrastructure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Infrastructure</em>' reference.
	 * @see #setActiveInfrastructure(ConcreteInfrastructure)
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_ActiveInfrastructure()
	 * @model
	 * @generated
	 */
	ConcreteInfrastructure getActiveInfrastructure();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.commons.DOMLModel#getActiveInfrastructure <em>Active Infrastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Infrastructure</em>' reference.
	 * @see #getActiveInfrastructure()
	 * @generated
	 */
	void setActiveInfrastructure(ConcreteInfrastructure value);

	/**
	 * Returns the value of the '<em><b>Functional Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.commons.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Requirements</em>' containment reference list.
	 * @see eu.piacere.doml.doml.commons.CommonsPackage#getDOMLModel_FunctionalRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getFunctionalRequirements();

} // DOMLModel

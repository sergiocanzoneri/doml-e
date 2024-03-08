/**
 */
package eu.piacere.doml.doml.commons.impl;

import eu.piacere.doml.doml.application.ApplicationLayer;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.Configuration;
import eu.piacere.doml.doml.commons.DOMLModel;
import eu.piacere.doml.doml.commons.Requirement;

import eu.piacere.doml.doml.concrete.ConcreteInfrastructure;

import eu.piacere.doml.doml.infrastructure.InfrastructureLayer;

import eu.piacere.doml.doml.optimization.OptimizationLayer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getConcretizations <em>Concretizations</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getOptimization <em>Optimization</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getActiveConfiguration <em>Active Configuration</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getActiveInfrastructure <em>Active Infrastructure</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.commons.impl.DOMLModelImpl#getFunctionalRequirements <em>Functional Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOMLModelImpl extends DOMLElementImpl implements DOMLModel {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "3.1";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected ApplicationLayer application;

	/**
	 * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureLayer infrastructure;

	/**
	 * The cached value of the '{@link #getConcretizations() <em>Concretizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcretizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteInfrastructure> concretizations;

	/**
	 * The cached value of the '{@link #getOptimization() <em>Optimization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimization()
	 * @generated
	 * @ordered
	 */
	protected OptimizationLayer optimization;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getActiveConfiguration() <em>Active Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration activeConfiguration;

	/**
	 * The cached value of the '{@link #getActiveInfrastructure() <em>Active Infrastructure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInfrastructure()
	 * @generated
	 * @ordered
	 */
	protected ConcreteInfrastructure activeInfrastructure;

	/**
	 * The cached value of the '{@link #getFunctionalRequirements() <em>Functional Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> functionalRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.DOML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLayer getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(ApplicationLayer newApplication, NotificationChain msgs) {
		ApplicationLayer oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(ApplicationLayer newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__APPLICATION, null, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__APPLICATION, null, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureLayer getInfrastructure() {
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfrastructure(InfrastructureLayer newInfrastructure, NotificationChain msgs) {
		InfrastructureLayer oldInfrastructure = infrastructure;
		infrastructure = newInfrastructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__INFRASTRUCTURE, oldInfrastructure, newInfrastructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfrastructure(InfrastructureLayer newInfrastructure) {
		if (newInfrastructure != infrastructure) {
			NotificationChain msgs = null;
			if (infrastructure != null)
				msgs = ((InternalEObject)infrastructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__INFRASTRUCTURE, null, msgs);
			if (newInfrastructure != null)
				msgs = ((InternalEObject)newInfrastructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__INFRASTRUCTURE, null, msgs);
			msgs = basicSetInfrastructure(newInfrastructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__INFRASTRUCTURE, newInfrastructure, newInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcreteInfrastructure> getConcretizations() {
		if (concretizations == null) {
			concretizations = new EObjectContainmentEList<ConcreteInfrastructure>(ConcreteInfrastructure.class, this, CommonsPackage.DOML_MODEL__CONCRETIZATIONS);
		}
		return concretizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptimizationLayer getOptimization() {
		return optimization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimization(OptimizationLayer newOptimization, NotificationChain msgs) {
		OptimizationLayer oldOptimization = optimization;
		optimization = newOptimization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__OPTIMIZATION, oldOptimization, newOptimization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimization(OptimizationLayer newOptimization) {
		if (newOptimization != optimization) {
			NotificationChain msgs = null;
			if (optimization != null)
				msgs = ((InternalEObject)optimization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__OPTIMIZATION, null, msgs);
			if (newOptimization != null)
				msgs = ((InternalEObject)newOptimization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonsPackage.DOML_MODEL__OPTIMIZATION, null, msgs);
			msgs = basicSetOptimization(newOptimization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__OPTIMIZATION, newOptimization, newOptimization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, CommonsPackage.DOML_MODEL__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getActiveConfiguration() {
		if (activeConfiguration != null && activeConfiguration.eIsProxy()) {
			InternalEObject oldActiveConfiguration = (InternalEObject)activeConfiguration;
			activeConfiguration = (Configuration)eResolveProxy(oldActiveConfiguration);
			if (activeConfiguration != oldActiveConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION, oldActiveConfiguration, activeConfiguration));
			}
		}
		return activeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetActiveConfiguration() {
		return activeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveConfiguration(Configuration newActiveConfiguration) {
		Configuration oldActiveConfiguration = activeConfiguration;
		activeConfiguration = newActiveConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION, oldActiveConfiguration, activeConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteInfrastructure getActiveInfrastructure() {
		if (activeInfrastructure != null && activeInfrastructure.eIsProxy()) {
			InternalEObject oldActiveInfrastructure = (InternalEObject)activeInfrastructure;
			activeInfrastructure = (ConcreteInfrastructure)eResolveProxy(oldActiveInfrastructure);
			if (activeInfrastructure != oldActiveInfrastructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE, oldActiveInfrastructure, activeInfrastructure));
			}
		}
		return activeInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteInfrastructure basicGetActiveInfrastructure() {
		return activeInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveInfrastructure(ConcreteInfrastructure newActiveInfrastructure) {
		ConcreteInfrastructure oldActiveInfrastructure = activeInfrastructure;
		activeInfrastructure = newActiveInfrastructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE, oldActiveInfrastructure, activeInfrastructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getFunctionalRequirements() {
		if (functionalRequirements == null) {
			functionalRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS);
		}
		return functionalRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonsPackage.DOML_MODEL__APPLICATION:
				return basicSetApplication(null, msgs);
			case CommonsPackage.DOML_MODEL__INFRASTRUCTURE:
				return basicSetInfrastructure(null, msgs);
			case CommonsPackage.DOML_MODEL__CONCRETIZATIONS:
				return ((InternalEList<?>)getConcretizations()).basicRemove(otherEnd, msgs);
			case CommonsPackage.DOML_MODEL__OPTIMIZATION:
				return basicSetOptimization(null, msgs);
			case CommonsPackage.DOML_MODEL__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS:
				return ((InternalEList<?>)getFunctionalRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonsPackage.DOML_MODEL__VERSION:
				return getVersion();
			case CommonsPackage.DOML_MODEL__APPLICATION:
				return getApplication();
			case CommonsPackage.DOML_MODEL__INFRASTRUCTURE:
				return getInfrastructure();
			case CommonsPackage.DOML_MODEL__CONCRETIZATIONS:
				return getConcretizations();
			case CommonsPackage.DOML_MODEL__OPTIMIZATION:
				return getOptimization();
			case CommonsPackage.DOML_MODEL__CONFIGURATIONS:
				return getConfigurations();
			case CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION:
				if (resolve) return getActiveConfiguration();
				return basicGetActiveConfiguration();
			case CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE:
				if (resolve) return getActiveInfrastructure();
				return basicGetActiveInfrastructure();
			case CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS:
				return getFunctionalRequirements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonsPackage.DOML_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case CommonsPackage.DOML_MODEL__APPLICATION:
				setApplication((ApplicationLayer)newValue);
				return;
			case CommonsPackage.DOML_MODEL__INFRASTRUCTURE:
				setInfrastructure((InfrastructureLayer)newValue);
				return;
			case CommonsPackage.DOML_MODEL__CONCRETIZATIONS:
				getConcretizations().clear();
				getConcretizations().addAll((Collection<? extends ConcreteInfrastructure>)newValue);
				return;
			case CommonsPackage.DOML_MODEL__OPTIMIZATION:
				setOptimization((OptimizationLayer)newValue);
				return;
			case CommonsPackage.DOML_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION:
				setActiveConfiguration((Configuration)newValue);
				return;
			case CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE:
				setActiveInfrastructure((ConcreteInfrastructure)newValue);
				return;
			case CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS:
				getFunctionalRequirements().clear();
				getFunctionalRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonsPackage.DOML_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CommonsPackage.DOML_MODEL__APPLICATION:
				setApplication((ApplicationLayer)null);
				return;
			case CommonsPackage.DOML_MODEL__INFRASTRUCTURE:
				setInfrastructure((InfrastructureLayer)null);
				return;
			case CommonsPackage.DOML_MODEL__CONCRETIZATIONS:
				getConcretizations().clear();
				return;
			case CommonsPackage.DOML_MODEL__OPTIMIZATION:
				setOptimization((OptimizationLayer)null);
				return;
			case CommonsPackage.DOML_MODEL__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION:
				setActiveConfiguration((Configuration)null);
				return;
			case CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE:
				setActiveInfrastructure((ConcreteInfrastructure)null);
				return;
			case CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS:
				getFunctionalRequirements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonsPackage.DOML_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CommonsPackage.DOML_MODEL__APPLICATION:
				return application != null;
			case CommonsPackage.DOML_MODEL__INFRASTRUCTURE:
				return infrastructure != null;
			case CommonsPackage.DOML_MODEL__CONCRETIZATIONS:
				return concretizations != null && !concretizations.isEmpty();
			case CommonsPackage.DOML_MODEL__OPTIMIZATION:
				return optimization != null;
			case CommonsPackage.DOML_MODEL__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case CommonsPackage.DOML_MODEL__ACTIVE_CONFIGURATION:
				return activeConfiguration != null;
			case CommonsPackage.DOML_MODEL__ACTIVE_INFRASTRUCTURE:
				return activeInfrastructure != null;
			case CommonsPackage.DOML_MODEL__FUNCTIONAL_REQUIREMENTS:
				return functionalRequirements != null && !functionalRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DOMLModelImpl

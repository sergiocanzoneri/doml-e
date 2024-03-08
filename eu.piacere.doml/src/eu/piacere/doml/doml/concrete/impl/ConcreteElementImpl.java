/**
 */
package eu.piacere.doml.doml.concrete.impl;

import eu.piacere.doml.doml.commons.CommonsPackage;
import eu.piacere.doml.doml.commons.ReferenceElement;
import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.concrete.ConcreteElement;
import eu.piacere.doml.doml.concrete.ConcretePackage;

import eu.piacere.doml.doml.concrete.GenericResource;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl#getConfigurationScript <em>Configuration Script</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl#getPreexisting <em>Preexisting</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.concrete.impl.ConcreteElementImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConcreteElementImpl extends DOMLElementImpl implements ConcreteElement {
	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationScript() <em>Configuration Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationScript()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationScript() <em>Configuration Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationScript()
	 * @generated
	 * @ordered
	 */
	protected String configurationScript = CONFIGURATION_SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreexisting() <em>Preexisting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreexisting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PREEXISTING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPreexisting() <em>Preexisting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreexisting()
	 * @generated
	 * @ordered
	 */
	protected Boolean preexisting = PREEXISTING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteElement> refs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretePackage.Literals.CONCRETE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CONCRETE_ELEMENT__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationScript() {
		return configurationScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationScript(String newConfigurationScript) {
		String oldConfigurationScript = configurationScript;
		configurationScript = newConfigurationScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CONCRETE_ELEMENT__CONFIGURATION_SCRIPT, oldConfigurationScript, configurationScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPreexisting() {
		return preexisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreexisting(Boolean newPreexisting) {
		Boolean oldPreexisting = preexisting;
		preexisting = newPreexisting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretePackage.CONCRETE_ELEMENT__PREEXISTING, oldPreexisting, preexisting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcreteElement> getRefs() {
		if (refs == null) {
			refs = new EObjectResolvingEList<ConcreteElement>(ConcreteElement.class, this, ConcretePackage.CONCRETE_ELEMENT__REFS);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretePackage.CONCRETE_ELEMENT__RESOURCE_NAME:
				return getResourceName();
			case ConcretePackage.CONCRETE_ELEMENT__CONFIGURATION_SCRIPT:
				return getConfigurationScript();
			case ConcretePackage.CONCRETE_ELEMENT__PREEXISTING:
				return getPreexisting();
			case ConcretePackage.CONCRETE_ELEMENT__REFS:
				return getRefs();
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
			case ConcretePackage.CONCRETE_ELEMENT__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__CONFIGURATION_SCRIPT:
				setConfigurationScript((String)newValue);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__PREEXISTING:
				setPreexisting((Boolean)newValue);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__REFS:
				getRefs().clear();
				getRefs().addAll((Collection<? extends ConcreteElement>)newValue);
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
			case ConcretePackage.CONCRETE_ELEMENT__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__CONFIGURATION_SCRIPT:
				setConfigurationScript(CONFIGURATION_SCRIPT_EDEFAULT);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__PREEXISTING:
				setPreexisting(PREEXISTING_EDEFAULT);
				return;
			case ConcretePackage.CONCRETE_ELEMENT__REFS:
				getRefs().clear();
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
			case ConcretePackage.CONCRETE_ELEMENT__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case ConcretePackage.CONCRETE_ELEMENT__CONFIGURATION_SCRIPT:
				return CONFIGURATION_SCRIPT_EDEFAULT == null ? configurationScript != null : !CONFIGURATION_SCRIPT_EDEFAULT.equals(configurationScript);
			case ConcretePackage.CONCRETE_ELEMENT__PREEXISTING:
				return PREEXISTING_EDEFAULT == null ? preexisting != null : !PREEXISTING_EDEFAULT.equals(preexisting);
			case ConcretePackage.CONCRETE_ELEMENT__REFS:
				return refs != null && !refs.isEmpty();
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
		result.append(" (resourceName: ");
		result.append(resourceName);
		result.append(", configurationScript: ");
		result.append(configurationScript);
		result.append(", preexisting: ");
		result.append(preexisting);
		result.append(')');
		return result.toString();
	}

} //ConcreteElementImpl

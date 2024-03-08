/**
 */
package eu.piacere.doml.doml.application.util;

import eu.piacere.doml.doml.application.*;

import eu.piacere.doml.doml.commons.DOMLElement;
import eu.piacere.doml.doml.commons.DeployableElement;
import eu.piacere.doml.doml.commons.ExtensionElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.application.ApplicationPackage
 * @generated
 */
public class ApplicationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSwitch() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApplicationPackage.APPLICATION_LAYER: {
				ApplicationLayer applicationLayer = (ApplicationLayer)theEObject;
				T result = caseApplicationLayer(applicationLayer);
				if (result == null) result = caseDOMLElement(applicationLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.APPLICATION_COMPONENT: {
				ApplicationComponent applicationComponent = (ApplicationComponent)theEObject;
				T result = caseApplicationComponent(applicationComponent);
				if (result == null) result = caseDOMLElement(applicationComponent);
				if (result == null) result = caseDeployableElement(applicationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.SOFTWARE_COMPONENT: {
				SoftwareComponent softwareComponent = (SoftwareComponent)theEObject;
				T result = caseSoftwareComponent(softwareComponent);
				if (result == null) result = caseApplicationComponent(softwareComponent);
				if (result == null) result = caseDOMLElement(softwareComponent);
				if (result == null) result = caseDeployableElement(softwareComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.DBMS: {
				DBMS dbms = (DBMS)theEObject;
				T result = caseDBMS(dbms);
				if (result == null) result = caseSoftwareComponent(dbms);
				if (result == null) result = caseApplicationComponent(dbms);
				if (result == null) result = caseDOMLElement(dbms);
				if (result == null) result = caseDeployableElement(dbms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.SAA_S: {
				SaaS saaS = (SaaS)theEObject;
				T result = caseSaaS(saaS);
				if (result == null) result = caseApplicationComponent(saaS);
				if (result == null) result = caseDOMLElement(saaS);
				if (result == null) result = caseDeployableElement(saaS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.SAA_SDBMS: {
				SaaSDBMS saaSDBMS = (SaaSDBMS)theEObject;
				T result = caseSaaSDBMS(saaSDBMS);
				if (result == null) result = caseSaaS(saaSDBMS);
				if (result == null) result = caseApplicationComponent(saaSDBMS);
				if (result == null) result = caseDOMLElement(saaSDBMS);
				if (result == null) result = caseDeployableElement(saaSDBMS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.SOFTWARE_INTERFACE: {
				SoftwareInterface softwareInterface = (SoftwareInterface)theEObject;
				T result = caseSoftwareInterface(softwareInterface);
				if (result == null) result = caseApplicationComponent(softwareInterface);
				if (result == null) result = caseDOMLElement(softwareInterface);
				if (result == null) result = caseDeployableElement(softwareInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.EXT_APPLICATION_COMPONENT: {
				ExtApplicationComponent extApplicationComponent = (ExtApplicationComponent)theEObject;
				T result = caseExtApplicationComponent(extApplicationComponent);
				if (result == null) result = caseApplicationComponent(extApplicationComponent);
				if (result == null) result = caseExtensionElement(extApplicationComponent);
				if (result == null) result = caseDOMLElement(extApplicationComponent);
				if (result == null) result = caseDeployableElement(extApplicationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLayer(ApplicationLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationComponent(ApplicationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareComponent(SoftwareComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBMS(DBMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saa S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saa S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaaS(SaaS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saa SDBMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saa SDBMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaaSDBMS(SaaSDBMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInterface(SoftwareInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ext Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ext Application Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtApplicationComponent(ExtApplicationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMLElement(DOMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployableElement(DeployableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElement(ExtensionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApplicationSwitch

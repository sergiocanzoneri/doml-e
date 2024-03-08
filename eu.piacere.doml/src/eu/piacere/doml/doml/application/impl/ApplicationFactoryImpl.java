/**
 */
package eu.piacere.doml.doml.application.impl;

import eu.piacere.doml.doml.application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.APPLICATION_LAYER: return createApplicationLayer();
			case ApplicationPackage.SOFTWARE_COMPONENT: return createSoftwareComponent();
			case ApplicationPackage.DBMS: return createDBMS();
			case ApplicationPackage.SAA_S: return createSaaS();
			case ApplicationPackage.SAA_SDBMS: return createSaaSDBMS();
			case ApplicationPackage.SOFTWARE_INTERFACE: return createSoftwareInterface();
			case ApplicationPackage.EXT_APPLICATION_COMPONENT: return createExtApplicationComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationLayer createApplicationLayer() {
		ApplicationLayerImpl applicationLayer = new ApplicationLayerImpl();
		return applicationLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBMS createDBMS() {
		DBMSImpl dbms = new DBMSImpl();
		return dbms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaaS createSaaS() {
		SaaSImpl saaS = new SaaSImpl();
		return saaS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaaSDBMS createSaaSDBMS() {
		SaaSDBMSImpl saaSDBMS = new SaaSDBMSImpl();
		return saaSDBMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareInterface createSoftwareInterface() {
		SoftwareInterfaceImpl softwareInterface = new SoftwareInterfaceImpl();
		return softwareInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtApplicationComponent createExtApplicationComponent() {
		ExtApplicationComponentImpl extApplicationComponent = new ExtApplicationComponentImpl();
		return extApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl

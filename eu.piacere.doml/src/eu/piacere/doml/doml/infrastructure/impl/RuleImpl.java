/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.impl.DOMLElementImpl;

import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.Rule;
import eu.piacere.doml.doml.infrastructure.RuleKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.RuleImpl#getCidr <em>Cidr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends DOMLElementImpl implements Rule {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final RuleKind KIND_EDEFAULT = RuleKind.EGRESS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected RuleKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FROM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected Integer fromPort = FROM_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TO_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected Integer toPort = TO_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cidr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RuleKind newKind) {
		RuleKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.RULE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.RULE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPort(Integer newFromPort) {
		Integer oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.RULE__FROM_PORT, oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPort(Integer newToPort) {
		Integer oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.RULE__TO_PORT, oldToPort, toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCidr() {
		if (cidr == null) {
			cidr = new EDataTypeUniqueEList<String>(String.class, this, InfrastructurePackage.RULE__CIDR);
		}
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.RULE__KIND:
				return getKind();
			case InfrastructurePackage.RULE__PROTOCOL:
				return getProtocol();
			case InfrastructurePackage.RULE__FROM_PORT:
				return getFromPort();
			case InfrastructurePackage.RULE__TO_PORT:
				return getToPort();
			case InfrastructurePackage.RULE__CIDR:
				return getCidr();
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
			case InfrastructurePackage.RULE__KIND:
				setKind((RuleKind)newValue);
				return;
			case InfrastructurePackage.RULE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case InfrastructurePackage.RULE__FROM_PORT:
				setFromPort((Integer)newValue);
				return;
			case InfrastructurePackage.RULE__TO_PORT:
				setToPort((Integer)newValue);
				return;
			case InfrastructurePackage.RULE__CIDR:
				getCidr().clear();
				getCidr().addAll((Collection<? extends String>)newValue);
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
			case InfrastructurePackage.RULE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfrastructurePackage.RULE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case InfrastructurePackage.RULE__FROM_PORT:
				setFromPort(FROM_PORT_EDEFAULT);
				return;
			case InfrastructurePackage.RULE__TO_PORT:
				setToPort(TO_PORT_EDEFAULT);
				return;
			case InfrastructurePackage.RULE__CIDR:
				getCidr().clear();
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
			case InfrastructurePackage.RULE__KIND:
				return kind != KIND_EDEFAULT;
			case InfrastructurePackage.RULE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case InfrastructurePackage.RULE__FROM_PORT:
				return FROM_PORT_EDEFAULT == null ? fromPort != null : !FROM_PORT_EDEFAULT.equals(fromPort);
			case InfrastructurePackage.RULE__TO_PORT:
				return TO_PORT_EDEFAULT == null ? toPort != null : !TO_PORT_EDEFAULT.equals(toPort);
			case InfrastructurePackage.RULE__CIDR:
				return cidr != null && !cidr.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", fromPort: ");
		result.append(fromPort);
		result.append(", toPort: ");
		result.append(toPort);
		result.append(", cidr: ");
		result.append(cidr);
		result.append(')');
		return result.toString();
	}

} //RuleImpl

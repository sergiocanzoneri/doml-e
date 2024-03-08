/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.commons.Credentials;

import eu.piacere.doml.doml.infrastructure.ComputingGroup;
import eu.piacere.doml.doml.infrastructure.ComputingNode;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.Location;
import eu.piacere.doml.doml.infrastructure.MonitoringRule;
import eu.piacere.doml.doml.infrastructure.NetworkInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getMemory_mb <em>Memory mb</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getNodeSpecificMonitoring <em>Node Specific Monitoring</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.ComputingNodeImpl#getDisabledMonitorings <em>Disabled Monitorings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComputingNodeImpl extends NodeImpl implements ComputingNode {
	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_mb() <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb()
	 * @generated
	 * @ordered
	 */
	protected static final Float MEMORY_MB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_mb() <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_mb()
	 * @generated
	 * @ordered
	 */
	protected Float memory_mb = MEMORY_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Float STORAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Float storage = STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CPU_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpu_count() <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_count()
	 * @generated
	 * @ordered
	 */
	protected Integer cpu_count = CPU_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Float COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Float cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected Credentials credentials;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected ComputingGroup group;

	/**
	 * The cached value of the '{@link #getNodeSpecificMonitoring() <em>Node Specific Monitoring</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSpecificMonitoring()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoringRule> nodeSpecificMonitoring;

	/**
	 * The cached value of the '{@link #getDisabledMonitorings() <em>Disabled Monitorings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabledMonitorings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> disabledMonitorings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.COMPUTING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMemory_mb() {
		return memory_mb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemory_mb(Float newMemory_mb) {
		Float oldMemory_mb = memory_mb;
		memory_mb = newMemory_mb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__MEMORY_MB, oldMemory_mb, memory_mb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage(Float newStorage) {
		Float oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCpu_count() {
		return cpu_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpu_count(Integer newCpu_count) {
		Integer oldCpu_count = cpu_count;
		cpu_count = newCpu_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__CPU_COUNT, oldCpu_count, cpu_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(Float newCost) {
		Float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.COMPUTING_NODE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.COMPUTING_NODE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Credentials getCredentials() {
		if (credentials != null && credentials.eIsProxy()) {
			InternalEObject oldCredentials = (InternalEObject)credentials;
			credentials = (Credentials)eResolveProxy(oldCredentials);
			if (credentials != oldCredentials) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.COMPUTING_NODE__CREDENTIALS, oldCredentials, credentials));
			}
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credentials basicGetCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredentials(Credentials newCredentials) {
		Credentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__CREDENTIALS, oldCredentials, credentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (ComputingGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfrastructurePackage.COMPUTING_NODE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ComputingGroup newGroup, NotificationChain msgs) {
		ComputingGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__GROUP, oldGroup, newGroup);
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
	public void setGroup(ComputingGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, InfrastructurePackage.COMPUTING_GROUP__GROUPED_NODES, ComputingGroup.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, InfrastructurePackage.COMPUTING_GROUP__GROUPED_NODES, ComputingGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTING_NODE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MonitoringRule> getNodeSpecificMonitoring() {
		if (nodeSpecificMonitoring == null) {
			nodeSpecificMonitoring = new EObjectResolvingEList<MonitoringRule>(MonitoringRule.class, this, InfrastructurePackage.COMPUTING_NODE__NODE_SPECIFIC_MONITORING);
		}
		return nodeSpecificMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDisabledMonitorings() {
		if (disabledMonitorings == null) {
			disabledMonitorings = new EDataTypeUniqueEList<String>(String.class, this, InfrastructurePackage.COMPUTING_NODE__DISABLED_MONITORINGS);
		}
		return disabledMonitorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, InfrastructurePackage.COMPUTING_GROUP__GROUPED_NODES, ComputingGroup.class, msgs);
				return basicSetGroup((ComputingGroup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.COMPUTING_NODE__LOCATION:
				return basicSetLocation(null, msgs);
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				return basicSetGroup(null, msgs);
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
			case InfrastructurePackage.COMPUTING_NODE__ARCHITECTURE:
				return getArchitecture();
			case InfrastructurePackage.COMPUTING_NODE__OS:
				return getOs();
			case InfrastructurePackage.COMPUTING_NODE__MEMORY_MB:
				return getMemory_mb();
			case InfrastructurePackage.COMPUTING_NODE__STORAGE:
				return getStorage();
			case InfrastructurePackage.COMPUTING_NODE__CPU_COUNT:
				return getCpu_count();
			case InfrastructurePackage.COMPUTING_NODE__COST:
				return getCost();
			case InfrastructurePackage.COMPUTING_NODE__LOCATION:
				return getLocation();
			case InfrastructurePackage.COMPUTING_NODE__CREDENTIALS:
				if (resolve) return getCredentials();
				return basicGetCredentials();
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case InfrastructurePackage.COMPUTING_NODE__NODE_SPECIFIC_MONITORING:
				return getNodeSpecificMonitoring();
			case InfrastructurePackage.COMPUTING_NODE__DISABLED_MONITORINGS:
				return getDisabledMonitorings();
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
			case InfrastructurePackage.COMPUTING_NODE__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__OS:
				setOs((String)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__MEMORY_MB:
				setMemory_mb((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__STORAGE:
				setStorage((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__CPU_COUNT:
				setCpu_count((Integer)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__COST:
				setCost((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__LOCATION:
				setLocation((Location)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__CREDENTIALS:
				setCredentials((Credentials)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				setGroup((ComputingGroup)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__NODE_SPECIFIC_MONITORING:
				getNodeSpecificMonitoring().clear();
				getNodeSpecificMonitoring().addAll((Collection<? extends MonitoringRule>)newValue);
				return;
			case InfrastructurePackage.COMPUTING_NODE__DISABLED_MONITORINGS:
				getDisabledMonitorings().clear();
				getDisabledMonitorings().addAll((Collection<? extends String>)newValue);
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
			case InfrastructurePackage.COMPUTING_NODE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__OS:
				setOs(OS_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__MEMORY_MB:
				setMemory_mb(MEMORY_MB_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__CPU_COUNT:
				setCpu_count(CPU_COUNT_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__COST:
				setCost(COST_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTING_NODE__LOCATION:
				setLocation((Location)null);
				return;
			case InfrastructurePackage.COMPUTING_NODE__CREDENTIALS:
				setCredentials((Credentials)null);
				return;
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				setGroup((ComputingGroup)null);
				return;
			case InfrastructurePackage.COMPUTING_NODE__NODE_SPECIFIC_MONITORING:
				getNodeSpecificMonitoring().clear();
				return;
			case InfrastructurePackage.COMPUTING_NODE__DISABLED_MONITORINGS:
				getDisabledMonitorings().clear();
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
			case InfrastructurePackage.COMPUTING_NODE__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case InfrastructurePackage.COMPUTING_NODE__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case InfrastructurePackage.COMPUTING_NODE__MEMORY_MB:
				return MEMORY_MB_EDEFAULT == null ? memory_mb != null : !MEMORY_MB_EDEFAULT.equals(memory_mb);
			case InfrastructurePackage.COMPUTING_NODE__STORAGE:
				return STORAGE_EDEFAULT == null ? storage != null : !STORAGE_EDEFAULT.equals(storage);
			case InfrastructurePackage.COMPUTING_NODE__CPU_COUNT:
				return CPU_COUNT_EDEFAULT == null ? cpu_count != null : !CPU_COUNT_EDEFAULT.equals(cpu_count);
			case InfrastructurePackage.COMPUTING_NODE__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case InfrastructurePackage.COMPUTING_NODE__LOCATION:
				return location != null;
			case InfrastructurePackage.COMPUTING_NODE__CREDENTIALS:
				return credentials != null;
			case InfrastructurePackage.COMPUTING_NODE__GROUP:
				return group != null;
			case InfrastructurePackage.COMPUTING_NODE__NODE_SPECIFIC_MONITORING:
				return nodeSpecificMonitoring != null && !nodeSpecificMonitoring.isEmpty();
			case InfrastructurePackage.COMPUTING_NODE__DISABLED_MONITORINGS:
				return disabledMonitorings != null && !disabledMonitorings.isEmpty();
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", os: ");
		result.append(os);
		result.append(", memory_mb: ");
		result.append(memory_mb);
		result.append(", storage: ");
		result.append(storage);
		result.append(", cpu_count: ");
		result.append(cpu_count);
		result.append(", cost: ");
		result.append(cost);
		result.append(", disabledMonitorings: ");
		result.append(disabledMonitorings);
		result.append(')');
		return result.toString();
	}

} //ComputingNodeImpl

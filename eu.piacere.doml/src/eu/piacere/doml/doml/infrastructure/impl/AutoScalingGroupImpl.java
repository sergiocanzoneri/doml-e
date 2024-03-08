/**
 */
package eu.piacere.doml.doml.infrastructure.impl;

import eu.piacere.doml.doml.infrastructure.AutoScalingGroup;
import eu.piacere.doml.doml.infrastructure.InfrastructurePackage;
import eu.piacere.doml.doml.infrastructure.LoadBalancerKind;
import eu.piacere.doml.doml.infrastructure.SecurityGroup;
import eu.piacere.doml.doml.infrastructure.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Scaling Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl#getMachineDefinition <em>Machine Definition</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl#getMin <em>Min</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl#getMax <em>Max</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.impl.AutoScalingGroupImpl#getLoadBalancer <em>Load Balancer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoScalingGroupImpl extends ComputingGroupImpl implements AutoScalingGroup {
	/**
	 * The cached value of the '{@link #getMachineDefinition() <em>Machine Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineDefinition()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachine machineDefinition;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Integer min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Integer max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected static final LoadBalancerKind LOAD_BALANCER_EDEFAULT = LoadBalancerKind.DEFAULT;

	/**
	 * The cached value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancerKind loadBalancer = LOAD_BALANCER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoScalingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.AUTO_SCALING_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachine getMachineDefinition() {
		return machineDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachineDefinition(VirtualMachine newMachineDefinition, NotificationChain msgs) {
		VirtualMachine oldMachineDefinition = machineDefinition;
		machineDefinition = newMachineDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION, oldMachineDefinition, newMachineDefinition);
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
	public void setMachineDefinition(VirtualMachine newMachineDefinition) {
		if (newMachineDefinition != machineDefinition) {
			NotificationChain msgs = null;
			if (machineDefinition != null)
				msgs = ((InternalEObject)machineDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION, null, msgs);
			if (newMachineDefinition != null)
				msgs = ((InternalEObject)newMachineDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION, null, msgs);
			msgs = basicSetMachineDefinition(newMachineDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION, newMachineDefinition, newMachineDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(Integer newMin) {
		Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.AUTO_SCALING_GROUP__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(Integer newMax) {
		Integer oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.AUTO_SCALING_GROUP__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancerKind getLoadBalancer() {
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancer(LoadBalancerKind newLoadBalancer) {
		LoadBalancerKind oldLoadBalancer = loadBalancer;
		loadBalancer = newLoadBalancer == null ? LOAD_BALANCER_EDEFAULT : newLoadBalancer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.AUTO_SCALING_GROUP__LOAD_BALANCER, oldLoadBalancer, loadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION:
				return basicSetMachineDefinition(null, msgs);
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
			case InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION:
				return getMachineDefinition();
			case InfrastructurePackage.AUTO_SCALING_GROUP__MIN:
				return getMin();
			case InfrastructurePackage.AUTO_SCALING_GROUP__MAX:
				return getMax();
			case InfrastructurePackage.AUTO_SCALING_GROUP__LOAD_BALANCER:
				return getLoadBalancer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION:
				setMachineDefinition((VirtualMachine)newValue);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__MIN:
				setMin((Integer)newValue);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__MAX:
				setMax((Integer)newValue);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__LOAD_BALANCER:
				setLoadBalancer((LoadBalancerKind)newValue);
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
			case InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION:
				setMachineDefinition((VirtualMachine)null);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case InfrastructurePackage.AUTO_SCALING_GROUP__LOAD_BALANCER:
				setLoadBalancer(LOAD_BALANCER_EDEFAULT);
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
			case InfrastructurePackage.AUTO_SCALING_GROUP__MACHINE_DEFINITION:
				return machineDefinition != null;
			case InfrastructurePackage.AUTO_SCALING_GROUP__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case InfrastructurePackage.AUTO_SCALING_GROUP__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case InfrastructurePackage.AUTO_SCALING_GROUP__LOAD_BALANCER:
				return loadBalancer != LOAD_BALANCER_EDEFAULT;
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", loadBalancer: ");
		result.append(loadBalancer);
		result.append(')');
		return result.toString();
	}

} //AutoScalingGroupImpl

/**
 */
package eu.piacere.doml.doml.infrastructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Scaling Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMachineDefinition <em>Machine Definition</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMin <em>Min</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMax <em>Max</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getLoadBalancer <em>Load Balancer</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getAutoScalingGroup()
 * @model
 * @generated
 */
public interface AutoScalingGroup extends ComputingGroup {
	/**
	 * Returns the value of the '<em><b>Machine Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Definition</em>' containment reference.
	 * @see #setMachineDefinition(VirtualMachine)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getAutoScalingGroup_MachineDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VirtualMachine getMachineDefinition();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMachineDefinition <em>Machine Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Definition</em>' containment reference.
	 * @see #getMachineDefinition()
	 * @generated
	 */
	void setMachineDefinition(VirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getAutoScalingGroup_Min()
	 * @model default="1"
	 * @generated
	 */
	Integer getMin();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getAutoScalingGroup_Max()
	 * @model default="1"
	 * @generated
	 */
	Integer getMax();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Load Balancer</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link eu.piacere.doml.doml.infrastructure.LoadBalancerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balancer</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.LoadBalancerKind
	 * @see #setLoadBalancer(LoadBalancerKind)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getAutoScalingGroup_LoadBalancer()
	 * @model default="DEFAULT"
	 * @generated
	 */
	LoadBalancerKind getLoadBalancer();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.AutoScalingGroup#getLoadBalancer <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balancer</em>' attribute.
	 * @see eu.piacere.doml.doml.infrastructure.LoadBalancerKind
	 * @see #getLoadBalancer()
	 * @generated
	 */
	void setLoadBalancer(LoadBalancerKind value);

} // AutoScalingGroup

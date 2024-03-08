/**
 */
package eu.piacere.doml.doml.infrastructure;

import eu.piacere.doml.doml.commons.Credentials;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getOs <em>Os</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getMemory_mb <em>Memory mb</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getStorage <em>Storage</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCpu_count <em>Cpu count</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCost <em>Cost</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getLocation <em>Location</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getNodeSpecificMonitoring <em>Node Specific Monitoring</em>}</li>
 *   <li>{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getDisabledMonitorings <em>Disabled Monitorings</em>}</li>
 * </ul>
 *
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode()
 * @model abstract="true"
 * @generated
 */
public interface ComputingNode extends Node {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Architecture()
	 * @model
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Memory mb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory mb</em>' attribute.
	 * @see #setMemory_mb(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Memory_mb()
	 * @model
	 * @generated
	 */
	Float getMemory_mb();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getMemory_mb <em>Memory mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory mb</em>' attribute.
	 * @see #getMemory_mb()
	 * @generated
	 */
	void setMemory_mb(Float value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Storage()
	 * @model
	 * @generated
	 */
	Float getStorage();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Float value);

	/**
	 * Returns the value of the '<em><b>Cpu count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu count</em>' attribute.
	 * @see #setCpu_count(Integer)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Cpu_count()
	 * @model
	 * @generated
	 */
	Integer getCpu_count();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCpu_count <em>Cpu count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu count</em>' attribute.
	 * @see #getCpu_count()
	 * @generated
	 */
	void setCpu_count(Integer value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Float)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Cost()
	 * @model
	 * @generated
	 */
	Float getCost();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Float value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' reference.
	 * @see #setCredentials(Credentials)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Credentials()
	 * @model
	 * @generated
	 */
	Credentials getCredentials();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getCredentials <em>Credentials</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(Credentials value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eu.piacere.doml.doml.infrastructure.ComputingGroup#getGroupedNodes <em>Grouped Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(ComputingGroup)
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_Group()
	 * @see eu.piacere.doml.doml.infrastructure.ComputingGroup#getGroupedNodes
	 * @model opposite="groupedNodes"
	 * @generated
	 */
	ComputingGroup getGroup();

	/**
	 * Sets the value of the '{@link eu.piacere.doml.doml.infrastructure.ComputingNode#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ComputingGroup value);

	/**
	 * Returns the value of the '<em><b>Node Specific Monitoring</b></em>' reference list.
	 * The list contents are of type {@link eu.piacere.doml.doml.infrastructure.MonitoringRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Specific Monitoring</em>' reference list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_NodeSpecificMonitoring()
	 * @model
	 * @generated
	 */
	EList<MonitoringRule> getNodeSpecificMonitoring();

	/**
	 * Returns the value of the '<em><b>Disabled Monitorings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Monitorings</em>' attribute list.
	 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getComputingNode_DisabledMonitorings()
	 * @model
	 * @generated
	 */
	EList<String> getDisabledMonitorings();

} // ComputingNode

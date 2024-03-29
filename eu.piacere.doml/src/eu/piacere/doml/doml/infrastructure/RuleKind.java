/**
 */
package eu.piacere.doml.doml.infrastructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.piacere.doml.doml.infrastructure.InfrastructurePackage#getRuleKind()
 * @model
 * @generated
 */
public enum RuleKind implements Enumerator {
	/**
	 * The '<em><b>EGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	EGRESS(0, "EGRESS", "EGRESS"),

	/**
	 * The '<em><b>INGRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	INGRESS(1, "INGRESS", "INGRESS");

	/**
	 * The '<em><b>EGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EGRESS_VALUE = 0;

	/**
	 * The '<em><b>INGRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INGRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INGRESS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Rule Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RuleKind[] VALUES_ARRAY =
		new RuleKind[] {
			EGRESS,
			INGRESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Rule Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RuleKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rule Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RuleKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleKind get(int value) {
		switch (value) {
			case EGRESS_VALUE: return EGRESS;
			case INGRESS_VALUE: return INGRESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RuleKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RuleKind

/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>eadb versorgung art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#geteadb_versorgung_art()
 * @model
 * @generated
 */
public enum eadb_versorgung_art implements Enumerator {
	/**
	 * The '<em><b>ÜGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÜGS_VALUE
	 * @generated
	 * @ordered
	 */
	ÜGS(0, "ÜGS", "\u00dcGS"),

	/**
	 * The '<em><b>VK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VK_VALUE
	 * @generated
	 * @ordered
	 */
	VK(1, "VK", "VK"),

	/**
	 * The '<em><b>IF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(2, "IF", "IF"),

	/**
	 * The '<em><b>IG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IG_VALUE
	 * @generated
	 * @ordered
	 */
	IG(3, "IG", "IG"),

	/**
	 * The '<em><b>WHZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHZ_VALUE
	 * @generated
	 * @ordered
	 */
	WHZ(4, "WHZ", "WHZ"),

	/**
	 * The '<em><b>FV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FV_VALUE
	 * @generated
	 * @ordered
	 */
	FV(5, "FV", "FV");

	/**
	 * The '<em><b>ÜGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ÜGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ÜGS_VALUE = 0;

	/**
	 * The '<em><b>VK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VK_VALUE = 1;

	/**
	 * The '<em><b>IF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 2;

	/**
	 * The '<em><b>IG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IG_VALUE = 3;

	/**
	 * The '<em><b>WHZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHZ_VALUE = 4;

	/**
	 * The '<em><b>FV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FV_VALUE = 5;

	/**
	 * An array of all the '<em><b>eadb versorgung art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final eadb_versorgung_art[] VALUES_ARRAY = new eadb_versorgung_art[] { ÜGS, VK, IF, IG, WHZ, FV, };

	/**
	 * A public read-only list of all the '<em><b>eadb versorgung art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<eadb_versorgung_art> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>eadb versorgung art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static eadb_versorgung_art get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			eadb_versorgung_art result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>eadb versorgung art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static eadb_versorgung_art getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			eadb_versorgung_art result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>eadb versorgung art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static eadb_versorgung_art get(int value) {
		switch (value) {
		case ÜGS_VALUE:
			return ÜGS;
		case VK_VALUE:
			return VK;
		case IF_VALUE:
			return IF;
		case IG_VALUE:
			return IG;
		case WHZ_VALUE:
			return WHZ;
		case FV_VALUE:
			return FV;
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
	private eadb_versorgung_art(int value, String name, String literal) {
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

} //eadb_versorgung_art

/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>spannungsarttype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getspannungsarttype()
 * @model
 * @generated
 */
public enum spannungsarttype implements Enumerator {
	/**
	 * The '<em><b>Rot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROT_VALUE
	 * @generated
	 * @ordered
	 */
	ROT(0, "rot", "HSP Un > 1kV 50Hz"),
	/**
	 * The '<em><b>Grün</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GRÜN_VALUE
	 * @generated
	 * @ordered
	 */
	GRÜN(1, "grün", "NSP Un bis inkl. 1kV 50Hz AC"),
	/**
	 * The '<em><b>Magenta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	MAGENTA(2, "magenta", "HSP Un = 15kV 16,7Hz"),
	/**
	 * The '<em><b>Cyan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(3, "cyan", "NSP Un bis inkl. 1kV 16,7Hz"),
	/**
	 * The '<em><b>Blau</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BLAU_VALUE
	 * @generated
	 * @ordered
	 */
	BLAU(4, "blau", "Un bis inkl. 1,5kV DC"),

	/**
	 * The '<em><b>Violett</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLETT_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLETT(5, "violett", "violett"),
	/**
	 * The '<em><b>Braun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BRAUN_VALUE
	 * @generated
	 * @ordered
	 */
	BRAUN(6, "braun", "braun");

	/**
	 * The '<em><b>Rot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROT
	 * @model name="rot" literal="HSP Un &gt; 1kV 50Hz"
	 * @generated
	 * @ordered
	 */
	public static final int ROT_VALUE = 0;

	/**
	 * The '<em><b>Grün</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRÜN
	 * @model name="grün" literal="NSP Un bis inkl. 1kV 50Hz AC"
	 * @generated
	 * @ordered
	 */
	public static final int GRÜN_VALUE = 1;

	/**
	 * The '<em><b>Magenta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGENTA
	 * @model name="magenta" literal="HSP Un = 15kV 16,7Hz"
	 * @generated
	 * @ordered
	 */
	public static final int MAGENTA_VALUE = 2;

	/**
	 * The '<em><b>Cyan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN
	 * @model name="cyan" literal="NSP Un bis inkl. 1kV 16,7Hz"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 3;

	/**
	 * The '<em><b>Blau</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLAU
	 * @model name="blau" literal="Un bis inkl. 1,5kV DC"
	 * @generated
	 * @ordered
	 */
	public static final int BLAU_VALUE = 4;

	/**
	 * The '<em><b>Violett</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLETT
	 * @model name="violett"
	 * @generated
	 * @ordered
	 */
	public static final int VIOLETT_VALUE = 5;

	/**
	 * The '<em><b>Braun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAUN
	 * @model name="braun"
	 * @generated
	 * @ordered
	 */
	public static final int BRAUN_VALUE = 6;

	/**
	 * An array of all the '<em><b>spannungsarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final spannungsarttype[] VALUES_ARRAY = new spannungsarttype[] { ROT, GRÜN, MAGENTA, CYAN, BLAU,
			VIOLETT, BRAUN, };

	/**
	 * A public read-only list of all the '<em><b>spannungsarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<spannungsarttype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>spannungsarttype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static spannungsarttype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			spannungsarttype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>spannungsarttype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static spannungsarttype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			spannungsarttype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>spannungsarttype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static spannungsarttype get(int value) {
		switch (value) {
		case ROT_VALUE:
			return ROT;
		case GRÜN_VALUE:
			return GRÜN;
		case MAGENTA_VALUE:
			return MAGENTA;
		case CYAN_VALUE:
			return CYAN;
		case BLAU_VALUE:
			return BLAU;
		case VIOLETT_VALUE:
			return VIOLETT;
		case BRAUN_VALUE:
			return BRAUN;
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
	private spannungsarttype(int value, String name, String literal) {
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

} //spannungsarttype

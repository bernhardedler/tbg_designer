/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Umrichterfunktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichterfunktion()
 * @model
 * @generated
 */
public enum Umrichterfunktion implements Enumerator {
	/**
	 * The '<em><b>Ersatzstromversorgung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERSATZSTROMVERSORGUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ERSATZSTROMVERSORGUNG(0, "Ersatzstromversorgung", "Ersatzstromversorgung"),

	/**
	 * The '<em><b>Energieerzeugung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGIEERZEUGUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGIEERZEUGUNG(1, "Energieerzeugung", "Energieerzeugung"),
	/**
	 * The '<em><b>Sonstig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SONSTIG_VALUE
	 * @generated
	 * @ordered
	 */
	SONSTIG(2, "Sonstig", "Sonstig");

	/**
	 * The '<em><b>Ersatzstromversorgung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERSATZSTROMVERSORGUNG
	 * @model name="Ersatzstromversorgung"
	 * @generated
	 * @ordered
	 */
	public static final int ERSATZSTROMVERSORGUNG_VALUE = 0;

	/**
	 * The '<em><b>Energieerzeugung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGIEERZEUGUNG
	 * @model name="Energieerzeugung"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGIEERZEUGUNG_VALUE = 1;

	/**
	 * The '<em><b>Sonstig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONSTIG
	 * @model name="Sonstig"
	 * @generated
	 * @ordered
	 */
	public static final int SONSTIG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Umrichterfunktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Umrichterfunktion[] VALUES_ARRAY = new Umrichterfunktion[] { ERSATZSTROMVERSORGUNG,
			ENERGIEERZEUGUNG, SONSTIG, };

	/**
	 * A public read-only list of all the '<em><b>Umrichterfunktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Umrichterfunktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Umrichterfunktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterfunktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Umrichterfunktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Umrichterfunktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterfunktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Umrichterfunktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Umrichterfunktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterfunktion get(int value) {
		switch (value) {
		case ERSATZSTROMVERSORGUNG_VALUE:
			return ERSATZSTROMVERSORGUNG;
		case ENERGIEERZEUGUNG_VALUE:
			return ENERGIEERZEUGUNG;
		case SONSTIG_VALUE:
			return SONSTIG;
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
	private Umrichterfunktion(int value, String name, String literal) {
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

} //Umrichterfunktion

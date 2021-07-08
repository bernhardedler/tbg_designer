/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Energiespeicherart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicherart()
 * @model
 * @generated
 */
public enum Energiespeicherart implements Enumerator {
	/**
	 * The '<em><b>Batterie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERIE_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERIE(0, "Batterie", "Batterie"),

	/**
	 * The '<em><b>Schwungrad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHWUNGRAD_VALUE
	 * @generated
	 * @ordered
	 */
	SCHWUNGRAD(1, "Schwungrad", "Schwungrad"),

	/**
	 * The '<em><b>Ersatzstromversorgung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERSATZSTROMVERSORGUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ERSATZSTROMVERSORGUNG(2, "Ersatzstromversorgung", "Ersatzstromversorgung");

	/**
	 * The '<em><b>Batterie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERIE
	 * @model name="Batterie"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERIE_VALUE = 0;

	/**
	 * The '<em><b>Schwungrad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHWUNGRAD
	 * @model name="Schwungrad"
	 * @generated
	 * @ordered
	 */
	public static final int SCHWUNGRAD_VALUE = 1;

	/**
	 * The '<em><b>Ersatzstromversorgung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERSATZSTROMVERSORGUNG
	 * @model name="Ersatzstromversorgung"
	 * @generated
	 * @ordered
	 */
	public static final int ERSATZSTROMVERSORGUNG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Energiespeicherart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Energiespeicherart[] VALUES_ARRAY = new Energiespeicherart[] { BATTERIE, SCHWUNGRAD,
			ERSATZSTROMVERSORGUNG, };

	/**
	 * A public read-only list of all the '<em><b>Energiespeicherart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Energiespeicherart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Energiespeicherart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Energiespeicherart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Energiespeicherart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energiespeicherart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Energiespeicherart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Energiespeicherart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energiespeicherart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Energiespeicherart get(int value) {
		switch (value) {
		case BATTERIE_VALUE:
			return BATTERIE;
		case SCHWUNGRAD_VALUE:
			return SCHWUNGRAD;
		case ERSATZSTROMVERSORGUNG_VALUE:
			return ERSATZSTROMVERSORGUNG;
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
	private Energiespeicherart(int value, String name, String literal) {
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

} //Energiespeicherart

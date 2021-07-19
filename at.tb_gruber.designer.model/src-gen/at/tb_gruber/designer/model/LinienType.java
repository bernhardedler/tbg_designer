/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Linien Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getLinienType()
 * @model
 * @generated
 */
public enum LinienType implements Enumerator {
	/**
	 * The '<em><b>Hauptversorgung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAUPTVERSORGUNG_VALUE
	 * @generated
	 * @ordered
	 */
	HAUPTVERSORGUNG(0, "Hauptversorgung", "Hauptversorgung"),

	/**
	 * The '<em><b>EVU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVU_VALUE
	 * @generated
	 * @ordered
	 */
	EVU(1, "EVU", "EVU"),

	/**
	 * The '<em><b>Kundenanlage OEBB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUNDENANLAGE_OEBB_VALUE
	 * @generated
	 * @ordered
	 */
	KUNDENANLAGE_OEBB(2, "Kundenanlage_OEBB", "Kundenanlage_OEBB"),
	/**
	* The '<em><b>Kundenanlage Dritter</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #KUNDENANLAGE_DRITTER_VALUE
	* @generated
	* @ordered
	*/
	KUNDENANLAGE_DRITTER(3, "Kundenanlage_Dritter", "Kundenanlage Dritter");

	/**
	 * The '<em><b>Hauptversorgung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAUPTVERSORGUNG
	 * @model name="Hauptversorgung"
	 * @generated
	 * @ordered
	 */
	public static final int HAUPTVERSORGUNG_VALUE = 0;

	/**
	 * The '<em><b>EVU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVU_VALUE = 1;

	/**
	 * The '<em><b>Kundenanlage OEBB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUNDENANLAGE_OEBB
	 * @model name="Kundenanlage_OEBB"
	 * @generated
	 * @ordered
	 */
	public static final int KUNDENANLAGE_OEBB_VALUE = 2;

	/**
	 * The '<em><b>Kundenanlage Dritter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUNDENANLAGE_DRITTER
	 * @model name="Kundenanlage_Dritter" literal="Kundenanlage Dritter"
	 * @generated
	 * @ordered
	 */
	public static final int KUNDENANLAGE_DRITTER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Linien Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinienType[] VALUES_ARRAY = new LinienType[] { HAUPTVERSORGUNG, EVU, KUNDENANLAGE_OEBB,
			KUNDENANLAGE_DRITTER, };

	/**
	 * A public read-only list of all the '<em><b>Linien Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinienType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Linien Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinienType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinienType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linien Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinienType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinienType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Linien Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinienType get(int value) {
		switch (value) {
		case HAUPTVERSORGUNG_VALUE:
			return HAUPTVERSORGUNG;
		case EVU_VALUE:
			return EVU;
		case KUNDENANLAGE_OEBB_VALUE:
			return KUNDENANLAGE_OEBB;
		case KUNDENANLAGE_DRITTER_VALUE:
			return KUNDENANLAGE_DRITTER;
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
	private LinienType(int value, String name, String literal) {
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

} //LinienType

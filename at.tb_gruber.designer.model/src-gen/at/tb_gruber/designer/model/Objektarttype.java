/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Objektarttype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getObjektarttype()
 * @model
 * @generated
 */
public enum Objektarttype implements Enumerator {
	/**
	 * The '<em><b>Trafostation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFOSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFOSTATION(0, "Trafostation", "Trafostation"),

	/**
	 * The '<em><b>Hochbauobjekt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOCHBAUOBJEKT_VALUE
	 * @generated
	 * @ordered
	 */
	HOCHBAUOBJEKT(1, "Hochbauobjekt", "Hochbauobjekt"),

	/**
	 * The '<em><b>Schalthaus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHALTHAUS_VALUE
	 * @generated
	 * @ordered
	 */
	SCHALTHAUS(2, "Schalthaus", "Schalthaus"),

	/**
	 * The '<em><b>Tunnelobjekt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNNELOBJEKT_VALUE
	 * @generated
	 * @ordered
	 */
	TUNNELOBJEKT(3, "Tunnelobjekt", "Tunnelobjekt"),

	/**
	 * The '<em><b>Freistehender VT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREISTEHENDER_VT_VALUE
	 * @generated
	 * @ordered
	 */
	FREISTEHENDER_VT(4, "Freistehender_VT", "Freistehender VT"),

	/**
	 * The '<em><b>Verkehrsstation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERKEHRSSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	VERKEHRSSTATION(5, "Verkehrsstation", "Verkehrsstation"),

	/**
	 * The '<em><b>Oberleitungsmast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBERLEITUNGSMAST_VALUE
	 * @generated
	 * @ordered
	 */
	OBERLEITUNGSMAST(6, "Oberleitungsmast", "Oberleitungsmast");

	/**
	 * The '<em><b>Trafostation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFOSTATION
	 * @model name="Trafostation"
	 * @generated
	 * @ordered
	 */
	public static final int TRAFOSTATION_VALUE = 0;

	/**
	 * The '<em><b>Hochbauobjekt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOCHBAUOBJEKT
	 * @model name="Hochbauobjekt"
	 * @generated
	 * @ordered
	 */
	public static final int HOCHBAUOBJEKT_VALUE = 1;

	/**
	 * The '<em><b>Schalthaus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHALTHAUS
	 * @model name="Schalthaus"
	 * @generated
	 * @ordered
	 */
	public static final int SCHALTHAUS_VALUE = 2;

	/**
	 * The '<em><b>Tunnelobjekt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNNELOBJEKT
	 * @model name="Tunnelobjekt"
	 * @generated
	 * @ordered
	 */
	public static final int TUNNELOBJEKT_VALUE = 3;

	/**
	 * The '<em><b>Freistehender VT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREISTEHENDER_VT
	 * @model name="Freistehender_VT" literal="Freistehender VT"
	 * @generated
	 * @ordered
	 */
	public static final int FREISTEHENDER_VT_VALUE = 4;

	/**
	 * The '<em><b>Verkehrsstation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERKEHRSSTATION
	 * @model name="Verkehrsstation"
	 * @generated
	 * @ordered
	 */
	public static final int VERKEHRSSTATION_VALUE = 5;

	/**
	 * The '<em><b>Oberleitungsmast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBERLEITUNGSMAST
	 * @model name="Oberleitungsmast"
	 * @generated
	 * @ordered
	 */
	public static final int OBERLEITUNGSMAST_VALUE = 6;

	/**
	 * An array of all the '<em><b>Objektarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Objektarttype[] VALUES_ARRAY = new Objektarttype[] { TRAFOSTATION, HOCHBAUOBJEKT, SCHALTHAUS,
			TUNNELOBJEKT, FREISTEHENDER_VT, VERKEHRSSTATION, OBERLEITUNGSMAST, };

	/**
	 * A public read-only list of all the '<em><b>Objektarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Objektarttype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Objektarttype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objektarttype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Objektarttype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Objektarttype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objektarttype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Objektarttype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Objektarttype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objektarttype get(int value) {
		switch (value) {
		case TRAFOSTATION_VALUE:
			return TRAFOSTATION;
		case HOCHBAUOBJEKT_VALUE:
			return HOCHBAUOBJEKT;
		case SCHALTHAUS_VALUE:
			return SCHALTHAUS;
		case TUNNELOBJEKT_VALUE:
			return TUNNELOBJEKT;
		case FREISTEHENDER_VT_VALUE:
			return FREISTEHENDER_VT;
		case VERKEHRSSTATION_VALUE:
			return VERKEHRSSTATION;
		case OBERLEITUNGSMAST_VALUE:
			return OBERLEITUNGSMAST;
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
	private Objektarttype(int value, String name, String literal) {
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

} //Objektarttype

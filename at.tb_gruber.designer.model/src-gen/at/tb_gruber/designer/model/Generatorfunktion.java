/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generatorfunktion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getGeneratorfunktion()
 * @model
 * @generated
 */
public enum Generatorfunktion implements Enumerator {
	/**
	 * The '<em><b>PV Generator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV_GENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	PV_GENERATOR(0, "PV_Generator", "PV-Generator"),

	/**
	 * The '<em><b>Dieselaggregat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIESELAGGREGAT_VALUE
	 * @generated
	 * @ordered
	 */
	DIESELAGGREGAT(1, "Dieselaggregat", "Dieselaggregat"),

	/**
	 * The '<em><b>Windkraftgenerator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDKRAFTGENERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	WINDKRAFTGENERATOR(2, "Windkraftgenerator", "Windkraftgenerator"),

	/**
	 * The '<em><b>Wasserkraft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASSERKRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	WASSERKRAFT(3, "Wasserkraft", "Wasserkraft");

	/**
	 * The '<em><b>PV Generator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV_GENERATOR
	 * @model name="PV_Generator" literal="PV-Generator"
	 * @generated
	 * @ordered
	 */
	public static final int PV_GENERATOR_VALUE = 0;

	/**
	 * The '<em><b>Dieselaggregat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIESELAGGREGAT
	 * @model name="Dieselaggregat"
	 * @generated
	 * @ordered
	 */
	public static final int DIESELAGGREGAT_VALUE = 1;

	/**
	 * The '<em><b>Windkraftgenerator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDKRAFTGENERATOR
	 * @model name="Windkraftgenerator"
	 * @generated
	 * @ordered
	 */
	public static final int WINDKRAFTGENERATOR_VALUE = 2;

	/**
	 * The '<em><b>Wasserkraft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASSERKRAFT
	 * @model name="Wasserkraft"
	 * @generated
	 * @ordered
	 */
	public static final int WASSERKRAFT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Generatorfunktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Generatorfunktion[] VALUES_ARRAY = new Generatorfunktion[] { PV_GENERATOR, DIESELAGGREGAT,
			WINDKRAFTGENERATOR, WASSERKRAFT, };

	/**
	 * A public read-only list of all the '<em><b>Generatorfunktion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Generatorfunktion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generatorfunktion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Generatorfunktion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Generatorfunktion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generatorfunktion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Generatorfunktion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Generatorfunktion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generatorfunktion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Generatorfunktion get(int value) {
		switch (value) {
		case PV_GENERATOR_VALUE:
			return PV_GENERATOR;
		case DIESELAGGREGAT_VALUE:
			return DIESELAGGREGAT;
		case WINDKRAFTGENERATOR_VALUE:
			return WINDKRAFTGENERATOR;
		case WASSERKRAFT_VALUE:
			return WASSERKRAFT;
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
	private Generatorfunktion(int value, String name, String literal) {
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

} //Generatorfunktion

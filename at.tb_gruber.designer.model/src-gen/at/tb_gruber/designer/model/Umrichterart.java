/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Umrichterart</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichterart()
 * @model
 * @generated
 */
public enum Umrichterart implements Enumerator {
	/**
	 * The '<em><b>Gleichrichter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLEICHRICHTER_VALUE
	 * @generated
	 * @ordered
	 */
	GLEICHRICHTER(0, "Gleichrichter", "Gleichrichter"),

	/**
	 * The '<em><b>Wechselrichter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WECHSELRICHTER_VALUE
	 * @generated
	 * @ordered
	 */
	WECHSELRICHTER(1, "Wechselrichter", "Wechselrichter"),

	/**
	 * The '<em><b>USV Anlage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USV_ANLAGE_VALUE
	 * @generated
	 * @ordered
	 */
	USV_ANLAGE(2, "USV_Anlage", "USV-Anlage");

	/**
	 * The '<em><b>Gleichrichter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLEICHRICHTER
	 * @model name="Gleichrichter"
	 * @generated
	 * @ordered
	 */
	public static final int GLEICHRICHTER_VALUE = 0;

	/**
	 * The '<em><b>Wechselrichter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WECHSELRICHTER
	 * @model name="Wechselrichter"
	 * @generated
	 * @ordered
	 */
	public static final int WECHSELRICHTER_VALUE = 1;

	/**
	 * The '<em><b>USV Anlage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USV_ANLAGE
	 * @model name="USV_Anlage" literal="USV-Anlage"
	 * @generated
	 * @ordered
	 */
	public static final int USV_ANLAGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Umrichterart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Umrichterart[] VALUES_ARRAY = new Umrichterart[] { GLEICHRICHTER, WECHSELRICHTER,
			USV_ANLAGE, };

	/**
	 * A public read-only list of all the '<em><b>Umrichterart</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Umrichterart> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Umrichterart</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterart get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Umrichterart result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Umrichterart</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterart getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Umrichterart result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Umrichterart</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Umrichterart get(int value) {
		switch (value) {
		case GLEICHRICHTER_VALUE:
			return GLEICHRICHTER;
		case WECHSELRICHTER_VALUE:
			return WECHSELRICHTER;
		case USV_ANLAGE_VALUE:
			return USV_ANLAGE;
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
	private Umrichterart(int value, String name, String literal) {
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

} //Umrichterart

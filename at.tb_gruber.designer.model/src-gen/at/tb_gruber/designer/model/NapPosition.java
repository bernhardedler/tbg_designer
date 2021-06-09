/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nap Position</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getNapPosition()
 * @model
 * @generated
 */
public enum NapPosition implements Enumerator {
	/**
	 * The '<em><b>DAVOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAVOR_VALUE
	 * @generated
	 * @ordered
	 */
	DAVOR(0, "DAVOR", "DAVOR"),

	/**
	 * The '<em><b>MITTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITTE_VALUE
	 * @generated
	 * @ordered
	 */
	MITTE(1, "MITTE", "MITTE"),

	/**
	 * The '<em><b>DANACH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANACH_VALUE
	 * @generated
	 * @ordered
	 */
	DANACH(2, "DANACH", "DANACH");

	/**
	 * The '<em><b>DAVOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAVOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAVOR_VALUE = 0;

	/**
	 * The '<em><b>MITTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITTE_VALUE = 1;

	/**
	 * The '<em><b>DANACH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANACH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DANACH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Nap Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NapPosition[] VALUES_ARRAY = new NapPosition[] { DAVOR, MITTE, DANACH, };

	/**
	 * A public read-only list of all the '<em><b>Nap Position</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NapPosition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nap Position</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NapPosition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NapPosition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nap Position</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NapPosition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NapPosition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nap Position</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NapPosition get(int value) {
		switch (value) {
		case DAVOR_VALUE:
			return DAVOR;
		case MITTE_VALUE:
			return MITTE;
		case DANACH_VALUE:
			return DANACH;
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
	private NapPosition(int value, String name, String literal) {
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

} //NapPosition

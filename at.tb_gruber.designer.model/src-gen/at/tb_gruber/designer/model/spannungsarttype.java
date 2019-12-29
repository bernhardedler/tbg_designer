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
	 * The '<em><b>Reserve violett</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_VIOLETT_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE_VIOLETT(0, "Reserve_violett", "Reserve (violett)"),
	/**
	 * The '<em><b>20k V50 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #_20K_V50_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	_20K_V50_HZ(1, "_20kV50Hz", "20kV 50Hz (rot)"),

	/**
	 * The '<em><b>10k V50 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10K_V50_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	_10K_V50_HZ(2, "_10kV50Hz", "10kV 50Hz (blau)"),
	/**
	 * The '<em><b>NSP50 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NSP50_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	NSP50_HZ(3, "NSP50Hz", "NSP 50Hz (gr\u00fcn)"),
	/**
	 * The '<em><b>15k V16 7Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #_15K_V16_7HZ_VALUE
	 * @generated
	 * @ordered
	 */
	_15K_V16_7HZ(4, "_15kV16_7Hz", "15kV 16,7Hz (magenta)"),
	/**
	 * The '<em><b>NSP16 7Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #NSP16_7HZ_VALUE
	 * @generated
	 * @ordered
	 */
	NSP16_7HZ(5, "NSP16_7Hz", "NSP 16,7Hz (cyan)"),
	/**
	 * The '<em><b>Reserve hellbraun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #RESERVE_HELLBRAUN_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE_HELLBRAUN(6, "Reserve_hellbraun", "Reserve (hellbraun)");

	/**
	 * The '<em><b>Reserve violett</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_VIOLETT
	 * @model name="Reserve_violett" literal="Reserve (violett)"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_VIOLETT_VALUE = 0;

	/**
	 * The '<em><b>20k V50 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_20K_V50_HZ
	 * @model name="_20kV50Hz" literal="20kV 50Hz (rot)"
	 * @generated
	 * @ordered
	 */
	public static final int _20K_V50_HZ_VALUE = 1;

	/**
	 * The '<em><b>10k V50 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10K_V50_HZ
	 * @model name="_10kV50Hz" literal="10kV 50Hz (blau)"
	 * @generated
	 * @ordered
	 */
	public static final int _10K_V50_HZ_VALUE = 2;

	/**
	 * The '<em><b>NSP50 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP50_HZ
	 * @model name="NSP50Hz" literal="NSP 50Hz (gr\374n)"
	 * @generated
	 * @ordered
	 */
	public static final int NSP50_HZ_VALUE = 3;

	/**
	 * The '<em><b>15k V16 7Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_15K_V16_7HZ
	 * @model name="_15kV16_7Hz" literal="15kV 16,7Hz (magenta)"
	 * @generated
	 * @ordered
	 */
	public static final int _15K_V16_7HZ_VALUE = 4;

	/**
	 * The '<em><b>NSP16 7Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP16_7HZ
	 * @model name="NSP16_7Hz" literal="NSP 16,7Hz (cyan)"
	 * @generated
	 * @ordered
	 */
	public static final int NSP16_7HZ_VALUE = 5;

	/**
	 * The '<em><b>Reserve hellbraun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_HELLBRAUN
	 * @model name="Reserve_hellbraun" literal="Reserve (hellbraun)"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_HELLBRAUN_VALUE = 6;

	/**
	 * An array of all the '<em><b>spannungsarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final spannungsarttype[] VALUES_ARRAY = new spannungsarttype[] { RESERVE_VIOLETT, _20K_V50_HZ,
			_10K_V50_HZ, NSP50_HZ, _15K_V16_7HZ, NSP16_7HZ, RESERVE_HELLBRAUN, };

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
		case RESERVE_VIOLETT_VALUE:
			return RESERVE_VIOLETT;
		case _20K_V50_HZ_VALUE:
			return _20K_V50_HZ;
		case _10K_V50_HZ_VALUE:
			return _10K_V50_HZ;
		case NSP50_HZ_VALUE:
			return NSP50_HZ;
		case _15K_V16_7HZ_VALUE:
			return _15K_V16_7HZ;
		case NSP16_7HZ_VALUE:
			return NSP16_7HZ;
		case RESERVE_HELLBRAUN_VALUE:
			return RESERVE_HELLBRAUN;
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

/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spannungsarttype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getSpannungsarttype()
 * @model
 * @generated
 */
public enum Spannungsarttype implements Enumerator {
	/**
	 * The '<em><b>NSP Un bis inkl 1k V50 Hz AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE
	 * @generated
	 * @ordered
	 */
	NSP_UN_BIS_INKL_1K_V50_HZ_AC(0, "NSP_Un_bis_inkl_1kV_50Hz_AC", "NSP Un bis inkl 1kV 50Hz AC"),

	/**
	 * The '<em><b>HSP Un ab 1k V50 Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSP_UN_AB_1K_V50_HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HSP_UN_AB_1K_V50_HZ(1, "HSP_Un_ab_1kV_50Hz", "HSP Un ab 1kV 50Hz"),

	/**
	 * The '<em><b>HSP Un 15k V16 7Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSP_UN_15K_V16_7HZ_VALUE
	 * @generated
	 * @ordered
	 */
	HSP_UN_15K_V16_7HZ(2, "HSP_Un_15kV_16_7Hz", "HSP Un 15kV 16,7Hz"),

	/**
	 * The '<em><b>NSP Un bis inkl 1k V16 7Hz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE
	 * @generated
	 * @ordered
	 */
	NSP_UN_BIS_INKL_1K_V16_7HZ(3, "NSP_Un_bis_inkl_1kV_16_7Hz", "NSP Un bis inkl 1kV 16,7Hz"),

	/**
	 * The '<em><b>Un bis inkl 15k VDC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_BIS_INKL_15K_VDC_VALUE
	 * @generated
	 * @ordered
	 */
	UN_BIS_INKL_15K_VDC(4, "Un_bis_inkl_1_5kV_DC", "Un bis inkl 1,5kV DC"),

	/**
	 * The '<em><b>Reserve 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_1_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE_1(5, "Reserve_1", "Reserve 1"),

	/**
	 * The '<em><b>Reserve 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_2_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE_2(6, "Reserve_2", "Reserve_2");

	/**
	 * The '<em><b>NSP Un bis inkl 1k V50 Hz AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP_UN_BIS_INKL_1K_V50_HZ_AC
	 * @model name="NSP_Un_bis_inkl_1kV_50Hz_AC" literal="NSP Un bis inkl 1kV 50Hz AC"
	 * @generated
	 * @ordered
	 */
	public static final int NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE = 0;

	/**
	 * The '<em><b>HSP Un ab 1k V50 Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSP_UN_AB_1K_V50_HZ
	 * @model name="HSP_Un_ab_1kV_50Hz" literal="HSP Un ab 1kV 50Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HSP_UN_AB_1K_V50_HZ_VALUE = 1;

	/**
	 * The '<em><b>HSP Un 15k V16 7Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSP_UN_15K_V16_7HZ
	 * @model name="HSP_Un_15kV_16_7Hz" literal="HSP Un 15kV 16,7Hz"
	 * @generated
	 * @ordered
	 */
	public static final int HSP_UN_15K_V16_7HZ_VALUE = 2;

	/**
	 * The '<em><b>NSP Un bis inkl 1k V16 7Hz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSP_UN_BIS_INKL_1K_V16_7HZ
	 * @model name="NSP_Un_bis_inkl_1kV_16_7Hz" literal="NSP Un bis inkl 1kV 16,7Hz"
	 * @generated
	 * @ordered
	 */
	public static final int NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE = 3;

	/**
	 * The '<em><b>Un bis inkl 15k VDC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN_BIS_INKL_15K_VDC
	 * @model name="Un_bis_inkl_1_5kV_DC" literal="Un bis inkl 1,5kV DC"
	 * @generated
	 * @ordered
	 */
	public static final int UN_BIS_INKL_15K_VDC_VALUE = 4;

	/**
	 * The '<em><b>Reserve 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_1
	 * @model name="Reserve_1" literal="Reserve 1"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_1_VALUE = 5;

	/**
	 * The '<em><b>Reserve 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_2
	 * @model name="Reserve_2"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_2_VALUE = 6;

	/**
	 * An array of all the '<em><b>Spannungsarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Spannungsarttype[] VALUES_ARRAY = new Spannungsarttype[] { NSP_UN_BIS_INKL_1K_V50_HZ_AC,
			HSP_UN_AB_1K_V50_HZ, HSP_UN_15K_V16_7HZ, NSP_UN_BIS_INKL_1K_V16_7HZ, UN_BIS_INKL_15K_VDC, RESERVE_1,
			RESERVE_2, };

	/**
	 * A public read-only list of all the '<em><b>Spannungsarttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Spannungsarttype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spannungsarttype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Spannungsarttype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Spannungsarttype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spannungsarttype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Spannungsarttype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Spannungsarttype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spannungsarttype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Spannungsarttype get(int value) {
		switch (value) {
		case NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE:
			return NSP_UN_BIS_INKL_1K_V50_HZ_AC;
		case HSP_UN_AB_1K_V50_HZ_VALUE:
			return HSP_UN_AB_1K_V50_HZ;
		case HSP_UN_15K_V16_7HZ_VALUE:
			return HSP_UN_15K_V16_7HZ;
		case NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE:
			return NSP_UN_BIS_INKL_1K_V16_7HZ;
		case UN_BIS_INKL_15K_VDC_VALUE:
			return UN_BIS_INKL_15K_VDC;
		case RESERVE_1_VALUE:
			return RESERVE_1;
		case RESERVE_2_VALUE:
			return RESERVE_2;
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
	private Spannungsarttype(int value, String name, String literal) {
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

} //Spannungsarttype

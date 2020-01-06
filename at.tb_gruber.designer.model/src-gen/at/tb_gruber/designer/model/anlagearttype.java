/**
 */
package at.tb_gruber.designer.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>anlagearttype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage#getanlagearttype()
 * @model
 * @generated
 */
public enum anlagearttype implements Enumerator {
	/**
	 * The '<em><b>UEGS Zaehlpunkt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UEGS_ZAEHLPUNKT_VALUE
	 * @generated
	 * @ordered
	 */
	UEGS_ZAEHLPUNKT(0, "UEGSZaehlpunkt", "\u00dcGS/Z\u00e4hlpunkt"),
	/**
	 * The '<em><b>Trafo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TRAFO_VALUE
	 * @generated
	 * @ordered
	 */
	TRAFO(1, "Trafo", "Trafo"),
	/**
	 * The '<em><b>Versorgungsknoten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #VERSORGUNGSKNOTEN_VALUE
	 * @generated
	 * @ordered
	 */
	VERSORGUNGSKNOTEN(2, "Versorgungsknoten", "Versorgungsknoten"),

	/**
	 * The '<em><b>Energietechnikanlage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGIETECHNIKANLAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGIETECHNIKANLAGE(3, "Energietechnikanlage", "Energietechnikanlage"),
	/**
	 * The '<em><b>VK ET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #VK_ET_VALUE
	 * @generated
	 * @ordered
	 */
	VK_ET(4, "VK_ET", "Vers.Knoten + ET-Anlage");

	/**
	 * The '<em><b>UEGS Zaehlpunkt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UEGS_ZAEHLPUNKT
	 * @model name="UEGSZaehlpunkt" literal="\334GS/Z\344hlpunkt"
	 * @generated
	 * @ordered
	 */
	public static final int UEGS_ZAEHLPUNKT_VALUE = 0;

	/**
	 * The '<em><b>Trafo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAFO
	 * @model name="Trafo"
	 * @generated
	 * @ordered
	 */
	public static final int TRAFO_VALUE = 1;

	/**
	 * The '<em><b>Versorgungsknoten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSORGUNGSKNOTEN
	 * @model name="Versorgungsknoten"
	 * @generated
	 * @ordered
	 */
	public static final int VERSORGUNGSKNOTEN_VALUE = 2;

	/**
	 * The '<em><b>Energietechnikanlage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGIETECHNIKANLAGE
	 * @model name="Energietechnikanlage"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGIETECHNIKANLAGE_VALUE = 3;

	/**
	 * The '<em><b>VK ET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VK_ET
	 * @model literal="Vers.Knoten + ET-Anlage"
	 * @generated
	 * @ordered
	 */
	public static final int VK_ET_VALUE = 4;

	/**
	 * An array of all the '<em><b>anlagearttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final anlagearttype[] VALUES_ARRAY = new anlagearttype[] { UEGS_ZAEHLPUNKT, TRAFO, VERSORGUNGSKNOTEN,
			ENERGIETECHNIKANLAGE, VK_ET, };

	/**
	 * A public read-only list of all the '<em><b>anlagearttype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<anlagearttype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>anlagearttype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static anlagearttype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			anlagearttype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>anlagearttype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static anlagearttype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			anlagearttype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>anlagearttype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static anlagearttype get(int value) {
		switch (value) {
		case UEGS_ZAEHLPUNKT_VALUE:
			return UEGS_ZAEHLPUNKT;
		case TRAFO_VALUE:
			return TRAFO;
		case VERSORGUNGSKNOTEN_VALUE:
			return VERSORGUNGSKNOTEN;
		case ENERGIETECHNIKANLAGE_VALUE:
			return ENERGIETECHNIKANLAGE;
		case VK_ET_VALUE:
			return VK_ET;
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
	private anlagearttype(int value, String name, String literal) {
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

} //anlagearttype

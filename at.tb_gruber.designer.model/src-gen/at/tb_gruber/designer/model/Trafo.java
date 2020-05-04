/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trafo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getSekundaerspannung <em>Sekundaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getTrafoKva <em>Trafo Kva</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getReserve5 <em>Reserve5</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo()
 * @model
 * @generated
 */
public interface Trafo extends Anlage {
	/**
	 * Returns the value of the '<em><b>Sekundaerspannung</b></em>' attribute.
	 * The default value is <code>"NSP 50Hz (gr\u00fcn)"</code>.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sekundaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setSekundaerspannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Sekundaerspannung()
	 * @model default="NSP 50Hz (gr\u00fcn)"
	 * @generated
	 */
	spannungsarttype getSekundaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getSekundaerspannung <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sekundaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getSekundaerspannung()
	 * @generated
	 */
	void setSekundaerspannung(spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafo Kva</em>' attribute.
	 * @see #setTrafoKva(long)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_TrafoKva()
	 * @model
	 * @generated
	 */
	long getTrafoKva();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getTrafoKva <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafo Kva</em>' attribute.
	 * @see #getTrafoKva()
	 * @generated
	 */
	void setTrafoKva(long value);

	/**
	 * Returns the value of the '<em><b>Reserve5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve5</em>' attribute.
	 * @see #setReserve5(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Reserve5()
	 * @model
	 * @generated
	 */
	String getReserve5();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getReserve5 <em>Reserve5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve5</em>' attribute.
	 * @see #getReserve5()
	 * @generated
	 */
	void setReserve5(String value);

} // Trafo

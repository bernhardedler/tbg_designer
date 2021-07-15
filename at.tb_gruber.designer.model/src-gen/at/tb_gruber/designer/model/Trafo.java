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
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getReserve3 <em>Reserve3</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getOberspannung <em>Oberspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Trafo#getUnterspannung <em>Unterspannung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo()
 * @model
 * @generated
 */
public interface Trafo extends AnlageMitAttributen {
	/**
	 * Returns the value of the '<em><b>Sekundaerspannung</b></em>' attribute.
	 * The default value is <code>"NSP Un bis inkl 1kV 50Hz AC"</code>.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sekundaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #setSekundaerspannung(Spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Sekundaerspannung()
	 * @model default="NSP Un bis inkl 1kV 50Hz AC"
	 * @generated
	 */
	Spannungsarttype getSekundaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getSekundaerspannung <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sekundaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #getSekundaerspannung()
	 * @generated
	 */
	void setSekundaerspannung(Spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafo Kva</em>' attribute.
	 * @see #setTrafoKva(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_TrafoKva()
	 * @model
	 * @generated
	 */
	String getTrafoKva();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getTrafoKva <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafo Kva</em>' attribute.
	 * @see #getTrafoKva()
	 * @generated
	 */
	void setTrafoKva(String value);

	/**
	 * Returns the value of the '<em><b>Reserve3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve3</em>' attribute.
	 * @see #setReserve3(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Reserve3()
	 * @model
	 * @generated
	 */
	String getReserve3();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getReserve3 <em>Reserve3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve3</em>' attribute.
	 * @see #getReserve3()
	 * @generated
	 */
	void setReserve3(String value);

	/**
	 * Returns the value of the '<em><b>Oberspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oberspannung</em>' attribute.
	 * @see #setOberspannung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Oberspannung()
	 * @model
	 * @generated
	 */
	String getOberspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getOberspannung <em>Oberspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oberspannung</em>' attribute.
	 * @see #getOberspannung()
	 * @generated
	 */
	void setOberspannung(String value);

	/**
	 * Returns the value of the '<em><b>Unterspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unterspannung</em>' attribute.
	 * @see #setUnterspannung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getTrafo_Unterspannung()
	 * @model
	 * @generated
	 */
	String getUnterspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Trafo#getUnterspannung <em>Unterspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterspannung</em>' attribute.
	 * @see #getUnterspannung()
	 * @generated
	 */
	void setUnterspannung(String value);

} // Trafo

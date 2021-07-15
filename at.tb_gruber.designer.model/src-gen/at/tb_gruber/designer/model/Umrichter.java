/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Umrichter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Umrichter#getUmrichterfunktion <em>Umrichterfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Umrichter#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Umrichter#getUmrichterart <em>Umrichterart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Umrichter#getNennleistung <em>Nennleistung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichter()
 * @model
 * @generated
 */
public interface Umrichter extends AnlageMitAttributen {
	/**
	 * Returns the value of the '<em><b>Umrichterfunktion</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Umrichterfunktion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Umrichterfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Umrichterfunktion
	 * @see #setUmrichterfunktion(Umrichterfunktion)
	 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichter_Umrichterfunktion()
	 * @model
	 * @generated
	 */
	Umrichterfunktion getUmrichterfunktion();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Umrichter#getUmrichterfunktion <em>Umrichterfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umrichterfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Umrichterfunktion
	 * @see #getUmrichterfunktion()
	 * @generated
	 */
	void setUmrichterfunktion(Umrichterfunktion value);

	/**
	 * Returns the value of the '<em><b>Umrichterart</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Umrichterart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Umrichterart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Umrichterart
	 * @see #setUmrichterart(Umrichterart)
	 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichter_Umrichterart()
	 * @model
	 * @generated
	 */
	Umrichterart getUmrichterart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Umrichter#getUmrichterart <em>Umrichterart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umrichterart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Umrichterart
	 * @see #getUmrichterart()
	 * @generated
	 */
	void setUmrichterart(Umrichterart value);

	/**
	 * Returns the value of the '<em><b>Nennleistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nennleistung</em>' attribute.
	 * @see #setNennleistung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichter_Nennleistung()
	 * @model
	 * @generated
	 */
	String getNennleistung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Umrichter#getNennleistung <em>Nennleistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nennleistung</em>' attribute.
	 * @see #getNennleistung()
	 * @generated
	 */
	void setNennleistung(String value);

	/**
	 * Returns the value of the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #setFunktionSonstig(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getUmrichter_FunktionSonstig()
	 * @model
	 * @generated
	 */
	String getFunktionSonstig();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Umrichter#getFunktionSonstig <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #getFunktionSonstig()
	 * @generated
	 */
	void setFunktionSonstig(String value);

} // Umrichter

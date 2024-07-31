/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verteiler Mit Zaehler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrHauptversorgung <em>Nr Hauptversorgung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerMitZaehler#isFernablesung <em>Fernablesung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler()
 * @model
 * @generated
 */
public interface VerteilerMitZaehler extends VerteilerBase {
	/**
	 * Returns the value of the '<em><b>Nr Reserve Einspeisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Reserve Einspeisung</em>' attribute.
	 * @see #setNrReserveEinspeisung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler_NrReserveEinspeisung()
	 * @model
	 * @generated
	 */
	String getNrReserveEinspeisung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Reserve Einspeisung</em>' attribute.
	 * @see #getNrReserveEinspeisung()
	 * @generated
	 */
	void setNrReserveEinspeisung(String value);

	/**
	 * Returns the value of the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * The default value is <code>"ZP-NR.: "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Hauptversorgung</em>' attribute.
	 * @see #setNrHauptversorgung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler_NrHauptversorgung()
	 * @model default="ZP-NR.: "
	 * @generated
	 */
	String getNrHauptversorgung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrHauptversorgung <em>Nr Hauptversorgung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Hauptversorgung</em>' attribute.
	 * @see #getNrHauptversorgung()
	 * @generated
	 */
	void setNrHauptversorgung(String value);

	/**
	 * Returns the value of the '<em><b>Fernablesung</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fernablesung</em>' attribute.
	 * @see #setFernablesung(boolean)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler_Fernablesung()
	 * @model default="false"
	 * @generated
	 */
	boolean isFernablesung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#isFernablesung <em>Fernablesung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fernablesung</em>' attribute.
	 * @see #isFernablesung()
	 * @generated
	 */
	void setFernablesung(boolean value);

} // VerteilerMitZaehler

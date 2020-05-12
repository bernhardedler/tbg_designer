/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zaehlpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getZaehlpunkt()
 * @model
 * @generated
 */
public interface Zaehlpunkt extends Anlage {

	/**
	 * Returns the value of the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Hauptversorgung</em>' attribute.
	 * @see #setNrHauptversorgung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getZaehlpunkt_NrHauptversorgung()
	 * @model
	 * @generated
	 */
	String getNrHauptversorgung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Hauptversorgung</em>' attribute.
	 * @see #getNrHauptversorgung()
	 * @generated
	 */
	void setNrHauptversorgung(String value);

	/**
	 * Returns the value of the '<em><b>Nr Reserve Einspeisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Reserve Einspeisung</em>' attribute.
	 * @see #setNrReserveEinspeisung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getZaehlpunkt_NrReserveEinspeisung()
	 * @model
	 * @generated
	 */
	String getNrReserveEinspeisung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Reserve Einspeisung</em>' attribute.
	 * @see #getNrReserveEinspeisung()
	 * @generated
	 */
	void setNrReserveEinspeisung(String value);
} // Zaehlpunkt

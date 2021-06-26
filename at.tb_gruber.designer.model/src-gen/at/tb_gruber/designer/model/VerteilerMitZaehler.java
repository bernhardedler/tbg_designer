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
 *   <li>{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getVerteilerdetails <em>Verteilerdetails</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler()
 * @model
 * @generated
 */
public interface VerteilerMitZaehler extends VerteilerBase {
	/**
	 * Returns the value of the '<em><b>Verteilerdetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verteilerdetails</em>' containment reference.
	 * @see #setVerteilerdetails(VerteilerDetails)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerMitZaehler_Verteilerdetails()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VerteilerDetails getVerteilerdetails();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getVerteilerdetails <em>Verteilerdetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verteilerdetails</em>' containment reference.
	 * @see #getVerteilerdetails()
	 * @generated
	 */
	void setVerteilerdetails(VerteilerDetails value);

} // VerteilerMitZaehler

/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verteiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Verteiler#isHasZaehler <em>Has Zaehler</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verteiler#getVerteilerdetails <em>Verteilerdetails</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verteiler#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerteiler()
 * @model
 * @generated
 */
public interface Verteiler extends Anlage {
	/**
	 * Returns the value of the '<em><b>Has Zaehler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Zaehler</em>' attribute.
	 * @see #setHasZaehler(boolean)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteiler_HasZaehler()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isHasZaehler();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verteiler#isHasZaehler <em>Has Zaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Zaehler</em>' attribute.
	 * @see #isHasZaehler()
	 * @generated
	 */
	void setHasZaehler(boolean value);

	/**
	 * Returns the value of the '<em><b>Verteilerdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verteilerdetails</em>' reference.
	 * @see #setVerteilerdetails(VerteilerDetails)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteiler_Verteilerdetails()
	 * @model required="true"
	 * @generated
	 */
	VerteilerDetails getVerteilerdetails();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verteiler#getVerteilerdetails <em>Verteilerdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verteilerdetails</em>' reference.
	 * @see #getVerteilerdetails()
	 * @generated
	 */
	void setVerteilerdetails(VerteilerDetails value);

	/**
	 * Returns the value of the '<em><b>Netzanschlusspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netzanschlusspunkt</em>' reference.
	 * @see #setNetzanschlusspunkt(Netzanschlusspunkt)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteiler_Netzanschlusspunkt()
	 * @model
	 * @generated
	 */
	Netzanschlusspunkt getNetzanschlusspunkt();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verteiler#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netzanschlusspunkt</em>' reference.
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	void setNetzanschlusspunkt(Netzanschlusspunkt value);

} // Verteiler

/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verbindung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getKabeltyp <em>Kabeltyp</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherung <em>Quell Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZielSicherung <em>Ziel Sicherung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung()
 * @model
 * @generated
 */
public interface Verbindung extends EObject {
	/**
	 * Returns the value of the '<em><b>Versorgungsspannung</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versorgungsspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setVersorgungsspannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Versorgungsspannung()
	 * @model
	 * @generated
	 */
	spannungsarttype getVersorgungsspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getVersorgungsspannung <em>Versorgungsspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versorgungsspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getVersorgungsspannung()
	 * @generated
	 */
	void setVersorgungsspannung(spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>Kabeltyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kabeltyp</em>' attribute.
	 * @see #setKabeltyp(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Kabeltyp()
	 * @model
	 * @generated
	 */
	String getKabeltyp();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getKabeltyp <em>Kabeltyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabeltyp</em>' attribute.
	 * @see #getKabeltyp()
	 * @generated
	 */
	void setKabeltyp(String value);

	/**
	 * Returns the value of the '<em><b>Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel</em>' reference.
	 * @see #setZiel(Anlage)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Ziel()
	 * @model required="true"
	 * @generated
	 */
	Anlage getZiel();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel</em>' reference.
	 * @see #getZiel()
	 * @generated
	 */
	void setZiel(Anlage value);

	/**
	 * Returns the value of the '<em><b>Ursprung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ursprung</em>' reference.
	 * @see #setUrsprung(Anlage)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Ursprung()
	 * @model required="true"
	 * @generated
	 */
	Anlage getUrsprung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ursprung</em>' reference.
	 * @see #getUrsprung()
	 * @generated
	 */
	void setUrsprung(Anlage value);

	/**
	 * Returns the value of the '<em><b>Quell Sicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quell Sicherung</em>' containment reference.
	 * @see #setQuellSicherung(Sicherung)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_QuellSicherung()
	 * @model containment="true"
	 * @generated
	 */
	Sicherung getQuellSicherung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherung <em>Quell Sicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quell Sicherung</em>' containment reference.
	 * @see #getQuellSicherung()
	 * @generated
	 */
	void setQuellSicherung(Sicherung value);

	/**
	 * Returns the value of the '<em><b>Ziel Sicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel Sicherung</em>' containment reference.
	 * @see #setZielSicherung(Sicherung)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_ZielSicherung()
	 * @model containment="true"
	 * @generated
	 */
	Sicherung getZielSicherung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getZielSicherung <em>Ziel Sicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel Sicherung</em>' containment reference.
	 * @see #getZielSicherung()
	 * @generated
	 */
	void setZielSicherung(Sicherung value);

} // Verbindung

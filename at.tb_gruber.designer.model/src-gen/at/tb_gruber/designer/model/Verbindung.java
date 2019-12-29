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
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getNr <em>Nr</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getKabeltyp <em>Kabeltyp</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherungsGroesse <em>Quell Sicherungs Groesse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZielSicherungsGroesse <em>Ziel Sicherungs Groesse</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung()
 * @model
 * @generated
 */
public interface Verbindung extends EObject {
	/**
	 * Returns the value of the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr</em>' attribute.
	 * @see #setNr(int)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Nr()
	 * @model id="true"
	 * @generated
	 */
	int getNr();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getNr <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr</em>' attribute.
	 * @see #getNr()
	 * @generated
	 */
	void setNr(int value);

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
	 * Returns the value of the '<em><b>Quell Sicherungs Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quell Sicherungs Groesse</em>' attribute.
	 * @see #setQuellSicherungsGroesse(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_QuellSicherungsGroesse()
	 * @model
	 * @generated
	 */
	String getQuellSicherungsGroesse();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherungsGroesse <em>Quell Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quell Sicherungs Groesse</em>' attribute.
	 * @see #getQuellSicherungsGroesse()
	 * @generated
	 */
	void setQuellSicherungsGroesse(String value);

	/**
	 * Returns the value of the '<em><b>Ziel Sicherungs Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel Sicherungs Groesse</em>' attribute.
	 * @see #setZielSicherungsGroesse(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_ZielSicherungsGroesse()
	 * @model
	 * @generated
	 */
	String getZielSicherungsGroesse();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getZielSicherungsGroesse <em>Ziel Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel Sicherungs Groesse</em>' attribute.
	 * @see #getZielSicherungsGroesse()
	 * @generated
	 */
	void setZielSicherungsGroesse(String value);

} // Verbindung

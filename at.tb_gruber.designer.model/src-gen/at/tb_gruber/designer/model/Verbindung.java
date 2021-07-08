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
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherung <em>Quell Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getZielSicherung <em>Ziel Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getKabeltype <em>Kabeltype</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getArgusrelevant <em>Argusrelevant</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getLinientype <em>Linientype</em>}</li>
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
	 * Returns the value of the '<em><b>Primaerspannung</b></em>' attribute.
	 * The default value is <code>"NSP_Un_bis_inkl_1kV_50Hz_AC"</code>.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #setPrimaerspannung(Spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Primaerspannung()
	 * @model default="NSP_Un_bis_inkl_1kV_50Hz_AC"
	 * @generated
	 */
	Spannungsarttype getPrimaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getPrimaerspannung <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #getPrimaerspannung()
	 * @generated
	 */
	void setPrimaerspannung(Spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel</em>' reference.
	 * @see #setZiel(AnlageBase)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Ziel()
	 * @model required="true"
	 * @generated
	 */
	AnlageBase getZiel();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel</em>' reference.
	 * @see #getZiel()
	 * @generated
	 */
	void setZiel(AnlageBase value);

	/**
	 * Returns the value of the '<em><b>Ursprung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ursprung</em>' reference.
	 * @see #setUrsprung(AnlageBase)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Ursprung()
	 * @model required="true"
	 * @generated
	 */
	AnlageBase getUrsprung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ursprung</em>' reference.
	 * @see #getUrsprung()
	 * @generated
	 */
	void setUrsprung(AnlageBase value);

	/**
	 * Returns the value of the '<em><b>Quell Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quell Sicherung</em>' attribute.
	 * @see #setQuellSicherung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_QuellSicherung()
	 * @model
	 * @generated
	 */
	String getQuellSicherung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherung <em>Quell Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quell Sicherung</em>' attribute.
	 * @see #getQuellSicherung()
	 * @generated
	 */
	void setQuellSicherung(String value);

	/**
	 * Returns the value of the '<em><b>Ziel Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel Sicherung</em>' attribute.
	 * @see #setZielSicherung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_ZielSicherung()
	 * @model
	 * @generated
	 */
	String getZielSicherung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getZielSicherung <em>Ziel Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel Sicherung</em>' attribute.
	 * @see #getZielSicherung()
	 * @generated
	 */
	void setZielSicherung(String value);

	/**
	 * Returns the value of the '<em><b>Kabeltype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kabeltype</em>' attribute.
	 * @see #setKabeltype(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Kabeltype()
	 * @model
	 * @generated
	 */
	String getKabeltype();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getKabeltype <em>Kabeltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabeltype</em>' attribute.
	 * @see #getKabeltype()
	 * @generated
	 */
	void setKabeltype(String value);

	/**
	 * Returns the value of the '<em><b>Argusrelevant</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.ARGUSrelevant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argusrelevant</em>' attribute.
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @see #setArgusrelevant(ARGUSrelevant)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Argusrelevant()
	 * @model
	 * @generated
	 */
	ARGUSrelevant getArgusrelevant();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getArgusrelevant <em>Argusrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argusrelevant</em>' attribute.
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @see #getArgusrelevant()
	 * @generated
	 */
	void setArgusrelevant(ARGUSrelevant value);

	/**
	 * Returns the value of the '<em><b>Linientype</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.LinienType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linientype</em>' attribute.
	 * @see at.tb_gruber.designer.model.LinienType
	 * @see #setLinientype(LinienType)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Linientype()
	 * @model
	 * @generated
	 */
	LinienType getLinientype();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getLinientype <em>Linientype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linientype</em>' attribute.
	 * @see at.tb_gruber.designer.model.LinienType
	 * @see #getLinientype()
	 * @generated
	 */
	void setLinientype(LinienType value);

} // Verbindung

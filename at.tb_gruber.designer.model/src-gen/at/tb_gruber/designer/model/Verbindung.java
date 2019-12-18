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
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.kabeltyptype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kabeltyp</em>' attribute.
	 * @see at.tb_gruber.designer.model.kabeltyptype
	 * @see #setKabeltyp(kabeltyptype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Kabeltyp()
	 * @model
	 * @generated
	 */
	kabeltyptype getKabeltyp();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getKabeltyp <em>Kabeltyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabeltyp</em>' attribute.
	 * @see at.tb_gruber.designer.model.kabeltyptype
	 * @see #getKabeltyp()
	 * @generated
	 */
	void setKabeltyp(kabeltyptype value);

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

} // Verbindung

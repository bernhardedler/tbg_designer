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
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getReserve9 <em>Reserve9</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Verbindung#getReserve10 <em>Reserve10</em>}</li>
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
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setPrimaerspannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Primaerspannung()
	 * @model
	 * @generated
	 */
	spannungsarttype getPrimaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getPrimaerspannung <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getPrimaerspannung()
	 * @generated
	 */
	void setPrimaerspannung(spannungsarttype value);

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
	 * Returns the value of the '<em><b>Reserve9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve9</em>' attribute.
	 * @see #setReserve9(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Reserve9()
	 * @model
	 * @generated
	 */
	String getReserve9();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getReserve9 <em>Reserve9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve9</em>' attribute.
	 * @see #getReserve9()
	 * @generated
	 */
	void setReserve9(String value);

	/**
	 * Returns the value of the '<em><b>Reserve10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve10</em>' attribute.
	 * @see #setReserve10(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerbindung_Reserve10()
	 * @model
	 * @generated
	 */
	String getReserve10();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Verbindung#getReserve10 <em>Reserve10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve10</em>' attribute.
	 * @see #getReserve10()
	 * @generated
	 */
	void setReserve10(String value);

} // Verbindung

/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getObjektteil <em>Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getEadbId <em>Eadb Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getVerbindungNach <em>Verbindung Nach</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getReserve3 <em>Reserve3</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getReserve4 <em>Reserve4</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage()
 * @model abstract="true"
 * @generated
 */
public interface Anlage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagennummer</em>' attribute.
	 * @see #setAnlagennummer(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Anlagennummer()
	 * @model
	 * @generated
	 */
	String getAnlagennummer();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getAnlagennummer <em>Anlagennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagennummer</em>' attribute.
	 * @see #getAnlagennummer()
	 * @generated
	 */
	void setAnlagennummer(String value);

	/**
	 * Returns the value of the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objektteil</em>' attribute.
	 * @see #setObjektteil(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Objektteil()
	 * @model
	 * @generated
	 */
	String getObjektteil();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getObjektteil <em>Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektteil</em>' attribute.
	 * @see #getObjektteil()
	 * @generated
	 */
	void setObjektteil(String value);

	/**
	 * Returns the value of the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eadb Id</em>' attribute.
	 * @see #setEadbId(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_EadbId()
	 * @model
	 * @generated
	 */
	String getEadbId();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getEadbId <em>Eadb Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eadb Id</em>' attribute.
	 * @see #getEadbId()
	 * @generated
	 */
	void setEadbId(String value);

	/**
	 * Returns the value of the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Verbindung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbindung Nach</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_VerbindungNach()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verbindung> getVerbindungNach();

	/**
	 * Returns the value of the '<em><b>Versorgt Von</b></em>' reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Verbindung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versorgt Von</em>' reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_VersorgtVon()
	 * @model
	 * @generated
	 */
	EList<Verbindung> getVersorgtVon();

	/**
	 * Returns the value of the '<em><b>Primaerspannung</b></em>' attribute.
	 * The default value is <code>"NSP 50Hz (gr\u00fcn)"</code>.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setPrimaerspannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Primaerspannung()
	 * @model default="NSP 50Hz (gr\u00fcn)"
	 * @generated
	 */
	spannungsarttype getPrimaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getPrimaerspannung <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getPrimaerspannung()
	 * @generated
	 */
	void setPrimaerspannung(spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>Reserve3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve3</em>' attribute.
	 * @see #setReserve3(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Reserve3()
	 * @model
	 * @generated
	 */
	String getReserve3();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getReserve3 <em>Reserve3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve3</em>' attribute.
	 * @see #getReserve3()
	 * @generated
	 */
	void setReserve3(String value);

	/**
	 * Returns the value of the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve4</em>' attribute.
	 * @see #setReserve4(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Reserve4()
	 * @model
	 * @generated
	 */
	String getReserve4();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getReserve4 <em>Reserve4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve4</em>' attribute.
	 * @see #getReserve4()
	 * @generated
	 */
	void setReserve4(String value);

	/**
	 * Returns the value of the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagen Id Immo Assi</em>' attribute.
	 * @see #setAnlagenIdImmoAssi(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_AnlagenIdImmoAssi()
	 * @model
	 * @generated
	 */
	String getAnlagenIdImmoAssi();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagen Id Immo Assi</em>' attribute.
	 * @see #getAnlagenIdImmoAssi()
	 * @generated
	 */
	void setAnlagenIdImmoAssi(String value);

} // Anlage

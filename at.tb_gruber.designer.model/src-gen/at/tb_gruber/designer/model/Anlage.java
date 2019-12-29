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
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getAnlagenart <em>Anlagenart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getObjektteil <em>Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getAnlagenId <em>Anlagen Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getTrafoKva <em>Trafo Kva</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getTrafospannung <em>Trafospannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getVerbindungNach <em>Verbindung Nach</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Anlage#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage()
 * @model
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
	 * Returns the value of the '<em><b>Anlagenart</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.anlagearttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagenart</em>' attribute.
	 * @see at.tb_gruber.designer.model.anlagearttype
	 * @see #setAnlagenart(anlagearttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Anlagenart()
	 * @model
	 * @generated
	 */
	anlagearttype getAnlagenart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getAnlagenart <em>Anlagenart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagenart</em>' attribute.
	 * @see at.tb_gruber.designer.model.anlagearttype
	 * @see #getAnlagenart()
	 * @generated
	 */
	void setAnlagenart(anlagearttype value);

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
	 * Returns the value of the '<em><b>Anlagen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagen Id</em>' attribute.
	 * @see #setAnlagenId(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_AnlagenId()
	 * @model
	 * @generated
	 */
	String getAnlagenId();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getAnlagenId <em>Anlagen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagen Id</em>' attribute.
	 * @see #getAnlagenId()
	 * @generated
	 */
	void setAnlagenId(String value);

	/**
	 * Returns the value of the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafo Kva</em>' attribute.
	 * @see #setTrafoKva(long)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_TrafoKva()
	 * @model
	 * @generated
	 */
	long getTrafoKva();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getTrafoKva <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafo Kva</em>' attribute.
	 * @see #getTrafoKva()
	 * @generated
	 */
	void setTrafoKva(long value);

	/**
	 * Returns the value of the '<em><b>Trafospannung</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trafospannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setTrafospannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Trafospannung()
	 * @model
	 * @generated
	 */
	spannungsarttype getTrafospannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getTrafospannung <em>Trafospannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trafospannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getTrafospannung()
	 * @generated
	 */
	void setTrafospannung(spannungsarttype value);

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
	 * Returns the value of the '<em><b>Versorgt Von</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versorgt Von</em>' reference.
	 * @see #setVersorgtVon(Verbindung)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_VersorgtVon()
	 * @model
	 * @generated
	 */
	Verbindung getVersorgtVon();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getVersorgtVon <em>Versorgt Von</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versorgt Von</em>' reference.
	 * @see #getVersorgtVon()
	 * @generated
	 */
	void setVersorgtVon(Verbindung value);

	/**
	 * Returns the value of the '<em><b>Versorgungsspannung</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versorgungsspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #setVersorgungsspannung(spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlage_Versorgungsspannung()
	 * @model
	 * @generated
	 */
	spannungsarttype getVersorgungsspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Anlage#getVersorgungsspannung <em>Versorgungsspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versorgungsspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see #getVersorgungsspannung()
	 * @generated
	 */
	void setVersorgungsspannung(spannungsarttype value);

} // Anlage

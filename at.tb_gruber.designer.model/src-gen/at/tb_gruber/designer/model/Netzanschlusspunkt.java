/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netzanschlusspunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition <em>Postition</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt()
 * @model
 * @generated
 */
public interface Netzanschlusspunkt extends EObject {
	/**
	 * Returns the value of the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Hauptversorgung</em>' attribute.
	 * @see #setNrHauptversorgung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_NrHauptversorgung()
	 * @model
	 * @generated
	 */
	String getNrHauptversorgung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}' attribute.
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
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_NrReserveEinspeisung()
	 * @model
	 * @generated
	 */
	String getNrReserveEinspeisung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Reserve Einspeisung</em>' attribute.
	 * @see #getNrReserveEinspeisung()
	 * @generated
	 */
	void setNrReserveEinspeisung(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Postition</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.NapPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postition</em>' attribute.
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see #setPostition(NapPosition)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_Postition()
	 * @model
	 * @generated
	 */
	NapPosition getPostition();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition <em>Postition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postition</em>' attribute.
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see #getPostition()
	 * @generated
	 */
	void setPostition(NapPosition value);

} // Netzanschlusspunkt

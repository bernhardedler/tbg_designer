/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anlage Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.AnlageBase#getDetails <em>Details</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageBase#getBetreiber <em>Betreiber</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageBase#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageBase#getVerbindungNach <em>Verbindung Nach</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageBase()
 * @model abstract="true"
 * @generated
 */
public interface AnlageBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Details}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageBase_Details()
	 * @model containment="true"
	 * @generated
	 */
	EList<Details> getDetails();

	/**
	 * Returns the value of the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betreiber</em>' containment reference.
	 * @see #setBetreiber(Betreiber)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageBase_Betreiber()
	 * @model containment="true"
	 * @generated
	 */
	Betreiber getBetreiber();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageBase#getBetreiber <em>Betreiber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreiber</em>' containment reference.
	 * @see #getBetreiber()
	 * @generated
	 */
	void setBetreiber(Betreiber value);

	/**
	 * Returns the value of the '<em><b>Versorgt Von</b></em>' reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Verbindung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versorgt Von</em>' reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageBase_VersorgtVon()
	 * @model
	 * @generated
	 */
	EList<Verbindung> getVersorgtVon();

	/**
	 * Returns the value of the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Verbindung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbindung Nach</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageBase_VerbindungNach()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verbindung> getVerbindungNach();

} // AnlageBase

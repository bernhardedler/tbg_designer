/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verteiler Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerDetails#getBetreiber <em>Betreiber</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerDetails#getNummer <em>Nummer</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerDetails()
 * @model
 * @generated
 */
public interface VerteilerDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Betreiber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betreiber</em>' attribute.
	 * @see #setBetreiber(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerDetails_Betreiber()
	 * @model
	 * @generated
	 */
	String getBetreiber();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerDetails#getBetreiber <em>Betreiber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreiber</em>' attribute.
	 * @see #getBetreiber()
	 * @generated
	 */
	void setBetreiber(String value);

	/**
	 * Returns the value of the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nummer</em>' attribute.
	 * @see #setNummer(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerDetails_Nummer()
	 * @model
	 * @generated
	 */
	String getNummer();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerDetails#getNummer <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer</em>' attribute.
	 * @see #getNummer()
	 * @generated
	 */
	void setNummer(String value);

} // VerteilerDetails

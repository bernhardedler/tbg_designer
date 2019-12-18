/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getObjektart <em>Objektart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getObjektId <em>Objekt Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt()
 * @model
 * @generated
 */
public interface Objekt extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objektart</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.objektarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objektart</em>' attribute.
	 * @see at.tb_gruber.designer.model.objektarttype
	 * @see #setObjektart(objektarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Objektart()
	 * @model
	 * @generated
	 */
	objektarttype getObjektart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getObjektart <em>Objektart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektart</em>' attribute.
	 * @see at.tb_gruber.designer.model.objektarttype
	 * @see #getObjektart()
	 * @generated
	 */
	void setObjektart(objektarttype value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Objekt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objekt Id</em>' attribute.
	 * @see #setObjektId(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_ObjektId()
	 * @model
	 * @generated
	 */
	String getObjektId();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getObjektId <em>Objekt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objekt Id</em>' attribute.
	 * @see #getObjektId()
	 * @generated
	 */
	void setObjektId(String value);

	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Anlage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anlage> getAnlage();

} // Objekt

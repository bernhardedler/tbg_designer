/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnhof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getProjektname <em>Projektname</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getPlankopf <em>Plankopf</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getTextbaustein <em>Textbaustein</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof()
 * @model
 * @generated
 */
public interface Bahnhof extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Projektname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projektname</em>' attribute.
	 * @see #setProjektname(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Projektname()
	 * @model
	 * @generated
	 */
	String getProjektname();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getProjektname <em>Projektname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projektname</em>' attribute.
	 * @see #getProjektname()
	 * @generated
	 */
	void setProjektname(String value);

	/**
	 * Returns the value of the '<em><b>Objekt</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objekt</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Objekt()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objekt> getObjekt();

	/**
	 * Returns the value of the '<em><b>Plankopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plankopf</em>' containment reference.
	 * @see #setPlankopf(Plankopf)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Plankopf()
	 * @model containment="true"
	 * @generated
	 */
	Plankopf getPlankopf();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getPlankopf <em>Plankopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plankopf</em>' containment reference.
	 * @see #getPlankopf()
	 * @generated
	 */
	void setPlankopf(Plankopf value);

	/**
	 * Returns the value of the '<em><b>Textbaustein</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Textbaustein}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textbaustein</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Textbaustein()
	 * @model containment="true"
	 * @generated
	 */
	EList<Textbaustein> getTextbaustein();

} // Bahnhof

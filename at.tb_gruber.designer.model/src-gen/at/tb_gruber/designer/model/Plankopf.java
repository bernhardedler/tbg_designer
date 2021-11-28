/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plankopf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Plankopf#getTextbaustein <em>Textbaustein</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getPlankopf()
 * @model
 * @generated
 */
public interface Plankopf extends EObject {

	/**
	 * Returns the value of the '<em><b>Textbaustein</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Textbaustein}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textbaustein</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getPlankopf_Textbaustein()
	 * @model containment="true"
	 * @generated
	 */
	EList<Textbaustein> getTextbaustein();

} // Plankopf

/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sicherung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Sicherung#getSicherungsgröße <em>Sicherungsgröße</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getSicherung()
 * @model
 * @generated
 */
public interface Sicherung extends EObject {
	/**
	 * Returns the value of the '<em><b>Sicherungsgröße</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sicherungsgröße</em>' attribute.
	 * @see #setSicherungsgröße(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getSicherung_Sicherungsgröße()
	 * @model
	 * @generated
	 */
	String getSicherungsgröße();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Sicherung#getSicherungsgröße <em>Sicherungsgröße</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sicherungsgröße</em>' attribute.
	 * @see #getSicherungsgröße()
	 * @generated
	 */
	void setSicherungsgröße(String value);

} // Sicherung

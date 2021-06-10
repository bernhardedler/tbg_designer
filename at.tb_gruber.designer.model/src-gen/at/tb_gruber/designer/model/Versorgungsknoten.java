/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versorgungsknoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Versorgungsknoten#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVersorgungsknoten()
 * @model
 * @generated
 */
public interface Versorgungsknoten extends SelbststAnlage {
	/**
	 * Returns the value of the '<em><b>Netzanschlusspunkt</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Netzanschlusspunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netzanschlusspunkt</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getVersorgungsknoten_Netzanschlusspunkt()
	 * @model containment="true"
	 * @generated
	 */
	EList<Netzanschlusspunkt> getNetzanschlusspunkt();

} // Versorgungsknoten

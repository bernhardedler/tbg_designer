/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anlagen Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.AnlagenContainer#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getAnlagenContainer()
 * @model
 * @generated
 */
public interface AnlagenContainer extends AnlageMitAttributen {
	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.GruppierbareAnlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlagenContainer_Anlage()
	 * @model containment="true"
	 * @generated
	 */
	EList<GruppierbareAnlage> getAnlage();

} // AnlagenContainer

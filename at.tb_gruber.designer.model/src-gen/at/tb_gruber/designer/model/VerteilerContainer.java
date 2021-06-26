/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verteiler Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerContainer#getVerteiler <em>Verteiler</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.VerteilerContainer#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerContainer()
 * @model
 * @generated
 */
public interface VerteilerContainer extends Anlage {
	/**
	 * Returns the value of the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netzanschlusspunkt</em>' containment reference.
	 * @see #setNetzanschlusspunkt(Netzanschlusspunkt)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerContainer_Netzanschlusspunkt()
	 * @model containment="true"
	 * @generated
	 */
	Netzanschlusspunkt getNetzanschlusspunkt();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.VerteilerContainer#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netzanschlusspunkt</em>' containment reference.
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	void setNetzanschlusspunkt(Netzanschlusspunkt value);

	/**
	 * Returns the value of the '<em><b>Verteiler</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.VerteilerBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verteiler</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getVerteilerContainer_Verteiler()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerteilerBase> getVerteiler();

} // VerteilerContainer

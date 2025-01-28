/**
 */
package at.tb_gruber.designer.model;

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
 *   <li>{@link at.tb_gruber.designer.model.Versorgungsknoten#getGroesse <em>Groesse</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getVersorgungsknoten()
 * @model
 * @generated
 */
public interface Versorgungsknoten extends GruppierbareAnlage {
	/**
	 * Returns the value of the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Netzanschlusspunkt</em>' containment reference.
	 * @see #setNetzanschlusspunkt(Netzanschlusspunkt)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVersorgungsknoten_Netzanschlusspunkt()
	 * @model containment="true"
	 * @generated
	 */
	Netzanschlusspunkt getNetzanschlusspunkt();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Versorgungsknoten#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Netzanschlusspunkt</em>' containment reference.
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	void setNetzanschlusspunkt(Netzanschlusspunkt value);

	/**
	 * Returns the value of the '<em><b>Groesse</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Verteilergroesse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groesse</em>' attribute.
	 * @see at.tb_gruber.designer.model.Verteilergroesse
	 * @see #setGroesse(Verteilergroesse)
	 * @see at.tb_gruber.designer.model.ModelPackage#getVersorgungsknoten_Groesse()
	 * @model
	 * @generated
	 */
	Verteilergroesse getGroesse();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Versorgungsknoten#getGroesse <em>Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groesse</em>' attribute.
	 * @see at.tb_gruber.designer.model.Verteilergroesse
	 * @see #getGroesse()
	 * @generated
	 */
	void setGroesse(Verteilergroesse value);

} // Versorgungsknoten

/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netzanschlusspunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getLangbeschreibung <em>Langbeschreibung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition <em>Postition</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Netzanschlusspunkt#isFernablesung <em>Fernablesung</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt()
 * @model
 * @generated
 */
public interface Netzanschlusspunkt extends AnlageOhneAttribute {
	/**
	 * Returns the value of the '<em><b>Langbeschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langbeschreibung</em>' attribute.
	 * @see #setLangbeschreibung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_Langbeschreibung()
	 * @model
	 * @generated
	 */
	String getLangbeschreibung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getLangbeschreibung <em>Langbeschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langbeschreibung</em>' attribute.
	 * @see #getLangbeschreibung()
	 * @generated
	 */
	void setLangbeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Postition</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.NapPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postition</em>' attribute.
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see #setPostition(NapPosition)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_Postition()
	 * @model
	 * @generated
	 */
	NapPosition getPostition();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition <em>Postition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postition</em>' attribute.
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see #getPostition()
	 * @generated
	 */
	void setPostition(NapPosition value);

	/**
	 * Returns the value of the '<em><b>Fernablesung</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fernablesung</em>' attribute.
	 * @see #setFernablesung(boolean)
	 * @see at.tb_gruber.designer.model.ModelPackage#getNetzanschlusspunkt_Fernablesung()
	 * @model default="false"
	 * @generated
	 */
	boolean isFernablesung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#isFernablesung <em>Fernablesung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fernablesung</em>' attribute.
	 * @see #isFernablesung()
	 * @generated
	 */
	void setFernablesung(boolean value);

} // Netzanschlusspunkt

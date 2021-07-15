/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energiespeicher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Energiespeicher#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherart <em>Energiespeicherart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Energiespeicher#getKapazitaet <em>Kapazitaet</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Energiespeicher#getAutonomiezeit <em>Autonomiezeit</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher()
 * @model
 * @generated
 */
public interface Energiespeicher extends AnlageMitAttributen {
	/**
	 * Returns the value of the '<em><b>Energiespeicherfunktion</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Energiespeicherfunktion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energiespeicherfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
	 * @see #setEnergiespeicherfunktion(Energiespeicherfunktion)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher_Energiespeicherfunktion()
	 * @model
	 * @generated
	 */
	Energiespeicherfunktion getEnergiespeicherfunktion();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energiespeicherfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
	 * @see #getEnergiespeicherfunktion()
	 * @generated
	 */
	void setEnergiespeicherfunktion(Energiespeicherfunktion value);

	/**
	 * Returns the value of the '<em><b>Energiespeicherart</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Energiespeicherart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energiespeicherart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Energiespeicherart
	 * @see #setEnergiespeicherart(Energiespeicherart)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher_Energiespeicherart()
	 * @model
	 * @generated
	 */
	Energiespeicherart getEnergiespeicherart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherart <em>Energiespeicherart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energiespeicherart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Energiespeicherart
	 * @see #getEnergiespeicherart()
	 * @generated
	 */
	void setEnergiespeicherart(Energiespeicherart value);

	/**
	 * Returns the value of the '<em><b>Autonomiezeit</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autonomiezeit</em>' attribute.
	 * @see #setAutonomiezeit(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher_Autonomiezeit()
	 * @model default=""
	 * @generated
	 */
	String getAutonomiezeit();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energiespeicher#getAutonomiezeit <em>Autonomiezeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autonomiezeit</em>' attribute.
	 * @see #getAutonomiezeit()
	 * @generated
	 */
	void setAutonomiezeit(String value);

	/**
	 * Returns the value of the '<em><b>Kapazitaet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kapazitaet</em>' attribute.
	 * @see #setKapazitaet(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher_Kapazitaet()
	 * @model
	 * @generated
	 */
	String getKapazitaet();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energiespeicher#getKapazitaet <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kapazitaet</em>' attribute.
	 * @see #getKapazitaet()
	 * @generated
	 */
	void setKapazitaet(String value);

	/**
	 * Returns the value of the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #setFunktionSonstig(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergiespeicher_FunktionSonstig()
	 * @model
	 * @generated
	 */
	String getFunktionSonstig();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energiespeicher#getFunktionSonstig <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #getFunktionSonstig()
	 * @generated
	 */
	void setFunktionSonstig(String value);

} // Energiespeicher

/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Generator#getGeneratorfunktion <em>Generatorfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Generator#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Generator#getElektrischeLeistung <em>Elektrische Leistung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Generator#getErzeugteEnergie <em>Erzeugte Energie</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends SelbststAnlage {
	/**
	 * Returns the value of the '<em><b>Generatorfunktion</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Generatorfunktion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generatorfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Generatorfunktion
	 * @see #setGeneratorfunktion(Generatorfunktion)
	 * @see at.tb_gruber.designer.model.ModelPackage#getGenerator_Generatorfunktion()
	 * @model
	 * @generated
	 */
	Generatorfunktion getGeneratorfunktion();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Generator#getGeneratorfunktion <em>Generatorfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generatorfunktion</em>' attribute.
	 * @see at.tb_gruber.designer.model.Generatorfunktion
	 * @see #getGeneratorfunktion()
	 * @generated
	 */
	void setGeneratorfunktion(Generatorfunktion value);

	/**
	 * Returns the value of the '<em><b>Erzeugte Energie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erzeugte Energie</em>' attribute.
	 * @see #setErzeugteEnergie(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getGenerator_ErzeugteEnergie()
	 * @model
	 * @generated
	 */
	String getErzeugteEnergie();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Generator#getErzeugteEnergie <em>Erzeugte Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erzeugte Energie</em>' attribute.
	 * @see #getErzeugteEnergie()
	 * @generated
	 */
	void setErzeugteEnergie(String value);

	/**
	 * Returns the value of the '<em><b>Elektrische Leistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elektrische Leistung</em>' attribute.
	 * @see #setElektrischeLeistung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getGenerator_ElektrischeLeistung()
	 * @model
	 * @generated
	 */
	String getElektrischeLeistung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Generator#getElektrischeLeistung <em>Elektrische Leistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elektrische Leistung</em>' attribute.
	 * @see #getElektrischeLeistung()
	 * @generated
	 */
	void setElektrischeLeistung(String value);

	/**
	 * Returns the value of the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #setFunktionSonstig(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getGenerator_FunktionSonstig()
	 * @model
	 * @generated
	 */
	String getFunktionSonstig();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Generator#getFunktionSonstig <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion Sonstig</em>' attribute.
	 * @see #getFunktionSonstig()
	 * @generated
	 */
	void setFunktionSonstig(String value);

} // Generator

/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anlage Mit Attributen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getObjektteil <em>Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbId <em>Eadb Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getInObjektteil <em>In Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAbgangVT <em>Abgang VT</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve1 <em>Reserve1</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve2 <em>Reserve2</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen()
 * @model abstract="true"
 * @generated
 */
public interface AnlageMitAttributen extends AnlageBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagennummer</em>' attribute.
	 * @see #setAnlagennummer(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Anlagennummer()
	 * @model
	 * @generated
	 */
	String getAnlagennummer();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagennummer <em>Anlagennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagennummer</em>' attribute.
	 * @see #getAnlagennummer()
	 * @generated
	 */
	void setAnlagennummer(String value);

	/**
	 * Returns the value of the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objektteil</em>' attribute.
	 * @see #setObjektteil(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Objektteil()
	 * @model
	 * @generated
	 */
	String getObjektteil();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getObjektteil <em>Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektteil</em>' attribute.
	 * @see #getObjektteil()
	 * @generated
	 */
	void setObjektteil(String value);

	/**
	 * Returns the value of the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eadb Id</em>' attribute.
	 * @see #setEadbId(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_EadbId()
	 * @model
	 * @generated
	 */
	String getEadbId();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbId <em>Eadb Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eadb Id</em>' attribute.
	 * @see #getEadbId()
	 * @generated
	 */
	void setEadbId(String value);

	/**
	 * Returns the value of the '<em><b>Primaerspannung</b></em>' attribute.
	 * The default value is <code>"NSP_Un_bis_inkl_1kV_50Hz_AC"</code>.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Spannungsarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #setPrimaerspannung(Spannungsarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Primaerspannung()
	 * @model default="NSP_Un_bis_inkl_1kV_50Hz_AC"
	 * @generated
	 */
	Spannungsarttype getPrimaerspannung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getPrimaerspannung <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerspannung</em>' attribute.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see #getPrimaerspannung()
	 * @generated
	 */
	void setPrimaerspannung(Spannungsarttype value);

	/**
	 * Returns the value of the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Objektteil</em>' attribute.
	 * @see #setInObjektteil(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_InObjektteil()
	 * @model
	 * @generated
	 */
	String getInObjektteil();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getInObjektteil <em>In Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Objektteil</em>' attribute.
	 * @see #getInObjektteil()
	 * @generated
	 */
	void setInObjektteil(String value);

	/**
	 * Returns the value of the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anlagen Id Immo Assi</em>' attribute.
	 * @see #setAnlagenIdImmoAssi(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_AnlagenIdImmoAssi()
	 * @model
	 * @generated
	 */
	String getAnlagenIdImmoAssi();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anlagen Id Immo Assi</em>' attribute.
	 * @see #getAnlagenIdImmoAssi()
	 * @generated
	 */
	void setAnlagenIdImmoAssi(String value);

	/**
	 * Returns the value of the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Eadb_Versorgung_Art}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eadb Versorgung Art</em>' attribute.
	 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
	 * @see #setEadbVersorgungArt(Eadb_Versorgung_Art)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_EadbVersorgungArt()
	 * @model
	 * @generated
	 */
	Eadb_Versorgung_Art getEadbVersorgungArt();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eadb Versorgung Art</em>' attribute.
	 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
	 * @see #getEadbVersorgungArt()
	 * @generated
	 */
	void setEadbVersorgungArt(Eadb_Versorgung_Art value);

	/**
	 * Returns the value of the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verteilerbezeichnung</em>' attribute.
	 * @see #setVerteilerbezeichnung(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Verteilerbezeichnung()
	 * @model
	 * @generated
	 */
	String getVerteilerbezeichnung();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verteilerbezeichnung</em>' attribute.
	 * @see #getVerteilerbezeichnung()
	 * @generated
	 */
	void setVerteilerbezeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abgang VT</em>' attribute.
	 * @see #setAbgangVT(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_AbgangVT()
	 * @model
	 * @generated
	 */
	String getAbgangVT();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAbgangVT <em>Abgang VT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abgang VT</em>' attribute.
	 * @see #getAbgangVT()
	 * @generated
	 */
	void setAbgangVT(String value);

	/**
	 * Returns the value of the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve1</em>' attribute.
	 * @see #setReserve1(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Reserve1()
	 * @model
	 * @generated
	 */
	String getReserve1();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve1 <em>Reserve1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve1</em>' attribute.
	 * @see #getReserve1()
	 * @generated
	 */
	void setReserve1(String value);

	/**
	 * Returns the value of the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve2</em>' attribute.
	 * @see #setReserve2(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getAnlageMitAttributen_Reserve2()
	 * @model
	 * @generated
	 */
	String getReserve2();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve2 <em>Reserve2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve2</em>' attribute.
	 * @see #getReserve2()
	 * @generated
	 */
	void setReserve2(String value);

} // AnlageMitAttributen

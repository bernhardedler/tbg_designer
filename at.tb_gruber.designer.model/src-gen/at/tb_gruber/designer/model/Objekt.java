/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getObjektart <em>Objektart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getObjektId <em>Objekt Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getAnlage <em>Anlage</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getDb776ua <em>Db776ua</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getGpsstandort <em>Gpsstandort</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getExterneQuelle <em>Externe Quelle</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getOrt_adresse <em>Ort adresse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getGebaeudeart <em>Gebaeudeart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Objekt#getEigentuemer <em>Eigentuemer</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt()
 * @model
 * @generated
 */
public interface Objekt extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objektart</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Objektarttype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objektart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Objektarttype
	 * @see #setObjektart(Objektarttype)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Objektart()
	 * @model
	 * @generated
	 */
	Objektarttype getObjektart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getObjektart <em>Objektart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektart</em>' attribute.
	 * @see at.tb_gruber.designer.model.Objektarttype
	 * @see #getObjektart()
	 * @generated
	 */
	void setObjektart(Objektarttype value);

	/**
	 * Returns the value of the '<em><b>Objekt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objekt Id</em>' attribute.
	 * @see #setObjektId(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_ObjektId()
	 * @model
	 * @generated
	 */
	String getObjektId();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getObjektId <em>Objekt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objekt Id</em>' attribute.
	 * @see #getObjektId()
	 * @generated
	 */
	void setObjektId(String value);

	/**
	 * Returns the value of the '<em><b>Anlage</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.AnlageBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * besteht aus
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anlage</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Anlage()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnlageBase> getAnlage();

	/**
	 * Returns the value of the '<em><b>Db776ua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db776ua</em>' attribute.
	 * @see #setDb776ua(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Db776ua()
	 * @model
	 * @generated
	 */
	String getDb776ua();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getDb776ua <em>Db776ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db776ua</em>' attribute.
	 * @see #getDb776ua()
	 * @generated
	 */
	void setDb776ua(String value);

	/**
	 * Returns the value of the '<em><b>Gpsstandort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpsstandort</em>' attribute.
	 * @see #setGpsstandort(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Gpsstandort()
	 * @model
	 * @generated
	 */
	String getGpsstandort();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getGpsstandort <em>Gpsstandort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpsstandort</em>' attribute.
	 * @see #getGpsstandort()
	 * @generated
	 */
	void setGpsstandort(String value);

	/**
	 * Returns the value of the '<em><b>Externe Quelle</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.Externe_Datenquelle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externe Quelle</em>' attribute.
	 * @see at.tb_gruber.designer.model.Externe_Datenquelle
	 * @see #setExterneQuelle(Externe_Datenquelle)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_ExterneQuelle()
	 * @model
	 * @generated
	 */
	Externe_Datenquelle getExterneQuelle();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getExterneQuelle <em>Externe Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externe Quelle</em>' attribute.
	 * @see at.tb_gruber.designer.model.Externe_Datenquelle
	 * @see #getExterneQuelle()
	 * @generated
	 */
	void setExterneQuelle(Externe_Datenquelle value);

	/**
	 * Returns the value of the '<em><b>Ort adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ort adresse</em>' attribute.
	 * @see #setOrt_adresse(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Ort_adresse()
	 * @model
	 * @generated
	 */
	String getOrt_adresse();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getOrt_adresse <em>Ort adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ort adresse</em>' attribute.
	 * @see #getOrt_adresse()
	 * @generated
	 */
	void setOrt_adresse(String value);

	/**
	 * Returns the value of the '<em><b>Gebaeudeart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gebaeudeart</em>' attribute.
	 * @see #setGebaeudeart(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Gebaeudeart()
	 * @model
	 * @generated
	 */
	String getGebaeudeart();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getGebaeudeart <em>Gebaeudeart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gebaeudeart</em>' attribute.
	 * @see #getGebaeudeart()
	 * @generated
	 */
	void setGebaeudeart(String value);

	/**
	 * Returns the value of the '<em><b>Eigentuemer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eigentuemer</em>' containment reference.
	 * @see #setEigentuemer(Eigentuemer)
	 * @see at.tb_gruber.designer.model.ModelPackage#getObjekt_Eigentuemer()
	 * @model containment="true"
	 * @generated
	 */
	Eigentuemer getEigentuemer();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Objekt#getEigentuemer <em>Eigentuemer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigentuemer</em>' containment reference.
	 * @see #getEigentuemer()
	 * @generated
	 */
	void setEigentuemer(Eigentuemer value);

} // Objekt

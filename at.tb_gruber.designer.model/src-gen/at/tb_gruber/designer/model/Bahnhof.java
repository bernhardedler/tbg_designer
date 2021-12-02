/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnhof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getProjektname <em>Projektname</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_am <em>Bearbeitet am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_von <em>Bearbeitet von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_am <em>Gezeichnet am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_von <em>Gezeichnet von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_am <em>Geprueft am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_von <em>Geprueft von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getPlannummer <em>Plannummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.Bahnhof#getFreigegeben_von <em>Freigegeben von</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof()
 * @model
 * @generated
 */
public interface Bahnhof extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Projektname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projektname</em>' attribute.
	 * @see #setProjektname(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Projektname()
	 * @model
	 * @generated
	 */
	String getProjektname();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getProjektname <em>Projektname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projektname</em>' attribute.
	 * @see #getProjektname()
	 * @generated
	 */
	void setProjektname(String value);

	/**
	 * Returns the value of the '<em><b>Objekt</b></em>' containment reference list.
	 * The list contents are of type {@link at.tb_gruber.designer.model.Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objekt</em>' containment reference list.
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Objekt()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objekt> getObjekt();

	/**
	 * Returns the value of the '<em><b>Plannummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plannummer</em>' attribute.
	 * @see #setPlannummer(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Plannummer()
	 * @model
	 * @generated
	 */
	String getPlannummer();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getPlannummer <em>Plannummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plannummer</em>' attribute.
	 * @see #getPlannummer()
	 * @generated
	 */
	void setPlannummer(String value);

	/**
	 * Returns the value of the '<em><b>Freigegeben von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freigegeben von</em>' attribute.
	 * @see #setFreigegeben_von(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Freigegeben_von()
	 * @model
	 * @generated
	 */
	String getFreigegeben_von();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getFreigegeben_von <em>Freigegeben von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freigegeben von</em>' attribute.
	 * @see #getFreigegeben_von()
	 * @generated
	 */
	void setFreigegeben_von(String value);

	/**
	 * Returns the value of the '<em><b>Bearbeitet von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitet von</em>' attribute.
	 * @see #setBearbeitet_von(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Bearbeitet_von()
	 * @model
	 * @generated
	 */
	String getBearbeitet_von();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_von <em>Bearbeitet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitet von</em>' attribute.
	 * @see #getBearbeitet_von()
	 * @generated
	 */
	void setBearbeitet_von(String value);

	/**
	 * Returns the value of the '<em><b>Gezeichnet von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gezeichnet von</em>' attribute.
	 * @see #setGezeichnet_von(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Gezeichnet_von()
	 * @model
	 * @generated
	 */
	String getGezeichnet_von();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_von <em>Gezeichnet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gezeichnet von</em>' attribute.
	 * @see #getGezeichnet_von()
	 * @generated
	 */
	void setGezeichnet_von(String value);

	/**
	 * Returns the value of the '<em><b>Geprueft von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geprueft von</em>' attribute.
	 * @see #setGeprueft_von(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Geprueft_von()
	 * @model
	 * @generated
	 */
	String getGeprueft_von();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_von <em>Geprueft von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geprueft von</em>' attribute.
	 * @see #getGeprueft_von()
	 * @generated
	 */
	void setGeprueft_von(String value);

	/**
	 * Returns the value of the '<em><b>Bearbeitet am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitet am</em>' attribute.
	 * @see #setBearbeitet_am(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Bearbeitet_am()
	 * @model ordered="false"
	 * @generated
	 */
	String getBearbeitet_am();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_am <em>Bearbeitet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitet am</em>' attribute.
	 * @see #getBearbeitet_am()
	 * @generated
	 */
	void setBearbeitet_am(String value);

	/**
	 * Returns the value of the '<em><b>Gezeichnet am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gezeichnet am</em>' attribute.
	 * @see #setGezeichnet_am(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Gezeichnet_am()
	 * @model ordered="false"
	 * @generated
	 */
	String getGezeichnet_am();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_am <em>Gezeichnet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gezeichnet am</em>' attribute.
	 * @see #getGezeichnet_am()
	 * @generated
	 */
	void setGezeichnet_am(String value);

	/**
	 * Returns the value of the '<em><b>Geprueft am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geprueft am</em>' attribute.
	 * @see #setGeprueft_am(String)
	 * @see at.tb_gruber.designer.model.ModelPackage#getBahnhof_Geprueft_am()
	 * @model ordered="false"
	 * @generated
	 */
	String getGeprueft_am();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_am <em>Geprueft am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geprueft am</em>' attribute.
	 * @see #getGeprueft_am()
	 * @generated
	 */
	void setGeprueft_am(String value);

} // Bahnhof

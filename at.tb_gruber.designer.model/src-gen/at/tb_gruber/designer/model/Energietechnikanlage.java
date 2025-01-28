/**
 */
package at.tb_gruber.designer.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energietechnikanlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.Energietechnikanlage#getEtType <em>Et Type</em>}</li>
 * </ul>
 *
 * @see at.tb_gruber.designer.model.ModelPackage#getEnergietechnikanlage()
 * @model
 * @generated
 */
public interface Energietechnikanlage extends GruppierbareAnlage {
	/**
	 * Returns the value of the '<em><b>Et Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.tb_gruber.designer.model.ET_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Et Type</em>' attribute.
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @see #setEtType(ET_Type)
	 * @see at.tb_gruber.designer.model.ModelPackage#getEnergietechnikanlage_EtType()
	 * @model
	 * @generated
	 */
	ET_Type getEtType();

	/**
	 * Sets the value of the '{@link at.tb_gruber.designer.model.Energietechnikanlage#getEtType <em>Et Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Et Type</em>' attribute.
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @see #getEtType()
	 * @generated
	 */
	void setEtType(ET_Type value);

} // Energietechnikanlage

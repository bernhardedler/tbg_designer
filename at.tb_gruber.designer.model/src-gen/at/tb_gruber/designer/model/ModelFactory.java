/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = at.tb_gruber.designer.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bahnhof</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnhof</em>'.
	 * @generated
	 */
	Bahnhof createBahnhof();

	/**
	 * Returns a new object of class '<em>Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objekt</em>'.
	 * @generated
	 */
	Objekt createObjekt();

	/**
	 * Returns a new object of class '<em>Verbindung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verbindung</em>'.
	 * @generated
	 */
	Verbindung createVerbindung();

	/**
	 * Returns a new object of class '<em>Plankopf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plankopf</em>'.
	 * @generated
	 */
	Plankopf createPlankopf();

	/**
	 * Returns a new object of class '<em>Textbaustein</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textbaustein</em>'.
	 * @generated
	 */
	Textbaustein createTextbaustein();

	/**
	 * Returns a new object of class '<em>Trafo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trafo</em>'.
	 * @generated
	 */
	Trafo createTrafo();

	/**
	 * Returns a new object of class '<em>Zaehlpunkt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zaehlpunkt</em>'.
	 * @generated
	 */
	Zaehlpunkt createZaehlpunkt();

	/**
	 * Returns a new object of class '<em>Versorgungsknoten</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versorgungsknoten</em>'.
	 * @generated
	 */
	Versorgungsknoten createVersorgungsknoten();

	/**
	 * Returns a new object of class '<em>Energietechnikanlage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energietechnikanlage</em>'.
	 * @generated
	 */
	Energietechnikanlage createEnergietechnikanlage();

	/**
	 * Returns a new object of class '<em>Versorgungsknoten Mit ET</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versorgungsknoten Mit ET</em>'.
	 * @generated
	 */
	VersorgungsknotenMitET createVersorgungsknotenMitET();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory

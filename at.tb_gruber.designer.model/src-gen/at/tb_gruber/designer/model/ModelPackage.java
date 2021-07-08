/**
 */
package at.tb_gruber.designer.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tb-gruber.at/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tbg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = at.tb_gruber.designer.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.BahnhofImpl <em>Bahnhof</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.BahnhofImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getBahnhof()
	 * @generated
	 */
	int BAHNHOF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Projektname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__PROJEKTNAME = 1;

	/**
	 * The feature id for the '<em><b>Objekt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__OBJEKT = 2;

	/**
	 * The feature id for the '<em><b>Plankopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__PLANKOPF = 3;

	/**
	 * The number of structural features of the '<em>Bahnhof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bahnhof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.ObjektImpl <em>Objekt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.ObjektImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getObjekt()
	 * @generated
	 */
	int OBJEKT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Objektart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__OBJEKTART = 1;

	/**
	 * The feature id for the '<em><b>Objekt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__OBJEKT_ID = 2;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__ANLAGE = 3;

	/**
	 * The feature id for the '<em><b>Db776ua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__DB776UA = 4;

	/**
	 * The feature id for the '<em><b>Gpsstandort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__GPSSTANDORT = 5;

	/**
	 * The feature id for the '<em><b>Externe Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__EXTERNE_QUELLE = 6;

	/**
	 * The feature id for the '<em><b>Ort adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__ORT_ADRESSE = 7;

	/**
	 * The feature id for the '<em><b>Gebaeudeart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__GEBAEUDEART = 8;

	/**
	 * The number of structural features of the '<em>Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl <em>Anlage Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.AnlageBaseImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageBase()
	 * @generated
	 */
	int ANLAGE_BASE = 21;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE__DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE__BETREIBER = 1;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE__VERSORGT_VON = 2;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE__VERBINDUNG_NACH = 3;

	/**
	 * The number of structural features of the '<em>Anlage Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Anlage Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl <em>Anlage Mit Attributen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageMitAttributen()
	 * @generated
	 */
	int ANLAGE_MIT_ATTRIBUTEN = 2;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__DETAILS = ANLAGE_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__BETREIBER = ANLAGE_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON = ANLAGE_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH = ANLAGE_BASE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__NAME = ANLAGE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER = ANLAGE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__OBJEKTTEIL = ANLAGE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__EADB_ID = ANLAGE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG = ANLAGE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL = ANLAGE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__ANLAGEN_ID_IMMO_ASSI = ANLAGE_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART = ANLAGE_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG = ANLAGE_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT = ANLAGE_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__RESERVE1 = ANLAGE_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__RESERVE2 = ANLAGE_BASE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Anlage Mit Attributen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT = ANLAGE_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Anlage Mit Attributen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT = ANLAGE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerbindungImpl <em>Verbindung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerbindungImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerbindung()
	 * @generated
	 */
	int VERBINDUNG = 3;

	/**
	 * The feature id for the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__NR = 0;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__PRIMAERSPANNUNG = 1;

	/**
	 * The feature id for the '<em><b>Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__ZIEL = 2;

	/**
	 * The feature id for the '<em><b>Ursprung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__URSPRUNG = 3;

	/**
	 * The feature id for the '<em><b>Quell Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__QUELL_SICHERUNG = 4;

	/**
	 * The feature id for the '<em><b>Ziel Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__ZIEL_SICHERUNG = 5;

	/**
	 * The feature id for the '<em><b>Kabeltype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__KABELTYPE = 6;

	/**
	 * The feature id for the '<em><b>Argusrelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__ARGUSRELEVANT = 7;

	/**
	 * The feature id for the '<em><b>Linientype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__LINIENTYPE = 8;

	/**
	 * The number of structural features of the '<em>Verbindung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Verbindung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.PlankopfImpl <em>Plankopf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.PlankopfImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getPlankopf()
	 * @generated
	 */
	int PLANKOPF = 4;

	/**
	 * The feature id for the '<em><b>Textbaustein</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANKOPF__TEXTBAUSTEIN = 0;

	/**
	 * The number of structural features of the '<em>Plankopf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANKOPF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plankopf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANKOPF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.TextbausteinImpl <em>Textbaustein</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.TextbausteinImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTextbaustein()
	 * @generated
	 */
	int TEXTBAUSTEIN = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTBAUSTEIN__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Textbaustein</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTBAUSTEIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Textbaustein</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTBAUSTEIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.SelbststAnlageImpl <em>Selbstst Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.SelbststAnlageImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getSelbststAnlage()
	 * @generated
	 */
	int SELBSTST_ANLAGE = 11;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI = ANLAGE_MIT_ATTRIBUTEN__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The number of structural features of the '<em>Selbstst Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selbstst Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELBSTST_ANLAGE_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.TrafoImpl <em>Trafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.TrafoImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTrafo()
	 * @generated
	 */
	int TRAFO = 6;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__DETAILS = SELBSTST_ANLAGE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__BETREIBER = SELBSTST_ANLAGE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERSORGT_VON = SELBSTST_ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERBINDUNG_NACH = SELBSTST_ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__NAME = SELBSTST_ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ANLAGENNUMMER = SELBSTST_ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__OBJEKTTEIL = SELBSTST_ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_ID = SELBSTST_ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__PRIMAERSPANNUNG = SELBSTST_ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__IN_OBJEKTTEIL = SELBSTST_ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ANLAGEN_ID_IMMO_ASSI = SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_VERSORGUNG_ART = SELBSTST_ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERTEILERBEZEICHNUNG = SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ABGANG_VT = SELBSTST_ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE1 = SELBSTST_ANLAGE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE2 = SELBSTST_ANLAGE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Sekundaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__SEKUNDAERSPANNUNG = SELBSTST_ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__TRAFO_KVA = SELBSTST_ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserve3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE3 = SELBSTST_ANLAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_FEATURE_COUNT = SELBSTST_ANLAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_OPERATION_COUNT = SELBSTST_ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl <em>Anlage Ohne Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageOhneAttribute()
	 * @generated
	 */
	int ANLAGE_OHNE_ATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE__DETAILS = ANLAGE_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE__BETREIBER = ANLAGE_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE__VERSORGT_VON = ANLAGE_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE__VERBINDUNG_NACH = ANLAGE_BASE__VERBINDUNG_NACH;

	/**
	 * The number of structural features of the '<em>Anlage Ohne Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT = ANLAGE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anlage Ohne Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OHNE_ATTRIBUTE_OPERATION_COUNT = ANLAGE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl <em>Netzanschlusspunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getNetzanschlusspunkt()
	 * @generated
	 */
	int NETZANSCHLUSSPUNKT = 7;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__DETAILS = ANLAGE_OHNE_ATTRIBUTE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__BETREIBER = ANLAGE_OHNE_ATTRIBUTE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__VERSORGT_VON = ANLAGE_OHNE_ATTRIBUTE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__VERBINDUNG_NACH = ANLAGE_OHNE_ATTRIBUTE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__NR_HAUPTVERSORGUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__NR_RESERVE_EINSPEISUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__BESCHREIBUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Langbeschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__POSTITION = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Netzanschlusspunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT_FEATURE_COUNT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Netzanschlusspunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT_OPERATION_COUNT = ANLAGE_OHNE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VersorgungsknotenImpl <em>Versorgungsknoten</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VersorgungsknotenImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVersorgungsknoten()
	 * @generated
	 */
	int VERSORGUNGSKNOTEN = 8;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__DETAILS = SELBSTST_ANLAGE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__BETREIBER = SELBSTST_ANLAGE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERSORGT_VON = SELBSTST_ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERBINDUNG_NACH = SELBSTST_ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__NAME = SELBSTST_ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ANLAGENNUMMER = SELBSTST_ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__OBJEKTTEIL = SELBSTST_ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_ID = SELBSTST_ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__PRIMAERSPANNUNG = SELBSTST_ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__IN_OBJEKTTEIL = SELBSTST_ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ANLAGEN_ID_IMMO_ASSI = SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_VERSORGUNG_ART = SELBSTST_ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERTEILERBEZEICHNUNG = SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ABGANG_VT = SELBSTST_ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__RESERVE1 = SELBSTST_ANLAGE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__RESERVE2 = SELBSTST_ANLAGE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT = SELBSTST_ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_FEATURE_COUNT = SELBSTST_ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_OPERATION_COUNT = SELBSTST_ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl <em>Energietechnikanlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergietechnikanlage()
	 * @generated
	 */
	int ENERGIETECHNIKANLAGE = 9;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__DETAILS = SELBSTST_ANLAGE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__BETREIBER = SELBSTST_ANLAGE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERSORGT_VON = SELBSTST_ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERBINDUNG_NACH = SELBSTST_ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__NAME = SELBSTST_ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ANLAGENNUMMER = SELBSTST_ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__OBJEKTTEIL = SELBSTST_ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_ID = SELBSTST_ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__PRIMAERSPANNUNG = SELBSTST_ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__IN_OBJEKTTEIL = SELBSTST_ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ANLAGEN_ID_IMMO_ASSI = SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_VERSORGUNG_ART = SELBSTST_ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERTEILERBEZEICHNUNG = SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ABGANG_VT = SELBSTST_ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__RESERVE1 = SELBSTST_ANLAGE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__RESERVE2 = SELBSTST_ANLAGE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Et Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ET_TYPE = SELBSTST_ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_FEATURE_COUNT = SELBSTST_ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_OPERATION_COUNT = SELBSTST_ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.GeneratorImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 10;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DETAILS = SELBSTST_ANLAGE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BETREIBER = SELBSTST_ANLAGE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERSORGT_VON = SELBSTST_ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERBINDUNG_NACH = SELBSTST_ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = SELBSTST_ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ANLAGENNUMMER = SELBSTST_ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OBJEKTTEIL = SELBSTST_ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__EADB_ID = SELBSTST_ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PRIMAERSPANNUNG = SELBSTST_ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__IN_OBJEKTTEIL = SELBSTST_ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ANLAGEN_ID_IMMO_ASSI = SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__EADB_VERSORGUNG_ART = SELBSTST_ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERTEILERBEZEICHNUNG = SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ABGANG_VT = SELBSTST_ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RESERVE1 = SELBSTST_ANLAGE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RESERVE2 = SELBSTST_ANLAGE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Generatorfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GENERATORFUNKTION = SELBSTST_ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erzeugte Energie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ERZEUGTE_ENERGIE = SELBSTST_ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elektrische Leistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELEKTRISCHE_LEISTUNG = SELBSTST_ANLAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = SELBSTST_ANLAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = SELBSTST_ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.UmrichterBaseImpl <em>Umrichter Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.UmrichterBaseImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterBase()
	 * @generated
	 */
	int UMRICHTER_BASE = 12;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__DETAILS = SELBSTST_ANLAGE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__BETREIBER = SELBSTST_ANLAGE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__VERSORGT_VON = SELBSTST_ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__VERBINDUNG_NACH = SELBSTST_ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__NAME = SELBSTST_ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__ANLAGENNUMMER = SELBSTST_ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__OBJEKTTEIL = SELBSTST_ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__EADB_ID = SELBSTST_ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__PRIMAERSPANNUNG = SELBSTST_ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__IN_OBJEKTTEIL = SELBSTST_ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__ANLAGEN_ID_IMMO_ASSI = SELBSTST_ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__EADB_VERSORGUNG_ART = SELBSTST_ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__VERTEILERBEZEICHNUNG = SELBSTST_ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__ABGANG_VT = SELBSTST_ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__RESERVE1 = SELBSTST_ANLAGE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__RESERVE2 = SELBSTST_ANLAGE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Umrichterfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__UMRICHTERFUNKTION = SELBSTST_ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Umrichterart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__UMRICHTERART = SELBSTST_ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nennleistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE__NENNLEISTUNG = SELBSTST_ANLAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Umrichter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE_FEATURE_COUNT = SELBSTST_ANLAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Umrichter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_BASE_OPERATION_COUNT = SELBSTST_ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerBaseImpl <em>Verteiler Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerBaseImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerBase()
	 * @generated
	 */
	int VERTEILER_BASE = 17;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__ANLAGEN_ID_IMMO_ASSI = ANLAGE_MIT_ATTRIBUTEN__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__NETZANSCHLUSSPUNKT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verteiler Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verteiler Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl <em>Verteiler Mit Zaehler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerMitZaehler()
	 * @generated
	 */
	int VERTEILER_MIT_ZAEHLER = 13;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__DETAILS = VERTEILER_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__BETREIBER = VERTEILER_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__VERSORGT_VON = VERTEILER_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__VERBINDUNG_NACH = VERTEILER_BASE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NAME = VERTEILER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__ANLAGENNUMMER = VERTEILER_BASE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__OBJEKTTEIL = VERTEILER_BASE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__EADB_ID = VERTEILER_BASE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__PRIMAERSPANNUNG = VERTEILER_BASE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__IN_OBJEKTTEIL = VERTEILER_BASE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__ANLAGEN_ID_IMMO_ASSI = VERTEILER_BASE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__EADB_VERSORGUNG_ART = VERTEILER_BASE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__VERTEILERBEZEICHNUNG = VERTEILER_BASE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__ABGANG_VT = VERTEILER_BASE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__RESERVE1 = VERTEILER_BASE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__RESERVE2 = VERTEILER_BASE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NETZANSCHLUSSPUNKT = VERTEILER_BASE__NETZANSCHLUSSPUNKT;

	/**
	 * The number of structural features of the '<em>Verteiler Mit Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER_FEATURE_COUNT = VERTEILER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verteiler Mit Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER_OPERATION_COUNT = VERTEILER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl <em>Umrichter Mit Energiespeicher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterMitEnergiespeicher()
	 * @generated
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER = 14;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__DETAILS = UMRICHTER_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__BETREIBER = UMRICHTER_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__VERSORGT_VON = UMRICHTER_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__VERBINDUNG_NACH = UMRICHTER_BASE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__NAME = UMRICHTER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__ANLAGENNUMMER = UMRICHTER_BASE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__OBJEKTTEIL = UMRICHTER_BASE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__EADB_ID = UMRICHTER_BASE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__PRIMAERSPANNUNG = UMRICHTER_BASE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__IN_OBJEKTTEIL = UMRICHTER_BASE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__ANLAGEN_ID_IMMO_ASSI = UMRICHTER_BASE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__EADB_VERSORGUNG_ART = UMRICHTER_BASE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__VERTEILERBEZEICHNUNG = UMRICHTER_BASE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__ABGANG_VT = UMRICHTER_BASE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__RESERVE1 = UMRICHTER_BASE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__RESERVE2 = UMRICHTER_BASE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Umrichterfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__UMRICHTERFUNKTION = UMRICHTER_BASE__UMRICHTERFUNKTION;

	/**
	 * The feature id for the '<em><b>Umrichterart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__UMRICHTERART = UMRICHTER_BASE__UMRICHTERART;

	/**
	 * The feature id for the '<em><b>Nennleistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__NENNLEISTUNG = UMRICHTER_BASE__NENNLEISTUNG;

	/**
	 * The feature id for the '<em><b>Energiespeicherfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION = UMRICHTER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energiespeicherart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART = UMRICHTER_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Autonomiezeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT = UMRICHTER_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kapazitaet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET = UMRICHTER_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Umrichter Mit Energiespeicher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER_FEATURE_COUNT = UMRICHTER_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Umrichter Mit Energiespeicher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_MIT_ENERGIESPEICHER_OPERATION_COUNT = UMRICHTER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl <em>Verteiler Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerContainerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerContainer()
	 * @generated
	 */
	int VERTEILER_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__DETAILS = ANLAGE_OHNE_ATTRIBUTE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__BETREIBER = ANLAGE_OHNE_ATTRIBUTE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERSORGT_VON = ANLAGE_OHNE_ATTRIBUTE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERBINDUNG_NACH = ANLAGE_OHNE_ATTRIBUTE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Verteiler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERTEILER = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__NAME = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verteiler Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER_FEATURE_COUNT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Verteiler Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER_OPERATION_COUNT = ANLAGE_OHNE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.BetreiberImpl <em>Betreiber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.BetreiberImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getBetreiber()
	 * @generated
	 */
	int BETREIBER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREIBER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Betreiber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREIBER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Betreiber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETREIBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerOhneZaehlerImpl <em>Verteiler Ohne Zaehler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerOhneZaehlerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerOhneZaehler()
	 * @generated
	 */
	int VERTEILER_OHNE_ZAEHLER = 18;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__DETAILS = VERTEILER_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__BETREIBER = VERTEILER_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__VERSORGT_VON = VERTEILER_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__VERBINDUNG_NACH = VERTEILER_BASE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__NAME = VERTEILER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__ANLAGENNUMMER = VERTEILER_BASE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__OBJEKTTEIL = VERTEILER_BASE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__EADB_ID = VERTEILER_BASE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__PRIMAERSPANNUNG = VERTEILER_BASE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__IN_OBJEKTTEIL = VERTEILER_BASE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__ANLAGEN_ID_IMMO_ASSI = VERTEILER_BASE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__EADB_VERSORGUNG_ART = VERTEILER_BASE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__VERTEILERBEZEICHNUNG = VERTEILER_BASE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__ABGANG_VT = VERTEILER_BASE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__RESERVE1 = VERTEILER_BASE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__RESERVE2 = VERTEILER_BASE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__NETZANSCHLUSSPUNKT = VERTEILER_BASE__NETZANSCHLUSSPUNKT;

	/**
	 * The number of structural features of the '<em>Verteiler Ohne Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER_FEATURE_COUNT = VERTEILER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verteiler Ohne Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER_OPERATION_COUNT = VERTEILER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.DetailsImpl <em>Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.DetailsImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getDetails()
	 * @generated
	 */
	int DETAILS = 19;

	/**
	 * The number of structural features of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.UmrichterImpl <em>Umrichter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.UmrichterImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichter()
	 * @generated
	 */
	int UMRICHTER = 20;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__DETAILS = UMRICHTER_BASE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__BETREIBER = UMRICHTER_BASE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERSORGT_VON = UMRICHTER_BASE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERBINDUNG_NACH = UMRICHTER_BASE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__NAME = UMRICHTER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__ANLAGENNUMMER = UMRICHTER_BASE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__OBJEKTTEIL = UMRICHTER_BASE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__EADB_ID = UMRICHTER_BASE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__PRIMAERSPANNUNG = UMRICHTER_BASE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__IN_OBJEKTTEIL = UMRICHTER_BASE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__ANLAGEN_ID_IMMO_ASSI = UMRICHTER_BASE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__EADB_VERSORGUNG_ART = UMRICHTER_BASE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERTEILERBEZEICHNUNG = UMRICHTER_BASE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__ABGANG_VT = UMRICHTER_BASE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__RESERVE1 = UMRICHTER_BASE__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__RESERVE2 = UMRICHTER_BASE__RESERVE2;

	/**
	 * The feature id for the '<em><b>Umrichterfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__UMRICHTERFUNKTION = UMRICHTER_BASE__UMRICHTERFUNKTION;

	/**
	 * The feature id for the '<em><b>Umrichterart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__UMRICHTERART = UMRICHTER_BASE__UMRICHTERART;

	/**
	 * The feature id for the '<em><b>Nennleistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__NENNLEISTUNG = UMRICHTER_BASE__NENNLEISTUNG;

	/**
	 * The number of structural features of the '<em>Umrichter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_FEATURE_COUNT = UMRICHTER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Umrichter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_OPERATION_COUNT = UMRICHTER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Objektarttype <em>Objektarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Objektarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getObjektarttype()
	 * @generated
	 */
	int OBJEKTARTTYPE = 23;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Spannungsarttype <em>Spannungsarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getSpannungsarttype()
	 * @generated
	 */
	int SPANNUNGSARTTYPE = 24;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Externe_Datenquelle <em>Externe Datenquelle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Externe_Datenquelle
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getExterne_Datenquelle()
	 * @generated
	 */
	int EXTERNE_DATENQUELLE = 25;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ET_Type <em>ET Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getET_Type()
	 * @generated
	 */
	int ET_TYPE = 26;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ARGUSrelevant <em>ARGU Srelevant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getARGUSrelevant()
	 * @generated
	 */
	int ARGU_SRELEVANT = 27;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Eadb_Versorgung_Art <em>Eadb Versorgung Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEadb_Versorgung_Art()
	 * @generated
	 */
	int EADB_VERSORGUNG_ART = 28;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.NapPosition <em>Nap Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getNapPosition()
	 * @generated
	 */
	int NAP_POSITION = 29;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.LinienType <em>Linien Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.LinienType
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getLinienType()
	 * @generated
	 */
	int LINIEN_TYPE = 30;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Generatorfunktion <em>Generatorfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Generatorfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGeneratorfunktion()
	 * @generated
	 */
	int GENERATORFUNKTION = 31;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Umrichterart <em>Umrichterart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Umrichterart
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterart()
	 * @generated
	 */
	int UMRICHTERART = 32;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Energiespeicherart <em>Energiespeicherart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Energiespeicherart
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherart()
	 * @generated
	 */
	int ENERGIESPEICHERART = 33;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Umrichterfunktion <em>Umrichterfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Umrichterfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterfunktion()
	 * @generated
	 */
	int UMRICHTERFUNKTION = 34;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Energiespeicherfunktion <em>Energiespeicherfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherfunktion()
	 * @generated
	 */
	int ENERGIESPEICHERFUNKTION = 35;

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Bahnhof <em>Bahnhof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bahnhof</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof
	 * @generated
	 */
	EClass getBahnhof();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getName()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getProjektname <em>Projektname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projektname</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getProjektname()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Projektname();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.Bahnhof#getObjekt <em>Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objekt</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getObjekt()
	 * @see #getBahnhof()
	 * @generated
	 */
	EReference getBahnhof_Objekt();

	/**
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.Bahnhof#getPlankopf <em>Plankopf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plankopf</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getPlankopf()
	 * @see #getBahnhof()
	 * @generated
	 */
	EReference getBahnhof_Plankopf();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Objekt <em>Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objekt</em>'.
	 * @see at.tb_gruber.designer.model.Objekt
	 * @generated
	 */
	EClass getObjekt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getName()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getObjektart <em>Objektart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objektart</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getObjektart()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Objektart();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getObjektId <em>Objekt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objekt Id</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getObjektId()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_ObjektId();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.Objekt#getAnlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anlage</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getAnlage()
	 * @see #getObjekt()
	 * @generated
	 */
	EReference getObjekt_Anlage();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getDb776ua <em>Db776ua</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db776ua</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getDb776ua()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Db776ua();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getGpsstandort <em>Gpsstandort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpsstandort</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getGpsstandort()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Gpsstandort();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getExterneQuelle <em>Externe Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Externe Quelle</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getExterneQuelle()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_ExterneQuelle();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getOrt_adresse <em>Ort adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort adresse</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getOrt_adresse()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Ort_adresse();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getGebaeudeart <em>Gebaeudeart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gebaeudeart</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getGebaeudeart()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Gebaeudeart();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.AnlageMitAttributen <em>Anlage Mit Attributen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anlage Mit Attributen</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen
	 * @generated
	 */
	EClass getAnlageMitAttributen();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getName()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagennummer <em>Anlagennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anlagennummer</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagennummer()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Anlagennummer();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getObjektteil <em>Objektteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objektteil</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getObjektteil()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Objektteil();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbId <em>Eadb Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eadb Id</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getEadbId()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_EadbId();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getPrimaerspannung <em>Primaerspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primaerspannung</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getPrimaerspannung()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Primaerspannung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getInObjektteil <em>In Objektteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Objektteil</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getInObjektteil()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_InObjektteil();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anlagen Id Immo Assi</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getAnlagenIdImmoAssi()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_AnlagenIdImmoAssi();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eadb Versorgung Art</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getEadbVersorgungArt()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_EadbVersorgungArt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verteilerbezeichnung</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getVerteilerbezeichnung()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Verteilerbezeichnung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getAbgangVT <em>Abgang VT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abgang VT</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getAbgangVT()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_AbgangVT();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve1 <em>Reserve1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve1</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getReserve1()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Reserve1();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.AnlageMitAttributen#getReserve2 <em>Reserve2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve2</em>'.
	 * @see at.tb_gruber.designer.model.AnlageMitAttributen#getReserve2()
	 * @see #getAnlageMitAttributen()
	 * @generated
	 */
	EAttribute getAnlageMitAttributen_Reserve2();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Verbindung <em>Verbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbindung</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung
	 * @generated
	 */
	EClass getVerbindung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getNr()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Nr();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getPrimaerspannung <em>Primaerspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primaerspannung</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getPrimaerspannung()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Primaerspannung();

	/**
	 * Returns the meta object for the reference '{@link at.tb_gruber.designer.model.Verbindung#getZiel <em>Ziel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ziel</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getZiel()
	 * @see #getVerbindung()
	 * @generated
	 */
	EReference getVerbindung_Ziel();

	/**
	 * Returns the meta object for the reference '{@link at.tb_gruber.designer.model.Verbindung#getUrsprung <em>Ursprung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ursprung</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getUrsprung()
	 * @see #getVerbindung()
	 * @generated
	 */
	EReference getVerbindung_Ursprung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getQuellSicherung <em>Quell Sicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quell Sicherung</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getQuellSicherung()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_QuellSicherung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getZielSicherung <em>Ziel Sicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ziel Sicherung</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getZielSicherung()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_ZielSicherung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getKabeltype <em>Kabeltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kabeltype</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getKabeltype()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Kabeltype();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getArgusrelevant <em>Argusrelevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argusrelevant</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getArgusrelevant()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Argusrelevant();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getLinientype <em>Linientype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linientype</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getLinientype()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Linientype();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Plankopf <em>Plankopf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plankopf</em>'.
	 * @see at.tb_gruber.designer.model.Plankopf
	 * @generated
	 */
	EClass getPlankopf();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.Plankopf#getTextbaustein <em>Textbaustein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textbaustein</em>'.
	 * @see at.tb_gruber.designer.model.Plankopf#getTextbaustein()
	 * @see #getPlankopf()
	 * @generated
	 */
	EReference getPlankopf_Textbaustein();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Textbaustein <em>Textbaustein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textbaustein</em>'.
	 * @see at.tb_gruber.designer.model.Textbaustein
	 * @generated
	 */
	EClass getTextbaustein();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Textbaustein#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see at.tb_gruber.designer.model.Textbaustein#getLabel()
	 * @see #getTextbaustein()
	 * @generated
	 */
	EAttribute getTextbaustein_Label();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Trafo <em>Trafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trafo</em>'.
	 * @see at.tb_gruber.designer.model.Trafo
	 * @generated
	 */
	EClass getTrafo();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getSekundaerspannung <em>Sekundaerspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sekundaerspannung</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getSekundaerspannung()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_Sekundaerspannung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getTrafoKva <em>Trafo Kva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trafo Kva</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getTrafoKva()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_TrafoKva();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getReserve3 <em>Reserve3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve3</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getReserve3()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_Reserve3();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Netzanschlusspunkt <em>Netzanschlusspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netzanschlusspunkt</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt
	 * @generated
	 */
	EClass getNetzanschlusspunkt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Hauptversorgung</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#getNrHauptversorgung()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_NrHauptversorgung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Reserve Einspeisung</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#getNrReserveEinspeisung()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_NrReserveEinspeisung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#getBeschreibung()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getLangbeschreibung <em>Langbeschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langbeschreibung</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#getLangbeschreibung()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_Langbeschreibung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition <em>Postition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postition</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#getPostition()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_Postition();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Versorgungsknoten <em>Versorgungsknoten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versorgungsknoten</em>'.
	 * @see at.tb_gruber.designer.model.Versorgungsknoten
	 * @generated
	 */
	EClass getVersorgungsknoten();

	/**
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.Versorgungsknoten#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Netzanschlusspunkt</em>'.
	 * @see at.tb_gruber.designer.model.Versorgungsknoten#getNetzanschlusspunkt()
	 * @see #getVersorgungsknoten()
	 * @generated
	 */
	EReference getVersorgungsknoten_Netzanschlusspunkt();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Energietechnikanlage <em>Energietechnikanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energietechnikanlage</em>'.
	 * @see at.tb_gruber.designer.model.Energietechnikanlage
	 * @generated
	 */
	EClass getEnergietechnikanlage();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energietechnikanlage#getEtType <em>Et Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Et Type</em>'.
	 * @see at.tb_gruber.designer.model.Energietechnikanlage#getEtType()
	 * @see #getEnergietechnikanlage()
	 * @generated
	 */
	EAttribute getEnergietechnikanlage_EtType();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see at.tb_gruber.designer.model.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Generator#getGeneratorfunktion <em>Generatorfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generatorfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Generator#getGeneratorfunktion()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Generatorfunktion();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Generator#getErzeugteEnergie <em>Erzeugte Energie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erzeugte Energie</em>'.
	 * @see at.tb_gruber.designer.model.Generator#getErzeugteEnergie()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ErzeugteEnergie();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Generator#getElektrischeLeistung <em>Elektrische Leistung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elektrische Leistung</em>'.
	 * @see at.tb_gruber.designer.model.Generator#getElektrischeLeistung()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ElektrischeLeistung();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.SelbststAnlage <em>Selbstst Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selbstst Anlage</em>'.
	 * @see at.tb_gruber.designer.model.SelbststAnlage
	 * @generated
	 */
	EClass getSelbststAnlage();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.UmrichterBase <em>Umrichter Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Umrichter Base</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterBase
	 * @generated
	 */
	EClass getUmrichterBase();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterBase#getUmrichterfunktion <em>Umrichterfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umrichterfunktion</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterBase#getUmrichterfunktion()
	 * @see #getUmrichterBase()
	 * @generated
	 */
	EAttribute getUmrichterBase_Umrichterfunktion();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterBase#getUmrichterart <em>Umrichterart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umrichterart</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterBase#getUmrichterart()
	 * @see #getUmrichterBase()
	 * @generated
	 */
	EAttribute getUmrichterBase_Umrichterart();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterBase#getNennleistung <em>Nennleistung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nennleistung</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterBase#getNennleistung()
	 * @see #getUmrichterBase()
	 * @generated
	 */
	EAttribute getUmrichterBase_Nennleistung();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.VerteilerMitZaehler <em>Verteiler Mit Zaehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verteiler Mit Zaehler</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerMitZaehler
	 * @generated
	 */
	EClass getVerteilerMitZaehler();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher <em>Umrichter Mit Energiespeicher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Umrichter Mit Energiespeicher</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterMitEnergiespeicher
	 * @generated
	 */
	EClass getUmrichterMitEnergiespeicher();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energiespeicherfunktion</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getEnergiespeicherfunktion()
	 * @see #getUmrichterMitEnergiespeicher()
	 * @generated
	 */
	EAttribute getUmrichterMitEnergiespeicher_Energiespeicherfunktion();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getEnergiespeicherart <em>Energiespeicherart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energiespeicherart</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getEnergiespeicherart()
	 * @see #getUmrichterMitEnergiespeicher()
	 * @generated
	 */
	EAttribute getUmrichterMitEnergiespeicher_Energiespeicherart();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getAutonomiezeit <em>Autonomiezeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autonomiezeit</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getAutonomiezeit()
	 * @see #getUmrichterMitEnergiespeicher()
	 * @generated
	 */
	EAttribute getUmrichterMitEnergiespeicher_Autonomiezeit();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getKapazitaet <em>Kapazitaet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kapazitaet</em>'.
	 * @see at.tb_gruber.designer.model.UmrichterMitEnergiespeicher#getKapazitaet()
	 * @see #getUmrichterMitEnergiespeicher()
	 * @generated
	 */
	EAttribute getUmrichterMitEnergiespeicher_Kapazitaet();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.VerteilerContainer <em>Verteiler Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verteiler Container</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerContainer
	 * @generated
	 */
	EClass getVerteilerContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.VerteilerContainer#getVerteiler <em>Verteiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verteiler</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerContainer#getVerteiler()
	 * @see #getVerteilerContainer()
	 * @generated
	 */
	EReference getVerteilerContainer_Verteiler();

	/**
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.VerteilerContainer#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Netzanschlusspunkt</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerContainer#getNetzanschlusspunkt()
	 * @see #getVerteilerContainer()
	 * @generated
	 */
	EReference getVerteilerContainer_Netzanschlusspunkt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.VerteilerContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerContainer#getName()
	 * @see #getVerteilerContainer()
	 * @generated
	 */
	EAttribute getVerteilerContainer_Name();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Betreiber <em>Betreiber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Betreiber</em>'.
	 * @see at.tb_gruber.designer.model.Betreiber
	 * @generated
	 */
	EClass getBetreiber();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Betreiber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.Betreiber#getName()
	 * @see #getBetreiber()
	 * @generated
	 */
	EAttribute getBetreiber_Name();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.VerteilerBase <em>Verteiler Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verteiler Base</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerBase
	 * @generated
	 */
	EClass getVerteilerBase();

	/**
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.VerteilerBase#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Netzanschlusspunkt</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerBase#getNetzanschlusspunkt()
	 * @see #getVerteilerBase()
	 * @generated
	 */
	EReference getVerteilerBase_Netzanschlusspunkt();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.VerteilerOhneZaehler <em>Verteiler Ohne Zaehler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verteiler Ohne Zaehler</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerOhneZaehler
	 * @generated
	 */
	EClass getVerteilerOhneZaehler();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details</em>'.
	 * @see at.tb_gruber.designer.model.Details
	 * @generated
	 */
	EClass getDetails();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Umrichter <em>Umrichter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Umrichter</em>'.
	 * @see at.tb_gruber.designer.model.Umrichter
	 * @generated
	 */
	EClass getUmrichter();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.AnlageBase <em>Anlage Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anlage Base</em>'.
	 * @see at.tb_gruber.designer.model.AnlageBase
	 * @generated
	 */
	EClass getAnlageBase();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.AnlageBase#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see at.tb_gruber.designer.model.AnlageBase#getDetails()
	 * @see #getAnlageBase()
	 * @generated
	 */
	EReference getAnlageBase_Details();

	/**
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.AnlageBase#getBetreiber <em>Betreiber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Betreiber</em>'.
	 * @see at.tb_gruber.designer.model.AnlageBase#getBetreiber()
	 * @see #getAnlageBase()
	 * @generated
	 */
	EReference getAnlageBase_Betreiber();

	/**
	 * Returns the meta object for the reference list '{@link at.tb_gruber.designer.model.AnlageBase#getVersorgtVon <em>Versorgt Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versorgt Von</em>'.
	 * @see at.tb_gruber.designer.model.AnlageBase#getVersorgtVon()
	 * @see #getAnlageBase()
	 * @generated
	 */
	EReference getAnlageBase_VersorgtVon();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.AnlageBase#getVerbindungNach <em>Verbindung Nach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verbindung Nach</em>'.
	 * @see at.tb_gruber.designer.model.AnlageBase#getVerbindungNach()
	 * @see #getAnlageBase()
	 * @generated
	 */
	EReference getAnlageBase_VerbindungNach();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.AnlageOhneAttribute <em>Anlage Ohne Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anlage Ohne Attribute</em>'.
	 * @see at.tb_gruber.designer.model.AnlageOhneAttribute
	 * @generated
	 */
	EClass getAnlageOhneAttribute();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Objektarttype <em>Objektarttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Objektarttype</em>'.
	 * @see at.tb_gruber.designer.model.Objektarttype
	 * @generated
	 */
	EEnum getObjektarttype();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Spannungsarttype <em>Spannungsarttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spannungsarttype</em>'.
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @generated
	 */
	EEnum getSpannungsarttype();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Externe_Datenquelle <em>Externe Datenquelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Externe Datenquelle</em>'.
	 * @see at.tb_gruber.designer.model.Externe_Datenquelle
	 * @generated
	 */
	EEnum getExterne_Datenquelle();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.ET_Type <em>ET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ET Type</em>'.
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @generated
	 */
	EEnum getET_Type();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.ARGUSrelevant <em>ARGU Srelevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARGU Srelevant</em>'.
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @generated
	 */
	EEnum getARGUSrelevant();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Eadb_Versorgung_Art <em>Eadb Versorgung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eadb Versorgung Art</em>'.
	 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
	 * @generated
	 */
	EEnum getEadb_Versorgung_Art();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.NapPosition <em>Nap Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nap Position</em>'.
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @generated
	 */
	EEnum getNapPosition();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.LinienType <em>Linien Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linien Type</em>'.
	 * @see at.tb_gruber.designer.model.LinienType
	 * @generated
	 */
	EEnum getLinienType();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Generatorfunktion <em>Generatorfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generatorfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Generatorfunktion
	 * @generated
	 */
	EEnum getGeneratorfunktion();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Umrichterart <em>Umrichterart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Umrichterart</em>'.
	 * @see at.tb_gruber.designer.model.Umrichterart
	 * @generated
	 */
	EEnum getUmrichterart();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Energiespeicherart <em>Energiespeicherart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Energiespeicherart</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicherart
	 * @generated
	 */
	EEnum getEnergiespeicherart();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Umrichterfunktion <em>Umrichterfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Umrichterfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Umrichterfunktion
	 * @generated
	 */
	EEnum getUmrichterfunktion();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Energiespeicherfunktion <em>Energiespeicherfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Energiespeicherfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
	 * @generated
	 */
	EEnum getEnergiespeicherfunktion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.BahnhofImpl <em>Bahnhof</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.BahnhofImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getBahnhof()
		 * @generated
		 */
		EClass BAHNHOF = eINSTANCE.getBahnhof();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__NAME = eINSTANCE.getBahnhof_Name();

		/**
		 * The meta object literal for the '<em><b>Projektname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__PROJEKTNAME = eINSTANCE.getBahnhof_Projektname();

		/**
		 * The meta object literal for the '<em><b>Objekt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNHOF__OBJEKT = eINSTANCE.getBahnhof_Objekt();

		/**
		 * The meta object literal for the '<em><b>Plankopf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAHNHOF__PLANKOPF = eINSTANCE.getBahnhof_Plankopf();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.ObjektImpl <em>Objekt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.ObjektImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getObjekt()
		 * @generated
		 */
		EClass OBJEKT = eINSTANCE.getObjekt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__NAME = eINSTANCE.getObjekt_Name();

		/**
		 * The meta object literal for the '<em><b>Objektart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__OBJEKTART = eINSTANCE.getObjekt_Objektart();

		/**
		 * The meta object literal for the '<em><b>Objekt Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__OBJEKT_ID = eINSTANCE.getObjekt_ObjektId();

		/**
		 * The meta object literal for the '<em><b>Anlage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJEKT__ANLAGE = eINSTANCE.getObjekt_Anlage();

		/**
		 * The meta object literal for the '<em><b>Db776ua</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__DB776UA = eINSTANCE.getObjekt_Db776ua();

		/**
		 * The meta object literal for the '<em><b>Gpsstandort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__GPSSTANDORT = eINSTANCE.getObjekt_Gpsstandort();

		/**
		 * The meta object literal for the '<em><b>Externe Quelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__EXTERNE_QUELLE = eINSTANCE.getObjekt_ExterneQuelle();

		/**
		 * The meta object literal for the '<em><b>Ort adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__ORT_ADRESSE = eINSTANCE.getObjekt_Ort_adresse();

		/**
		 * The meta object literal for the '<em><b>Gebaeudeart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__GEBAEUDEART = eINSTANCE.getObjekt_Gebaeudeart();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl <em>Anlage Mit Attributen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageMitAttributen()
		 * @generated
		 */
		EClass ANLAGE_MIT_ATTRIBUTEN = eINSTANCE.getAnlageMitAttributen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__NAME = eINSTANCE.getAnlageMitAttributen_Name();

		/**
		 * The meta object literal for the '<em><b>Anlagennummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER = eINSTANCE.getAnlageMitAttributen_Anlagennummer();

		/**
		 * The meta object literal for the '<em><b>Objektteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__OBJEKTTEIL = eINSTANCE.getAnlageMitAttributen_Objektteil();

		/**
		 * The meta object literal for the '<em><b>Eadb Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__EADB_ID = eINSTANCE.getAnlageMitAttributen_EadbId();

		/**
		 * The meta object literal for the '<em><b>Primaerspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG = eINSTANCE.getAnlageMitAttributen_Primaerspannung();

		/**
		 * The meta object literal for the '<em><b>In Objektteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL = eINSTANCE.getAnlageMitAttributen_InObjektteil();

		/**
		 * The meta object literal for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__ANLAGEN_ID_IMMO_ASSI = eINSTANCE.getAnlageMitAttributen_AnlagenIdImmoAssi();

		/**
		 * The meta object literal for the '<em><b>Eadb Versorgung Art</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART = eINSTANCE.getAnlageMitAttributen_EadbVersorgungArt();

		/**
		 * The meta object literal for the '<em><b>Verteilerbezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG = eINSTANCE
				.getAnlageMitAttributen_Verteilerbezeichnung();

		/**
		 * The meta object literal for the '<em><b>Abgang VT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT = eINSTANCE.getAnlageMitAttributen_AbgangVT();

		/**
		 * The meta object literal for the '<em><b>Reserve1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__RESERVE1 = eINSTANCE.getAnlageMitAttributen_Reserve1();

		/**
		 * The meta object literal for the '<em><b>Reserve2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_MIT_ATTRIBUTEN__RESERVE2 = eINSTANCE.getAnlageMitAttributen_Reserve2();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VerbindungImpl <em>Verbindung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VerbindungImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerbindung()
		 * @generated
		 */
		EClass VERBINDUNG = eINSTANCE.getVerbindung();

		/**
		 * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__NR = eINSTANCE.getVerbindung_Nr();

		/**
		 * The meta object literal for the '<em><b>Primaerspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__PRIMAERSPANNUNG = eINSTANCE.getVerbindung_Primaerspannung();

		/**
		 * The meta object literal for the '<em><b>Ziel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBINDUNG__ZIEL = eINSTANCE.getVerbindung_Ziel();

		/**
		 * The meta object literal for the '<em><b>Ursprung</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBINDUNG__URSPRUNG = eINSTANCE.getVerbindung_Ursprung();

		/**
		 * The meta object literal for the '<em><b>Quell Sicherung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__QUELL_SICHERUNG = eINSTANCE.getVerbindung_QuellSicherung();

		/**
		 * The meta object literal for the '<em><b>Ziel Sicherung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__ZIEL_SICHERUNG = eINSTANCE.getVerbindung_ZielSicherung();

		/**
		 * The meta object literal for the '<em><b>Kabeltype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__KABELTYPE = eINSTANCE.getVerbindung_Kabeltype();

		/**
		 * The meta object literal for the '<em><b>Argusrelevant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__ARGUSRELEVANT = eINSTANCE.getVerbindung_Argusrelevant();

		/**
		 * The meta object literal for the '<em><b>Linientype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__LINIENTYPE = eINSTANCE.getVerbindung_Linientype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.PlankopfImpl <em>Plankopf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.PlankopfImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getPlankopf()
		 * @generated
		 */
		EClass PLANKOPF = eINSTANCE.getPlankopf();

		/**
		 * The meta object literal for the '<em><b>Textbaustein</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANKOPF__TEXTBAUSTEIN = eINSTANCE.getPlankopf_Textbaustein();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.TextbausteinImpl <em>Textbaustein</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.TextbausteinImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTextbaustein()
		 * @generated
		 */
		EClass TEXTBAUSTEIN = eINSTANCE.getTextbaustein();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTBAUSTEIN__LABEL = eINSTANCE.getTextbaustein_Label();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.TrafoImpl <em>Trafo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.TrafoImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTrafo()
		 * @generated
		 */
		EClass TRAFO = eINSTANCE.getTrafo();

		/**
		 * The meta object literal for the '<em><b>Sekundaerspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__SEKUNDAERSPANNUNG = eINSTANCE.getTrafo_Sekundaerspannung();

		/**
		 * The meta object literal for the '<em><b>Trafo Kva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__TRAFO_KVA = eINSTANCE.getTrafo_TrafoKva();

		/**
		 * The meta object literal for the '<em><b>Reserve3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__RESERVE3 = eINSTANCE.getTrafo_Reserve3();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl <em>Netzanschlusspunkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getNetzanschlusspunkt()
		 * @generated
		 */
		EClass NETZANSCHLUSSPUNKT = eINSTANCE.getNetzanschlusspunkt();

		/**
		 * The meta object literal for the '<em><b>Nr Hauptversorgung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__NR_HAUPTVERSORGUNG = eINSTANCE.getNetzanschlusspunkt_NrHauptversorgung();

		/**
		 * The meta object literal for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__NR_RESERVE_EINSPEISUNG = eINSTANCE.getNetzanschlusspunkt_NrReserveEinspeisung();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__BESCHREIBUNG = eINSTANCE.getNetzanschlusspunkt_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Langbeschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG = eINSTANCE.getNetzanschlusspunkt_Langbeschreibung();

		/**
		 * The meta object literal for the '<em><b>Postition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__POSTITION = eINSTANCE.getNetzanschlusspunkt_Postition();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VersorgungsknotenImpl <em>Versorgungsknoten</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VersorgungsknotenImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVersorgungsknoten()
		 * @generated
		 */
		EClass VERSORGUNGSKNOTEN = eINSTANCE.getVersorgungsknoten();

		/**
		 * The meta object literal for the '<em><b>Netzanschlusspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT = eINSTANCE.getVersorgungsknoten_Netzanschlusspunkt();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl <em>Energietechnikanlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergietechnikanlage()
		 * @generated
		 */
		EClass ENERGIETECHNIKANLAGE = eINSTANCE.getEnergietechnikanlage();

		/**
		 * The meta object literal for the '<em><b>Et Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIETECHNIKANLAGE__ET_TYPE = eINSTANCE.getEnergietechnikanlage_EtType();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.GeneratorImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Generatorfunktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__GENERATORFUNKTION = eINSTANCE.getGenerator_Generatorfunktion();

		/**
		 * The meta object literal for the '<em><b>Erzeugte Energie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ERZEUGTE_ENERGIE = eINSTANCE.getGenerator_ErzeugteEnergie();

		/**
		 * The meta object literal for the '<em><b>Elektrische Leistung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ELEKTRISCHE_LEISTUNG = eINSTANCE.getGenerator_ElektrischeLeistung();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.SelbststAnlageImpl <em>Selbstst Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.SelbststAnlageImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getSelbststAnlage()
		 * @generated
		 */
		EClass SELBSTST_ANLAGE = eINSTANCE.getSelbststAnlage();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.UmrichterBaseImpl <em>Umrichter Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.UmrichterBaseImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterBase()
		 * @generated
		 */
		EClass UMRICHTER_BASE = eINSTANCE.getUmrichterBase();

		/**
		 * The meta object literal for the '<em><b>Umrichterfunktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_BASE__UMRICHTERFUNKTION = eINSTANCE.getUmrichterBase_Umrichterfunktion();

		/**
		 * The meta object literal for the '<em><b>Umrichterart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_BASE__UMRICHTERART = eINSTANCE.getUmrichterBase_Umrichterart();

		/**
		 * The meta object literal for the '<em><b>Nennleistung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_BASE__NENNLEISTUNG = eINSTANCE.getUmrichterBase_Nennleistung();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl <em>Verteiler Mit Zaehler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerMitZaehler()
		 * @generated
		 */
		EClass VERTEILER_MIT_ZAEHLER = eINSTANCE.getVerteilerMitZaehler();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl <em>Umrichter Mit Energiespeicher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterMitEnergiespeicher()
		 * @generated
		 */
		EClass UMRICHTER_MIT_ENERGIESPEICHER = eINSTANCE.getUmrichterMitEnergiespeicher();

		/**
		 * The meta object literal for the '<em><b>Energiespeicherfunktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION = eINSTANCE
				.getUmrichterMitEnergiespeicher_Energiespeicherfunktion();

		/**
		 * The meta object literal for the '<em><b>Energiespeicherart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART = eINSTANCE
				.getUmrichterMitEnergiespeicher_Energiespeicherart();

		/**
		 * The meta object literal for the '<em><b>Autonomiezeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT = eINSTANCE
				.getUmrichterMitEnergiespeicher_Autonomiezeit();

		/**
		 * The meta object literal for the '<em><b>Kapazitaet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET = eINSTANCE.getUmrichterMitEnergiespeicher_Kapazitaet();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl <em>Verteiler Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VerteilerContainerImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerContainer()
		 * @generated
		 */
		EClass VERTEILER_CONTAINER = eINSTANCE.getVerteilerContainer();

		/**
		 * The meta object literal for the '<em><b>Verteiler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEILER_CONTAINER__VERTEILER = eINSTANCE.getVerteilerContainer_Verteiler();

		/**
		 * The meta object literal for the '<em><b>Netzanschlusspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT = eINSTANCE.getVerteilerContainer_Netzanschlusspunkt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEILER_CONTAINER__NAME = eINSTANCE.getVerteilerContainer_Name();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.BetreiberImpl <em>Betreiber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.BetreiberImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getBetreiber()
		 * @generated
		 */
		EClass BETREIBER = eINSTANCE.getBetreiber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETREIBER__NAME = eINSTANCE.getBetreiber_Name();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VerteilerBaseImpl <em>Verteiler Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VerteilerBaseImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerBase()
		 * @generated
		 */
		EClass VERTEILER_BASE = eINSTANCE.getVerteilerBase();

		/**
		 * The meta object literal for the '<em><b>Netzanschlusspunkt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEILER_BASE__NETZANSCHLUSSPUNKT = eINSTANCE.getVerteilerBase_Netzanschlusspunkt();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VerteilerOhneZaehlerImpl <em>Verteiler Ohne Zaehler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VerteilerOhneZaehlerImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerOhneZaehler()
		 * @generated
		 */
		EClass VERTEILER_OHNE_ZAEHLER = eINSTANCE.getVerteilerOhneZaehler();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.DetailsImpl <em>Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.DetailsImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getDetails()
		 * @generated
		 */
		EClass DETAILS = eINSTANCE.getDetails();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.UmrichterImpl <em>Umrichter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.UmrichterImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichter()
		 * @generated
		 */
		EClass UMRICHTER = eINSTANCE.getUmrichter();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl <em>Anlage Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.AnlageBaseImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageBase()
		 * @generated
		 */
		EClass ANLAGE_BASE = eINSTANCE.getAnlageBase();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE_BASE__DETAILS = eINSTANCE.getAnlageBase_Details();

		/**
		 * The meta object literal for the '<em><b>Betreiber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE_BASE__BETREIBER = eINSTANCE.getAnlageBase_Betreiber();

		/**
		 * The meta object literal for the '<em><b>Versorgt Von</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE_BASE__VERSORGT_VON = eINSTANCE.getAnlageBase_VersorgtVon();

		/**
		 * The meta object literal for the '<em><b>Verbindung Nach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE_BASE__VERBINDUNG_NACH = eINSTANCE.getAnlageBase_VerbindungNach();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl <em>Anlage Ohne Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageOhneAttribute()
		 * @generated
		 */
		EClass ANLAGE_OHNE_ATTRIBUTE = eINSTANCE.getAnlageOhneAttribute();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Objektarttype <em>Objektarttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Objektarttype
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getObjektarttype()
		 * @generated
		 */
		EEnum OBJEKTARTTYPE = eINSTANCE.getObjektarttype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Spannungsarttype <em>Spannungsarttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Spannungsarttype
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getSpannungsarttype()
		 * @generated
		 */
		EEnum SPANNUNGSARTTYPE = eINSTANCE.getSpannungsarttype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Externe_Datenquelle <em>Externe Datenquelle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Externe_Datenquelle
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getExterne_Datenquelle()
		 * @generated
		 */
		EEnum EXTERNE_DATENQUELLE = eINSTANCE.getExterne_Datenquelle();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.ET_Type <em>ET Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.ET_Type
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getET_Type()
		 * @generated
		 */
		EEnum ET_TYPE = eINSTANCE.getET_Type();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.ARGUSrelevant <em>ARGU Srelevant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.ARGUSrelevant
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getARGUSrelevant()
		 * @generated
		 */
		EEnum ARGU_SRELEVANT = eINSTANCE.getARGUSrelevant();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Eadb_Versorgung_Art <em>Eadb Versorgung Art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEadb_Versorgung_Art()
		 * @generated
		 */
		EEnum EADB_VERSORGUNG_ART = eINSTANCE.getEadb_Versorgung_Art();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.NapPosition <em>Nap Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.NapPosition
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getNapPosition()
		 * @generated
		 */
		EEnum NAP_POSITION = eINSTANCE.getNapPosition();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.LinienType <em>Linien Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.LinienType
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getLinienType()
		 * @generated
		 */
		EEnum LINIEN_TYPE = eINSTANCE.getLinienType();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Generatorfunktion <em>Generatorfunktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Generatorfunktion
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGeneratorfunktion()
		 * @generated
		 */
		EEnum GENERATORFUNKTION = eINSTANCE.getGeneratorfunktion();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Umrichterart <em>Umrichterart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Umrichterart
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterart()
		 * @generated
		 */
		EEnum UMRICHTERART = eINSTANCE.getUmrichterart();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Energiespeicherart <em>Energiespeicherart</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Energiespeicherart
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherart()
		 * @generated
		 */
		EEnum ENERGIESPEICHERART = eINSTANCE.getEnergiespeicherart();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Umrichterfunktion <em>Umrichterfunktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Umrichterfunktion
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterfunktion()
		 * @generated
		 */
		EEnum UMRICHTERFUNKTION = eINSTANCE.getUmrichterfunktion();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Energiespeicherfunktion <em>Energiespeicherfunktion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherfunktion()
		 * @generated
		 */
		EEnum ENERGIESPEICHERFUNKTION = eINSTANCE.getEnergiespeicherfunktion();

	}

} //ModelPackage

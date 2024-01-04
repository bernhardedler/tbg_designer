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
	 * The feature id for the '<em><b>Bearbeitet am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__BEARBEITET_AM = 3;

	/**
	 * The feature id for the '<em><b>Bearbeitet von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__BEARBEITET_VON = 4;

	/**
	 * The feature id for the '<em><b>Gezeichnet am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__GEZEICHNET_AM = 5;

	/**
	 * The feature id for the '<em><b>Gezeichnet von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__GEZEICHNET_VON = 6;

	/**
	 * The feature id for the '<em><b>Geprueft am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__GEPRUEFT_AM = 7;

	/**
	 * The feature id for the '<em><b>Geprueft von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__GEPRUEFT_VON = 8;

	/**
	 * The feature id for the '<em><b>Plannummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__PLANNUMMER = 9;

	/**
	 * The feature id for the '<em><b>Freigegeben von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__FREIGEGEBEN_VON = 10;

	/**
	 * The number of structural features of the '<em>Bahnhof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF_FEATURE_COUNT = 11;

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
	 * The feature id for the '<em><b>Eigentuemer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__EIGENTUEMER = 9;

	/**
	 * The number of structural features of the '<em>Objekt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT_FEATURE_COUNT = 10;

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
	int ANLAGE_BASE = 17;

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
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__EADB_ID = ANLAGE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG = ANLAGE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL = ANLAGE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART = ANLAGE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG = ANLAGE_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT = ANLAGE_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__RESERVE1 = ANLAGE_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN__RESERVE2 = ANLAGE_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Anlage Mit Attributen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT = ANLAGE_BASE_FEATURE_COUNT + 10;

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
	 * The feature id for the '<em><b>Kabellaenge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__KABELLAENGE = 9;

	/**
	 * The number of structural features of the '<em>Verbindung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Verbindung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.TrafoImpl <em>Trafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.TrafoImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTrafo()
	 * @generated
	 */
	int TRAFO = 4;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Sekundaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__SEKUNDAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__TRAFO_KVA = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserve3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE3 = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oberspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__OBERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unterspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__UNTERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl <em>Anlage Ohne Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.AnlageOhneAttributeImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlageOhneAttribute()
	 * @generated
	 */
	int ANLAGE_OHNE_ATTRIBUTE = 18;

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
	int NETZANSCHLUSSPUNKT = 5;

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
	 * The feature id for the '<em><b>Langbeschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__POSTITION = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fernablesung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT__FERNABLESUNG = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Netzanschlusspunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETZANSCHLUSSPUNKT_FEATURE_COUNT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 3;

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
	int VERSORGUNGSKNOTEN = 6;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__GROESSE = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl <em>Energietechnikanlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergietechnikanlage()
	 * @generated
	 */
	int ENERGIETECHNIKANLAGE = 7;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Et Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ET_TYPE = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.GeneratorImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 8;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Generatorfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GENERATORFUNKTION = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__FUNKTION_SONSTIG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elektrische Leistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ELEKTRISCHE_LEISTUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erzeugte Energie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ERZEUGTE_ENERGIE = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Erzeugte Spannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__ERZEUGTE_SPANNUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerBaseImpl <em>Verteiler Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerBaseImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerBase()
	 * @generated
	 */
	int VERTEILER_BASE = 13;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__DETAILS = ANLAGE_OHNE_ATTRIBUTE__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__BETREIBER = ANLAGE_OHNE_ATTRIBUTE__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__VERSORGT_VON = ANLAGE_OHNE_ATTRIBUTE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__VERBINDUNG_NACH = ANLAGE_OHNE_ATTRIBUTE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__NETZANSCHLUSSPUNKT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__NAME = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE__GROESSE = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verteiler Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE_FEATURE_COUNT = ANLAGE_OHNE_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Verteiler Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_BASE_OPERATION_COUNT = ANLAGE_OHNE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl <em>Verteiler Mit Zaehler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerMitZaehler()
	 * @generated
	 */
	int VERTEILER_MIT_ZAEHLER = 9;

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
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NETZANSCHLUSSPUNKT = VERTEILER_BASE__NETZANSCHLUSSPUNKT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NAME = VERTEILER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__GROESSE = VERTEILER_BASE__GROESSE;

	/**
	 * The feature id for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG = VERTEILER_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG = VERTEILER_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Verteiler Mit Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER_FEATURE_COUNT = VERTEILER_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Verteiler Mit Zaehler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_MIT_ZAEHLER_OPERATION_COUNT = VERTEILER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl <em>Energiespeicher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.EnergiespeicherImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicher()
	 * @generated
	 */
	int ENERGIESPEICHER = 10;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Energiespeicherfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__ENERGIESPEICHERFUNKTION = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__FUNKTION_SONSTIG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energiespeicherart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__ENERGIESPEICHERART = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kapazitaet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__KAPAZITAET = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Autonomiezeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER__AUTONOMIEZEIT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Energiespeicher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Energiespeicher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIESPEICHER_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl <em>Verteiler Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VerteilerContainerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilerContainer()
	 * @generated
	 */
	int VERTEILER_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Verteiler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__VERTEILER = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Verteiler Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Verteiler Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_CONTAINER_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.BetreiberImpl <em>Betreiber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.BetreiberImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getBetreiber()
	 * @generated
	 */
	int BETREIBER = 12;

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
	int VERTEILER_OHNE_ZAEHLER = 14;

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
	 * The feature id for the '<em><b>Netzanschlusspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__NETZANSCHLUSSPUNKT = VERTEILER_BASE__NETZANSCHLUSSPUNKT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__NAME = VERTEILER_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Groesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEILER_OHNE_ZAEHLER__GROESSE = VERTEILER_BASE__GROESSE;

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
	int DETAILS = 15;

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
	int UMRICHTER = 16;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__DETAILS = ANLAGE_MIT_ATTRIBUTEN__DETAILS;

	/**
	 * The feature id for the '<em><b>Betreiber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__BETREIBER = ANLAGE_MIT_ATTRIBUTEN__BETREIBER;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERSORGT_VON = ANLAGE_MIT_ATTRIBUTEN__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERBINDUNG_NACH = ANLAGE_MIT_ATTRIBUTEN__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__NAME = ANLAGE_MIT_ATTRIBUTEN__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__ANLAGENNUMMER = ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__EADB_ID = ANLAGE_MIT_ATTRIBUTEN__EADB_ID;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__PRIMAERSPANNUNG = ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__IN_OBJEKTTEIL = ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__EADB_VERSORGUNG_ART = ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__VERTEILERBEZEICHNUNG = ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__ABGANG_VT = ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Reserve1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__RESERVE1 = ANLAGE_MIT_ATTRIBUTEN__RESERVE1;

	/**
	 * The feature id for the '<em><b>Reserve2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__RESERVE2 = ANLAGE_MIT_ATTRIBUTEN__RESERVE2;

	/**
	 * The feature id for the '<em><b>Umrichterfunktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__UMRICHTERFUNKTION = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funktion Sonstig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__FUNKTION_SONSTIG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Umrichterart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__UMRICHTERART = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nennleistung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER__NENNLEISTUNG = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Umrichter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_FEATURE_COUNT = ANLAGE_MIT_ATTRIBUTEN_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Umrichter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMRICHTER_OPERATION_COUNT = ANLAGE_MIT_ATTRIBUTEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.EigentuemerImpl <em>Eigentuemer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.EigentuemerImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEigentuemer()
	 * @generated
	 */
	int EIGENTUEMER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIGENTUEMER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Eigentuemer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIGENTUEMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Eigentuemer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIGENTUEMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Objektarttype <em>Objektarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Objektarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getObjektarttype()
	 * @generated
	 */
	int OBJEKTARTTYPE = 20;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Spannungsarttype <em>Spannungsarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Spannungsarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getSpannungsarttype()
	 * @generated
	 */
	int SPANNUNGSARTTYPE = 21;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Externe_Datenquelle <em>Externe Datenquelle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Externe_Datenquelle
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getExterne_Datenquelle()
	 * @generated
	 */
	int EXTERNE_DATENQUELLE = 22;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ET_Type <em>ET Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getET_Type()
	 * @generated
	 */
	int ET_TYPE = 23;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ARGUSrelevant <em>ARGU Srelevant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getARGUSrelevant()
	 * @generated
	 */
	int ARGU_SRELEVANT = 24;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Eadb_Versorgung_Art <em>Eadb Versorgung Art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Eadb_Versorgung_Art
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEadb_Versorgung_Art()
	 * @generated
	 */
	int EADB_VERSORGUNG_ART = 25;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.NapPosition <em>Nap Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.NapPosition
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getNapPosition()
	 * @generated
	 */
	int NAP_POSITION = 26;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.LinienType <em>Linien Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.LinienType
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getLinienType()
	 * @generated
	 */
	int LINIEN_TYPE = 27;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Generatorfunktion <em>Generatorfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Generatorfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getGeneratorfunktion()
	 * @generated
	 */
	int GENERATORFUNKTION = 28;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Umrichterart <em>Umrichterart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Umrichterart
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterart()
	 * @generated
	 */
	int UMRICHTERART = 29;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Energiespeicherart <em>Energiespeicherart</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Energiespeicherart
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherart()
	 * @generated
	 */
	int ENERGIESPEICHERART = 30;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Umrichterfunktion <em>Umrichterfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Umrichterfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getUmrichterfunktion()
	 * @generated
	 */
	int UMRICHTERFUNKTION = 31;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Energiespeicherfunktion <em>Energiespeicherfunktion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Energiespeicherfunktion
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicherfunktion()
	 * @generated
	 */
	int ENERGIESPEICHERFUNKTION = 32;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.Verteilergroesse <em>Verteilergroesse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.Verteilergroesse
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilergroesse()
	 * @generated
	 */
	int VERTEILERGROESSE = 33;

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getPlannummer <em>Plannummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plannummer</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getPlannummer()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Plannummer();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getFreigegeben_von <em>Freigegeben von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freigegeben von</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getFreigegeben_von()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Freigegeben_von();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_von <em>Bearbeitet von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearbeitet von</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getBearbeitet_von()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Bearbeitet_von();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_von <em>Gezeichnet von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gezeichnet von</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getGezeichnet_von()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Gezeichnet_von();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_von <em>Geprueft von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geprueft von</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getGeprueft_von()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Geprueft_von();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getBearbeitet_am <em>Bearbeitet am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearbeitet am</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getBearbeitet_am()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Bearbeitet_am();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getGezeichnet_am <em>Gezeichnet am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gezeichnet am</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getGezeichnet_am()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Gezeichnet_am();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getGeprueft_am <em>Geprueft am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geprueft am</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getGeprueft_am()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Geprueft_am();

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
	 * Returns the meta object for the containment reference '{@link at.tb_gruber.designer.model.Objekt#getEigentuemer <em>Eigentuemer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eigentuemer</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getEigentuemer()
	 * @see #getObjekt()
	 * @generated
	 */
	EReference getObjekt_Eigentuemer();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getKabellaenge <em>Kabellaenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kabellaenge</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getKabellaenge()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Kabellaenge();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getOberspannung <em>Oberspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oberspannung</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getOberspannung()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_Oberspannung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getUnterspannung <em>Unterspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unterspannung</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getUnterspannung()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_Unterspannung();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Netzanschlusspunkt#isFernablesung <em>Fernablesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fernablesung</em>'.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt#isFernablesung()
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 */
	EAttribute getNetzanschlusspunkt_Fernablesung();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Versorgungsknoten#getGroesse <em>Groesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groesse</em>'.
	 * @see at.tb_gruber.designer.model.Versorgungsknoten#getGroesse()
	 * @see #getVersorgungsknoten()
	 * @generated
	 */
	EAttribute getVersorgungsknoten_Groesse();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Generator#getErzeugteSpannung <em>Erzeugte Spannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erzeugte Spannung</em>'.
	 * @see at.tb_gruber.designer.model.Generator#getErzeugteSpannung()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_ErzeugteSpannung();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Generator#getFunktionSonstig <em>Funktion Sonstig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funktion Sonstig</em>'.
	 * @see at.tb_gruber.designer.model.Generator#getFunktionSonstig()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_FunktionSonstig();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Reserve Einspeisung</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerMitZaehler#getNrReserveEinspeisung()
	 * @see #getVerteilerMitZaehler()
	 * @generated
	 */
	EAttribute getVerteilerMitZaehler_NrReserveEinspeisung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.VerteilerMitZaehler#getNrHauptversorgung <em>Nr Hauptversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Hauptversorgung</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerMitZaehler#getNrHauptversorgung()
	 * @see #getVerteilerMitZaehler()
	 * @generated
	 */
	EAttribute getVerteilerMitZaehler_NrHauptversorgung();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Energiespeicher <em>Energiespeicher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energiespeicher</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher
	 * @generated
	 */
	EClass getEnergiespeicher();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energiespeicherfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherfunktion()
	 * @see #getEnergiespeicher()
	 * @generated
	 */
	EAttribute getEnergiespeicher_Energiespeicherfunktion();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherart <em>Energiespeicherart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energiespeicherart</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher#getEnergiespeicherart()
	 * @see #getEnergiespeicher()
	 * @generated
	 */
	EAttribute getEnergiespeicher_Energiespeicherart();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energiespeicher#getAutonomiezeit <em>Autonomiezeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autonomiezeit</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher#getAutonomiezeit()
	 * @see #getEnergiespeicher()
	 * @generated
	 */
	EAttribute getEnergiespeicher_Autonomiezeit();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energiespeicher#getKapazitaet <em>Kapazitaet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kapazitaet</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher#getKapazitaet()
	 * @see #getEnergiespeicher()
	 * @generated
	 */
	EAttribute getEnergiespeicher_Kapazitaet();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Energiespeicher#getFunktionSonstig <em>Funktion Sonstig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funktion Sonstig</em>'.
	 * @see at.tb_gruber.designer.model.Energiespeicher#getFunktionSonstig()
	 * @see #getEnergiespeicher()
	 * @generated
	 */
	EAttribute getEnergiespeicher_FunktionSonstig();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.VerteilerBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerBase#getName()
	 * @see #getVerteilerBase()
	 * @generated
	 */
	EAttribute getVerteilerBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.VerteilerBase#getGroesse <em>Groesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groesse</em>'.
	 * @see at.tb_gruber.designer.model.VerteilerBase#getGroesse()
	 * @see #getVerteilerBase()
	 * @generated
	 */
	EAttribute getVerteilerBase_Groesse();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Umrichter#getUmrichterfunktion <em>Umrichterfunktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umrichterfunktion</em>'.
	 * @see at.tb_gruber.designer.model.Umrichter#getUmrichterfunktion()
	 * @see #getUmrichter()
	 * @generated
	 */
	EAttribute getUmrichter_Umrichterfunktion();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Umrichter#getUmrichterart <em>Umrichterart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Umrichterart</em>'.
	 * @see at.tb_gruber.designer.model.Umrichter#getUmrichterart()
	 * @see #getUmrichter()
	 * @generated
	 */
	EAttribute getUmrichter_Umrichterart();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Umrichter#getNennleistung <em>Nennleistung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nennleistung</em>'.
	 * @see at.tb_gruber.designer.model.Umrichter#getNennleistung()
	 * @see #getUmrichter()
	 * @generated
	 */
	EAttribute getUmrichter_Nennleistung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Umrichter#getFunktionSonstig <em>Funktion Sonstig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funktion Sonstig</em>'.
	 * @see at.tb_gruber.designer.model.Umrichter#getFunktionSonstig()
	 * @see #getUmrichter()
	 * @generated
	 */
	EAttribute getUmrichter_FunktionSonstig();

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
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Eigentuemer <em>Eigentuemer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eigentuemer</em>'.
	 * @see at.tb_gruber.designer.model.Eigentuemer
	 * @generated
	 */
	EClass getEigentuemer();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Eigentuemer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.Eigentuemer#getName()
	 * @see #getEigentuemer()
	 * @generated
	 */
	EAttribute getEigentuemer_Name();

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
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.Verteilergroesse <em>Verteilergroesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verteilergroesse</em>'.
	 * @see at.tb_gruber.designer.model.Verteilergroesse
	 * @generated
	 */
	EEnum getVerteilergroesse();

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
		 * The meta object literal for the '<em><b>Plannummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__PLANNUMMER = eINSTANCE.getBahnhof_Plannummer();

		/**
		 * The meta object literal for the '<em><b>Freigegeben von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__FREIGEGEBEN_VON = eINSTANCE.getBahnhof_Freigegeben_von();

		/**
		 * The meta object literal for the '<em><b>Bearbeitet von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__BEARBEITET_VON = eINSTANCE.getBahnhof_Bearbeitet_von();

		/**
		 * The meta object literal for the '<em><b>Gezeichnet von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__GEZEICHNET_VON = eINSTANCE.getBahnhof_Gezeichnet_von();

		/**
		 * The meta object literal for the '<em><b>Geprueft von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__GEPRUEFT_VON = eINSTANCE.getBahnhof_Geprueft_von();

		/**
		 * The meta object literal for the '<em><b>Bearbeitet am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__BEARBEITET_AM = eINSTANCE.getBahnhof_Bearbeitet_am();

		/**
		 * The meta object literal for the '<em><b>Gezeichnet am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__GEZEICHNET_AM = eINSTANCE.getBahnhof_Gezeichnet_am();

		/**
		 * The meta object literal for the '<em><b>Geprueft am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__GEPRUEFT_AM = eINSTANCE.getBahnhof_Geprueft_am();

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
		 * The meta object literal for the '<em><b>Eigentuemer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJEKT__EIGENTUEMER = eINSTANCE.getObjekt_Eigentuemer();

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
		 * The meta object literal for the '<em><b>Kabellaenge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__KABELLAENGE = eINSTANCE.getVerbindung_Kabellaenge();

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
		 * The meta object literal for the '<em><b>Oberspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__OBERSPANNUNG = eINSTANCE.getTrafo_Oberspannung();

		/**
		 * The meta object literal for the '<em><b>Unterspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__UNTERSPANNUNG = eINSTANCE.getTrafo_Unterspannung();

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
		 * The meta object literal for the '<em><b>Fernablesung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETZANSCHLUSSPUNKT__FERNABLESUNG = eINSTANCE.getNetzanschlusspunkt_Fernablesung();

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
		 * The meta object literal for the '<em><b>Groesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSORGUNGSKNOTEN__GROESSE = eINSTANCE.getVersorgungsknoten_Groesse();

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
		 * The meta object literal for the '<em><b>Erzeugte Spannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ERZEUGTE_SPANNUNG = eINSTANCE.getGenerator_ErzeugteSpannung();

		/**
		 * The meta object literal for the '<em><b>Elektrische Leistung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__ELEKTRISCHE_LEISTUNG = eINSTANCE.getGenerator_ElektrischeLeistung();

		/**
		 * The meta object literal for the '<em><b>Funktion Sonstig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__FUNKTION_SONSTIG = eINSTANCE.getGenerator_FunktionSonstig();

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
		 * The meta object literal for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG = eINSTANCE
				.getVerteilerMitZaehler_NrReserveEinspeisung();

		/**
		 * The meta object literal for the '<em><b>Nr Hauptversorgung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG = eINSTANCE.getVerteilerMitZaehler_NrHauptversorgung();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl <em>Energiespeicher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.EnergiespeicherImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEnergiespeicher()
		 * @generated
		 */
		EClass ENERGIESPEICHER = eINSTANCE.getEnergiespeicher();

		/**
		 * The meta object literal for the '<em><b>Energiespeicherfunktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIESPEICHER__ENERGIESPEICHERFUNKTION = eINSTANCE.getEnergiespeicher_Energiespeicherfunktion();

		/**
		 * The meta object literal for the '<em><b>Energiespeicherart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIESPEICHER__ENERGIESPEICHERART = eINSTANCE.getEnergiespeicher_Energiespeicherart();

		/**
		 * The meta object literal for the '<em><b>Autonomiezeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIESPEICHER__AUTONOMIEZEIT = eINSTANCE.getEnergiespeicher_Autonomiezeit();

		/**
		 * The meta object literal for the '<em><b>Kapazitaet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIESPEICHER__KAPAZITAET = eINSTANCE.getEnergiespeicher_Kapazitaet();

		/**
		 * The meta object literal for the '<em><b>Funktion Sonstig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGIESPEICHER__FUNKTION_SONSTIG = eINSTANCE.getEnergiespeicher_FunktionSonstig();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEILER_BASE__NAME = eINSTANCE.getVerteilerBase_Name();

		/**
		 * The meta object literal for the '<em><b>Groesse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEILER_BASE__GROESSE = eINSTANCE.getVerteilerBase_Groesse();

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
		 * The meta object literal for the '<em><b>Umrichterfunktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER__UMRICHTERFUNKTION = eINSTANCE.getUmrichter_Umrichterfunktion();

		/**
		 * The meta object literal for the '<em><b>Umrichterart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER__UMRICHTERART = eINSTANCE.getUmrichter_Umrichterart();

		/**
		 * The meta object literal for the '<em><b>Nennleistung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER__NENNLEISTUNG = eINSTANCE.getUmrichter_Nennleistung();

		/**
		 * The meta object literal for the '<em><b>Funktion Sonstig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UMRICHTER__FUNKTION_SONSTIG = eINSTANCE.getUmrichter_FunktionSonstig();

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
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.EigentuemerImpl <em>Eigentuemer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.EigentuemerImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getEigentuemer()
		 * @generated
		 */
		EClass EIGENTUEMER = eINSTANCE.getEigentuemer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EIGENTUEMER__NAME = eINSTANCE.getEigentuemer_Name();

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

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.Verteilergroesse <em>Verteilergroesse</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.Verteilergroesse
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVerteilergroesse()
		 * @generated
		 */
		EEnum VERTEILERGROESSE = eINSTANCE.getVerteilergroesse();

	}

} //ModelPackage

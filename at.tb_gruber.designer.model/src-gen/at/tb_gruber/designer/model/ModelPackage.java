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
	 * The feature id for the '<em><b>Reserve2 Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF__RESERVE2_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Bahnhof</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAHNHOF_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Ort Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__ORT_ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Objekt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__OBJEKT_ID = 3;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__ANLAGE = 4;

	/**
	 * The feature id for the '<em><b>Gebaeude Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__GEBAEUDE_ART = 5;

	/**
	 * The feature id for the '<em><b>Db776ua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__DB776UA = 6;

	/**
	 * The feature id for the '<em><b>Gpsstandort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__GPSSTANDORT = 7;

	/**
	 * The feature id for the '<em><b>Externe Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJEKT__EXTERNE_QUELLE = 8;

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
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.AnlageImpl <em>Anlage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.AnlageImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlage()
	 * @generated
	 */
	int ANLAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__ANLAGENNUMMER = 1;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__OBJEKTTEIL = 2;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__EADB_ID = 3;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__VERBINDUNG_NACH = 4;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__VERSORGT_VON = 5;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__PRIMAERSPANNUNG = 6;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__IN_OBJEKTTEIL = 7;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__RESERVE4 = 8;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__ANLAGEN_ID_IMMO_ASSI = 9;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__EADB_VERSORGUNG_ART = 10;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__VERTEILERBEZEICHNUNG = 11;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE__ABGANG_VT = 12;

	/**
	 * The number of structural features of the '<em>Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Anlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Reserve9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__RESERVE9 = 4;

	/**
	 * The feature id for the '<em><b>Reserve10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__RESERVE10 = 5;

	/**
	 * The feature id for the '<em><b>Quell Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__QUELL_SICHERUNG = 6;

	/**
	 * The feature id for the '<em><b>Ziel Sicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__ZIEL_SICHERUNG = 7;

	/**
	 * The feature id for the '<em><b>Kabeltype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__KABELTYPE = 8;

	/**
	 * The feature id for the '<em><b>Argusrelevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBINDUNG__ARGUSRELEVANT = 9;

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
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.TrafoImpl <em>Trafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.TrafoImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getTrafo()
	 * @generated
	 */
	int TRAFO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__NAME = ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ANLAGENNUMMER = ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__OBJEKTTEIL = ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_ID = ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERBINDUNG_NACH = ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERSORGT_VON = ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__PRIMAERSPANNUNG = ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__IN_OBJEKTTEIL = ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE4 = ANLAGE__RESERVE4;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ANLAGEN_ID_IMMO_ASSI = ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__EADB_VERSORGUNG_ART = ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__VERTEILERBEZEICHNUNG = ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__ABGANG_VT = ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Sekundaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__SEKUNDAERSPANNUNG = ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trafo Kva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__TRAFO_KVA = ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserve5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO__RESERVE5 = ANLAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_FEATURE_COUNT = ANLAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFO_OPERATION_COUNT = ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.ZaehlpunktImpl <em>Zaehlpunkt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.ZaehlpunktImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getZaehlpunkt()
	 * @generated
	 */
	int ZAEHLPUNKT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__NAME = ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__ANLAGENNUMMER = ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__OBJEKTTEIL = ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__EADB_ID = ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__VERBINDUNG_NACH = ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__VERSORGT_VON = ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__PRIMAERSPANNUNG = ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__IN_OBJEKTTEIL = ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__RESERVE4 = ANLAGE__RESERVE4;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__ANLAGEN_ID_IMMO_ASSI = ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__EADB_VERSORGUNG_ART = ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__VERTEILERBEZEICHNUNG = ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__ABGANG_VT = ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Nr Hauptversorgung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__NR_HAUPTVERSORGUNG = ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT__NR_RESERVE_EINSPEISUNG = ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zaehlpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT_FEATURE_COUNT = ANLAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Zaehlpunkt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZAEHLPUNKT_OPERATION_COUNT = ANLAGE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__NAME = ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ANLAGENNUMMER = ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__OBJEKTTEIL = ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_ID = ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERBINDUNG_NACH = ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERSORGT_VON = ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__PRIMAERSPANNUNG = ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__IN_OBJEKTTEIL = ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__RESERVE4 = ANLAGE__RESERVE4;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ANLAGEN_ID_IMMO_ASSI = ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__EADB_VERSORGUNG_ART = ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__VERTEILERBEZEICHNUNG = ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN__ABGANG_VT = ANLAGE__ABGANG_VT;

	/**
	 * The number of structural features of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_FEATURE_COUNT = ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Versorgungsknoten</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_OPERATION_COUNT = ANLAGE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__NAME = ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ANLAGENNUMMER = ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__OBJEKTTEIL = ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_ID = ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERBINDUNG_NACH = ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERSORGT_VON = ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__PRIMAERSPANNUNG = ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__IN_OBJEKTTEIL = ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__RESERVE4 = ANLAGE__RESERVE4;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ANLAGEN_ID_IMMO_ASSI = ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__EADB_VERSORGUNG_ART = ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__VERTEILERBEZEICHNUNG = ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ABGANG_VT = ANLAGE__ABGANG_VT;

	/**
	 * The feature id for the '<em><b>Et Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE__ET_TYPE = ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_FEATURE_COUNT = ANLAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energietechnikanlage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGIETECHNIKANLAGE_OPERATION_COUNT = ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.impl.VersorgungsknotenMitETImpl <em>Versorgungsknoten Mit ET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.impl.VersorgungsknotenMitETImpl
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVersorgungsknotenMitET()
	 * @generated
	 */
	int VERSORGUNGSKNOTEN_MIT_ET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__NAME = ANLAGE__NAME;

	/**
	 * The feature id for the '<em><b>Anlagennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__ANLAGENNUMMER = ANLAGE__ANLAGENNUMMER;

	/**
	 * The feature id for the '<em><b>Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__OBJEKTTEIL = ANLAGE__OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Eadb Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__EADB_ID = ANLAGE__EADB_ID;

	/**
	 * The feature id for the '<em><b>Verbindung Nach</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__VERBINDUNG_NACH = ANLAGE__VERBINDUNG_NACH;

	/**
	 * The feature id for the '<em><b>Versorgt Von</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__VERSORGT_VON = ANLAGE__VERSORGT_VON;

	/**
	 * The feature id for the '<em><b>Primaerspannung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__PRIMAERSPANNUNG = ANLAGE__PRIMAERSPANNUNG;

	/**
	 * The feature id for the '<em><b>In Objektteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__IN_OBJEKTTEIL = ANLAGE__IN_OBJEKTTEIL;

	/**
	 * The feature id for the '<em><b>Reserve4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__RESERVE4 = ANLAGE__RESERVE4;

	/**
	 * The feature id for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__ANLAGEN_ID_IMMO_ASSI = ANLAGE__ANLAGEN_ID_IMMO_ASSI;

	/**
	 * The feature id for the '<em><b>Eadb Versorgung Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__EADB_VERSORGUNG_ART = ANLAGE__EADB_VERSORGUNG_ART;

	/**
	 * The feature id for the '<em><b>Verteilerbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__VERTEILERBEZEICHNUNG = ANLAGE__VERTEILERBEZEICHNUNG;

	/**
	 * The feature id for the '<em><b>Abgang VT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET__ABGANG_VT = ANLAGE__ABGANG_VT;

	/**
	 * The number of structural features of the '<em>Versorgungsknoten Mit ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET_FEATURE_COUNT = ANLAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Versorgungsknoten Mit ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSORGUNGSKNOTEN_MIT_ET_OPERATION_COUNT = ANLAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.objektarttype <em>objektarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.objektarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getobjektarttype()
	 * @generated
	 */
	int OBJEKTARTTYPE = 11;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.anlagearttype <em>anlagearttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.anlagearttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getanlagearttype()
	 * @generated
	 */
	int ANLAGEARTTYPE = 12;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.spannungsarttype <em>spannungsarttype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getspannungsarttype()
	 * @generated
	 */
	int SPANNUNGSARTTYPE = 13;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.externe_datenquelle <em>externe datenquelle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.externe_datenquelle
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getexterne_datenquelle()
	 * @generated
	 */
	int EXTERNE_DATENQUELLE = 14;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ET_Type <em>ET Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ET_Type
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getET_Type()
	 * @generated
	 */
	int ET_TYPE = 15;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.ARGUSrelevant <em>ARGU Srelevant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.ARGUSrelevant
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getARGUSrelevant()
	 * @generated
	 */
	int ARGU_SRELEVANT = 16;

	/**
	 * The meta object id for the '{@link at.tb_gruber.designer.model.eadb_versorgung_art <em>eadb versorgung art</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.tb_gruber.designer.model.eadb_versorgung_art
	 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#geteadb_versorgung_art()
	 * @generated
	 */
	int EADB_VERSORGUNG_ART = 17;

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Bahnhof#getReserve2Value <em>Reserve2 Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve2 Value</em>'.
	 * @see at.tb_gruber.designer.model.Bahnhof#getReserve2Value()
	 * @see #getBahnhof()
	 * @generated
	 */
	EAttribute getBahnhof_Reserve2Value();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getOrt_Adresse <em>Ort Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort Adresse</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getOrt_Adresse()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_Ort_Adresse();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Objekt#getGebaeudeArt <em>Gebaeude Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gebaeude Art</em>'.
	 * @see at.tb_gruber.designer.model.Objekt#getGebaeudeArt()
	 * @see #getObjekt()
	 * @generated
	 */
	EAttribute getObjekt_GebaeudeArt();

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
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Anlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anlage</em>'.
	 * @see at.tb_gruber.designer.model.Anlage
	 * @generated
	 */
	EClass getAnlage();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getName()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getAnlagennummer <em>Anlagennummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anlagennummer</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getAnlagennummer()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Anlagennummer();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getObjektteil <em>Objektteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objektteil</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getObjektteil()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Objektteil();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getEadbId <em>Eadb Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eadb Id</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getEadbId()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_EadbId();

	/**
	 * Returns the meta object for the containment reference list '{@link at.tb_gruber.designer.model.Anlage#getVerbindungNach <em>Verbindung Nach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verbindung Nach</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getVerbindungNach()
	 * @see #getAnlage()
	 * @generated
	 */
	EReference getAnlage_VerbindungNach();

	/**
	 * Returns the meta object for the reference list '{@link at.tb_gruber.designer.model.Anlage#getVersorgtVon <em>Versorgt Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versorgt Von</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getVersorgtVon()
	 * @see #getAnlage()
	 * @generated
	 */
	EReference getAnlage_VersorgtVon();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getPrimaerspannung <em>Primaerspannung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primaerspannung</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getPrimaerspannung()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Primaerspannung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getInObjektteil <em>In Objektteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Objektteil</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getInObjektteil()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_InObjektteil();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getReserve4 <em>Reserve4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve4</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getReserve4()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Reserve4();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anlagen Id Immo Assi</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getAnlagenIdImmoAssi()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_AnlagenIdImmoAssi();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eadb Versorgung Art</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getEadbVersorgungArt()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_EadbVersorgungArt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verteilerbezeichnung</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getVerteilerbezeichnung()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_Verteilerbezeichnung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Anlage#getAbgangVT <em>Abgang VT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abgang VT</em>'.
	 * @see at.tb_gruber.designer.model.Anlage#getAbgangVT()
	 * @see #getAnlage()
	 * @generated
	 */
	EAttribute getAnlage_AbgangVT();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getReserve9 <em>Reserve9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve9</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getReserve9()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Reserve9();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Verbindung#getReserve10 <em>Reserve10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve10</em>'.
	 * @see at.tb_gruber.designer.model.Verbindung#getReserve10()
	 * @see #getVerbindung()
	 * @generated
	 */
	EAttribute getVerbindung_Reserve10();

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
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Trafo#getReserve5 <em>Reserve5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve5</em>'.
	 * @see at.tb_gruber.designer.model.Trafo#getReserve5()
	 * @see #getTrafo()
	 * @generated
	 */
	EAttribute getTrafo_Reserve5();

	/**
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.Zaehlpunkt <em>Zaehlpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zaehlpunkt</em>'.
	 * @see at.tb_gruber.designer.model.Zaehlpunkt
	 * @generated
	 */
	EClass getZaehlpunkt();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrHauptversorgung <em>Nr Hauptversorgung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Hauptversorgung</em>'.
	 * @see at.tb_gruber.designer.model.Zaehlpunkt#getNrHauptversorgung()
	 * @see #getZaehlpunkt()
	 * @generated
	 */
	EAttribute getZaehlpunkt_NrHauptversorgung();

	/**
	 * Returns the meta object for the attribute '{@link at.tb_gruber.designer.model.Zaehlpunkt#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr Reserve Einspeisung</em>'.
	 * @see at.tb_gruber.designer.model.Zaehlpunkt#getNrReserveEinspeisung()
	 * @see #getZaehlpunkt()
	 * @generated
	 */
	EAttribute getZaehlpunkt_NrReserveEinspeisung();

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
	 * Returns the meta object for class '{@link at.tb_gruber.designer.model.VersorgungsknotenMitET <em>Versorgungsknoten Mit ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versorgungsknoten Mit ET</em>'.
	 * @see at.tb_gruber.designer.model.VersorgungsknotenMitET
	 * @generated
	 */
	EClass getVersorgungsknotenMitET();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.objektarttype <em>objektarttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>objektarttype</em>'.
	 * @see at.tb_gruber.designer.model.objektarttype
	 * @generated
	 */
	EEnum getobjektarttype();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.anlagearttype <em>anlagearttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>anlagearttype</em>'.
	 * @see at.tb_gruber.designer.model.anlagearttype
	 * @generated
	 */
	EEnum getanlagearttype();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.spannungsarttype <em>spannungsarttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>spannungsarttype</em>'.
	 * @see at.tb_gruber.designer.model.spannungsarttype
	 * @generated
	 */
	EEnum getspannungsarttype();

	/**
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.externe_datenquelle <em>externe datenquelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>externe datenquelle</em>'.
	 * @see at.tb_gruber.designer.model.externe_datenquelle
	 * @generated
	 */
	EEnum getexterne_datenquelle();

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
	 * Returns the meta object for enum '{@link at.tb_gruber.designer.model.eadb_versorgung_art <em>eadb versorgung art</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>eadb versorgung art</em>'.
	 * @see at.tb_gruber.designer.model.eadb_versorgung_art
	 * @generated
	 */
	EEnum geteadb_versorgung_art();

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
		 * The meta object literal for the '<em><b>Reserve2 Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAHNHOF__RESERVE2_VALUE = eINSTANCE.getBahnhof_Reserve2Value();

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
		 * The meta object literal for the '<em><b>Ort Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__ORT_ADRESSE = eINSTANCE.getObjekt_Ort_Adresse();

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
		 * The meta object literal for the '<em><b>Gebaeude Art</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJEKT__GEBAEUDE_ART = eINSTANCE.getObjekt_GebaeudeArt();

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
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.AnlageImpl <em>Anlage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.AnlageImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getAnlage()
		 * @generated
		 */
		EClass ANLAGE = eINSTANCE.getAnlage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__NAME = eINSTANCE.getAnlage_Name();

		/**
		 * The meta object literal for the '<em><b>Anlagennummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__ANLAGENNUMMER = eINSTANCE.getAnlage_Anlagennummer();

		/**
		 * The meta object literal for the '<em><b>Objektteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__OBJEKTTEIL = eINSTANCE.getAnlage_Objektteil();

		/**
		 * The meta object literal for the '<em><b>Eadb Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__EADB_ID = eINSTANCE.getAnlage_EadbId();

		/**
		 * The meta object literal for the '<em><b>Verbindung Nach</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE__VERBINDUNG_NACH = eINSTANCE.getAnlage_VerbindungNach();

		/**
		 * The meta object literal for the '<em><b>Versorgt Von</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANLAGE__VERSORGT_VON = eINSTANCE.getAnlage_VersorgtVon();

		/**
		 * The meta object literal for the '<em><b>Primaerspannung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__PRIMAERSPANNUNG = eINSTANCE.getAnlage_Primaerspannung();

		/**
		 * The meta object literal for the '<em><b>In Objektteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__IN_OBJEKTTEIL = eINSTANCE.getAnlage_InObjektteil();

		/**
		 * The meta object literal for the '<em><b>Reserve4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__RESERVE4 = eINSTANCE.getAnlage_Reserve4();

		/**
		 * The meta object literal for the '<em><b>Anlagen Id Immo Assi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__ANLAGEN_ID_IMMO_ASSI = eINSTANCE.getAnlage_AnlagenIdImmoAssi();

		/**
		 * The meta object literal for the '<em><b>Eadb Versorgung Art</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__EADB_VERSORGUNG_ART = eINSTANCE.getAnlage_EadbVersorgungArt();

		/**
		 * The meta object literal for the '<em><b>Verteilerbezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__VERTEILERBEZEICHNUNG = eINSTANCE.getAnlage_Verteilerbezeichnung();

		/**
		 * The meta object literal for the '<em><b>Abgang VT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE__ABGANG_VT = eINSTANCE.getAnlage_AbgangVT();

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
		 * The meta object literal for the '<em><b>Reserve9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__RESERVE9 = eINSTANCE.getVerbindung_Reserve9();

		/**
		 * The meta object literal for the '<em><b>Reserve10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBINDUNG__RESERVE10 = eINSTANCE.getVerbindung_Reserve10();

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
		 * The meta object literal for the '<em><b>Reserve5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFO__RESERVE5 = eINSTANCE.getTrafo_Reserve5();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.ZaehlpunktImpl <em>Zaehlpunkt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.ZaehlpunktImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getZaehlpunkt()
		 * @generated
		 */
		EClass ZAEHLPUNKT = eINSTANCE.getZaehlpunkt();

		/**
		 * The meta object literal for the '<em><b>Nr Hauptversorgung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZAEHLPUNKT__NR_HAUPTVERSORGUNG = eINSTANCE.getZaehlpunkt_NrHauptversorgung();

		/**
		 * The meta object literal for the '<em><b>Nr Reserve Einspeisung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZAEHLPUNKT__NR_RESERVE_EINSPEISUNG = eINSTANCE.getZaehlpunkt_NrReserveEinspeisung();

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
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.impl.VersorgungsknotenMitETImpl <em>Versorgungsknoten Mit ET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.impl.VersorgungsknotenMitETImpl
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getVersorgungsknotenMitET()
		 * @generated
		 */
		EClass VERSORGUNGSKNOTEN_MIT_ET = eINSTANCE.getVersorgungsknotenMitET();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.objektarttype <em>objektarttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.objektarttype
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getobjektarttype()
		 * @generated
		 */
		EEnum OBJEKTARTTYPE = eINSTANCE.getobjektarttype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.anlagearttype <em>anlagearttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.anlagearttype
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getanlagearttype()
		 * @generated
		 */
		EEnum ANLAGEARTTYPE = eINSTANCE.getanlagearttype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.spannungsarttype <em>spannungsarttype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.spannungsarttype
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getspannungsarttype()
		 * @generated
		 */
		EEnum SPANNUNGSARTTYPE = eINSTANCE.getspannungsarttype();

		/**
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.externe_datenquelle <em>externe datenquelle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.externe_datenquelle
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#getexterne_datenquelle()
		 * @generated
		 */
		EEnum EXTERNE_DATENQUELLE = eINSTANCE.getexterne_datenquelle();

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
		 * The meta object literal for the '{@link at.tb_gruber.designer.model.eadb_versorgung_art <em>eadb versorgung art</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.tb_gruber.designer.model.eadb_versorgung_art
		 * @see at.tb_gruber.designer.model.impl.ModelPackageImpl#geteadb_versorgung_art()
		 * @generated
		 */
		EEnum EADB_VERSORGUNG_ART = eINSTANCE.geteadb_versorgung_art();

	}

} //ModelPackage

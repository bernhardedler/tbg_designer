/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ARGUSrelevant;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.AnlageOhneAttribute;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Details;
import at.tb_gruber.designer.model.ET_Type;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.ModelFactory;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Plankopf;
import at.tb_gruber.designer.model.SelbststAnlage;
import at.tb_gruber.designer.model.Textbaustein;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.UmrichterBase;
import at.tb_gruber.designer.model.UmrichterMitEnergiespeicher;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerMitZaehler;
import at.tb_gruber.designer.model.VerteilerOhneZaehler;
import at.tb_gruber.designer.model.eadb_versorgung_art;
import at.tb_gruber.designer.model.externe_datenquelle;
import at.tb_gruber.designer.model.objektarttype;
import at.tb_gruber.designer.model.spannungsarttype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnhofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objektEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlageMitAttributenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbindungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plankopfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textbausteinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netzanschlusspunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versorgungsknotenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energietechnikanlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selbststAnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umrichterBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umrichterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlageBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlageOhneAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerMitZaehlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umrichterMitEnergiespeicherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betreiberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerOhneZaehlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objektarttypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spannungsarttypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum externe_datenquelleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eT_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arguSrelevantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eadb_versorgung_artEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum napPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linienTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.tb_gruber.designer.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
				? (ModelPackageImpl) registeredModelPackage
				: new ModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnhof() {
		return bahnhofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Name() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Projektname() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnhof_Objekt() {
		return (EReference) bahnhofEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnhof_Plankopf() {
		return (EReference) bahnhofEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Reserve2Value() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjekt() {
		return objektEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Name() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Objektart() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Ort_Adresse() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_ObjektId() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjekt_Anlage() {
		return (EReference) objektEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_GebaeudeArt() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Db776ua() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Gpsstandort() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_ExterneQuelle() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlageMitAttributen() {
		return anlageMitAttributenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Name() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Anlagennummer() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Objektteil() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_EadbId() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Primaerspannung() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_InObjektteil() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Reserve4() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_AnlagenIdImmoAssi() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_EadbVersorgungArt() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Verteilerbezeichnung() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_AbgangVT() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerbindung() {
		return verbindungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Nr() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Primaerspannung() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbindung_Ziel() {
		return (EReference) verbindungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerbindung_Ursprung() {
		return (EReference) verbindungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Reserve9() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Reserve10() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_QuellSicherung() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_ZielSicherung() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Kabeltype() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Argusrelevant() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Linientype() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlankopf() {
		return plankopfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlankopf_Textbaustein() {
		return (EReference) plankopfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextbaustein() {
		return textbausteinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextbaustein_Label() {
		return (EAttribute) textbausteinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrafo() {
		return trafoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafo_Sekundaerspannung() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafo_TrafoKva() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafo_Reserve5() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetzanschlusspunkt() {
		return netzanschlusspunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_NrHauptversorgung() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_NrReserveEinspeisung() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_Beschreibung() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_Postition() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersorgungsknoten() {
		return versorgungsknotenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersorgungsknoten_Netzanschlusspunkt() {
		return (EReference) versorgungsknotenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergietechnikanlage() {
		return energietechnikanlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergietechnikanlage_EtType() {
		return (EAttribute) energietechnikanlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelbststAnlage() {
		return selbststAnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmrichterBase() {
		return umrichterBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmrichter() {
		return umrichterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlageBase() {
		return anlageBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlageBase_Details() {
		return (EReference) anlageBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlageBase_Betreiber() {
		return (EReference) anlageBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlageBase_VersorgtVon() {
		return (EReference) anlageBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlageBase_VerbindungNach() {
		return (EReference) anlageBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlageOhneAttribute() {
		return anlageOhneAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteilerMitZaehler() {
		return verteilerMitZaehlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerMitZaehler_ZpNr() {
		return (EAttribute) verteilerMitZaehlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmrichterMitEnergiespeicher() {
		return umrichterMitEnergiespeicherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteilerContainer() {
		return verteilerContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteilerContainer_Netzanschlusspunkt() {
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteilerContainer_Verteiler() {
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetreiber() {
		return betreiberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetreiber_Name() {
		return (EAttribute) betreiberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteilerBase() {
		return verteilerBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteilerBase_Netzanschlusspunkt() {
		return (EReference) verteilerBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteilerOhneZaehler() {
		return verteilerOhneZaehlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetails() {
		return detailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetails_Anzeigetext() {
		return (EAttribute) detailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getobjektarttype() {
		return objektarttypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getspannungsarttype() {
		return spannungsarttypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getexterne_datenquelle() {
		return externe_datenquelleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getET_Type() {
		return eT_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getARGUSrelevant() {
		return arguSrelevantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum geteadb_versorgung_art() {
		return eadb_versorgung_artEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNapPosition() {
		return napPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinienType() {
		return linienTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bahnhofEClass = createEClass(BAHNHOF);
		createEAttribute(bahnhofEClass, BAHNHOF__NAME);
		createEAttribute(bahnhofEClass, BAHNHOF__PROJEKTNAME);
		createEReference(bahnhofEClass, BAHNHOF__OBJEKT);
		createEReference(bahnhofEClass, BAHNHOF__PLANKOPF);
		createEAttribute(bahnhofEClass, BAHNHOF__RESERVE2_VALUE);

		objektEClass = createEClass(OBJEKT);
		createEAttribute(objektEClass, OBJEKT__NAME);
		createEAttribute(objektEClass, OBJEKT__OBJEKTART);
		createEAttribute(objektEClass, OBJEKT__ORT_ADRESSE);
		createEAttribute(objektEClass, OBJEKT__OBJEKT_ID);
		createEReference(objektEClass, OBJEKT__ANLAGE);
		createEAttribute(objektEClass, OBJEKT__GEBAEUDE_ART);
		createEAttribute(objektEClass, OBJEKT__DB776UA);
		createEAttribute(objektEClass, OBJEKT__GPSSTANDORT);
		createEAttribute(objektEClass, OBJEKT__EXTERNE_QUELLE);

		anlageMitAttributenEClass = createEClass(ANLAGE_MIT_ATTRIBUTEN);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__NAME);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__OBJEKTTEIL);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__EADB_ID);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__RESERVE4);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__ANLAGEN_ID_IMMO_ASSI);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT);

		verbindungEClass = createEClass(VERBINDUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__NR);
		createEAttribute(verbindungEClass, VERBINDUNG__PRIMAERSPANNUNG);
		createEReference(verbindungEClass, VERBINDUNG__ZIEL);
		createEReference(verbindungEClass, VERBINDUNG__URSPRUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__RESERVE9);
		createEAttribute(verbindungEClass, VERBINDUNG__RESERVE10);
		createEAttribute(verbindungEClass, VERBINDUNG__QUELL_SICHERUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__ZIEL_SICHERUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__KABELTYPE);
		createEAttribute(verbindungEClass, VERBINDUNG__ARGUSRELEVANT);
		createEAttribute(verbindungEClass, VERBINDUNG__LINIENTYPE);

		plankopfEClass = createEClass(PLANKOPF);
		createEReference(plankopfEClass, PLANKOPF__TEXTBAUSTEIN);

		textbausteinEClass = createEClass(TEXTBAUSTEIN);
		createEAttribute(textbausteinEClass, TEXTBAUSTEIN__LABEL);

		trafoEClass = createEClass(TRAFO);
		createEAttribute(trafoEClass, TRAFO__SEKUNDAERSPANNUNG);
		createEAttribute(trafoEClass, TRAFO__TRAFO_KVA);
		createEAttribute(trafoEClass, TRAFO__RESERVE5);

		netzanschlusspunktEClass = createEClass(NETZANSCHLUSSPUNKT);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__NR_HAUPTVERSORGUNG);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__NR_RESERVE_EINSPEISUNG);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__BESCHREIBUNG);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__POSTITION);

		versorgungsknotenEClass = createEClass(VERSORGUNGSKNOTEN);
		createEReference(versorgungsknotenEClass, VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT);

		energietechnikanlageEClass = createEClass(ENERGIETECHNIKANLAGE);
		createEAttribute(energietechnikanlageEClass, ENERGIETECHNIKANLAGE__ET_TYPE);

		generatorEClass = createEClass(GENERATOR);

		selbststAnlageEClass = createEClass(SELBSTST_ANLAGE);

		umrichterBaseEClass = createEClass(UMRICHTER_BASE);

		verteilerMitZaehlerEClass = createEClass(VERTEILER_MIT_ZAEHLER);
		createEAttribute(verteilerMitZaehlerEClass, VERTEILER_MIT_ZAEHLER__ZP_NR);

		umrichterMitEnergiespeicherEClass = createEClass(UMRICHTER_MIT_ENERGIESPEICHER);

		verteilerContainerEClass = createEClass(VERTEILER_CONTAINER);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__VERTEILER);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT);

		betreiberEClass = createEClass(BETREIBER);
		createEAttribute(betreiberEClass, BETREIBER__NAME);

		verteilerBaseEClass = createEClass(VERTEILER_BASE);
		createEReference(verteilerBaseEClass, VERTEILER_BASE__NETZANSCHLUSSPUNKT);

		verteilerOhneZaehlerEClass = createEClass(VERTEILER_OHNE_ZAEHLER);

		detailsEClass = createEClass(DETAILS);
		createEAttribute(detailsEClass, DETAILS__ANZEIGETEXT);

		umrichterEClass = createEClass(UMRICHTER);

		anlageBaseEClass = createEClass(ANLAGE_BASE);
		createEReference(anlageBaseEClass, ANLAGE_BASE__DETAILS);
		createEReference(anlageBaseEClass, ANLAGE_BASE__BETREIBER);
		createEReference(anlageBaseEClass, ANLAGE_BASE__VERSORGT_VON);
		createEReference(anlageBaseEClass, ANLAGE_BASE__VERBINDUNG_NACH);

		anlageOhneAttributeEClass = createEClass(ANLAGE_OHNE_ATTRIBUTE);

		// Create enums
		objektarttypeEEnum = createEEnum(OBJEKTARTTYPE);
		spannungsarttypeEEnum = createEEnum(SPANNUNGSARTTYPE);
		externe_datenquelleEEnum = createEEnum(EXTERNE_DATENQUELLE);
		eT_TypeEEnum = createEEnum(ET_TYPE);
		arguSrelevantEEnum = createEEnum(ARGU_SRELEVANT);
		eadb_versorgung_artEEnum = createEEnum(EADB_VERSORGUNG_ART);
		napPositionEEnum = createEEnum(NAP_POSITION);
		linienTypeEEnum = createEEnum(LINIEN_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anlageMitAttributenEClass.getESuperTypes().add(this.getAnlageBase());
		trafoEClass.getESuperTypes().add(this.getSelbststAnlage());
		netzanschlusspunktEClass.getESuperTypes().add(this.getAnlageOhneAttribute());
		versorgungsknotenEClass.getESuperTypes().add(this.getSelbststAnlage());
		energietechnikanlageEClass.getESuperTypes().add(this.getSelbststAnlage());
		generatorEClass.getESuperTypes().add(this.getSelbststAnlage());
		selbststAnlageEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		umrichterBaseEClass.getESuperTypes().add(this.getSelbststAnlage());
		verteilerMitZaehlerEClass.getESuperTypes().add(this.getVerteilerBase());
		umrichterMitEnergiespeicherEClass.getESuperTypes().add(this.getUmrichterBase());
		verteilerContainerEClass.getESuperTypes().add(this.getAnlageOhneAttribute());
		verteilerBaseEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		verteilerOhneZaehlerEClass.getESuperTypes().add(this.getVerteilerBase());
		umrichterEClass.getESuperTypes().add(this.getUmrichterBase());
		anlageOhneAttributeEClass.getESuperTypes().add(this.getAnlageBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(bahnhofEClass, Bahnhof.class, "Bahnhof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBahnhof_Name(), ecorePackage.getEString(), "name", null, 1, 1, Bahnhof.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Projektname(), ecorePackage.getEString(), "projektname", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnhof_Objekt(), this.getObjekt(), null, "objekt", null, 0, -1, Bahnhof.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBahnhof_Plankopf(), this.getPlankopf(), null, "plankopf", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Reserve2Value(), ecorePackage.getEString(), "reserve2Value", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(objektEClass, Objekt.class, "Objekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjekt_Name(), ecorePackage.getEString(), "name", null, 1, 1, Objekt.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Objektart(), this.getobjektarttype(), "objektart", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Ort_Adresse(), ecorePackage.getEString(), "Ort_Adresse", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_ObjektId(), ecorePackage.getEString(), "objektId", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjekt_Anlage(), this.getAnlageBase(), null, "anlage", null, 0, -1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_GebaeudeArt(), ecorePackage.getEString(), "gebaeudeArt", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Db776ua(), ecorePackage.getEString(), "db776ua", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Gpsstandort(), ecorePackage.getEString(), "gpsstandort", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_ExterneQuelle(), this.getexterne_datenquelle(), "externeQuelle", null, 0, 1,
				Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(anlageMitAttributenEClass, AnlageMitAttributen.class, "AnlageMitAttributen", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnlageMitAttributen_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Anlagennummer(), ecorePackage.getEString(), "anlagennummer", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Objektteil(), ecorePackage.getEString(), "objektteil", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_EadbId(), ecorePackage.getEString(), "eadbId", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Primaerspannung(), this.getspannungsarttype(), "primaerspannung",
				"NSP_Un_bis_inkl_1kV_50Hz_AC", 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_InObjektteil(), ecorePackage.getEString(), "inObjektteil", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Reserve4(), ecorePackage.getEString(), "reserve4", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_AnlagenIdImmoAssi(), ecorePackage.getEString(), "anlagenIdImmoAssi", null,
				0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_EadbVersorgungArt(), this.geteadb_versorgung_art(), "eadbVersorgungArt",
				null, 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Verteilerbezeichnung(), ecorePackage.getEString(), "verteilerbezeichnung",
				null, 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_AbgangVT(), ecorePackage.getEString(), "abgangVT", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbindungEClass, Verbindung.class, "Verbindung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbindung_Nr(), ecorePackage.getEInt(), "nr", null, 0, 1, Verbindung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Primaerspannung(), this.getspannungsarttype(), "primaerspannung",
				"NSP_Un_bis_inkl_1kV_50Hz_AC", 0, 1, Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ziel(), this.getAnlageBase(), null, "ziel", null, 1, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ursprung(), this.getAnlageBase(), null, "ursprung", null, 1, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Reserve9(), ecorePackage.getEString(), "reserve9", null, 0, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Reserve10(), ecorePackage.getEString(), "reserve10", null, 0, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_QuellSicherung(), ecorePackage.getEString(), "quellSicherung", null, 0, 1,
				Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_ZielSicherung(), ecorePackage.getEString(), "zielSicherung", null, 0, 1,
				Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Kabeltype(), ecorePackage.getEString(), "kabeltype", null, 0, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Argusrelevant(), this.getARGUSrelevant(), "argusrelevant", null, 0, 1,
				Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Linientype(), this.getLinienType(), "linientype", null, 0, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plankopfEClass, Plankopf.class, "Plankopf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlankopf_Textbaustein(), this.getTextbaustein(), null, "textbaustein", null, 0, -1,
				Plankopf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textbausteinEClass, Textbaustein.class, "Textbaustein", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextbaustein_Label(), ecorePackage.getEString(), "Label", null, 1, 1, Textbaustein.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafoEClass, Trafo.class, "Trafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafo_Sekundaerspannung(), this.getspannungsarttype(), "sekundaerspannung",
				"NSP_Un_bis_inkl_1kV_50Hz_AC", 0, 1, Trafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_TrafoKva(), ecorePackage.getELong(), "trafoKva", null, 0, 1, Trafo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_Reserve5(), ecorePackage.getEString(), "reserve5", null, 0, 1, Trafo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netzanschlusspunktEClass, Netzanschlusspunkt.class, "Netzanschlusspunkt", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetzanschlusspunkt_NrHauptversorgung(), ecorePackage.getEString(), "nrHauptversorgung", null,
				0, 1, Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetzanschlusspunkt_NrReserveEinspeisung(), ecorePackage.getEString(), "nrReserveEinspeisung",
				null, 0, 1, Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetzanschlusspunkt_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1,
				Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetzanschlusspunkt_Postition(), this.getNapPosition(), "postition", null, 0, 1,
				Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(versorgungsknotenEClass, Versorgungsknoten.class, "Versorgungsknoten", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersorgungsknoten_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null,
				"netzanschlusspunkt", null, 0, 1, Versorgungsknoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energietechnikanlageEClass, Energietechnikanlage.class, "Energietechnikanlage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergietechnikanlage_EtType(), this.getET_Type(), "etType", null, 0, 1,
				Energietechnikanlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(selbststAnlageEClass, SelbststAnlage.class, "SelbststAnlage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(umrichterBaseEClass, UmrichterBase.class, "UmrichterBase", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(verteilerMitZaehlerEClass, VerteilerMitZaehler.class, "VerteilerMitZaehler", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerteilerMitZaehler_ZpNr(), ecorePackage.getEString(), "zpNr", null, 0, 1,
				VerteilerMitZaehler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umrichterMitEnergiespeicherEClass, UmrichterMitEnergiespeicher.class, "UmrichterMitEnergiespeicher",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verteilerContainerEClass, VerteilerContainer.class, "VerteilerContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerteilerContainer_Verteiler(), this.getVerteilerBase(), null, "verteiler", null, 0, -1,
				VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerteilerContainer_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null,
				"netzanschlusspunkt", null, 0, 1, VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betreiberEClass, Betreiber.class, "Betreiber", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBetreiber_Name(), ecorePackage.getEString(), "name", null, 0, 1, Betreiber.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verteilerBaseEClass, VerteilerBase.class, "VerteilerBase", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerteilerBase_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null, "netzanschlusspunkt",
				null, 0, 1, VerteilerBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verteilerOhneZaehlerEClass, VerteilerOhneZaehler.class, "VerteilerOhneZaehler", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailsEClass, Details.class, "Details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetails_Anzeigetext(), ecorePackage.getEString(), "anzeigetext", null, 0, 1, Details.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umrichterEClass, Umrichter.class, "Umrichter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(anlageBaseEClass, AnlageBase.class, "AnlageBase", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnlageBase_Details(), this.getDetails(), null, "details", null, 0, -1, AnlageBase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlageBase_Betreiber(), this.getBetreiber(), null, "betreiber", null, 0, 1, AnlageBase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlageBase_VersorgtVon(), this.getVerbindung(), null, "versorgtVon", null, 0, -1,
				AnlageBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlageBase_VerbindungNach(), this.getVerbindung(), null, "verbindungNach", null, 0, -1,
				AnlageBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anlageOhneAttributeEClass, AnlageOhneAttribute.class, "AnlageOhneAttribute", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objektarttypeEEnum, objektarttype.class, "objektarttype");
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TRAFOSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.HOCHBAUOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.SCHALTHAEUSER);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TUNNELOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.FREISTEHENDER_VT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.VERKEHRSSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.OBERLEITUNGSMAST);

		initEEnum(spannungsarttypeEEnum, spannungsarttype.class, "spannungsarttype");
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.HSP_UN_AB_1K_V50_HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.HSP_UN_15K_V16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.UN_BIS_INKL_15K_VDC);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.RESERVE_1);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.RESERVE_2);

		initEEnum(externe_datenquelleEEnum, externe_datenquelle.class, "externe_datenquelle");
		addEEnumLiteral(externe_datenquelleEEnum, externe_datenquelle.UNDEFINED);
		addEEnumLiteral(externe_datenquelleEEnum, externe_datenquelle.IMMO);
		addEEnumLiteral(externe_datenquelleEEnum, externe_datenquelle.VS);
		addEEnumLiteral(externe_datenquelleEEnum, externe_datenquelle.GEBAEUDE);

		initEEnum(eT_TypeEEnum, ET_Type.class, "ET_Type");
		addEEnumLiteral(eT_TypeEEnum, ET_Type.IG);
		addEEnumLiteral(eT_TypeEEnum, ET_Type.IF);
		addEEnumLiteral(eT_TypeEEnum, ET_Type.FV);

		initEEnum(arguSrelevantEEnum, ARGUSrelevant.class, "ARGUSrelevant");
		addEEnumLiteral(arguSrelevantEEnum, ARGUSrelevant.Y);
		addEEnumLiteral(arguSrelevantEEnum, ARGUSrelevant.N);

		initEEnum(eadb_versorgung_artEEnum, eadb_versorgung_art.class, "eadb_versorgung_art");
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.ÜGS);
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.VK);
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.IF);
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.IG);
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.WHZ);
		addEEnumLiteral(eadb_versorgung_artEEnum, eadb_versorgung_art.FV);

		initEEnum(napPositionEEnum, NapPosition.class, "NapPosition");
		addEEnumLiteral(napPositionEEnum, NapPosition.DAVOR);
		addEEnumLiteral(napPositionEEnum, NapPosition.MITTE);
		addEEnumLiteral(napPositionEEnum, NapPosition.DANACH);

		initEEnum(linienTypeEEnum, LinienType.class, "LinienType");
		addEEnumLiteral(linienTypeEEnum, LinienType.HAUPTVERSORGUNG);
		addEEnumLiteral(linienTypeEEnum, LinienType.EVU);
		addEEnumLiteral(linienTypeEEnum, LinienType.KUNDENANLAGE_ÖBB);
		addEEnumLiteral(linienTypeEEnum, LinienType.KUNDENANLAGE_DRITTER);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl

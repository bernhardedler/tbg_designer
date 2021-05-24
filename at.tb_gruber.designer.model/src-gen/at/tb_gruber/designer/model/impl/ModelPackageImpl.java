/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ARGUSrelevant;
import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.ET_Type;
import at.tb_gruber.designer.model.Energiespeicher;
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
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.Verteiler;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerDetails;
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

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
	private EClass anlageEClass = null;

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
	private EClass umrichterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energiespeicherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verteilerDetailsEClass = null;

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

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
	public EReference getObjekt_Verteilercontainer() {
		return (EReference) objektEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlage() {
		return anlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Name() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Anlagennummer() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Objektteil() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_EadbId() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlage_VerbindungNach() {
		return (EReference) anlageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlage_VersorgtVon() {
		return (EReference) anlageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Primaerspannung() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_InObjektteil() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Reserve4() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_AnlagenIdImmoAssi() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_EadbVersorgungArt() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_Verteilerbezeichnung() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlage_AbgangVT() {
		return (EAttribute) anlageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlage_Betreiber() {
		return (EReference) anlageEClass.getEStructuralFeatures().get(13);
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
	public EClass getUmrichter() {
		return umrichterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteiler() {
		return verteilerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteiler_HasZaehler() {
		return (EAttribute) verteilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteiler_Verteilerdetails() {
		return (EReference) verteilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteiler_Netzanschlusspunkt() {
		return (EReference) verteilerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergiespeicher() {
		return energiespeicherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerteilerDetails() {
		return verteilerDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerDetails_Betreiber() {
		return (EAttribute) verteilerDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerDetails_Nummer() {
		return (EAttribute) verteilerDetailsEClass.getEStructuralFeatures().get(1);
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
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerteilerContainer_Verteiler() {
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(1);
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
		createEReference(objektEClass, OBJEKT__VERTEILERCONTAINER);

		anlageEClass = createEClass(ANLAGE);
		createEAttribute(anlageEClass, ANLAGE__NAME);
		createEAttribute(anlageEClass, ANLAGE__ANLAGENNUMMER);
		createEAttribute(anlageEClass, ANLAGE__OBJEKTTEIL);
		createEAttribute(anlageEClass, ANLAGE__EADB_ID);
		createEReference(anlageEClass, ANLAGE__VERBINDUNG_NACH);
		createEReference(anlageEClass, ANLAGE__VERSORGT_VON);
		createEAttribute(anlageEClass, ANLAGE__PRIMAERSPANNUNG);
		createEAttribute(anlageEClass, ANLAGE__IN_OBJEKTTEIL);
		createEAttribute(anlageEClass, ANLAGE__RESERVE4);
		createEAttribute(anlageEClass, ANLAGE__ANLAGEN_ID_IMMO_ASSI);
		createEAttribute(anlageEClass, ANLAGE__EADB_VERSORGUNG_ART);
		createEAttribute(anlageEClass, ANLAGE__VERTEILERBEZEICHNUNG);
		createEAttribute(anlageEClass, ANLAGE__ABGANG_VT);
		createEReference(anlageEClass, ANLAGE__BETREIBER);

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

		umrichterEClass = createEClass(UMRICHTER);

		verteilerEClass = createEClass(VERTEILER);
		createEAttribute(verteilerEClass, VERTEILER__HAS_ZAEHLER);
		createEReference(verteilerEClass, VERTEILER__VERTEILERDETAILS);
		createEReference(verteilerEClass, VERTEILER__NETZANSCHLUSSPUNKT);

		energiespeicherEClass = createEClass(ENERGIESPEICHER);

		verteilerDetailsEClass = createEClass(VERTEILER_DETAILS);
		createEAttribute(verteilerDetailsEClass, VERTEILER_DETAILS__BETREIBER);
		createEAttribute(verteilerDetailsEClass, VERTEILER_DETAILS__NUMMER);

		verteilerContainerEClass = createEClass(VERTEILER_CONTAINER);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__VERTEILER);

		betreiberEClass = createEClass(BETREIBER);

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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		trafoEClass.getESuperTypes().add(this.getSelbststAnlage());
		versorgungsknotenEClass.getESuperTypes().add(this.getSelbststAnlage());
		energietechnikanlageEClass.getESuperTypes().add(this.getSelbststAnlage());
		generatorEClass.getESuperTypes().add(this.getSelbststAnlage());
		selbststAnlageEClass.getESuperTypes().add(this.getAnlage());
		umrichterEClass.getESuperTypes().add(this.getSelbststAnlage());
		verteilerEClass.getESuperTypes().add(this.getAnlage());
		energiespeicherEClass.getESuperTypes().add(this.getSelbststAnlage());

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
		initEReference(getObjekt_Anlage(), this.getAnlage(), null, "anlage", null, 0, -1, Objekt.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getObjekt_GebaeudeArt(), ecorePackage.getEString(), "gebaeudeArt", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Db776ua(), ecorePackage.getEString(), "db776ua", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Gpsstandort(), ecorePackage.getEString(), "gpsstandort", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_ExterneQuelle(), this.getexterne_datenquelle(), "externeQuelle", null, 0, 1,
				Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getObjekt_Verteilercontainer(), this.getVerteilerContainer(), null, "verteilercontainer", null,
				0, -1, Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anlageEClass, Anlage.class, "Anlage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnlage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Anlage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Anlagennummer(), ecorePackage.getEString(), "anlagennummer", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Objektteil(), ecorePackage.getEString(), "objektteil", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_EadbId(), ecorePackage.getEString(), "eadbId", null, 0, 1, Anlage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlage_VerbindungNach(), this.getVerbindung(), null, "verbindungNach", null, 0, -1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlage_VersorgtVon(), this.getVerbindung(), null, "versorgtVon", null, 0, -1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Primaerspannung(), this.getspannungsarttype(), "primaerspannung",
				"NSP 50Hz (gr\u00fcn)", 0, 1, Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_InObjektteil(), ecorePackage.getEString(), "inObjektteil", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Reserve4(), ecorePackage.getEString(), "reserve4", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_AnlagenIdImmoAssi(), ecorePackage.getEString(), "anlagenIdImmoAssi", null, 0, 1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_EadbVersorgungArt(), this.geteadb_versorgung_art(), "eadbVersorgungArt", null, 0, 1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Verteilerbezeichnung(), ecorePackage.getEString(), "verteilerbezeichnung", null, 0, 1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_AbgangVT(), ecorePackage.getEString(), "abgangVT", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnlage_Betreiber(), this.getBetreiber(), null, "betreiber", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbindungEClass, Verbindung.class, "Verbindung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbindung_Nr(), ecorePackage.getEInt(), "nr", null, 0, 1, Verbindung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Primaerspannung(), this.getspannungsarttype(), "primaerspannung", null, 0, 1,
				Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ziel(), this.getAnlage(), null, "ziel", null, 1, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ursprung(), this.getAnlage(), null, "ursprung", null, 1, 1, Verbindung.class,
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
				"NSP 50Hz (gr\u00fcn)", 0, 1, Trafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energietechnikanlageEClass, Energietechnikanlage.class, "Energietechnikanlage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergietechnikanlage_EtType(), this.getET_Type(), "etType", null, 0, 1,
				Energietechnikanlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(selbststAnlageEClass, SelbststAnlage.class, "SelbststAnlage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(umrichterEClass, Umrichter.class, "Umrichter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(verteilerEClass, Verteiler.class, "Verteiler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerteiler_HasZaehler(), theXMLTypePackage.getBoolean(), "hasZaehler", null, 0, 1,
				Verteiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVerteiler_Verteilerdetails(), this.getVerteilerDetails(), null, "verteilerdetails", null, 1,
				1, Verteiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerteiler_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null, "netzanschlusspunkt",
				null, 0, 1, Verteiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energiespeicherEClass, Energiespeicher.class, "Energiespeicher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(verteilerDetailsEClass, VerteilerDetails.class, "VerteilerDetails", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerteilerDetails_Betreiber(), ecorePackage.getEString(), "betreiber", null, 0, 1,
				VerteilerDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerteilerDetails_Nummer(), ecorePackage.getEString(), "nummer", null, 0, 1,
				VerteilerDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(verteilerContainerEClass, VerteilerContainer.class, "VerteilerContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerteilerContainer_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null,
				"netzanschlusspunkt", null, 0, 1, VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerteilerContainer_Verteiler(), this.getVerteiler(), null, "verteiler", null, 0, -1,
				VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betreiberEClass, Betreiber.class, "Betreiber", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objektarttypeEEnum, objektarttype.class, "objektarttype");
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TRAFOSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.HOCHBAUOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.SCHALTHAEUSER);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TUNNELOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.FREISTEHENDER_VT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.VERKEHRSSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.SONSTIGES);

		initEEnum(spannungsarttypeEEnum, spannungsarttype.class, "spannungsarttype");
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.ROT);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.GRÜN);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.MAGENTA);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.CYAN);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.BLAU);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.VIOLETT);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.BRAUN);

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

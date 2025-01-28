/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ARGUSrelevant;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.AnlageOhneAttribute;
import at.tb_gruber.designer.model.AnlagenContainer;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Details;
import at.tb_gruber.designer.model.ET_Type;
import at.tb_gruber.designer.model.Eadb_Versorgung_Art;
import at.tb_gruber.designer.model.Eigentuemer;
import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energiespeicherart;
import at.tb_gruber.designer.model.Energiespeicherfunktion;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Externe_Datenquelle;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.Generatorfunktion;
import at.tb_gruber.designer.model.GruppierbareAnlage;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.ModelFactory;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Objektarttype;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Umrichterart;
import at.tb_gruber.designer.model.Umrichterfunktion;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerMitZaehler;
import at.tb_gruber.designer.model.VerteilerOhneZaehler;

import at.tb_gruber.designer.model.Verteilergroesse;
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
	private EClass verteilerMitZaehlerEClass = null;

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
	private EClass eigentuemerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anlagenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gruppierbareAnlageEClass = null;

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
	private EEnum externe_DatenquelleEEnum = null;

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
	private EEnum eadb_Versorgung_ArtEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorfunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum umrichterartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energiespeicherartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum umrichterfunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energiespeicherfunktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verteilergroesseEEnum = null;

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
	public EAttribute getBahnhof_Plannummer() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Freigegeben_von() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Bearbeitet_von() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Gezeichnet_von() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Geprueft_von() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Bearbeitet_am() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Gezeichnet_am() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnhof_Geprueft_am() {
		return (EAttribute) bahnhofEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getObjekt_ObjektId() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjekt_Anlage() {
		return (EReference) objektEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Db776ua() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Gpsstandort() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_ExterneQuelle() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Ort_adresse() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjekt_Gebaeudeart() {
		return (EAttribute) objektEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjekt_Eigentuemer() {
		return (EReference) objektEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getAnlageMitAttributen_EadbId() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Primaerspannung() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_InObjektteil() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_EadbVersorgungArt() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Verteilerbezeichnung() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_AbgangVT() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Reserve1() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnlageMitAttributen_Reserve2() {
		return (EAttribute) anlageMitAttributenEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getVerbindung_QuellSicherung() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_ZielSicherung() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Kabeltype() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Argusrelevant() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Linientype() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerbindung_Kabellaenge() {
		return (EAttribute) verbindungEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getTrafo_Reserve3() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafo_Oberspannung() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrafo_Unterspannung() {
		return (EAttribute) trafoEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getNetzanschlusspunkt_Beschreibung() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_Langbeschreibung() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetzanschlusspunkt_Postition() {
		return (EAttribute) netzanschlusspunktEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getVersorgungsknoten_Groesse() {
		return (EAttribute) versorgungsknotenEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getGenerator_Generatorfunktion() {
		return (EAttribute) generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_ErzeugteEnergie() {
		return (EAttribute) generatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_ErzeugteSpannung() {
		return (EAttribute) generatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_ElektrischeLeistung() {
		return (EAttribute) generatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerator_FunktionSonstig() {
		return (EAttribute) generatorEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getVerteilerMitZaehler_NrReserveEinspeisung() {
		return (EAttribute) verteilerMitZaehlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerMitZaehler_NrHauptversorgung() {
		return (EAttribute) verteilerMitZaehlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerMitZaehler_Fernablesung() {
		return (EAttribute) verteilerMitZaehlerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEnergiespeicher_Energiespeicherfunktion() {
		return (EAttribute) energiespeicherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergiespeicher_Energiespeicherart() {
		return (EAttribute) energiespeicherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergiespeicher_Autonomiezeit() {
		return (EAttribute) energiespeicherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergiespeicher_Kapazitaet() {
		return (EAttribute) energiespeicherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergiespeicher_FunktionSonstig() {
		return (EAttribute) energiespeicherEClass.getEStructuralFeatures().get(1);
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
	public EReference getVerteilerContainer_Verteiler() {
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(0);
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
	public EReference getVerteilerContainer_Energietechnikanlage() {
		return (EReference) verteilerContainerEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getVerteilerBase_Name() {
		return (EAttribute) verteilerBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerteilerBase_Groesse() {
		return (EAttribute) verteilerBaseEClass.getEStructuralFeatures().get(2);
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
	public EClass getUmrichter() {
		return umrichterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmrichter_Umrichterfunktion() {
		return (EAttribute) umrichterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmrichter_Umrichterart() {
		return (EAttribute) umrichterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmrichter_Nennleistung() {
		return (EAttribute) umrichterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmrichter_FunktionSonstig() {
		return (EAttribute) umrichterEClass.getEStructuralFeatures().get(1);
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
	public EClass getEigentuemer() {
		return eigentuemerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEigentuemer_Name() {
		return (EAttribute) eigentuemerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnlagenContainer() {
		return anlagenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnlagenContainer_Anlage() {
		return (EReference) anlagenContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGruppierbareAnlage() {
		return gruppierbareAnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObjektarttype() {
		return objektarttypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpannungsarttype() {
		return spannungsarttypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExterne_Datenquelle() {
		return externe_DatenquelleEEnum;
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
	public EEnum getEadb_Versorgung_Art() {
		return eadb_Versorgung_ArtEEnum;
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
	public EEnum getGeneratorfunktion() {
		return generatorfunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUmrichterart() {
		return umrichterartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnergiespeicherart() {
		return energiespeicherartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUmrichterfunktion() {
		return umrichterfunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnergiespeicherfunktion() {
		return energiespeicherfunktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerteilergroesse() {
		return verteilergroesseEEnum;
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
		createEAttribute(bahnhofEClass, BAHNHOF__BEARBEITET_AM);
		createEAttribute(bahnhofEClass, BAHNHOF__BEARBEITET_VON);
		createEAttribute(bahnhofEClass, BAHNHOF__GEZEICHNET_AM);
		createEAttribute(bahnhofEClass, BAHNHOF__GEZEICHNET_VON);
		createEAttribute(bahnhofEClass, BAHNHOF__GEPRUEFT_AM);
		createEAttribute(bahnhofEClass, BAHNHOF__GEPRUEFT_VON);
		createEAttribute(bahnhofEClass, BAHNHOF__PLANNUMMER);
		createEAttribute(bahnhofEClass, BAHNHOF__FREIGEGEBEN_VON);

		objektEClass = createEClass(OBJEKT);
		createEAttribute(objektEClass, OBJEKT__NAME);
		createEAttribute(objektEClass, OBJEKT__OBJEKTART);
		createEAttribute(objektEClass, OBJEKT__OBJEKT_ID);
		createEReference(objektEClass, OBJEKT__ANLAGE);
		createEAttribute(objektEClass, OBJEKT__DB776UA);
		createEAttribute(objektEClass, OBJEKT__GPSSTANDORT);
		createEAttribute(objektEClass, OBJEKT__EXTERNE_QUELLE);
		createEAttribute(objektEClass, OBJEKT__ORT_ADRESSE);
		createEAttribute(objektEClass, OBJEKT__GEBAEUDEART);
		createEReference(objektEClass, OBJEKT__EIGENTUEMER);

		anlageMitAttributenEClass = createEClass(ANLAGE_MIT_ATTRIBUTEN);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__NAME);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__EADB_ID);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__RESERVE1);
		createEAttribute(anlageMitAttributenEClass, ANLAGE_MIT_ATTRIBUTEN__RESERVE2);

		verbindungEClass = createEClass(VERBINDUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__NR);
		createEAttribute(verbindungEClass, VERBINDUNG__PRIMAERSPANNUNG);
		createEReference(verbindungEClass, VERBINDUNG__ZIEL);
		createEReference(verbindungEClass, VERBINDUNG__URSPRUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__QUELL_SICHERUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__ZIEL_SICHERUNG);
		createEAttribute(verbindungEClass, VERBINDUNG__KABELTYPE);
		createEAttribute(verbindungEClass, VERBINDUNG__ARGUSRELEVANT);
		createEAttribute(verbindungEClass, VERBINDUNG__LINIENTYPE);
		createEAttribute(verbindungEClass, VERBINDUNG__KABELLAENGE);

		trafoEClass = createEClass(TRAFO);
		createEAttribute(trafoEClass, TRAFO__SEKUNDAERSPANNUNG);
		createEAttribute(trafoEClass, TRAFO__TRAFO_KVA);
		createEAttribute(trafoEClass, TRAFO__RESERVE3);
		createEAttribute(trafoEClass, TRAFO__OBERSPANNUNG);
		createEAttribute(trafoEClass, TRAFO__UNTERSPANNUNG);

		netzanschlusspunktEClass = createEClass(NETZANSCHLUSSPUNKT);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__BESCHREIBUNG);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG);
		createEAttribute(netzanschlusspunktEClass, NETZANSCHLUSSPUNKT__POSTITION);

		versorgungsknotenEClass = createEClass(VERSORGUNGSKNOTEN);
		createEReference(versorgungsknotenEClass, VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT);
		createEAttribute(versorgungsknotenEClass, VERSORGUNGSKNOTEN__GROESSE);

		energietechnikanlageEClass = createEClass(ENERGIETECHNIKANLAGE);
		createEAttribute(energietechnikanlageEClass, ENERGIETECHNIKANLAGE__ET_TYPE);

		generatorEClass = createEClass(GENERATOR);
		createEAttribute(generatorEClass, GENERATOR__GENERATORFUNKTION);
		createEAttribute(generatorEClass, GENERATOR__FUNKTION_SONSTIG);
		createEAttribute(generatorEClass, GENERATOR__ELEKTRISCHE_LEISTUNG);
		createEAttribute(generatorEClass, GENERATOR__ERZEUGTE_ENERGIE);
		createEAttribute(generatorEClass, GENERATOR__ERZEUGTE_SPANNUNG);

		verteilerMitZaehlerEClass = createEClass(VERTEILER_MIT_ZAEHLER);
		createEAttribute(verteilerMitZaehlerEClass, VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG);
		createEAttribute(verteilerMitZaehlerEClass, VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG);
		createEAttribute(verteilerMitZaehlerEClass, VERTEILER_MIT_ZAEHLER__FERNABLESUNG);

		energiespeicherEClass = createEClass(ENERGIESPEICHER);
		createEAttribute(energiespeicherEClass, ENERGIESPEICHER__ENERGIESPEICHERFUNKTION);
		createEAttribute(energiespeicherEClass, ENERGIESPEICHER__FUNKTION_SONSTIG);
		createEAttribute(energiespeicherEClass, ENERGIESPEICHER__ENERGIESPEICHERART);
		createEAttribute(energiespeicherEClass, ENERGIESPEICHER__KAPAZITAET);
		createEAttribute(energiespeicherEClass, ENERGIESPEICHER__AUTONOMIEZEIT);

		verteilerContainerEClass = createEClass(VERTEILER_CONTAINER);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__VERTEILER);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT);
		createEReference(verteilerContainerEClass, VERTEILER_CONTAINER__ENERGIETECHNIKANLAGE);

		betreiberEClass = createEClass(BETREIBER);
		createEAttribute(betreiberEClass, BETREIBER__NAME);

		verteilerBaseEClass = createEClass(VERTEILER_BASE);
		createEReference(verteilerBaseEClass, VERTEILER_BASE__NETZANSCHLUSSPUNKT);
		createEAttribute(verteilerBaseEClass, VERTEILER_BASE__NAME);
		createEAttribute(verteilerBaseEClass, VERTEILER_BASE__GROESSE);

		verteilerOhneZaehlerEClass = createEClass(VERTEILER_OHNE_ZAEHLER);

		detailsEClass = createEClass(DETAILS);

		umrichterEClass = createEClass(UMRICHTER);
		createEAttribute(umrichterEClass, UMRICHTER__UMRICHTERFUNKTION);
		createEAttribute(umrichterEClass, UMRICHTER__FUNKTION_SONSTIG);
		createEAttribute(umrichterEClass, UMRICHTER__UMRICHTERART);
		createEAttribute(umrichterEClass, UMRICHTER__NENNLEISTUNG);

		anlageBaseEClass = createEClass(ANLAGE_BASE);
		createEReference(anlageBaseEClass, ANLAGE_BASE__DETAILS);
		createEReference(anlageBaseEClass, ANLAGE_BASE__BETREIBER);
		createEReference(anlageBaseEClass, ANLAGE_BASE__VERSORGT_VON);
		createEReference(anlageBaseEClass, ANLAGE_BASE__VERBINDUNG_NACH);

		anlageOhneAttributeEClass = createEClass(ANLAGE_OHNE_ATTRIBUTE);

		eigentuemerEClass = createEClass(EIGENTUEMER);
		createEAttribute(eigentuemerEClass, EIGENTUEMER__NAME);

		anlagenContainerEClass = createEClass(ANLAGEN_CONTAINER);
		createEReference(anlagenContainerEClass, ANLAGEN_CONTAINER__ANLAGE);

		gruppierbareAnlageEClass = createEClass(GRUPPIERBARE_ANLAGE);

		// Create enums
		objektarttypeEEnum = createEEnum(OBJEKTARTTYPE);
		spannungsarttypeEEnum = createEEnum(SPANNUNGSARTTYPE);
		externe_DatenquelleEEnum = createEEnum(EXTERNE_DATENQUELLE);
		eT_TypeEEnum = createEEnum(ET_TYPE);
		arguSrelevantEEnum = createEEnum(ARGU_SRELEVANT);
		eadb_Versorgung_ArtEEnum = createEEnum(EADB_VERSORGUNG_ART);
		napPositionEEnum = createEEnum(NAP_POSITION);
		linienTypeEEnum = createEEnum(LINIEN_TYPE);
		generatorfunktionEEnum = createEEnum(GENERATORFUNKTION);
		umrichterartEEnum = createEEnum(UMRICHTERART);
		energiespeicherartEEnum = createEEnum(ENERGIESPEICHERART);
		umrichterfunktionEEnum = createEEnum(UMRICHTERFUNKTION);
		energiespeicherfunktionEEnum = createEEnum(ENERGIESPEICHERFUNKTION);
		verteilergroesseEEnum = createEEnum(VERTEILERGROESSE);
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
		trafoEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		netzanschlusspunktEClass.getESuperTypes().add(this.getAnlageOhneAttribute());
		versorgungsknotenEClass.getESuperTypes().add(this.getGruppierbareAnlage());
		energietechnikanlageEClass.getESuperTypes().add(this.getGruppierbareAnlage());
		generatorEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		verteilerMitZaehlerEClass.getESuperTypes().add(this.getVerteilerBase());
		energiespeicherEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		verteilerContainerEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		verteilerBaseEClass.getESuperTypes().add(this.getAnlageOhneAttribute());
		verteilerOhneZaehlerEClass.getESuperTypes().add(this.getVerteilerBase());
		umrichterEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		anlageOhneAttributeEClass.getESuperTypes().add(this.getAnlageBase());
		anlagenContainerEClass.getESuperTypes().add(this.getAnlageMitAttributen());
		gruppierbareAnlageEClass.getESuperTypes().add(this.getAnlageMitAttributen());

		// Initialize classes, features, and operations; add parameters
		initEClass(bahnhofEClass, Bahnhof.class, "Bahnhof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBahnhof_Name(), ecorePackage.getEString(), "name", null, 1, 1, Bahnhof.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Projektname(), ecorePackage.getEString(), "projektname", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnhof_Objekt(), this.getObjekt(), null, "objekt", null, 0, -1, Bahnhof.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBahnhof_Bearbeitet_am(), ecorePackage.getEString(), "bearbeitet_am", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBahnhof_Bearbeitet_von(), ecorePackage.getEString(), "bearbeitet_von", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Gezeichnet_am(), ecorePackage.getEString(), "gezeichnet_am", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBahnhof_Gezeichnet_von(), ecorePackage.getEString(), "gezeichnet_von", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Geprueft_am(), ecorePackage.getEString(), "geprueft_am", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getBahnhof_Geprueft_von(), ecorePackage.getEString(), "geprueft_von", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Plannummer(), ecorePackage.getEString(), "plannummer", null, 0, 1, Bahnhof.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBahnhof_Freigegeben_von(), ecorePackage.getEString(), "freigegeben_von", null, 0, 1,
				Bahnhof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(objektEClass, Objekt.class, "Objekt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjekt_Name(), ecorePackage.getEString(), "name", null, 1, 1, Objekt.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Objektart(), this.getObjektarttype(), "objektart", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_ObjektId(), ecorePackage.getEString(), "objektId", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjekt_Anlage(), this.getAnlageBase(), null, "anlage", null, 0, -1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Db776ua(), ecorePackage.getEString(), "db776ua", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Gpsstandort(), ecorePackage.getEString(), "gpsstandort", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_ExterneQuelle(), this.getExterne_Datenquelle(), "externeQuelle", null, 0, 1,
				Objekt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Ort_adresse(), ecorePackage.getEString(), "ort_adresse", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjekt_Gebaeudeart(), ecorePackage.getEString(), "gebaeudeart", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjekt_Eigentuemer(), this.getEigentuemer(), null, "eigentuemer", null, 0, 1, Objekt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anlageMitAttributenEClass, AnlageMitAttributen.class, "AnlageMitAttributen", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnlageMitAttributen_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Anlagennummer(), ecorePackage.getEString(), "anlagennummer", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_EadbId(), ecorePackage.getEString(), "eadbId", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Primaerspannung(), this.getSpannungsarttype(), "primaerspannung",
				"NSP Un bis inkl 1kV 50Hz AC", 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_InObjektteil(), ecorePackage.getEString(), "inObjektteil", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_EadbVersorgungArt(), this.getEadb_Versorgung_Art(), "eadbVersorgungArt",
				null, 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Verteilerbezeichnung(), ecorePackage.getEString(), "verteilerbezeichnung",
				null, 0, 1, AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_AbgangVT(), ecorePackage.getEString(), "abgangVT", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Reserve1(), ecorePackage.getEString(), "reserve1", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlageMitAttributen_Reserve2(), ecorePackage.getEString(), "reserve2", null, 0, 1,
				AnlageMitAttributen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbindungEClass, Verbindung.class, "Verbindung", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbindung_Nr(), ecorePackage.getEInt(), "nr", null, 0, 1, Verbindung.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerbindung_Primaerspannung(), this.getSpannungsarttype(), "primaerspannung",
				"NSP Un bis inkl 1kV 50Hz AC", 0, 1, Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ziel(), this.getAnlageBase(), null, "ziel", null, 1, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbindung_Ursprung(), this.getAnlageBase(), null, "ursprung", null, 1, 1, Verbindung.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getVerbindung_Kabellaenge(), ecorePackage.getEString(), "kabellaenge", null, 0, 1,
				Verbindung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(trafoEClass, Trafo.class, "Trafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafo_Sekundaerspannung(), this.getSpannungsarttype(), "sekundaerspannung",
				"NSP Un bis inkl 1kV 50Hz AC", 0, 1, Trafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_TrafoKva(), ecorePackage.getEString(), "trafoKva", null, 0, 1, Trafo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_Reserve3(), ecorePackage.getEString(), "reserve3", null, 0, 1, Trafo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_Oberspannung(), ecorePackage.getEString(), "oberspannung", null, 0, 1, Trafo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafo_Unterspannung(), ecorePackage.getEString(), "unterspannung", null, 0, 1, Trafo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netzanschlusspunktEClass, Netzanschlusspunkt.class, "Netzanschlusspunkt", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetzanschlusspunkt_Beschreibung(), ecorePackage.getEString(), "beschreibung", null, 0, 1,
				Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetzanschlusspunkt_Langbeschreibung(), ecorePackage.getEString(), "langbeschreibung", null, 0,
				1, Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetzanschlusspunkt_Postition(), this.getNapPosition(), "postition", null, 0, 1,
				Netzanschlusspunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(versorgungsknotenEClass, Versorgungsknoten.class, "Versorgungsknoten", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersorgungsknoten_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null,
				"netzanschlusspunkt", null, 0, 1, Versorgungsknoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersorgungsknoten_Groesse(), this.getVerteilergroesse(), "groesse", null, 0, 1,
				Versorgungsknoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(energietechnikanlageEClass, Energietechnikanlage.class, "Energietechnikanlage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergietechnikanlage_EtType(), this.getET_Type(), "etType", null, 0, 1,
				Energietechnikanlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerator_Generatorfunktion(), this.getGeneratorfunktion(), "generatorfunktion", null, 0, 1,
				Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_FunktionSonstig(), ecorePackage.getEString(), "funktionSonstig", null, 0, 1,
				Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_ElektrischeLeistung(), ecorePackage.getEString(), "elektrischeLeistung", null, 0, 1,
				Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_ErzeugteEnergie(), ecorePackage.getEString(), "erzeugteEnergie", null, 0, 1,
				Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerator_ErzeugteSpannung(), ecorePackage.getEString(), "erzeugteSpannung", null, 0, 1,
				Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(verteilerMitZaehlerEClass, VerteilerMitZaehler.class, "VerteilerMitZaehler", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerteilerMitZaehler_NrReserveEinspeisung(), ecorePackage.getEString(), "nrReserveEinspeisung",
				null, 0, 1, VerteilerMitZaehler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerteilerMitZaehler_NrHauptversorgung(), ecorePackage.getEString(), "nrHauptversorgung",
				"ZP-NR.: ", 0, 1, VerteilerMitZaehler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerteilerMitZaehler_Fernablesung(), ecorePackage.getEBoolean(), "fernablesung", "false", 0, 1,
				VerteilerMitZaehler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(energiespeicherEClass, Energiespeicher.class, "Energiespeicher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergiespeicher_Energiespeicherfunktion(), this.getEnergiespeicherfunktion(),
				"energiespeicherfunktion", null, 0, 1, Energiespeicher.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergiespeicher_FunktionSonstig(), ecorePackage.getEString(), "funktionSonstig", null, 0, 1,
				Energiespeicher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergiespeicher_Energiespeicherart(), this.getEnergiespeicherart(), "energiespeicherart",
				null, 0, 1, Energiespeicher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergiespeicher_Kapazitaet(), ecorePackage.getEString(), "kapazitaet", null, 0, 1,
				Energiespeicher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergiespeicher_Autonomiezeit(), ecorePackage.getEString(), "autonomiezeit", "", 0, 1,
				Energiespeicher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(verteilerContainerEClass, VerteilerContainer.class, "VerteilerContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerteilerContainer_Verteiler(), this.getVerteilerBase(), null, "verteiler", null, 0, -1,
				VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerteilerContainer_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null,
				"netzanschlusspunkt", null, 0, 1, VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerteilerContainer_Energietechnikanlage(), this.getEnergietechnikanlage(), null,
				"energietechnikanlage", null, 0, -1, VerteilerContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betreiberEClass, Betreiber.class, "Betreiber", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBetreiber_Name(), ecorePackage.getEString(), "name", null, 0, 1, Betreiber.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verteilerBaseEClass, VerteilerBase.class, "VerteilerBase", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerteilerBase_Netzanschlusspunkt(), this.getNetzanschlusspunkt(), null, "netzanschlusspunkt",
				null, 0, 1, VerteilerBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerteilerBase_Name(), ecorePackage.getEString(), "name", null, 0, 1, VerteilerBase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerteilerBase_Groesse(), this.getVerteilergroesse(), "groesse", null, 0, 1,
				VerteilerBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(verteilerOhneZaehlerEClass, VerteilerOhneZaehler.class, "VerteilerOhneZaehler", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detailsEClass, Details.class, "Details", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umrichterEClass, Umrichter.class, "Umrichter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmrichter_Umrichterfunktion(), this.getUmrichterfunktion(), "umrichterfunktion", null, 0, 1,
				Umrichter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmrichter_FunktionSonstig(), ecorePackage.getEString(), "funktionSonstig", null, 0, 1,
				Umrichter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmrichter_Umrichterart(), this.getUmrichterart(), "umrichterart", null, 0, 1, Umrichter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmrichter_Nennleistung(), ecorePackage.getEString(), "nennleistung", null, 0, 1,
				Umrichter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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

		initEClass(eigentuemerEClass, Eigentuemer.class, "Eigentuemer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEigentuemer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Eigentuemer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anlagenContainerEClass, AnlagenContainer.class, "AnlagenContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnlagenContainer_Anlage(), this.getGruppierbareAnlage(), null, "anlage", null, 0, -1,
				AnlagenContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gruppierbareAnlageEClass, GruppierbareAnlage.class, "GruppierbareAnlage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objektarttypeEEnum, Objektarttype.class, "Objektarttype");
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.TRAFOSTATION);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.HOCHBAUOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.SCHALTHAUS);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.TUNNELOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.FREISTEHENDER_VT);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.VERKEHRSSTATION);
		addEEnumLiteral(objektarttypeEEnum, Objektarttype.OBERLEITUNGSMAST);

		initEEnum(spannungsarttypeEEnum, Spannungsarttype.class, "Spannungsarttype");
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.HSP_UN_AB_1K_V50_HZ);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.HSP_UN_15K_V16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.UN_BIS_INKL_15K_VDC);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.RESERVE_1);
		addEEnumLiteral(spannungsarttypeEEnum, Spannungsarttype.RESERVE_2);

		initEEnum(externe_DatenquelleEEnum, Externe_Datenquelle.class, "Externe_Datenquelle");
		addEEnumLiteral(externe_DatenquelleEEnum, Externe_Datenquelle.UNDEFINED);
		addEEnumLiteral(externe_DatenquelleEEnum, Externe_Datenquelle.IMMO);
		addEEnumLiteral(externe_DatenquelleEEnum, Externe_Datenquelle.VS);
		addEEnumLiteral(externe_DatenquelleEEnum, Externe_Datenquelle.GEBAEUDE);

		initEEnum(eT_TypeEEnum, ET_Type.class, "ET_Type");
		addEEnumLiteral(eT_TypeEEnum, ET_Type.IG);
		addEEnumLiteral(eT_TypeEEnum, ET_Type.IF);
		addEEnumLiteral(eT_TypeEEnum, ET_Type.FV);

		initEEnum(arguSrelevantEEnum, ARGUSrelevant.class, "ARGUSrelevant");
		addEEnumLiteral(arguSrelevantEEnum, ARGUSrelevant.Y);
		addEEnumLiteral(arguSrelevantEEnum, ARGUSrelevant.N);

		initEEnum(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.class, "Eadb_Versorgung_Art");
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.ÜGS);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.VK);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.IF);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.IG);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.WHZ);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.FV);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.G);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.UR);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.ESP);
		addEEnumLiteral(eadb_Versorgung_ArtEEnum, Eadb_Versorgung_Art.ZV);

		initEEnum(napPositionEEnum, NapPosition.class, "NapPosition");
		addEEnumLiteral(napPositionEEnum, NapPosition.DAVOR);
		addEEnumLiteral(napPositionEEnum, NapPosition.MITTE);
		addEEnumLiteral(napPositionEEnum, NapPosition.DANACH);

		initEEnum(linienTypeEEnum, LinienType.class, "LinienType");
		addEEnumLiteral(linienTypeEEnum, LinienType.HAUPTVERSORGUNG);
		addEEnumLiteral(linienTypeEEnum, LinienType.EVU);
		addEEnumLiteral(linienTypeEEnum, LinienType.KUNDENANLAGE_OEBB);
		addEEnumLiteral(linienTypeEEnum, LinienType.KUNDENANLAGE_DRITTER);

		initEEnum(generatorfunktionEEnum, Generatorfunktion.class, "Generatorfunktion");
		addEEnumLiteral(generatorfunktionEEnum, Generatorfunktion.PV_GENERATOR);
		addEEnumLiteral(generatorfunktionEEnum, Generatorfunktion.DIESELAGGREGAT);
		addEEnumLiteral(generatorfunktionEEnum, Generatorfunktion.WINDKRAFTGENERATOR);
		addEEnumLiteral(generatorfunktionEEnum, Generatorfunktion.WASSERKRAFT);
		addEEnumLiteral(generatorfunktionEEnum, Generatorfunktion.SONSTIG);

		initEEnum(umrichterartEEnum, Umrichterart.class, "Umrichterart");
		addEEnumLiteral(umrichterartEEnum, Umrichterart.GLEICHRICHTER);
		addEEnumLiteral(umrichterartEEnum, Umrichterart.WECHSELRICHTER);
		addEEnumLiteral(umrichterartEEnum, Umrichterart.USV_ANLAGE);

		initEEnum(energiespeicherartEEnum, Energiespeicherart.class, "Energiespeicherart");
		addEEnumLiteral(energiespeicherartEEnum, Energiespeicherart.BATTERIE);
		addEEnumLiteral(energiespeicherartEEnum, Energiespeicherart.SCHWUNGRAD);
		addEEnumLiteral(energiespeicherartEEnum, Energiespeicherart.ERSATZSTROMVERSORGUNG);

		initEEnum(umrichterfunktionEEnum, Umrichterfunktion.class, "Umrichterfunktion");
		addEEnumLiteral(umrichterfunktionEEnum, Umrichterfunktion.ERSATZSTROMVERSORGUNG);
		addEEnumLiteral(umrichterfunktionEEnum, Umrichterfunktion.ENERGIEERZEUGUNG);
		addEEnumLiteral(umrichterfunktionEEnum, Umrichterfunktion.SONSTIG);

		initEEnum(energiespeicherfunktionEEnum, Energiespeicherfunktion.class, "Energiespeicherfunktion");
		addEEnumLiteral(energiespeicherfunktionEEnum, Energiespeicherfunktion.BATTERIE);
		addEEnumLiteral(energiespeicherfunktionEEnum, Energiespeicherfunktion.SONSTIG);

		initEEnum(verteilergroesseEEnum, Verteilergroesse.class, "Verteilergroesse");
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse.S);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse.M);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse.L);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse.XL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse.XXL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse._3XL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse._4XL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse._5XL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse._6XL);
		addEEnumLiteral(verteilergroesseEEnum, Verteilergroesse._7XL);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl

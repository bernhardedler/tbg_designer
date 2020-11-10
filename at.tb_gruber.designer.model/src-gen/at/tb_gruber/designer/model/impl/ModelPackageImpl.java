/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ARGUSrelevant;
import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.ET_Type;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.ModelFactory;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Plankopf;
import at.tb_gruber.designer.model.Textbaustein;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VersorgungsknotenMitET;
import at.tb_gruber.designer.model.Zaehlpunkt;
import at.tb_gruber.designer.model.anlagearttype;
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
	private EClass zaehlpunktEClass = null;

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
	private EClass versorgungsknotenMitETEClass = null;

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
	private EEnum anlagearttypeEEnum = null;

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
	public EClass getZaehlpunkt() {
		return zaehlpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZaehlpunkt_NrHauptversorgung() {
		return (EAttribute) zaehlpunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZaehlpunkt_NrReserveEinspeisung() {
		return (EAttribute) zaehlpunktEClass.getEStructuralFeatures().get(1);
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
	public EClass getVersorgungsknotenMitET() {
		return versorgungsknotenMitETEClass;
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
	public EEnum getanlagearttype() {
		return anlagearttypeEEnum;
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

		plankopfEClass = createEClass(PLANKOPF);
		createEReference(plankopfEClass, PLANKOPF__TEXTBAUSTEIN);

		textbausteinEClass = createEClass(TEXTBAUSTEIN);
		createEAttribute(textbausteinEClass, TEXTBAUSTEIN__LABEL);

		trafoEClass = createEClass(TRAFO);
		createEAttribute(trafoEClass, TRAFO__SEKUNDAERSPANNUNG);
		createEAttribute(trafoEClass, TRAFO__TRAFO_KVA);
		createEAttribute(trafoEClass, TRAFO__RESERVE5);

		zaehlpunktEClass = createEClass(ZAEHLPUNKT);
		createEAttribute(zaehlpunktEClass, ZAEHLPUNKT__NR_HAUPTVERSORGUNG);
		createEAttribute(zaehlpunktEClass, ZAEHLPUNKT__NR_RESERVE_EINSPEISUNG);

		versorgungsknotenEClass = createEClass(VERSORGUNGSKNOTEN);

		energietechnikanlageEClass = createEClass(ENERGIETECHNIKANLAGE);
		createEAttribute(energietechnikanlageEClass, ENERGIETECHNIKANLAGE__ET_TYPE);

		versorgungsknotenMitETEClass = createEClass(VERSORGUNGSKNOTEN_MIT_ET);

		// Create enums
		objektarttypeEEnum = createEEnum(OBJEKTARTTYPE);
		anlagearttypeEEnum = createEEnum(ANLAGEARTTYPE);
		spannungsarttypeEEnum = createEEnum(SPANNUNGSARTTYPE);
		externe_datenquelleEEnum = createEEnum(EXTERNE_DATENQUELLE);
		eT_TypeEEnum = createEEnum(ET_TYPE);
		arguSrelevantEEnum = createEEnum(ARGU_SRELEVANT);
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
		trafoEClass.getESuperTypes().add(this.getAnlage());
		zaehlpunktEClass.getESuperTypes().add(this.getAnlage());
		versorgungsknotenEClass.getESuperTypes().add(this.getAnlage());
		energietechnikanlageEClass.getESuperTypes().add(this.getAnlage());
		versorgungsknotenMitETEClass.getESuperTypes().add(this.getAnlage());

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
		initEAttribute(getAnlage_EadbVersorgungArt(), ecorePackage.getEString(), "eadbVersorgungArt", null, 0, 1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_Verteilerbezeichnung(), ecorePackage.getEString(), "verteilerbezeichnung", null, 0, 1,
				Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnlage_AbgangVT(), ecorePackage.getEString(), "abgangVT", null, 0, 1, Anlage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(zaehlpunktEClass, Zaehlpunkt.class, "Zaehlpunkt", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZaehlpunkt_NrHauptversorgung(), ecorePackage.getEString(), "nrHauptversorgung", null, 0, 1,
				Zaehlpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getZaehlpunkt_NrReserveEinspeisung(), ecorePackage.getEString(), "nrReserveEinspeisung", null, 0,
				1, Zaehlpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(versorgungsknotenEClass, Versorgungsknoten.class, "Versorgungsknoten", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(energietechnikanlageEClass, Energietechnikanlage.class, "Energietechnikanlage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnergietechnikanlage_EtType(), this.getET_Type(), "etType", null, 0, 1,
				Energietechnikanlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versorgungsknotenMitETEClass, VersorgungsknotenMitET.class, "VersorgungsknotenMitET", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objektarttypeEEnum, objektarttype.class, "objektarttype");
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TRAFOSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.HOCHBAUOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.SCHALTHAEUSER);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.TUNNELOBJEKT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.FREISTEHENDER_VT);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.VERKEHRSSTATION);
		addEEnumLiteral(objektarttypeEEnum, objektarttype.SONSTIGES);

		initEEnum(anlagearttypeEEnum, anlagearttype.class, "anlagearttype");
		addEEnumLiteral(anlagearttypeEEnum, anlagearttype.UEGS_ZAEHLPUNKT);
		addEEnumLiteral(anlagearttypeEEnum, anlagearttype.TRAFO);
		addEEnumLiteral(anlagearttypeEEnum, anlagearttype.VERSORGUNGSKNOTEN);
		addEEnumLiteral(anlagearttypeEEnum, anlagearttype.ENERGIETECHNIKANLAGE);
		addEEnumLiteral(anlagearttypeEEnum, anlagearttype.VK_ET);

		initEEnum(spannungsarttypeEEnum, spannungsarttype.class, "spannungsarttype");
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.RESERVE_VIOLETT);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype._20K_V50_HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype._10K_V50_HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.NSP50_HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype._15K_V16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.NSP16_7HZ);
		addEEnumLiteral(spannungsarttypeEEnum, spannungsarttype.RESERVE_HELLBRAUN);

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

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl

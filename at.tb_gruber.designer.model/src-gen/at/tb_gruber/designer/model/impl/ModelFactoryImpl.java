/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModelPackage.BAHNHOF:
			return createBahnhof();
		case ModelPackage.OBJEKT:
			return createObjekt();
		case ModelPackage.VERBINDUNG:
			return createVerbindung();
		case ModelPackage.TRAFO:
			return createTrafo();
		case ModelPackage.NETZANSCHLUSSPUNKT:
			return createNetzanschlusspunkt();
		case ModelPackage.VERSORGUNGSKNOTEN:
			return createVersorgungsknoten();
		case ModelPackage.ENERGIETECHNIKANLAGE:
			return createEnergietechnikanlage();
		case ModelPackage.GENERATOR:
			return createGenerator();
		case ModelPackage.VERTEILER_MIT_ZAEHLER:
			return createVerteilerMitZaehler();
		case ModelPackage.ENERGIESPEICHER:
			return createEnergiespeicher();
		case ModelPackage.VERTEILER_CONTAINER:
			return createVerteilerContainer();
		case ModelPackage.BETREIBER:
			return createBetreiber();
		case ModelPackage.VERTEILER_OHNE_ZAEHLER:
			return createVerteilerOhneZaehler();
		case ModelPackage.DETAILS:
			return createDetails();
		case ModelPackage.UMRICHTER:
			return createUmrichter();
		case ModelPackage.EIGENTUEMER:
			return createEigentuemer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.OBJEKTARTTYPE:
			return createObjektarttypeFromString(eDataType, initialValue);
		case ModelPackage.SPANNUNGSARTTYPE:
			return createSpannungsarttypeFromString(eDataType, initialValue);
		case ModelPackage.EXTERNE_DATENQUELLE:
			return createExterne_DatenquelleFromString(eDataType, initialValue);
		case ModelPackage.ET_TYPE:
			return createET_TypeFromString(eDataType, initialValue);
		case ModelPackage.ARGU_SRELEVANT:
			return createARGUSrelevantFromString(eDataType, initialValue);
		case ModelPackage.EADB_VERSORGUNG_ART:
			return createEadb_Versorgung_ArtFromString(eDataType, initialValue);
		case ModelPackage.NAP_POSITION:
			return createNapPositionFromString(eDataType, initialValue);
		case ModelPackage.LINIEN_TYPE:
			return createLinienTypeFromString(eDataType, initialValue);
		case ModelPackage.GENERATORFUNKTION:
			return createGeneratorfunktionFromString(eDataType, initialValue);
		case ModelPackage.UMRICHTERART:
			return createUmrichterartFromString(eDataType, initialValue);
		case ModelPackage.ENERGIESPEICHERART:
			return createEnergiespeicherartFromString(eDataType, initialValue);
		case ModelPackage.UMRICHTERFUNKTION:
			return createUmrichterfunktionFromString(eDataType, initialValue);
		case ModelPackage.ENERGIESPEICHERFUNKTION:
			return createEnergiespeicherfunktionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ModelPackage.OBJEKTARTTYPE:
			return convertObjektarttypeToString(eDataType, instanceValue);
		case ModelPackage.SPANNUNGSARTTYPE:
			return convertSpannungsarttypeToString(eDataType, instanceValue);
		case ModelPackage.EXTERNE_DATENQUELLE:
			return convertExterne_DatenquelleToString(eDataType, instanceValue);
		case ModelPackage.ET_TYPE:
			return convertET_TypeToString(eDataType, instanceValue);
		case ModelPackage.ARGU_SRELEVANT:
			return convertARGUSrelevantToString(eDataType, instanceValue);
		case ModelPackage.EADB_VERSORGUNG_ART:
			return convertEadb_Versorgung_ArtToString(eDataType, instanceValue);
		case ModelPackage.NAP_POSITION:
			return convertNapPositionToString(eDataType, instanceValue);
		case ModelPackage.LINIEN_TYPE:
			return convertLinienTypeToString(eDataType, instanceValue);
		case ModelPackage.GENERATORFUNKTION:
			return convertGeneratorfunktionToString(eDataType, instanceValue);
		case ModelPackage.UMRICHTERART:
			return convertUmrichterartToString(eDataType, instanceValue);
		case ModelPackage.ENERGIESPEICHERART:
			return convertEnergiespeicherartToString(eDataType, instanceValue);
		case ModelPackage.UMRICHTERFUNKTION:
			return convertUmrichterfunktionToString(eDataType, instanceValue);
		case ModelPackage.ENERGIESPEICHERFUNKTION:
			return convertEnergiespeicherfunktionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnhof createBahnhof() {
		BahnhofImpl bahnhof = new BahnhofImpl();
		return bahnhof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objekt createObjekt() {
		ObjektImpl objekt = new ObjektImpl();
		return objekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbindung createVerbindung() {
		VerbindungImpl verbindung = new VerbindungImpl();
		return verbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trafo createTrafo() {
		TrafoImpl trafo = new TrafoImpl();
		return trafo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netzanschlusspunkt createNetzanschlusspunkt() {
		NetzanschlusspunktImpl netzanschlusspunkt = new NetzanschlusspunktImpl();
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Versorgungsknoten createVersorgungsknoten() {
		VersorgungsknotenImpl versorgungsknoten = new VersorgungsknotenImpl();
		return versorgungsknoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energietechnikanlage createEnergietechnikanlage() {
		EnergietechnikanlageImpl energietechnikanlage = new EnergietechnikanlageImpl();
		return energietechnikanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerteilerMitZaehler createVerteilerMitZaehler() {
		VerteilerMitZaehlerImpl verteilerMitZaehler = new VerteilerMitZaehlerImpl();
		return verteilerMitZaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energiespeicher createEnergiespeicher() {
		EnergiespeicherImpl energiespeicher = new EnergiespeicherImpl();
		return energiespeicher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerteilerContainer createVerteilerContainer() {
		VerteilerContainerImpl verteilerContainer = new VerteilerContainerImpl();
		return verteilerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betreiber createBetreiber() {
		BetreiberImpl betreiber = new BetreiberImpl();
		return betreiber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerteilerOhneZaehler createVerteilerOhneZaehler() {
		VerteilerOhneZaehlerImpl verteilerOhneZaehler = new VerteilerOhneZaehlerImpl();
		return verteilerOhneZaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Details createDetails() {
		DetailsImpl details = new DetailsImpl();
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Umrichter createUmrichter() {
		UmrichterImpl umrichter = new UmrichterImpl();
		return umrichter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigentuemer createEigentuemer() {
		EigentuemerImpl eigentuemer = new EigentuemerImpl();
		return eigentuemer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objektarttype createObjektarttypeFromString(EDataType eDataType, String initialValue) {
		Objektarttype result = Objektarttype.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjektarttypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spannungsarttype createSpannungsarttypeFromString(EDataType eDataType, String initialValue) {
		Spannungsarttype result = Spannungsarttype.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpannungsarttypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Externe_Datenquelle createExterne_DatenquelleFromString(EDataType eDataType, String initialValue) {
		Externe_Datenquelle result = Externe_Datenquelle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExterne_DatenquelleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ET_Type createET_TypeFromString(EDataType eDataType, String initialValue) {
		ET_Type result = ET_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertET_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARGUSrelevant createARGUSrelevantFromString(EDataType eDataType, String initialValue) {
		ARGUSrelevant result = ARGUSrelevant.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARGUSrelevantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eadb_Versorgung_Art createEadb_Versorgung_ArtFromString(EDataType eDataType, String initialValue) {
		Eadb_Versorgung_Art result = Eadb_Versorgung_Art.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEadb_Versorgung_ArtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NapPosition createNapPositionFromString(EDataType eDataType, String initialValue) {
		NapPosition result = NapPosition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNapPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinienType createLinienTypeFromString(EDataType eDataType, String initialValue) {
		LinienType result = LinienType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinienTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generatorfunktion createGeneratorfunktionFromString(EDataType eDataType, String initialValue) {
		Generatorfunktion result = Generatorfunktion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneratorfunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Umrichterart createUmrichterartFromString(EDataType eDataType, String initialValue) {
		Umrichterart result = Umrichterart.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUmrichterartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energiespeicherart createEnergiespeicherartFromString(EDataType eDataType, String initialValue) {
		Energiespeicherart result = Energiespeicherart.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergiespeicherartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Umrichterfunktion createUmrichterfunktionFromString(EDataType eDataType, String initialValue) {
		Umrichterfunktion result = Umrichterfunktion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUmrichterfunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energiespeicherfunktion createEnergiespeicherfunktionFromString(EDataType eDataType, String initialValue) {
		Energiespeicherfunktion result = Energiespeicherfunktion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergiespeicherfunktionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl

/**
 */
package at.tb_gruber.designer.model.util;

import at.tb_gruber.designer.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModelPackage.BAHNHOF: {
			Bahnhof bahnhof = (Bahnhof) theEObject;
			T result = caseBahnhof(bahnhof);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.OBJEKT: {
			Objekt objekt = (Objekt) theEObject;
			T result = caseObjekt(objekt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN: {
			AnlageMitAttributen anlageMitAttributen = (AnlageMitAttributen) theEObject;
			T result = caseAnlageMitAttributen(anlageMitAttributen);
			if (result == null)
				result = caseAnlageBase(anlageMitAttributen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERBINDUNG: {
			Verbindung verbindung = (Verbindung) theEObject;
			T result = caseVerbindung(verbindung);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TRAFO: {
			Trafo trafo = (Trafo) theEObject;
			T result = caseTrafo(trafo);
			if (result == null)
				result = caseAnlageMitAttributen(trafo);
			if (result == null)
				result = caseAnlageBase(trafo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.NETZANSCHLUSSPUNKT: {
			Netzanschlusspunkt netzanschlusspunkt = (Netzanschlusspunkt) theEObject;
			T result = caseNetzanschlusspunkt(netzanschlusspunkt);
			if (result == null)
				result = caseAnlageOhneAttribute(netzanschlusspunkt);
			if (result == null)
				result = caseAnlageBase(netzanschlusspunkt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERSORGUNGSKNOTEN: {
			Versorgungsknoten versorgungsknoten = (Versorgungsknoten) theEObject;
			T result = caseVersorgungsknoten(versorgungsknoten);
			if (result == null)
				result = caseGruppierbareAnlage(versorgungsknoten);
			if (result == null)
				result = caseAnlageMitAttributen(versorgungsknoten);
			if (result == null)
				result = caseAnlageBase(versorgungsknoten);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENERGIETECHNIKANLAGE: {
			Energietechnikanlage energietechnikanlage = (Energietechnikanlage) theEObject;
			T result = caseEnergietechnikanlage(energietechnikanlage);
			if (result == null)
				result = caseGruppierbareAnlage(energietechnikanlage);
			if (result == null)
				result = caseAnlageMitAttributen(energietechnikanlage);
			if (result == null)
				result = caseAnlageBase(energietechnikanlage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GENERATOR: {
			Generator generator = (Generator) theEObject;
			T result = caseGenerator(generator);
			if (result == null)
				result = caseAnlageMitAttributen(generator);
			if (result == null)
				result = caseAnlageBase(generator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_MIT_ZAEHLER: {
			VerteilerMitZaehler verteilerMitZaehler = (VerteilerMitZaehler) theEObject;
			T result = caseVerteilerMitZaehler(verteilerMitZaehler);
			if (result == null)
				result = caseVerteilerBase(verteilerMitZaehler);
			if (result == null)
				result = caseAnlageOhneAttribute(verteilerMitZaehler);
			if (result == null)
				result = caseAnlageBase(verteilerMitZaehler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENERGIESPEICHER: {
			Energiespeicher energiespeicher = (Energiespeicher) theEObject;
			T result = caseEnergiespeicher(energiespeicher);
			if (result == null)
				result = caseAnlageMitAttributen(energiespeicher);
			if (result == null)
				result = caseAnlageBase(energiespeicher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_CONTAINER: {
			VerteilerContainer verteilerContainer = (VerteilerContainer) theEObject;
			T result = caseVerteilerContainer(verteilerContainer);
			if (result == null)
				result = caseAnlageMitAttributen(verteilerContainer);
			if (result == null)
				result = caseAnlageBase(verteilerContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.BETREIBER: {
			Betreiber betreiber = (Betreiber) theEObject;
			T result = caseBetreiber(betreiber);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_BASE: {
			VerteilerBase verteilerBase = (VerteilerBase) theEObject;
			T result = caseVerteilerBase(verteilerBase);
			if (result == null)
				result = caseAnlageOhneAttribute(verteilerBase);
			if (result == null)
				result = caseAnlageBase(verteilerBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_OHNE_ZAEHLER: {
			VerteilerOhneZaehler verteilerOhneZaehler = (VerteilerOhneZaehler) theEObject;
			T result = caseVerteilerOhneZaehler(verteilerOhneZaehler);
			if (result == null)
				result = caseVerteilerBase(verteilerOhneZaehler);
			if (result == null)
				result = caseAnlageOhneAttribute(verteilerOhneZaehler);
			if (result == null)
				result = caseAnlageBase(verteilerOhneZaehler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.DETAILS: {
			Details details = (Details) theEObject;
			T result = caseDetails(details);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.UMRICHTER: {
			Umrichter umrichter = (Umrichter) theEObject;
			T result = caseUmrichter(umrichter);
			if (result == null)
				result = caseAnlageMitAttributen(umrichter);
			if (result == null)
				result = caseAnlageBase(umrichter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ANLAGE_BASE: {
			AnlageBase anlageBase = (AnlageBase) theEObject;
			T result = caseAnlageBase(anlageBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ANLAGE_OHNE_ATTRIBUTE: {
			AnlageOhneAttribute anlageOhneAttribute = (AnlageOhneAttribute) theEObject;
			T result = caseAnlageOhneAttribute(anlageOhneAttribute);
			if (result == null)
				result = caseAnlageBase(anlageOhneAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.EIGENTUEMER: {
			Eigentuemer eigentuemer = (Eigentuemer) theEObject;
			T result = caseEigentuemer(eigentuemer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ANLAGEN_CONTAINER: {
			AnlagenContainer anlagenContainer = (AnlagenContainer) theEObject;
			T result = caseAnlagenContainer(anlagenContainer);
			if (result == null)
				result = caseAnlageMitAttributen(anlagenContainer);
			if (result == null)
				result = caseAnlageBase(anlagenContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GRUPPIERBARE_ANLAGE: {
			GruppierbareAnlage gruppierbareAnlage = (GruppierbareAnlage) theEObject;
			T result = caseGruppierbareAnlage(gruppierbareAnlage);
			if (result == null)
				result = caseAnlageMitAttributen(gruppierbareAnlage);
			if (result == null)
				result = caseAnlageBase(gruppierbareAnlage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bahnhof</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bahnhof</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBahnhof(Bahnhof object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjekt(Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlage Mit Attributen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlage Mit Attributen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlageMitAttributen(AnlageMitAttributen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbindung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbindung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbindung(Verbindung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trafo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trafo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrafo(Trafo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Netzanschlusspunkt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Netzanschlusspunkt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetzanschlusspunkt(Netzanschlusspunkt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versorgungsknoten</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versorgungsknoten</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersorgungsknoten(Versorgungsknoten object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energietechnikanlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energietechnikanlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergietechnikanlage(Energietechnikanlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verteiler Mit Zaehler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verteiler Mit Zaehler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerteilerMitZaehler(VerteilerMitZaehler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energiespeicher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energiespeicher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergiespeicher(Energiespeicher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verteiler Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verteiler Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerteilerContainer(VerteilerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Betreiber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Betreiber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetreiber(Betreiber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verteiler Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verteiler Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerteilerBase(VerteilerBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verteiler Ohne Zaehler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verteiler Ohne Zaehler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerteilerOhneZaehler(VerteilerOhneZaehler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetails(Details object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Umrichter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Umrichter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmrichter(Umrichter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlage Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlage Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlageBase(AnlageBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlage Ohne Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlage Ohne Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlageOhneAttribute(AnlageOhneAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eigentuemer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eigentuemer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEigentuemer(Eigentuemer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anlagen Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlagen Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlagenContainer(AnlagenContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gruppierbare Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gruppierbare Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGruppierbareAnlage(GruppierbareAnlage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch

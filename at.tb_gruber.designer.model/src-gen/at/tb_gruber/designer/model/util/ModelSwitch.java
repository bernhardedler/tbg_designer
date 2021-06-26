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
		case ModelPackage.ANLAGE: {
			Anlage anlage = (Anlage) theEObject;
			T result = caseAnlage(anlage);
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
		case ModelPackage.PLANKOPF: {
			Plankopf plankopf = (Plankopf) theEObject;
			T result = casePlankopf(plankopf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TEXTBAUSTEIN: {
			Textbaustein textbaustein = (Textbaustein) theEObject;
			T result = caseTextbaustein(textbaustein);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TRAFO: {
			Trafo trafo = (Trafo) theEObject;
			T result = caseTrafo(trafo);
			if (result == null)
				result = caseSelbststAnlage(trafo);
			if (result == null)
				result = caseAnlage(trafo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.NETZANSCHLUSSPUNKT: {
			Netzanschlusspunkt netzanschlusspunkt = (Netzanschlusspunkt) theEObject;
			T result = caseNetzanschlusspunkt(netzanschlusspunkt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERSORGUNGSKNOTEN: {
			Versorgungsknoten versorgungsknoten = (Versorgungsknoten) theEObject;
			T result = caseVersorgungsknoten(versorgungsknoten);
			if (result == null)
				result = caseSelbststAnlage(versorgungsknoten);
			if (result == null)
				result = caseAnlage(versorgungsknoten);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENERGIETECHNIKANLAGE: {
			Energietechnikanlage energietechnikanlage = (Energietechnikanlage) theEObject;
			T result = caseEnergietechnikanlage(energietechnikanlage);
			if (result == null)
				result = caseSelbststAnlage(energietechnikanlage);
			if (result == null)
				result = caseAnlage(energietechnikanlage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GENERATOR: {
			Generator generator = (Generator) theEObject;
			T result = caseGenerator(generator);
			if (result == null)
				result = caseSelbststAnlage(generator);
			if (result == null)
				result = caseAnlage(generator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.SELBSTST_ANLAGE: {
			SelbststAnlage selbststAnlage = (SelbststAnlage) theEObject;
			T result = caseSelbststAnlage(selbststAnlage);
			if (result == null)
				result = caseAnlage(selbststAnlage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.UMRICHTER: {
			Umrichter umrichter = (Umrichter) theEObject;
			T result = caseUmrichter(umrichter);
			if (result == null)
				result = caseSelbststAnlage(umrichter);
			if (result == null)
				result = caseAnlage(umrichter);
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
				result = caseAnlage(verteilerMitZaehler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ENERGIESPEICHER: {
			Energiespeicher energiespeicher = (Energiespeicher) theEObject;
			T result = caseEnergiespeicher(energiespeicher);
			if (result == null)
				result = caseSelbststAnlage(energiespeicher);
			if (result == null)
				result = caseAnlage(energiespeicher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_DETAILS: {
			VerteilerDetails verteilerDetails = (VerteilerDetails) theEObject;
			T result = caseVerteilerDetails(verteilerDetails);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.VERTEILER_CONTAINER: {
			VerteilerContainer verteilerContainer = (VerteilerContainer) theEObject;
			T result = caseVerteilerContainer(verteilerContainer);
			if (result == null)
				result = caseAnlage(verteilerContainer);
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
				result = caseAnlage(verteilerBase);
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
				result = caseAnlage(verteilerOhneZaehler);
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
	 * Returns the result of interpreting the object as an instance of '<em>Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnlage(Anlage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plankopf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plankopf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlankopf(Plankopf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textbaustein</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textbaustein</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextbaustein(Textbaustein object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Selbstst Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selbstst Anlage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelbststAnlage(SelbststAnlage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Verteiler Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verteiler Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerteilerDetails(VerteilerDetails object) {
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

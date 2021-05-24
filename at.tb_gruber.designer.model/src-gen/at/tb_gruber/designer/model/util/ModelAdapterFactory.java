/**
 */
package at.tb_gruber.designer.model.util;

import at.tb_gruber.designer.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.tb_gruber.designer.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseBahnhof(Bahnhof object) {
			return createBahnhofAdapter();
		}

		@Override
		public Adapter caseObjekt(Objekt object) {
			return createObjektAdapter();
		}

		@Override
		public Adapter caseAnlage(Anlage object) {
			return createAnlageAdapter();
		}

		@Override
		public Adapter caseVerbindung(Verbindung object) {
			return createVerbindungAdapter();
		}

		@Override
		public Adapter casePlankopf(Plankopf object) {
			return createPlankopfAdapter();
		}

		@Override
		public Adapter caseTextbaustein(Textbaustein object) {
			return createTextbausteinAdapter();
		}

		@Override
		public Adapter caseTrafo(Trafo object) {
			return createTrafoAdapter();
		}

		@Override
		public Adapter caseNetzanschlusspunkt(Netzanschlusspunkt object) {
			return createNetzanschlusspunktAdapter();
		}

		@Override
		public Adapter caseVersorgungsknoten(Versorgungsknoten object) {
			return createVersorgungsknotenAdapter();
		}

		@Override
		public Adapter caseEnergietechnikanlage(Energietechnikanlage object) {
			return createEnergietechnikanlageAdapter();
		}

		@Override
		public Adapter caseGenerator(Generator object) {
			return createGeneratorAdapter();
		}

		@Override
		public Adapter caseSelbststAnlage(SelbststAnlage object) {
			return createSelbststAnlageAdapter();
		}

		@Override
		public Adapter caseUmrichter(Umrichter object) {
			return createUmrichterAdapter();
		}

		@Override
		public Adapter caseVerteiler(Verteiler object) {
			return createVerteilerAdapter();
		}

		@Override
		public Adapter caseEnergiespeicher(Energiespeicher object) {
			return createEnergiespeicherAdapter();
		}

		@Override
		public Adapter caseVerteilerDetails(VerteilerDetails object) {
			return createVerteilerDetailsAdapter();
		}

		@Override
		public Adapter caseVerteilerContainer(VerteilerContainer object) {
			return createVerteilerContainerAdapter();
		}

		@Override
		public Adapter caseBetreiber(Betreiber object) {
			return createBetreiberAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Bahnhof <em>Bahnhof</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Bahnhof
	 * @generated
	 */
	public Adapter createBahnhofAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Objekt <em>Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Objekt
	 * @generated
	 */
	public Adapter createObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Anlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Anlage
	 * @generated
	 */
	public Adapter createAnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Verbindung <em>Verbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Verbindung
	 * @generated
	 */
	public Adapter createVerbindungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Plankopf <em>Plankopf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Plankopf
	 * @generated
	 */
	public Adapter createPlankopfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Textbaustein <em>Textbaustein</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Textbaustein
	 * @generated
	 */
	public Adapter createTextbausteinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Trafo <em>Trafo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Trafo
	 * @generated
	 */
	public Adapter createTrafoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Netzanschlusspunkt <em>Netzanschlusspunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Netzanschlusspunkt
	 * @generated
	 */
	public Adapter createNetzanschlusspunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Versorgungsknoten <em>Versorgungsknoten</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Versorgungsknoten
	 * @generated
	 */
	public Adapter createVersorgungsknotenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Energietechnikanlage <em>Energietechnikanlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Energietechnikanlage
	 * @generated
	 */
	public Adapter createEnergietechnikanlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.SelbststAnlage <em>Selbstst Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.SelbststAnlage
	 * @generated
	 */
	public Adapter createSelbststAnlageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Umrichter <em>Umrichter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Umrichter
	 * @generated
	 */
	public Adapter createUmrichterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Verteiler <em>Verteiler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Verteiler
	 * @generated
	 */
	public Adapter createVerteilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Energiespeicher <em>Energiespeicher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Energiespeicher
	 * @generated
	 */
	public Adapter createEnergiespeicherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.VerteilerDetails <em>Verteiler Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.VerteilerDetails
	 * @generated
	 */
	public Adapter createVerteilerDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.VerteilerContainer <em>Verteiler Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.VerteilerContainer
	 * @generated
	 */
	public Adapter createVerteilerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.tb_gruber.designer.model.Betreiber <em>Betreiber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.tb_gruber.designer.model.Betreiber
	 * @generated
	 */
	public Adapter createBetreiberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory

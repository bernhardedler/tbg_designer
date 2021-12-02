/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.util.ModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Bahnhof} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BahnhofItemProvider bahnhofItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Bahnhof}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBahnhofAdapter() {
		if (bahnhofItemProvider == null) {
			bahnhofItemProvider = new BahnhofItemProvider(this);
		}

		return bahnhofItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Objekt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjektItemProvider objektItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjektAdapter() {
		if (objektItemProvider == null) {
			objektItemProvider = new ObjektItemProvider(this);
		}

		return objektItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Verbindung} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbindungItemProvider verbindungItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Verbindung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerbindungAdapter() {
		if (verbindungItemProvider == null) {
			verbindungItemProvider = new VerbindungItemProvider(this);
		}

		return verbindungItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Trafo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafoItemProvider trafoItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Trafo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrafoAdapter() {
		if (trafoItemProvider == null) {
			trafoItemProvider = new TrafoItemProvider(this);
		}

		return trafoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Netzanschlusspunkt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetzanschlusspunktItemProvider netzanschlusspunktItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Netzanschlusspunkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNetzanschlusspunktAdapter() {
		if (netzanschlusspunktItemProvider == null) {
			netzanschlusspunktItemProvider = new NetzanschlusspunktItemProvider(this);
		}

		return netzanschlusspunktItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Versorgungsknoten} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersorgungsknotenItemProvider versorgungsknotenItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Versorgungsknoten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersorgungsknotenAdapter() {
		if (versorgungsknotenItemProvider == null) {
			versorgungsknotenItemProvider = new VersorgungsknotenItemProvider(this);
		}

		return versorgungsknotenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Energietechnikanlage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergietechnikanlageItemProvider energietechnikanlageItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Energietechnikanlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnergietechnikanlageAdapter() {
		if (energietechnikanlageItemProvider == null) {
			energietechnikanlageItemProvider = new EnergietechnikanlageItemProvider(this);
		}

		return energietechnikanlageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Generator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorItemProvider generatorItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneratorAdapter() {
		if (generatorItemProvider == null) {
			generatorItemProvider = new GeneratorItemProvider(this);
		}

		return generatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Umrichter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmrichterItemProvider umrichterItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Umrichter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUmrichterAdapter() {
		if (umrichterItemProvider == null) {
			umrichterItemProvider = new UmrichterItemProvider(this);
		}

		return umrichterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Eigentuemer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EigentuemerItemProvider eigentuemerItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Eigentuemer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEigentuemerAdapter() {
		if (eigentuemerItemProvider == null) {
			eigentuemerItemProvider = new EigentuemerItemProvider(this);
		}

		return eigentuemerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.VerteilerMitZaehler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerMitZaehlerItemProvider verteilerMitZaehlerItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.VerteilerMitZaehler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerteilerMitZaehlerAdapter() {
		if (verteilerMitZaehlerItemProvider == null) {
			verteilerMitZaehlerItemProvider = new VerteilerMitZaehlerItemProvider(this);
		}

		return verteilerMitZaehlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Energiespeicher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergiespeicherItemProvider energiespeicherItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Energiespeicher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnergiespeicherAdapter() {
		if (energiespeicherItemProvider == null) {
			energiespeicherItemProvider = new EnergiespeicherItemProvider(this);
		}

		return energiespeicherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.VerteilerContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerContainerItemProvider verteilerContainerItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.VerteilerContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerteilerContainerAdapter() {
		if (verteilerContainerItemProvider == null) {
			verteilerContainerItemProvider = new VerteilerContainerItemProvider(this);
		}

		return verteilerContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Betreiber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetreiberItemProvider betreiberItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Betreiber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBetreiberAdapter() {
		if (betreiberItemProvider == null) {
			betreiberItemProvider = new BetreiberItemProvider(this);
		}

		return betreiberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.VerteilerOhneZaehler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerOhneZaehlerItemProvider verteilerOhneZaehlerItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.VerteilerOhneZaehler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerteilerOhneZaehlerAdapter() {
		if (verteilerOhneZaehlerItemProvider == null) {
			verteilerOhneZaehlerItemProvider = new VerteilerOhneZaehlerItemProvider(this);
		}

		return verteilerOhneZaehlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.tb_gruber.designer.model.Details} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsItemProvider detailsItemProvider;

	/**
	 * This creates an adapter for a {@link at.tb_gruber.designer.model.Details}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDetailsAdapter() {
		if (detailsItemProvider == null) {
			detailsItemProvider = new DetailsItemProvider(this);
		}

		return detailsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (bahnhofItemProvider != null)
			bahnhofItemProvider.dispose();
		if (objektItemProvider != null)
			objektItemProvider.dispose();
		if (verbindungItemProvider != null)
			verbindungItemProvider.dispose();
		if (trafoItemProvider != null)
			trafoItemProvider.dispose();
		if (netzanschlusspunktItemProvider != null)
			netzanschlusspunktItemProvider.dispose();
		if (versorgungsknotenItemProvider != null)
			versorgungsknotenItemProvider.dispose();
		if (energietechnikanlageItemProvider != null)
			energietechnikanlageItemProvider.dispose();
		if (generatorItemProvider != null)
			generatorItemProvider.dispose();
		if (verteilerMitZaehlerItemProvider != null)
			verteilerMitZaehlerItemProvider.dispose();
		if (energiespeicherItemProvider != null)
			energiespeicherItemProvider.dispose();
		if (verteilerContainerItemProvider != null)
			verteilerContainerItemProvider.dispose();
		if (betreiberItemProvider != null)
			betreiberItemProvider.dispose();
		if (verteilerOhneZaehlerItemProvider != null)
			verteilerOhneZaehlerItemProvider.dispose();
		if (detailsItemProvider != null)
			detailsItemProvider.dispose();
		if (umrichterItemProvider != null)
			umrichterItemProvider.dispose();
		if (eigentuemerItemProvider != null)
			eigentuemerItemProvider.dispose();
	}

}

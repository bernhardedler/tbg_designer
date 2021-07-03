/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.ModelFactory;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.tb_gruber.designer.model.Objekt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjektItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjektItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addObjektartPropertyDescriptor(object);
			addOrt_AdressePropertyDescriptor(object);
			addObjektIdPropertyDescriptor(object);
			addGebaeudeArtPropertyDescriptor(object);
			addDb776uaPropertyDescriptor(object);
			addGpsstandortPropertyDescriptor(object);
			addExterneQuellePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_name_feature", "_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Objektart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjektartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_objektart_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_objektart_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__OBJEKTART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ort Adresse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrt_AdressePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_Ort_Adresse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_Ort_Adresse_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__ORT_ADRESSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Objekt Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjektIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_objektId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_objektId_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__OBJEKT_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gebaeude Art feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGebaeudeArtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_gebaeudeArt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_gebaeudeArt_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__GEBAEUDE_ART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Db776ua feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDb776uaPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_db776ua_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_db776ua_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__DB776UA, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gpsstandort feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGpsstandortPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_gpsstandort_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_gpsstandort_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__GPSSTANDORT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Externe Quelle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExterneQuellePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Objekt_externeQuelle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Objekt_externeQuelle_feature",
								"_UI_Objekt_type"),
						ModelPackage.Literals.OBJEKT__EXTERNE_QUELLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelPackage.Literals.OBJEKT__ANLAGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Objekt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Objekt"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Objekt) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Objekt_type")
				: getString("_UI_Objekt_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Objekt.class)) {
		case ModelPackage.OBJEKT__NAME:
		case ModelPackage.OBJEKT__OBJEKTART:
		case ModelPackage.OBJEKT__ORT_ADRESSE:
		case ModelPackage.OBJEKT__OBJEKT_ID:
		case ModelPackage.OBJEKT__GEBAEUDE_ART:
		case ModelPackage.OBJEKT__DB776UA:
		case ModelPackage.OBJEKT__GPSSTANDORT:
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE, ModelFactory.eINSTANCE.createTrafo()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createNetzanschlusspunkt()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createVersorgungsknoten()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createEnergietechnikanlage()));

		newChildDescriptors.add(
				createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE, ModelFactory.eINSTANCE.createGenerator()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createVerteilerMitZaehler()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createUmrichterMitEnergiespeicher()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createVerteilerContainer()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE,
				ModelFactory.eINSTANCE.createVerteilerOhneZaehler()));

		newChildDescriptors.add(
				createChildParameter(ModelPackage.Literals.OBJEKT__ANLAGE, ModelFactory.eINSTANCE.createUmrichter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}

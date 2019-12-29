/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Verbindung;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link at.tb_gruber.designer.model.Verbindung} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerbindungItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbindungItemProvider(AdapterFactory adapterFactory) {
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

			addNrPropertyDescriptor(object);
			addVersorgungsspannungPropertyDescriptor(object);
			addKabeltypPropertyDescriptor(object);
			addZielPropertyDescriptor(object);
			addUrsprungPropertyDescriptor(object);
			addQuellSicherungsGroessePropertyDescriptor(object);
			addZielSicherungsGroessePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_nr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_nr_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__NR, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Versorgungsspannung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersorgungsspannungPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_versorgungsspannung_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_versorgungsspannung_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__VERSORGUNGSSPANNUNG, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kabeltyp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKabeltypPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_kabeltyp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_kabeltyp_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__KABELTYP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ziel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZielPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_ziel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_ziel_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__ZIEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Ursprung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrsprungPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_ursprung_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_ursprung_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__URSPRUNG, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Quell Sicherungs Groesse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuellSicherungsGroessePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_quellSicherungsGroesse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_quellSicherungsGroesse_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__QUELL_SICHERUNGS_GROESSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ziel Sicherungs Groesse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZielSicherungsGroessePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Verbindung_zielSicherungsGroesse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Verbindung_zielSicherungsGroesse_feature",
								"_UI_Verbindung_type"),
						ModelPackage.Literals.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Verbindung.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Verbindung"));
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
		Verbindung verbindung = (Verbindung) object;
		return getString("_UI_Verbindung_type") + " " + verbindung.getNr();
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

		switch (notification.getFeatureID(Verbindung.class)) {
		case ModelPackage.VERBINDUNG__NR:
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
		case ModelPackage.VERBINDUNG__KABELTYP:
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE:
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

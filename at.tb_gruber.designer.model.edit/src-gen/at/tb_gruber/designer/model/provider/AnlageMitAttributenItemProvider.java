/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.ModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.tb_gruber.designer.model.AnlageMitAttributen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnlageMitAttributenItemProvider extends AnlageBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnlageMitAttributenItemProvider(AdapterFactory adapterFactory) {
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
			addAnlagennummerPropertyDescriptor(object);
			addEadbIdPropertyDescriptor(object);
			addPrimaerspannungPropertyDescriptor(object);
			addInObjektteilPropertyDescriptor(object);
			addEadbVersorgungArtPropertyDescriptor(object);
			addVerteilerbezeichnungPropertyDescriptor(object);
			addAbgangVTPropertyDescriptor(object);
			addReserve1PropertyDescriptor(object);
			addReserve2PropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_AnlageMitAttributen_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_name_feature",
								"_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Anlagennummer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnlagennummerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AnlageMitAttributen_anlagennummer_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_anlagennummer_feature",
						"_UI_AnlageMitAttributen_type"),
				ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Eadb Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEadbIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_eadbId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_eadbId_feature",
								"_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__EADB_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Primaerspannung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaerspannungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AnlageMitAttributen_primaerspannung_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_primaerspannung_feature",
						"_UI_AnlageMitAttributen_type"),
				ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the In Objektteil feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInObjektteilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AnlageMitAttributen_inObjektteil_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_inObjektteil_feature",
						"_UI_AnlageMitAttributen_type"),
				ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Eadb Versorgung Art feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEadbVersorgungArtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_eadbVersorgungArt_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AnlageMitAttributen_eadbVersorgungArt_feature", "_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Verteilerbezeichnung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerteilerbezeichnungPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_verteilerbezeichnung_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AnlageMitAttributen_verteilerbezeichnung_feature", "_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Abgang VT feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbgangVTPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_abgangVT_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_abgangVT_feature",
								"_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reserve1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReserve1PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_reserve1_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_reserve1_feature",
								"_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__RESERVE1, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reserve2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReserve2PropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnlageMitAttributen_reserve2_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnlageMitAttributen_reserve2_feature",
								"_UI_AnlageMitAttributen_type"),
						ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN__RESERVE2, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AnlageMitAttributen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnlageMitAttributen"));
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
		String label = ((AnlageMitAttributen) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AnlageMitAttributen_type")
				: getString("_UI_AnlageMitAttributen_type") + " " + label;
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

		switch (notification.getFeatureID(AnlageMitAttributen.class)) {
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1:
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2:
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

}

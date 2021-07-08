/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.UmrichterMitEnergiespeicher;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.tb_gruber.designer.model.UmrichterMitEnergiespeicher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UmrichterMitEnergiespeicherItemProvider extends UmrichterBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmrichterMitEnergiespeicherItemProvider(AdapterFactory adapterFactory) {
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

			addEnergiespeicherfunktionPropertyDescriptor(object);
			addEnergiespeicherartPropertyDescriptor(object);
			addAutonomiezeitPropertyDescriptor(object);
			addKapazitaetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Energiespeicherfunktion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergiespeicherfunktionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UmrichterMitEnergiespeicher_energiespeicherfunktion_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_UmrichterMitEnergiespeicher_energiespeicherfunktion_feature",
						"_UI_UmrichterMitEnergiespeicher_type"),
				ModelPackage.Literals.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Energiespeicherart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergiespeicherartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_UmrichterMitEnergiespeicher_energiespeicherart_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_UmrichterMitEnergiespeicher_energiespeicherart_feature",
								"_UI_UmrichterMitEnergiespeicher_type"),
						ModelPackage.Literals.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Autonomiezeit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutonomiezeitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UmrichterMitEnergiespeicher_autonomiezeit_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UmrichterMitEnergiespeicher_autonomiezeit_feature",
						"_UI_UmrichterMitEnergiespeicher_type"),
				ModelPackage.Literals.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kapazitaet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKapazitaetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_UmrichterMitEnergiespeicher_kapazitaet_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_UmrichterMitEnergiespeicher_kapazitaet_feature",
						"_UI_UmrichterMitEnergiespeicher_type"),
				ModelPackage.Literals.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns UmrichterMitEnergiespeicher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UmrichterMitEnergiespeicher"));
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
		String label = ((UmrichterMitEnergiespeicher) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UmrichterMitEnergiespeicher_type")
				: getString("_UI_UmrichterMitEnergiespeicher_type") + " " + label;
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

		switch (notification.getFeatureID(UmrichterMitEnergiespeicher.class)) {
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART:
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT:
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET:
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

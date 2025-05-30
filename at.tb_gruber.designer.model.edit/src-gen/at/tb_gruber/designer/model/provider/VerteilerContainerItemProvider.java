/**
 */
package at.tb_gruber.designer.model.provider;

import at.tb_gruber.designer.model.ModelFactory;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.VerteilerContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.tb_gruber.designer.model.VerteilerContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerteilerContainerItemProvider extends AnlageMitAttributenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerteilerContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ModelPackage.Literals.VERTEILER_CONTAINER__VERTEILER);
			childrenFeatures.add(ModelPackage.Literals.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT);
			childrenFeatures.add(ModelPackage.Literals.VERTEILER_CONTAINER__ENERGIETECHNIKANLAGE);
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
	 * This returns VerteilerContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VerteilerContainer"));
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
		String label = ((VerteilerContainer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_VerteilerContainer_type")
				: getString("_UI_VerteilerContainer_type") + " " + label;
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

		switch (notification.getFeatureID(VerteilerContainer.class)) {
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
		case ModelPackage.VERTEILER_CONTAINER__ENERGIETECHNIKANLAGE:
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

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.VERTEILER_CONTAINER__VERTEILER,
				ModelFactory.eINSTANCE.createVerteilerMitZaehler()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.VERTEILER_CONTAINER__VERTEILER,
				ModelFactory.eINSTANCE.createVerteilerOhneZaehler()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT,
				ModelFactory.eINSTANCE.createNetzanschlusspunkt()));

		newChildDescriptors.add(createChildParameter(ModelPackage.Literals.VERTEILER_CONTAINER__ENERGIETECHNIKANLAGE,
				ModelFactory.eINSTANCE.createEnergietechnikanlage()));
	}

}

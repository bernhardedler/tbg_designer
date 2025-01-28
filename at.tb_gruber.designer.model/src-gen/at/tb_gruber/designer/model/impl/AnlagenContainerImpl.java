/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.AnlagenContainer;
import at.tb_gruber.designer.model.GruppierbareAnlage;
import at.tb_gruber.designer.model.ModelPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anlagen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlagenContainerImpl#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnlagenContainerImpl extends AnlageMitAttributenImpl implements AnlagenContainer {
	/**
	 * The cached value of the '{@link #getAnlage() <em>Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<GruppierbareAnlage> anlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnlagenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ANLAGEN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GruppierbareAnlage> getAnlage() {
		if (anlage == null) {
			anlage = new EObjectContainmentEList<GruppierbareAnlage>(GruppierbareAnlage.class, this,
					ModelPackage.ANLAGEN_CONTAINER__ANLAGE);
		}
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ANLAGEN_CONTAINER__ANLAGE:
			return ((InternalEList<?>) getAnlage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ANLAGEN_CONTAINER__ANLAGE:
			return getAnlage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ANLAGEN_CONTAINER__ANLAGE:
			getAnlage().clear();
			getAnlage().addAll((Collection<? extends GruppierbareAnlage>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.ANLAGEN_CONTAINER__ANLAGE:
			getAnlage().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.ANLAGEN_CONTAINER__ANLAGE:
			return anlage != null && !anlage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnlagenContainerImpl

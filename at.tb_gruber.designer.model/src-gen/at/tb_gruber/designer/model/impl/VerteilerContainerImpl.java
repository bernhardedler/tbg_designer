/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Verteiler;
import at.tb_gruber.designer.model.VerteilerContainer;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verteiler Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getVerteiler <em>Verteiler</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerteilerContainerImpl extends MinimalEObjectImpl.Container implements VerteilerContainer {
	/**
	 * The cached value of the '{@link #getVerteiler() <em>Verteiler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteiler()
	 * @generated
	 * @ordered
	 */
	protected EList<Verteiler> verteiler;

	/**
	 * The cached value of the '{@link #getNetzanschlusspunkt() <em>Netzanschlusspunkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Netzanschlusspunkt> netzanschlusspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERTEILER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Netzanschlusspunkt> getNetzanschlusspunkt() {
		if (netzanschlusspunkt == null) {
			netzanschlusspunkt = new EObjectContainmentEList<Netzanschlusspunkt>(Netzanschlusspunkt.class, this,
					ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT);
		}
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verteiler> getVerteiler() {
		if (verteiler == null) {
			verteiler = new EObjectContainmentEList<Verteiler>(Verteiler.class, this,
					ModelPackage.VERTEILER_CONTAINER__VERTEILER);
		}
		return verteiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return ((InternalEList<?>) getVerteiler()).basicRemove(otherEnd, msgs);
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return ((InternalEList<?>) getNetzanschlusspunkt()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return getVerteiler();
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return getNetzanschlusspunkt();
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			getVerteiler().clear();
			getVerteiler().addAll((Collection<? extends Verteiler>) newValue);
			return;
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			getNetzanschlusspunkt().clear();
			getNetzanschlusspunkt().addAll((Collection<? extends Netzanschlusspunkt>) newValue);
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			getVerteiler().clear();
			return;
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			getNetzanschlusspunkt().clear();
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return verteiler != null && !verteiler.isEmpty();
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return netzanschlusspunkt != null && !netzanschlusspunkt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerteilerContainerImpl

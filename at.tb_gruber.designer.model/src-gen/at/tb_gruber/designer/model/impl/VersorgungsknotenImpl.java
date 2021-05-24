/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Versorgungsknoten;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versorgungsknoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VersorgungsknotenImpl#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersorgungsknotenImpl extends SelbststAnlageImpl implements Versorgungsknoten {
	/**
	 * The cached value of the '{@link #getNetzanschlusspunkt() <em>Netzanschlusspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 * @ordered
	 */
	protected Netzanschlusspunkt netzanschlusspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersorgungsknotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERSORGUNGSKNOTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netzanschlusspunkt getNetzanschlusspunkt() {
		if (netzanschlusspunkt != null && netzanschlusspunkt.eIsProxy()) {
			InternalEObject oldNetzanschlusspunkt = (InternalEObject) netzanschlusspunkt;
			netzanschlusspunkt = (Netzanschlusspunkt) eResolveProxy(oldNetzanschlusspunkt);
			if (netzanschlusspunkt != oldNetzanschlusspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT, oldNetzanschlusspunkt,
							netzanschlusspunkt));
			}
		}
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Netzanschlusspunkt basicGetNetzanschlusspunkt() {
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetzanschlusspunkt(Netzanschlusspunkt newNetzanschlusspunkt) {
		Netzanschlusspunkt oldNetzanschlusspunkt = netzanschlusspunkt;
		netzanschlusspunkt = newNetzanschlusspunkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT,
					oldNetzanschlusspunkt, netzanschlusspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
			if (resolve)
				return getNetzanschlusspunkt();
			return basicGetNetzanschlusspunkt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
			setNetzanschlusspunkt((Netzanschlusspunkt) newValue);
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
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
			setNetzanschlusspunkt((Netzanschlusspunkt) null);
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
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
			return netzanschlusspunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //VersorgungsknotenImpl

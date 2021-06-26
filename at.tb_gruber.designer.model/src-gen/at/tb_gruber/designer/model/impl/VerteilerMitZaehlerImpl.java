/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.VerteilerDetails;
import at.tb_gruber.designer.model.VerteilerMitZaehler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verteiler Mit Zaehler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl#getVerteilerdetails <em>Verteilerdetails</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerteilerMitZaehlerImpl extends VerteilerBaseImpl implements VerteilerMitZaehler {
	/**
	 * The cached value of the '{@link #getVerteilerdetails() <em>Verteilerdetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteilerdetails()
	 * @generated
	 * @ordered
	 */
	protected VerteilerDetails verteilerdetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerMitZaehlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERTEILER_MIT_ZAEHLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerteilerDetails getVerteilerdetails() {
		return verteilerdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerteilerdetails(VerteilerDetails newVerteilerdetails, NotificationChain msgs) {
		VerteilerDetails oldVerteilerdetails = verteilerdetails;
		verteilerdetails = newVerteilerdetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS, oldVerteilerdetails, newVerteilerdetails);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerteilerdetails(VerteilerDetails newVerteilerdetails) {
		if (newVerteilerdetails != verteilerdetails) {
			NotificationChain msgs = null;
			if (verteilerdetails != null)
				msgs = ((InternalEObject) verteilerdetails).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS, null, msgs);
			if (newVerteilerdetails != null)
				msgs = ((InternalEObject) newVerteilerdetails).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS, null, msgs);
			msgs = basicSetVerteilerdetails(newVerteilerdetails, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS,
					newVerteilerdetails, newVerteilerdetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS:
			return basicSetVerteilerdetails(null, msgs);
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS:
			return getVerteilerdetails();
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS:
			setVerteilerdetails((VerteilerDetails) newValue);
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS:
			setVerteilerdetails((VerteilerDetails) null);
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__VERTEILERDETAILS:
			return verteilerdetails != null;
		}
		return super.eIsSet(featureID);
	}

} //VerteilerMitZaehlerImpl

/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Verteiler;
import at.tb_gruber.designer.model.VerteilerDetails;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verteiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerImpl#isHasZaehler <em>Has Zaehler</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerImpl#getVerteilerdetails <em>Verteilerdetails</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerImpl#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerteilerImpl extends AnlageImpl implements Verteiler {
	/**
	 * The default value of the '{@link #isHasZaehler() <em>Has Zaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasZaehler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ZAEHLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasZaehler() <em>Has Zaehler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasZaehler()
	 * @generated
	 * @ordered
	 */
	protected boolean hasZaehler = HAS_ZAEHLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVerteilerdetails() <em>Verteilerdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteilerdetails()
	 * @generated
	 * @ordered
	 */
	protected VerteilerDetails verteilerdetails;

	/**
	 * The cached value of the '{@link #getNetzanschlusspunkt() <em>Netzanschlusspunkt</em>}' containment reference.
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
	protected VerteilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERTEILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasZaehler() {
		return hasZaehler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasZaehler(boolean newHasZaehler) {
		boolean oldHasZaehler = hasZaehler;
		hasZaehler = newHasZaehler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER__HAS_ZAEHLER, oldHasZaehler,
					hasZaehler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerteilerDetails getVerteilerdetails() {
		if (verteilerdetails != null && verteilerdetails.eIsProxy()) {
			InternalEObject oldVerteilerdetails = (InternalEObject) verteilerdetails;
			verteilerdetails = (VerteilerDetails) eResolveProxy(oldVerteilerdetails);
			if (verteilerdetails != oldVerteilerdetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VERTEILER__VERTEILERDETAILS,
							oldVerteilerdetails, verteilerdetails));
			}
		}
		return verteilerdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerteilerDetails basicGetVerteilerdetails() {
		return verteilerdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerteilerdetails(VerteilerDetails newVerteilerdetails) {
		VerteilerDetails oldVerteilerdetails = verteilerdetails;
		verteilerdetails = newVerteilerdetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER__VERTEILERDETAILS,
					oldVerteilerdetails, verteilerdetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netzanschlusspunkt getNetzanschlusspunkt() {
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetzanschlusspunkt(Netzanschlusspunkt newNetzanschlusspunkt,
			NotificationChain msgs) {
		Netzanschlusspunkt oldNetzanschlusspunkt = netzanschlusspunkt;
		netzanschlusspunkt = newNetzanschlusspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT, oldNetzanschlusspunkt, newNetzanschlusspunkt);
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
	public void setNetzanschlusspunkt(Netzanschlusspunkt newNetzanschlusspunkt) {
		if (newNetzanschlusspunkt != netzanschlusspunkt) {
			NotificationChain msgs = null;
			if (netzanschlusspunkt != null)
				msgs = ((InternalEObject) netzanschlusspunkt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT, null, msgs);
			if (newNetzanschlusspunkt != null)
				msgs = ((InternalEObject) newNetzanschlusspunkt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT, null, msgs);
			msgs = basicSetNetzanschlusspunkt(newNetzanschlusspunkt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT,
					newNetzanschlusspunkt, newNetzanschlusspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT:
			return basicSetNetzanschlusspunkt(null, msgs);
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
		case ModelPackage.VERTEILER__HAS_ZAEHLER:
			return isHasZaehler();
		case ModelPackage.VERTEILER__VERTEILERDETAILS:
			if (resolve)
				return getVerteilerdetails();
			return basicGetVerteilerdetails();
		case ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT:
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
		case ModelPackage.VERTEILER__HAS_ZAEHLER:
			setHasZaehler((Boolean) newValue);
			return;
		case ModelPackage.VERTEILER__VERTEILERDETAILS:
			setVerteilerdetails((VerteilerDetails) newValue);
			return;
		case ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT:
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
		case ModelPackage.VERTEILER__HAS_ZAEHLER:
			setHasZaehler(HAS_ZAEHLER_EDEFAULT);
			return;
		case ModelPackage.VERTEILER__VERTEILERDETAILS:
			setVerteilerdetails((VerteilerDetails) null);
			return;
		case ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT:
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
		case ModelPackage.VERTEILER__HAS_ZAEHLER:
			return hasZaehler != HAS_ZAEHLER_EDEFAULT;
		case ModelPackage.VERTEILER__VERTEILERDETAILS:
			return verteilerdetails != null;
		case ModelPackage.VERTEILER__NETZANSCHLUSSPUNKT:
			return netzanschlusspunkt != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hasZaehler: ");
		result.append(hasZaehler);
		result.append(')');
		return result.toString();
	}

} //VerteilerImpl

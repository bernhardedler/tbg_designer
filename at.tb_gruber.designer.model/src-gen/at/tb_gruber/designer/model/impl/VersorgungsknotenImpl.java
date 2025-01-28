/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Versorgungsknoten;

import at.tb_gruber.designer.model.Verteilergroesse;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link at.tb_gruber.designer.model.impl.VersorgungsknotenImpl#getGroesse <em>Groesse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersorgungsknotenImpl extends GruppierbareAnlageImpl implements Versorgungsknoten {
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
	 * The default value of the '{@link #getGroesse() <em>Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroesse()
	 * @generated
	 * @ordered
	 */
	protected static final Verteilergroesse GROESSE_EDEFAULT = Verteilergroesse.S;
	/**
	 * The cached value of the '{@link #getGroesse() <em>Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroesse()
	 * @generated
	 * @ordered
	 */
	protected Verteilergroesse groesse = GROESSE_EDEFAULT;

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
					ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT, oldNetzanschlusspunkt, newNetzanschlusspunkt);
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
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT, null, msgs);
			if (newNetzanschlusspunkt != null)
				msgs = ((InternalEObject) newNetzanschlusspunkt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT, null, msgs);
			msgs = basicSetNetzanschlusspunkt(newNetzanschlusspunkt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT,
					newNetzanschlusspunkt, newNetzanschlusspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verteilergroesse getGroesse() {
		return groesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroesse(Verteilergroesse newGroesse) {
		Verteilergroesse oldGroesse = groesse;
		groesse = newGroesse == null ? GROESSE_EDEFAULT : newGroesse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERSORGUNGSKNOTEN__GROESSE, oldGroesse,
					groesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
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
		case ModelPackage.VERSORGUNGSKNOTEN__NETZANSCHLUSSPUNKT:
			return getNetzanschlusspunkt();
		case ModelPackage.VERSORGUNGSKNOTEN__GROESSE:
			return getGroesse();
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
		case ModelPackage.VERSORGUNGSKNOTEN__GROESSE:
			setGroesse((Verteilergroesse) newValue);
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
		case ModelPackage.VERSORGUNGSKNOTEN__GROESSE:
			setGroesse(GROESSE_EDEFAULT);
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
		case ModelPackage.VERSORGUNGSKNOTEN__GROESSE:
			return groesse != GROESSE_EDEFAULT;
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
		result.append(" (groesse: ");
		result.append(groesse);
		result.append(')');
		return result.toString();
	}

} //VersorgungsknotenImpl

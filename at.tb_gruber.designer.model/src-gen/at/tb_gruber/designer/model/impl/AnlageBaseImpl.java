/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Details;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Verbindung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anlage Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl#getBetreiber <em>Betreiber</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageBaseImpl#getVerbindungNach <em>Verbindung Nach</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnlageBaseImpl extends MinimalEObjectImpl.Container implements AnlageBase {
	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<Details> details;

	/**
	 * The cached value of the '{@link #getBetreiber() <em>Betreiber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreiber()
	 * @generated
	 * @ordered
	 */
	protected Betreiber betreiber;

	/**
	 * The cached value of the '{@link #getVersorgtVon() <em>Versorgt Von</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgtVon()
	 * @generated
	 * @ordered
	 */
	protected EList<Verbindung> versorgtVon;

	/**
	 * The cached value of the '{@link #getVerbindungNach() <em>Verbindung Nach</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbindungNach()
	 * @generated
	 * @ordered
	 */
	protected EList<Verbindung> verbindungNach;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnlageBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ANLAGE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Details> getDetails() {
		if (details == null) {
			details = new EObjectContainmentEList<Details>(Details.class, this, ModelPackage.ANLAGE_BASE__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betreiber getBetreiber() {
		return betreiber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetreiber(Betreiber newBetreiber, NotificationChain msgs) {
		Betreiber oldBetreiber = betreiber;
		betreiber = newBetreiber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.ANLAGE_BASE__BETREIBER, oldBetreiber, newBetreiber);
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
	public void setBetreiber(Betreiber newBetreiber) {
		if (newBetreiber != betreiber) {
			NotificationChain msgs = null;
			if (betreiber != null)
				msgs = ((InternalEObject) betreiber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ANLAGE_BASE__BETREIBER, null, msgs);
			if (newBetreiber != null)
				msgs = ((InternalEObject) newBetreiber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ANLAGE_BASE__BETREIBER, null, msgs);
			msgs = basicSetBetreiber(newBetreiber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_BASE__BETREIBER, newBetreiber,
					newBetreiber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verbindung> getVersorgtVon() {
		if (versorgtVon == null) {
			versorgtVon = new EObjectResolvingEList<Verbindung>(Verbindung.class, this,
					ModelPackage.ANLAGE_BASE__VERSORGT_VON);
		}
		return versorgtVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verbindung> getVerbindungNach() {
		if (verbindungNach == null) {
			verbindungNach = new EObjectContainmentEList<Verbindung>(Verbindung.class, this,
					ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH);
		}
		return verbindungNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ANLAGE_BASE__DETAILS:
			return ((InternalEList<?>) getDetails()).basicRemove(otherEnd, msgs);
		case ModelPackage.ANLAGE_BASE__BETREIBER:
			return basicSetBetreiber(null, msgs);
		case ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH:
			return ((InternalEList<?>) getVerbindungNach()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.ANLAGE_BASE__DETAILS:
			return getDetails();
		case ModelPackage.ANLAGE_BASE__BETREIBER:
			return getBetreiber();
		case ModelPackage.ANLAGE_BASE__VERSORGT_VON:
			return getVersorgtVon();
		case ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH:
			return getVerbindungNach();
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
		case ModelPackage.ANLAGE_BASE__DETAILS:
			getDetails().clear();
			getDetails().addAll((Collection<? extends Details>) newValue);
			return;
		case ModelPackage.ANLAGE_BASE__BETREIBER:
			setBetreiber((Betreiber) newValue);
			return;
		case ModelPackage.ANLAGE_BASE__VERSORGT_VON:
			getVersorgtVon().clear();
			getVersorgtVon().addAll((Collection<? extends Verbindung>) newValue);
			return;
		case ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
			getVerbindungNach().addAll((Collection<? extends Verbindung>) newValue);
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
		case ModelPackage.ANLAGE_BASE__DETAILS:
			getDetails().clear();
			return;
		case ModelPackage.ANLAGE_BASE__BETREIBER:
			setBetreiber((Betreiber) null);
			return;
		case ModelPackage.ANLAGE_BASE__VERSORGT_VON:
			getVersorgtVon().clear();
			return;
		case ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
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
		case ModelPackage.ANLAGE_BASE__DETAILS:
			return details != null && !details.isEmpty();
		case ModelPackage.ANLAGE_BASE__BETREIBER:
			return betreiber != null;
		case ModelPackage.ANLAGE_BASE__VERSORGT_VON:
			return versorgtVon != null && !versorgtVon.isEmpty();
		case ModelPackage.ANLAGE_BASE__VERBINDUNG_NACH:
			return verbindungNach != null && !verbindungNach.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnlageBaseImpl

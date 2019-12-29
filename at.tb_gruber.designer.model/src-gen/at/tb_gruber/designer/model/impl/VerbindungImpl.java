/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Sicherung;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.spannungsarttype;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verbindung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getKabeltyp <em>Kabeltyp</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getQuellSicherung <em>Quell Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZielSicherung <em>Ziel Sicherung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerbindungImpl extends MinimalEObjectImpl.Container implements Verbindung {
	/**
	 * The default value of the '{@link #getVersorgungsspannung() <em>Versorgungsspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgungsspannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype VERSORGUNGSSPANNUNG_EDEFAULT = spannungsarttype.NSP50_HZ;

	/**
	 * The cached value of the '{@link #getVersorgungsspannung() <em>Versorgungsspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgungsspannung()
	 * @generated
	 * @ordered
	 */
	protected spannungsarttype versorgungsspannung = VERSORGUNGSSPANNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getKabeltyp() <em>Kabeltyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabeltyp()
	 * @generated
	 * @ordered
	 */
	protected static final String KABELTYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKabeltyp() <em>Kabeltyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabeltyp()
	 * @generated
	 * @ordered
	 */
	protected String kabeltyp = KABELTYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZiel() <em>Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZiel()
	 * @generated
	 * @ordered
	 */
	protected Anlage ziel;

	/**
	 * The cached value of the '{@link #getUrsprung() <em>Ursprung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrsprung()
	 * @generated
	 * @ordered
	 */
	protected Anlage ursprung;

	/**
	 * The cached value of the '{@link #getQuellSicherung() <em>Quell Sicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellSicherung()
	 * @generated
	 * @ordered
	 */
	protected Sicherung quellSicherung;

	/**
	 * The cached value of the '{@link #getZielSicherung() <em>Ziel Sicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielSicherung()
	 * @generated
	 * @ordered
	 */
	protected Sicherung zielSicherung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerbindungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERBINDUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public spannungsarttype getVersorgungsspannung() {
		return versorgungsspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersorgungsspannung(spannungsarttype newVersorgungsspannung) {
		spannungsarttype oldVersorgungsspannung = versorgungsspannung;
		versorgungsspannung = newVersorgungsspannung == null ? VERSORGUNGSSPANNUNG_EDEFAULT : newVersorgungsspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG,
					oldVersorgungsspannung, versorgungsspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKabeltyp() {
		return kabeltyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKabeltyp(String newKabeltyp) {
		String oldKabeltyp = kabeltyp;
		kabeltyp = newKabeltyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__KABELTYP, oldKabeltyp,
					kabeltyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anlage getZiel() {
		if (ziel != null && ziel.eIsProxy()) {
			InternalEObject oldZiel = (InternalEObject) ziel;
			ziel = (Anlage) eResolveProxy(oldZiel);
			if (ziel != oldZiel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VERBINDUNG__ZIEL, oldZiel,
							ziel));
			}
		}
		return ziel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anlage basicGetZiel() {
		return ziel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZiel(Anlage newZiel) {
		Anlage oldZiel = ziel;
		ziel = newZiel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__ZIEL, oldZiel, ziel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anlage getUrsprung() {
		if (ursprung != null && ursprung.eIsProxy()) {
			InternalEObject oldUrsprung = (InternalEObject) ursprung;
			ursprung = (Anlage) eResolveProxy(oldUrsprung);
			if (ursprung != oldUrsprung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VERBINDUNG__URSPRUNG,
							oldUrsprung, ursprung));
			}
		}
		return ursprung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anlage basicGetUrsprung() {
		return ursprung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrsprung(Anlage newUrsprung) {
		Anlage oldUrsprung = ursprung;
		ursprung = newUrsprung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__URSPRUNG, oldUrsprung,
					ursprung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sicherung getQuellSicherung() {
		return quellSicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuellSicherung(Sicherung newQuellSicherung, NotificationChain msgs) {
		Sicherung oldQuellSicherung = quellSicherung;
		quellSicherung = newQuellSicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERBINDUNG__QUELL_SICHERUNG, oldQuellSicherung, newQuellSicherung);
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
	public void setQuellSicherung(Sicherung newQuellSicherung) {
		if (newQuellSicherung != quellSicherung) {
			NotificationChain msgs = null;
			if (quellSicherung != null)
				msgs = ((InternalEObject) quellSicherung).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERBINDUNG__QUELL_SICHERUNG, null, msgs);
			if (newQuellSicherung != null)
				msgs = ((InternalEObject) newQuellSicherung).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERBINDUNG__QUELL_SICHERUNG, null, msgs);
			msgs = basicSetQuellSicherung(newQuellSicherung, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__QUELL_SICHERUNG,
					newQuellSicherung, newQuellSicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sicherung getZielSicherung() {
		return zielSicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZielSicherung(Sicherung newZielSicherung, NotificationChain msgs) {
		Sicherung oldZielSicherung = zielSicherung;
		zielSicherung = newZielSicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERBINDUNG__ZIEL_SICHERUNG, oldZielSicherung, newZielSicherung);
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
	public void setZielSicherung(Sicherung newZielSicherung) {
		if (newZielSicherung != zielSicherung) {
			NotificationChain msgs = null;
			if (zielSicherung != null)
				msgs = ((InternalEObject) zielSicherung).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERBINDUNG__ZIEL_SICHERUNG, null, msgs);
			if (newZielSicherung != null)
				msgs = ((InternalEObject) newZielSicherung).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERBINDUNG__ZIEL_SICHERUNG, null, msgs);
			msgs = basicSetZielSicherung(newZielSicherung, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__ZIEL_SICHERUNG,
					newZielSicherung, newZielSicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			return basicSetQuellSicherung(null, msgs);
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			return basicSetZielSicherung(null, msgs);
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
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
			return getVersorgungsspannung();
		case ModelPackage.VERBINDUNG__KABELTYP:
			return getKabeltyp();
		case ModelPackage.VERBINDUNG__ZIEL:
			if (resolve)
				return getZiel();
			return basicGetZiel();
		case ModelPackage.VERBINDUNG__URSPRUNG:
			if (resolve)
				return getUrsprung();
			return basicGetUrsprung();
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			return getQuellSicherung();
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			return getZielSicherung();
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
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
			setVersorgungsspannung((spannungsarttype) newValue);
			return;
		case ModelPackage.VERBINDUNG__KABELTYP:
			setKabeltyp((String) newValue);
			return;
		case ModelPackage.VERBINDUNG__ZIEL:
			setZiel((Anlage) newValue);
			return;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			setUrsprung((Anlage) newValue);
			return;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			setQuellSicherung((Sicherung) newValue);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			setZielSicherung((Sicherung) newValue);
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
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
			setVersorgungsspannung(VERSORGUNGSSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__KABELTYP:
			setKabeltyp(KABELTYP_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__ZIEL:
			setZiel((Anlage) null);
			return;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			setUrsprung((Anlage) null);
			return;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			setQuellSicherung((Sicherung) null);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			setZielSicherung((Sicherung) null);
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
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
			return versorgungsspannung != VERSORGUNGSSPANNUNG_EDEFAULT;
		case ModelPackage.VERBINDUNG__KABELTYP:
			return KABELTYP_EDEFAULT == null ? kabeltyp != null : !KABELTYP_EDEFAULT.equals(kabeltyp);
		case ModelPackage.VERBINDUNG__ZIEL:
			return ziel != null;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			return ursprung != null;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			return quellSicherung != null;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			return zielSicherung != null;
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
		result.append(" (versorgungsspannung: ");
		result.append(versorgungsspannung);
		result.append(", kabeltyp: ");
		result.append(kabeltyp);
		result.append(')');
		return result.toString();
	}

} //VerbindungImpl

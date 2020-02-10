/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.anlagearttype;
import at.tb_gruber.designer.model.spannungsarttype;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAnlagenart <em>Anlagenart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getObjektteil <em>Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAnlagenId <em>Anlagen Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getTrafoKva <em>Trafo Kva</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getTrafospannung <em>Trafospannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVerbindungNach <em>Verbindung Nach</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnlageImpl extends MinimalEObjectImpl.Container implements Anlage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnlagenart() <em>Anlagenart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenart()
	 * @generated
	 * @ordered
	 */
	protected static final anlagearttype ANLAGENART_EDEFAULT = anlagearttype.UEGS_ZAEHLPUNKT;

	/**
	 * The cached value of the '{@link #getAnlagenart() <em>Anlagenart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenart()
	 * @generated
	 * @ordered
	 */
	protected anlagearttype anlagenart = ANLAGENART_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnlagennummer() <em>Anlagennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagennummer()
	 * @generated
	 * @ordered
	 */
	protected static final String ANLAGENNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnlagennummer() <em>Anlagennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagennummer()
	 * @generated
	 * @ordered
	 */
	protected String anlagennummer = ANLAGENNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjektteil() <em>Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektteil()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJEKTTEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjektteil() <em>Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektteil()
	 * @generated
	 * @ordered
	 */
	protected String objektteil = OBJEKTTEIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnlagenId() <em>Anlagen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenId()
	 * @generated
	 * @ordered
	 */
	protected static final String ANLAGEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnlagenId() <em>Anlagen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenId()
	 * @generated
	 * @ordered
	 */
	protected String anlagenId = ANLAGEN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected static final long TRAFO_KVA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected long trafoKva = TRAFO_KVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafospannung() <em>Trafospannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafospannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype TRAFOSPANNUNG_EDEFAULT = spannungsarttype._20K_V50_HZ;

	/**
	 * The cached value of the '{@link #getTrafospannung() <em>Trafospannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafospannung()
	 * @generated
	 * @ordered
	 */
	protected spannungsarttype trafospannung = TRAFOSPANNUNG_EDEFAULT;

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
	 * The cached value of the '{@link #getVersorgtVon() <em>Versorgt Von</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgtVon()
	 * @generated
	 * @ordered
	 */
	protected Verbindung versorgtVon;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public anlagearttype getAnlagenart() {
		return anlagenart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnlagenart(anlagearttype newAnlagenart) {
		anlagearttype oldAnlagenart = anlagenart;
		anlagenart = newAnlagenart == null ? ANLAGENART_EDEFAULT : newAnlagenart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__ANLAGENART, oldAnlagenart,
					anlagenart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnlagennummer() {
		return anlagennummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnlagennummer(String newAnlagennummer) {
		String oldAnlagennummer = anlagennummer;
		anlagennummer = newAnlagennummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__ANLAGENNUMMER, oldAnlagennummer,
					anlagennummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjektteil() {
		return objektteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjektteil(String newObjektteil) {
		String oldObjektteil = objektteil;
		objektteil = newObjektteil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__OBJEKTTEIL, oldObjektteil,
					objektteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnlagenId() {
		return anlagenId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnlagenId(String newAnlagenId) {
		String oldAnlagenId = anlagenId;
		anlagenId = newAnlagenId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__ANLAGEN_ID, oldAnlagenId,
					anlagenId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTrafoKva() {
		return trafoKva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafoKva(long newTrafoKva) {
		long oldTrafoKva = trafoKva;
		trafoKva = newTrafoKva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__TRAFO_KVA, oldTrafoKva,
					trafoKva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public spannungsarttype getTrafospannung() {
		return trafospannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafospannung(spannungsarttype newTrafospannung) {
		spannungsarttype oldTrafospannung = trafospannung;
		trafospannung = newTrafospannung == null ? TRAFOSPANNUNG_EDEFAULT : newTrafospannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__TRAFOSPANNUNG, oldTrafospannung,
					trafospannung));
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
					ModelPackage.ANLAGE__VERBINDUNG_NACH);
		}
		return verbindungNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verbindung getVersorgtVon() {
		if (versorgtVon != null && versorgtVon.eIsProxy()) {
			InternalEObject oldVersorgtVon = (InternalEObject) versorgtVon;
			versorgtVon = (Verbindung) eResolveProxy(oldVersorgtVon);
			if (versorgtVon != oldVersorgtVon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ANLAGE__VERSORGT_VON,
							oldVersorgtVon, versorgtVon));
			}
		}
		return versorgtVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verbindung basicGetVersorgtVon() {
		return versorgtVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersorgtVon(Verbindung newVersorgtVon) {
		Verbindung oldVersorgtVon = versorgtVon;
		versorgtVon = newVersorgtVon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__VERSORGT_VON, oldVersorgtVon,
					versorgtVon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__VERSORGUNGSSPANNUNG,
					oldVersorgungsspannung, versorgungsspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
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
		case ModelPackage.ANLAGE__NAME:
			return getName();
		case ModelPackage.ANLAGE__ANLAGENART:
			return getAnlagenart();
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			return getAnlagennummer();
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			return getObjektteil();
		case ModelPackage.ANLAGE__ANLAGEN_ID:
			return getAnlagenId();
		case ModelPackage.ANLAGE__TRAFO_KVA:
			return getTrafoKva();
		case ModelPackage.ANLAGE__TRAFOSPANNUNG:
			return getTrafospannung();
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			return getVerbindungNach();
		case ModelPackage.ANLAGE__VERSORGT_VON:
			if (resolve)
				return getVersorgtVon();
			return basicGetVersorgtVon();
		case ModelPackage.ANLAGE__VERSORGUNGSSPANNUNG:
			return getVersorgungsspannung();
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
		case ModelPackage.ANLAGE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.ANLAGE__ANLAGENART:
			setAnlagenart((anlagearttype) newValue);
			return;
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			setAnlagennummer((String) newValue);
			return;
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			setObjektteil((String) newValue);
			return;
		case ModelPackage.ANLAGE__ANLAGEN_ID:
			setAnlagenId((String) newValue);
			return;
		case ModelPackage.ANLAGE__TRAFO_KVA:
			setTrafoKva((Long) newValue);
			return;
		case ModelPackage.ANLAGE__TRAFOSPANNUNG:
			setTrafospannung((spannungsarttype) newValue);
			return;
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
			getVerbindungNach().addAll((Collection<? extends Verbindung>) newValue);
			return;
		case ModelPackage.ANLAGE__VERSORGT_VON:
			setVersorgtVon((Verbindung) newValue);
			return;
		case ModelPackage.ANLAGE__VERSORGUNGSSPANNUNG:
			setVersorgungsspannung((spannungsarttype) newValue);
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
		case ModelPackage.ANLAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__ANLAGENART:
			setAnlagenart(ANLAGENART_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			setAnlagennummer(ANLAGENNUMMER_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			setObjektteil(OBJEKTTEIL_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__ANLAGEN_ID:
			setAnlagenId(ANLAGEN_ID_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__TRAFO_KVA:
			setTrafoKva(TRAFO_KVA_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__TRAFOSPANNUNG:
			setTrafospannung(TRAFOSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
			return;
		case ModelPackage.ANLAGE__VERSORGT_VON:
			setVersorgtVon((Verbindung) null);
			return;
		case ModelPackage.ANLAGE__VERSORGUNGSSPANNUNG:
			setVersorgungsspannung(VERSORGUNGSSPANNUNG_EDEFAULT);
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
		case ModelPackage.ANLAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.ANLAGE__ANLAGENART:
			return anlagenart != ANLAGENART_EDEFAULT;
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			return ANLAGENNUMMER_EDEFAULT == null ? anlagennummer != null
					: !ANLAGENNUMMER_EDEFAULT.equals(anlagennummer);
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			return OBJEKTTEIL_EDEFAULT == null ? objektteil != null : !OBJEKTTEIL_EDEFAULT.equals(objektteil);
		case ModelPackage.ANLAGE__ANLAGEN_ID:
			return ANLAGEN_ID_EDEFAULT == null ? anlagenId != null : !ANLAGEN_ID_EDEFAULT.equals(anlagenId);
		case ModelPackage.ANLAGE__TRAFO_KVA:
			return trafoKva != TRAFO_KVA_EDEFAULT;
		case ModelPackage.ANLAGE__TRAFOSPANNUNG:
			return trafospannung != TRAFOSPANNUNG_EDEFAULT;
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			return verbindungNach != null && !verbindungNach.isEmpty();
		case ModelPackage.ANLAGE__VERSORGT_VON:
			return versorgtVon != null;
		case ModelPackage.ANLAGE__VERSORGUNGSSPANNUNG:
			return versorgungsspannung != VERSORGUNGSSPANNUNG_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", anlagenart: ");
		result.append(anlagenart);
		result.append(", anlagennummer: ");
		result.append(anlagennummer);
		result.append(", objektteil: ");
		result.append(objektteil);
		result.append(", anlagenId: ");
		result.append(anlagenId);
		result.append(", trafoKva: ");
		result.append(trafoKva);
		result.append(", trafospannung: ");
		result.append(trafospannung);
		result.append(", versorgungsspannung: ");
		result.append(versorgungsspannung);
		result.append(')');
		return result.toString();
	}

} //AnlageImpl

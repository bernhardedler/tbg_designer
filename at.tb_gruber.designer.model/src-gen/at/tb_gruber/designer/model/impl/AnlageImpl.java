/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.eadb_versorgung_art;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getObjektteil <em>Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getEadbId <em>Eadb Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVerbindungNach <em>Verbindung Nach</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVersorgtVon <em>Versorgt Von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getInObjektteil <em>In Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getReserve4 <em>Reserve4</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAnlagenIdImmoAssi <em>Anlagen Id Immo Assi</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getAbgangVT <em>Abgang VT</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageImpl#getBetreiber <em>Betreiber</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnlageImpl extends MinimalEObjectImpl.Container implements Anlage {
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
	 * The default value of the '{@link #getEadbId() <em>Eadb Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbId()
	 * @generated
	 * @ordered
	 */
	protected static final String EADB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEadbId() <em>Eadb Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbId()
	 * @generated
	 * @ordered
	 */
	protected String eadbId = EADB_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getVersorgtVon() <em>Versorgt Von</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgtVon()
	 * @generated
	 * @ordered
	 */
	protected EList<Verbindung> versorgtVon;

	/**
	 * The default value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype PRIMAERSPANNUNG_EDEFAULT = spannungsarttype.HSP_UN_AB_1K_V50_HZ;

	/**
	 * The cached value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected spannungsarttype primaerspannung = PRIMAERSPANNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getInObjektteil() <em>In Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInObjektteil()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_OBJEKTTEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInObjektteil() <em>In Objektteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInObjektteil()
	 * @generated
	 * @ordered
	 */
	protected String inObjektteil = IN_OBJEKTTEIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserve4() <em>Reserve4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve4()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve4() <em>Reserve4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve4()
	 * @generated
	 * @ordered
	 */
	protected String reserve4 = RESERVE4_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnlagenIdImmoAssi() <em>Anlagen Id Immo Assi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenIdImmoAssi()
	 * @generated
	 * @ordered
	 */
	protected static final String ANLAGEN_ID_IMMO_ASSI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnlagenIdImmoAssi() <em>Anlagen Id Immo Assi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlagenIdImmoAssi()
	 * @generated
	 * @ordered
	 */
	protected String anlagenIdImmoAssi = ANLAGEN_ID_IMMO_ASSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getEadbVersorgungArt() <em>Eadb Versorgung Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbVersorgungArt()
	 * @generated
	 * @ordered
	 */
	protected static final eadb_versorgung_art EADB_VERSORGUNG_ART_EDEFAULT = eadb_versorgung_art.ÜGS;

	/**
	 * The cached value of the '{@link #getEadbVersorgungArt() <em>Eadb Versorgung Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbVersorgungArt()
	 * @generated
	 * @ordered
	 */
	protected eadb_versorgung_art eadbVersorgungArt = EADB_VERSORGUNG_ART_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerteilerbezeichnung() <em>Verteilerbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteilerbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTEILERBEZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerteilerbezeichnung() <em>Verteilerbezeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteilerbezeichnung()
	 * @generated
	 * @ordered
	 */
	protected String verteilerbezeichnung = VERTEILERBEZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbgangVT() <em>Abgang VT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbgangVT()
	 * @generated
	 * @ordered
	 */
	protected static final String ABGANG_VT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbgangVT() <em>Abgang VT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbgangVT()
	 * @generated
	 * @ordered
	 */
	protected String abgangVT = ABGANG_VT_EDEFAULT;

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
	public String getEadbId() {
		return eadbId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEadbId(String newEadbId) {
		String oldEadbId = eadbId;
		eadbId = newEadbId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__EADB_ID, oldEadbId, eadbId));
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
	public EList<Verbindung> getVersorgtVon() {
		if (versorgtVon == null) {
			versorgtVon = new EObjectResolvingEList<Verbindung>(Verbindung.class, this,
					ModelPackage.ANLAGE__VERSORGT_VON);
		}
		return versorgtVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public spannungsarttype getPrimaerspannung() {
		return primaerspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaerspannung(spannungsarttype newPrimaerspannung) {
		spannungsarttype oldPrimaerspannung = primaerspannung;
		primaerspannung = newPrimaerspannung == null ? PRIMAERSPANNUNG_EDEFAULT : newPrimaerspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__PRIMAERSPANNUNG,
					oldPrimaerspannung, primaerspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInObjektteil() {
		return inObjektteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInObjektteil(String newInObjektteil) {
		String oldInObjektteil = inObjektteil;
		inObjektteil = newInObjektteil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__IN_OBJEKTTEIL, oldInObjektteil,
					inObjektteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve4() {
		return reserve4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve4(String newReserve4) {
		String oldReserve4 = reserve4;
		reserve4 = newReserve4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__RESERVE4, oldReserve4,
					reserve4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnlagenIdImmoAssi() {
		return anlagenIdImmoAssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnlagenIdImmoAssi(String newAnlagenIdImmoAssi) {
		String oldAnlagenIdImmoAssi = anlagenIdImmoAssi;
		anlagenIdImmoAssi = newAnlagenIdImmoAssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__ANLAGEN_ID_IMMO_ASSI,
					oldAnlagenIdImmoAssi, anlagenIdImmoAssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eadb_versorgung_art getEadbVersorgungArt() {
		return eadbVersorgungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEadbVersorgungArt(eadb_versorgung_art newEadbVersorgungArt) {
		eadb_versorgung_art oldEadbVersorgungArt = eadbVersorgungArt;
		eadbVersorgungArt = newEadbVersorgungArt == null ? EADB_VERSORGUNG_ART_EDEFAULT : newEadbVersorgungArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__EADB_VERSORGUNG_ART,
					oldEadbVersorgungArt, eadbVersorgungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerteilerbezeichnung() {
		return verteilerbezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerteilerbezeichnung(String newVerteilerbezeichnung) {
		String oldVerteilerbezeichnung = verteilerbezeichnung;
		verteilerbezeichnung = newVerteilerbezeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__VERTEILERBEZEICHNUNG,
					oldVerteilerbezeichnung, verteilerbezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbgangVT() {
		return abgangVT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbgangVT(String newAbgangVT) {
		String oldAbgangVT = abgangVT;
		abgangVT = newAbgangVT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__ABGANG_VT, oldAbgangVT,
					abgangVT));
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
					ModelPackage.ANLAGE__BETREIBER, oldBetreiber, newBetreiber);
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
						EOPPOSITE_FEATURE_BASE - ModelPackage.ANLAGE__BETREIBER, null, msgs);
			if (newBetreiber != null)
				msgs = ((InternalEObject) newBetreiber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ANLAGE__BETREIBER, null, msgs);
			msgs = basicSetBetreiber(newBetreiber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE__BETREIBER, newBetreiber,
					newBetreiber));
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
		case ModelPackage.ANLAGE__BETREIBER:
			return basicSetBetreiber(null, msgs);
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
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			return getAnlagennummer();
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			return getObjektteil();
		case ModelPackage.ANLAGE__EADB_ID:
			return getEadbId();
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			return getVerbindungNach();
		case ModelPackage.ANLAGE__VERSORGT_VON:
			return getVersorgtVon();
		case ModelPackage.ANLAGE__PRIMAERSPANNUNG:
			return getPrimaerspannung();
		case ModelPackage.ANLAGE__IN_OBJEKTTEIL:
			return getInObjektteil();
		case ModelPackage.ANLAGE__RESERVE4:
			return getReserve4();
		case ModelPackage.ANLAGE__ANLAGEN_ID_IMMO_ASSI:
			return getAnlagenIdImmoAssi();
		case ModelPackage.ANLAGE__EADB_VERSORGUNG_ART:
			return getEadbVersorgungArt();
		case ModelPackage.ANLAGE__VERTEILERBEZEICHNUNG:
			return getVerteilerbezeichnung();
		case ModelPackage.ANLAGE__ABGANG_VT:
			return getAbgangVT();
		case ModelPackage.ANLAGE__BETREIBER:
			return getBetreiber();
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
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			setAnlagennummer((String) newValue);
			return;
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			setObjektteil((String) newValue);
			return;
		case ModelPackage.ANLAGE__EADB_ID:
			setEadbId((String) newValue);
			return;
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
			getVerbindungNach().addAll((Collection<? extends Verbindung>) newValue);
			return;
		case ModelPackage.ANLAGE__VERSORGT_VON:
			getVersorgtVon().clear();
			getVersorgtVon().addAll((Collection<? extends Verbindung>) newValue);
			return;
		case ModelPackage.ANLAGE__PRIMAERSPANNUNG:
			setPrimaerspannung((spannungsarttype) newValue);
			return;
		case ModelPackage.ANLAGE__IN_OBJEKTTEIL:
			setInObjektteil((String) newValue);
			return;
		case ModelPackage.ANLAGE__RESERVE4:
			setReserve4((String) newValue);
			return;
		case ModelPackage.ANLAGE__ANLAGEN_ID_IMMO_ASSI:
			setAnlagenIdImmoAssi((String) newValue);
			return;
		case ModelPackage.ANLAGE__EADB_VERSORGUNG_ART:
			setEadbVersorgungArt((eadb_versorgung_art) newValue);
			return;
		case ModelPackage.ANLAGE__VERTEILERBEZEICHNUNG:
			setVerteilerbezeichnung((String) newValue);
			return;
		case ModelPackage.ANLAGE__ABGANG_VT:
			setAbgangVT((String) newValue);
			return;
		case ModelPackage.ANLAGE__BETREIBER:
			setBetreiber((Betreiber) newValue);
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
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			setAnlagennummer(ANLAGENNUMMER_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			setObjektteil(OBJEKTTEIL_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__EADB_ID:
			setEadbId(EADB_ID_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			getVerbindungNach().clear();
			return;
		case ModelPackage.ANLAGE__VERSORGT_VON:
			getVersorgtVon().clear();
			return;
		case ModelPackage.ANLAGE__PRIMAERSPANNUNG:
			setPrimaerspannung(PRIMAERSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__IN_OBJEKTTEIL:
			setInObjektteil(IN_OBJEKTTEIL_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__RESERVE4:
			setReserve4(RESERVE4_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__ANLAGEN_ID_IMMO_ASSI:
			setAnlagenIdImmoAssi(ANLAGEN_ID_IMMO_ASSI_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__EADB_VERSORGUNG_ART:
			setEadbVersorgungArt(EADB_VERSORGUNG_ART_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__VERTEILERBEZEICHNUNG:
			setVerteilerbezeichnung(VERTEILERBEZEICHNUNG_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__ABGANG_VT:
			setAbgangVT(ABGANG_VT_EDEFAULT);
			return;
		case ModelPackage.ANLAGE__BETREIBER:
			setBetreiber((Betreiber) null);
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
		case ModelPackage.ANLAGE__ANLAGENNUMMER:
			return ANLAGENNUMMER_EDEFAULT == null ? anlagennummer != null
					: !ANLAGENNUMMER_EDEFAULT.equals(anlagennummer);
		case ModelPackage.ANLAGE__OBJEKTTEIL:
			return OBJEKTTEIL_EDEFAULT == null ? objektteil != null : !OBJEKTTEIL_EDEFAULT.equals(objektteil);
		case ModelPackage.ANLAGE__EADB_ID:
			return EADB_ID_EDEFAULT == null ? eadbId != null : !EADB_ID_EDEFAULT.equals(eadbId);
		case ModelPackage.ANLAGE__VERBINDUNG_NACH:
			return verbindungNach != null && !verbindungNach.isEmpty();
		case ModelPackage.ANLAGE__VERSORGT_VON:
			return versorgtVon != null && !versorgtVon.isEmpty();
		case ModelPackage.ANLAGE__PRIMAERSPANNUNG:
			return primaerspannung != PRIMAERSPANNUNG_EDEFAULT;
		case ModelPackage.ANLAGE__IN_OBJEKTTEIL:
			return IN_OBJEKTTEIL_EDEFAULT == null ? inObjektteil != null : !IN_OBJEKTTEIL_EDEFAULT.equals(inObjektteil);
		case ModelPackage.ANLAGE__RESERVE4:
			return RESERVE4_EDEFAULT == null ? reserve4 != null : !RESERVE4_EDEFAULT.equals(reserve4);
		case ModelPackage.ANLAGE__ANLAGEN_ID_IMMO_ASSI:
			return ANLAGEN_ID_IMMO_ASSI_EDEFAULT == null ? anlagenIdImmoAssi != null
					: !ANLAGEN_ID_IMMO_ASSI_EDEFAULT.equals(anlagenIdImmoAssi);
		case ModelPackage.ANLAGE__EADB_VERSORGUNG_ART:
			return eadbVersorgungArt != EADB_VERSORGUNG_ART_EDEFAULT;
		case ModelPackage.ANLAGE__VERTEILERBEZEICHNUNG:
			return VERTEILERBEZEICHNUNG_EDEFAULT == null ? verteilerbezeichnung != null
					: !VERTEILERBEZEICHNUNG_EDEFAULT.equals(verteilerbezeichnung);
		case ModelPackage.ANLAGE__ABGANG_VT:
			return ABGANG_VT_EDEFAULT == null ? abgangVT != null : !ABGANG_VT_EDEFAULT.equals(abgangVT);
		case ModelPackage.ANLAGE__BETREIBER:
			return betreiber != null;
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
		result.append(", anlagennummer: ");
		result.append(anlagennummer);
		result.append(", objektteil: ");
		result.append(objektteil);
		result.append(", eadbId: ");
		result.append(eadbId);
		result.append(", primaerspannung: ");
		result.append(primaerspannung);
		result.append(", inObjektteil: ");
		result.append(inObjektteil);
		result.append(", reserve4: ");
		result.append(reserve4);
		result.append(", anlagenIdImmoAssi: ");
		result.append(anlagenIdImmoAssi);
		result.append(", eadbVersorgungArt: ");
		result.append(eadbVersorgungArt);
		result.append(", verteilerbezeichnung: ");
		result.append(verteilerbezeichnung);
		result.append(", abgangVT: ");
		result.append(abgangVT);
		result.append(')');
		return result.toString();
	}

} //AnlageImpl

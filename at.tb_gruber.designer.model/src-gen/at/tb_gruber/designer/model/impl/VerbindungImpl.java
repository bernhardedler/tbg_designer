/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ARGUSrelevant;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.Verbindung;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getQuellSicherung <em>Quell Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZielSicherung <em>Ziel Sicherung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getKabeltype <em>Kabeltype</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getArgusrelevant <em>Argusrelevant</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getLinientype <em>Linientype</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getKabellaenge <em>Kabellaenge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerbindungImpl extends MinimalEObjectImpl.Container implements Verbindung {
	/**
	 * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected int nr = NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected static final Spannungsarttype PRIMAERSPANNUNG_EDEFAULT = Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC;

	/**
	 * The cached value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected Spannungsarttype primaerspannung = PRIMAERSPANNUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZiel() <em>Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZiel()
	 * @generated
	 * @ordered
	 */
	protected AnlageBase ziel;

	/**
	 * The cached value of the '{@link #getUrsprung() <em>Ursprung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrsprung()
	 * @generated
	 * @ordered
	 */
	protected AnlageBase ursprung;

	/**
	 * The default value of the '{@link #getQuellSicherung() <em>Quell Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellSicherung()
	 * @generated
	 * @ordered
	 */
	protected static final String QUELL_SICHERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuellSicherung() <em>Quell Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellSicherung()
	 * @generated
	 * @ordered
	 */
	protected String quellSicherung = QUELL_SICHERUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getZielSicherung() <em>Ziel Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielSicherung()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIEL_SICHERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZielSicherung() <em>Ziel Sicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielSicherung()
	 * @generated
	 * @ordered
	 */
	protected String zielSicherung = ZIEL_SICHERUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getKabeltype() <em>Kabeltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabeltype()
	 * @generated
	 * @ordered
	 */
	protected static final String KABELTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKabeltype() <em>Kabeltype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabeltype()
	 * @generated
	 * @ordered
	 */
	protected String kabeltype = KABELTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgusrelevant() <em>Argusrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgusrelevant()
	 * @generated
	 * @ordered
	 */
	protected static final ARGUSrelevant ARGUSRELEVANT_EDEFAULT = ARGUSrelevant.Y;

	/**
	 * The cached value of the '{@link #getArgusrelevant() <em>Argusrelevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgusrelevant()
	 * @generated
	 * @ordered
	 */
	protected ARGUSrelevant argusrelevant = ARGUSRELEVANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinientype() <em>Linientype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinientype()
	 * @generated
	 * @ordered
	 */
	protected static final LinienType LINIENTYPE_EDEFAULT = LinienType.HAUPTVERSORGUNG;

	/**
	 * The cached value of the '{@link #getLinientype() <em>Linientype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinientype()
	 * @generated
	 * @ordered
	 */
	protected LinienType linientype = LINIENTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKabellaenge() <em>Kabellaenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabellaenge()
	 * @generated
	 * @ordered
	 */
	protected static final String KABELLAENGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKabellaenge() <em>Kabellaenge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabellaenge()
	 * @generated
	 * @ordered
	 */
	protected String kabellaenge = KABELLAENGE_EDEFAULT;

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
	public int getNr() {
		return nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNr(int newNr) {
		int oldNr = nr;
		nr = newNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__NR, oldNr, nr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannungsarttype getPrimaerspannung() {
		return primaerspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaerspannung(Spannungsarttype newPrimaerspannung) {
		Spannungsarttype oldPrimaerspannung = primaerspannung;
		primaerspannung = newPrimaerspannung == null ? PRIMAERSPANNUNG_EDEFAULT : newPrimaerspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__PRIMAERSPANNUNG,
					oldPrimaerspannung, primaerspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnlageBase getZiel() {
		if (ziel != null && ziel.eIsProxy()) {
			InternalEObject oldZiel = (InternalEObject) ziel;
			ziel = (AnlageBase) eResolveProxy(oldZiel);
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
	public AnlageBase basicGetZiel() {
		return ziel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZiel(AnlageBase newZiel) {
		AnlageBase oldZiel = ziel;
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
	public AnlageBase getUrsprung() {
		if (ursprung != null && ursprung.eIsProxy()) {
			InternalEObject oldUrsprung = (InternalEObject) ursprung;
			ursprung = (AnlageBase) eResolveProxy(oldUrsprung);
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
	public AnlageBase basicGetUrsprung() {
		return ursprung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrsprung(AnlageBase newUrsprung) {
		AnlageBase oldUrsprung = ursprung;
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
	public String getQuellSicherung() {
		return quellSicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuellSicherung(String newQuellSicherung) {
		String oldQuellSicherung = quellSicherung;
		quellSicherung = newQuellSicherung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__QUELL_SICHERUNG,
					oldQuellSicherung, quellSicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZielSicherung() {
		return zielSicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZielSicherung(String newZielSicherung) {
		String oldZielSicherung = zielSicherung;
		zielSicherung = newZielSicherung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__ZIEL_SICHERUNG,
					oldZielSicherung, zielSicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKabeltype() {
		return kabeltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKabeltype(String newKabeltype) {
		String oldKabeltype = kabeltype;
		kabeltype = newKabeltype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__KABELTYPE, oldKabeltype,
					kabeltype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ARGUSrelevant getArgusrelevant() {
		return argusrelevant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgusrelevant(ARGUSrelevant newArgusrelevant) {
		ARGUSrelevant oldArgusrelevant = argusrelevant;
		argusrelevant = newArgusrelevant == null ? ARGUSRELEVANT_EDEFAULT : newArgusrelevant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__ARGUSRELEVANT,
					oldArgusrelevant, argusrelevant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinienType getLinientype() {
		return linientype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinientype(LinienType newLinientype) {
		LinienType oldLinientype = linientype;
		linientype = newLinientype == null ? LINIENTYPE_EDEFAULT : newLinientype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__LINIENTYPE, oldLinientype,
					linientype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKabellaenge() {
		return kabellaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKabellaenge(String newKabellaenge) {
		String oldKabellaenge = kabellaenge;
		kabellaenge = newKabellaenge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__KABELLAENGE, oldKabellaenge,
					kabellaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.VERBINDUNG__NR:
			return getNr();
		case ModelPackage.VERBINDUNG__PRIMAERSPANNUNG:
			return getPrimaerspannung();
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
		case ModelPackage.VERBINDUNG__KABELTYPE:
			return getKabeltype();
		case ModelPackage.VERBINDUNG__ARGUSRELEVANT:
			return getArgusrelevant();
		case ModelPackage.VERBINDUNG__LINIENTYPE:
			return getLinientype();
		case ModelPackage.VERBINDUNG__KABELLAENGE:
			return getKabellaenge();
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
		case ModelPackage.VERBINDUNG__NR:
			setNr((Integer) newValue);
			return;
		case ModelPackage.VERBINDUNG__PRIMAERSPANNUNG:
			setPrimaerspannung((Spannungsarttype) newValue);
			return;
		case ModelPackage.VERBINDUNG__ZIEL:
			setZiel((AnlageBase) newValue);
			return;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			setUrsprung((AnlageBase) newValue);
			return;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			setQuellSicherung((String) newValue);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			setZielSicherung((String) newValue);
			return;
		case ModelPackage.VERBINDUNG__KABELTYPE:
			setKabeltype((String) newValue);
			return;
		case ModelPackage.VERBINDUNG__ARGUSRELEVANT:
			setArgusrelevant((ARGUSrelevant) newValue);
			return;
		case ModelPackage.VERBINDUNG__LINIENTYPE:
			setLinientype((LinienType) newValue);
			return;
		case ModelPackage.VERBINDUNG__KABELLAENGE:
			setKabellaenge((String) newValue);
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
		case ModelPackage.VERBINDUNG__NR:
			setNr(NR_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__PRIMAERSPANNUNG:
			setPrimaerspannung(PRIMAERSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__ZIEL:
			setZiel((AnlageBase) null);
			return;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			setUrsprung((AnlageBase) null);
			return;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			setQuellSicherung(QUELL_SICHERUNG_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			setZielSicherung(ZIEL_SICHERUNG_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__KABELTYPE:
			setKabeltype(KABELTYPE_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__ARGUSRELEVANT:
			setArgusrelevant(ARGUSRELEVANT_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__LINIENTYPE:
			setLinientype(LINIENTYPE_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__KABELLAENGE:
			setKabellaenge(KABELLAENGE_EDEFAULT);
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
		case ModelPackage.VERBINDUNG__NR:
			return nr != NR_EDEFAULT;
		case ModelPackage.VERBINDUNG__PRIMAERSPANNUNG:
			return primaerspannung != PRIMAERSPANNUNG_EDEFAULT;
		case ModelPackage.VERBINDUNG__ZIEL:
			return ziel != null;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			return ursprung != null;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNG:
			return QUELL_SICHERUNG_EDEFAULT == null ? quellSicherung != null
					: !QUELL_SICHERUNG_EDEFAULT.equals(quellSicherung);
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNG:
			return ZIEL_SICHERUNG_EDEFAULT == null ? zielSicherung != null
					: !ZIEL_SICHERUNG_EDEFAULT.equals(zielSicherung);
		case ModelPackage.VERBINDUNG__KABELTYPE:
			return KABELTYPE_EDEFAULT == null ? kabeltype != null : !KABELTYPE_EDEFAULT.equals(kabeltype);
		case ModelPackage.VERBINDUNG__ARGUSRELEVANT:
			return argusrelevant != ARGUSRELEVANT_EDEFAULT;
		case ModelPackage.VERBINDUNG__LINIENTYPE:
			return linientype != LINIENTYPE_EDEFAULT;
		case ModelPackage.VERBINDUNG__KABELLAENGE:
			return KABELLAENGE_EDEFAULT == null ? kabellaenge != null : !KABELLAENGE_EDEFAULT.equals(kabellaenge);
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
		result.append(" (nr: ");
		result.append(nr);
		result.append(", primaerspannung: ");
		result.append(primaerspannung);
		result.append(", quellSicherung: ");
		result.append(quellSicherung);
		result.append(", zielSicherung: ");
		result.append(zielSicherung);
		result.append(", kabeltype: ");
		result.append(kabeltype);
		result.append(", argusrelevant: ");
		result.append(argusrelevant);
		result.append(", linientype: ");
		result.append(linientype);
		result.append(", kabellaenge: ");
		result.append(kabellaenge);
		result.append(')');
		return result.toString();
	}

} //VerbindungImpl

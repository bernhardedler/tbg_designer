/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.spannungsarttype;
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
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getVersorgungsspannung <em>Versorgungsspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getKabeltyp <em>Kabeltyp</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZiel <em>Ziel</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getUrsprung <em>Ursprung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getQuellSicherungsGroesse <em>Quell Sicherungs Groesse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerbindungImpl#getZielSicherungsGroesse <em>Ziel Sicherungs Groesse</em>}</li>
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
	 * The default value of the '{@link #getVersorgungsspannung() <em>Versorgungsspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersorgungsspannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype VERSORGUNGSSPANNUNG_EDEFAULT = spannungsarttype.RESERVE_VIOLETT;

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
	 * The default value of the '{@link #getQuellSicherungsGroesse() <em>Quell Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellSicherungsGroesse()
	 * @generated
	 * @ordered
	 */
	protected static final String QUELL_SICHERUNGS_GROESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuellSicherungsGroesse() <em>Quell Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuellSicherungsGroesse()
	 * @generated
	 * @ordered
	 */
	protected String quellSicherungsGroesse = QUELL_SICHERUNGS_GROESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZielSicherungsGroesse() <em>Ziel Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielSicherungsGroesse()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIEL_SICHERUNGS_GROESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZielSicherungsGroesse() <em>Ziel Sicherungs Groesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielSicherungsGroesse()
	 * @generated
	 * @ordered
	 */
	protected String zielSicherungsGroesse = ZIEL_SICHERUNGS_GROESSE_EDEFAULT;

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
	public String getQuellSicherungsGroesse() {
		return quellSicherungsGroesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuellSicherungsGroesse(String newQuellSicherungsGroesse) {
		String oldQuellSicherungsGroesse = quellSicherungsGroesse;
		quellSicherungsGroesse = newQuellSicherungsGroesse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE,
					oldQuellSicherungsGroesse, quellSicherungsGroesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZielSicherungsGroesse() {
		return zielSicherungsGroesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZielSicherungsGroesse(String newZielSicherungsGroesse) {
		String oldZielSicherungsGroesse = zielSicherungsGroesse;
		zielSicherungsGroesse = newZielSicherungsGroesse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE,
					oldZielSicherungsGroesse, zielSicherungsGroesse));
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
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE:
			return getQuellSicherungsGroesse();
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE:
			return getZielSicherungsGroesse();
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
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE:
			setQuellSicherungsGroesse((String) newValue);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE:
			setZielSicherungsGroesse((String) newValue);
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
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE:
			setQuellSicherungsGroesse(QUELL_SICHERUNGS_GROESSE_EDEFAULT);
			return;
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE:
			setZielSicherungsGroesse(ZIEL_SICHERUNGS_GROESSE_EDEFAULT);
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
		case ModelPackage.VERBINDUNG__VERSORGUNGSSPANNUNG:
			return versorgungsspannung != VERSORGUNGSSPANNUNG_EDEFAULT;
		case ModelPackage.VERBINDUNG__KABELTYP:
			return KABELTYP_EDEFAULT == null ? kabeltyp != null : !KABELTYP_EDEFAULT.equals(kabeltyp);
		case ModelPackage.VERBINDUNG__ZIEL:
			return ziel != null;
		case ModelPackage.VERBINDUNG__URSPRUNG:
			return ursprung != null;
		case ModelPackage.VERBINDUNG__QUELL_SICHERUNGS_GROESSE:
			return QUELL_SICHERUNGS_GROESSE_EDEFAULT == null ? quellSicherungsGroesse != null
					: !QUELL_SICHERUNGS_GROESSE_EDEFAULT.equals(quellSicherungsGroesse);
		case ModelPackage.VERBINDUNG__ZIEL_SICHERUNGS_GROESSE:
			return ZIEL_SICHERUNGS_GROESSE_EDEFAULT == null ? zielSicherungsGroesse != null
					: !ZIEL_SICHERUNGS_GROESSE_EDEFAULT.equals(zielSicherungsGroesse);
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
		result.append(", versorgungsspannung: ");
		result.append(versorgungsspannung);
		result.append(", kabeltyp: ");
		result.append(kabeltyp);
		result.append(", quellSicherungsGroesse: ");
		result.append(quellSicherungsGroesse);
		result.append(", zielSicherungsGroesse: ");
		result.append(zielSicherungsGroesse);
		result.append(')');
		return result.toString();
	}

} //VerbindungImpl

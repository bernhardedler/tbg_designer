/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Eadb_Versorgung_Art;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Spannungsarttype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anlage Mit Attributen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getAnlagennummer <em>Anlagennummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getEadbId <em>Eadb Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getPrimaerspannung <em>Primaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getInObjektteil <em>In Objektteil</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getEadbVersorgungArt <em>Eadb Versorgung Art</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getVerteilerbezeichnung <em>Verteilerbezeichnung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getAbgangVT <em>Abgang VT</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getReserve1 <em>Reserve1</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.AnlageMitAttributenImpl#getReserve2 <em>Reserve2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnlageMitAttributenImpl extends AnlageBaseImpl implements AnlageMitAttributen {
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
	 * The default value of the '{@link #getEadbVersorgungArt() <em>Eadb Versorgung Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbVersorgungArt()
	 * @generated
	 * @ordered
	 */
	protected static final Eadb_Versorgung_Art EADB_VERSORGUNG_ART_EDEFAULT = Eadb_Versorgung_Art.ÜGS;

	/**
	 * The cached value of the '{@link #getEadbVersorgungArt() <em>Eadb Versorgung Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEadbVersorgungArt()
	 * @generated
	 * @ordered
	 */
	protected Eadb_Versorgung_Art eadbVersorgungArt = EADB_VERSORGUNG_ART_EDEFAULT;

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
	 * The default value of the '{@link #getReserve1() <em>Reserve1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve1() <em>Reserve1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve1()
	 * @generated
	 * @ordered
	 */
	protected String reserve1 = RESERVE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserve2() <em>Reserve2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve2() <em>Reserve2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2()
	 * @generated
	 * @ordered
	 */
	protected String reserve2 = RESERVE2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnlageMitAttributenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ANLAGE_MIT_ATTRIBUTEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER,
					oldAnlagennummer, anlagennummer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID,
					oldEadbId, eadbId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL,
					oldInObjektteil, inObjektteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eadb_Versorgung_Art getEadbVersorgungArt() {
		return eadbVersorgungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEadbVersorgungArt(Eadb_Versorgung_Art newEadbVersorgungArt) {
		Eadb_Versorgung_Art oldEadbVersorgungArt = eadbVersorgungArt;
		eadbVersorgungArt = newEadbVersorgungArt == null ? EADB_VERSORGUNG_ART_EDEFAULT : newEadbVersorgungArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART, oldEadbVersorgungArt, eadbVersorgungArt));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG, oldVerteilerbezeichnung,
					verteilerbezeichnung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT,
					oldAbgangVT, abgangVT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve1(String newReserve1) {
		String oldReserve1 = reserve1;
		reserve1 = newReserve1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1,
					oldReserve1, reserve1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve2(String newReserve2) {
		String oldReserve2 = reserve2;
		reserve2 = newReserve2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2,
					oldReserve2, reserve2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME:
			return getName();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER:
			return getAnlagennummer();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID:
			return getEadbId();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG:
			return getPrimaerspannung();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL:
			return getInObjektteil();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART:
			return getEadbVersorgungArt();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG:
			return getVerteilerbezeichnung();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT:
			return getAbgangVT();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1:
			return getReserve1();
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2:
			return getReserve2();
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
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER:
			setAnlagennummer((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID:
			setEadbId((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG:
			setPrimaerspannung((Spannungsarttype) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL:
			setInObjektteil((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART:
			setEadbVersorgungArt((Eadb_Versorgung_Art) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG:
			setVerteilerbezeichnung((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT:
			setAbgangVT((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1:
			setReserve1((String) newValue);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2:
			setReserve2((String) newValue);
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
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER:
			setAnlagennummer(ANLAGENNUMMER_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID:
			setEadbId(EADB_ID_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG:
			setPrimaerspannung(PRIMAERSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL:
			setInObjektteil(IN_OBJEKTTEIL_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART:
			setEadbVersorgungArt(EADB_VERSORGUNG_ART_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG:
			setVerteilerbezeichnung(VERTEILERBEZEICHNUNG_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT:
			setAbgangVT(ABGANG_VT_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1:
			setReserve1(RESERVE1_EDEFAULT);
			return;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2:
			setReserve2(RESERVE2_EDEFAULT);
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
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ANLAGENNUMMER:
			return ANLAGENNUMMER_EDEFAULT == null ? anlagennummer != null
					: !ANLAGENNUMMER_EDEFAULT.equals(anlagennummer);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_ID:
			return EADB_ID_EDEFAULT == null ? eadbId != null : !EADB_ID_EDEFAULT.equals(eadbId);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__PRIMAERSPANNUNG:
			return primaerspannung != PRIMAERSPANNUNG_EDEFAULT;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__IN_OBJEKTTEIL:
			return IN_OBJEKTTEIL_EDEFAULT == null ? inObjektteil != null : !IN_OBJEKTTEIL_EDEFAULT.equals(inObjektteil);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__EADB_VERSORGUNG_ART:
			return eadbVersorgungArt != EADB_VERSORGUNG_ART_EDEFAULT;
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__VERTEILERBEZEICHNUNG:
			return VERTEILERBEZEICHNUNG_EDEFAULT == null ? verteilerbezeichnung != null
					: !VERTEILERBEZEICHNUNG_EDEFAULT.equals(verteilerbezeichnung);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__ABGANG_VT:
			return ABGANG_VT_EDEFAULT == null ? abgangVT != null : !ABGANG_VT_EDEFAULT.equals(abgangVT);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE1:
			return RESERVE1_EDEFAULT == null ? reserve1 != null : !RESERVE1_EDEFAULT.equals(reserve1);
		case ModelPackage.ANLAGE_MIT_ATTRIBUTEN__RESERVE2:
			return RESERVE2_EDEFAULT == null ? reserve2 != null : !RESERVE2_EDEFAULT.equals(reserve2);
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
		result.append(", eadbId: ");
		result.append(eadbId);
		result.append(", primaerspannung: ");
		result.append(primaerspannung);
		result.append(", inObjektteil: ");
		result.append(inObjektteil);
		result.append(", eadbVersorgungArt: ");
		result.append(eadbVersorgungArt);
		result.append(", verteilerbezeichnung: ");
		result.append(verteilerbezeichnung);
		result.append(", abgangVT: ");
		result.append(abgangVT);
		result.append(", reserve1: ");
		result.append(reserve1);
		result.append(", reserve2: ");
		result.append(reserve2);
		result.append(')');
		return result.toString();
	}

} //AnlageMitAttributenImpl

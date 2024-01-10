/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.VerteilerMitZaehler;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verteiler Mit Zaehler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl#getNrReserveEinspeisung <em>Nr Reserve Einspeisung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl#getNrHauptversorgung <em>Nr Hauptversorgung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerMitZaehlerImpl#isFernablesung <em>Fernablesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerteilerMitZaehlerImpl extends VerteilerBaseImpl implements VerteilerMitZaehler {
	/**
	 * The default value of the '{@link #getNrReserveEinspeisung() <em>Nr Reserve Einspeisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrReserveEinspeisung()
	 * @generated
	 * @ordered
	 */
	protected static final String NR_RESERVE_EINSPEISUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNrReserveEinspeisung() <em>Nr Reserve Einspeisung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrReserveEinspeisung()
	 * @generated
	 * @ordered
	 */
	protected String nrReserveEinspeisung = NR_RESERVE_EINSPEISUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrHauptversorgung() <em>Nr Hauptversorgung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrHauptversorgung()
	 * @generated
	 * @ordered
	 */
	protected static final String NR_HAUPTVERSORGUNG_EDEFAULT = "ZP-NR.: ";

	/**
	 * The cached value of the '{@link #getNrHauptversorgung() <em>Nr Hauptversorgung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrHauptversorgung()
	 * @generated
	 * @ordered
	 */
	protected String nrHauptversorgung = NR_HAUPTVERSORGUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isFernablesung() <em>Fernablesung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFernablesung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FERNABLESUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFernablesung() <em>Fernablesung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFernablesung()
	 * @generated
	 * @ordered
	 */
	protected boolean fernablesung = FERNABLESUNG_EDEFAULT;

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
	public String getNrReserveEinspeisung() {
		return nrReserveEinspeisung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNrReserveEinspeisung(String newNrReserveEinspeisung) {
		String oldNrReserveEinspeisung = nrReserveEinspeisung;
		nrReserveEinspeisung = newNrReserveEinspeisung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG, oldNrReserveEinspeisung,
					nrReserveEinspeisung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNrHauptversorgung() {
		return nrHauptversorgung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNrHauptversorgung(String newNrHauptversorgung) {
		String oldNrHauptversorgung = nrHauptversorgung;
		nrHauptversorgung = newNrHauptversorgung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG, oldNrHauptversorgung, nrHauptversorgung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFernablesung() {
		return fernablesung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFernablesung(boolean newFernablesung) {
		boolean oldFernablesung = fernablesung;
		fernablesung = newFernablesung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER_MIT_ZAEHLER__FERNABLESUNG,
					oldFernablesung, fernablesung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG:
			return getNrReserveEinspeisung();
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG:
			return getNrHauptversorgung();
		case ModelPackage.VERTEILER_MIT_ZAEHLER__FERNABLESUNG:
			return isFernablesung();
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG:
			setNrReserveEinspeisung((String) newValue);
			return;
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG:
			setNrHauptversorgung((String) newValue);
			return;
		case ModelPackage.VERTEILER_MIT_ZAEHLER__FERNABLESUNG:
			setFernablesung((Boolean) newValue);
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG:
			setNrReserveEinspeisung(NR_RESERVE_EINSPEISUNG_EDEFAULT);
			return;
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG:
			setNrHauptversorgung(NR_HAUPTVERSORGUNG_EDEFAULT);
			return;
		case ModelPackage.VERTEILER_MIT_ZAEHLER__FERNABLESUNG:
			setFernablesung(FERNABLESUNG_EDEFAULT);
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
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_RESERVE_EINSPEISUNG:
			return NR_RESERVE_EINSPEISUNG_EDEFAULT == null ? nrReserveEinspeisung != null
					: !NR_RESERVE_EINSPEISUNG_EDEFAULT.equals(nrReserveEinspeisung);
		case ModelPackage.VERTEILER_MIT_ZAEHLER__NR_HAUPTVERSORGUNG:
			return NR_HAUPTVERSORGUNG_EDEFAULT == null ? nrHauptversorgung != null
					: !NR_HAUPTVERSORGUNG_EDEFAULT.equals(nrHauptversorgung);
		case ModelPackage.VERTEILER_MIT_ZAEHLER__FERNABLESUNG:
			return fernablesung != FERNABLESUNG_EDEFAULT;
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
		result.append(" (nrReserveEinspeisung: ");
		result.append(nrReserveEinspeisung);
		result.append(", nrHauptversorgung: ");
		result.append(nrHauptversorgung);
		result.append(", fernablesung: ");
		result.append(fernablesung);
		result.append(')');
		return result.toString();
	}

} //VerteilerMitZaehlerImpl

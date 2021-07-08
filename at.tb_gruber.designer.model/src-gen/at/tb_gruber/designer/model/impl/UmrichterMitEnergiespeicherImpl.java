/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Energiespeicherart;
import at.tb_gruber.designer.model.Energiespeicherfunktion;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.UmrichterMitEnergiespeicher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Umrichter Mit Energiespeicher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl#getEnergiespeicherart <em>Energiespeicherart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl#getAutonomiezeit <em>Autonomiezeit</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterMitEnergiespeicherImpl#getKapazitaet <em>Kapazitaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UmrichterMitEnergiespeicherImpl extends UmrichterBaseImpl implements UmrichterMitEnergiespeicher {
	/**
	 * The default value of the '{@link #getEnergiespeicherfunktion() <em>Energiespeicherfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergiespeicherfunktion()
	 * @generated
	 * @ordered
	 */
	protected static final Energiespeicherfunktion ENERGIESPEICHERFUNKTION_EDEFAULT = Energiespeicherfunktion.BATTERIE;

	/**
	 * The cached value of the '{@link #getEnergiespeicherfunktion() <em>Energiespeicherfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergiespeicherfunktion()
	 * @generated
	 * @ordered
	 */
	protected Energiespeicherfunktion energiespeicherfunktion = ENERGIESPEICHERFUNKTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergiespeicherart() <em>Energiespeicherart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergiespeicherart()
	 * @generated
	 * @ordered
	 */
	protected static final Energiespeicherart ENERGIESPEICHERART_EDEFAULT = Energiespeicherart.BATTERIE;

	/**
	 * The cached value of the '{@link #getEnergiespeicherart() <em>Energiespeicherart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergiespeicherart()
	 * @generated
	 * @ordered
	 */
	protected Energiespeicherart energiespeicherart = ENERGIESPEICHERART_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutonomiezeit() <em>Autonomiezeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutonomiezeit()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTONOMIEZEIT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAutonomiezeit() <em>Autonomiezeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutonomiezeit()
	 * @generated
	 * @ordered
	 */
	protected String autonomiezeit = AUTONOMIEZEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected static final String KAPAZITAET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected String kapazitaet = KAPAZITAET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmrichterMitEnergiespeicherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.UMRICHTER_MIT_ENERGIESPEICHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energiespeicherfunktion getEnergiespeicherfunktion() {
		return energiespeicherfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnergiespeicherfunktion(Energiespeicherfunktion newEnergiespeicherfunktion) {
		Energiespeicherfunktion oldEnergiespeicherfunktion = energiespeicherfunktion;
		energiespeicherfunktion = newEnergiespeicherfunktion == null ? ENERGIESPEICHERFUNKTION_EDEFAULT
				: newEnergiespeicherfunktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION, oldEnergiespeicherfunktion,
					energiespeicherfunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energiespeicherart getEnergiespeicherart() {
		return energiespeicherart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnergiespeicherart(Energiespeicherart newEnergiespeicherart) {
		Energiespeicherart oldEnergiespeicherart = energiespeicherart;
		energiespeicherart = newEnergiespeicherart == null ? ENERGIESPEICHERART_EDEFAULT : newEnergiespeicherart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART, oldEnergiespeicherart,
					energiespeicherart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutonomiezeit() {
		return autonomiezeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutonomiezeit(String newAutonomiezeit) {
		String oldAutonomiezeit = autonomiezeit;
		autonomiezeit = newAutonomiezeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT, oldAutonomiezeit, autonomiezeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKapazitaet() {
		return kapazitaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKapazitaet(String newKapazitaet) {
		String oldKapazitaet = kapazitaet;
		kapazitaet = newKapazitaet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET, oldKapazitaet, kapazitaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			return getEnergiespeicherfunktion();
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART:
			return getEnergiespeicherart();
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT:
			return getAutonomiezeit();
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET:
			return getKapazitaet();
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
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			setEnergiespeicherfunktion((Energiespeicherfunktion) newValue);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART:
			setEnergiespeicherart((Energiespeicherart) newValue);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT:
			setAutonomiezeit((String) newValue);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET:
			setKapazitaet((String) newValue);
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
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			setEnergiespeicherfunktion(ENERGIESPEICHERFUNKTION_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART:
			setEnergiespeicherart(ENERGIESPEICHERART_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT:
			setAutonomiezeit(AUTONOMIEZEIT_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET:
			setKapazitaet(KAPAZITAET_EDEFAULT);
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
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			return energiespeicherfunktion != ENERGIESPEICHERFUNKTION_EDEFAULT;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__ENERGIESPEICHERART:
			return energiespeicherart != ENERGIESPEICHERART_EDEFAULT;
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__AUTONOMIEZEIT:
			return AUTONOMIEZEIT_EDEFAULT == null ? autonomiezeit != null
					: !AUTONOMIEZEIT_EDEFAULT.equals(autonomiezeit);
		case ModelPackage.UMRICHTER_MIT_ENERGIESPEICHER__KAPAZITAET:
			return KAPAZITAET_EDEFAULT == null ? kapazitaet != null : !KAPAZITAET_EDEFAULT.equals(kapazitaet);
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
		result.append(" (energiespeicherfunktion: ");
		result.append(energiespeicherfunktion);
		result.append(", energiespeicherart: ");
		result.append(energiespeicherart);
		result.append(", autonomiezeit: ");
		result.append(autonomiezeit);
		result.append(", kapazitaet: ");
		result.append(kapazitaet);
		result.append(')');
		return result.toString();
	}

} //UmrichterMitEnergiespeicherImpl

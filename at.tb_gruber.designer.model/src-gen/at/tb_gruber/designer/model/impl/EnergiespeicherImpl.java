/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energiespeicherart;
import at.tb_gruber.designer.model.Energiespeicherfunktion;
import at.tb_gruber.designer.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energiespeicher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl#getEnergiespeicherfunktion <em>Energiespeicherfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl#getEnergiespeicherart <em>Energiespeicherart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl#getKapazitaet <em>Kapazitaet</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergiespeicherImpl#getAutonomiezeit <em>Autonomiezeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergiespeicherImpl extends SelbststAnlageImpl implements Energiespeicher {
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
	 * The default value of the '{@link #getFunktionSonstig() <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionSonstig()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNKTION_SONSTIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunktionSonstig() <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionSonstig()
	 * @generated
	 * @ordered
	 */
	protected String funktionSonstig = FUNKTION_SONSTIG_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergiespeicherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENERGIESPEICHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERFUNKTION,
					oldEnergiespeicherfunktion, energiespeicherfunktion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERART,
					oldEnergiespeicherart, energiespeicherart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIESPEICHER__AUTONOMIEZEIT,
					oldAutonomiezeit, autonomiezeit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIESPEICHER__KAPAZITAET,
					oldKapazitaet, kapazitaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunktionSonstig() {
		return funktionSonstig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunktionSonstig(String newFunktionSonstig) {
		String oldFunktionSonstig = funktionSonstig;
		funktionSonstig = newFunktionSonstig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIESPEICHER__FUNKTION_SONSTIG,
					oldFunktionSonstig, funktionSonstig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			return getEnergiespeicherfunktion();
		case ModelPackage.ENERGIESPEICHER__FUNKTION_SONSTIG:
			return getFunktionSonstig();
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERART:
			return getEnergiespeicherart();
		case ModelPackage.ENERGIESPEICHER__KAPAZITAET:
			return getKapazitaet();
		case ModelPackage.ENERGIESPEICHER__AUTONOMIEZEIT:
			return getAutonomiezeit();
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
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			setEnergiespeicherfunktion((Energiespeicherfunktion) newValue);
			return;
		case ModelPackage.ENERGIESPEICHER__FUNKTION_SONSTIG:
			setFunktionSonstig((String) newValue);
			return;
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERART:
			setEnergiespeicherart((Energiespeicherart) newValue);
			return;
		case ModelPackage.ENERGIESPEICHER__KAPAZITAET:
			setKapazitaet((String) newValue);
			return;
		case ModelPackage.ENERGIESPEICHER__AUTONOMIEZEIT:
			setAutonomiezeit((String) newValue);
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
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			setEnergiespeicherfunktion(ENERGIESPEICHERFUNKTION_EDEFAULT);
			return;
		case ModelPackage.ENERGIESPEICHER__FUNKTION_SONSTIG:
			setFunktionSonstig(FUNKTION_SONSTIG_EDEFAULT);
			return;
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERART:
			setEnergiespeicherart(ENERGIESPEICHERART_EDEFAULT);
			return;
		case ModelPackage.ENERGIESPEICHER__KAPAZITAET:
			setKapazitaet(KAPAZITAET_EDEFAULT);
			return;
		case ModelPackage.ENERGIESPEICHER__AUTONOMIEZEIT:
			setAutonomiezeit(AUTONOMIEZEIT_EDEFAULT);
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
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERFUNKTION:
			return energiespeicherfunktion != ENERGIESPEICHERFUNKTION_EDEFAULT;
		case ModelPackage.ENERGIESPEICHER__FUNKTION_SONSTIG:
			return FUNKTION_SONSTIG_EDEFAULT == null ? funktionSonstig != null
					: !FUNKTION_SONSTIG_EDEFAULT.equals(funktionSonstig);
		case ModelPackage.ENERGIESPEICHER__ENERGIESPEICHERART:
			return energiespeicherart != ENERGIESPEICHERART_EDEFAULT;
		case ModelPackage.ENERGIESPEICHER__KAPAZITAET:
			return KAPAZITAET_EDEFAULT == null ? kapazitaet != null : !KAPAZITAET_EDEFAULT.equals(kapazitaet);
		case ModelPackage.ENERGIESPEICHER__AUTONOMIEZEIT:
			return AUTONOMIEZEIT_EDEFAULT == null ? autonomiezeit != null
					: !AUTONOMIEZEIT_EDEFAULT.equals(autonomiezeit);
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
		result.append(", funktionSonstig: ");
		result.append(funktionSonstig);
		result.append(", energiespeicherart: ");
		result.append(energiespeicherart);
		result.append(", kapazitaet: ");
		result.append(kapazitaet);
		result.append(", autonomiezeit: ");
		result.append(autonomiezeit);
		result.append(')');
		return result.toString();
	}

} //EnergiespeicherImpl

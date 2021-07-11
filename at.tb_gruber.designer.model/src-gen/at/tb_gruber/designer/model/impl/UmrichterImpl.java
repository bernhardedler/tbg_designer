/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Umrichterart;
import at.tb_gruber.designer.model.Umrichterfunktion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Umrichter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterImpl#getUmrichterfunktion <em>Umrichterfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterImpl#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterImpl#getUmrichterart <em>Umrichterart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterImpl#getNennleistung <em>Nennleistung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UmrichterImpl extends SelbststAnlageImpl implements Umrichter {
	/**
	 * The default value of the '{@link #getUmrichterfunktion() <em>Umrichterfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmrichterfunktion()
	 * @generated
	 * @ordered
	 */
	protected static final Umrichterfunktion UMRICHTERFUNKTION_EDEFAULT = Umrichterfunktion.ERSATZSTROMVERSORGUNG;

	/**
	 * The cached value of the '{@link #getUmrichterfunktion() <em>Umrichterfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmrichterfunktion()
	 * @generated
	 * @ordered
	 */
	protected Umrichterfunktion umrichterfunktion = UMRICHTERFUNKTION_EDEFAULT;

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
	 * The default value of the '{@link #getUmrichterart() <em>Umrichterart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmrichterart()
	 * @generated
	 * @ordered
	 */
	protected static final Umrichterart UMRICHTERART_EDEFAULT = Umrichterart.GLEICHRICHTER;

	/**
	 * The cached value of the '{@link #getUmrichterart() <em>Umrichterart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmrichterart()
	 * @generated
	 * @ordered
	 */
	protected Umrichterart umrichterart = UMRICHTERART_EDEFAULT;

	/**
	 * The default value of the '{@link #getNennleistung() <em>Nennleistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNennleistung()
	 * @generated
	 * @ordered
	 */
	protected static final String NENNLEISTUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNennleistung() <em>Nennleistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNennleistung()
	 * @generated
	 * @ordered
	 */
	protected String nennleistung = NENNLEISTUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmrichterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.UMRICHTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Umrichterfunktion getUmrichterfunktion() {
		return umrichterfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmrichterfunktion(Umrichterfunktion newUmrichterfunktion) {
		Umrichterfunktion oldUmrichterfunktion = umrichterfunktion;
		umrichterfunktion = newUmrichterfunktion == null ? UMRICHTERFUNKTION_EDEFAULT : newUmrichterfunktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER__UMRICHTERFUNKTION,
					oldUmrichterfunktion, umrichterfunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Umrichterart getUmrichterart() {
		return umrichterart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmrichterart(Umrichterart newUmrichterart) {
		Umrichterart oldUmrichterart = umrichterart;
		umrichterart = newUmrichterart == null ? UMRICHTERART_EDEFAULT : newUmrichterart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER__UMRICHTERART, oldUmrichterart,
					umrichterart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNennleistung() {
		return nennleistung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNennleistung(String newNennleistung) {
		String oldNennleistung = nennleistung;
		nennleistung = newNennleistung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER__NENNLEISTUNG, oldNennleistung,
					nennleistung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER__FUNKTION_SONSTIG,
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
		case ModelPackage.UMRICHTER__UMRICHTERFUNKTION:
			return getUmrichterfunktion();
		case ModelPackage.UMRICHTER__FUNKTION_SONSTIG:
			return getFunktionSonstig();
		case ModelPackage.UMRICHTER__UMRICHTERART:
			return getUmrichterart();
		case ModelPackage.UMRICHTER__NENNLEISTUNG:
			return getNennleistung();
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
		case ModelPackage.UMRICHTER__UMRICHTERFUNKTION:
			setUmrichterfunktion((Umrichterfunktion) newValue);
			return;
		case ModelPackage.UMRICHTER__FUNKTION_SONSTIG:
			setFunktionSonstig((String) newValue);
			return;
		case ModelPackage.UMRICHTER__UMRICHTERART:
			setUmrichterart((Umrichterart) newValue);
			return;
		case ModelPackage.UMRICHTER__NENNLEISTUNG:
			setNennleistung((String) newValue);
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
		case ModelPackage.UMRICHTER__UMRICHTERFUNKTION:
			setUmrichterfunktion(UMRICHTERFUNKTION_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER__FUNKTION_SONSTIG:
			setFunktionSonstig(FUNKTION_SONSTIG_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER__UMRICHTERART:
			setUmrichterart(UMRICHTERART_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER__NENNLEISTUNG:
			setNennleistung(NENNLEISTUNG_EDEFAULT);
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
		case ModelPackage.UMRICHTER__UMRICHTERFUNKTION:
			return umrichterfunktion != UMRICHTERFUNKTION_EDEFAULT;
		case ModelPackage.UMRICHTER__FUNKTION_SONSTIG:
			return FUNKTION_SONSTIG_EDEFAULT == null ? funktionSonstig != null
					: !FUNKTION_SONSTIG_EDEFAULT.equals(funktionSonstig);
		case ModelPackage.UMRICHTER__UMRICHTERART:
			return umrichterart != UMRICHTERART_EDEFAULT;
		case ModelPackage.UMRICHTER__NENNLEISTUNG:
			return NENNLEISTUNG_EDEFAULT == null ? nennleistung != null : !NENNLEISTUNG_EDEFAULT.equals(nennleistung);
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
		result.append(" (umrichterfunktion: ");
		result.append(umrichterfunktion);
		result.append(", funktionSonstig: ");
		result.append(funktionSonstig);
		result.append(", umrichterart: ");
		result.append(umrichterart);
		result.append(", nennleistung: ");
		result.append(nennleistung);
		result.append(')');
		return result.toString();
	}

} //UmrichterImpl

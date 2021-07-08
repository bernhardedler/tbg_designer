/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.UmrichterBase;
import at.tb_gruber.designer.model.Umrichterart;
import at.tb_gruber.designer.model.Umrichterfunktion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Umrichter Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterBaseImpl#getUmrichterfunktion <em>Umrichterfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterBaseImpl#getUmrichterart <em>Umrichterart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.UmrichterBaseImpl#getNennleistung <em>Nennleistung</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmrichterBaseImpl extends SelbststAnlageImpl implements UmrichterBase {
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
	protected UmrichterBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.UMRICHTER_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER_BASE__UMRICHTERFUNKTION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER_BASE__UMRICHTERART,
					oldUmrichterart, umrichterart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.UMRICHTER_BASE__NENNLEISTUNG,
					oldNennleistung, nennleistung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.UMRICHTER_BASE__UMRICHTERFUNKTION:
			return getUmrichterfunktion();
		case ModelPackage.UMRICHTER_BASE__UMRICHTERART:
			return getUmrichterart();
		case ModelPackage.UMRICHTER_BASE__NENNLEISTUNG:
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
		case ModelPackage.UMRICHTER_BASE__UMRICHTERFUNKTION:
			setUmrichterfunktion((Umrichterfunktion) newValue);
			return;
		case ModelPackage.UMRICHTER_BASE__UMRICHTERART:
			setUmrichterart((Umrichterart) newValue);
			return;
		case ModelPackage.UMRICHTER_BASE__NENNLEISTUNG:
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
		case ModelPackage.UMRICHTER_BASE__UMRICHTERFUNKTION:
			setUmrichterfunktion(UMRICHTERFUNKTION_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER_BASE__UMRICHTERART:
			setUmrichterart(UMRICHTERART_EDEFAULT);
			return;
		case ModelPackage.UMRICHTER_BASE__NENNLEISTUNG:
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
		case ModelPackage.UMRICHTER_BASE__UMRICHTERFUNKTION:
			return umrichterfunktion != UMRICHTERFUNKTION_EDEFAULT;
		case ModelPackage.UMRICHTER_BASE__UMRICHTERART:
			return umrichterart != UMRICHTERART_EDEFAULT;
		case ModelPackage.UMRICHTER_BASE__NENNLEISTUNG:
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
		result.append(", umrichterart: ");
		result.append(umrichterart);
		result.append(", nennleistung: ");
		result.append(nennleistung);
		result.append(')');
		return result.toString();
	}

} //UmrichterBaseImpl

/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.Trafo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trafo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getSekundaerspannung <em>Sekundaerspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getTrafoKva <em>Trafo Kva</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getReserve3 <em>Reserve3</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getOberspannung <em>Oberspannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getUnterspannung <em>Unterspannung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafoImpl extends AnlageMitAttributenImpl implements Trafo {
	/**
	 * The default value of the '{@link #getSekundaerspannung() <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSekundaerspannung()
	 * @generated
	 * @ordered
	 */
	protected static final Spannungsarttype SEKUNDAERSPANNUNG_EDEFAULT = Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC;

	/**
	 * The cached value of the '{@link #getSekundaerspannung() <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSekundaerspannung()
	 * @generated
	 * @ordered
	 */
	protected Spannungsarttype sekundaerspannung = SEKUNDAERSPANNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFO_KVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected String trafoKva = TRAFO_KVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserve3() <em>Reserve3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve3()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve3() <em>Reserve3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve3()
	 * @generated
	 * @ordered
	 */
	protected String reserve3 = RESERVE3_EDEFAULT;

	/**
	 * The default value of the '{@link #getOberspannung() <em>Oberspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberspannung()
	 * @generated
	 * @ordered
	 */
	protected static final String OBERSPANNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOberspannung() <em>Oberspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOberspannung()
	 * @generated
	 * @ordered
	 */
	protected String oberspannung = OBERSPANNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnterspannung() <em>Unterspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterspannung()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTERSPANNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnterspannung() <em>Unterspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterspannung()
	 * @generated
	 * @ordered
	 */
	protected String unterspannung = UNTERSPANNUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TRAFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannungsarttype getSekundaerspannung() {
		return sekundaerspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSekundaerspannung(Spannungsarttype newSekundaerspannung) {
		Spannungsarttype oldSekundaerspannung = sekundaerspannung;
		sekundaerspannung = newSekundaerspannung == null ? SEKUNDAERSPANNUNG_EDEFAULT : newSekundaerspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__SEKUNDAERSPANNUNG,
					oldSekundaerspannung, sekundaerspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrafoKva() {
		return trafoKva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafoKva(String newTrafoKva) {
		String oldTrafoKva = trafoKva;
		trafoKva = newTrafoKva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__TRAFO_KVA, oldTrafoKva,
					trafoKva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve3() {
		return reserve3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve3(String newReserve3) {
		String oldReserve3 = reserve3;
		reserve3 = newReserve3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__RESERVE3, oldReserve3, reserve3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOberspannung() {
		return oberspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOberspannung(String newOberspannung) {
		String oldOberspannung = oberspannung;
		oberspannung = newOberspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__OBERSPANNUNG, oldOberspannung,
					oberspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnterspannung() {
		return unterspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterspannung(String newUnterspannung) {
		String oldUnterspannung = unterspannung;
		unterspannung = newUnterspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__UNTERSPANNUNG, oldUnterspannung,
					unterspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.TRAFO__SEKUNDAERSPANNUNG:
			return getSekundaerspannung();
		case ModelPackage.TRAFO__TRAFO_KVA:
			return getTrafoKva();
		case ModelPackage.TRAFO__RESERVE3:
			return getReserve3();
		case ModelPackage.TRAFO__OBERSPANNUNG:
			return getOberspannung();
		case ModelPackage.TRAFO__UNTERSPANNUNG:
			return getUnterspannung();
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
		case ModelPackage.TRAFO__SEKUNDAERSPANNUNG:
			setSekundaerspannung((Spannungsarttype) newValue);
			return;
		case ModelPackage.TRAFO__TRAFO_KVA:
			setTrafoKva((String) newValue);
			return;
		case ModelPackage.TRAFO__RESERVE3:
			setReserve3((String) newValue);
			return;
		case ModelPackage.TRAFO__OBERSPANNUNG:
			setOberspannung((String) newValue);
			return;
		case ModelPackage.TRAFO__UNTERSPANNUNG:
			setUnterspannung((String) newValue);
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
		case ModelPackage.TRAFO__SEKUNDAERSPANNUNG:
			setSekundaerspannung(SEKUNDAERSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.TRAFO__TRAFO_KVA:
			setTrafoKva(TRAFO_KVA_EDEFAULT);
			return;
		case ModelPackage.TRAFO__RESERVE3:
			setReserve3(RESERVE3_EDEFAULT);
			return;
		case ModelPackage.TRAFO__OBERSPANNUNG:
			setOberspannung(OBERSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.TRAFO__UNTERSPANNUNG:
			setUnterspannung(UNTERSPANNUNG_EDEFAULT);
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
		case ModelPackage.TRAFO__SEKUNDAERSPANNUNG:
			return sekundaerspannung != SEKUNDAERSPANNUNG_EDEFAULT;
		case ModelPackage.TRAFO__TRAFO_KVA:
			return TRAFO_KVA_EDEFAULT == null ? trafoKva != null : !TRAFO_KVA_EDEFAULT.equals(trafoKva);
		case ModelPackage.TRAFO__RESERVE3:
			return RESERVE3_EDEFAULT == null ? reserve3 != null : !RESERVE3_EDEFAULT.equals(reserve3);
		case ModelPackage.TRAFO__OBERSPANNUNG:
			return OBERSPANNUNG_EDEFAULT == null ? oberspannung != null : !OBERSPANNUNG_EDEFAULT.equals(oberspannung);
		case ModelPackage.TRAFO__UNTERSPANNUNG:
			return UNTERSPANNUNG_EDEFAULT == null ? unterspannung != null
					: !UNTERSPANNUNG_EDEFAULT.equals(unterspannung);
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
		result.append(" (sekundaerspannung: ");
		result.append(sekundaerspannung);
		result.append(", trafoKva: ");
		result.append(trafoKva);
		result.append(", reserve3: ");
		result.append(reserve3);
		result.append(", oberspannung: ");
		result.append(oberspannung);
		result.append(", unterspannung: ");
		result.append(unterspannung);
		result.append(')');
		return result.toString();
	}

} //TrafoImpl

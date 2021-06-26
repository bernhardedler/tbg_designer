/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.spannungsarttype;

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
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getReserve5 <em>Reserve5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafoImpl extends SelbststAnlageImpl implements Trafo {
	/**
	 * The default value of the '{@link #getSekundaerspannung() <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSekundaerspannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype SEKUNDAERSPANNUNG_EDEFAULT = spannungsarttype.HSP_UN_AB_1K_V50_HZ;

	/**
	 * The cached value of the '{@link #getSekundaerspannung() <em>Sekundaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSekundaerspannung()
	 * @generated
	 * @ordered
	 */
	protected spannungsarttype sekundaerspannung = SEKUNDAERSPANNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected static final long TRAFO_KVA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTrafoKva() <em>Trafo Kva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafoKva()
	 * @generated
	 * @ordered
	 */
	protected long trafoKva = TRAFO_KVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserve5() <em>Reserve5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve5()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve5() <em>Reserve5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve5()
	 * @generated
	 * @ordered
	 */
	protected String reserve5 = RESERVE5_EDEFAULT;

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
	public spannungsarttype getSekundaerspannung() {
		return sekundaerspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSekundaerspannung(spannungsarttype newSekundaerspannung) {
		spannungsarttype oldSekundaerspannung = sekundaerspannung;
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
	public long getTrafoKva() {
		return trafoKva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafoKva(long newTrafoKva) {
		long oldTrafoKva = trafoKva;
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
	public String getReserve5() {
		return reserve5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve5(String newReserve5) {
		String oldReserve5 = reserve5;
		reserve5 = newReserve5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__RESERVE5, oldReserve5, reserve5));
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
		case ModelPackage.TRAFO__RESERVE5:
			return getReserve5();
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
			setSekundaerspannung((spannungsarttype) newValue);
			return;
		case ModelPackage.TRAFO__TRAFO_KVA:
			setTrafoKva((Long) newValue);
			return;
		case ModelPackage.TRAFO__RESERVE5:
			setReserve5((String) newValue);
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
		case ModelPackage.TRAFO__RESERVE5:
			setReserve5(RESERVE5_EDEFAULT);
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
			return trafoKva != TRAFO_KVA_EDEFAULT;
		case ModelPackage.TRAFO__RESERVE5:
			return RESERVE5_EDEFAULT == null ? reserve5 != null : !RESERVE5_EDEFAULT.equals(reserve5);
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
		result.append(", reserve5: ");
		result.append(reserve5);
		result.append(')');
		return result.toString();
	}

} //TrafoImpl

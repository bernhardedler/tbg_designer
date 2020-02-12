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
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getTrafospannung <em>Trafospannung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.TrafoImpl#getTrafoKva <em>Trafo Kva</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafoImpl extends AnlageImpl implements Trafo {
	/**
	 * The default value of the '{@link #getTrafospannung() <em>Trafospannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafospannung()
	 * @generated
	 * @ordered
	 */
	protected static final spannungsarttype TRAFOSPANNUNG_EDEFAULT = spannungsarttype.NSP50_HZ;

	/**
	 * The cached value of the '{@link #getTrafospannung() <em>Trafospannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafospannung()
	 * @generated
	 * @ordered
	 */
	protected spannungsarttype trafospannung = TRAFOSPANNUNG_EDEFAULT;

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
	public spannungsarttype getTrafospannung() {
		return trafospannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrafospannung(spannungsarttype newTrafospannung) {
		spannungsarttype oldTrafospannung = trafospannung;
		trafospannung = newTrafospannung == null ? TRAFOSPANNUNG_EDEFAULT : newTrafospannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRAFO__TRAFOSPANNUNG, oldTrafospannung,
					trafospannung));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.TRAFO__TRAFOSPANNUNG:
			return getTrafospannung();
		case ModelPackage.TRAFO__TRAFO_KVA:
			return getTrafoKva();
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
		case ModelPackage.TRAFO__TRAFOSPANNUNG:
			setTrafospannung((spannungsarttype) newValue);
			return;
		case ModelPackage.TRAFO__TRAFO_KVA:
			setTrafoKva((Long) newValue);
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
		case ModelPackage.TRAFO__TRAFOSPANNUNG:
			setTrafospannung(TRAFOSPANNUNG_EDEFAULT);
			return;
		case ModelPackage.TRAFO__TRAFO_KVA:
			setTrafoKva(TRAFO_KVA_EDEFAULT);
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
		case ModelPackage.TRAFO__TRAFOSPANNUNG:
			return trafospannung != TRAFOSPANNUNG_EDEFAULT;
		case ModelPackage.TRAFO__TRAFO_KVA:
			return trafoKva != TRAFO_KVA_EDEFAULT;
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
		result.append(" (trafospannung: ");
		result.append(trafospannung);
		result.append(", trafoKva: ");
		result.append(trafoKva);
		result.append(')');
		return result.toString();
	}

} //TrafoImpl

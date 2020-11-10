/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ET_Type;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energietechnikanlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.EnergietechnikanlageImpl#getEtType <em>Et Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergietechnikanlageImpl extends AnlageImpl implements Energietechnikanlage {
	/**
	 * The default value of the '{@link #getEtType() <em>Et Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtType()
	 * @generated
	 * @ordered
	 */
	protected static final ET_Type ET_TYPE_EDEFAULT = ET_Type.IG;
	/**
	 * The cached value of the '{@link #getEtType() <em>Et Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtType()
	 * @generated
	 * @ordered
	 */
	protected ET_Type etType = ET_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergietechnikanlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENERGIETECHNIKANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ET_Type getEtType() {
		return etType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEtType(ET_Type newEtType) {
		ET_Type oldEtType = etType;
		etType = newEtType == null ? ET_TYPE_EDEFAULT : newEtType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENERGIETECHNIKANLAGE__ET_TYPE, oldEtType,
					etType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ENERGIETECHNIKANLAGE__ET_TYPE:
			return getEtType();
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
		case ModelPackage.ENERGIETECHNIKANLAGE__ET_TYPE:
			setEtType((ET_Type) newValue);
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
		case ModelPackage.ENERGIETECHNIKANLAGE__ET_TYPE:
			setEtType(ET_TYPE_EDEFAULT);
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
		case ModelPackage.ENERGIETECHNIKANLAGE__ET_TYPE:
			return etType != ET_TYPE_EDEFAULT;
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
		result.append(" (etType: ");
		result.append(etType);
		result.append(')');
		return result.toString();
	}

} //EnergietechnikanlageImpl

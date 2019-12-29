/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Sicherung;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sicherung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.SicherungImpl#getSicherungsgröße <em>Sicherungsgröße</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SicherungImpl extends MinimalEObjectImpl.Container implements Sicherung {
	/**
	 * The default value of the '{@link #getSicherungsgröße() <em>Sicherungsgröße</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSicherungsgröße()
	 * @generated
	 * @ordered
	 */
	protected static final String SICHERUNGSGRÖSSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSicherungsgröße() <em>Sicherungsgröße</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSicherungsgröße()
	 * @generated
	 * @ordered
	 */
	protected String sicherungsgröße = SICHERUNGSGRÖSSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SicherungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SICHERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSicherungsgröße() {
		return sicherungsgröße;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSicherungsgröße(String newSicherungsgröße) {
		String oldSicherungsgröße = sicherungsgröße;
		sicherungsgröße = newSicherungsgröße;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SICHERUNG__SICHERUNGSGRÖSSE,
					oldSicherungsgröße, sicherungsgröße));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.SICHERUNG__SICHERUNGSGRÖSSE:
			return getSicherungsgröße();
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
		case ModelPackage.SICHERUNG__SICHERUNGSGRÖSSE:
			setSicherungsgröße((String) newValue);
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
		case ModelPackage.SICHERUNG__SICHERUNGSGRÖSSE:
			setSicherungsgröße(SICHERUNGSGRÖSSE_EDEFAULT);
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
		case ModelPackage.SICHERUNG__SICHERUNGSGRÖSSE:
			return SICHERUNGSGRÖSSE_EDEFAULT == null ? sicherungsgröße != null
					: !SICHERUNGSGRÖSSE_EDEFAULT.equals(sicherungsgröße);
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
		result.append(" (Sicherungsgröße: ");
		result.append(sicherungsgröße);
		result.append(')');
		return result.toString();
	}

} //SicherungImpl

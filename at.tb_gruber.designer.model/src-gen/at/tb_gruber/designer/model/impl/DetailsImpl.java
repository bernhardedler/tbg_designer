/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Details;
import at.tb_gruber.designer.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.DetailsImpl#getAnzeigetext <em>Anzeigetext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailsImpl extends MinimalEObjectImpl.Container implements Details {
	/**
	 * The default value of the '{@link #getAnzeigetext() <em>Anzeigetext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzeigetext()
	 * @generated
	 * @ordered
	 */
	protected static final String ANZEIGETEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzeigetext() <em>Anzeigetext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzeigetext()
	 * @generated
	 * @ordered
	 */
	protected String anzeigetext = ANZEIGETEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnzeigetext() {
		return anzeigetext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzeigetext(String newAnzeigetext) {
		String oldAnzeigetext = anzeigetext;
		anzeigetext = newAnzeigetext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DETAILS__ANZEIGETEXT, oldAnzeigetext,
					anzeigetext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.DETAILS__ANZEIGETEXT:
			return getAnzeigetext();
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
		case ModelPackage.DETAILS__ANZEIGETEXT:
			setAnzeigetext((String) newValue);
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
		case ModelPackage.DETAILS__ANZEIGETEXT:
			setAnzeigetext(ANZEIGETEXT_EDEFAULT);
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
		case ModelPackage.DETAILS__ANZEIGETEXT:
			return ANZEIGETEXT_EDEFAULT == null ? anzeigetext != null : !ANZEIGETEXT_EDEFAULT.equals(anzeigetext);
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
		result.append(" (anzeigetext: ");
		result.append(anzeigetext);
		result.append(')');
		return result.toString();
	}

} //DetailsImpl

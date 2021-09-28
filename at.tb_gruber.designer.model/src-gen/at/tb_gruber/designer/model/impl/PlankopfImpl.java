/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Plankopf;
import at.tb_gruber.designer.model.Textbaustein;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plankopf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.PlankopfImpl#getTextbaustein <em>Textbaustein</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.PlankopfImpl#isHochformat <em>Hochformat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlankopfImpl extends MinimalEObjectImpl.Container implements Plankopf {
	/**
	 * The cached value of the '{@link #getTextbaustein() <em>Textbaustein</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextbaustein()
	 * @generated
	 * @ordered
	 */
	protected EList<Textbaustein> textbaustein;

	/**
	 * The default value of the '{@link #isHochformat() <em>Hochformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochformat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOCHFORMAT_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isHochformat() <em>Hochformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochformat()
	 * @generated
	 * @ordered
	 */
	protected boolean hochformat = HOCHFORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlankopfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PLANKOPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Textbaustein> getTextbaustein() {
		if (textbaustein == null) {
			textbaustein = new EObjectContainmentEList<Textbaustein>(Textbaustein.class, this,
					ModelPackage.PLANKOPF__TEXTBAUSTEIN);
		}
		return textbaustein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHochformat() {
		return hochformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHochformat(boolean newHochformat) {
		boolean oldHochformat = hochformat;
		hochformat = newHochformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PLANKOPF__HOCHFORMAT, oldHochformat,
					hochformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.PLANKOPF__TEXTBAUSTEIN:
			return ((InternalEList<?>) getTextbaustein()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PLANKOPF__TEXTBAUSTEIN:
			return getTextbaustein();
		case ModelPackage.PLANKOPF__HOCHFORMAT:
			return isHochformat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PLANKOPF__TEXTBAUSTEIN:
			getTextbaustein().clear();
			getTextbaustein().addAll((Collection<? extends Textbaustein>) newValue);
			return;
		case ModelPackage.PLANKOPF__HOCHFORMAT:
			setHochformat((Boolean) newValue);
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
		case ModelPackage.PLANKOPF__TEXTBAUSTEIN:
			getTextbaustein().clear();
			return;
		case ModelPackage.PLANKOPF__HOCHFORMAT:
			setHochformat(HOCHFORMAT_EDEFAULT);
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
		case ModelPackage.PLANKOPF__TEXTBAUSTEIN:
			return textbaustein != null && !textbaustein.isEmpty();
		case ModelPackage.PLANKOPF__HOCHFORMAT:
			return hochformat != HOCHFORMAT_EDEFAULT;
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
		result.append(" (hochformat: ");
		result.append(hochformat);
		result.append(')');
		return result.toString();
	}

} //PlankopfImpl

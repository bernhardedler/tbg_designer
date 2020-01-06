/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.objektarttype;

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
 * An implementation of the model object '<em><b>Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getObjektart <em>Objektart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getObjektId <em>Objekt Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjektImpl extends MinimalEObjectImpl.Container implements Objekt {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjektart() <em>Objektart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektart()
	 * @generated
	 * @ordered
	 */
	protected static final objektarttype OBJEKTART_EDEFAULT = objektarttype.TRAFOSTATION;

	/**
	 * The cached value of the '{@link #getObjektart() <em>Objektart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektart()
	 * @generated
	 * @ordered
	 */
	protected objektarttype objektart = OBJEKTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjektId() <em>Objekt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektId()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJEKT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjektId() <em>Objekt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektId()
	 * @generated
	 * @ordered
	 */
	protected String objektId = OBJEKT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnlage() <em>Anlage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlage()
	 * @generated
	 * @ordered
	 */
	protected EList<Anlage> anlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public objektarttype getObjektart() {
		return objektart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjektart(objektarttype newObjektart) {
		objektarttype oldObjektart = objektart;
		objektart = newObjektart == null ? OBJEKTART_EDEFAULT : newObjektart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__OBJEKTART, oldObjektart,
					objektart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjektId() {
		return objektId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjektId(String newObjektId) {
		String oldObjektId = objektId;
		objektId = newObjektId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__OBJEKT_ID, oldObjektId,
					objektId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anlage> getAnlage() {
		if (anlage == null) {
			anlage = new EObjectContainmentEList<Anlage>(Anlage.class, this, ModelPackage.OBJEKT__ANLAGE);
		}
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.OBJEKT__ANLAGE:
			return ((InternalEList<?>) getAnlage()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.OBJEKT__NAME:
			return getName();
		case ModelPackage.OBJEKT__OBJEKTART:
			return getObjektart();
		case ModelPackage.OBJEKT__ADRESSE:
			return getAdresse();
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return getObjektId();
		case ModelPackage.OBJEKT__ANLAGE:
			return getAnlage();
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
		case ModelPackage.OBJEKT__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.OBJEKT__OBJEKTART:
			setObjektart((objektarttype) newValue);
			return;
		case ModelPackage.OBJEKT__ADRESSE:
			setAdresse((String) newValue);
			return;
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId((String) newValue);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
			getAnlage().addAll((Collection<? extends Anlage>) newValue);
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
		case ModelPackage.OBJEKT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__OBJEKTART:
			setObjektart(OBJEKTART_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId(OBJEKT_ID_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
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
		case ModelPackage.OBJEKT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.OBJEKT__OBJEKTART:
			return objektart != OBJEKTART_EDEFAULT;
		case ModelPackage.OBJEKT__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return OBJEKT_ID_EDEFAULT == null ? objektId != null : !OBJEKT_ID_EDEFAULT.equals(objektId);
		case ModelPackage.OBJEKT__ANLAGE:
			return anlage != null && !anlage.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", objektart: ");
		result.append(objektart);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", objektId: ");
		result.append(objektId);
		result.append(')');
		return result.toString();
	}

} //ObjektImpl

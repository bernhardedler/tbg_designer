/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Plankopf;

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
 * An implementation of the model object '<em><b>Bahnhof</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getProjektname <em>Projektname</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getObjekt <em>Objekt</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getPlankopf <em>Plankopf</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getReserve2Value <em>Reserve2 Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BahnhofImpl extends MinimalEObjectImpl.Container implements Bahnhof {
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
	 * The default value of the '{@link #getProjektname() <em>Projektname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjektname()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJEKTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjektname() <em>Projektname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjektname()
	 * @generated
	 * @ordered
	 */
	protected String projektname = PROJEKTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjekt() <em>Objekt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjekt()
	 * @generated
	 * @ordered
	 */
	protected EList<Objekt> objekt;

	/**
	 * The cached value of the '{@link #getPlankopf() <em>Plankopf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlankopf()
	 * @generated
	 * @ordered
	 */
	protected Plankopf plankopf;

	/**
	 * The default value of the '{@link #getReserve2Value() <em>Reserve2 Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2Value()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE2_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve2Value() <em>Reserve2 Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2Value()
	 * @generated
	 * @ordered
	 */
	protected String reserve2Value = RESERVE2_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BahnhofImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BAHNHOF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjektname() {
		return projektname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjektname(String newProjektname) {
		String oldProjektname = projektname;
		projektname = newProjektname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__PROJEKTNAME, oldProjektname,
					projektname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Objekt> getObjekt() {
		if (objekt == null) {
			objekt = new EObjectContainmentEList<Objekt>(Objekt.class, this, ModelPackage.BAHNHOF__OBJEKT);
		}
		return objekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plankopf getPlankopf() {
		return plankopf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlankopf(Plankopf newPlankopf, NotificationChain msgs) {
		Plankopf oldPlankopf = plankopf;
		plankopf = newPlankopf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.BAHNHOF__PLANKOPF, oldPlankopf, newPlankopf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlankopf(Plankopf newPlankopf) {
		if (newPlankopf != plankopf) {
			NotificationChain msgs = null;
			if (plankopf != null)
				msgs = ((InternalEObject) plankopf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.BAHNHOF__PLANKOPF, null, msgs);
			if (newPlankopf != null)
				msgs = ((InternalEObject) newPlankopf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.BAHNHOF__PLANKOPF, null, msgs);
			msgs = basicSetPlankopf(newPlankopf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__PLANKOPF, newPlankopf,
					newPlankopf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve2Value() {
		return reserve2Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve2Value(String newReserve2Value) {
		String oldReserve2Value = reserve2Value;
		reserve2Value = newReserve2Value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__RESERVE2_VALUE,
					oldReserve2Value, reserve2Value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.BAHNHOF__OBJEKT:
			return ((InternalEList<?>) getObjekt()).basicRemove(otherEnd, msgs);
		case ModelPackage.BAHNHOF__PLANKOPF:
			return basicSetPlankopf(null, msgs);
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
		case ModelPackage.BAHNHOF__NAME:
			return getName();
		case ModelPackage.BAHNHOF__PROJEKTNAME:
			return getProjektname();
		case ModelPackage.BAHNHOF__OBJEKT:
			return getObjekt();
		case ModelPackage.BAHNHOF__PLANKOPF:
			return getPlankopf();
		case ModelPackage.BAHNHOF__RESERVE2_VALUE:
			return getReserve2Value();
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
		case ModelPackage.BAHNHOF__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.BAHNHOF__PROJEKTNAME:
			setProjektname((String) newValue);
			return;
		case ModelPackage.BAHNHOF__OBJEKT:
			getObjekt().clear();
			getObjekt().addAll((Collection<? extends Objekt>) newValue);
			return;
		case ModelPackage.BAHNHOF__PLANKOPF:
			setPlankopf((Plankopf) newValue);
			return;
		case ModelPackage.BAHNHOF__RESERVE2_VALUE:
			setReserve2Value((String) newValue);
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
		case ModelPackage.BAHNHOF__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__PROJEKTNAME:
			setProjektname(PROJEKTNAME_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__OBJEKT:
			getObjekt().clear();
			return;
		case ModelPackage.BAHNHOF__PLANKOPF:
			setPlankopf((Plankopf) null);
			return;
		case ModelPackage.BAHNHOF__RESERVE2_VALUE:
			setReserve2Value(RESERVE2_VALUE_EDEFAULT);
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
		case ModelPackage.BAHNHOF__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.BAHNHOF__PROJEKTNAME:
			return PROJEKTNAME_EDEFAULT == null ? projektname != null : !PROJEKTNAME_EDEFAULT.equals(projektname);
		case ModelPackage.BAHNHOF__OBJEKT:
			return objekt != null && !objekt.isEmpty();
		case ModelPackage.BAHNHOF__PLANKOPF:
			return plankopf != null;
		case ModelPackage.BAHNHOF__RESERVE2_VALUE:
			return RESERVE2_VALUE_EDEFAULT == null ? reserve2Value != null
					: !RESERVE2_VALUE_EDEFAULT.equals(reserve2Value);
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
		result.append(", projektname: ");
		result.append(projektname);
		result.append(", reserve2Value: ");
		result.append(reserve2Value);
		result.append(')');
		return result.toString();
	}

} //BahnhofImpl

/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.externe_datenquelle;
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
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getOrt_Adresse <em>Ort Adresse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getObjektId <em>Objekt Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getAnlage <em>Anlage</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getReserve1 <em>Reserve1</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getReserve2 <em>Reserve2</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getGpsstandort <em>Gpsstandort</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getExterneQuelle <em>Externe Quelle</em>}</li>
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
	 * The default value of the '{@link #getOrt_Adresse() <em>Ort Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt_Adresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt_Adresse() <em>Ort Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt_Adresse()
	 * @generated
	 * @ordered
	 */
	protected String ort_Adresse = ORT_ADRESSE_EDEFAULT;

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
	 * The default value of the '{@link #getReserve1() <em>Reserve1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve1() <em>Reserve1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve1()
	 * @generated
	 * @ordered
	 */
	protected String reserve1 = RESERVE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserve2() <em>Reserve2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserve2() <em>Reserve2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserve2()
	 * @generated
	 * @ordered
	 */
	protected String reserve2 = RESERVE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpsstandort() <em>Gpsstandort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsstandort()
	 * @generated
	 * @ordered
	 */
	protected static final String GPSSTANDORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGpsstandort() <em>Gpsstandort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsstandort()
	 * @generated
	 * @ordered
	 */
	protected String gpsstandort = GPSSTANDORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExterneQuelle() <em>Externe Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterneQuelle()
	 * @generated
	 * @ordered
	 */
	protected static final externe_datenquelle EXTERNE_QUELLE_EDEFAULT = externe_datenquelle.IMMO;

	/**
	 * The cached value of the '{@link #getExterneQuelle() <em>Externe Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterneQuelle()
	 * @generated
	 * @ordered
	 */
	protected externe_datenquelle externeQuelle = EXTERNE_QUELLE_EDEFAULT;

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
	public String getOrt_Adresse() {
		return ort_Adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrt_Adresse(String newOrt_Adresse) {
		String oldOrt_Adresse = ort_Adresse;
		ort_Adresse = newOrt_Adresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__ORT_ADRESSE, oldOrt_Adresse,
					ort_Adresse));
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
	public String getReserve1() {
		return reserve1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve1(String newReserve1) {
		String oldReserve1 = reserve1;
		reserve1 = newReserve1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__RESERVE1, oldReserve1,
					reserve1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReserve2() {
		return reserve2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserve2(String newReserve2) {
		String oldReserve2 = reserve2;
		reserve2 = newReserve2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__RESERVE2, oldReserve2,
					reserve2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGpsstandort() {
		return gpsstandort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGpsstandort(String newGpsstandort) {
		String oldGpsstandort = gpsstandort;
		gpsstandort = newGpsstandort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__GPSSTANDORT, oldGpsstandort,
					gpsstandort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public externe_datenquelle getExterneQuelle() {
		return externeQuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExterneQuelle(externe_datenquelle newExterneQuelle) {
		externe_datenquelle oldExterneQuelle = externeQuelle;
		externeQuelle = newExterneQuelle == null ? EXTERNE_QUELLE_EDEFAULT : newExterneQuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__EXTERNE_QUELLE, oldExterneQuelle,
					externeQuelle));
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
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			return getOrt_Adresse();
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return getObjektId();
		case ModelPackage.OBJEKT__ANLAGE:
			return getAnlage();
		case ModelPackage.OBJEKT__RESERVE1:
			return getReserve1();
		case ModelPackage.OBJEKT__RESERVE2:
			return getReserve2();
		case ModelPackage.OBJEKT__GPSSTANDORT:
			return getGpsstandort();
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			return getExterneQuelle();
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
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			setOrt_Adresse((String) newValue);
			return;
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId((String) newValue);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
			getAnlage().addAll((Collection<? extends Anlage>) newValue);
			return;
		case ModelPackage.OBJEKT__RESERVE1:
			setReserve1((String) newValue);
			return;
		case ModelPackage.OBJEKT__RESERVE2:
			setReserve2((String) newValue);
			return;
		case ModelPackage.OBJEKT__GPSSTANDORT:
			setGpsstandort((String) newValue);
			return;
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			setExterneQuelle((externe_datenquelle) newValue);
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
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			setOrt_Adresse(ORT_ADRESSE_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId(OBJEKT_ID_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
			return;
		case ModelPackage.OBJEKT__RESERVE1:
			setReserve1(RESERVE1_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__RESERVE2:
			setReserve2(RESERVE2_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__GPSSTANDORT:
			setGpsstandort(GPSSTANDORT_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			setExterneQuelle(EXTERNE_QUELLE_EDEFAULT);
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
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			return ORT_ADRESSE_EDEFAULT == null ? ort_Adresse != null : !ORT_ADRESSE_EDEFAULT.equals(ort_Adresse);
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return OBJEKT_ID_EDEFAULT == null ? objektId != null : !OBJEKT_ID_EDEFAULT.equals(objektId);
		case ModelPackage.OBJEKT__ANLAGE:
			return anlage != null && !anlage.isEmpty();
		case ModelPackage.OBJEKT__RESERVE1:
			return RESERVE1_EDEFAULT == null ? reserve1 != null : !RESERVE1_EDEFAULT.equals(reserve1);
		case ModelPackage.OBJEKT__RESERVE2:
			return RESERVE2_EDEFAULT == null ? reserve2 != null : !RESERVE2_EDEFAULT.equals(reserve2);
		case ModelPackage.OBJEKT__GPSSTANDORT:
			return GPSSTANDORT_EDEFAULT == null ? gpsstandort != null : !GPSSTANDORT_EDEFAULT.equals(gpsstandort);
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			return externeQuelle != EXTERNE_QUELLE_EDEFAULT;
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
		result.append(", Ort_Adresse: ");
		result.append(ort_Adresse);
		result.append(", objektId: ");
		result.append(objektId);
		result.append(", reserve1: ");
		result.append(reserve1);
		result.append(", reserve2: ");
		result.append(reserve2);
		result.append(", gpsstandort: ");
		result.append(gpsstandort);
		result.append(", externeQuelle: ");
		result.append(externeQuelle);
		result.append(')');
		return result.toString();
	}

} //ObjektImpl

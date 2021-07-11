/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.Eigentuemer;
import at.tb_gruber.designer.model.Externe_Datenquelle;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Objektarttype;

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
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getObjektId <em>Objekt Id</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getAnlage <em>Anlage</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getDb776ua <em>Db776ua</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getGpsstandort <em>Gpsstandort</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getExterneQuelle <em>Externe Quelle</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getOrt_adresse <em>Ort adresse</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getGebaeudeart <em>Gebaeudeart</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.ObjektImpl#getEigentuemer <em>Eigentuemer</em>}</li>
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
	protected static final Objektarttype OBJEKTART_EDEFAULT = Objektarttype.TRAFOSTATION;

	/**
	 * The cached value of the '{@link #getObjektart() <em>Objektart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektart()
	 * @generated
	 * @ordered
	 */
	protected Objektarttype objektart = OBJEKTART_EDEFAULT;

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
	protected EList<AnlageBase> anlage;

	/**
	 * The default value of the '{@link #getDb776ua() <em>Db776ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb776ua()
	 * @generated
	 * @ordered
	 */
	protected static final String DB776UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDb776ua() <em>Db776ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb776ua()
	 * @generated
	 * @ordered
	 */
	protected String db776ua = DB776UA_EDEFAULT;

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
	protected static final Externe_Datenquelle EXTERNE_QUELLE_EDEFAULT = Externe_Datenquelle.UNDEFINED;

	/**
	 * The cached value of the '{@link #getExterneQuelle() <em>Externe Quelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterneQuelle()
	 * @generated
	 * @ordered
	 */
	protected Externe_Datenquelle externeQuelle = EXTERNE_QUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrt_adresse() <em>Ort adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt_adresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt_adresse() <em>Ort adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt_adresse()
	 * @generated
	 * @ordered
	 */
	protected String ort_adresse = ORT_ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGebaeudeart() <em>Gebaeudeart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeudeart()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBAEUDEART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGebaeudeart() <em>Gebaeudeart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGebaeudeart()
	 * @generated
	 * @ordered
	 */
	protected String gebaeudeart = GEBAEUDEART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEigentuemer() <em>Eigentuemer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigentuemer()
	 * @generated
	 * @ordered
	 */
	protected Eigentuemer eigentuemer;

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
	public Objektarttype getObjektart() {
		return objektart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjektart(Objektarttype newObjektart) {
		Objektarttype oldObjektart = objektart;
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
	public EList<AnlageBase> getAnlage() {
		if (anlage == null) {
			anlage = new EObjectContainmentEList<AnlageBase>(AnlageBase.class, this, ModelPackage.OBJEKT__ANLAGE);
		}
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDb776ua() {
		return db776ua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDb776ua(String newDb776ua) {
		String oldDb776ua = db776ua;
		db776ua = newDb776ua;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__DB776UA, oldDb776ua, db776ua));
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
	public Externe_Datenquelle getExterneQuelle() {
		return externeQuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExterneQuelle(Externe_Datenquelle newExterneQuelle) {
		Externe_Datenquelle oldExterneQuelle = externeQuelle;
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
	public String getOrt_adresse() {
		return ort_adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrt_adresse(String newOrt_adresse) {
		String oldOrt_adresse = ort_adresse;
		ort_adresse = newOrt_adresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__ORT_ADRESSE, oldOrt_adresse,
					ort_adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGebaeudeart() {
		return gebaeudeart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGebaeudeart(String newGebaeudeart) {
		String oldGebaeudeart = gebaeudeart;
		gebaeudeart = newGebaeudeart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__GEBAEUDEART, oldGebaeudeart,
					gebaeudeart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigentuemer getEigentuemer() {
		return eigentuemer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEigentuemer(Eigentuemer newEigentuemer, NotificationChain msgs) {
		Eigentuemer oldEigentuemer = eigentuemer;
		eigentuemer = newEigentuemer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.OBJEKT__EIGENTUEMER, oldEigentuemer, newEigentuemer);
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
	public void setEigentuemer(Eigentuemer newEigentuemer) {
		if (newEigentuemer != eigentuemer) {
			NotificationChain msgs = null;
			if (eigentuemer != null)
				msgs = ((InternalEObject) eigentuemer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.OBJEKT__EIGENTUEMER, null, msgs);
			if (newEigentuemer != null)
				msgs = ((InternalEObject) newEigentuemer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.OBJEKT__EIGENTUEMER, null, msgs);
			msgs = basicSetEigentuemer(newEigentuemer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OBJEKT__EIGENTUEMER, newEigentuemer,
					newEigentuemer));
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
		case ModelPackage.OBJEKT__EIGENTUEMER:
			return basicSetEigentuemer(null, msgs);
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
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return getObjektId();
		case ModelPackage.OBJEKT__ANLAGE:
			return getAnlage();
		case ModelPackage.OBJEKT__DB776UA:
			return getDb776ua();
		case ModelPackage.OBJEKT__GPSSTANDORT:
			return getGpsstandort();
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			return getExterneQuelle();
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			return getOrt_adresse();
		case ModelPackage.OBJEKT__GEBAEUDEART:
			return getGebaeudeart();
		case ModelPackage.OBJEKT__EIGENTUEMER:
			return getEigentuemer();
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
			setObjektart((Objektarttype) newValue);
			return;
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId((String) newValue);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
			getAnlage().addAll((Collection<? extends AnlageBase>) newValue);
			return;
		case ModelPackage.OBJEKT__DB776UA:
			setDb776ua((String) newValue);
			return;
		case ModelPackage.OBJEKT__GPSSTANDORT:
			setGpsstandort((String) newValue);
			return;
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			setExterneQuelle((Externe_Datenquelle) newValue);
			return;
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			setOrt_adresse((String) newValue);
			return;
		case ModelPackage.OBJEKT__GEBAEUDEART:
			setGebaeudeart((String) newValue);
			return;
		case ModelPackage.OBJEKT__EIGENTUEMER:
			setEigentuemer((Eigentuemer) newValue);
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
		case ModelPackage.OBJEKT__OBJEKT_ID:
			setObjektId(OBJEKT_ID_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__ANLAGE:
			getAnlage().clear();
			return;
		case ModelPackage.OBJEKT__DB776UA:
			setDb776ua(DB776UA_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__GPSSTANDORT:
			setGpsstandort(GPSSTANDORT_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			setExterneQuelle(EXTERNE_QUELLE_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			setOrt_adresse(ORT_ADRESSE_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__GEBAEUDEART:
			setGebaeudeart(GEBAEUDEART_EDEFAULT);
			return;
		case ModelPackage.OBJEKT__EIGENTUEMER:
			setEigentuemer((Eigentuemer) null);
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
		case ModelPackage.OBJEKT__OBJEKT_ID:
			return OBJEKT_ID_EDEFAULT == null ? objektId != null : !OBJEKT_ID_EDEFAULT.equals(objektId);
		case ModelPackage.OBJEKT__ANLAGE:
			return anlage != null && !anlage.isEmpty();
		case ModelPackage.OBJEKT__DB776UA:
			return DB776UA_EDEFAULT == null ? db776ua != null : !DB776UA_EDEFAULT.equals(db776ua);
		case ModelPackage.OBJEKT__GPSSTANDORT:
			return GPSSTANDORT_EDEFAULT == null ? gpsstandort != null : !GPSSTANDORT_EDEFAULT.equals(gpsstandort);
		case ModelPackage.OBJEKT__EXTERNE_QUELLE:
			return externeQuelle != EXTERNE_QUELLE_EDEFAULT;
		case ModelPackage.OBJEKT__ORT_ADRESSE:
			return ORT_ADRESSE_EDEFAULT == null ? ort_adresse != null : !ORT_ADRESSE_EDEFAULT.equals(ort_adresse);
		case ModelPackage.OBJEKT__GEBAEUDEART:
			return GEBAEUDEART_EDEFAULT == null ? gebaeudeart != null : !GEBAEUDEART_EDEFAULT.equals(gebaeudeart);
		case ModelPackage.OBJEKT__EIGENTUEMER:
			return eigentuemer != null;
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
		result.append(", objektId: ");
		result.append(objektId);
		result.append(", db776ua: ");
		result.append(db776ua);
		result.append(", gpsstandort: ");
		result.append(gpsstandort);
		result.append(", externeQuelle: ");
		result.append(externeQuelle);
		result.append(", ort_adresse: ");
		result.append(ort_adresse);
		result.append(", gebaeudeart: ");
		result.append(gebaeudeart);
		result.append(')');
		return result.toString();
	}

} //ObjektImpl

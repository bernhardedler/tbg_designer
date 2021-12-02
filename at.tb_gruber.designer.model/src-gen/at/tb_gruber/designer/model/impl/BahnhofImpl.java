/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;
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
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getBearbeitet_am <em>Bearbeitet am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getBearbeitet_von <em>Bearbeitet von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getGezeichnet_am <em>Gezeichnet am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getGezeichnet_von <em>Gezeichnet von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getGeprueft_am <em>Geprueft am</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getGeprueft_von <em>Geprueft von</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getPlannummer <em>Plannummer</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.BahnhofImpl#getFreigegeben_von <em>Freigegeben von</em>}</li>
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
	 * The default value of the '{@link #getBearbeitet_am() <em>Bearbeitet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitet_am()
	 * @generated
	 * @ordered
	 */
	protected static final String BEARBEITET_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBearbeitet_am() <em>Bearbeitet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitet_am()
	 * @generated
	 * @ordered
	 */
	protected String bearbeitet_am = BEARBEITET_AM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBearbeitet_von() <em>Bearbeitet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitet_von()
	 * @generated
	 * @ordered
	 */
	protected static final String BEARBEITET_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBearbeitet_von() <em>Bearbeitet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitet_von()
	 * @generated
	 * @ordered
	 */
	protected String bearbeitet_von = BEARBEITET_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getGezeichnet_am() <em>Gezeichnet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGezeichnet_am()
	 * @generated
	 * @ordered
	 */
	protected static final String GEZEICHNET_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGezeichnet_am() <em>Gezeichnet am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGezeichnet_am()
	 * @generated
	 * @ordered
	 */
	protected String gezeichnet_am = GEZEICHNET_AM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGezeichnet_von() <em>Gezeichnet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGezeichnet_von()
	 * @generated
	 * @ordered
	 */
	protected static final String GEZEICHNET_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGezeichnet_von() <em>Gezeichnet von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGezeichnet_von()
	 * @generated
	 * @ordered
	 */
	protected String gezeichnet_von = GEZEICHNET_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeprueft_am() <em>Geprueft am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeprueft_am()
	 * @generated
	 * @ordered
	 */
	protected static final String GEPRUEFT_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeprueft_am() <em>Geprueft am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeprueft_am()
	 * @generated
	 * @ordered
	 */
	protected String geprueft_am = GEPRUEFT_AM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeprueft_von() <em>Geprueft von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeprueft_von()
	 * @generated
	 * @ordered
	 */
	protected static final String GEPRUEFT_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeprueft_von() <em>Geprueft von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeprueft_von()
	 * @generated
	 * @ordered
	 */
	protected String geprueft_von = GEPRUEFT_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlannummer() <em>Plannummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannummer()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlannummer() <em>Plannummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannummer()
	 * @generated
	 * @ordered
	 */
	protected String plannummer = PLANNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreigegeben_von() <em>Freigegeben von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreigegeben_von()
	 * @generated
	 * @ordered
	 */
	protected static final String FREIGEGEBEN_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreigegeben_von() <em>Freigegeben von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreigegeben_von()
	 * @generated
	 * @ordered
	 */
	protected String freigegeben_von = FREIGEGEBEN_VON_EDEFAULT;

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
	public String getPlannummer() {
		return plannummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannummer(String newPlannummer) {
		String oldPlannummer = plannummer;
		plannummer = newPlannummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__PLANNUMMER, oldPlannummer,
					plannummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFreigegeben_von() {
		return freigegeben_von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreigegeben_von(String newFreigegeben_von) {
		String oldFreigegeben_von = freigegeben_von;
		freigegeben_von = newFreigegeben_von;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__FREIGEGEBEN_VON,
					oldFreigegeben_von, freigegeben_von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBearbeitet_von() {
		return bearbeitet_von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearbeitet_von(String newBearbeitet_von) {
		String oldBearbeitet_von = bearbeitet_von;
		bearbeitet_von = newBearbeitet_von;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__BEARBEITET_VON,
					oldBearbeitet_von, bearbeitet_von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGezeichnet_von() {
		return gezeichnet_von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGezeichnet_von(String newGezeichnet_von) {
		String oldGezeichnet_von = gezeichnet_von;
		gezeichnet_von = newGezeichnet_von;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__GEZEICHNET_VON,
					oldGezeichnet_von, gezeichnet_von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeprueft_von() {
		return geprueft_von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeprueft_von(String newGeprueft_von) {
		String oldGeprueft_von = geprueft_von;
		geprueft_von = newGeprueft_von;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__GEPRUEFT_VON, oldGeprueft_von,
					geprueft_von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBearbeitet_am() {
		return bearbeitet_am;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearbeitet_am(String newBearbeitet_am) {
		String oldBearbeitet_am = bearbeitet_am;
		bearbeitet_am = newBearbeitet_am;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__BEARBEITET_AM, oldBearbeitet_am,
					bearbeitet_am));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGezeichnet_am() {
		return gezeichnet_am;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGezeichnet_am(String newGezeichnet_am) {
		String oldGezeichnet_am = gezeichnet_am;
		gezeichnet_am = newGezeichnet_am;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__GEZEICHNET_AM, oldGezeichnet_am,
					gezeichnet_am));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeprueft_am() {
		return geprueft_am;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeprueft_am(String newGeprueft_am) {
		String oldGeprueft_am = geprueft_am;
		geprueft_am = newGeprueft_am;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BAHNHOF__GEPRUEFT_AM, oldGeprueft_am,
					geprueft_am));
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
		case ModelPackage.BAHNHOF__BEARBEITET_AM:
			return getBearbeitet_am();
		case ModelPackage.BAHNHOF__BEARBEITET_VON:
			return getBearbeitet_von();
		case ModelPackage.BAHNHOF__GEZEICHNET_AM:
			return getGezeichnet_am();
		case ModelPackage.BAHNHOF__GEZEICHNET_VON:
			return getGezeichnet_von();
		case ModelPackage.BAHNHOF__GEPRUEFT_AM:
			return getGeprueft_am();
		case ModelPackage.BAHNHOF__GEPRUEFT_VON:
			return getGeprueft_von();
		case ModelPackage.BAHNHOF__PLANNUMMER:
			return getPlannummer();
		case ModelPackage.BAHNHOF__FREIGEGEBEN_VON:
			return getFreigegeben_von();
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
		case ModelPackage.BAHNHOF__BEARBEITET_AM:
			setBearbeitet_am((String) newValue);
			return;
		case ModelPackage.BAHNHOF__BEARBEITET_VON:
			setBearbeitet_von((String) newValue);
			return;
		case ModelPackage.BAHNHOF__GEZEICHNET_AM:
			setGezeichnet_am((String) newValue);
			return;
		case ModelPackage.BAHNHOF__GEZEICHNET_VON:
			setGezeichnet_von((String) newValue);
			return;
		case ModelPackage.BAHNHOF__GEPRUEFT_AM:
			setGeprueft_am((String) newValue);
			return;
		case ModelPackage.BAHNHOF__GEPRUEFT_VON:
			setGeprueft_von((String) newValue);
			return;
		case ModelPackage.BAHNHOF__PLANNUMMER:
			setPlannummer((String) newValue);
			return;
		case ModelPackage.BAHNHOF__FREIGEGEBEN_VON:
			setFreigegeben_von((String) newValue);
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
		case ModelPackage.BAHNHOF__BEARBEITET_AM:
			setBearbeitet_am(BEARBEITET_AM_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__BEARBEITET_VON:
			setBearbeitet_von(BEARBEITET_VON_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__GEZEICHNET_AM:
			setGezeichnet_am(GEZEICHNET_AM_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__GEZEICHNET_VON:
			setGezeichnet_von(GEZEICHNET_VON_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__GEPRUEFT_AM:
			setGeprueft_am(GEPRUEFT_AM_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__GEPRUEFT_VON:
			setGeprueft_von(GEPRUEFT_VON_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__PLANNUMMER:
			setPlannummer(PLANNUMMER_EDEFAULT);
			return;
		case ModelPackage.BAHNHOF__FREIGEGEBEN_VON:
			setFreigegeben_von(FREIGEGEBEN_VON_EDEFAULT);
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
		case ModelPackage.BAHNHOF__BEARBEITET_AM:
			return BEARBEITET_AM_EDEFAULT == null ? bearbeitet_am != null
					: !BEARBEITET_AM_EDEFAULT.equals(bearbeitet_am);
		case ModelPackage.BAHNHOF__BEARBEITET_VON:
			return BEARBEITET_VON_EDEFAULT == null ? bearbeitet_von != null
					: !BEARBEITET_VON_EDEFAULT.equals(bearbeitet_von);
		case ModelPackage.BAHNHOF__GEZEICHNET_AM:
			return GEZEICHNET_AM_EDEFAULT == null ? gezeichnet_am != null
					: !GEZEICHNET_AM_EDEFAULT.equals(gezeichnet_am);
		case ModelPackage.BAHNHOF__GEZEICHNET_VON:
			return GEZEICHNET_VON_EDEFAULT == null ? gezeichnet_von != null
					: !GEZEICHNET_VON_EDEFAULT.equals(gezeichnet_von);
		case ModelPackage.BAHNHOF__GEPRUEFT_AM:
			return GEPRUEFT_AM_EDEFAULT == null ? geprueft_am != null : !GEPRUEFT_AM_EDEFAULT.equals(geprueft_am);
		case ModelPackage.BAHNHOF__GEPRUEFT_VON:
			return GEPRUEFT_VON_EDEFAULT == null ? geprueft_von != null : !GEPRUEFT_VON_EDEFAULT.equals(geprueft_von);
		case ModelPackage.BAHNHOF__PLANNUMMER:
			return PLANNUMMER_EDEFAULT == null ? plannummer != null : !PLANNUMMER_EDEFAULT.equals(plannummer);
		case ModelPackage.BAHNHOF__FREIGEGEBEN_VON:
			return FREIGEGEBEN_VON_EDEFAULT == null ? freigegeben_von != null
					: !FREIGEGEBEN_VON_EDEFAULT.equals(freigegeben_von);
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
		result.append(", bearbeitet_am: ");
		result.append(bearbeitet_am);
		result.append(", bearbeitet_von: ");
		result.append(bearbeitet_von);
		result.append(", gezeichnet_am: ");
		result.append(gezeichnet_am);
		result.append(", gezeichnet_von: ");
		result.append(gezeichnet_von);
		result.append(", geprueft_am: ");
		result.append(geprueft_am);
		result.append(", geprueft_von: ");
		result.append(geprueft_von);
		result.append(", plannummer: ");
		result.append(plannummer);
		result.append(", freigegeben_von: ");
		result.append(freigegeben_von);
		result.append(')');
		return result.toString();
	}

} //BahnhofImpl

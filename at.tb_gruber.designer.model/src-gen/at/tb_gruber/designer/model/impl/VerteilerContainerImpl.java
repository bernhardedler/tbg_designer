/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verteiler Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getVerteiler <em>Verteiler</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getNetzanschlusspunkt <em>Netzanschlusspunkt</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.VerteilerContainerImpl#getPrimaerspannung <em>Primaerspannung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerteilerContainerImpl extends AnlageOhneAttributeImpl implements VerteilerContainer {
	/**
	 * The cached value of the '{@link #getVerteiler() <em>Verteiler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerteiler()
	 * @generated
	 * @ordered
	 */
	protected EList<VerteilerBase> verteiler;

	/**
	 * The cached value of the '{@link #getNetzanschlusspunkt() <em>Netzanschlusspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetzanschlusspunkt()
	 * @generated
	 * @ordered
	 */
	protected Netzanschlusspunkt netzanschlusspunkt;

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
	 * The default value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected static final Spannungsarttype PRIMAERSPANNUNG_EDEFAULT = Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC;

	/**
	 * The cached value of the '{@link #getPrimaerspannung() <em>Primaerspannung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerspannung()
	 * @generated
	 * @ordered
	 */
	protected Spannungsarttype primaerspannung = PRIMAERSPANNUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerteilerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VERTEILER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerteilerBase> getVerteiler() {
		if (verteiler == null) {
			verteiler = new EObjectContainmentEList<VerteilerBase>(VerteilerBase.class, this,
					ModelPackage.VERTEILER_CONTAINER__VERTEILER);
		}
		return verteiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Netzanschlusspunkt getNetzanschlusspunkt() {
		return netzanschlusspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetzanschlusspunkt(Netzanschlusspunkt newNetzanschlusspunkt,
			NotificationChain msgs) {
		Netzanschlusspunkt oldNetzanschlusspunkt = netzanschlusspunkt;
		netzanschlusspunkt = newNetzanschlusspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT, oldNetzanschlusspunkt, newNetzanschlusspunkt);
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
	public void setNetzanschlusspunkt(Netzanschlusspunkt newNetzanschlusspunkt) {
		if (newNetzanschlusspunkt != netzanschlusspunkt) {
			NotificationChain msgs = null;
			if (netzanschlusspunkt != null)
				msgs = ((InternalEObject) netzanschlusspunkt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT, null, msgs);
			if (newNetzanschlusspunkt != null)
				msgs = ((InternalEObject) newNetzanschlusspunkt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT, null, msgs);
			msgs = basicSetNetzanschlusspunkt(newNetzanschlusspunkt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT,
					newNetzanschlusspunkt, newNetzanschlusspunkt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER_CONTAINER__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannungsarttype getPrimaerspannung() {
		return primaerspannung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaerspannung(Spannungsarttype newPrimaerspannung) {
		Spannungsarttype oldPrimaerspannung = primaerspannung;
		primaerspannung = newPrimaerspannung == null ? PRIMAERSPANNUNG_EDEFAULT : newPrimaerspannung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VERTEILER_CONTAINER__PRIMAERSPANNUNG,
					oldPrimaerspannung, primaerspannung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return ((InternalEList<?>) getVerteiler()).basicRemove(otherEnd, msgs);
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return basicSetNetzanschlusspunkt(null, msgs);
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return getVerteiler();
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return getNetzanschlusspunkt();
		case ModelPackage.VERTEILER_CONTAINER__NAME:
			return getName();
		case ModelPackage.VERTEILER_CONTAINER__PRIMAERSPANNUNG:
			return getPrimaerspannung();
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			getVerteiler().clear();
			getVerteiler().addAll((Collection<? extends VerteilerBase>) newValue);
			return;
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			setNetzanschlusspunkt((Netzanschlusspunkt) newValue);
			return;
		case ModelPackage.VERTEILER_CONTAINER__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.VERTEILER_CONTAINER__PRIMAERSPANNUNG:
			setPrimaerspannung((Spannungsarttype) newValue);
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			getVerteiler().clear();
			return;
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			setNetzanschlusspunkt((Netzanschlusspunkt) null);
			return;
		case ModelPackage.VERTEILER_CONTAINER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.VERTEILER_CONTAINER__PRIMAERSPANNUNG:
			setPrimaerspannung(PRIMAERSPANNUNG_EDEFAULT);
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
		case ModelPackage.VERTEILER_CONTAINER__VERTEILER:
			return verteiler != null && !verteiler.isEmpty();
		case ModelPackage.VERTEILER_CONTAINER__NETZANSCHLUSSPUNKT:
			return netzanschlusspunkt != null;
		case ModelPackage.VERTEILER_CONTAINER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.VERTEILER_CONTAINER__PRIMAERSPANNUNG:
			return primaerspannung != PRIMAERSPANNUNG_EDEFAULT;
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
		result.append(", primaerspannung: ");
		result.append(primaerspannung);
		result.append(')');
		return result.toString();
	}

} //VerteilerContainerImpl

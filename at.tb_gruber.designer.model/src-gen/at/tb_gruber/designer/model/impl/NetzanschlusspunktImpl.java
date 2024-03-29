/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Netzanschlusspunkt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Netzanschlusspunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl#getLangbeschreibung <em>Langbeschreibung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.NetzanschlusspunktImpl#getPostition <em>Postition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetzanschlusspunktImpl extends AnlageOhneAttributeImpl implements Netzanschlusspunkt {
	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangbeschreibung() <em>Langbeschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangbeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGBESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangbeschreibung() <em>Langbeschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangbeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String langbeschreibung = LANGBESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostition() <em>Postition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostition()
	 * @generated
	 * @ordered
	 */
	protected static final NapPosition POSTITION_EDEFAULT = NapPosition.DAVOR;

	/**
	 * The cached value of the '{@link #getPostition() <em>Postition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostition()
	 * @generated
	 * @ordered
	 */
	protected NapPosition postition = POSTITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetzanschlusspunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NETZANSCHLUSSPUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NETZANSCHLUSSPUNKT__BESCHREIBUNG,
					oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangbeschreibung() {
		return langbeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangbeschreibung(String newLangbeschreibung) {
		String oldLangbeschreibung = langbeschreibung;
		langbeschreibung = newLangbeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG,
					oldLangbeschreibung, langbeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NapPosition getPostition() {
		return postition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostition(NapPosition newPostition) {
		NapPosition oldPostition = postition;
		postition = newPostition == null ? POSTITION_EDEFAULT : newPostition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NETZANSCHLUSSPUNKT__POSTITION,
					oldPostition, postition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.NETZANSCHLUSSPUNKT__BESCHREIBUNG:
			return getBeschreibung();
		case ModelPackage.NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG:
			return getLangbeschreibung();
		case ModelPackage.NETZANSCHLUSSPUNKT__POSTITION:
			return getPostition();
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
		case ModelPackage.NETZANSCHLUSSPUNKT__BESCHREIBUNG:
			setBeschreibung((String) newValue);
			return;
		case ModelPackage.NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG:
			setLangbeschreibung((String) newValue);
			return;
		case ModelPackage.NETZANSCHLUSSPUNKT__POSTITION:
			setPostition((NapPosition) newValue);
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
		case ModelPackage.NETZANSCHLUSSPUNKT__BESCHREIBUNG:
			setBeschreibung(BESCHREIBUNG_EDEFAULT);
			return;
		case ModelPackage.NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG:
			setLangbeschreibung(LANGBESCHREIBUNG_EDEFAULT);
			return;
		case ModelPackage.NETZANSCHLUSSPUNKT__POSTITION:
			setPostition(POSTITION_EDEFAULT);
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
		case ModelPackage.NETZANSCHLUSSPUNKT__BESCHREIBUNG:
			return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
		case ModelPackage.NETZANSCHLUSSPUNKT__LANGBESCHREIBUNG:
			return LANGBESCHREIBUNG_EDEFAULT == null ? langbeschreibung != null
					: !LANGBESCHREIBUNG_EDEFAULT.equals(langbeschreibung);
		case ModelPackage.NETZANSCHLUSSPUNKT__POSTITION:
			return postition != POSTITION_EDEFAULT;
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
		result.append(" (beschreibung: ");
		result.append(beschreibung);
		result.append(", langbeschreibung: ");
		result.append(langbeschreibung);
		result.append(", postition: ");
		result.append(postition);
		result.append(')');
		return result.toString();
	}

} //NetzanschlusspunktImpl

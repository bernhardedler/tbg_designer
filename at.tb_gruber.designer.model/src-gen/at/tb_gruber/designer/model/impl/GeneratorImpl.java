/**
 */
package at.tb_gruber.designer.model.impl;

import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.Generatorfunktion;
import at.tb_gruber.designer.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.tb_gruber.designer.model.impl.GeneratorImpl#getGeneratorfunktion <em>Generatorfunktion</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.GeneratorImpl#getFunktionSonstig <em>Funktion Sonstig</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.GeneratorImpl#getElektrischeLeistung <em>Elektrische Leistung</em>}</li>
 *   <li>{@link at.tb_gruber.designer.model.impl.GeneratorImpl#getErzeugteEnergie <em>Erzeugte Energie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends AnlageMitAttributenImpl implements Generator {
	/**
	 * The default value of the '{@link #getGeneratorfunktion() <em>Generatorfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorfunktion()
	 * @generated
	 * @ordered
	 */
	protected static final Generatorfunktion GENERATORFUNKTION_EDEFAULT = Generatorfunktion.PV_GENERATOR;

	/**
	 * The cached value of the '{@link #getGeneratorfunktion() <em>Generatorfunktion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorfunktion()
	 * @generated
	 * @ordered
	 */
	protected Generatorfunktion generatorfunktion = GENERATORFUNKTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunktionSonstig() <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionSonstig()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNKTION_SONSTIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunktionSonstig() <em>Funktion Sonstig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionSonstig()
	 * @generated
	 * @ordered
	 */
	protected String funktionSonstig = FUNKTION_SONSTIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getElektrischeLeistung() <em>Elektrische Leistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElektrischeLeistung()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEKTRISCHE_LEISTUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElektrischeLeistung() <em>Elektrische Leistung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElektrischeLeistung()
	 * @generated
	 * @ordered
	 */
	protected String elektrischeLeistung = ELEKTRISCHE_LEISTUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getErzeugteEnergie() <em>Erzeugte Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErzeugteEnergie()
	 * @generated
	 * @ordered
	 */
	protected static final String ERZEUGTE_ENERGIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErzeugteEnergie() <em>Erzeugte Energie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErzeugteEnergie()
	 * @generated
	 * @ordered
	 */
	protected String erzeugteEnergie = ERZEUGTE_ENERGIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Generatorfunktion getGeneratorfunktion() {
		return generatorfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneratorfunktion(Generatorfunktion newGeneratorfunktion) {
		Generatorfunktion oldGeneratorfunktion = generatorfunktion;
		generatorfunktion = newGeneratorfunktion == null ? GENERATORFUNKTION_EDEFAULT : newGeneratorfunktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERATOR__GENERATORFUNKTION,
					oldGeneratorfunktion, generatorfunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErzeugteEnergie() {
		return erzeugteEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErzeugteEnergie(String newErzeugteEnergie) {
		String oldErzeugteEnergie = erzeugteEnergie;
		erzeugteEnergie = newErzeugteEnergie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERATOR__ERZEUGTE_ENERGIE,
					oldErzeugteEnergie, erzeugteEnergie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElektrischeLeistung() {
		return elektrischeLeistung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElektrischeLeistung(String newElektrischeLeistung) {
		String oldElektrischeLeistung = elektrischeLeistung;
		elektrischeLeistung = newElektrischeLeistung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERATOR__ELEKTRISCHE_LEISTUNG,
					oldElektrischeLeistung, elektrischeLeistung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunktionSonstig() {
		return funktionSonstig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunktionSonstig(String newFunktionSonstig) {
		String oldFunktionSonstig = funktionSonstig;
		funktionSonstig = newFunktionSonstig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERATOR__FUNKTION_SONSTIG,
					oldFunktionSonstig, funktionSonstig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.GENERATOR__GENERATORFUNKTION:
			return getGeneratorfunktion();
		case ModelPackage.GENERATOR__FUNKTION_SONSTIG:
			return getFunktionSonstig();
		case ModelPackage.GENERATOR__ELEKTRISCHE_LEISTUNG:
			return getElektrischeLeistung();
		case ModelPackage.GENERATOR__ERZEUGTE_ENERGIE:
			return getErzeugteEnergie();
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
		case ModelPackage.GENERATOR__GENERATORFUNKTION:
			setGeneratorfunktion((Generatorfunktion) newValue);
			return;
		case ModelPackage.GENERATOR__FUNKTION_SONSTIG:
			setFunktionSonstig((String) newValue);
			return;
		case ModelPackage.GENERATOR__ELEKTRISCHE_LEISTUNG:
			setElektrischeLeistung((String) newValue);
			return;
		case ModelPackage.GENERATOR__ERZEUGTE_ENERGIE:
			setErzeugteEnergie((String) newValue);
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
		case ModelPackage.GENERATOR__GENERATORFUNKTION:
			setGeneratorfunktion(GENERATORFUNKTION_EDEFAULT);
			return;
		case ModelPackage.GENERATOR__FUNKTION_SONSTIG:
			setFunktionSonstig(FUNKTION_SONSTIG_EDEFAULT);
			return;
		case ModelPackage.GENERATOR__ELEKTRISCHE_LEISTUNG:
			setElektrischeLeistung(ELEKTRISCHE_LEISTUNG_EDEFAULT);
			return;
		case ModelPackage.GENERATOR__ERZEUGTE_ENERGIE:
			setErzeugteEnergie(ERZEUGTE_ENERGIE_EDEFAULT);
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
		case ModelPackage.GENERATOR__GENERATORFUNKTION:
			return generatorfunktion != GENERATORFUNKTION_EDEFAULT;
		case ModelPackage.GENERATOR__FUNKTION_SONSTIG:
			return FUNKTION_SONSTIG_EDEFAULT == null ? funktionSonstig != null
					: !FUNKTION_SONSTIG_EDEFAULT.equals(funktionSonstig);
		case ModelPackage.GENERATOR__ELEKTRISCHE_LEISTUNG:
			return ELEKTRISCHE_LEISTUNG_EDEFAULT == null ? elektrischeLeistung != null
					: !ELEKTRISCHE_LEISTUNG_EDEFAULT.equals(elektrischeLeistung);
		case ModelPackage.GENERATOR__ERZEUGTE_ENERGIE:
			return ERZEUGTE_ENERGIE_EDEFAULT == null ? erzeugteEnergie != null
					: !ERZEUGTE_ENERGIE_EDEFAULT.equals(erzeugteEnergie);
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
		result.append(" (generatorfunktion: ");
		result.append(generatorfunktion);
		result.append(", funktionSonstig: ");
		result.append(funktionSonstig);
		result.append(", elektrischeLeistung: ");
		result.append(elektrischeLeistung);
		result.append(", erzeugteEnergie: ");
		result.append(erzeugteEnergie);
		result.append(')');
		return result.toString();
	}

} //GeneratorImpl

package at.tb_gruber.designer.design;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerMitZaehler;

/**
 * The services class used by VSM.
 */
public class TableServices {

	private CSVPropertyProvider props = null;
	private DiagramServices ds = new DiagramServices();
	
	public String getTrafospannung(EObject self) {
		return ds.isTrafo(self) ? ((Trafo) self).getSekundaerspannung().getLiteral() : "";
	}

	public String getTrafoKVA(EObject self) {
		return ds.isTrafo(self) ? String.valueOf(((Trafo) self).getTrafoKva()) : "";
	}

	public String getClassName(EObject self) {
		return self.eClass().getName();
	}

	public String getReserve3(EObject self) {
		if (self instanceof Trafo) {
			return ((Trafo) self).getReserve3();
		} else {
			return "";
		}
	}
	
	public String getZpNrHaupt(EObject self) {
		if (self instanceof VerteilerMitZaehler) {
			return ((VerteilerMitZaehler)self).getNrHauptversorgung();
		} else {
			return "";
		}
	}

	public String getZpNrReserveEinsp(EObject self) {
		if (self instanceof VerteilerMitZaehler) {
			return ((VerteilerMitZaehler)self).getNrReserveEinspeisung();
		} else {
			return "";
		}
	}

	public String getAnlageart(EObject self) {
		String art = "";
		if (self instanceof AnlageMitAttributen) {
			art = self.getClass().getInterfaces()[0].getSimpleName();
			if (self instanceof Energietechnikanlage) {
				art += " (" + ((Energietechnikanlage) self).getEtType() + ")";
			}
		}
		return art;
	}

	public String getZielAdresse(EObject self) {
		ensurePropsInitialized();
		String adresse = "";
		if (self instanceof Verbindung) {
			Objekt objekt = (Objekt) ((Verbindung) self).getZiel().eContainer();
			String id = objekt.getObjektId();
			adresse = props.getAdresseForId(id, objekt.getExterneQuelle());
			if (adresse.isEmpty()) {
				adresse = objekt.getOrt_adresse();
			}
		}
		return adresse;
	}

	public String getZielObjektName(EObject self) {
		ensurePropsInitialized();
		String objektName = "";
		if (self instanceof Verbindung) {
			Objekt objekt = (Objekt) ((Verbindung) self).getZiel().eContainer();
			String id = objekt.getObjektId();
			objektName = props.getObjektNameForId(id, objekt.getExterneQuelle());
			if (objektName.isEmpty()) {
				objektName = objekt.getName();
			}
		}
		return objektName;
	}

	public String getZielGebaeudeart(EObject self) {
		ensurePropsInitialized();
		String objektName = "";
		if (self instanceof Verbindung) {
			Objekt objekt = (Objekt) ((Verbindung) self).getZiel().eContainer();
			String id = objekt.getObjektId();
			objektName = props.getGebaeudeartForId(id, objekt.getExterneQuelle());
			if (objektName.isEmpty()) {
				objektName = objekt.getGebaeudeart();
			}
		}
		return objektName;
	}

	public String getUrsprungVersorgtVonPK(EObject self) {
		String pk = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (!ursprung.getVersorgtVon().isEmpty()) {
				Objekt objekt = (Objekt) ((Verbindung) self).getZiel().eContainer();
				Bahnhof bahnhof = (Bahnhof) objekt.eContainer();
				pk = bahnhof.getName() + "_" + ursprung.getVersorgtVon().get(0).getNr();
			}
		}
		return pk;
	}

	private void ensurePropsInitialized() {
		if (props == null) {
			props = new CSVPropertyProvider();
		}
	}
}
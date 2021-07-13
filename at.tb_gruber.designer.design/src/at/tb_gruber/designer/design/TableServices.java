package at.tb_gruber.designer.design;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energiespeicherfunktion;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.Generatorfunktion;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Umrichterart;
import at.tb_gruber.designer.model.Umrichterfunktion;
import at.tb_gruber.designer.model.Verbindung;
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
			return ((VerteilerMitZaehler) self).getNrHauptversorgung();
		} else {
			return "";
		}
	}

	public String getZpNrReserveEinsp(EObject self) {
		if (self instanceof VerteilerMitZaehler) {
			return ((VerteilerMitZaehler) self).getNrReserveEinspeisung();
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

	public String getZielObjektName(EObject self) {
		ensurePropsInitialized();
		String objektName = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			String id = objekt.getObjektId();
			objektName = props.getObjektNameForId(id, objekt.getExterneQuelle());
			if (objektName.isEmpty()) {
				objektName = objekt.getName();
			}
		}
		return objektName;
	}

	public String getUrsprungVersorgtVonPK(EObject self) {
		String pk = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (!ursprung.getVersorgtVon().isEmpty()) {
				Objekt objekt = getObjektForVerbindung((Verbindung) self);
				Bahnhof bahnhof = (Bahnhof) objekt.eContainer();
				pk = bahnhof.getName() + "_" + ursprung.getVersorgtVon().get(0).getNr();
			}
		}
		return pk;
	}

	public String getZielObjektart(EObject self) {
		String objektart = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			objektart = objekt.getObjektart().getLiteral();
		}
		return objektart;
	}

	public String getBahnhof(EObject self) {
		String bahnhof = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			Bahnhof bhf = (Bahnhof) objekt.eContainer();
			bahnhof = bhf.getName();
		}
		return bahnhof;
	}

	public String getProjekt(EObject self) {
		String projekt = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			Bahnhof bhf = (Bahnhof) objekt.eContainer();
			projekt = bhf.getProjektname();
		}
		return projekt;
	}

	public String getGps(EObject self) {
		String gps = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			gps = objekt.getGpsstandort();
		}
		return gps;
	}

	public String getZielAdresse(EObject self) {
		ensurePropsInitialized();
		String adresse = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			String id = objekt.getObjektId();
			adresse = props.getAdresseForId(id, objekt.getExterneQuelle());
			if (adresse.isEmpty()) {
				adresse = objekt.getOrt_adresse();
			}
		}
		return adresse;
	}

	public String getObjektId(EObject self) {
		String objektId = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			objektId = objekt.getObjektId();
		}
		return objektId;
	}

	public String getDb776ua(EObject self) {
		String db776ua = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			db776ua = objekt.getDb776ua();
		}
		return db776ua;
	}

	public String getZielGebaeudeart(EObject self) {
		ensurePropsInitialized();
		String gebaeudeart = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			String id = objekt.getObjektId();
			gebaeudeart = props.getGebaeudeartForId(id, objekt.getExterneQuelle());
			if (gebaeudeart.isEmpty()) {
				gebaeudeart = objekt.getGebaeudeart();
			}
		}
		return gebaeudeart;
	}

	private Objekt getObjektForVerbindung(Verbindung self) {
		if (((Verbindung) self).getZiel().eContainer() instanceof VerteilerContainer) {
			return (Objekt) ((VerteilerContainer) ((Verbindung) self).getZiel().eContainer()).eContainer();
		} else {
			return (Objekt) ((Verbindung) self).getZiel().eContainer();
		}
	}

	public String getZielAnlagenArt(EObject self) {
		String art = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			art = ziel.eClass().getName();
		}
		return art;
	}

	public String getZielAnlagenBetreiber(EObject self) {
		String betreiber = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof VerteilerBase) {
				betreiber = ((VerteilerContainer) ((VerteilerBase) ziel).eContainer()).getBetreiber().getName();
			} else {
				betreiber = Optional.ofNullable(ziel.getBetreiber()).map(Betreiber::getName).orElse("");
			}
		}
		return betreiber;
	}

	public String getZielAnlagenFunktion(EObject self) {
		String funktion = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Generator) {
				Generatorfunktion f = ((Generator) ziel).getGeneratorfunktion();
				if (Generatorfunktion.SONSTIG_VALUE == f.getValue()) {
					funktion = ((Generator) ziel).getFunktionSonstig();
				} else {
					funktion = f.getLiteral();
				}
			} else if (ziel instanceof Umrichter) {
				Umrichterfunktion f = ((Umrichter) ziel).getUmrichterfunktion();
				if (Umrichterfunktion.SONSTIG_VALUE == f.getValue()) {
					funktion = ((Umrichter) ziel).getFunktionSonstig();
				} else {
					funktion = f.getLiteral();
				}
			} else if (ziel instanceof Energiespeicher) {
				Energiespeicherfunktion f = ((Energiespeicher) ziel).getEnergiespeicherfunktion();
				if (Energiespeicherfunktion.SONSTIG_VALUE == f.getValue()) {
					funktion = ((Energiespeicher) ziel).getFunktionSonstig();
				} else {
					funktion = f.getLiteral();
				}
			}
		}
		return funktion;
	}

	public String getGeneratorErzeugteEnergie(EObject self) {
		String energie = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Generator) {
				energie = ((Generator) ziel).getErzeugteEnergie();
			}
		}
		return energie;
	}

	public String getGeneratorElektrischeLeistung(EObject self) {
		String leistung = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Generator) {
				leistung = ((Generator) ziel).getElektrischeLeistung();
			}
		}
		return leistung;
	}

	public String getUmrichterArt(EObject self) {
		String art = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Umrichter) {
				art = ((Umrichter) ziel).getUmrichterart().getLiteral();
			}
		}
		return art;
	}

	private void ensurePropsInitialized() {
		if (props == null) {
			props = new CSVPropertyProvider();
		}
	}
}
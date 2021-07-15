package at.tb_gruber.designer.design;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Eadb_Versorgung_Art;
import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energiespeicherfunktion;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.Generatorfunktion;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Umrichterfunktion;
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

	public String getZielObjektart(EObject self) {
		String objektart = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			objektart = objekt.getObjektart().getLiteral();
		}
		return objektart;
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

	public String getDb776ua(EObject self) {
		String db776ua = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			db776ua = objekt.getDb776ua();
		}
		return db776ua;
	}

	public String getZielAnlagenname(EObject self) {
		String name = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			name = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getName).orElse("");
		}
		return name;
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
			if (self instanceof AnlageMitAttributen) {
				art = ziel.getClass().getInterfaces()[0].getSimpleName();
				if (self instanceof Energietechnikanlage) {
					art += " (" + ((Energietechnikanlage) self).getEtType() + ")";
				}
			} else if (ziel instanceof Netzanschlusspunkt) {
				Netzanschlusspunkt nap = (Netzanschlusspunkt) ziel;
				if (nap.eContainer() instanceof VerteilerContainer) {
					art = "Verteiler";
				}
			} else if (ziel instanceof VerteilerBase) {
				art = "Verteiler";
			}
		}
		return art;
	}

	public String getZielAnlagenBetreiber(EObject self) {
		String betreiber = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof VerteilerBase) {
				VerteilerContainer container = (VerteilerContainer) ((VerteilerBase) ziel).eContainer();
				betreiber = Optional.ofNullable(container.getBetreiber()).map(Betreiber::getName).orElse("");
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

	public String getUmrichterNennleistung(EObject self) {
		String nennleistung = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Umrichter) {
				nennleistung = ((Umrichter) ziel).getNennleistung();
			}
		}
		return nennleistung;
	}

	public String getEnergiespeicherSpeicherart(EObject self) {
		String art = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Energiespeicher) {
				art = ((Energiespeicher) ziel).getEnergiespeicherart().getLiteral();
			}
		}
		return art;
	}

	public String getEnergiespeicherAutonomiezeit(EObject self) {
		String zeit = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Energiespeicher) {
				zeit = ((Energiespeicher) ziel).getAutonomiezeit();
			}
		}
		return zeit;
	}

	public String getEnergiespeicherKapazitaet(EObject self) {
		String kapazitaet = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Energiespeicher) {
				kapazitaet = ((Energiespeicher) ziel).getKapazitaet();
			}
		}
		return kapazitaet;
	}

	public String getAnlagennummer(EObject self) {
		String nummer = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			nummer = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getAnlagennummer).orElse("");
		}
		return nummer;
	}

	public String getPrimaryKey(EObject self) {
		String pk = "";
		if (self instanceof Verbindung) {
			Objekt objekt = getObjektForVerbindung((Verbindung) self);
			Bahnhof bahnhof = (Bahnhof) objekt.eContainer();
			pk = bahnhof.getName() + "_" + ((Verbindung) self).getNr();
		}
		return pk;

	}

	public String getEadbId(EObject self) {
		String eadbid = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			eadbid = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getEadbId).orElse("");
		}
		return eadbid;
	}

	public String getInObjektteil(EObject self) {
		String inobjektteil = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			inobjektteil = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getInObjektteil).orElse("");
		}
		return inobjektteil;
	}

	public String getEadbVersorgungArt(EObject self) {
		String art = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			art = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getEadbVersorgungArt)
					.map(Eadb_Versorgung_Art::getLiteral).orElse("");
		}
		return art;
	}

	public String getPrimaerspannung(EObject self) {
		String spannung = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof AnlageMitAttributen) {
				spannung = ((AnlageMitAttributen) ziel).getPrimaerspannung().getLiteral();
			} else if (ziel instanceof VerteilerBase) {
				spannung = ((VerteilerContainer) ((VerteilerBase) ziel).eContainer()).getPrimaerspannung().getLiteral();
			}
		}
		return spannung;
	}

	public String getReserve1(EObject self) {
		String reserve = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof AnlageMitAttributen) {
				reserve = ((AnlageMitAttributen) ziel).getReserve1();
			}
		}
		return reserve;
	}

	public String getReserve2(EObject self) {
		String reserve = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof AnlageMitAttributen) {
				reserve = ((AnlageMitAttributen) ziel).getReserve2();
			}
		}
		return reserve;
	}

	public String getSekundaerspannung(EObject self) {
		String spannung = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Trafo) {
				spannung = ((Trafo) ziel).getSekundaerspannung().getLiteral();

			}
		}
		return spannung;
	}

	public String getTrafoKva(EObject self) {
		String kva = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Trafo) {
				kva = ((Trafo) ziel).getTrafoKva();
			}
		}
		return kva;
	}

	public String getReserve3(EObject self) {
		String reserve = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Trafo) {
				reserve = ((Trafo) ziel).getReserve3();
			}
		}
		return reserve;
	}

	public String getZpNrHaupt(EObject self) {
		String nrHaupt = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof VerteilerMitZaehler) {
				nrHaupt = ((VerteilerMitZaehler) ziel).getNrHauptversorgung();
			}
		}
		return nrHaupt;
	}

	public String getZpNrReserve(EObject self) {
		String nrReserve = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof VerteilerMitZaehler) {
				nrReserve = ((VerteilerMitZaehler) ziel).getNrReserveEinspeisung();
			}
		}
		return nrReserve;
	}

	public String getNapKurz(EObject self) {
		String napKurz = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Netzanschlusspunkt) {
				napKurz = ((Netzanschlusspunkt) ziel).getBeschreibung();
			} else if (ziel instanceof VerteilerBase) {
				napKurz = Optional.ofNullable(((VerteilerBase) ziel).getNetzanschlusspunkt())
						.map(Netzanschlusspunkt::getBeschreibung).orElse("");
			} else if (ziel instanceof Versorgungsknoten) {
				napKurz = Optional.ofNullable(((Versorgungsknoten) ziel).getNetzanschlusspunkt())
						.map(Netzanschlusspunkt::getBeschreibung).orElse("");
			}
		}
		return napKurz;
	}

	public String getNapLang(EObject self) {
		String napLang = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			if (ziel instanceof Netzanschlusspunkt) {
				napLang = ((Netzanschlusspunkt) ziel).getLangbeschreibung();
			} else if (ziel instanceof VerteilerBase) {
				napLang = Optional.ofNullable(((VerteilerBase) ziel).getNetzanschlusspunkt())
						.map(Netzanschlusspunkt::getLangbeschreibung).orElse("");
			} else if (ziel instanceof Versorgungsknoten) {
				napLang = Optional.ofNullable(((Versorgungsknoten) ziel).getNetzanschlusspunkt())
						.map(Netzanschlusspunkt::getLangbeschreibung).orElse("");
			}
		}
		return napLang;
	}

	public String getUrsprungAnlagenname(EObject self) {
		String name = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (ursprung instanceof AnlageMitAttributen) {
				name = ((AnlageMitAttributen) ursprung).getName();
			}
		}
		return name;
	}

	public String getUrsprungAnlagennummer(EObject self) {
		String nummer = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (ursprung instanceof AnlageMitAttributen) {
				nummer = ((AnlageMitAttributen) ursprung).getAnlagennummer();
			}
		}
		return nummer;
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

	public String getUrsprungEadbId(EObject self) {
		String eadbid = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (ursprung instanceof AnlageMitAttributen) {
				eadbid = ((AnlageMitAttributen) ursprung).getEadbId();
			}
		}
		return eadbid;
	}

	public String getUrsprungAbgangVt(EObject self) {
		String abgang = "";
		if (self instanceof Verbindung) {
			AnlageBase ursprung = ((Verbindung) self).getUrsprung();
			if (ursprung instanceof AnlageMitAttributen) {
				abgang = ((AnlageMitAttributen) ursprung).getAbgangVT();
			}
		}
		return abgang;
	}

	public String getZielVerteilerbezeichnung(EObject self) {
		String verbez = "";
		if (self instanceof Verbindung) {
			AnlageBase ziel = ((Verbindung) self).getZiel();
			verbez = resolveAnlageMitAttributen(ziel).map(AnlageMitAttributen::getVerteilerbezeichnung).orElse("");
		}
		return verbez;
	}

	private Optional<AnlageMitAttributen> resolveAnlageMitAttributen(AnlageBase examinee) {
		Optional<AnlageMitAttributen> result = Optional.empty();
		if (examinee instanceof AnlageMitAttributen) {
			result = Optional.of((AnlageMitAttributen) examinee);
		} else if (examinee instanceof Netzanschlusspunkt) {
			Netzanschlusspunkt nap = (Netzanschlusspunkt) examinee;
			if (nap.eContainer() instanceof VerteilerContainer) {
				result = Optional.of(((VerteilerContainer) nap.eContainer()));
			}
		} else if (examinee instanceof VerteilerBase) {
			result = Optional.of(((VerteilerContainer) ((VerteilerBase) examinee).eContainer()));
		}
		return result;
	}

	private void ensurePropsInitialized() {
		if (props == null) {
			props = new CSVPropertyProvider();
		}
	}
}
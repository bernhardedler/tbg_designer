package at.tb_gruber.designer.design;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.LayoutData;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerMitZaehler;

/**
 * The services class used by VSM.
 */
public class DiagramServices {

	private CSVPropertyProvider props = CSVPropertyProvider.getInstance();

	/**
	 * Erstellt die nächst niedrige, noch nicht vergebene ID
	 * 
	 * @param self
	 * @return
	 */
	public Integer generateID(EObject self) {
		AnlageBase parent = (AnlageBase) self.eContainer();
		EObject container = parent.eContainer();
		Bahnhof project = null;
		if (container instanceof Objekt) {
			Objekt containerObj = (Objekt) container;
			project = (Bahnhof) containerObj.eContainer();
		} else if (container instanceof VerteilerContainer) {
			VerteilerContainer vtc = (VerteilerContainer) container;
			Objekt containerObj = (Objekt) vtc.eContainer();
			project = (Bahnhof) containerObj.eContainer();
		}

		Set<Integer> alleIds = new TreeSet<Integer>();
		for (Objekt objekt : project.getObjekt()) {
			for (AnlageBase anlage : objekt.getAnlage()) {
				if (anlage instanceof VerteilerContainer) {
					for (VerteilerBase verteiler : ((VerteilerContainer) anlage).getVerteiler()) {
						for (Verbindung verbindung : verteiler.getVerbindungNach()) {
							alleIds.add(verbindung.getNr());
						}
					}
				}
				for (Verbindung verbindung : anlage.getVerbindungNach()) {
					alleIds.add(verbindung.getNr());
				}
			}
		}

		Integer[] alleIdsArray = new Integer[alleIds.size()];
		alleIdsArray = alleIds.toArray(alleIdsArray);

		for (int i = 1; i < alleIdsArray.length; i++) {
			if (i != alleIdsArray[i]) {
				return i;
			}
		}
		return alleIdsArray.length;
	}

	public String getLabelUrsprung(EObject self) {
		StringBuilder label = new StringBuilder();
		if (self instanceof Verbindung) {
			Verbindung v = (Verbindung) self;
			label.append(v.getNr());
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getQuellSicherung()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabeltype()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabellaenge()).orElse(""));
		}
		return label.toString();
	}

	public String getLabelZiel(EObject self) {
		StringBuilder label = new StringBuilder();
		if (self instanceof Verbindung) {
			Verbindung v = (Verbindung) self;
			label.append(v.getNr());
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getZielSicherung()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabeltype()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabellaenge()).orElse(""));
		}
		return label.toString();
	}

	private Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof Verbindung) {
			return target.equals(((Verbindung) self).getPrimaerspannung().getValue());
		} else if (self instanceof AnlageMitAttributen) {
			return target.equals(((AnlageMitAttributen) self).getPrimaerspannung().getValue());
		} else if (self instanceof VerteilerBase) {
			return target
					.equals(((VerteilerContainer) ((VerteilerBase) self).eContainer()).getPrimaerspannung().getValue());
		}
		return false;
	}

	public Boolean isTrafo(EObject self) {
		return self instanceof Trafo;
	}

	public Boolean isEt(EObject self) {
		return self instanceof Energietechnikanlage;
	}

	public Boolean isVk(EObject self) {
		return self instanceof Versorgungsknoten;
	}

	public Boolean isVspViolett(EObject self) {
		return isSpannungsart(self, Spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isVspRot(EObject self) {
		return isSpannungsart(self, Spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isVspBlau(EObject self) {
		return isSpannungsart(self, Spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isVspGruen(EObject self) {
		return isSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isVspMagenta(EObject self) {
		return isSpannungsart(self, Spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isVspCyan(EObject self) {
		return isSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isVspBraun(EObject self) {
		return isSpannungsart(self, Spannungsarttype.RESERVE_2_VALUE);
	}

	public Boolean isTspViolett(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isTspRot(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isTspBlau(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isTspGruen(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isTspMagenta(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isTspCyan(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isTspBraun(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.RESERVE_2_VALUE);
	}

	private Boolean isTrafoSpannungsart(EObject self, Integer target) {
		if (self instanceof Trafo) {
			return target.equals(((Trafo) self).getSekundaerspannung().getValue());
		}
		return false;
	}

	public String getVersorgungsknotenSize(EObject self) {
		int cnt = ((AnlageMitAttributen) self).getVerbindungNach().size();
		return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";
	}

	public Boolean isNapVor(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public Boolean isNapMitte(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public Boolean isNapNach(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public List<String> getAllBetreiber(EObject self) {
		return props.getBetreiber();
	}

	public List<String> getAllEigentuemer(EObject self) {
		return props.getEigentuemer();
	}

	public Boolean isSolid(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.HAUPTVERSORGUNG);
	}

	public Boolean isDot(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.EVU);
	}

	public Boolean isDash(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_OEBB);
	}

	public Boolean isDashDot(EObject self) {
		return self instanceof Verbindung
				&& ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_DRITTER);
	}

	public String createDetailsText(EObject self) {
		if (self.eContainer() instanceof Umrichter) {
			return ((Umrichter) self.eContainer()).getNennleistung();
		} else if (self.eContainer() instanceof Energiespeicher) {
			Energiespeicher esp = (Energiespeicher) self.eContainer();
			return Optional.ofNullable(esp.getAutonomiezeit()).orElse("");
		} else if (self.eContainer() instanceof Trafo) {
			Trafo trafo = (Trafo) self.eContainer();
			return Optional.ofNullable(trafo.getOberspannung()).orElse("0V") + "/" + Optional.ofNullable(trafo.getUnterspannung()).orElse("0V") 
					+ System.lineSeparator()
					+ System.lineSeparator() 
					+ Optional.ofNullable(trafo.getTrafoKva()).orElse("0kVA");
		} else if (self.eContainer() instanceof Generator) {
			Generator gen = (Generator) self.eContainer();
			return Optional.ofNullable(gen.getErzeugteSpannung()).orElse("0V") 
					+ System.lineSeparator() 
					+ System.lineSeparator() 
					+ Optional.ofNullable(gen.getErzeugteEnergie()).orElse("0")
					+ System.lineSeparator() 
					+ Optional.ofNullable(gen.getElektrischeLeistung()).orElse("0W");
		} else if (self.eContainer() instanceof VerteilerMitZaehler) {
			return ((VerteilerMitZaehler) self.eContainer()).getNrHauptversorgung();
		}
		return "";
	}

	public Boolean isVerteilerContainerNap(EObject self) {
		return self instanceof Netzanschlusspunkt
				&& ((Netzanschlusspunkt) self).eContainer() instanceof VerteilerContainer;
	}
	
}
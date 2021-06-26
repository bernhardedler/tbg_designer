package at.tb_gruber.designer.design;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.spannungsarttype;

/**
 * The services class used by VSM.
 */
public class DiagramServices {

	private CSVPropertyProvider props = null;
	
	private void ensurePropsInitialized() {
		if (props == null) {
			props = new CSVPropertyProvider();
		}
	}
	
	/**
	 * Erstellt die nächst niedrige, noch nicht vergebene ID
	 * 
	 * @param self
	 * @return
	 */
	public Integer generateID(EObject self) {
		Anlage parent = (Anlage) self.eContainer();
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
		
		List<Integer> alleIds = project.getObjekt().stream().flatMap(obj -> obj.getAnlage().stream())
				.flatMap(anl -> anl.getVerbindungNach().stream()).map(ver -> ver.getNr()).collect(Collectors.toList());
		alleIds.sort((x, y) -> x.compareTo(y));

		Integer[] alleIdsArray = new Integer[alleIds.size()];
		alleIdsArray = alleIds.toArray(alleIdsArray);

		for (int i = 1; i < alleIdsArray.length; i++) {
			if (i != alleIdsArray[i]) {
				return i;
			}
		}
		return alleIdsArray.length;
	}

	private Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof Verbindung) {
			return target.equals(((Verbindung) self).getPrimaerspannung().getValue());
		} else if (self instanceof Anlage) {
			return target.equals(((Anlage) self).getPrimaerspannung().getValue());
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
		return isSpannungsart(self, spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isVspRot(EObject self) {
		return isSpannungsart(self, spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isVspBlau(EObject self) {
		return isSpannungsart(self, spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isVspGruen(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isVspMagenta(EObject self) {
		return isSpannungsart(self, spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isVspCyan(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isVspBraun(EObject self) {
		return isSpannungsart(self, spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isTspViolett(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isTspRot(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isTspBlau(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isTspGruen(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isTspMagenta(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isTspCyan(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isTspBraun(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.RESERVE_1_VALUE);
	}

	private Boolean isTrafoSpannungsart(EObject self, Integer target) {
		if (self instanceof Trafo) {
			return target.equals(((Trafo) self).getSekundaerspannung().getValue());
		}
		return false;
	}

	public String getVersorgungsknotenSize(EObject self) {
		int cnt = ((Anlage) self).getVerbindungNach().size();
		return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";
	}
	
	public Boolean isNapVor(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public Boolean isNapMitte(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}
	

	public Boolean isNapNach(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt()).map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}	

	public List<String> getAllBetreiber(EObject self){
		ensurePropsInitialized();
		
		return props.getBetreiber();
	}
	
	public Boolean isSolid(EObject self){
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.HAUPTVERSORGUNG);
	}

	public Boolean isDot(EObject self){
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.EVU);
	}

	public Boolean isDash(EObject self){
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_ÖBB);
	}

	public Boolean isDashDot(EObject self){
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_DRITTER);
	}
	
}
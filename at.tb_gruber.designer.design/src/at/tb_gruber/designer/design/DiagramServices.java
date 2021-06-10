package at.tb_gruber.designer.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.spannungsarttype;

/**
 * The services class used by VSM.
 */
public class DiagramServices {

	/**
	 * Erstellt die nächst niedrige, noch nicht vergebene ID
	 * 
	 * @param self
	 * @return
	 */
	public Integer generateID(EObject self) {
		Anlage parent = (Anlage) self.eContainer();
		Objekt container = (Objekt) parent.eContainer();
		Bahnhof project = (Bahnhof) container.eContainer();
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
		return isSpannungsart(self, spannungsarttype.VIOLETT_VALUE);
	}

	public Boolean isVspRot(EObject self) {
		return isSpannungsart(self, spannungsarttype.ROT_VALUE);
	}

	public Boolean isVspBlau(EObject self) {
		return isSpannungsart(self, spannungsarttype.BLAU_VALUE);
	}

	public Boolean isVspGruen(EObject self) {
		return isSpannungsart(self, spannungsarttype.GRÜN_VALUE);
	}

	public Boolean isVspMagenta(EObject self) {
		return isSpannungsart(self, spannungsarttype.MAGENTA_VALUE);
	}

	public Boolean isVspCyan(EObject self) {
		return isSpannungsart(self, spannungsarttype.CYAN_VALUE);
	}

	public Boolean isVspBraun(EObject self) {
		return isSpannungsart(self, spannungsarttype.BRAUN_VALUE);
	}

	public Boolean isTspViolett(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.VIOLETT_VALUE);
	}

	public Boolean isTspRot(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.ROT_VALUE);
	}

	public Boolean isTspBlau(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.BLAU_VALUE);
	}

	public Boolean isTspGruen(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.GRÜN_VALUE);
	}

	public Boolean isTspMagenta(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.MAGENTA_VALUE);
	}

	public Boolean isTspCyan(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.CYAN_VALUE);
	}

	public Boolean isTspBraun(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.BRAUN_VALUE);
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

}
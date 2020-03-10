package at.tb_gruber.designer.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VersorgungsknotenMitET;
import at.tb_gruber.designer.model.Zaehlpunkt;
import at.tb_gruber.designer.model.anlagearttype;
import at.tb_gruber.designer.model.spannungsarttype;
import at.tb_gruber.designer.model.impl.AnlageImpl;
import at.tb_gruber.designer.model.impl.VerbindungImpl;

/**
 * The services class used by VSM.
 */
public class Services {

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
		if (self instanceof VerbindungImpl) {
			return target.equals(((VerbindungImpl) self).getPrimaerspannung().getValue());
		} else if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getPrimaerspannung().getValue());
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

	public Boolean isVkEt(EObject self) {
		return self instanceof VersorgungsknotenMitET;
	}

	public Boolean isZp(EObject self) {
		return self instanceof Zaehlpunkt;
	}

	public Boolean isVspViolett(EObject self) {
		return isSpannungsart(self, spannungsarttype.RESERVE_VIOLETT_VALUE);
	}

	public Boolean isVspRot(EObject self) {
		return isSpannungsart(self, spannungsarttype._20K_V50_HZ_VALUE);
	}

	public Boolean isVspBlau(EObject self) {
		return isSpannungsart(self, spannungsarttype._10K_V50_HZ_VALUE);
	}

	public Boolean isVspGruen(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP50_HZ_VALUE);
	}

	public Boolean isVspMagenta(EObject self) {
		return isSpannungsart(self, spannungsarttype._15K_V16_7HZ_VALUE);
	}

	public Boolean isVspCyan(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP16_7HZ_VALUE);
	}

	public Boolean isVspBraun(EObject self) {
		return isSpannungsart(self, spannungsarttype.RESERVE_HELLBRAUN_VALUE);
	}

	public Boolean isTspViolett(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.RESERVE_VIOLETT_VALUE);
	}

	public Boolean isTspRot(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype._20K_V50_HZ_VALUE);
	}

	public Boolean isTspBlau(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype._10K_V50_HZ_VALUE);
	}

	public Boolean isTspGruen(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.NSP50_HZ_VALUE);
	}

	public Boolean isTspMagenta(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype._15K_V16_7HZ_VALUE);
	}

	public Boolean isTspCyan(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.NSP16_7HZ_VALUE);
	}

	public Boolean isTspBraun(EObject self) {
		return isTrafoSpannungsart(self, spannungsarttype.RESERVE_HELLBRAUN_VALUE);
	}

	private Boolean isTrafoSpannungsart(EObject self, Integer target) {
		if (self instanceof Trafo) {
			return target.equals(((Trafo) self).getSekundaerspannung().getValue());
		}
		return false;
	}

	public String getVersorgungsknotenSize(EObject self) {
		int cnt = ((AnlageImpl) self).getVerbindungNach().size();
		return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";
	}

	public String getTrafospannung(EObject self) {
		return isTrafo(self) ? ((Trafo) self).getSekundaerspannung().getLiteral() : "";
	}

	public String getTrafoKVA(EObject self) {
		return isTrafo(self) ? String.valueOf(((Trafo) self).getTrafoKva()) : "";
	}
	
	public String getClassName(EObject self) {
		return self.eClass().getName();
	}
}

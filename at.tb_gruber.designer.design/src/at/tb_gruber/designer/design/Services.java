package at.tb_gruber.designer.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.*;
import at.tb_gruber.designer.model.impl.AnlageImpl;
import at.tb_gruber.designer.model.impl.VerbindungImpl;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

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

	public Boolean isSpannungsart0(EObject self) {
		return isSpannungsart(self, spannungsarttype.RESERVE_VIOLETT_VALUE);
	}

	public Boolean isSpannungsart1(EObject self) {
		return isSpannungsart(self, spannungsarttype._20K_V50_HZ_VALUE);
	}

	public Boolean isSpannungsart2(EObject self) {
		return isSpannungsart(self, spannungsarttype._10K_V50_HZ_VALUE);
	}

	public Boolean isSpannungsart3(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP50_HZ_VALUE);
	}

	public Boolean isSpannungsart4(EObject self) {
		return isSpannungsart(self, spannungsarttype._15K_V16_7HZ_VALUE);
	}

	public Boolean isSpannungsart5(EObject self) {
		return isSpannungsart(self, spannungsarttype.NSP16_7HZ_VALUE);
	}

	public Boolean isSpannungsart6(EObject self) {
		return isSpannungsart(self, spannungsarttype.RESERVE_HELLBRAUN_VALUE);
	}

	private Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof VerbindungImpl) {
			return target.equals(((VerbindungImpl) self).getVersorgungsspannung().getValue());
		} else if (self instanceof AnlageImpl) {
			return target.equals(((VerbindungImpl) self).getVersorgungsspannung().getValue());
		}
		return false;
	}
	
	private Boolean isAnlageart0(EObject self) {
		return isAnlageart(self, anlagearttype.UEGS_ZAEHLPUNKT_VALUE);
	}

	private Boolean isAnlageart1(EObject self) {
		return isAnlageart(self, anlagearttype.TRAFO_VALUE);
	}
	
	private Boolean isAnlageart2(EObject self) {
		return isAnlageart(self, anlagearttype.VERSORGUNGSKNOTEN_VALUE);
	}
	
	private Boolean isAnlageart3(EObject self) {
		return isAnlageart(self, anlagearttype.ENERGIETECHNIKANLAGE_VALUE);
	}
	
	private Boolean isAnlageart4(EObject self) {
		return isAnlageart(self, anlagearttype.VK_ET_VALUE);
	}

	private Boolean isAnlageart(EObject self, Integer target) {
		if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getAnlagenart().getValue());
		}
		return false;
	}
	
	public String getAnlageKombi(EObject self) {
		if (self instanceof AnlageImpl) {
			AnlageImpl anlage = (AnlageImpl) self;
			return anlage.getAnlagenart().getValue() + "_" + anlage.getVersorgungsspannung().getValue();
		}
		return "";
	}
	
	public Boolean isAnlageKombi(EObject self, Integer anlageart, Integer spannungsart) {
		return isAnlageart(self, anlageart) && isSpannungsart(self, spannungsart);
	}
}

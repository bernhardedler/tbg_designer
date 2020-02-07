package at.tb_gruber.designer.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import at.tb_gruber.designer.model.Anlage;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.anlagearttype;
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

	public Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof VerbindungImpl) {
			return target.equals(((VerbindungImpl) self).getVersorgungsspannung().getValue());
		} else if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getVersorgungsspannung().getValue());
		}
		return false;
	}

	private Boolean isAnlageart(EObject self, Integer target) {
		if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getAnlagenart().getValue());
		}
		return false;
	}

	public Boolean isAnlageart(EObject self, Integer anlageart, Integer spannungsart) {
		return isAnlageart(self, anlageart) && isSpannungsart(self, spannungsart);
	}

	private Boolean isTrafoSpannungsart(EObject self, Integer target) {
		if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getTrafospannung().getValue());
		}
		return false;
	}

	public Boolean isTrafoart(EObject self, Integer spannungsart, Integer trafoSpannungsart) {
		return isAnlageart(self, anlagearttype.TRAFO_VALUE) && isSpannungsart(self, spannungsart)
				&& isTrafoSpannungsart(self, trafoSpannungsart);
	}

	public Boolean isVersorgungsknotenSize(EObject self, Integer spannungsart, String size) {
		return isAnlageart(self, anlagearttype.VERSORGUNGSKNOTEN_VALUE)
				&& isSpannungsart(self, spannungsart)
				&& (size.equals(getVersorgungsknotenSize(self)));
	}

	public String getVersorgungsknotenSize(EObject self) {
		int cnt = ((AnlageImpl) self).getVerbindungNach().size();
		return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";
	}
}

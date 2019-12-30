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

	public Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof VerbindungImpl) {
			return target.equals(((VerbindungImpl) self).getVersorgungsspannung().getValue());
		} else if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getVersorgungsspannung().getValue());
		}
		return false;
	}

	public Boolean isAnlageart(EObject self, Integer target) {
		if (self instanceof AnlageImpl) {
			return target.equals(((AnlageImpl) self).getAnlagenart().getValue());
		}
		return false;
	}
	
	/**
	 * test javadoc
	 * @param self
	 * @param anlageart
	 * @param spannungsart
	 * @return
	 */
	public Boolean isAnlageart(EObject self, Integer anlageart, Integer spannungsart) {
		return isAnlageart(self, anlageart) && isSpannungsart(self, spannungsart);
	}

}

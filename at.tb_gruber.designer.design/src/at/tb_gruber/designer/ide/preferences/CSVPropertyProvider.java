package at.tb_gruber.designer.ide.preferences;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import at.tb_gruber.designer.model.externe_datenquelle;

public class CSVPropertyProvider {

	private List<ObjektInfo> objektInfos = new ArrayList<CSVPropertyProvider.ObjektInfo>();
	private static IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			TBGPreferencePage.PREFERENCE_SCOPE_IDENTIFIER);

	public CSVPropertyProvider() {
		registerListener();
		loadImmobilienDatei();
		loadVerkehrsstationenDatei();
		loadGebaeudeDatei();
	}

	public void registerListener() {
		IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				TBGPreferencePage.PREFERENCE_SCOPE_IDENTIFIER);
		preferenceStore.addPropertyChangeListener(new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (TBGPreferencePage.PROPERTY_ID_IMMO_DATEI.contentEquals(event.getProperty())) {
					loadImmobilienDatei();
				} else if (TBGPreferencePage.PROPERTY_ID_VERKEHRSSTATIONEN_DATEI.contentEquals(event.getProperty())) {
					loadVerkehrsstationenDatei();
				} else if (TBGPreferencePage.PROPERTY_ID_GEBAEUDE_DATEI.contentEquals(event.getProperty())) {
					loadGebaeudeDatei();
				}
			}
		});
	}

	public void loadImmobilienDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_IMMO_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}
		int idxObjektId, idxObjektName, idxGebaeudeArt, idxLand, idxPlz, idxOrt, idxStrasse;
		try (FileInputStream fis = new FileInputStream(csvPath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF8"))) {
			String line = "";

			/* Header */
			String header = br.readLine();
			if (header != null) {
				header = header.replace("\uFEFF", "");
				List<String> values = Arrays.asList(header.split(";"));
				idxObjektId = values.indexOf("Objekt-Nr");
				idxObjektName = values.indexOf("Objekt-Bezeichnung");
				idxGebaeudeArt = values.indexOf("Gebäudeart");
				idxLand = values.indexOf("Land");
				idxPlz = values.indexOf("PLZ");
				idxOrt = values.indexOf("Ort");
				idxStrasse = values.indexOf("Straße");
			} else {
				return;
			}

			/* Content */
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				Optional<ObjektInfo> opt = getForId(values[idxObjektId], externe_datenquelle.IMMO);
				if (opt.isPresent()) {
					ObjektInfo objekt = opt.get();
					objekt.setObjektName(values[idxObjektName]);
					objekt.setGebaeudeArt(values[idxGebaeudeArt]);
					objekt.setLand(values[idxLand]);
					objekt.setPlz(values[idxPlz]);
					objekt.setOrt(values[idxOrt]);
					objekt.setStrasse(values[idxStrasse]);
				} else {
					objektInfos.add(new ObjektInfo(values[idxObjektId], null, values[idxObjektName],
							values[idxGebaeudeArt], values[idxLand], values[idxPlz], values[idxOrt], values[idxStrasse],
							externe_datenquelle.IMMO));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadVerkehrsstationenDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_VERKEHRSSTATIONEN_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}
		int idxObjektId, idxObjektName, idxLand, idxPlz, idxOrt, idxStrasse;
		try (FileInputStream fis = new FileInputStream(csvPath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF8"))) {
			String line = "";

			/* Header */
			String header = br.readLine();
			if (header != null) {
				header = header.replace("\uFEFF", "");
				List<String> values = Arrays.asList(header.split(";"));
				idxObjektId = values.indexOf("Objekt-Nr");
				idxObjektName = values.indexOf("Objekt-Bez.");
				idxLand = values.indexOf("Land");
				idxPlz = values.indexOf("PLZ");
				idxOrt = values.indexOf("Ort");
				idxStrasse = values.indexOf("Straße");
			} else {
				return;
			}

			/* Content */
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				Optional<ObjektInfo> opt = getForId(values[idxObjektId], externe_datenquelle.VS);
				if (opt.isPresent()) {
					ObjektInfo objekt = opt.get();
					objekt.setObjektName(values[idxObjektName]);
					objekt.setLand(values[idxLand]);
					objekt.setPlz(values[idxPlz]);
					objekt.setOrt(values[idxOrt]);
					objekt.setStrasse(values[idxStrasse]);
				} else {
					objektInfos.add(new ObjektInfo(values[idxObjektId], null, values[idxObjektName], "Verkehrsstation",
							values[idxLand], values[idxPlz], values[idxOrt], values[idxStrasse],
							externe_datenquelle.VS));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadGebaeudeDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_GEBAEUDE_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}
		int idxStrNr, idxGebaeudeBezeichnung, idxGebNr, idxEntNr, idxPlz, idxOrt, idxStrasse, idxHausnummer;

		try (FileInputStream fis = new FileInputStream(csvPath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF8"))) {
			String line = "";

			/* Header */
			String header = br.readLine();
			if (header != null) {
				header = header.replace("\uFEFF", "");
				List<String> values = Arrays.asList(header.split(";"));
				idxStrNr = values.indexOf("STR_Nr");
				idxGebaeudeBezeichnung = values.indexOf("GEB_Bezeichnung");
				idxGebNr = values.indexOf("GEB_Nr");
				idxEntNr = values.indexOf("ENT_Nr");
				idxStrasse = values.indexOf("Strasse");
				idxHausnummer = values.indexOf("Nr");
				idxOrt = values.indexOf("Ort");
				idxPlz = values.indexOf("Plz");
			} else {
				return;
			}

			/* Content */
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				String objektName = values[idxStrNr] + "_" + values[idxGebaeudeBezeichnung];
				String strasseUndHausnummer = values[idxStrasse] + " " + values[idxHausnummer];
				Optional<ObjektInfo> opt = getForId(values[idxGebNr], externe_datenquelle.GEBAEUDE);
				if (opt.isPresent()) {
					ObjektInfo objekt = opt.get();
					objekt.setObjektName(objektName);
					objekt.setObjektId2(values[idxEntNr]);
					objekt.setLand("AT");
					objekt.setPlz(values[idxPlz]);
					objekt.setOrt(values[idxOrt]);
					objekt.setStrasse(strasseUndHausnummer);
				} else {
					objektInfos.add(new ObjektInfo(values[idxGebNr], values[idxEntNr], objektName, "Verkehrsstation",
							"AT", values[idxPlz], values[idxOrt], strasseUndHausnummer, externe_datenquelle.GEBAEUDE));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getAdresseForId(String id, externe_datenquelle quelle) {
		Optional<ObjektInfo> objektOpt = getForId(id, quelle);
		if (objektOpt.isPresent()) {
			ObjektInfo objekt = objektOpt.get();
			return Stream.of(objekt.getLand(), objekt.getPlz(), objekt.getOrt(), objekt.getStrasse())
					.collect(Collectors.joining(" "));
		} else {
			return "";
		}
	}

	public String getObjektNameForId(String id, externe_datenquelle quelle) {
		Optional<ObjektInfo> objektOpt = getForId(id, quelle);
		if (objektOpt.isPresent()) {
			ObjektInfo objekt = objektOpt.get();
			return objekt.getObjektName();
		} else {
			return "";
		}
	}

	public String getGebaeudeartForId(String id, externe_datenquelle quelle) {
		Optional<ObjektInfo> objektOpt = getForId(id, quelle);
		if (objektOpt.isPresent()) {
			ObjektInfo objekt = objektOpt.get();
			return objekt.getGebaeudeArt();
		} else {
			return "";
		}
	}

	public Set<String> getObjektIds() {
		return objektInfos.stream().map(ObjektInfo::getObjektId).collect(Collectors.toSet());
	}

	/*
	 * Falls doppelte Einträge aus den CSVs kommen, können sie über die quelle
	 * gefiltert werden. sonst geht das Duplikat-Objekt zurück
	 */
	private Optional<ObjektInfo> getForId(String id, externe_datenquelle quelle) {
		List<ObjektInfo> collect = objektInfos.parallelStream().filter(obj -> obj.getObjektId().equals(id))
				.collect(Collectors.toList());

		if (collect.isEmpty()) {
			if (externe_datenquelle.GEBAEUDE.equals(quelle)) { // bei gebäuden notfalls über sekundäre Id suchen
				List<ObjektInfo> collect2 = objektInfos.parallelStream().filter(obj -> obj.getObjektId2().equals(id))
						.collect(Collectors.toList());
				if (collect2.isEmpty()) {// wenn über sekundäre Id auch nichts gefunden wird, dann leer
					return Optional.empty();
				} else { // sonst damit weiterarbeiten
					collect = collect2;
				}
			} else { // alle anderen haben nur eine Id
				return Optional.empty();
			}
		}

		if (collect.size() == 1) { // wenn genau eins, super
			return Optional.of(collect.get(0));
		} else { // wenn mehrere, dann muss er die quelle wählen
			if (quelle == null) {
				return Optional.of(ObjektInfo.duplicate);
			} else {
				return collect.stream().filter(oi -> oi.getQuelle().equals(quelle)).findFirst();
			}
		}
	}

	public static class ObjektInfo {
		private static String duplicateWarning = "Eintrag doppelt vorhanden, bitte Datenquelle wählen";
		private static ObjektInfo duplicate = new ObjektInfo(duplicateWarning, duplicateWarning, duplicateWarning,
				duplicateWarning, duplicateWarning, duplicateWarning, duplicateWarning, duplicateWarning, null);

		String objektId;
		String objektId2;
		String objektName;
		String gebaeudeArt;
		String land;
		String plz;
		String ort;
		String strasse;
		externe_datenquelle quelle;

		public ObjektInfo(String objektId, String objektId2, String objektName, String gebaeudeArt, String land,
				String plz, String ort, String strasse, externe_datenquelle quelle) {
			this.objektId = objektId;
			this.objektId2 = objektId2;
			this.objektName = objektName;
			this.gebaeudeArt = gebaeudeArt;
			this.land = land;
			this.plz = plz;
			this.ort = ort;
			this.strasse = strasse;
			this.quelle = quelle;
		}

		public String getObjektId() {
			return objektId;
		}

		public void setObjektId(String objektId) {
			this.objektId = objektId;
		}

		public String getObjektName() {
			return objektName;
		}

		public void setObjektName(String objektName) {
			this.objektName = objektName;
		}

		public String getGebaeudeArt() {
			return gebaeudeArt;
		}

		public void setGebaeudeArt(String gebaeudeArt) {
			this.gebaeudeArt = gebaeudeArt;
		}

		public String getLand() {
			return land;
		}

		public void setLand(String land) {
			this.land = land;
		}

		public String getPlz() {
			return plz;
		}

		public void setPlz(String plz) {
			this.plz = plz;
		}

		public String getOrt() {
			return ort;
		}

		public void setOrt(String ort) {
			this.ort = ort;
		}

		public String getStrasse() {
			return strasse;
		}

		public void setStrasse(String strasse) {
			this.strasse = strasse;
		}

		public String getObjektId2() {
			return objektId2;
		}

		public void setObjektId2(String objektId2) {
			this.objektId2 = objektId2;
		}

		public externe_datenquelle getQuelle() {
			return quelle;
		}

		public void setQuelle(externe_datenquelle quelle) {
			this.quelle = quelle;
		}

	}
}

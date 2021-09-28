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

import at.tb_gruber.designer.model.Externe_Datenquelle;

public class CSVPropertyProvider {

	private List<ObjektInfo> objektInfos = new ArrayList<CSVPropertyProvider.ObjektInfo>();
	private List<String> betreiberList = new ArrayList<>();
	private List<String> eigentuemerList = new ArrayList<>();
	private static IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			TBGPreferencePage.PREFERENCE_SCOPE_IDENTIFIER);
	
	private static CSVPropertyProvider INSTANCE;
	public static CSVPropertyProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CSVPropertyProvider();
		}
		return INSTANCE;
	}

	private CSVPropertyProvider() {
		registerListener();
		loadImmobilienDatei();
		loadVerkehrsstationenDatei();
		loadGebaeudeDatei();
		loadBetreiberDatei();
		loadEigentuemerDatei();
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
				} else if (TBGPreferencePage.PROPERTY_ID_BETREIBER_DATEI.contentEquals(event.getProperty())) {
					loadBetreiberDatei();
				}
			}
		});
	}

	private void loadImmobilienDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_IMMO_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}
		int idxObjektId = -1, idxObjektName = -1, idxGebaeudeArt = -1, idxLand = -1, idxPlz = -1, idxOrt = -1, idxStrasse = -1;
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
				Optional<ObjektInfo> opt = getForId(values[idxObjektId], Externe_Datenquelle.IMMO);
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
							Externe_Datenquelle.IMMO));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(idxObjektId);
			System.err.println(idxObjektName);
			System.err.println(idxGebaeudeArt);
			System.err.println(idxLand);
			System.err.println(idxPlz);
			System.err.println(idxOrt);
			System.err.println(idxStrasse);
			e.printStackTrace();
		}

	}

	private void loadVerkehrsstationenDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_VERKEHRSSTATIONEN_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}
		int idxObjektId = -1, idxObjektName = -1, idxLand = -1, idxPlz = -1, idxOrt = -1, idxStrasse = -1;
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
				Optional<ObjektInfo> opt = getForId(values[idxObjektId], Externe_Datenquelle.VS);
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
							Externe_Datenquelle.VS));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(idxObjektId);
			System.err.println(idxObjektName);
			System.err.println(idxLand);
			System.err.println(idxPlz);
			System.err.println(idxOrt);
			System.err.println(idxStrasse);
			e.printStackTrace();
		}

	}

	private void loadGebaeudeDatei() {
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
				Optional<ObjektInfo> opt = getForId(values[idxGebNr], Externe_Datenquelle.GEBAEUDE);
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
							"AT", values[idxPlz], values[idxOrt], strasseUndHausnummer, Externe_Datenquelle.GEBAEUDE));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getAdresseForId(String id, Externe_Datenquelle quelle) {
		Optional<ObjektInfo> objektOpt = getForId(id, quelle);
		if (objektOpt.isPresent()) {
			ObjektInfo objekt = objektOpt.get();
			return Stream.of(objekt.getLand(), objekt.getPlz(), objekt.getOrt(), objekt.getStrasse())
					.collect(Collectors.joining(" "));
		} else {
			return "";
		}
	}

	public String getObjektNameForId(String id, Externe_Datenquelle quelle) {
		Optional<ObjektInfo> objektOpt = getForId(id, quelle);
		if (objektOpt.isPresent()) {
			ObjektInfo objekt = objektOpt.get();
			return objekt.getObjektName();
		} else {
			return "";
		}
	}

	public String getGebaeudeartForId(String id, Externe_Datenquelle quelle) {
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
	private Optional<ObjektInfo> getForId(String id, Externe_Datenquelle quelle) {
		// Wenn eine Quelle angegeben ist, muss sie übereinstimmen, wenn undefined, dann
		// egal
		List<ObjektInfo> collect = objektInfos.parallelStream()
				.filter(obj -> obj.getObjektId().equals(id)
						&& (Externe_Datenquelle.UNDEFINED.equals(quelle) ? true : obj.quelle.equals(quelle)))
				.collect(Collectors.toList());

		if (collect.isEmpty()) {
			if (Externe_Datenquelle.GEBAEUDE.equals(quelle)) { // bei gebäuden notfalls über sekundäre Id suchen
				List<ObjektInfo> collect2 = objektInfos.parallelStream().filter(obj -> id.equals(obj.getObjektId2()))
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
			if (Externe_Datenquelle.UNDEFINED.equals(quelle)) {
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
		Externe_Datenquelle quelle;

		public ObjektInfo(String objektId, String objektId2, String objektName, String gebaeudeArt, String land,
				String plz, String ort, String strasse, Externe_Datenquelle quelle) {
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

		public Externe_Datenquelle getQuelle() {
			return quelle;
		}

		public void setQuelle(Externe_Datenquelle quelle) {
			this.quelle = quelle;
		}

	}

	private void loadBetreiberDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_BETREIBER_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}

		try (FileInputStream fis = new FileInputStream(csvPath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF8"))) {
			String line = br.readLine();
			if (line.startsWith("EVU")) {
				/* header, do nothing */
			} else {
				betreiberList.add(line.split(";")[0]);
			}

			while ((line = br.readLine()) != null) {
				betreiberList.add(line.split(";")[0]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void loadEigentuemerDatei() {
		String csvPath = preferenceStore.getString(TBGPreferencePage.PROPERTY_ID_EIGENTUEMER_DATEI);
		if (csvPath == null || csvPath.isEmpty()) {
			return;
		}

		try (FileInputStream fis = new FileInputStream(csvPath);
				BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF8"))) {
			String line = br.readLine();
			if (line.startsWith("EVU")) {
				/* heade, do nothing */
			} else {
				betreiberList.add(line.split(";")[0]);
			}
			
			while ((line = br.readLine()) != null) {
				eigentuemerList.add(line.split(";")[0]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<String> getBetreiber() {
		return betreiberList;
	}

	public List<String> getEigentuemer() {
		return eigentuemerList;
	}
}

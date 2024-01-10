package at.tb_gruber.designer.icongenerator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Icons {

	public static final String OUTPUT_FOLDER = "../at.tb_gruber.designer.design/images/svg/";
	public static final String COLOR = "#78909C";
	public static final String COLOR2 = "#FFA000";

	public static final Map<String, String> colors = Stream
			.of(new String[][] {
				{ "rot", "#FF0000" }, 
				{ "dunkelgruen", "#3F7F3F" }, 
				{ "magenta", "#FF00FF" },
				{ "blau", "#00FFFF" }, 
				{ "gruen", "#00FF00" }, 
				{ "violett", "#6752A5" },
				{ "orange", "#FF7F00" }, })
			.collect(Collectors.collectingAndThen(Collectors.toMap(data -> data[0], data -> data[1]),
					Collections::<String, String>unmodifiableMap));

	public static void main(String[] args) throws IOException {
		Energietechnikanlage.createAll();
		Energiespeicher.createAll();
		Generator.createAll();
		Trafo.createAll();
		Umrichter.createAll();

		Versorgungsknoten.createAll();
		VersorgungsknotenNapVor.createAll();
		VersorgungsknotenNapNach.createAll();

		Verteiler.createAll();
		VerteilerNapVor.createAll();
		VerteilerNapMitte.createAll();
		VerteilerNapNach.createAll();

		Zaehlerverteiler.createAll();
		ZaehlerverteilerNapVor.createAll();
		ZaehlerverteilerNapMitte.createAll();
		ZaehlerverteilerNapNach.createAll();

		ZaehlerverteilerFA.createAll();
		ZaehlerverteilerNapVorFA.createAll();
		ZaehlerverteilerNapMitteFA.createAll();
		ZaehlerverteilerNapNachFA.createAll();
	}

	public static void writeIconToFile(String filepath, String iconAsXML) {
		try {
			File file = new File(filepath);
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				byte[] bytes = iconAsXML.getBytes();
				bos.write(bytes);
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readTemplateFromFile(String templateName) {
		String templateXML = "";
		InputStream stream = Icons.class.getClassLoader().getResourceAsStream("templates/" + templateName + ".svg");
		try (BufferedInputStream bin = new BufferedInputStream(stream)) {
			byte[] contents = new byte[1024];

			int bytesRead = 0;
			while ((bytesRead = bin.read(contents)) != -1) {
				templateXML += new String(contents, 0, bytesRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return templateXML;
	}
}

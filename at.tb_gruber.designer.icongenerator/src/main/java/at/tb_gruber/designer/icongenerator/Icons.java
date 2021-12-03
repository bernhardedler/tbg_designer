package at.tb_gruber.designer.icongenerator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Icons {

	public static final String OUTPUT_FOLDER = "target/img-gen/";

	public static final Map<String, String> colors = Stream
			.of(new String[][] {
				{ "rot", "#FF0000" }, 
				{ "gruen", "#00FF00" }, 
				{ "magenta", "#FF0090" },
				{ "cyan", "#00FFFF" }, 
				{ "blau", "#0070C0" }, 
				{ "violett", "#8D7EBD" },
				{ "hellbraun", "#C65911" }, })
			.collect(Collectors.collectingAndThen(Collectors.toMap(data -> data[0], data -> data[1]),
					Collections::<String, String>unmodifiableMap));

	public static void main(String[] args) throws IOException {
		File outputFolder = new File(OUTPUT_FOLDER);
		if (outputFolder.exists()) {
			outputFolder.delete();
		}
		
		outputFolder.mkdir();
		
		Energietechnikanlage.createAll();
		Energiespeicher.createAll();
		Generator.createAll();
		Trafo.createAll();
		Umrichter.createAll();
		Versorgungsknoten.createAll();
		VersorgungsknotenNapVor.createAll();
		VersorgungsknotenNapNach.createAll();
	}

	public static void writeIconToFile(String filepath, String iconAsXML) throws IOException {
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
	}
}

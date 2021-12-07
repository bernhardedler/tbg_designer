package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Trafo {

	public static final String TEMPLATE = "trafo";
	private static String subfolder = Icons.OUTPUT_FOLDER + "trafo/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color1 : Icons.colors.keySet()) {
			for (String color2 : Icons.colors.keySet()) {
				String tmpXml = Icons.readTemplateFromFile(TEMPLATE)
						.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color1)))
						.replaceAll(Icons.COLOR2, String.valueOf(Icons.colors.get(color2)));
				String tmpFilePath = subfolder + "trafo_" + color1 + "_" + color2 + ".svg";
				Icons.writeIconToFile(tmpFilePath, tmpXml);
			}
		}
	}
}

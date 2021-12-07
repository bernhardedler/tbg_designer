package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Generator {

	public static final String TEMPLATE = "generator";
	private static String subfolder = Icons.OUTPUT_FOLDER + "generator/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "generator_" + color + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

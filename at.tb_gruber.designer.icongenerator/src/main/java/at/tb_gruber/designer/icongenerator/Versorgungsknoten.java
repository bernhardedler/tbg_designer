package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Versorgungsknoten {

	public static final String TEMPLATE_S = "versorgungsknoten_s";
	public static final String TEMPLATE_M = "versorgungsknoten_m";
	public static final String TEMPLATE_L = "versorgungsknoten_l";
	private static String subfolder = Icons.OUTPUT_FOLDER + "versorgungsknoten/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE_S)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "versorgungsknoten_" + color + "_s" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_M)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_m" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_L)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_l" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

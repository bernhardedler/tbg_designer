package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Verteiler {

	public static final String TEMPLATE_S = "verteiler_s";
	public static final String TEMPLATE_M = "verteiler_m";
	public static final String TEMPLATE_L = "verteiler_l";
	public static final String TEMPLATE_XL = "verteiler_xl";
	public static final String TEMPLATE_XXL = "verteiler_xxl";
	
	private static String subfolder = Icons.OUTPUT_FOLDER + "verteiler/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE_S)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "verteiler_" + color + "_s.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_M)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_m.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_L)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_l.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_XL)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_xl.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_XXL)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_xxl.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

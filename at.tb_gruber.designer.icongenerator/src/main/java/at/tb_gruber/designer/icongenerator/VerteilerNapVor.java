package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class VerteilerNapVor {

	public static final String TEMPLATE_S = "verteiler_nap_vor_s";
	public static final String TEMPLATE_M = "verteiler_nap_vor_m";
	public static final String TEMPLATE_L = "verteiler_nap_vor_l";
	private static String subfolder = Icons.OUTPUT_FOLDER + "verteiler/nap_vor/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE_S)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_s.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_M)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_m.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_L)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_l.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

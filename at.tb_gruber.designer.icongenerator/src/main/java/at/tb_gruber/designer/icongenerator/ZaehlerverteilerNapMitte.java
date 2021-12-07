package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class ZaehlerverteilerNapMitte {

	public static final String TEMPLATE_S = "zaehlerverteiler_nap_mitte_s";
	public static final String TEMPLATE_M = "zaehlerverteiler_nap_mitte_m";
	public static final String TEMPLATE_L = "zaehlerverteiler_nap_mitte_l";

	private static String subfolder = Icons.OUTPUT_FOLDER + "verteiler/zaehlerverteiler/nap_mitte/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE_S)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_nap_mitte_s.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_M)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_nap_mitte_m.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_L)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_nap_mitte_l.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

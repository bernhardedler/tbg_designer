package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class VersorgungsknotenNapNach {

	public static final String TEMPLATE_S = "versorgungsknoten_nap_nach_s";
	public static final String TEMPLATE_M = "versorgungsknoten_nap_nach_m";
	public static final String TEMPLATE_L = "versorgungsknoten_nap_nach_l";
	public static final String TEMPLATE_XL = "versorgungsknoten_nap_nach_xl";
	public static final String TEMPLATE_XXL = "versorgungsknoten_nap_nach_xxl";
	
	private static String subfolder = Icons.OUTPUT_FOLDER + "versorgungsknoten/nap_nach/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = Icons.readTemplateFromFile(TEMPLATE_S)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "versorgungsknoten_" + color + "_nap_nach_s.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_M)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_nap_nach_m.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_L)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_nap_nach_l.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_XL)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_nap_nach_xl.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = Icons.readTemplateFromFile(TEMPLATE_XXL)
					.replaceAll(Icons.COLOR, String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_nap_nach_xxl.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

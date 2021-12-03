package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Generator {

	public static final String TEMPLATE = "<svg width=\"115\" height=\"116\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <ellipse fill=\"#fff\" cx=\"57\" cy=\"57\" rx=\"56\" ry=\"56\" id=\"b1\" />\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"&color\" cx=\"57\" cy=\"57\" rx=\"56\" ry=\"56\" id=\"r1\" />\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"30\" y=\"81\" fill=\"&color\" font-size=\"70px\" font-family=\"sans-serif\">G</text>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";
	
	private static String subfolder = Icons.OUTPUT_FOLDER + "generator/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "generator_" + color + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

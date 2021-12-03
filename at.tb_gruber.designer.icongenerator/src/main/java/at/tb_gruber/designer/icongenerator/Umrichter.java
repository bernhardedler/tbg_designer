package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Umrichter {

	public static final String TEMPLATE = "<svg width=\"115\" height=\"116\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"115\" height=\"115\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"1\" width=\"113\" height=\"113\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"26\" y=\"55\" fill=\"&color\" font-size=\"40px\" font-family=\"sans-serif\">UR</text>\r\n"
			+ "    <text x=\"20\" y=\"85\" fill=\"&color\" font-size=\"25px\" font-family=\"sans-serif\">AC/DC</text>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "umrichter/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "umrichter_" + color + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

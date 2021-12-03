package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Energietechnikanlage {

	public static final String TEMPLATE = "<svg width=\"115\" height=\"116\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ " <g>\r\n"
			+ "  <title>background</title>\r\n"
			+ "  <rect x=\"0\" y=\"0\" width=\"115\" height=\"115\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "</g>\r\n"
			+ " <g>\r\n"
			+ "  <title>Form</title>\r\n"
			+ "  <rect fill=\"none\" stroke-width=\"2\" x=\"1\" y=\"1\" width=\"113\" height=\"113\" id=\"svg_3\" stroke=\"&color\"/>\r\n"
			+ " </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "energietechnikanlage/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "energietechnikanlage_" + color + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

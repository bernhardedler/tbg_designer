package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Trafo {

	public static final String TEMPLATE = "<svg width=\"115\" height=\"116\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "<g>\r\n"
			+ "  <title>Layer 1</title>\r\n"
			+ "  <ellipse fill=\"none\" stroke=\"&color1\" stroke-width=\"2\" cx=\"56\" cy=\"43\" id=\"svg_5\" rx=\"30\" ry=\"30\"/>\r\n"
			+ "  <ellipse fill=\"none\" stroke=\"&color1\" stroke-width=\"2\" cx=\"56\" cy=\"71\" id=\"svg_8\" rx=\"30\" ry=\"30\"/>\r\n"
			+ "  <line stroke=\"&color2\" id=\"svg_3\" y2=\"13\" x2=\"56\" y1=\"0\" x1=\"56\" stroke-width=\"2\" fill=\"none\"/>\r\n"
			+ "  <line stroke=\"&color2\" id=\"svg_6\" y2=\"116\" x2=\"56\" y1=\"101\" x1=\"56\" stroke-width=\"2\" fill=\"none\"/>\r\n"
			+ " </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "trafo/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color1 : Icons.colors.keySet()) {
			for (String color2 : Icons.colors.keySet()) {
				String tmpXml = TEMPLATE
						.replaceAll("&color1", String.valueOf(Icons.colors.get(color1)))
						.replaceAll("&color2", String.valueOf(Icons.colors.get(color2)));
				String tmpFilePath = subfolder + "trafo_" + color1 + "_" + color2 + ".svg";
				Icons.writeIconToFile(tmpFilePath, tmpXml);
			}
		}
	}
}

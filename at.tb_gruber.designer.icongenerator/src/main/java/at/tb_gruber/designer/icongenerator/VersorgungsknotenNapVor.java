package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class VersorgungsknotenNapVor {

	public static final String TEMPLATE_S = "<svg width=\"115\" height=\"156\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ " <g>\r\n"
			+ "  <title>background</title>\r\n"
			+ "  <rect fill=\"#fff\" id=\"canvas_background\" height=\"156\" width=\"115\" y=\"0\" x=\"0\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>Form</title>\r\n"
			+ "  <rect stroke=\"&color\" id=\"svg_3\" height=\"113\" width=\"113\" y=\"41\" x=\"1\" stroke-width=\"2\" fill=\"#fff\"/>\r\n"
			+ "  <line id=\"svg_4\" y2=\"97\" x2=\"113\" y1=\"97\" x1=\"0\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_5\" y2=\"155\" x2=\"37\" y1=\"97\" x1=\"37\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_10\" y2=\"155\" x2=\"75\" y1=\"97\" x1=\"75\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>NAP</title>\r\n"
			+ "  <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"58\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"13\" y1=\"41\" x2=\"102\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"58\" y1=\"0\" x2=\"58\" y2=\"41\" id=\"svg23\"/>\r\n"
			+ " </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_M = "<svg width=\"228\" height=\"156\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ " <g>\r\n"
			+ "  <title>background</title>\r\n"
			+ "  <rect fill=\"#fff\" id=\"canvas_background\" height=\"156\" width=\"228\" y=\"0\" x=\"0\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>Form</title>\r\n"
			+ "  <rect stroke=\"&color\" id=\"svg_3\" height=\"113\" width=\"226\" y=\"41\" x=\"1\" stroke-width=\"2\" fill=\"#fff\"/>\r\n"
			+ "  <line id=\"svg_4\" y2=\"97\" x2=\"226\" y1=\"97\" x1=\"0\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_5\" y2=\"155\" x2=\"76\" y1=\"97\" x1=\"76\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_10\" y2=\"155\" x2=\"152\" y1=\"97\" x1=\"152\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>NAP</title>\r\n"
			+ "  <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"113\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"70\" y1=\"41\" x2=\"158\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"113\" y1=\"0\" x2=\"113\" y2=\"41\" id=\"svg23\"/>\r\n"
			+ " </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_L = "<svg width=\"341\" height=\"156\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ " <g>\r\n"
			+ "  <title>background</title>\r\n"
			+ "  <rect fill=\"#fff\" id=\"canvas_background\" height=\"156\" width=\"341\" y=\"0\" x=\"0\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>Form</title>\r\n"
			+ "  <rect stroke=\"&color\" id=\"svg_3\" height=\"113\" width=\"339\" y=\"41\" x=\"1\" stroke-width=\"2\" fill=\"#fff\"/>\r\n"
			+ "  <line id=\"svg_4\" y2=\"97\" x2=\"339\" y1=\"97\" x1=\"0\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_5\" y2=\"155\" x2=\"113\" y1=\"97\" x1=\"113\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ "  <line id=\"svg_10\" y2=\"155\" x2=\"226\" y1=\"97\" x1=\"226\" stroke-width=\"2\" stroke=\"&color\" fill=\"none\"/>\r\n"
			+ " </g>\r\n"
			+ " <g>\r\n"
			+ "  <title>NAP</title>\r\n"
			+ "  <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"170\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"127\" y1=\"41\" x2=\"214\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "  <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"170\" y1=\"0\" x2=\"170\" y2=\"41\" id=\"svg23\"/>\r\n"
			+ " </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "versorgungsknoten/nap_vor/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE_S
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "versorgungsknoten_" + color + "_s_nap_vor.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_M
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_m_nap_vor.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_L
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "versorgungsknoten_" + color + "_l_nap_vor.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

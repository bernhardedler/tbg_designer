package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class VerteilerNapVor {

	public static final String TEMPLATE_S = "<svg width=\"115\" height=\"268\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"115\" height=\"268\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"41\" width=\"113\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"57\" y1=\"1\" x2=\"57\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"28\" y=\"141\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"167\" width=\"100\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"217\" x2=\"107\" y2=\"217\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"75\" y1=\"217\" x2=\"75\" y2=\"266\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"39\" y1=\"217\" x2=\"39\" y2=\"266\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>NAP</title>\r\n"
			+ "    <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"57\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"21\" y1=\"41\" x2=\"101\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"57\" y1=\"41\" x2=\"57\" y2=\"0\" id=\"svg23\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_M = "<svg width=\"228\" height=\"268\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"228\" height=\"268\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"41\" width=\"226\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"113\" y1=\"1\" x2=\"113\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"82\" y=\"141\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"167\" width=\"213\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"217\" x2=\"220\" y2=\"217\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"74\" y1=\"217\" x2=\"74\" y2=\"266\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"150\" y1=\"217\" x2=\"150\" y2=\"266\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>NAP</title>\r\n"
			+ "    <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"113\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"69\" y1=\"41\" x2=\"155\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"113\" y1=\"41\" x2=\"113\" y2=\"0\" id=\"svg23\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_L = "<svg width=\"341\" height=\"268\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"341\" height=\"268\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"41\" width=\"339\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"169\" y1=\"1\" x2=\"169\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"139\" y=\"141\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"167\" width=\"326\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"217\" x2=\"333\" y2=\"217\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"113\" y1=\"217\" x2=\"113\" y2=\"266\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"226\" y1=\"217\" x2=\"226\" y2=\"266\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>NAP</title>\r\n"
			+ "    <ellipse fill=\"none\" stroke-width=\"2\" stroke=\"#000\" cx=\"169\" cy=\"41\" rx=\"25\" ry=\"25\" id=\"svg21\" />\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"126\" y1=\"41\" x2=\"212\" y2=\"41\" id=\"svg22\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"#000\" stroke-width=\"2\" x1=\"169\" y1=\"0\" x2=\"169\" y2=\"41\" id=\"svg23\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "verteiler/nap_vor/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE_S
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_s.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_M
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_m.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_L
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "verteiler_" + color + "_nap_vor_l.svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

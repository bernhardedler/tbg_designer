package at.tb_gruber.designer.icongenerator;

import java.io.File;
import java.io.IOException;

public class Zaehlerverteiler {

	public static final String TEMPLATE_S = "<svg width=\"115\" height=\"228\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"115\" height=\"228\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"1\" width=\"113\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"18\" y=\"31\" width=\"80\" height=\"80\" id=\"z1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"18\" y1=\"56\" x2=\"98\" y2=\"56\" id=\"z2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"57\" y1=\"0\" x2=\"57\" y2=\"31\" id=\"z3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"57\" y1=\"111\" x2=\"57\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"28\" y=\"101\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"127\" width=\"100\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"177\" x2=\"107\" y2=\"177\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"75\" y1=\"177\" x2=\"75\" y2=\"226\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"39\" y1=\"177\" x2=\"39\" y2=\"226\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_M = "<svg width=\"228\" height=\"228\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"228\" height=\"228\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"1\" width=\"226\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"72\" y=\"31\" width=\"80\" height=\"80\" id=\"z1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"72\" y1=\"56\" x2=\"152\" y2=\"56\" id=\"z2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"113\" y1=\"0\" x2=\"113\" y2=\"31\" id=\"z3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"113\" y1=\"111\" x2=\"113\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"82\" y=\"101\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"127\" width=\"213\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"177\" x2=\"220\" y2=\"177\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"74\" y1=\"177\" x2=\"74\" y2=\"226\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"150\" y1=\"177\" x2=\"150\" y2=\"226\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";
	
	public static final String TEMPLATE_L = "<svg width=\"341\" height=\"228\" xmlns=\"http://www.w3.org/2000/svg\">\r\n"
			+ "  <g>\r\n"
			+ "    <title>background</title>\r\n"
			+ "    <rect x=\"0\" y=\"0\" width=\"341\" height=\"228\" id=\"canvas_background\" fill=\"#fff\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Rahmen</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"1\" y=\"1\" width=\"339\" height=\"226\" id=\"r1\" stroke=\"&color\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Zaehler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"129\" y=\"31\" width=\"80\" height=\"80\" id=\"z1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"129\" y1=\"56\" x2=\"209\" y2=\"56\" id=\"z2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"169\" y1=\"0\" x2=\"169\" y2=\"31\" id=\"z3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"169\" y1=\"111\" x2=\"169\" y2=\"151\" id=\"z4\"/>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Text</title>\r\n"
			+ "    <text x=\"139\" y=\"101\" fill=\"&color\" font-size=\"30px\" font-family=\"sans-serif\">kWh</text>\r\n"
			+ "  </g>\r\n"
			+ "  <g>\r\n"
			+ "    <title>Verteiler</title>\r\n"
			+ "    <rect fill=\"#fff\" stroke-width=\"2\" x=\"7\" y=\"127\" width=\"326\" height=\"100\" id=\"v1\" stroke=\"&color\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"6\" y1=\"177\" x2=\"333\" y2=\"177\" id=\"v2\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"113\" y1=\"177\" x2=\"113\" y2=\"226\" id=\"v3\"/>\r\n"
			+ "    <line fill=\"none\" stroke=\"&color\" stroke-width=\"2\" x1=\"226\" y1=\"177\" x2=\"226\" y2=\"226\" id=\"v4\"/>\r\n"
			+ "  </g>\r\n"
			+ "</svg>";

	private static String subfolder = Icons.OUTPUT_FOLDER + "verteiler/zaehlerverteiler/";

	public static void createAll() throws IOException {
		File outputFolder = new File(subfolder);
		if (!outputFolder.exists()) {
			outputFolder.mkdir();
		}
		for (String color : Icons.colors.keySet()) {
			String tmpXml = TEMPLATE_S
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			String tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_s" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_M
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_m" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
			tmpXml = TEMPLATE_L
					.replaceAll("&color", String.valueOf(Icons.colors.get(color)));
			tmpFilePath = subfolder + "zaehlerverteiler_" + color + "_l" + ".svg";
			Icons.writeIconToFile(tmpFilePath, tmpXml);
		}
	}
}

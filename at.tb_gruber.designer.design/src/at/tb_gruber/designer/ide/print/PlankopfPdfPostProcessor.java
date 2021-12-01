package at.tb_gruber.designer.ide.print;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Objekt;

public class PlankopfPdfPostProcessor {

	public static final PDFont FONT = PDType1Font.HELVETICA;
	public static final int FONT_SIZE_SMALL = 11;
	public static final int FONT_SIZE_MEDIUM = 16;
	public static final int FONT_SIZE_LARGE = 26;

	public static final Dimension PLANKOPF_SIZE = new Dimension(718, 231); // 190x64 bei 96 dpi
	public static final Dimension LEGENDE_1_SIZE = new Dimension(356, 473); 
	public static final Dimension LEGENDE_2_SIZE = new Dimension(356, 633); 

	public static void postprocess(String filePath, DiagramEditPart dgrmEP) throws IOException {

		File file = new File(filePath);

		PDDocument doc = null;
		try {
			doc = PDDocument.load(file);
			PDPage page = doc.getPage(0);

			insertPlankopf(dgrmEP, doc, page);
			insertLegende1(dgrmEP, doc, page);
			insertLegende2(dgrmEP, doc, page);

			doc.save(filePath);
		} finally {
			if (doc != null) {
				doc.close();
			}
		}
	}

	private static void insertPlankopf(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) throws IOException {

		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true)) {
			InputStream is = TBGPrintActionHelper.class.getClassLoader()
					.getResourceAsStream("images/plankopf_gross.png");

			BufferedImage bim = ImageIO.read(is);
			PDImageXObject pdfimg = LosslessFactory.createFromImage(doc, bim);

			Point positionPlankopf = getTopLeftForPlankopf(page);
			cs.drawImage(pdfimg, positionPlankopf.x(), positionPlankopf.y(), PLANKOPF_SIZE.width(),
					PLANKOPF_SIZE.height());

			Bahnhof projekt = resolveBahnhof(dgrmEP);
			if (projekt != null) {

				int bearb_Datum_X = positionPlankopf.x() + 360;
				int bearb_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 48;
				writeSmallTextAt("Eins", bearb_Datum_X, bearb_Datum_Y, cs);

				int bearb_Name_X = positionPlankopf.x() + 455;
				int bearb_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 48;
				writeSmallTextAt("Zwei", bearb_Name_X, bearb_Name_Y, cs);

				int gez_Datum_X = positionPlankopf.x() + 360;
				int gez_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 78;
				writeSmallTextAt("Drei", gez_Datum_X, gez_Datum_Y, cs);

				int gez_Name_X = positionPlankopf.x() + 455;
				int gez_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 78;
				writeSmallTextAt("Vier", gez_Name_X, gez_Name_Y, cs);

				int gepr_Datum_X = positionPlankopf.x() + 360;
				int gepr_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 108;
				writeSmallTextAt("Fünf", gepr_Datum_X, gepr_Datum_Y, cs);

				int gepr_Name_X = positionPlankopf.x() + 455;
				int gepr_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 108;
				writeSmallTextAt("Sechs", gepr_Name_X, gepr_Name_Y, cs);

				int plannummer_X = positionPlankopf.x() + 455;
				int plannummer_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 160;
				writeMediumTextAt("Plannummer", plannummer_X, plannummer_Y, cs);

				int freigegeben_X = positionPlankopf.x() + 455;
				int freigegeben_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 220;
				writeMediumTextAt("Freigegeben", freigegeben_X, freigegeben_Y, cs);

				int projektname_X = positionPlankopf.x() + 115;
				int projektname_Y = positionPlankopf.y() + PLANKOPF_SIZE.height() - 190;
				writeLargeTextAt("Projektname", projektname_X, projektname_Y, cs);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void insertLegende1(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		// TODO Auto-generated method stub

	}

	private static void insertLegende2(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		// TODO Auto-generated method stub

	}

	private static Bahnhof resolveBahnhof(DiagramEditPart dgrmEP) {
		for (Object child : dgrmEP.getChildren()) {
			if (child instanceof AbstractEditPart) {
				AbstractEditPart editPart = (AbstractEditPart) child;
				if (editPart.getModel() instanceof Node) {
					Node node = (Node) editPart.getModel();
					if (node.getElement() instanceof DRepresentationElement) {
						DRepresentationElement container = (DRepresentationElement) node.getElement();
						if (!container.getSemanticElements().isEmpty()
								&& container.getSemanticElements().get(0) instanceof Objekt) {
							EObject model = container.getSemanticElements().get(0);
							return (Bahnhof) ((Objekt) model).eContainer();
						}
					}
				}
			}
		}
		return null;
	}

	public static Dimension getPdfPageSize(PDPage page) {
		return new Dimension((int) page.getMediaBox().getWidth(), (int) page.getMediaBox().getHeight());
	}

	private static Point getTopLeftForPlankopf(PDPage page) {
		Dimension totalSize = getPdfPageSize(page);
		int offset = 5;

		int x = totalSize.width() - offset - PLANKOPF_SIZE.width();
		int y = offset; // wird von unten links nach oben rechts gerechnet
		return new Point(x, y);

	}

	private static void writeSmallTextAt(String text, int x, int y, PDPageContentStream cs) throws IOException {
		writeTextAt(text, x, y, FONT_SIZE_SMALL, cs);
	}

	private static void writeMediumTextAt(String text, int x, int y, PDPageContentStream cs) throws IOException {
		writeTextAt(text, x, y, FONT_SIZE_MEDIUM, cs);
	}

	private static void writeLargeTextAt(String text, int x, int y, PDPageContentStream cs) throws IOException {
		writeTextAt(text, x, y, FONT_SIZE_LARGE, cs);
	}

	private static void writeTextAt(String text, int x, int y, int fontSize, PDPageContentStream cs)
			throws IOException {
		cs.beginText();
		cs.setFont(FONT, fontSize);
		cs.newLineAtOffset(x, y);
		cs.showText(text);
		cs.endText();
	}
}

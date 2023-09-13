package at.tb_gruber.designer.ide.print;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.osgi.framework.FrameworkUtil;

import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Objekt;

public class PlankopfPdfPostProcessor {

	public static final ILog log = Platform.getLog(PlankopfPdfPostProcessor.class);

	public static final PDFont FONT = PDType1Font.HELVETICA;
	public static final int FONT_SIZE_XSMALL = 9;
	public static final int FONT_SIZE_SMALL = 11;
	public static final int FONT_SIZE_MEDIUM = 16;
	public static final int FONT_SIZE_LARGE = 20;

	private static final int spacing = 5;
	private static final int offset = 14;
	private static final int offsetLochung = offset * 4;

	public static final Dimension PLANKOPF_SIZE = new Dimension(TBGDiagramSVGGenerator.applyScaling(703),
			TBGDiagramSVGGenerator.applyScaling(226));
	public static final Dimension LEGENDE_1_SIZE = new Dimension(TBGDiagramSVGGenerator.applyScaling(348),
			TBGDiagramSVGGenerator.applyScaling(729));
	public static final Dimension LEGENDE_2_SIZE = new Dimension(TBGDiagramSVGGenerator.applyScaling(348),
			TBGDiagramSVGGenerator.applyScaling(619));

	public static void postprocess(String filePath, DiagramEditPart dgrmEP) throws IOException {
		File file = new File(filePath);

		PDDocument doc = null;
		try {
			doc = PDDocument.load(file);
			PDPage page = doc.getPage(0);

			insertPlankopf(dgrmEP, doc, page);
			insertLegende1(dgrmEP, doc, page);
			insertLegende2(dgrmEP, doc, page);

			insertRahmen(dgrmEP, doc, page);
			insertSchnittkante(dgrmEP, doc, page);

			doc.save(filePath);
		} finally {
			if (doc != null) {
				doc.close();
			}
		}
	}

	private static void insertPlankopf(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) throws IOException {

		URL plankopf = FrameworkUtil.getBundle(PlankopfPdfPostProcessor.class).getResource("images/plankopf.png");
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true);
				InputStream is = plankopf.openStream()) {

			BufferedImage bim = ImageIO.read(is);
			PDImageXObject pdfimg = LosslessFactory.createFromImage(doc, bim);

			Point positionPlankopf = getTopLeftForPlankopf(page);
			cs.drawImage(pdfimg, positionPlankopf.x(), positionPlankopf.y(), PLANKOPF_SIZE.width(),
					PLANKOPF_SIZE.height());

			Bahnhof projekt = resolveBahnhof(dgrmEP);
			if (projekt != null) {
				int bearb_Datum_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(360);
				int bearb_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(48);
				writeSmallTextAt(projekt.getBearbeitet_am(), bearb_Datum_X, bearb_Datum_Y, cs);

				int bearb_Name_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(455);
				int bearb_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(48);
				writeSmallTextAt(projekt.getBearbeitet_von(), bearb_Name_X, bearb_Name_Y, cs);

				int gez_Datum_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(360);
				int gez_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(78);
				writeSmallTextAt(projekt.getGezeichnet_am(), gez_Datum_X, gez_Datum_Y, cs);

				int gez_Name_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(455);
				int gez_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(78);
				writeSmallTextAt(projekt.getGezeichnet_von(), gez_Name_X, gez_Name_Y, cs);

				int gepr_Datum_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(360);
				int gepr_Datum_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(108);
				writeSmallTextAt(projekt.getGeprueft_am(), gepr_Datum_X, gepr_Datum_Y, cs);

				int gepr_Name_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(455);
				int gepr_Name_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(108);
				writeSmallTextAt(projekt.getGeprueft_von(), gepr_Name_X, gepr_Name_Y, cs);

				int plannummer_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(455);
				int plannummer_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(160);
				writeSmallTextAt(projekt.getPlannummer(), plannummer_X, plannummer_Y, cs);

				int freigegeben_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(455);
				int freigegeben_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(220);
				writeMediumTextAt(projekt.getFreigegeben_von(), freigegeben_X, freigegeben_Y, cs);

				String projektname = projekt.getProjektname();
				String p1, p2, p3;
				if (projektname.length() <= 25) {
					p1 = projektname;
				} else {
					p1 = projektname.substring(0, 25);
				}
				int projektname1_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(110);
				int projektname1_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(155);
				writeLargeTextAt(p1, projektname1_X, projektname1_Y, cs);

				if (projektname.length() > 25 && projektname.length() <= 50) {
					p2 = projektname.substring(25);
				} else {
					p2 = projektname.substring(25, 50);
				}
				int projektname2_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(110);
				int projektname2_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(185);
				writeLargeTextAt(p2, projektname2_X, projektname2_Y, cs);

				if (projektname.length() > 50 && projektname.length() <= 75) {
					p3 = projektname.substring(50);
				} else {
					p3 = projektname.substring(50, 75);
				}
				int projektname3_X = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(110);
				int projektname3_Y = positionPlankopf.y() + PLANKOPF_SIZE.height()
						- TBGDiagramSVGGenerator.applyScaling(215);
				writeLargeTextAt(p3, projektname3_X, projektname3_Y, cs);
			}
		} catch (Exception e) {
			log.error("Fehler beim Drucken des Plankopfs", e);
		}
	}

	private static void insertLegende1(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		URL plankopf = FrameworkUtil.getBundle(PlankopfPdfPostProcessor.class).getResource("images/legende1.png");
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true);
				InputStream is = plankopf.openStream()) {

			BufferedImage bim = ImageIO.read(is);
			PDImageXObject pdfimg = LosslessFactory.createFromImage(doc, bim);

			Point positionLegende1 = getTopLeftForLegende1(page);
			cs.drawImage(pdfimg, positionLegende1.x(), positionLegende1.y(), LEGENDE_1_SIZE.width(),
					LEGENDE_1_SIZE.height());
		} catch (Exception e) {
			log.error("Fehler beim Drucken der Legende 1", e);
		}
	}

	private static void insertLegende2(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		URL plankopf = FrameworkUtil.getBundle(PlankopfPdfPostProcessor.class).getResource("images/legende2.png");
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true);
				InputStream is = plankopf.openStream()) {

			BufferedImage bim = ImageIO.read(is);
			PDImageXObject pdfimg = LosslessFactory.createFromImage(doc, bim);

			Point positionLegende2 = getTopLeftForLegende2(page);
			cs.drawImage(pdfimg, positionLegende2.x(), positionLegende2.y(), LEGENDE_2_SIZE.width(),
					LEGENDE_2_SIZE.height());
		} catch (Exception e) {
			log.error("Fehler beim Drucken der Legende 2", e);
		}

	}

	@SuppressWarnings("deprecation")
	private static void insertRahmen(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true)) {
			Dimension totalSize = getPdfPageSize(page);

			cs.setLineWidth(1);
			cs.drawLine(offsetLochung, offset, offsetLochung, (totalSize.height - offset));
			cs.drawLine(offsetLochung, (totalSize.height - offset), (totalSize.width - offset),
					(totalSize.height - offset));
			cs.drawLine((totalSize.width - offset), (totalSize.height - offset), (totalSize.width - offset), offset);
			cs.drawLine((totalSize.width - offset), offset, offsetLochung, offset);

			PDRectangle rect = page.getMediaBox();

			float width = rect.getWidth() - offsetLochung - offset;
			float height = rect.getHeight() - 2 * offset;

			/* Pixel to mm */
			float MM_TO_UNITS = (1 / (10 * 2.54f)) * 72;

			width /= MM_TO_UNITS;
			height /= MM_TO_UNITS;

			Point positionPlankopf = getTopLeftForPlankopf(page);
			int groeszeX = positionPlankopf.x() + TBGDiagramSVGGenerator.applyScaling(10);
			int groeszeY = positionPlankopf.y() + PLANKOPF_SIZE.height() - TBGDiagramSVGGenerator.applyScaling(140);
			writeMediumTextAt("Größe:", groeszeX, groeszeY, cs);

			float size = (width * height) / 1000000f;

			groeszeY = positionPlankopf.y() + PLANKOPF_SIZE.height() - TBGDiagramSVGGenerator.applyScaling(160);
			writeSmallTextAt(String.format("%.2f", size) + " m\u00B2", groeszeX, groeszeY, cs);

			groeszeY = positionPlankopf.y() + PLANKOPF_SIZE.height() - TBGDiagramSVGGenerator.applyScaling(190);
			writeExtraSmallTextAt("(" + (int) width + " x", groeszeX, groeszeY, cs);

			groeszeY = positionPlankopf.y() + PLANKOPF_SIZE.height() - TBGDiagramSVGGenerator.applyScaling(210);
			writeExtraSmallTextAt((int) height + " mm)", groeszeX, groeszeY, cs);

		} catch (Exception e) {
			log.error("Fehler beim Drucken des Rahmens", e);
		}

	}

	@SuppressWarnings("deprecation")
	private static void insertSchnittkante(DiagramEditPart dgrmEP, PDDocument doc, PDPage page) {
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, false, true)) {
			Dimension totalSize = getPdfPageSize(page);

			cs.setLineDashPattern(new float[] { 3, 9 }, 0);
			cs.drawLine(0, 0, 0, totalSize.height);
			cs.drawLine(0, totalSize.height, totalSize.width, totalSize.height);
			cs.drawLine(totalSize.width, totalSize.height, totalSize.width, 0);
			cs.drawLine(totalSize.width, 0, 0, 0);

		} catch (Exception e) {
			log.error("Fehler beim Drucken der Schnittkante", e);
		}

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

		int x = totalSize.width() - offset - PLANKOPF_SIZE.width();
		int y = offset; // wird von unten links nach oben rechts gerechnet
		return new Point(x, y);

	}

	private static Point getTopLeftForLegende1(PDPage page) {
		Dimension totalSize = getPdfPageSize(page);

		int x = totalSize.width() - offset - LEGENDE_1_SIZE.width() - spacing - LEGENDE_2_SIZE.width();
		int y = offset + PLANKOPF_SIZE.height() + spacing; // wird von unten links nach oben rechts gerechnet
		return new Point(x, y);

	}

	private static Point getTopLeftForLegende2(PDPage page) {
		Dimension totalSize = getPdfPageSize(page);

		int x = totalSize.width() - offset - LEGENDE_2_SIZE.width();
		int y = offset + PLANKOPF_SIZE.height() + spacing; // wird von unten links nach oben rechts gerechnet
		return new Point(x, y);

	}

	private static void writeExtraSmallTextAt(String text, int x, int y, PDPageContentStream cs) throws IOException {
		writeTextAt(text, x, y, FONT_SIZE_XSMALL, cs);
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
		cs.showText(escape(text));
		cs.endText();
	}

	private static String escape(String text) {
		return text == null ? ""
				: text.replaceAll("Ä", "\u00c4").replaceAll("ä", "\u00e4").replaceAll("Ö", "\u00d6")
						.replaceAll("ö", "\u00f6").replaceAll("Ü", "\u00dc").replaceAll("ü", "\u00fc")
						.replaceAll("ẞ", "\u1E9E").replaceAll("ß", "\u00df");
	}
}

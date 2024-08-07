package at.tb_gruber.designer.ide.print;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.fop.svg.PDFTranscoder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.printing.internal.util.PrintHelperUtil;
import org.eclipse.gmf.runtime.diagram.ui.printing.internal.util.SWTDiagramPrinter;
import org.eclipse.gmf.runtime.draw2d.ui.render.awt.internal.svg.SVGImage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.printing.Printer;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorPart;

public class TBGPrintActionHelper {

	private TBGPrintActionHelper() {
	}

	/**
	 * Prints the diagram after a default print dialog is opened for the user.
	 * 
	 * @param editorPart     the IEditorPart containing the diagram to print
	 * @param diagramPrinter the diagram printer that does the work of actually
	 *                       printing the diagrams
	 */
	public static void doRun(IEditorPart editorPart, SWTDiagramPrinter diagramPrinter) {
		PrinterData data = new PrinterData("winspool", "Microsoft Print to PDF");
		final Printer printer = new Printer(data);
		diagramPrinter.setPrinter(printer);
		DiagramEditPart dgrmEP = ((IDiagramWorkbenchPart) editorPart).getDiagramEditPart();
		if (dgrmEP == null) {
			return;
		}
		FileDialog fd = new FileDialog(editorPart.getSite().getShell(), SWT.SAVE);
		fd.setFilterExtensions(new String[] { "*.pdf" });
		String filePath = fd.open();
		if (filePath != null) {
			boolean loadedPreferences = PrintHelperUtil.initializePreferences(dgrmEP,
					dgrmEP.getDiagramPreferencesHint());
			Rectangle figureBounds = PrintHelperUtil.getPageBreakBounds(dgrmEP, loadedPreferences);
			try (OutputStream os = new FileOutputStream(filePath)) {
				TBGDiagramSVGGenerator generator = new TBGDiagramSVGGenerator(dgrmEP);
				List editParts = dgrmEP.getPrimaryEditParts();
				generator.createConstrainedSWTImageDecriptorForParts(editParts, figureBounds.x, figureBounds.y,
						true);
				SVGImage svg = (SVGImage) generator.getRenderedImage();
				TranscoderOutput transcoderOutput = new TranscoderOutput(os);
				TranscoderInput transcoderInput = new TranscoderInput(svg.getDocument());
				PDFTranscoder pdfTranscoder = new PDFTranscoder();
				pdfTranscoder.transcode(transcoderInput, transcoderOutput);

				PlankopfPdfPostProcessor.postprocess(filePath, dgrmEP);

				MessageBox success = new MessageBox(editorPart.getSite().getShell());
				success.setText("Export erfolgreich");
				success.setMessage("Das Diagramm wurde erfolgreich exportiert.");
				success.open();
			} catch (Exception e) {
				e.printStackTrace();
				MessageBox failure = new MessageBox(editorPart.getSite().getShell());
				failure.setText("Error");
				failure.setMessage("Fehler beim erstellen der Datei: " + System.lineSeparator() + e.getMessage());
				failure.open();
			}
		}
	}

}

package at.tb_gruber.designer.ide.print;

import java.util.List;
import java.util.Optional;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IExpandableFigure;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramSVGGenerator;

import at.tb_gruber.designer.ide.preferences.TBGPreferencePage;

public class TBGDiagramSVGGenerator extends DiagramSVGGenerator {

	private static final int DIN_A4_WIDTH = 794; // A4 Seite bei 96 dpi
	private static final int DIN_A4_HEIGHT = 1123; // A4 Setie bei 96 dpi

	private static final int DEFAULT_MARGIN_LEFT = 113; // 3 cm bei 96 dpi
	private static final int DEFAULT_MARGIN_RIGHT = DIN_A4_WIDTH;
	private static final int DEFAULT_MARGIN_TOP = 38; // 1 cm bei 96 dpi
	private static final int DEFAULT_MARGIN_BOTTOM = 38; // 1 cm bei 96 dpi

	private Dimension diagramDimension;

	public TBGDiagramSVGGenerator(DiagramEditPart diagramEditPart) {
		super(diagramEditPart);
	}

	@Override
	public org.eclipse.swt.graphics.Rectangle calculateImageRectangle(List editparts) {
		Rectangle rect = calculateImageRectangleInternal(editparts);
		return new org.eclipse.swt.graphics.Rectangle(rect.x, rect.y, rect.width, rect.height);
	}

	private Rectangle calculateImageRectangleInternal(List<IGraphicalEditPart> editparts) {
		double minX = editparts.isEmpty() ? 0 : Double.MAX_VALUE;
		double maxX = editparts.isEmpty() ? 0 : Double.MIN_VALUE;
		double minY = editparts.isEmpty() ? 0 : Double.MAX_VALUE;
		double maxY = editparts.isEmpty() ? 0 : Double.MIN_VALUE;

		IFigure printableLayer = null;
		if (!editparts.isEmpty()) {
			printableLayer = LayerManager.Helper.find(editparts.get(0)).getLayer(LayerConstants.PRINTABLE_LAYERS);
		}

		for (IGraphicalEditPart editPart : editparts) {
			IFigure figure = editPart.getFigure();
			Rectangle bounds = null;
			if (figure instanceof IExpandableFigure)
				bounds = ((IExpandableFigure) figure).getExtendedBounds().getCopy();
			else
				bounds = figure.getBounds().getCopy();
			translateTo(bounds, figure, printableLayer);

			minX = Math.min(minX, bounds.preciseX());
			maxX = Math.max(maxX, bounds.preciseX() + bounds.preciseWidth());
			minY = Math.min(minY, bounds.preciseY());
			maxY = Math.max(maxY, bounds.preciseY() + bounds.preciseHeight());
		}

		int margin_top = diagramDimension.height() > DIN_A4_HEIGHT ? DEFAULT_MARGIN_TOP : DIN_A4_HEIGHT;
		double deltaX = maxX - minX;
		double deltaY = maxY - minY;

		PrecisionRectangle rect = new PrecisionRectangle();

		rect.preciseWidth = deltaX + (3 * DEFAULT_MARGIN_LEFT + DEFAULT_MARGIN_RIGHT + 2 * getImageMargin());
		rect.preciseHeight = deltaY > DIN_A4_HEIGHT
				? (deltaY + DEFAULT_MARGIN_TOP + DEFAULT_MARGIN_BOTTOM + 2 * getImageMargin())
				: (DIN_A4_HEIGHT + DEFAULT_MARGIN_BOTTOM + 2 * getImageMargin());

		rect.preciseX = minX - (DEFAULT_MARGIN_LEFT + getImageMargin());
		rect.preciseY = minY - (DEFAULT_MARGIN_TOP + getImageMargin());

		rect.updateInts();
		return rect;
	}

	public static final Translatable translateTo(Translatable t, IFigure translateFrom, IFigure translateTo) {
		for (IFigure walker = translateFrom; walker != null && walker != translateTo; walker = walker.getParent()) {
			walker.translateToParent(t);
		}
		return t;
	}

	public void setDiagramDimension(Dimension bounds) {
		this.diagramDimension = bounds;
	}

}

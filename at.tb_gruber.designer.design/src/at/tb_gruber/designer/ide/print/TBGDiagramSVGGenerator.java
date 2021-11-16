package at.tb_gruber.designer.ide.print;

import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Translatable;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.IExpandableFigure;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramSVGGenerator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import at.tb_gruber.designer.ide.preferences.TBGPreferencePage;

public class TBGDiagramSVGGenerator extends DiagramSVGGenerator {

	private static final int DEFAULT_MARGIN_LEFT = 10;
	private static final int DEFAULT_MARGIN_RIGHT = 10;
	private static final int DEFAULT_MARGIN_TOP = 10;
	private static final int DEFAULT_MARGIN_BOTTOM = 10;
	
	private int margin_left = Optional.ofNullable(System.getenv(TBGPreferencePage.MARGIN_LEFT_VARIABLE_NAME)).map(Integer::valueOf).orElse(DEFAULT_MARGIN_LEFT);
	private int margin_right = Optional.ofNullable(System.getenv(TBGPreferencePage.MARGIN_RIGHT_VARIABLE_NAME)).map(Integer::valueOf).orElse(DEFAULT_MARGIN_RIGHT);
	private int margin_top = Optional.ofNullable(System.getenv(TBGPreferencePage.MARGIN_TOP_VARIABLE_NAME)).map(Integer::valueOf).orElse(DEFAULT_MARGIN_TOP);
	private int margin_bottom = Optional.ofNullable(System.getenv(TBGPreferencePage.MARGIN_BOTTOM_VARIABLE_NAME)).map(Integer::valueOf).orElse(DEFAULT_MARGIN_BOTTOM);

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

		PrecisionRectangle rect = new PrecisionRectangle();
		rect.preciseWidth = maxX - minX;
		rect.preciseHeight = maxY - minY;

		rect.preciseX = minX - (margin_left + getImageMargin());
		rect.preciseY = minY - (margin_top + getImageMargin());
		rect.preciseWidth += (margin_left + margin_right + 2 * getImageMargin());
		rect.preciseHeight += (margin_top + margin_bottom + 2 * getImageMargin());
		rect.updateInts();
		return rect;
	}

	public static final Translatable translateTo(Translatable t, IFigure translateFrom, IFigure translateTo) {
		for (IFigure walker = translateFrom; walker != null && walker != translateTo; walker = walker.getParent()) {
			walker.translateToParent(t);
		}
		return t;
	}

}

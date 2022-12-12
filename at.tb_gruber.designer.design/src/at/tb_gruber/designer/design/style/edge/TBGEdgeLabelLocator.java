package at.tb_gruber.designer.design.style.edge;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Vector;
import org.eclipse.gmf.runtime.diagram.ui.figures.LabelLocator;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.LabelHelper;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.LineSeg;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.locator.EdgeLabelLocator;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.locator.EdgeLabelQuery;

import at.tb_gruber.designer.design.style.edge.TBGEdgeEditPart.TBGViewEdgeFigure.TBGEdgeLabel;

@Deprecated
public class TBGEdgeLabelLocator extends EdgeLabelLocator {

	public static final int BEGIN_LABEL_PERCENTAGE = 95;
	public static final int CENTER_LABEL_PERCENTAGE = 50;
	public static final int END_LABEL_PERCENTAGE = 5;

	private boolean hasBeenAlteredFromCommand = false;

	public TBGEdgeLabelLocator(IFigure parent, Rectangle bounds, int alignment) {
		super(parent, bounds, alignment);
	}

	@Override
	protected Point getReferencePoint() {
		if (parent instanceof Connection) {
			PointList ptList = ((Connection) parent).getPoints();
			return PointListUtilities.calculatePointRelativeToLine(ptList, 0, getLocation(), true);
		} else {
			return parent.getBounds().getLocation();
		}
	}

	/**
	 * Returns the
	 */
	private int getLocation() {
		switch (getAlignment()) {
		case ConnectionLocator.SOURCE:
			return BEGIN_LABEL_PERCENTAGE;
		case ConnectionLocator.TARGET:
			return END_LABEL_PERCENTAGE;
		case ConnectionLocator.MIDDLE:
			return CENTER_LABEL_PERCENTAGE;
		default:
			return CENTER_LABEL_PERCENTAGE;
		}
	}

	@Override
	public void relocate(IFigure target) {
		if (CENTER_LABEL_PERCENTAGE == getLocation()) {
			super.relocate(target);
			return;
		}

		Point defaultOffset = new Point(0, 10);
		if (hasBeenAlteredFromCommand && defaultOffset.equals(getOffset())) {
			hasBeenAlteredFromCommand = false;
			return;
		}

		/* Nur, wenn der Aufruf aus dem "eigenen" Commandstack kommt, auf eigene Art errechnen,
		 * Ursprung: at.tb_gruber.designer.gmf.editpolicy.TBGDragEditPartsTracker.executeCurrentCommand()
		 * Alles andere wird initial gebraucht  */
		Predicate<String> isFromCommand = s -> s
				.contains("at.tb_gruber.designer.gmf.editpolicy.TBGDragEditPartsTracker.executeCurrentCommand");
		boolean anyMatch = Stream.of(Thread.currentThread().getStackTrace()).limit(10).map(StackTraceElement::toString)
				.anyMatch(isFromCommand);
		if (!anyMatch) {
			if (!hasBeenAlteredFromCommand) {
				super.relocate(target);
			}
			return;
		}

		hasBeenAlteredFromCommand = true;
		target.setLocation(getTopLeft(target.getBounds()).translate(getOffset()));
	}

	private Point getTopLeft(Rectangle r) {
		return new Point(r.x, r.y);
	}
}
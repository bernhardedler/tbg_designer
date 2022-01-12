package at.tb_gruber.designer.design.style.edge;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.locator.EdgeLabelLocator;

public class TBGEdgeLabelLocator extends EdgeLabelLocator {

	public static final int BEGIN_LABEL_PERCENTAGE = 95;
	public static final int CENTER_LABEL_PERCENTAGE = 50;
	public static final int END_LABEL_PERCENTAGE = 5;
	

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
}

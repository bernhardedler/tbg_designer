package at.tb_gruber.designer.design.style.netzanschlusspunkt;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;

public class NetzanschlusspunktBorderItemLocator extends DBorderItemLocator {
	
	private static final Dimension OFFSET = new Dimension(29, 29);
	
	public NetzanschlusspunktBorderItemLocator(IFigure parentFigure) {
		super(parentFigure);
	}

    public NetzanschlusspunktBorderItemLocator(final IFigure borderItem, final IFigure parentFigure, final Rectangle constraint) {
        super(borderItem, parentFigure, constraint);
    }

    public NetzanschlusspunktBorderItemLocator(final IFigure parentFigure, final int preferredSide) {
        super(parentFigure, preferredSide);
    }
    
    /**
     * fixiert den Offset = Einrückungstiefe für die NAPs
     */
    @Override
    public void setBorderItemOffset(Dimension borderItemOffset) {
    	super.setBorderItemOffset(OFFSET);
    }

    /**
     * Zwingt die NAPs immer in die Mitte der oberen Kante
     */
    @Override
	protected Point getPreferredLocation(IFigure borderItem) {
		Rectangle bounds = getParentBorder();
		int parentFigureWidth = bounds.width;
		int parentFigureX = bounds.x;
		int parentFigureY = bounds.y;
		int x = parentFigureX;
		int y = parentFigureY;

		Dimension borderItemSize = getSize(borderItem);

		y = parentFigureY - borderItemSize.height + getBorderItemOffset().height;
		x += (parentFigureWidth / 2) - (borderItemSize.width / 2);
		return new Point(x, y);
	}
}

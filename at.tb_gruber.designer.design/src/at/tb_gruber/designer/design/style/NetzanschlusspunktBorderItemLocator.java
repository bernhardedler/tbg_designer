package at.tb_gruber.designer.design.style;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;

public class NetzanschlusspunktBorderItemLocator extends DBorderItemLocator {
	
	private static final Dimension OFFSET = new Dimension(8, 35);
	
	public NetzanschlusspunktBorderItemLocator(IFigure parentFigure) {
		super(parentFigure);
	}

    public NetzanschlusspunktBorderItemLocator(final IFigure borderItem, final IFigure parentFigure, final Rectangle constraint) {
        super(borderItem, parentFigure, constraint);
    }

    public NetzanschlusspunktBorderItemLocator(final IFigure parentFigure, final int preferredSide) {
        super(parentFigure, preferredSide);
    }
    
    @Override
    public void setBorderItemOffset(Dimension borderItemOffset) {
    	super.setBorderItemOffset(OFFSET);
    }
}

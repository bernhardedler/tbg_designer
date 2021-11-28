package at.tb_gruber.designer.design.style.plankopf;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SVGWorkspaceImageFigure;

public class PlankopfSVGFigure extends SVGWorkspaceImageFigure {

	public PlankopfSVGFigure() {
		minSize = new Dimension(0, 0);
	}
	
	public static PlankopfSVGFigure createImageFigure(final WorkspaceImage image) {
		PlankopfSVGFigure fig = new PlankopfSVGFigure();
        fig.refreshFigure(image);
        return fig;
    }
	
	@Override
	public Rectangle getClientArea(Rectangle rect) {
		rect.setBounds(getBounds());
		rect.crop(getInsets());
		
//		rect.setWidth(717);
//		rect.setHeight(231);
		
		if (useLocalCoordinates())
			rect.setLocation(0, 0);
		return rect;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
	}
	
}

package at.tb_gruber.designer.design.style;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.ui.tools.api.figure.locator.DBorderItemLocator;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.BorderItemLocatorProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IBorderItemOffsets;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.SimpleStyleConfiguration;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.GaugeCompositeFigure;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.util.AnchorProvider;
import org.eclipse.swt.graphics.Image;

public class AnlageStyleConfiguration implements StyleConfiguration {
	
	public AnlageStyleConfiguration() {
		System.out.println("Constructor");
	}
	
	/** The default style configuration. */
    private static final StyleConfiguration DEFAULT = new SimpleStyleConfiguration();
	
	@Override
	public void adaptNodeLabel(DNode arg0, SiriusWrapLabel arg1) {
		System.out.println("adaptNodeLabel");
        if (arg1.getParent() != null) {
            final Rectangle constraint = new Rectangle(arg1.getParent().getBounds());
            if (arg1.getParent() instanceof GaugeCompositeFigure) {
                constraint.x = 0;
                constraint.y = 0;
            }
            final Insets borderDimension = ((SimpleStyleConfiguration) DEFAULT).getBorderDimension(arg0);
            constraint.height -= borderDimension.top + borderDimension.bottom;
            constraint.width -= borderDimension.left + borderDimension.right;
            constraint.x += borderDimension.left;
            constraint.y += borderDimension.top;
            arg1.setBounds(constraint);
        }
	}

	@Override
	public int adaptViewNodeSizeWithLabel(DNode arg0, SiriusWrapLabel arg1, int arg2) {
		System.out.println("adaptViewNodeSizeWithLabel");
		return DEFAULT.adaptViewNodeSizeWithLabel(arg0, arg1, arg2);
	}

	@Override
	public AnchorProvider getAnchorProvider() {
		System.out.println("getAnchorProvider");
		AnchorProvider p = DEFAULT.getAnchorProvider();
		return p;
	}

	@Override
	public BorderItemLocatorProvider getBorderItemLocatorProvider() {
		System.out.println("getBorderItemLocatorProvider");
		return DEFAULT.getBorderItemLocatorProvider();
	}

	@Override
	public Dimension fitToText(DNode arg0, SiriusWrapLabel arg1, DefaultSizeNodeFigure arg2) {
		System.out.println("fitToText");
		return DEFAULT.fitToText(arg0, arg1, arg2);
	}

	@Override
	public Image getLabelIcon(DDiagramElement arg0, IGraphicalEditPart arg1) {
		System.out.println("getLabelIconAnlage");
		Image result = DEFAULT.getLabelIcon(arg0, arg1);
		return result;
	}

	@Override
	public IBorderItemLocator getNameBorderItemLocator(DNode arg0, IFigure arg1) {
		System.out.println("getNameBorderItemLocator");
		final BorderItemLocator locator = new DBorderItemLocator(arg1, PositionConstants.NSEW);
        locator.setBorderItemOffset(IBorderItemOffsets.NO_OFFSET);
        return locator;
	}

}
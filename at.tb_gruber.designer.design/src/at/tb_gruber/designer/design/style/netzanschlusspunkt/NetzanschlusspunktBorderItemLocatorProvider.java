package at.tb_gruber.designer.design.style.netzanschlusspunkt;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.BorderItemLocatorProvider;

public class NetzanschlusspunktBorderItemLocatorProvider implements BorderItemLocatorProvider {

	@Override
	public IBorderItemLocator getBorderItemLocator(IFigure figure, DDiagramElement diagramElementOwner,
			DDiagramElement diagramElementBorderItem) {
		final NetzanschlusspunktBorderItemLocator locator = new NetzanschlusspunktBorderItemLocator(figure, PositionConstants.NORTH);
		return locator;
	}

}

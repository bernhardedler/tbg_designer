package at.tb_gruber.designer.design.style;

import java.lang.reflect.Field;
import java.util.Optional;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.business.internal.query.DNodeContainerQuery;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramElementContainerEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.edit.internal.part.layoutmanager.RegionContainerConstrainedToolbarLayout;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.AirResizableEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.AirXYLayoutEditPolicy;
import org.eclipse.sirius.diagram.ui.graphical.edit.policies.SiriusContainerDropPolicy;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.layout.LayoutUtils;
import org.eclipse.sirius.diagram.ui.tools.internal.util.EditPartQuery;

public class PlankopfEditPart extends DNodeContainerEditPart implements IStyleEditPart {

	public PlankopfEditPart(View view) {
		super(view);
	}

	@Override
	public Dimension getDefaultDimension() {
		DDiagramElement dde = resolveDiagramElement();
		Dimension defaultSize = LayoutUtils.NEW_DEFAULT_CONTAINER_DIMENSION;

		defaultSize.setWidth(717);
		defaultSize.setHeight(231);

		if (dde instanceof DNodeContainer) {
			defaultSize = new DNodeContainerQuery((DNodeContainer) dde).getDefaultDimension();
		}

		if (new EditPartQuery(this).isCollapsed() && getParentStackDirection() == PositionConstants.NORTH_SOUTH) {
			defaultSize = defaultSize.getCopy().setHeight(LayoutUtils.COLLAPSED_VERTICAL_REGION_HEIGHT);
		}
		return defaultSize;
	}

	@Override
	public void createBackgroundFigure() {
		try {
			Field field = AbstractDiagramElementContainerEditPart.class.getDeclaredField("backgroundFigure");
			field.setAccessible(true);
			field.set(this, createBackgroundFigure(this));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			super.createBackgroundFigure();
		}
	}

	public IFigure createBackgroundFigure(final IGraphicalEditPart self) {
		final EObject eObj = self.resolveSemanticElement();
		if (eObj instanceof DDiagramElementContainer) {
			final DDiagramElementContainer container = (DDiagramElementContainer) eObj;
			if (container.getOwnedStyle() instanceof WorkspaceImage) {
				final WorkspaceImage img = (WorkspaceImage) container.getOwnedStyle();
				return createWkpImageFigure(img);
			}
		}
		return null;
	}

	private IFigure createWkpImageFigure(final WorkspaceImage img) {
		IFigure imageFigure = null;
		if (img != null && !StringUtil.isEmpty(img.getWorkspacePath())) {
			imageFigure = PlankopfSVGFigure.createImageFigure(img);
		}
		return imageFigure;
	}

}

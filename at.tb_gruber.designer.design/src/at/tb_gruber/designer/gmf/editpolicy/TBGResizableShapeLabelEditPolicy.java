package at.tb_gruber.designer.gmf.editpolicy;

import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.figures.LabelHelper;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.LabelViewConstants;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.AbstractDEdgeNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.locator.EdgeLabelQuery;

import at.tb_gruber.designer.design.style.edge.TBGEdgeLabelLocator;

@Deprecated
public class TBGResizableShapeLabelEditPolicy extends ResizableShapeEditPolicy {

	private IFigure feedback;

	/**
	 * Get the referenced point used as target point of tether feedback.
	 *
	 * @return the referenced point used as target point of tether feedback
	 */
	protected Point getReferencePoint() {
		if (getHost().getParent() instanceof AbstractConnectionEditPart) {
			PointList ptList = ((AbstractConnectionEditPart) getHost().getParent()).getConnectionFigure().getPoints();
			return PointListUtilities.calculatePointRelativeToLine(ptList, 0, getLocation(), true);
		} else {
			return ((GraphicalEditPart) getHost().getParent()).getFigure().getBounds().getLocation();
		}
	}

	/**
	 * Get the location among {@link LabelViewConstants} constants where to relocate
	 * the label figure.
	 *
	 * @return the location among {@link LabelViewConstants} constants
	 */
	private int getLocation() {
		int location = TBGEdgeLabelLocator.CENTER_LABEL_PERCENTAGE;
		switch (((AbstractDEdgeNameEditPart) getHost()).getKeyPoint()) {
		case ConnectionLocator.SOURCE:
			location = TBGEdgeLabelLocator.END_LABEL_PERCENTAGE;
			break;
		case ConnectionLocator.TARGET:
			location = TBGEdgeLabelLocator.BEGIN_LABEL_PERCENTAGE;
			break;
		case ConnectionLocator.MIDDLE:
			location = TBGEdgeLabelLocator.CENTER_LABEL_PERCENTAGE;
			break;
		default:
			location = TBGEdgeLabelLocator.CENTER_LABEL_PERCENTAGE;
			break;
		}
		return location;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.gef.editpolicies.ResizableEditPolicy#getResizeCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	@Override
	protected Command getResizeCommand(ChangeBoundsRequest request) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.gef.editpolicies.NonResizableEditPolicy#getMoveCommand(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	@Override
	protected Command getMoveCommand(ChangeBoundsRequest request) {
		// translate the feedback figure
		PrecisionRectangle rect = new PrecisionRectangle(getInitialFeedbackBounds().getCopy());
		getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());
		getHostFigure().translateToRelative(rect);

		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		ICommand moveCommand = new SetBoundsCommand(editingDomain, DiagramUIMessages.MoveLabelCommand_Label_Location,
				new EObjectAdapter((View) getHost().getModel()), request.getMoveDelta());
		return new ICommandProxy(moveCommand);
	}


	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableEditPolicyEx#showChangeBoundsFeedback(org.eclipse.gef.requests.ChangeBoundsRequest)
	 */
	@Override
	protected void showChangeBoundsFeedback(ChangeBoundsRequest request) {

		/* Ghost */
		feedback = getDragSourceFeedbackFigure();

		PrecisionRectangle rect = new PrecisionRectangle(getInitialFeedbackBounds().getCopy());
		getHostFigure().translateToAbsolute(rect);
		rect.translate(request.getMoveDelta());
		rect.resize(request.getSizeDelta());

		IFigure f = getHostFigure();
		Dimension min = f.getMinimumSize().getCopy();
		Dimension max = f.getMaximumSize().getCopy();
		IMapMode mmode = MapModeUtil.getMapMode(f);
		min.height = mmode.LPtoDP(min.height);
		min.width = mmode.LPtoDP(min.width);
		max.height = mmode.LPtoDP(max.height);
		max.width = mmode.LPtoDP(max.width);

		if (min.width > rect.width)
			rect.width = min.width;
		else if (max.width < rect.width)
			rect.width = max.width;

		if (min.height > rect.height)
			rect.height = min.height;
		else if (max.height < rect.height)
			rect.height = max.height;

		feedback.translateToRelative(rect);
		rect.setLocation(request.getLocation());
		feedback.setBounds(rect);

		/* Verbindungslinie zum Ghost */
		Point refPoint = getReferencePoint();

		// translate the refPoint
		PrecisionRectangle ref = new PrecisionRectangle(new Rectangle(refPoint.x, refPoint.y, 0, 0));
		getHostFigure().translateToAbsolute(ref);
		feedback.translateToRelative(ref);

	}

}

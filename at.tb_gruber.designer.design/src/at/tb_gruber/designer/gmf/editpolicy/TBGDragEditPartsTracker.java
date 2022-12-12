package at.tb_gruber.designer.gmf.editpolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;

@Deprecated
public class TBGDragEditPartsTracker extends DragEditPartsTrackerEx {

	public TBGDragEditPartsTracker(EditPart sourceEditPart) {
		super(sourceEditPart);
	}

	@Override
	protected boolean isMove() {
		return true;
	}

	@Override
	protected void snapPoint(ChangeBoundsRequest request) {
		// do nothing
	}

	protected void executeCurrentCommand() {
		Command curCommand = getCurrentCommand();
		if (curCommand != null && curCommand.canExecute()) {
			executeCommand(curCommand);
		}
		setCurrentCommand(null);
		if (isActive()) {
			if (getOperationSet().size() > 0) {
				if (getOperationSet().get(0) instanceof IGraphicalEditPart) {
					IGraphicalEditPart editpart = (IGraphicalEditPart) getOperationSet().get(0);
					if ((editpart.getFigure() == null) || (editpart.getFigure().getParent() == null)
							|| (editpart.getFigure().getParent().getLayoutManager() == null)) {
						return;
					}
					/* nur die eine Figure, die tatsächlich verschoben wurde neu rechnen */
					IFigure figure = editpart.getFigure();
					figure.setSize(figure.getPreferredSize());
					Object locator = figure.getParent().getLayoutManager().getConstraint(figure);
					if (locator != null && locator instanceof Locator) {
						((Locator) locator).relocate(figure);
					}
					reveal(editpart);
				}
			}
		}
	}
}

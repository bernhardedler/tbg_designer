package at.tb_gruber.designer.design.style;

import java.util.Optional;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.LabelViewConstants;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ITreeConnection.Orientation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.description.CenteringStyle;
import org.eclipse.sirius.diagram.impl.DEdgeImpl;
import org.eclipse.sirius.diagram.ui.business.internal.query.DEdgeQuery;
import org.eclipse.sirius.diagram.ui.business.internal.view.ShowingViewUtil;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart.ViewEdgeFigure;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramEdgeEditPart.ViewEdgeFigure.SiriusWrapLabelWithAttachmentWithModel;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SiriusWrapLabelWithAttachment;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import at.tb_gruber.designer.model.Verbindung;

public class VerbindungStyleEditPart extends AbstractDiagramEdgeEditPart implements IStyleEditPart {

	public VerbindungStyleEditPart(View view) {
		super(view);
	}

	@Override
	public void notifyChanged(Notification notification) {
		setColorForSpannung(resolveVerbindung());
		super.notifyChanged(notification);
	}

	private void setColorForSpannung(Verbindung verbindung) {

	}

	private Verbindung resolveVerbindung() {
		EObject resolve = this.resolveSemanticElement();
		EObject eObject = ((DEdgeImpl) resolve).getSemanticElements().get(0);
		return (Verbindung) eObject;
	}

	/**
	 * @was-generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DEdgeNameEditPart) {
			((DEdgeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewEdgeNameFigure());
			return true;
		}
		/* see LabelViewConstants */
		if (childEditPart instanceof DEdgeEndNameEditPart) {
			((DEdgeEndNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewEndEdgeNameFigure());

			return true;
		}
		if (childEditPart instanceof DEdgeBeginNameEditPart) {
			((DEdgeBeginNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureViewBeginEdgeNameFigure());
			((SiriusWrapLabelWithAttachmentWithModel) getPrimaryShape().getFigureViewEdgeNameFigure())
					.setModel((View) getParent().getModel());

			return true;
		}
		return false;
	}

	/**
	 * @was-generated
	 */
	public AbstractDiagramEdgeEditPart.ViewEdgeFigure getPrimaryShape() {
		return (AbstractDiagramEdgeEditPart.ViewEdgeFigure) getFigure();
	}

	/**
	 * @was-generated
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	@Override
	protected Connection createConnectionFigure() {
		return new TBGViewEdgeFigure();
	}

	/**
	 * Freche Kopie von ViewEdgeFigure, Attachments (Labels) Überschrieben
	 * 
	 * @author bernh
	 *
	 */
	public class TBGViewEdgeFigure extends ViewEdgeFigure {
		
		/**
		 * @was-generated
		 */
		private SiriusWrapLabelWithAttachment fFigureViewEdgeNameFigure;

		private SiriusWrapLabelWithAttachment fFigureViewEdgeBeginNameFigure;

		private SiriusWrapLabelWithAttachment fFigureViewEdgeEndNameFigure;

		private Polyline attachmentToEdgeNameFigure;

		private Polyline attachmentToEdgeBeginNameFigure;

		private Polyline attachmentToEdgeEndNameFigure;

		private CenteringStyle centeringStyle;

		/**
		 * Constructor.
		 */
		public TBGViewEdgeFigure() {
			createContents();
		}

		/**
		 * @not-generated : we don't want to create the label
		 */
		private void createContents() {
			final EObject element = resolveSemanticElement();

			// We must create the fFigureViewEdgeNameFigure to avoid NPE after
			// (On some cases, like Undo of ContainerDrop operation, the element
			// is DSemanticDiagram and not DEdge)
			createCenterLabelFigure(element);
			createBeginLabelFigure(element);
			createEndLabelFigure(element);
			initCentering(element);
		}

		private void initCentering(EObject element) {
			if (element instanceof DEdge) {
				EdgeStyle edgeStyle = ((DEdge) element).getOwnedStyle();
				if (edgeStyle != null) {
					setCentering(edgeStyle.getCentered());
				}
			}

		}

		private void setCentering(CenteringStyle centering) {
			this.centeringStyle = centering;
		}

		/**
		 * Get the centeringStyle value.
		 * 
		 * @return the {@link CenteringStyle}.
		 */
		public CenteringStyle getCenteringStyle() {
			return this.centeringStyle;
		}

		/**
		 * Returns whether the connection is centered on its source or not.
		 * 
		 * @return true if the connection is centered on its source or both. False
		 *         otherwise.
		 */
		public boolean isSourceCentered() {
			return CenteringStyle.BOTH == getCenteringStyle() || CenteringStyle.SOURCE == getCenteringStyle();
		}

		/**
		 * Returns whether the connection is centered on its target or not.
		 * 
		 * @return true if the connection is centered on its target or both. False
		 *         otherwise.
		 */
		public boolean isTargetCentered() {
			return CenteringStyle.BOTH == getCenteringStyle() || CenteringStyle.TARGET == getCenteringStyle();
		}

		/**
		 * @param element
		 */
		private void createCenterLabelFigure(final EObject element) {
			attachmentToEdgeNameFigure = addNewAttachmentFigure();
			fFigureViewEdgeNameFigure = new SiriusWrapLabelWithAttachmentWithModel(LabelViewConstants.MIDDLE_LOCATION,
					attachmentToEdgeNameFigure);

			if (element instanceof DEdge) {
				DEdge edge = (DEdge) element;
				fFigureViewEdgeNameFigure.setText(edge.getName());
				fFigureViewEdgeNameFigure.setVisible(!StringUtil.isEmpty(edge.getName()));
			} else {
				fFigureViewEdgeNameFigure.setVisible(false);
			}
			fFigureViewEdgeNameFigure.setLabelAlignment(PositionConstants.CENTER);
			fFigureViewEdgeNameFigure.setTextWrap(true);
			fFigureViewEdgeNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
			this.add(fFigureViewEdgeNameFigure);

		}

		/**
		 * @param element
		 */
		private void createBeginLabelFigure(final EObject element) {
			attachmentToEdgeBeginNameFigure = addNewAttachmentFigure();

			fFigureViewEdgeBeginNameFigure = new SiriusWrapLabelWithAttachmentWithModel(
					LabelViewConstants.SOURCE_LOCATION, attachmentToEdgeBeginNameFigure);
			if (element instanceof DEdge) {
				DEdge edge = (DEdge) element;
				fFigureViewEdgeBeginNameFigure.setText(edge.getBeginLabel());
				fFigureViewEdgeBeginNameFigure.setVisible(!StringUtil.isEmpty(edge.getBeginLabel()));
			} else {
				fFigureViewEdgeBeginNameFigure.setVisible(false);
			}
			fFigureViewEdgeBeginNameFigure.setLabelAlignment(PositionConstants.LEFT);
			fFigureViewEdgeBeginNameFigure.setTextWrap(true);
			fFigureViewEdgeBeginNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
			this.add(fFigureViewEdgeBeginNameFigure);

		}

		/**
		 * Create a new attachment figure, add it to the current figure and return it.
		 * 
		 * @return the new attachment figure.
		 */
		private Polyline addNewAttachmentFigure() {
			Polyline newAttachment = new Polyline();
			newAttachment.setLineStyle(Graphics.LINE_DASHDOT);
			newAttachment.setForegroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_LIST_SELECTION));
			newAttachment.setVisible(false);
			this.add(newAttachment);
			return newAttachment;
		}

		/**
		 * @param element
		 */
		private void createEndLabelFigure(final EObject element) {
			attachmentToEdgeEndNameFigure = addNewAttachmentFigure();

			fFigureViewEdgeEndNameFigure = new SiriusWrapLabelWithAttachmentWithModel(
					LabelViewConstants.TARGET_LOCATION, attachmentToEdgeEndNameFigure);
			if (element instanceof DEdge) {
				DEdge edge = (DEdge) element;
				fFigureViewEdgeEndNameFigure.setText(edge.getEndLabel());
				fFigureViewEdgeEndNameFigure.setVisible(!StringUtil.isEmpty(edge.getEndLabel()));
			} else {
				fFigureViewEdgeEndNameFigure.setVisible(false);
			}
			fFigureViewEdgeEndNameFigure.setLabelAlignment(PositionConstants.CENTER);
			fFigureViewEdgeEndNameFigure.setTextWrap(true);
			fFigureViewEdgeEndNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
			this.add(fFigureViewEdgeEndNameFigure);

		}

		@SuppressWarnings("deprecation")
		@Override
		public void layout() {
			if (!isActive()) {
				return;
			}
			final EObject element = resolveSemanticElement();
			if (element != null && DEdge.class.isInstance(element)) {
				final DEdge edge = (DEdge) element;
				boolean needRefreshVisuals = false;
				if (edge.getPath() != null && !edge.getPath().isEmpty()) {
					if (getSelected() != EditPart.SELECTED_PRIMARY) {
						needRefreshVisuals = true;
					}
				}
				if (needRefreshVisuals || edge.isIsMockEdge()) {
					refreshVisuals();
				}

				if (this.getBounds() != null && getSource() != null && getTarget() != null) {
					super.layout();
				}

				if (edge.getName() == null || StringUtil.isEmpty(edge.getName())) {
					fFigureViewEdgeNameFigure.setVisible(false);
				}

				if (edge.getName() != null && !StringUtil.isEmpty(edge.getName())
						&& !(new DDiagramElementQuery(edge).isLabelHidden())
						&& !fFigureViewEdgeNameFigure.isVisible()) {
					fFigureViewEdgeNameFigure.setVisible(true);
				}
				if (edge.getEndLabel() == null || StringUtil.isEmpty(edge.getEndLabel())) {
					fFigureViewEdgeEndNameFigure.setVisible(false);
				}
				if (edge.getEndLabel() != null && !StringUtil.isEmpty(edge.getEndLabel())
						&& !(new DDiagramElementQuery(edge).isLabelHidden())
						&& !fFigureViewEdgeEndNameFigure.isVisible()) {
					fFigureViewEdgeEndNameFigure.setVisible(true);
				}
				if (edge.getBeginLabel() == null || StringUtil.isEmpty(edge.getBeginLabel())) {
					fFigureViewEdgeBeginNameFigure.setVisible(false);
				}
				if (edge.getBeginLabel() != null && !StringUtil.isEmpty(edge.getBeginLabel())
						&& !(new DDiagramElementQuery(edge).isLabelHidden())
						&& !fFigureViewEdgeBeginNameFigure.isVisible()) {
					fFigureViewEdgeBeginNameFigure.setVisible(true);
				}
			}
		}

		@SuppressWarnings("deprecation")
		@Override
		public void paintFigure(final Graphics graphics) {
			if (!isActive()) {
				return;
			}
			final EObject element = resolveSemanticElement();
			if (element != null && DEdge.class.isInstance(element)) {
				final DEdge viewEdge = (DEdge) element;
				DDiagram diagram = viewEdge.getParentDiagram();
				if ((!viewEdge.isIsMockEdge() && viewEdge.isVisible())
						|| (diagram != null && diagram.isIsInShowingMode())) {
					ShowingViewUtil.initGraphicsForVisibleAndInvisibleElements(this, graphics, (View) getModel());
					try {
						super.paintFigure(graphics);
						graphics.restoreState();
					} finally {
						graphics.popState();
					}
				}
			}
		}

		@Override
		protected void paintChildren(Graphics graphics) {
			super.paintChildren(graphics);
//			if (!isActive()) {
//				return;
//			}
//			final EObject element = resolveSemanticElement();
//			if (element != null && DEdge.class.isInstance(element)) {
//				final DEdge viewEdge = (DEdge) element;
//				DEdgeQuery dEdgeQuery = new DEdgeQuery(viewEdge);
//				Optional<DDiagram> diagram = dEdgeQuery.getDDiagram();
//				if (viewEdge.isVisible() || (diagram.isPresent() && diagram.get().isIsInShowingMode())) {
//					super.paintChildren(graphics);
//				}
//			}
		}

		/**
		 * Get the name figure.
		 * 
		 * @return the name figure
		 */
		public SiriusWrapLabel getFigureViewEdgeNameFigure() {
			return fFigureViewEdgeNameFigure;
		}

		/**
		 * Get the name figure.
		 * 
		 * @return the name figure
		 */
		public SiriusWrapLabel getFigureViewBeginEdgeNameFigure() {
			return fFigureViewEdgeBeginNameFigure;
		}

		/**
		 * Get the name figure.
		 * 
		 * @return the name figure
		 */
		public SiriusWrapLabel getFigureViewEndEdgeNameFigure() {
			return fFigureViewEdgeEndNameFigure;
		}

		/**
		 * Overridden to have public access to its method.
		 * 
		 * {@inheritDoc}
		 */
		@Override
		public RotatableDecoration getSourceDecoration() {
			return super.getSourceDecoration();
		}

		/**
		 * Overridden to have public access to its method.
		 * 
		 * {@inheritDoc}
		 */
		@Override
		public RotatableDecoration getTargetDecoration() {
			return super.getTargetDecoration();
		}

		@Override
		public String getHint() {
			if (VerbindungStyleEditPart.this.getTarget() != null) {
				return VerbindungStyleEditPart.this.getTarget().toString();
			} else {
				return "base"; //$NON-NLS-1$
			}
		}

		@Override
		public Orientation getOrientation() {
			return Orientation.VERTICAL;
		}

		/**
		 * Returns the edit part who owns this figure.
		 * 
		 * @return the owner edit part.
		 */
		public IGraphicalEditPart getEditPart() {
			return VerbindungStyleEditPart.this;
		}

	}

}

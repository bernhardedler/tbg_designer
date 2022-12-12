package at.tb_gruber.designer.design.style.edge;

import java.util.Optional;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ITreeConnection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.description.CenteringStyle;
import org.eclipse.sirius.diagram.ui.business.internal.query.DEdgeQuery;
import org.eclipse.sirius.diagram.ui.business.internal.view.ShowingViewUtil;
import org.eclipse.sirius.diagram.ui.edit.internal.part.CommonEditPartOperation;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.SiriusWrapLabelWithAttachment;
import org.eclipse.sirius.ext.gmf.runtime.draw2d.ui.figures.SiriusPolylineConnectionEx;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.IFigureWithoutLabels;
import org.eclipse.sirius.ext.gmf.runtime.gef.ui.figures.SiriusWrapLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

@Deprecated
public class TBGEdgeEditPart extends DEdgeEditPart {

	public TBGEdgeEditPart(View view) {
		super(view);
	}

	@Override
	protected Connection createConnectionFigure() {
		return new TBGViewEdgeFigure();
	}

	@Override
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TBGEdgeNameEditPart) {
			((TBGEdgeNameEditPart) childEditPart).setLabel(getShape().getFigureViewEdgeNameFigure());
			return true;
		}
		if (childEditPart instanceof TBGEdgeEndNameEditPart) {
			((TBGEdgeEndNameEditPart) childEditPart).setLabel(getShape().getFigureViewEndEdgeNameFigure());
			return true;
		}
		if (childEditPart instanceof TBGEdgeBeginNameEditPart) {
			((TBGEdgeBeginNameEditPart) childEditPart).setLabel(getShape().getFigureViewBeginEdgeNameFigure());
			return true;
		}
		return false;
	}

	public TBGViewEdgeFigure getShape() {
		return (TBGEdgeEditPart.TBGViewEdgeFigure) getFigure();
	}

	/**
	 * The figure.
	 */
	public class TBGViewEdgeFigure extends SiriusPolylineConnectionEx implements ITreeConnection, IFigureWithoutLabels {

		public final class TBGEdgeLabel extends SiriusWrapLabelWithAttachment {

			private View model;

			private TBGEdgeLabel(int location, Polyline attachment) {
				super(location, attachment);
			}

			public void setModel(View model) {
				this.model = model;
			}

			@Override
			public void paint(Graphics graphics) {
				ShowingViewUtil.initGraphicsForVisibleAndInvisibleElements(this, graphics, model);
				try {
					CommonEditPartOperation.setGraphicsTraceabilityId(graphics, () -> resolveTargetSemanticElement());
					super.paint(graphics);
					CommonEditPartOperation.setGraphicsTraceabilityId(graphics, null);
					graphics.restoreState();
				} finally {
					graphics.popState();
				}
			}

			@Override
			public void setBounds(Rectangle rect) {
				super.setBounds(rect);
			}

		}

		/**
		 * @was-generated
		 */
		private TBGEdgeLabel fFigureViewEdgeNameFigure;

		private TBGEdgeLabel fFigureViewEdgeBeginNameFigure;

		private TBGEdgeLabel fFigureViewEdgeEndNameFigure;

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
			fFigureViewEdgeNameFigure = new TBGEdgeLabel(TBGEdgeLabelLocator.CENTER_LABEL_PERCENTAGE,
					attachmentToEdgeNameFigure);

			if (element instanceof DEdge) {
				DEdge edge = (DEdge) element;
				fFigureViewEdgeNameFigure.setText(edge.getName());
				fFigureViewEdgeNameFigure.setVisible(!StringUtil.isEmpty(edge.getName()));
			} else {
				fFigureViewEdgeNameFigure.setVisible(false);
			}
			fFigureViewEdgeNameFigure.setLabelAlignment(PositionConstants.CENTER);
			fFigureViewEdgeNameFigure.setTextWrap(false);
			fFigureViewEdgeNameFigure.setTextWrapAlignment(PositionConstants.CENTER);
			this.add(fFigureViewEdgeNameFigure);

		}

		/**
		 * @param element
		 */
		private void createBeginLabelFigure(final EObject element) {
			attachmentToEdgeBeginNameFigure = addNewAttachmentFigure();

			fFigureViewEdgeBeginNameFigure = new TBGEdgeLabel(TBGEdgeLabelLocator.BEGIN_LABEL_PERCENTAGE,
					attachmentToEdgeBeginNameFigure);
			if (element instanceof DEdge) {
				DEdge edge = (DEdge) element;
				fFigureViewEdgeBeginNameFigure.setText(edge.getBeginLabel());
				fFigureViewEdgeBeginNameFigure.setVisible(!StringUtil.isEmpty(edge.getBeginLabel()));
			} else {
				fFigureViewEdgeBeginNameFigure.setVisible(false);
			}
			fFigureViewEdgeBeginNameFigure.setLabelAlignment(PositionConstants.LEFT);
			fFigureViewEdgeBeginNameFigure.setTextWrap(false);
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
			newAttachment.setVisible(true);
			this.add(newAttachment);
			return newAttachment;
		}

		/**
		 * @param element
		 */
		private void createEndLabelFigure(final EObject element) {
			attachmentToEdgeEndNameFigure = addNewAttachmentFigure();

			fFigureViewEdgeEndNameFigure = new TBGEdgeLabel(TBGEdgeLabelLocator.END_LABEL_PERCENTAGE,
					attachmentToEdgeEndNameFigure);
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
			if (!isActive()) {
				return;
			}
			final EObject element = resolveSemanticElement();
			if (element != null && DEdge.class.isInstance(element)) {
				final DEdge viewEdge = (DEdge) element;
				DEdgeQuery dEdgeQuery = new DEdgeQuery(viewEdge);
				Optional<DDiagram> diagram = dEdgeQuery.getDDiagram();
				if (viewEdge.isVisible() || (diagram.isPresent() && diagram.get().isIsInShowingMode())) {
					super.paintChildren(graphics);
				}
			}
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
			if (TBGEdgeEditPart.this.getTarget() != null) {
				return TBGEdgeEditPart.this.getTarget().toString();
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
			return TBGEdgeEditPart.this;
		}

		@Override
		public Rectangle getBoundsWithoutLabels() {
			return getPoints().getBounds();
		}
	}
}

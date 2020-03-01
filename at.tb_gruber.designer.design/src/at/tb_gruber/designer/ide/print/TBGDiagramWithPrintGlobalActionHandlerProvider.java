package at.tb_gruber.designer.ide.print;

import java.util.Hashtable;

import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;
import org.eclipse.sirius.diagram.ui.tools.internal.print.SiriusDiagramWithPrintGlobalActionHandler;
import org.eclipse.sirius.diagram.ui.tools.internal.print.SiriusDiagramWithPrintGlobalActionHandlerProvider;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

public class TBGDiagramWithPrintGlobalActionHandlerProvider extends SiriusDiagramWithPrintGlobalActionHandlerProvider {

	private Hashtable handlerList = new Hashtable();

    /**
     * Constructor for DiagramWithPrintGlobalActionHandlerProvider.
     */
    public TBGDiagramWithPrintGlobalActionHandlerProvider() {
        super();
    }

    /**
     * Return a global action handler for the given context.
     * 
     * @param context
     *            the current global action handler context
     * @return a global action hanlder
     */
    @Override
    public IGlobalActionHandler getGlobalActionHandler(final IGlobalActionHandlerContext context) {
        /* Create the handler */
        if (!getHandlerList().containsKey(context.getActivePart())) {
            getHandlerList().put(context.getActivePart(), new TBGGlobalPrintActionHandler());

            /*
             * Register as a part listener so that the cache can be cleared when
             * the part is disposed
             */
            context.getActivePart().getSite().getPage().addPartListener(new IPartListener() {

                private IWorkbenchPart localPart = context.getActivePart();

                public void partActivated(final IWorkbenchPart part) {
                    // Do nothing
                }

                public void partBroughtToTop(final IWorkbenchPart part) {
                    // Do nothing
                }

                public void partClosed(final IWorkbenchPart part) {
                    /* Remove the cache associated with the part */
                    if (part != null && part == localPart && getHandlerList().containsKey(part)) {
                        getHandlerList().remove(part);
                        localPart.getSite().getPage().removePartListener(this);
                        localPart = null;
                    }
                }

                public void partDeactivated(final IWorkbenchPart part) {
                    // Do nothing
                }

                public void partOpened(final IWorkbenchPart part) {
                    // Do nothing
                }
            });
        }

        return (TBGGlobalPrintActionHandler) getHandlerList().get(context.getActivePart());
    }

    /**
     * Returns the handlerList.
     * 
     * @return Hashtable
     */
    private Hashtable getHandlerList() {
        return handlerList;
    }
}

package at.tb_gruber.designer.design.style;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.impl.EdgeMappingImpl;
import org.eclipse.sirius.diagram.description.impl.NodeMappingImpl;
import org.eclipse.sirius.diagram.impl.EdgeStyleImpl;
import org.eclipse.sirius.diagram.impl.SquareImpl;
import org.eclipse.sirius.diagram.impl.WorkspaceImageImpl;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;

public class StyleConfigurationProvider implements IStyleConfigurationProvider {

	public StyleConfigurationProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public StyleConfiguration createStyleConfiguration(DiagramElementMapping arg0, Style arg1) {
		if (isVerbindung(arg0, arg1)) {
			return new VerbindungStyleConfiguration();
		} else if (isAnlage(arg0, arg1)) {
			return new AnlageStyleConfiguration();
		}
		return null;
	}

	@Override
	public boolean provides(DiagramElementMapping arg0, Style arg1) {
//		System.out.println(arg0.getClass());
//		System.out.println(arg1.getClass());
//		System.out.println("---------------------------------------");
//		return isVerbindung(arg0, arg1) || isAnlage(arg0, arg1);
		return false;
	}

	private boolean isVerbindung(DiagramElementMapping arg0, Style arg1) {
		return arg0 instanceof EdgeMappingImpl && arg1 instanceof EdgeStyleImpl;
	}
	
	private boolean isAnlage(DiagramElementMapping arg0, Style arg1) {
		return arg0 instanceof NodeMappingImpl && (arg1 instanceof WorkspaceImageImpl || arg1 instanceof SquareImpl);
	}
	
}

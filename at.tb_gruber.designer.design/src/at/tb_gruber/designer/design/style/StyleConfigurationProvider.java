package at.tb_gruber.designer.design.style;

import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;

public class StyleConfigurationProvider implements IStyleConfigurationProvider {

	public static final String mapping_name = "VerteilerContainer"; // BorderNodeNap
	
	@Override
	public boolean provides(DiagramElementMapping mapping, Style style) {
		if (mapping instanceof ContainerMapping) {
			ContainerMapping container = (ContainerMapping) mapping;
			if (container.getName().equals(mapping_name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public StyleConfiguration createStyleConfiguration(DiagramElementMapping mapping, Style style) {
		if (mapping instanceof ContainerMapping) {
			ContainerMapping container = (ContainerMapping) mapping;
			if (container.getName().equals(mapping_name)) {
				return new NetzanschlusspunktBorderNodeStyleConfiguration();
			}
		}
		return null;
	}

}

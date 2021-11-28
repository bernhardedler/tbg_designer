package at.tb_gruber.designer.design.style.netzanschlusspunkt;

import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.BorderItemLocatorProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.SimpleStyleConfiguration;

public class NetzanschlusspunktBorderNodeStyleConfiguration extends SimpleStyleConfiguration {
	
	@Override
	public BorderItemLocatorProvider getBorderItemLocatorProvider() {
		return new NetzanschlusspunktBorderItemLocatorProvider();
	}

}

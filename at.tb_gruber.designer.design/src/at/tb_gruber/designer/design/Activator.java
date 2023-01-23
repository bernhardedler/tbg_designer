package at.tb_gruber.designer.design;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.diagram.ui.edit.internal.part.DiagramElementEditPartOperation;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import at.tb_gruber.designer.ide.preferences.TBGPreferencePage;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "at.tb_gruber.designer.design";
	
	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(
				ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/designer.odesign"));
		
		String dashLength = System.getProperty(TBGPreferencePage.DASH_LENGTH);
		try {
			float length = Float.parseFloat(dashLength);
			
			Field field = DiagramElementEditPartOperation.class.getDeclaredField("DASH_STYLE");
			field.setAccessible(true);
			
			Field modifiersField = Field.class.getDeclaredField("modifiers");
			modifiersField.setAccessible(true);
			modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
			
			field.set(null, new float[] { length, length });
		} catch (NumberFormatException e) {
			// do nothing
		}
			
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}

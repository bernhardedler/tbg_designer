package at.tb_gruber.designer.ide.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class TBGPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String PREFERENCE_SCOPE_IDENTIFIER = "at.tb_gruber.designer.ide.preferences.page";

	public static final String PROPERTY_ID_IMMO_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.immo";
	public static final String PROPERTY_ID_VERKEHRSSTATIONEN_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.vs";
	public static final String PROPERTY_ID_GEBAEUDE_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.gebaeude";
	public static final String PROPERTY_ID_BETREIBER_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.betreiber";
	public static final String PROPERTY_ID_EIGENTUEMER_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.eigentuemer";

	public static final String AUTO_RESET_ORIGIN = "at.tb_gruber.designer.ide.preferences.diagram.autoresetorigin";
	public static final String DEBUG_LOG = "at.tb_gruber.designer.ide.preferences.debug.log";
	public static final String DASH_LENGTH = "at.tb_gruber.designer.ide.preferences.diagram.dash.length";
	

	// https://www.vogella.com/tutorials/EclipsePreferences/article.html
	public TBGPreferencePage() {
		super(GRID);
	}

	public void createFieldEditors() {
		FileFieldEditor immoDatei = new FileFieldEditor(PROPERTY_ID_IMMO_DATEI, "&Immobilien:", getFieldEditorParent());
		immoDatei.setFileExtensions(new String[] { "*.csv" });
		addField(immoDatei);
		FileFieldEditor vsDatei = new FileFieldEditor(PROPERTY_ID_VERKEHRSSTATIONEN_DATEI, "&Verkehrsstationen:",
				getFieldEditorParent());
		vsDatei.setFileExtensions(new String[] { "*.csv" });
		addField(vsDatei);
		FileFieldEditor gebaeudeDatei = new FileFieldEditor(PROPERTY_ID_GEBAEUDE_DATEI, "&Gebaeude:",
				getFieldEditorParent());
		gebaeudeDatei.setFileExtensions(new String[] { "*.csv" });
		addField(gebaeudeDatei);
		FileFieldEditor betreiberDatei = new FileFieldEditor(PROPERTY_ID_BETREIBER_DATEI, "&Betreiber:",
				getFieldEditorParent());
		betreiberDatei.setFileExtensions(new String[] { "*.csv" });
		addField(betreiberDatei);
		FileFieldEditor eigentuemerDatei = new FileFieldEditor(PROPERTY_ID_EIGENTUEMER_DATEI, "&Eigentuemer:",
				getFieldEditorParent());
		eigentuemerDatei.setFileExtensions(new String[] { "*.csv" });
		addField(eigentuemerDatei);
		BooleanFieldEditor resetOrigin = new BooleanFieldEditor(AUTO_RESET_ORIGIN, "&Ursprung beim öffnen neu setzen:",
				getFieldEditorParent());
		addField(resetOrigin);
		BooleanFieldEditor debugLog = new BooleanFieldEditor(DEBUG_LOG, "&Debug Log:",
				getFieldEditorParent());
		addField(debugLog);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, PREFERENCE_SCOPE_IDENTIFIER));
	}

}
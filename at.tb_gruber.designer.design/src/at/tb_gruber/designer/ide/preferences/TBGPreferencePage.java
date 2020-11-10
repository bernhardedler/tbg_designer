package at.tb_gruber.designer.ide.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class TBGPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

		public static final String PROPERTY_ID_IMMO_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.immo";
		public static final String PROPERTY_ID_VERKEHRSSTATIONEN_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.vs";
		public static final String PROPERTY_ID_GEBAEUDE_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.gebaeude";
		public static final String PREFERENCE_SCOPE_IDENTIFIER = "at.tb_gruber.designer.ide.preferences.page";
	
		// https://www.vogella.com/tutorials/EclipsePreferences/article.html
	    public TBGPreferencePage() {
	        super(GRID);
	    }

	    public void createFieldEditors() {
	    	FileFieldEditor immoDatei = new FileFieldEditor(PROPERTY_ID_IMMO_DATEI, "&Immobilien:", getFieldEditorParent());
	    	immoDatei.setFileExtensions(new String[] {"*.csv"});
	        addField(immoDatei);
	        FileFieldEditor vsDatei = new FileFieldEditor(PROPERTY_ID_VERKEHRSSTATIONEN_DATEI, "&Verkehrsstationen:", getFieldEditorParent());
	        vsDatei.setFileExtensions(new String[] {"*.csv"});
	        addField(vsDatei);
	        FileFieldEditor gebaeudeDatei = new FileFieldEditor(PROPERTY_ID_GEBAEUDE_DATEI, "&Gebaeude:", getFieldEditorParent());
	        gebaeudeDatei.setFileExtensions(new String[] {"*.csv"});
	        addField(gebaeudeDatei);
	    }

	    @Override
	    public void init(IWorkbench workbench) {
	        setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, PREFERENCE_SCOPE_IDENTIFIER));
	    }

	}
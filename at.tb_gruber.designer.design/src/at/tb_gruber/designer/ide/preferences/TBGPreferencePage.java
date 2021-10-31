package at.tb_gruber.designer.ide.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class TBGPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public static final String PREFERENCE_SCOPE_IDENTIFIER = "at.tb_gruber.designer.ide.preferences.page";

	public static final String PROPERTY_ID_IMMO_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.immo";
	public static final String PROPERTY_ID_VERKEHRSSTATIONEN_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.vs";
	public static final String PROPERTY_ID_GEBAEUDE_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.gebaeude";
	public static final String PROPERTY_ID_BETREIBER_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.betreiber";
	public static final String PROPERTY_ID_EIGENTUEMER_DATEI = "at.tb_gruber.designer.ide.preferences.csvfile.eigentuemer";

	public static final String MARGIN_LEFT_VARIABLE_NAME = "at.tb_gruber.designer.ide.preferences.print.margin.left";
	public static final String MARGIN_RIGHT_VARIABLE_NAME = "at.tb_gruber.designer.ide.preferences.print.margin.right";
	public static final String MARGIN_TOP_VARIABLE_NAME = "at.tb_gruber.designer.ide.preferences.print.margin.top";
	public static final String MARGIN_BOTTOM_VARIABLE_NAME = "at.tb_gruber.designer.ide.preferences.print.margin.bottom";

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
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, PREFERENCE_SCOPE_IDENTIFIER));
	}

	@Override
	public void performHelp() {
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		InfoPopupDialog ipd = new InfoPopupDialog(activeShell);
		ipd.setContents(getHelpMessage());
		ipd.open();
	}

	private String getHelpMessage() {
		return "Immobilien: " + PROPERTY_ID_IMMO_DATEI + "\n" + "Verkehrsstationen: "
				+ PROPERTY_ID_VERKEHRSSTATIONEN_DATEI + "\n" + "Geb\u00e4ude: " + PROPERTY_ID_GEBAEUDE_DATEI + "\n"
				+ "Betreiber: " + PROPERTY_ID_BETREIBER_DATEI + "\n" + "Eigent\u00fcmer: "
				+ PROPERTY_ID_EIGENTUEMER_DATEI + "\n" + "Druckrand Links: " + MARGIN_LEFT_VARIABLE_NAME + "\n"
				+ "Druckrand Rechts: " + MARGIN_RIGHT_VARIABLE_NAME + "\n" + "Druckrand Oben: "
				+ MARGIN_TOP_VARIABLE_NAME + "\n" + "Druckrand Unten: " + MARGIN_BOTTOM_VARIABLE_NAME;
	}

	private class InfoPopupDialog extends PopupDialog {

		private Text text;

		private String contents = "";

		InfoPopupDialog(Shell parent) {
			super(parent, PopupDialog.INFOPOPUP_SHELLSTYLE, false, false, false, false, false, null, null);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			text = new Text(parent, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP | SWT.NO_FOCUS);

			// Use the compact margins employed by PopupDialog.
			GridData gd = new GridData(GridData.BEGINNING | GridData.FILL_BOTH);
			gd.horizontalIndent = PopupDialog.POPUP_HORIZONTALSPACING;
			gd.verticalIndent = PopupDialog.POPUP_VERTICALSPACING;
			text.setLayoutData(gd);
			text.setText(contents);

			return text;
		}

		@Override
		protected void adjustBounds() {
			Rectangle parentBounds = getParentShell().getBounds();
			Rectangle proposedBounds = new Rectangle(parentBounds.x + 300, parentBounds.y + 300, 500, 150);
			getShell().setBounds(proposedBounds);
		}

		@Override
		protected Color getForeground() {
			return getControl().getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND);
		}

		@Override
		protected Color getBackground() {
			return getControl().getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND);
		}

		void setContents(String newContents) {
			if (newContents == null) {
				newContents = "";
			}
			this.contents = newContents;
			if (text != null && !text.isDisposed()) {
				text.setText(contents);
			}
		}

		boolean hasFocus() {
			if (text == null || text.isDisposed()) {
				return false;
			}
			return text.getShell().isFocusControl() || text.isFocusControl();
		}
	}
}
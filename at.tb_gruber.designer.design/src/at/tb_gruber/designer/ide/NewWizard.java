package at.tb_gruber.designer.ide;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage _pageOne;
	private static final String WIZARD_NAME = "neues TBG-Designer-Projekt";

	public NewWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		final ProjectCreationOperation arduinoModelingProjectCreationOperation = new ProjectCreationOperation(
				_pageOne.getProjectHandle());

		try {
			getContainer().run(true, false, arduinoModelingProjectCreationOperation);
		} catch (InvocationTargetException e) {
			System.out.println("ERROR: Create project failed");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("ERROR: Create project failed");
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		_pageOne = new WizardNewProjectCreationPage(WIZARD_NAME);
		_pageOne.setTitle("Neues TBG-Designer Projekt anlegen");
		_pageOne.setDescription("Erstellt die benötigte Projektstruktur");
		addPage(_pageOne);
	}
}

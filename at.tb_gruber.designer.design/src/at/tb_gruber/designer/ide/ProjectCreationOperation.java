package at.tb_gruber.designer.ide;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class ProjectCreationOperation extends WorkspaceModifyOperation {

	private IProject project;

	public ProjectCreationOperation(IProject project) {
		this.project = project;
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		try {
			final ProjectServices service = new ProjectServices();

			monitor.beginTask("Load project", 100);
			monitor.subTask("Close project");
			service.closeProjects(monitor);
			monitor.worked(50);
			monitor.subTask("Create project");
			service.createProject(monitor, project);
			monitor.worked(50);
		} finally {
			monitor.done();
		}
	}
}
package at.tb_gruber.designer.ide;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;

public class CustomProjectSupport {
	/**
	 * For this marvelous project we need to: - create the default Eclipse project -
	 * add the custom project nature - create the folder structure
	 *
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 * @throws IOException 
	 * @throws CoreException 
	 */
	public static IProject createProject(String projectName, URI location) throws IOException, CoreException {
		Assert.isNotNull(projectName);
		Assert.isTrue(projectName.trim().length() > 0);

		IProject project = createBaseProject(projectName, location);
		try {
			addNatures(project);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}
		project.refreshLocal(IResource.DEPTH_ONE, null);
		return project;
	}

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param location
	 * @param projectName
	 */
	private static IProject createBaseProject(String projectName, URI location) {
		// it is acceptable to use the ResourcesPlugin class
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return newProject;
	}

	private static void addRequiredFilesToProjectStructure(IProject newProject) throws IOException {
		IPath location = newProject.getLocation();

		IPath modelFileURI = location.addTrailingSeparator().append(newProject.getName() + ".model");
		File modelFile = modelFileURI.toFile();
		if (!modelFile.exists()) {
			modelFile.createNewFile();
			String newFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
					+ "<tbg:Bahnhof xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:tbg=\"http://www.tb-gruber.at/model\" name=\""
					+ newProject.getName() + "\">\r\n" + "</tbg:Bahnhof>\r\n";
			FileOutputStream outputStream = new FileOutputStream(modelFile);
		    byte[] strToBytes = newFileContent.getBytes();
		    outputStream.write(strToBytes);
		    outputStream.close();
		}
		
		IPath airdFileURI = location.addTrailingSeparator().append("representations.aird");
		File airdFile = airdFileURI.toFile();
		if (!airdFile.exists()) {
			airdFile.createNewFile();
			String newFileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
					"<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:description=\"http://www.eclipse.org/sirius/description/1.1.0\" xmlns:description_1=\"http://www.eclipse.org/sirius/diagram/description/1.1.0\" xmlns:description_2=\"http://www.eclipse.org/sirius/table/description/1.1.0\" xmlns:diagram=\"http://www.eclipse.org/sirius/diagram/1.1.0\" xmlns:notation=\"http://www.eclipse.org/gmf/runtime/1.0.2/notation\" xmlns:table=\"http://www.eclipse.org/sirius/table/1.1.0\" xmlns:tbg=\"http://www.tb-gruber.at/model\" xmlns:viewpoint=\"http://www.eclipse.org/sirius/1.1.0\" xsi:schemaLocation=\"http://www.eclipse.org/sirius/description/1.1.0 http://www.eclipse.org/sirius/1.1.0#//description http://www.eclipse.org/sirius/diagram/description/1.1.0 http://www.eclipse.org/sirius/diagram/1.1.0#//description http://www.eclipse.org/sirius/table/description/1.1.0 http://www.eclipse.org/sirius/table/1.1.0#//description\">\r\n" + 
					"  <viewpoint:DAnalysis uid=\"_lsf8wDMVEequ473mSlfkCA\" selectedViews=\"_mMfrcDMVEequ473mSlfkCA\" version=\"14.3.0.201909031200\">\r\n" + 
					"    <semanticResources>" + modelFile.getName() + "</semanticResources>\r\n" + 
					"    <ownedViews xmi:type=\"viewpoint:DView\" uid=\"_mMfrcDMVEequ473mSlfkCA\">\r\n" + 
					"      <viewpoint xmi:type=\"description:Viewpoint\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']\"/>\r\n" + 
					"      <ownedRepresentationDescriptors xmi:type=\"viewpoint:DRepresentationDescriptor\" uid=\"_mNVY8DMVEequ473mSlfkCA\" name=\"Anlagendiagramm\" repPath=\"#_mMzNcDMVEequ473mSlfkCA\" changeId=\"07bcea97-2080-471d-a72f-5ca6fe2da70c\">\r\n" + 
					"        <description xmi:type=\"description_1:DiagramDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']\"/>\r\n" + 
					"        <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"      </ownedRepresentationDescriptors>\r\n" + 
					"      <ownedRepresentationDescriptors xmi:type=\"viewpoint:DRepresentationDescriptor\" uid=\"_oREyUTMVEequ473mSlfkCA\" name=\"Anlagentabelle\" repPath=\"#_oQ7BUDMVEequ473mSlfkCA\" changeId=\"8f99f03d-9c72-4777-ba6c-c667776b0d90\">\r\n" + 
					"        <description xmi:type=\"description_2:EditionTableDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']\"/>\r\n" + 
					"        <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"      </ownedRepresentationDescriptors>\r\n" + 
					"    </ownedViews>\r\n" + 
					"  </viewpoint:DAnalysis>\r\n" + 
					"  <diagram:DSemanticDiagram uid=\"_mMzNcDMVEequ473mSlfkCA\">\r\n" + 
					"    <ownedAnnotationEntries xmi:type=\"description:AnnotationEntry\" uid=\"_mNSVoDMVEequ473mSlfkCA\" source=\"DANNOTATION_CUSTOMIZATION_KEY\">\r\n" + 
					"      <data xmi:type=\"diagram:ComputedStyleDescriptionRegistry\" uid=\"_mNSVoTMVEequ473mSlfkCA\"/>\r\n" + 
					"    </ownedAnnotationEntries>\r\n" + 
					"    <ownedAnnotationEntries xmi:type=\"description:AnnotationEntry\" uid=\"_mNi0UDMVEequ473mSlfkCA\" source=\"GMF_DIAGRAMS\">\r\n" + 
					"      <data xmi:type=\"notation:Diagram\" xmi:id=\"_mNi0UTMVEequ473mSlfkCA\" type=\"Sirius\" element=\"_mMzNcDMVEequ473mSlfkCA\" measurementUnit=\"Pixel\">\r\n" + 
					"        <styles xmi:type=\"notation:DiagramStyle\" xmi:id=\"_mNi0UjMVEequ473mSlfkCA\"/>\r\n" + 
					"      </data>\r\n" + 
					"    </ownedAnnotationEntries>\r\n" + 
					"    <description xmi:type=\"description_1:DiagramDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']\"/>\r\n" + 
					"    <filterVariableHistory xmi:type=\"diagram:FilterVariableHistory\" uid=\"_mM9lgDMVEequ473mSlfkCA\"/>\r\n" + 
					"    <activatedLayers xmi:type=\"description_1:Layer\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagendiagramm']/@defaultLayer\"/>\r\n" + 
					"    <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"  </diagram:DSemanticDiagram>\r\n" + 
					"  <table:DTable uid=\"_oQ7BUDMVEequ473mSlfkCA\" headerColumnWidth=\"15\">\r\n" + 
					"    <target xmi:type=\"tbg:Bahnhof\" href=\"" + modelFile.getName() + "#/\"/>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oQ-rsDMVEequ473mSlfkCA\" label=\"Bahnhof\" width=\"60\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='bhfBahnof']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRDkMTMVEequ473mSlfkCA\" label=\"Projektname\" width=\"82\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='bhfProjektname']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELQDMVEequ473mSlfkCA\" label=\"Objektname\" width=\"80\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='objObjektname']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELQjMVEequ473mSlfkCA\" label=\"Objektart\" width=\"64\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='objObjektart']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELRDMVEequ473mSlfkCA\" label=\"Anlagenname\" width=\"89\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlAnlagenname']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELRjMVEequ473mSlfkCA\" label=\"Anlagennart\" width=\"80\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlAnlagenart']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELSDMVEequ473mSlfkCA\" label=\"Anlagennummer\" width=\"105\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlAnlagennummer']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELSjMVEequ473mSlfkCA\" label=\"Versorgungsspannung Frequenz\" width=\"184\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlVersorgungsspannung']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELTDMVEequ473mSlfkCA\" label=\"Trafospannung Frequenz sek.\" width=\"168\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlTrafospannung']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELTjMVEequ473mSlfkCA\" label=\"Trafo-kVA\" width=\"66\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='anlTrafoKva']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELUDMVEequ473mSlfkCA\" label=\"versorgt von Anlagenname\" width=\"158\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdVersorgtVonAnl']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELUjMVEequ473mSlfkCA\" label=\"versorgt von (Versorgungsknoten/Trafo...)\" width=\"234\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdVersorgtVonArt']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELVDMVEequ473mSlfkCA\" label=\"versorgt von Anlagennummer\" width=\"174\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdVersorgtVonNr']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELVjMVEequ473mSlfkCA\" label=\"vesorgt von Objekt\" width=\"115\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdVersorgtVonObj']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELWDMVEequ473mSlfkCA\" label=\"Versorgungsspannung / Frequenz\" width=\"192\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdSpannung']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <columns xmi:type=\"table:DFeatureColumn\" uid=\"_oRELWjMVEequ473mSlfkCA\" label=\"Kabeltype\" width=\"67\" featureName=\"ursprung\">\r\n" + 
					"      <originMapping xmi:type=\"description_2:FeatureColumnMapping\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']/@ownedColumnMappings[name='vbdKabeltyp']\"/>\r\n" + 
					"    </columns>\r\n" + 
					"    <description xmi:type=\"description_2:EditionTableDescription\" href=\"platform:/plugin/at.tb_gruber.designer.design/description/designer.odesign#//@ownedViewpoints[name='AnlagenDesigner']/@ownedRepresentations[name='Anlagentabelle']\"/>\r\n" + 
					"  </table:DTable>\r\n" + 
					"</xmi:XMI>\r\n" + 
					"";
			FileOutputStream outputStream = new FileOutputStream(airdFile);
		    byte[] strToBytes = newFileContent.getBytes();
		    outputStream.write(strToBytes);
		    outputStream.close();
		}
	}

	public static void addNatures(IProject project) throws CoreException, IOException {
		List<String> naturesToBeAdded = Arrays.asList(ProjectNature.NATURE_ID,
				"org.eclipse.sirius.nature.modelingproject");

		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + naturesToBeAdded.size()];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		for (int i = 0; i < naturesToBeAdded.size(); i++) {
			newNatures[natures.length + i] = naturesToBeAdded.get(i);
		}
		// validate the natures
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus status = workspace.validateNatureSet(newNatures);
		// only apply new nature, if the status is ok
		if (status.getCode() == IStatus.OK) {
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
		
		addRequiredFilesToProjectStructure(project);
	}

}
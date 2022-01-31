package at.tb_gruber.designer.design;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.ui.IEditorPart;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.AnlageMitAttributen;
import at.tb_gruber.designer.model.Bahnhof;
import at.tb_gruber.designer.model.Betreiber;
import at.tb_gruber.designer.model.Details;
import at.tb_gruber.designer.model.Eigentuemer;
import at.tb_gruber.designer.model.Energiespeicher;
import at.tb_gruber.designer.model.Energietechnikanlage;
import at.tb_gruber.designer.model.Generator;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.NapPosition;
import at.tb_gruber.designer.model.Netzanschlusspunkt;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Spannungsarttype;
import at.tb_gruber.designer.model.Trafo;
import at.tb_gruber.designer.model.Umrichter;
import at.tb_gruber.designer.model.Verbindung;
import at.tb_gruber.designer.model.Versorgungsknoten;
import at.tb_gruber.designer.model.VerteilerBase;
import at.tb_gruber.designer.model.VerteilerContainer;
import at.tb_gruber.designer.model.VerteilerMitZaehler;

/**
 * The services class used by VSM.
 */
public class DiagramServices {
	
	private CSVPropertyProvider props = CSVPropertyProvider.getInstance();

	/**
	 * Erstellt die nächst niedrige, noch nicht vergebene ID
	 * 
	 * @param self
	 * @return
	 */
	public Integer generateID(EObject self) {
		AnlageBase parent = (AnlageBase) self.eContainer();
		EObject container = parent.eContainer();
		Bahnhof project = null;
		if (container instanceof Objekt) {
			Objekt containerObj = (Objekt) container;
			project = (Bahnhof) containerObj.eContainer();
		} else if (container instanceof VerteilerContainer) {
			VerteilerContainer vtc = (VerteilerContainer) container;
			Objekt containerObj = (Objekt) vtc.eContainer();
			project = (Bahnhof) containerObj.eContainer();
		}

		Set<Integer> alleIds = new TreeSet<Integer>();
		for (Objekt objekt : project.getObjekt()) {
			for (AnlageBase anlage : objekt.getAnlage()) {
				if (anlage instanceof VerteilerContainer) {
					for (VerteilerBase verteiler : ((VerteilerContainer) anlage).getVerteiler()) {
						for (Verbindung verbindung : verteiler.getVerbindungNach()) {
							alleIds.add(verbindung.getNr());
						}
					}
				}
				for (Verbindung verbindung : anlage.getVerbindungNach()) {
					alleIds.add(verbindung.getNr());
				}
			}
		}

		Integer[] alleIdsArray = new Integer[alleIds.size()];
		alleIdsArray = alleIds.toArray(alleIdsArray);

		for (int i = 1; i < alleIdsArray.length; i++) {
			if (i != alleIdsArray[i]) {
				return i;
			}
		}
		return alleIdsArray.length;
	}

	public String getLabelUrsprung(EObject self) {
		StringBuilder label = new StringBuilder();
		if (self instanceof Verbindung) {
			Verbindung v = (Verbindung) self;
			label.append(v.getNr());
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getQuellSicherung()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabeltype()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabellaenge()).orElse(""));
		}
		return label.toString();
	}

	public String getLabelZiel(EObject self) {
		StringBuilder label = new StringBuilder();
		if (self instanceof Verbindung) {
			Verbindung v = (Verbindung) self;
			label.append(v.getNr());
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getZielSicherung()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabeltype()).orElse(""));
			label.append(System.lineSeparator());
			label.append(Optional.ofNullable(v.getKabellaenge()).orElse(""));
		}
		return label.toString();
	}

	private Boolean isSpannungsart(EObject self, Integer target) {
		if (self instanceof Verbindung) {
			return target.equals(((Verbindung) self).getPrimaerspannung().getValue());
		} else if (self instanceof AnlageMitAttributen) {
			return target.equals(((AnlageMitAttributen) self).getPrimaerspannung().getValue());
		} else if (self instanceof VerteilerBase) {
			return target
					.equals(((VerteilerContainer) ((VerteilerBase) self).eContainer()).getPrimaerspannung().getValue());
		} else if (self instanceof VerteilerContainer) {
			return target.equals(((VerteilerContainer) self).getPrimaerspannung().getValue());
		}
		return false;
	}

	public Boolean isTrafo(EObject self) {
		return self instanceof Trafo;
	}

	public Boolean isEt(EObject self) {
		return self instanceof Energietechnikanlage;
	}

	public Boolean isVk(EObject self) {
		return self instanceof Versorgungsknoten;
	}

	public Boolean isVspViolett(EObject self) {
		return isSpannungsart(self, Spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isVspRot(EObject self) {
		return isSpannungsart(self, Spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isVspBlau(EObject self) {
		return isSpannungsart(self, Spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isVspGruen(EObject self) {
		return isSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isVspMagenta(EObject self) {
		return isSpannungsart(self, Spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isVspCyan(EObject self) {
		return isSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isVspBraun(EObject self) {
		return isSpannungsart(self, Spannungsarttype.RESERVE_2_VALUE);
	}

	public Boolean isTspViolett(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.RESERVE_1_VALUE);
	}

	public Boolean isTspRot(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.HSP_UN_AB_1K_V50_HZ_VALUE);
	}

	public Boolean isTspBlau(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.UN_BIS_INKL_15K_VDC_VALUE);
	}

	public Boolean isTspGruen(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V50_HZ_AC_VALUE);
	}

	public Boolean isTspMagenta(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.HSP_UN_15K_V16_7HZ_VALUE);
	}

	public Boolean isTspCyan(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.NSP_UN_BIS_INKL_1K_V16_7HZ_VALUE);
	}

	public Boolean isTspBraun(EObject self) {
		return isTrafoSpannungsart(self, Spannungsarttype.RESERVE_2_VALUE);
	}

	private Boolean isTrafoSpannungsart(EObject self, Integer target) {
		if (self instanceof Trafo) {
			return target.equals(((Trafo) self).getSekundaerspannung().getValue());
		}
		return false;
	}

	public String getVersorgungsknotenSize(EObject self) {
		if (self instanceof Versorgungsknoten) {
			int cnt = ((AnlageMitAttributen) self).getVerbindungNach().size();
			return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";
		} else if (self instanceof VerteilerBase) {
			int cnt = ((VerteilerBase) self).getVerbindungNach().size();
			return (cnt >= 0 && cnt <= 6) ? "s" : (cnt >= 7 && cnt <= 12) ? "m" : "l";

		} else {
			return "";
		}
	}

	public Boolean isNapVor(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DAVOR)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public Boolean isNapMitte(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.MITTE)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public Boolean isNapNach(EObject self) {
		if (self instanceof VerteilerContainer) {
			return Optional.ofNullable(((VerteilerContainer) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof VerteilerBase) {
			return Optional.ofNullable(((VerteilerBase) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else if (self instanceof Versorgungsknoten) {
			return Optional.ofNullable(((Versorgungsknoten) self).getNetzanschlusspunkt())
					.map(nap -> nap.getPostition().equals(NapPosition.DANACH)).orElse(Boolean.FALSE);
		} else {
			return false;
		}
	}

	public List<String> getAllBetreiber(EObject self) {
		return props.getBetreiber();
	}

	public List<String> getAllEigentuemer(EObject self) {
		return props.getEigentuemer();
	}

	public Boolean isSolid(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.HAUPTVERSORGUNG);
	}

	public Boolean isDot(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.EVU);
	}

	public Boolean isDash(EObject self) {
		return self instanceof Verbindung && ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_OEBB);
	}

	public Boolean isDashDot(EObject self) {
		return self instanceof Verbindung
				&& ((Verbindung) self).getLinientype().equals(LinienType.KUNDENANLAGE_DRITTER);
	}

	public String createDetailsText(EObject self) {
		if (self.eContainer() instanceof Umrichter) {
			return ((Umrichter) self.eContainer()).getNennleistung();
		} else if (self.eContainer() instanceof Energiespeicher) {
			Energiespeicher esp = (Energiespeicher) self.eContainer();
			return Optional.ofNullable(esp.getAutonomiezeit()).orElse("");
		} else if (self.eContainer() instanceof Trafo) {
			Trafo trafo = (Trafo) self.eContainer();
			return Optional.ofNullable(trafo.getOberspannung()).orElse("0V") + "/"
					+ Optional.ofNullable(trafo.getUnterspannung()).orElse("0V") + System.lineSeparator()
					+ System.lineSeparator() + Optional.ofNullable(trafo.getTrafoKva()).orElse("0kVA");
		} else if (self.eContainer() instanceof Generator) {
			Generator gen = (Generator) self.eContainer();
			return Optional.ofNullable(gen.getErzeugteSpannung()).orElse("0V") + System.lineSeparator()
					+ System.lineSeparator() + Optional.ofNullable(gen.getErzeugteEnergie()).orElse("0")
					+ System.lineSeparator() + Optional.ofNullable(gen.getElektrischeLeistung()).orElse("0W");
		} else if (self.eContainer() instanceof VerteilerMitZaehler) {
			VerteilerMitZaehler zv = (VerteilerMitZaehler) self.eContainer();
			return Optional.ofNullable(zv.getName()).orElse("") + System.lineSeparator() + zv.getNrHauptversorgung();
		}
		return "";
	}

	public Boolean isVerteilerContainerNap(EObject self) {
		return self instanceof Netzanschlusspunkt
				&& ((Netzanschlusspunkt) self).eContainer() instanceof VerteilerContainer;
	}

	public void selectBetreiberAndNAP(EObject self) {
		Set<IGraphicalEditPart> selectedElements = getSelectedBetreiberAndNap(self);
		selectElements(selectedElements);
	}

	public void selectEigentuemer(EObject self) {
		Set<IGraphicalEditPart> selectedElements = getSelectedEigentuemer(self);
		selectElements(selectedElements);
	}

	private IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagramElement).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);

			IGraphicalEditPart result = null;
			if (gmfView != null && editor instanceof DiagramEditor) {
				final Map<?, ?> editPartRegistry = ((DiagramEditor) editor).getDiagramGraphicalViewer()
						.getEditPartRegistry();
				final Object editPart = editPartRegistry.get(gmfView);
				if (editPart instanceof IGraphicalEditPart) {
					result = (IGraphicalEditPart) editPart;
					return result;
				}
			}
		}
		return null;
	}

	private List<DDiagramElement> getAllElements(EObject self) {
		if (self.eContainer() instanceof DSemanticDiagram)  {
			return ((DSemanticDiagram) self.eContainer()).getDiagramElements();
		} else {
			return getAllElements(self.eContainer());
		}
	}
	
	private Set<IGraphicalEditPart> getSelectedBetreiberAndNap(EObject self){
		if (!(self instanceof DNode && ((DNode) self).getSemanticElements().get(0) instanceof AnlageBase)
				&& !(self instanceof DNodeContainer && ((DNodeContainer) self).getSemanticElements().get(0) instanceof VerteilerContainer)) {
			return Collections.emptySet();
		}
		
		Betreiber betreiber = null;
		EList<Details> details = null;
		Netzanschlusspunkt nap = null;
		if (self instanceof DNode) {
			AnlageBase anlage = (AnlageBase) ((DNode) self).getSemanticElements().get(0);
			betreiber = anlage.getBetreiber();
			details = anlage.getDetails();
			
			if (anlage instanceof VerteilerBase) {
				nap = ((VerteilerBase) anlage).getNetzanschlusspunkt();
			} else if (anlage instanceof Versorgungsknoten) {
				nap = ((Versorgungsknoten) anlage).getNetzanschlusspunkt();
			}
		} else if (self instanceof DNodeContainer) {
			VerteilerContainer vc = (VerteilerContainer) ((DNodeContainer)self).getSemanticElements().get(0);
			betreiber = vc.getBetreiber();
			details = vc.getDetails();
			nap = vc.getNetzanschlusspunkt();
		}
			
		Set<IGraphicalEditPart> selectedElements = new HashSet<>();
		for (DDiagramElement element : getAllElements(self)) {
			if (element instanceof DNode) {
				DNode node = (DNode) element;
				if (node.getSemanticElements().contains(betreiber)
						|| node.getSemanticElements().contains(nap)) {
					selectedElements.add(getEditPart(element));
				}

				for (Details detail : details) {
					if (node.getSemanticElements().contains(detail)) {
						selectedElements.add(getEditPart(element));
					}
				}
			}
		}
		return selectedElements;
	}
	
	private Set<IGraphicalEditPart> getSelectedEigentuemer(EObject self){
		if (!(self instanceof DNodeContainer) || !(((DNodeContainer) self).getSemanticElements().get(0) instanceof Objekt)) {
			return Collections.emptySet();
		}
		Objekt objekt = (Objekt) ((DNodeContainer) self).getSemanticElements().get(0);
		Eigentuemer eigentuemer = objekt.getEigentuemer();
		Set<IGraphicalEditPart> selectedElements = new HashSet<>();
		for (DDiagramElement element : getAllElements(self)) {
			if (element instanceof DNode) {
				DNode node = (DNode) element;
				if (node.getSemanticElements().contains(eigentuemer)) {
					selectedElements.add(getEditPart(element));}
			}
		}
		return selectedElements;
	}
	
	private void selectElements(Set<IGraphicalEditPart> elementsToSelect) {
		elementsToSelect.forEach(e-> e.setSelected(1));
		
		Job j = new Job("selectElements") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					return Status.CANCEL_STATUS;
				}
				elementsToSelect.forEach(e-> e.setSelected(0));
				return Status.OK_STATUS;
			}
		};
		j.schedule();
	}
}
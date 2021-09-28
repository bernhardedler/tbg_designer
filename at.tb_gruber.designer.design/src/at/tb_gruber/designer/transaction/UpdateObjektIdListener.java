package at.tb_gruber.designer.transaction;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.header.DiagramHeaderComposite;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.ModelPackage;
import at.tb_gruber.designer.model.Objekt;

public class UpdateObjektIdListener extends ResourceSetListenerImpl {

	private CSVPropertyProvider props = CSVPropertyProvider.getInstance();

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		for (Notification notification : event.getNotifications()) {
			if (notification.getEventType() == Notification.SET && notification.getFeature() instanceof EAttribute
					&& ((EAttribute) notification.getFeature()).getName().equals("objektId")
					&& notification.getNewValue() instanceof String) {
				Objekt ziel = (Objekt) notification.getNotifier();
				String newObjektId = notification.getNewStringValue();

				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(ziel);

				RecordingCommand rc = new RecordingCommand(ted) {

					@Override
					protected void doExecute() {
						String newAdresse = props.getAdresseForId(newObjektId, ziel.getExterneQuelle());
						if (!newAdresse.isBlank()) {
							ziel.setOrt_adresse(newAdresse);
						}
						String newName = props.getObjektNameForId(newObjektId, ziel.getExterneQuelle());
						if (!newName.isBlank()) {
							ziel.setName(newName);
						}

						String newArt = props.getGebaeudeartForId(newObjektId, ziel.getExterneQuelle());
						if (!newArt.isBlank()) {
							ziel.setGebaeudeart(newArt);
						}
					}
				};
				return rc;
			}
		}
		return null;
	}

}

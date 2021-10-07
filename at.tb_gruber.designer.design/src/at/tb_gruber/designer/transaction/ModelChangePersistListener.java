package at.tb_gruber.designer.transaction;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Verbindung;

public class ModelChangePersistListener extends ResourceSetListenerImpl {

	private CSVPropertyProvider props = CSVPropertyProvider.getInstance();

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		for (Notification notification : event.getNotifications()) {
			if (notification.getEventType() == Notification.SET && notification.getFeature() instanceof EAttribute
					&& (((EAttribute) notification.getFeature()).getName().equals("objektId")
						|| ((EAttribute) notification.getFeature()).getName().equals("externeQuelle"))
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
						String newGPS = props.getGPSStandortForId(newObjektId, ziel.getExterneQuelle());
						if (!newGPS.isBlank()) {
							ziel.setGpsstandort(newGPS);
						}
					}
				};
				return rc;
			}
			if (notification.getEventType() == Notification.ADD
					&& notification.getNewValue() instanceof Verbindung) {
				Verbindung verbindung = ((Verbindung) notification.getNewValue());
				if(notification.getNotifier() instanceof AnlageBase
						&&((AnlageBase) notification.getNotifier()).getVersorgtVon().stream().anyMatch(v -> v.getLinientype().equals(LinienType.KUNDENANLAGE_OEBB))){
					
					TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(verbindung);
					RecordingCommand rc = new RecordingCommand(ted) {

						@Override
						protected void doExecute() {
							verbindung.setLinientype(LinienType.KUNDENANLAGE_OEBB);
						}
					};
					return rc;

				}
			}
		}
		return null;
	}

}

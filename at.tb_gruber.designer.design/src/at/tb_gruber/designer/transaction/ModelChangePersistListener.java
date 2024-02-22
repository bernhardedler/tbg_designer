package at.tb_gruber.designer.transaction;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
import at.tb_gruber.designer.ide.preferences.CSVPropertyProvider.ObjektInfo;
import at.tb_gruber.designer.model.AnlageBase;
import at.tb_gruber.designer.model.Externe_Datenquelle;
import at.tb_gruber.designer.model.LinienType;
import at.tb_gruber.designer.model.Objekt;
import at.tb_gruber.designer.model.Verbindung;

public class ModelChangePersistListener extends ResourceSetListenerImpl {

	private CSVPropertyProvider props = CSVPropertyProvider.getInstance();

	Predicate<Notification> isSetAttribute = notification -> notification.getEventType() == Notification.SET && notification.getFeature() instanceof EAttribute;
	Predicate<Notification> isValidStringChange = notification -> "objektId".equals(((EAttribute) notification.getFeature()).getName()) && notification.getNewValue() instanceof String;
	Predicate<Notification> isValidDatenquelleChange = notification -> "externeQuelle".equals(((EAttribute) notification.getFeature()).getName()) && notification.getNewValue() instanceof Externe_Datenquelle;
	Predicate<Notification> isValidChange = isValidStringChange.or(isValidDatenquelleChange);
	
	
	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		for (Notification notification : event.getNotifications()) {
			if (isSetAttribute.test(notification) && isValidChange.test(notification)) {
				Objekt ziel = (Objekt) notification.getNotifier();
				
				TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(ziel);
				RecordingCommand rc = new RecordingCommand(ted) {

					@Override
					protected void doExecute() {
						Optional<ObjektInfo> objektOpt = props.getForId(ziel.getObjektId(), ziel.getExterneQuelle(), false);
						if (objektOpt.isPresent()) {
							ObjektInfo objekt = objektOpt.get();
							ziel.setOrt_adresse(
									Stream.of(objekt.getLand(), objekt.getPlz(), objekt.getOrt(), objekt.getStrasse())
											.collect(Collectors.joining(" ")));
							ziel.setName(objekt.getObjektName());
							ziel.setGebaeudeart(objekt.getGebaeudeArt());
							ziel.setGpsstandort(objekt.getGpsLon() + " " + objekt.getGpsLat());
						}
					}
				};
				return rc;
			}
			if (notification.getEventType() == Notification.ADD && notification.getNewValue() instanceof Verbindung) {
				Verbindung verbindung = ((Verbindung) notification.getNewValue());
				if (notification.getNotifier() instanceof AnlageBase
						&& ((AnlageBase) notification.getNotifier()).getVersorgtVon().stream()
								.anyMatch(v -> v.getLinientype().equals(LinienType.KUNDENANLAGE_OEBB))) {

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

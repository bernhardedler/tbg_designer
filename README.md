# Eclipse Product
### Setup
https://www.eclipse.org/downloads/packages/release/2019-12/r/eclipse-modeling-tools
plugins:
 - sirius
 - maven
 - tycho m2 connector

### Tutorials:
https://wiki.eclipse.org/Sirius/Tutorials/StarterTutorial
https://wiki.eclipse.org/Sirius/Tutorials/AdvancedTutorial
https://www.eclipse.org/sirius/doc/developer/extensions-provide_custom_style.html


## Tycho Build

## Eclipse Projekt
`at.tb_gruber.designer.ide.*` kümmert sich um den Projekt-Wizard, die Natures und die korrekte Initialisierung des Datemodells.

# Sirius
## odesign
### Darstellung
### Anlegen neuer elemente
### Ausgabetabelle

## Eigene grafische Elemente
`at.tb_gruber.designer.design.style.*` definiert eigene Elemente für die Planansicht. Hauptsächlich geht es dabei um die korrekte Darstellung von SVG-Grafiken.
  <extension point="org.eclipse.gmf.runtime.diagram.ui.editpartProviders">
 	<editpartProvider class="at.tb_gruber.designer.design.style.StyleEditPartProvider">
 	  <Priority name="High"/> 
 	</editpartProvider> 
  </extension>
### Plankopf
`at.tb_gruber.designer.design.style.PlankopfEditPart`

## Services
`at.tb_gruber.designer.design.Services` ist die zentrale Klasse für Utility-Methoden, die aus dem odesign-File per `services:` aufgerufen werden können.  
Wird verwendet um zwischen den Datenmodellebenen zu verbinden und Daten zu aggregieren (hier einfacher als im odesign-File).

## Druckanbindung
`at.tb_gruber.designer.ide.print.*` beschäftigt sich mit der skalierten Druckausgabe der grafischen Darstellung.  
**Achtung:** die skalierte Druckausgabe funktioniert nur per `"Microsoft Print to PDF"`! Siehe `at.tb_gruber.designer.ide.print.TBGPrintActionHelper:51`  
Für alle anderen Drucker wird auf A4(?) heruntergerechnet und in x Blätter zerlegt.

# Externe Datenquellen
## Eclipse properties
Ein eigener Tab in den Eigenschaften ("TBG-Designer") erlaubt das Angeben von 3 CSV-Dateien, die zusätzliche Informationen für Objekte bereitstellen.  
Beschrieben in `at.tb_gruber.designer.ide.preferences.TBGPreferencePage`;

## CSV Reader
`at.tb_gruber.designer.ide.preferences.CSVPropertyProvider`

Lädt aus 3 CSV-Files über die passenden Header `ObjektInfo`s ein, diese werden in der Ausgabetabelle zum dynamischen Befüllen von Werten herangezogen.  
Auf Objektebene kann über das Attribut `externeQuelle` gesteuert werden, welche Datenquelle verwendet werden soll, falls aus mehreren CSV-Dateien Datensätze mit der gleiche Objekt-Id kommen.

Wird in `at.tb_gruber.designer.design.Services` instanziert und verwendet.
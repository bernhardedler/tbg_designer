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
- `parent/pom.xml` hält alles zusammen
- `feature/feature.xml` bindet model und design
- `model\model\model.ecore` Datenmodell
- `design\description\designer.odesign` beschreibt Editor-Verhalten und Ausgabetabelle
- `product\designer.product` definiert Runtime-Eclipse
- `product\pom.xml` Tycho goal für build

## Auslieferung fertiges Artefakt
in product/designer.product "Export an Eclipse Product". Sollte ein ca. 330MB großes Zip generieren.

# Code
## Eclipse Projekt
`at.tb_gruber.designer.ide.*` kümmert sich um den Projekt-Wizard, die Natures und die korrekte Initialisierung des Datemodells.

## Eigene grafische Elemente
`at.tb_gruber.designer.design.style.*` definiert eigene Elemente für die Planansicht. Hauptsächlich geht es dabei um die korrekte Darstellung von SVG-Grafiken.  
Hier ist viel Sirius/GMF-spezifische Magie am Werken, das meiste ist zusammenkopiert. Hoffentlich funktioniert das so weiterhin.


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

# Sirius odesign
## Darstellung

## Anlegen neuer elemente

## Ausgabetabelle

| Spalte Nr. | Spaltenname | Datenquelle | Modellattribut |
|-|-|-|-|
|2|Verbindung Nr.|generiert (fortlaufende Zahl)|verbindung.nr|
|3|Bahnhof|manuell|bahnhof.name|
|4|Projektname|manuell|bahnhof.projektname|
|5|Objektname|aus CSV, alternativ manuell|objekt.name|
|6|Objektart|aus CSV, alternativ manuell|objekt.objektart|
|7|GPS-Standort|manuell|objekt.gpsstandort|
|8|Ort/Adresse|aus CSV, alternativ manuell|objekt.Ort_Adresse|
|9|Objekt-ID|manuell|objekt.objektId|
|10|Gebäudeart|aus CSV, alternativ manuell|objekt.reserve1|
|11|DB776UA|manuell|objekt.reserve2|
|12|Anlagenname|manuell|anlage.name|
|13|Anlagenart|manuell, enum|kein (Classname)|
|14|Anlagennummer|manuell, vorbelegt|anlage.anlagennummer|
|15|Primary Key - Versorgungsschema|generiert (bahnhof.name + '_' + anlage.anlagennummer)|kein (nur in Ausgabe)
|16|EADB_Anlagen-ID|manuell|anlage.eadbId|
|17|In Objektteil|manuell|anlage.reserve3|
|18|EADB Versorgung Art|manuell|anlage.eadbVersorgungArt|
|19|Primärspannung|manuell, enum|anlage.primaerspannung|
|**20**|Reserve1|manuell|???|
|**21**|Reserve2|manuell|???|
|22|Sekundärspannung|manuell, enum|trafo.sekundaerspannung|
|23|Trafo-kVA|manuell|trafo.trafoKva|
|24|Reserve3|manuell|trafo.reserve5|
|**25**|Zählpunktnummer Hauptversorgung|manuell|???|
|**26**|Zählpunktnummer Reserve Einspeisung|manuell|???|
|27|versorgt von Anlagenname|ermittelt|quelle.anlagenname|
|28|versorgt von Anlagennummer|ermittelt|quelle.anlagennummer|
|29|versorgt von Primary Key - Versorgungsschema|ermittelt|(bahnhof.name + '_' + quelle.anlagennummer)
|30|versorgt von EADB_Anlagen-ID|ermittelt|quelle.eadbId|
|31|Abgang VT|manuell|ziel.abgangVT|
|32|Kabelversorgungsspannung|manuell, enum|verbindung.primaerspannung|
|33|Kabeltype|manuell|verbindung.kabeltype|
|34|Sicherung Quelle|manuell|verbindung.quellSicherung|
|35|Sicherung Ziel|manuell|verbindung.zielSicherung|
|36|VER_BEZ|manuell|anlage.verteilerbezeichnung|
|37|ARGUS-relevant|manuell, enum|verbindung.argusrelevant|

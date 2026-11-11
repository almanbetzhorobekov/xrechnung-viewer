Phase 1 – Projektaufsetzung und Bibliotheksauswahl
	
Zeitraum	02.11.2026 – 11.11.2026 <!-- TODO: Daten prüfen -->
Status	abgeschlossen
Git-Tag	phase-1
1. Ziele der Phase
Anforderungen der Aufgabe klären und offene Fragen mit dem Betreuer besprechen
Projektstruktur als Maven-Mehrmodulprojekt anlegen
Geeignete Bibliothek zum Einlesen von XRechnungen (CII) auswählen und die Entscheidung begründen
2. Geklärte Anforderungen

Mit dem Betreuer wurde Folgendes festgelegt:

Es wird nur die Syntax CII (Cross Industry Invoice) unterstützt, nicht UBL.
Versionsverwaltung mit Git.
Codes aus der Rechnung werden als Klartext angezeigt, z. B.:
Einheiten: C62 → „Stück“, H87 → „Stück (Teil)“
Rechnungstyp: 380 → „Handelsrechnung“
Zahlungsart: 58 → „SEPA-Überweisung“
Die Unterschiede zwischen UBL und CII werden in der Dokumentation erklärt.
3. Ergebnisse
3.1 Projektstruktur
xrechnung-viewer/
├── pom.xml                 (Parent-POM)
├── invoice-view/           (wiederverwendbare JavaFX-Komponente)
├── invoice-view-demo/      (Beispielanwendung mit FileChooser)
└── docs/                   (Dokumentation)

Technischer Rahmen: Java 17, OpenJFX 17.x, Maven, JUnit 5.

3.2 Bibliotheksauswahl

Als Parser wird Mustang Project verwendet. Begründung siehe ADR-001.

4. Probleme und Lösungen
Problem	Lösung
<!-- TODO: z. B. JavaFX-Module wurden von Maven nicht gefunden -->	<!-- TODO: z. B. javafx-maven-plugin eingebunden -->
<!-- TODO -->	<!-- TODO -->
5. Zeitaufwand
Tätigkeit	Stunden
Anforderungsanalyse, Rücksprache Betreuer	<!-- TODO -->
Recherche und Vergleich der Bibliotheken	<!-- TODO -->
Projektaufsetzung (Maven, Git)	<!-- TODO -->
Summe	<!-- TODO -->
6. Ausblick auf Phase 2
XRechnung (CII) mit Mustang einlesen und in ein eigenes Datenmodell überführen
Erste Anzeige der Rechnungsdaten in der JavaFX-Komponente
Erste Unit-Tests mit Beispielrechnungen
<!-- TODO: an den eigenen Plan anpassen -->

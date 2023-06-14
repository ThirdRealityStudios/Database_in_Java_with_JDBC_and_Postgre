# Datenbank-Anbindung in Java (JDBC) mit PostgreSQL

Aus der Vorlesung EidOP (13.06.2023) mit ein paar Erweiterungen.

# Was kann das Programm?

Ihr könnt SQL-Befehle direkt per Konsole nacheinander wie in einem Lauffeuer ausführen.

Vorher müsst ihr noch einmal die Benutzerdaten wie Passwort
eingeben,

damit die Verbindung zur Datenbank klappt.

# Wie den Treiber einbinden?

Maven ist bei mir in IntelliJ irgendwie ziemlich verbuggt.

Daher ist es am besten,

dass ihr direkt die postgresql-42.6.0.jar direkt einbindet.

Dies geschieht über die Projekteinstellungen -> Libraries -> Add jar.

Die .jar-Datei befindet sich im /lib-Ordner.
# Datenbank-Anbindung in Java (JDBC) mit PostgreSQL

Aus der Vorlesung EidOP (13.06.2023) mit ein paar Erweiterungen.

# Was kann das Programm?

Ihr könnt SQL-Befehle direkt per Konsole nacheinander wie in einem Lauffeuer ausführen.

Vorher müsst ihr noch einmal die Benutzerdaten wie Passwort
eingeben,

damit die Verbindung zur Datenbank klappt.

# Wie den Treiber einbinden?

Maven ist in IntelliJ irgendwie schon verbuggt genug.
Daher ist es am besten,
direkt die .jar einzubinden in den Projekteinstellungen -> Libraries -> Add jar
oder so ähnlich.
Die hier passende postgresql-42.6.0.jar befindet sich im Ordner lib neben src!
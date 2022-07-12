package java_tutorial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Lernziel: SQL-Datenbanken ansprechen
 * - Connection aufbauen
 * - SQL-Anweisungen ausführen
 * - SQL-Abfragen durchführen
 *
 * @see <a href="https//h2database.com">H2 Datenbank</a>
 * @see <a href="http://h2database.com/html/features.html#database_url">H2 URLs</a>
 * @see <a href="https://github.com/ullenboom/mondial-database">Mondial-Database</a>
 * @see <a href="https//download.oracle.com/otn-pub/jcp/jdbc-4_1-mrel-spec/jdbc4.1-fr-spec.pdf">JDBC-Spezifikation, Anhang B, ab Seite 202</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html">API Dokumentation für SQL Package</a>
 * <p>
 * JDBC = Java Database Connectivity
 * Hierfür wird ein JDBC Treiber benötigt.
 * Dies ist ein Beispiel für Schnittstellenprogrammierung
 * <p>
 * H2 Datenbank:
 * Embedded Modus: Datenbankmanagementsystem ist Teil der eigenen Anwendung
 * Die Datenbank läuft nur zur Laufzeit der eigenen Anwendung.
 * <p>
 * Server Modus: Die Datenbank läuft unabhängig von der Anwendung.
 * <p>
 * In-Memory Modus: Die Daten liegen ausschliesslich virtuell im Arbeitsspeicher.
 * <p>
 * H2 ist eine reine Java-Datenbank.
 * Treiber, Datenbankmanagementsysten und GUI für den Zugriff befinden sich in einem Archiv,
 * welches sich über Maven beziehen lässt.
 * <p>
 * Beim Beziehen der Daten werden die Datenbanktypen zu Javatypen umgewandelt.
 * <p>
 * Best Practice zu Datenbankverbindungen
 * Diese sollten nach der Nutzung wieder geschlossen werden.
 */

public class SQL {
    public static void main(String[] args) {
        // DriverManager.drivers().forEach(System.out::println);
        // JDBC URL enthält Datenbanktyp und welche Datenbank soll angesprochen werden.
        // In diesem Fall ist es eine H2 DB und die Datenbank heisst. Mondial. Das Verzeichnis
        // wird im eigenen Anwendungsorder mit ./ eingeleitet.
        try {
            // Drivermanager ist quasi die Zentrale
            Connection connection = DriverManager.getConnection("jdbc:h2:file:./mondial");
            // Testausgabe der Verbindung
            System.out.println(connection);

            // Generiert die Datenbank mit Testdaten. Befindet sich im obersten Projektverzeichnis unter mondial.mv.db
            /*
            String filename = "z0_Java_Tutorial\\src\\main\\java\\java_tutorial\\jdbc\\mondial.sql";
            Path pathToFile = Paths.get(filename);
            System.out.println(pathToFile.toAbsolutePath());
            final String sql = Files.readAllLines(pathToFile).stream().collect(Collectors.joining("\n"));
            // System.out.println(sql);

            // Statement (es gibt noch Prepared Statements und Callable Statements)
            connection.createStatement().execute(sql);
             */

            // Select Statements mit Resultset (das ist ein Objekt, das Zeile für Zeile vorgeht.)
            final ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM Country");
            while (resultSet.next()) {
                // System.out.println(resultSet);
                // Spalten auslesen
                //System.out.println(resultSet.getString(1));
                // Wenn die Spalten umsortiert werden, sollte man besser den Namen nehmen.
                //System.out.println(resultSet.getString("Name"));
                //System.out.println(resultSet.getInt("Population"));
                System.out.printf("%s %d %.0f%n", resultSet.getString("Name"),
                        resultSet.getInt("Population"),
                        resultSet.getDouble("Area"));
            }
            // Datenbankverbindung schliessen, wichtig!
            connection.close();
        } catch (SQLException e /*| IOException e*/) {
            e.printStackTrace();
        }
    }
}

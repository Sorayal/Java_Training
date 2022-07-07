package java_tutorial;

/**
 * Lernziel:
 * - Heap
 * - OutOfMemoryError
 * - Garbage Collector
 * <p>
 * - Im Heap werden durch Java die Objekte abgelegt.
 *
 * @see OoopReferenceIdentityEquals
 */
public class OopGc {
    public static void main(String[] args) {

        /*
        +----------------------------------------------+
        | HAUPTSPEICHER                                |
        |+------------------------------+  +---------+ |
        | JVM Java Virtual Machine      |  |Office   | |
        |+-----+-----------+------------+  +---------+ |
        | HEAP | Metadaten | Thread 1   |  |Editor   | |
        |  °   |           | Thread 2   |  +---------+ |
        | ° °  |           | Thread 3   |  | Browser | |
        +------+-----------+------------+  +---------+ |
        |                                              |
        +----------------------------------------------+

        HEAP hält die Objekte
        Metadaten = Verwaltungsdaten für die JVM
        Threads laufen in der JVM
        */

        // Datenstruktur stack, dort wird immer oben aufgelegt.
        // Es lassen sich aber keine Daten mittendrin herausziehen

        // führt zu OutOfMemoryError
        java.util.Stack stack = new java.util.Stack();
        /*
        while(true){
            // stack.push(new java.awt.Point());

            // Der Garbage Collector entfernt unreferenzierte Objekte
            new java.awt.Point();
        }
        */
        java.awt.Point p = new java.awt.Point();
        // Erstes Objekt wird nicht mehr gebraucht, weil es unreferenziert ist. Die Referenz
        // zeigt nur auf das zweite Objekt
        p = new java.awt.Point();
        // Zweites Objekt wird für den Garbage Collector als Unreferenziert markiert
        p = null;

        // Der Garbage Collector läuft als niedrig priorisierter Thread selbstständig im Hintergrund.

        // Der sogenannte Stackbereich wird für primitive Variablen und Rücksprungadressen bei Methoden
        // verwendet.

    }
}

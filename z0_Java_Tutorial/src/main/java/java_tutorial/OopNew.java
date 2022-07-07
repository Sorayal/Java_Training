package java_tutorial;

/**
 * Lernziel:
 * - Objekte haben: eine Identität, einen Zustand und ein Verhalten
 * - Objekte mit new erzeugen können
 * - Konstruktoraufruf
 * - Referenzvariablen deklarieren
 * - Referenztyp, Objekttyp
 * - Mit dem Punkt auf Attribute und Methoden zurückgreifen
 * - toString() Abkürzung
 * <p>
 * - Eine Klasse entspricht einem Bauplan
 * - Objekte haben Attribute und können Verhalten
 * - Jedes Objekt hat seine eigenen Zustände und eigenes Verhalten
 * - Die vier Prinzipien der OOP: Abstraktion, Kapselung, Vererbung, Polymorphie
 * - toString liefert Debug Informationen
 * - Referenztypen gibt es in vier Ausführungen: Klassentypen, Array-Typen, Interface-Typen, Typvariablen (bei Generics)
 *
 * @see OopGc
 */

public class OopNew {
    public static void main(String[] args) {

        // Baue neues Point Objekt auf, der Konstruktor wird aufgerufen
        // new ist ein Ausdruck und liefert etwas zurück
        System.out.println(new java.awt.Point());

        // Referenzvariable bilden und mit neuem Objekt initializiert
        java.awt.Point p = new java.awt.Point();
        java.awt.Point q;
        q = new java.awt.Point();

        p.x = 10;
        System.out.println(p.x);
        System.out.println(p.y);

        System.out.println(q.x);
        System.out.println(q.y);

        p.setLocation(11, 22);
        System.out.println(p.toString());
        System.out.println(q.toString());
        // println ruft automatisch die toString Methode auf.
        System.out.println(p);
        System.out.println(q);

        String s = p.toString();
        // Wie lang ist der String
        System.out.println(s.length());

        // Gleiche wie oben
        System.out.println(p.toString().length());

        // neuer leerer Punkt / anonymes Objekt wird gebildet
        System.out.println(new java.awt.Point().toString().length());


        // linke Seite: Referenzvariable mit Referenztyp
        // Rechte Seite: Objekttyp, der zur Laufzeit aufgebaut wird
        // Referenztyp und Objekttyp können übereinstimmen, müssen es aber nicht.
        // Der Referenztyp kann auch ein Basistyp eines Objekttyps sein.
        java.awt.Polygon polygon = new java.awt.Polygon();

    }
}

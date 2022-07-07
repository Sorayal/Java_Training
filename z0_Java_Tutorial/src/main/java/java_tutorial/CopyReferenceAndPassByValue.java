package java_tutorial;

/**
 * Lernziel:
 * - Zuweisung und Kopien
 * - Referenzen als Argumente übergeben
 *
 * @see ReferenceIdentityEquals
 */
public class CopyReferenceAndPassByValue {


    public static void main(String[] args) {
        int age = 50;
        // Der Inhalt der primitiven Variable age wird in dogAge kopiert
        int dogAge = age;
        System.out.println(dogAge);

        // p enthält nun eine Speicheradresse die auf den Punkt referenziert.
        java.awt.Point p = new java.awt.Point();


        /*
                                    +--------+
                                    | Point  |
           +-----+                  |--------|
           | p   +----------------->+--------+
           +-----+                  | x = 0  |
                                    | y = 0  |
                                    +--------+
         */

        // p und q verweisen beide auf dasselbe Punkt-Objekt
        java.awt.Point q = p;

        /*
                                    +--------+
                                    | Point  |
           +-----+                  |--------|                   +-----+
           | p   +----------------->+--------+<------------------|  q  |
           +-----+                  | x = 0  |                   +-----+
                                    | y = 0  |
                                    +--------+
         */

        p.x = 10;
        System.out.println(q.x);

        q.y = 20;
        System.out.println(p.y);

        // Die Referenz/ der Verweis wird ausgelesen und als Kopie an die Methode printPoint übergeben
        System.out.println("\n" + p);
        printPoint(p);
        System.out.println("\n" + p);

        clearPoint(p);
        System.out.println("\n" + p);

        System.out.println("\n" + randomPoint());

        System.out.println("\n" + clearPoint2(p));
    }

    static void printPoint(java.awt.Point p){
        // Lesender Zugriff
        System.out.println(p.x);
        System.out.println(p.y);

        // tausche values des Point
        // den Methoden muss man vertrauen, weil sie muteable Objekte verändern können.
        // Man kann das mit Immuteable Objekten verhindern.
        int swap = p.x;
        p.x = p.y;
        p.y = swap;
    }

    static void clearPoint(java.awt.Point p){
        // Die Referenz im Argument wird auf ein neues Objekt gelegt.
        // Parametervariablen sind eine Form von lokalen Variablen.
        // Das hat keinen Effekt auf die externen Variablen
        // Die Parametervariablen werden nach Verlassen der Methode vom Garbage Collector gelöscht.
        // Das Ganze wird als Copy-by-Value bezeichnet. Java arbeitet immer mit der Kopie.
        // Daneben gibt es noch Reference-by-Value wie bei C#
        p = new java.awt.Point();
    }

    // Methoden können auch Referenzen zurückgeben
    // Die Methode gibt ein neues Punktobjekt zurück
    static java.awt.Point randomPoint(){
        java.awt.Point point = new java.awt.Point();
        point.setLocation(Math.random() * 10, Math.random() * 20);
        return point;
    }

    static java.awt.Point clearPoint2(java.awt.Point p){
        p.x = p.y = 0;
        // Hier gibt man die Referenz, die man bekommen hat zurück.
        return p;
    }
}

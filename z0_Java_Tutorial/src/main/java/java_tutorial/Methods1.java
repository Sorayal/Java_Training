package java_tutorial;


/**
 * Lernziel:
 * - Bedeutung von Methoden verstehen
 * - Statische Methoden deklarieren
 * - Methoden aufrufen
 * - Deklarierte Methode und Aufruf in verschiedenen Klassen haben
 *
 * Man vermeidet damit Code Duplikate.
 * Methoden sollten relativ klein sein. Jede Methode kümmert sich um eine Sache.
 * Objekte haben Fähigkeiten, ausgedrückt durch Methoden
 *
 */
public class Methods1 {
    public static void main(String[] args) {

        // Methodenkopf
        // Zugriffsmodifizierer Klassen- oder Instanzmethode Rückgabe Methodenname (Parameterliste)
        // Notwendige Bestandteile: Rückgabe Methodenname (Parameterliste, ggf. leer)
        // void main (){ }

        // static bedeutet, es ist eine Klassenmethode, unabhängig von den Instanzen ist.
        // nicht statische Methode bedürfen einer Instanz, um sie aufrufen zu können, da es Objektmethoden sind.

        lines();
        System.out.println();
        lines();

        System.out.println();
        Caro.caros();

    }

    // Nach außen sichtbar
    public static void lines(){
        for (int i = 0; i < 10; i++) {
            printHeart();
        }
    }

    // Nur innerhalb der Klasse sichtbar
    private static void printHeart(){
        System.out.print("♥");
    }
}

// Sollte normalerweise in einer eigenen Kompilationseinheit (Datei) stehen.
class Caro{

    public static void caros(){
        for (int i = 0; i < 10; i++) {
            printCaro();
        }
    }

    private static void printCaro(){
        System.out.print("♦");
    }
}

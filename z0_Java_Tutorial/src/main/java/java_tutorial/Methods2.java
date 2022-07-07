package java_tutorial;

/**
 * Lernziel:
 * - Parameter und Argumente
 * - return / Rückgabe
 * - Methoden überladen
 * - Rekursive Methoden
 * <p>
 * Von Parametern spricht man auf der Seite der Methode, bei deren Deklaration
 * Beispiel: public static void printChar(c) : c ist der Parameter
 * von Argumenten spricht man, wenn man der Methode konkret Werte übergibt.
 * Beispiel: public static void printChar('*') : * ist das Argument
 */
public class Methods2 {
    public static void main(String[] args) {

        /*
        println() : erwartet keine Parameter und gibt nichts zurück
        println("Hello") : Argument übergeben
        Math.random() : Gibt einen Zufallswert zurück, erwartet keinen Parameter
        Math.sin(1) : erwartet Parameter und gibt Ergebnis zurück
         */

        int size = 10;
        char symbol = '*';
        printChar(symbol);
        System.out.println();

        // Call by value
        lines(size, symbol);
    }

    private static void printChar(char c) {
        System.out.print(c);
    }

    private static void lines(int len, char c) {
        if (c == ' ' || c == '\t') {
            return; // Verlässt die Methode, falls die Bedingung zutrifft.
        }
        for (int i = 0; i < len; i++) {
            printChar(c);
        }
    }
}

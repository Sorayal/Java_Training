package for_training;

/**
 * - for-Schleife (Zählschleife)
 * - Schleifenzähler
 * - Komma
 * - Ineinandergeschachtelte Schleifen
 */

public class App {
    public static void main(String[] args) {

        // for(;;) Endlosschleife
        // Initialisierung wird einmal durchlaufen.
        // Danach wird die Zählvariable im Fortschaltausdruck modifiziert.
        // Danach wird die Bedingung geprüft.
        // for(Initialisierung ; Bedingung ; Fortschaltausdruck) {Anweisungen}

        for (int counter = 1; counter < 11; counter++) {
            System.out.println(counter);
        }
        System.out.println("\n----------------------\n");

        int counter = 1;
        for ( ;counter < 11; counter++) {
            System.out.println(counter);
        }
        // counter vor der Bedingungsprüfung auf 11 erhöht
        System.out.println(counter);
        System.out.println("\n----------------------\n");

        // Mehrere Variablen initialisieren
        // Bedingung unabhängig von dem Vorschaltausdruck und der Initialisierung
        // y wächst an mit zufälligen Zahlen
        for (int x = 0, y = 0;
             Math.random() > 0.1 ;
             x++, y += (int)(Math.random() * 100)){
            System.out.println(x + " " + y);

        }
    }
}

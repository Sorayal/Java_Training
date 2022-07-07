package java_tutorial;

/**
 * Lernziel:
 * - for-Schleife
 * - Schleifenzähler
 * - Komma
 * - Ineinandergeschachtelte Schleifen
 */

public class ForLoop1 {
    private static final String line = "**********************************";

    public static void main(String[] args) {

        /*
        DO-WHILE-SCHLEIFE:
        do {
            Anweisungen
        }while(Bedingung)

        WHILE-SCHLEIFE:
        while(Bedingungen){
            Anweisungen
        }

        FOR-SCHLEIFE:
        for(Initialisierung, Bedingung, Fortschaltausdruck){
            Anweisungen
        }
         */

        /*
        int counter = 1;
        while(counter < 11){
            System.out.println(counter);
            counter++;
        }*/

        // Vorteil bei einer festen Anzahl von Schleifendurchläufen, da
        // alles in einer Zeile zu lesen ist.
        // for(Initialisierung ; Bedingung ; Fortschaltausdruck) {Anweisungen}
        for (int counter = 1; counter < 11; counter++) {
            System.out.println(counter);
        }

        System.out.println(line);
        // Gewährt auch ausserhalb der Schleife Zugang zum Schleifenzähler
        int counter2 = 1;
        for (; counter2 < 11; counter2++) {
            System.out.println(counter2);
        }

        System.out.println(line);
        for (int x = 0, y = 0; x < 10; x++, y--) {
            System.out.println(x + " " + y);
        }

        System.out.println(line);
        // Unabhängiger Bedingungsteil von Initialisierung und Fortschaltausdruck
        for (int x = 0, y = 0; Math.random() > 0.1; x++, y--) {
            System.out.println(x + " " + y);
        }

        System.out.println(line);
        // Unabhängiger Bedingungsteil von Initialisierung und Fortschaltausdruck
        for (int x = 0, y = 0;
             Math.random() > 0.1;
             x++, y += (int) (Math.random() * 100)) {
            System.out.println(x + " " + y);
        }

        System.out.println(line);
    }
}

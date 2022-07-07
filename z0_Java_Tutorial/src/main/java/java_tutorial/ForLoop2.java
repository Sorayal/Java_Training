package java_tutorial;

/**
 * Lernziel:
 * - for-Schleife
 * - Schleifenzähler
 * - Komma
 * - Ineinandergeschachtelte Schleifen
 * - break und continue
 * - Labels
 */

public class ForLoop2 {
    private static final String line = "**********************************";

    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("x= " + x + " y= " + y);
            }
        }

        System.out.println(line);

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%3d ", x * y);  // printf %3d Platzhalter, der immer 3 Stellen breit ist.
            }
            System.out.println();
        }

        System.out.println(line);

        // Dreieck
        for (int x = 1; x <= 10; x++) {
            for (int y = x; y <= 10; y++) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }

        System.out.println(line);

        // Trapez
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10 + x; y++) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }

        System.out.println(line);

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y += x) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }

        System.out.println(line);

        // break bezieht sich auf die umliegende Schleife
        // zum Gesamtabbruch aller Schleifen lassen sich Labels oder Flags (boolean Abfragen) nutzen

        end:    // Label / Sprungmarke
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%3d ", x * y);
                if (x * y == 25) {
                    break end;
                }
            }
            System.out.println();
        }
    }
}

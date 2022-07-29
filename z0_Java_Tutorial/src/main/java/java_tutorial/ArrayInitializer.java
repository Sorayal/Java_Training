package java_tutorial;

/**
 * Lernziel:
 * - Kompakte Array-Initialisierung
 * - "Kosten" einschätzen können
 *
 * Die Methodengrösse beträgt nur 64kByte. In Methoden immer wieder neue Arrays zur Laufzeit zu
 * erstellen und initialisieren, ist auf Dauer sehr kostenintensiv.
 *
 * @see ForEachLoop
 */

public class ArrayInitializer {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "Christian";
        names[1] = "Cora";

        // String[] names2 = {}; // -> String[] names2 = new String[0];
        String[] names2 = {"Christian", "Cora"}; // Im Bytecode ergibt sich der gleiche Code

        // names2 = {}; // Compilerfehler

        names2 = new String[]{};
        names2 = new String[]{"Christian", "Cora", "Gerda"};
        System.out.println(names2.length);

        getLengthOfAllStrings(names2);

        // Parameter wird anonym übergeben
        getLengthOfAllStrings(new String[]{"Test", "MoreTests"});
    }

    public static void getLengthOfAllStrings(String[] names) {
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
        }
        System.out.println(sum);
    }
}

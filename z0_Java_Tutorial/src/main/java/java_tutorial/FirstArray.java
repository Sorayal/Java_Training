package java_tutorial;

/**
 * Lernziel:
 * - Array-Objekte aufbauen
 * - Referenzen
 * - Initialisierung bei primitiven Elementen und Referenzen
 * - length Attribut
 * - Elementzugriff, lesen und schreiben
 * - IndexOutOfBoundExceptions
 * - Arrays an Methoden übergeben
 *
 * @see ArrayInitializer
 * <p>
 * Mehrere Objekte oder Werte eines gleichen Typs werden zu einer neuen Datenstruktur zusammengefasst.
 * Die Elemente werden über ein ganzzahligen Index angesprochen. Dieser beginnt bei 0. Die Größe wird
 * vorher festgelegt. Die Länge lässt sich nicht mehr ändern.
 * <p>
 * Die Arrays sind automatisch mit null oder null-ähnlichen Typen bzw. false bei der Initialisierung belegt.
 * Defaultwerte, welche die JVM bei der Initialisierung der Arrays setzt: 0, false oder null.
 * Beispiel int-Array {0,0,0}
 * <p>
 * length ist ein Attribut und keine Methode!
 * <p>
 * new int[5]; => Ausdruck
 */
public class FirstArray {
    public static void main(String[] args) {

        Integer[] primes = new Integer[5];
        System.out.println(primes.length);

        // Neues Array anlegen mit 10 Elementen
        primes = new Integer[10];

        // Lesender Zugriff auf das erste Element. Der Index beginnt bei 0.
        System.out.println(primes[0]);

        // Lesender Zugriff auf das letzte Element.
        System.out.println(primes[primes.length - 1]);

        // Felder beschreiben
        primes = new Integer[5];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;

        // Mitte des Arrays abfragen
        System.out.println(primes[primes.length / 2]);

        /*
                              +---+---+---+---+----+
        primes +------------->+ 2 | 3 | 5 | 7 | 11 |
                              +---+---+---+---+----+
                                0   1   2   3   4    Index
         */

        primes[4]++;
        System.out.println(primes[4]);
        primes[4]--;
        System.out.println(primes[4]);

        // ArrayIndexOutofBoundException
        // System.out.println(primes[99999]);

        // ArrayIndexOutofBoundException
        // System.out.println(primes[-1]);

        // In C war das häufig ein Problem, dass sobald der Index zu gross oder zu klein war,
        // dass man dadurch in fremde Speicherbereiche gelangte.

        // NullpointerException wegen fehlender Referenz
        // primes = null;
        // System.out.println(primes[0]);
        printArray(primes);

        System.out.println("++++Generic Method+++++++++++++\n");
        print(primes);
        System.out.println("++++Generic Method+++++++++++++\n");
        print(someNames());


        String[] newNames = new String[3];
        newNames[0] = "Maru";
        newNames[1] = "Julia";
        System.out.println(newNames[2]); // null, da Referenz nicht gesetzt wurde.
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] someNames() {
        return new String[]{"Paul", "Martin", "Sina", "Julia"};
    }

    // Generic statt Überladung
    public static <T> void print(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array ist null.");
        }
        for (T element : array) {
            System.out.println(element);
        }
    }
}

package java_tutorial;

/**
 * Lernziel:
 * - Identität
 * - Gleichheit
 *
 * @see ImportDeclaration
 */

public class ReferenceIdentityEquals {
    public static void main(String[] args) {
        // 2 Objekte und 3 Referenz-Variablen aufgebaut
        java.awt.Point p = new java.awt.Point();
        java.awt.Point q = new java.awt.Point();
        java.awt.Point r = p; // p und r zeigen auf dasselbe Objekt.

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        // JVM schaut in die Variablen rein und stellt fest, ob die Pointer bzw. Referenzen gleich sind.
        // Die Inhalte der Objekte, also in diesem Fall die Punktkoordinaten werden nicht verglichen!
        System.out.println(p == q); // false
        System.out.println(p != q); // true !=> ungleich
        System.out.println(p == r); // true
        System.out.println(q == r); // false

        // Gleichwertigkeit => Objekte haben gleiche Zustände, sind aber unterschiedlich in ihren Referenzen.
        // equals ist die Methode, um den Inhalt bzw. der Zustand verschiedener Objekte zu vergleichen.

        System.out.println(p.equals(q));
        System.out.println(q.equals(p));

        // Frage, ob der Zustand gleich ist.
        System.out.println(p.equals("affageea"));
        System.out.println("afawfwa".equals(p));
        System.out.println(p.equals(null));

        // Auf einer Referenzvariablen, die null ist, kann man keine equals Methode aufrufen -> Nullpointerexception
        // p = null;
        // System.out.println(p.equals(null));

        // String Objekte sollten immer mit Equals verglichen werden.
        String input1 = new java.util.Scanner(System.in).nextLine();
        String input2 = new java.util.Scanner(System.in).nextLine();

        System.out.println(input1 == input2); //falsch, da die Referenzen eh unterschiedlich sind und der Inhalt bzw.
        // Zustand nicht verglichen wird.

        System.out.println(input1.equals(input2));
        // Symmetrisch
        System.out.println(input2.equals(input1));
    }
}

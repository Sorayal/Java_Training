package java_tutorial;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
// import static java.lang.Math.*; // Wildcard Variante, nicht empfohlen.
import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;

/**
 * Mit statischen Importen lassen sich Typnamen sparen und man kann direkt auf die Methoden zugreifen
 * ohne den Klassennamen bei statischen Methoden voranstellen zu müssen.
 */
public class StaticImport {
    private static Object showInputDialog;

    public static void main(String[] args) {
        int i = parseInt(showInputDialog("Erste Zahl"));
        int j = parseInt(showInputDialog("Zweite Zahl"));
        out.printf("%d ist größer oder gleich %d.%n", max(i, j), min(i,j));
    }
}

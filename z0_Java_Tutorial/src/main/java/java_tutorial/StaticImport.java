package java_tutorial;

import java.awt.*;

import static java.lang.Integer.parseInt;
// import static java.lang.Math.*; // Wildcard Variante, nicht empfohlen.
import static java.lang.Math.*;
import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;

/**
 * Lernziel:
 * - Statische Imports
 *
 * @see FirstArray
 *
 * Mit statischen Importen lassen sich Typnamen sparen und man kann direkt auf die Methoden zugreifen
 * ohne den Klassennamen bei statischen Methoden voranstellen zu müssen.
 *
 * Beim regulären Import werden Typen eines Pakets eingebunden. Beim statischen Import werden die statischen
 * Eigenschaften (Felder) eines Typs eingebunden. Dies ermöglicht deren Nutzung, ohne zuvor von der Klasse
 * ein Objekt (Instanz) erstellen zu müssen.
 */
public class StaticImport {
    private static Object showInputDialog;

    public static void main(String[] args) {
        int i = parseInt(showInputDialog("Erste Zahl"));
        int j = parseInt(showInputDialog("Zweite Zahl"));
        out.printf("%d ist größer oder gleich %d.%n", max(i, j), min(i,j));

        // java.awt.Point p
        Point p;

        random();
        // importiert das statische Feld PI
        out.println(PI);
    }

    // Die eigene Methode wird vor den statischen Import vorgezogen und blendet diesen somit aus.
    static void random(){}
}

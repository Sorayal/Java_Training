package java_tutorial;

import javax.swing.*;

/**
 * Lernziel:
 * - null
 * - NullpointerException
 * - Prüfungen auf null und ungleich null
 *
 * @see OopGc
 * Null ist eine spezielle Referenz
 */

public class NullNullPointerException {
    private static final String line = "\n************************\n";

    public static void main(String[] args) {

        // Zwei Referenzvariablen, beide unbelegt
        java.awt.Point p;
        String s;
        // Primitive Variable
        int i = 12;

        // Variablen initialisieren mit null, die Referenz zeigt auf nichts, also auch kein Objekt
        p = null;
        s = null;

        // führt zum Stacktrace, der anzeigt, wo der Fehler auftritt
        // System.out.println(s.length());

        if(s != null){
            System.out.println(s.length());
        }else {
            System.out.println("s == null");
        }

        System.out.println(line);

        // Startet einen Dialog. Sollte die Eingabe abgebrochen werden, wird null zurückgegeben
        String input = JOptionPane.showInputDialog("Eingabe");
        if (input != null){
            System.out.println(input.length());
        }

    }
}

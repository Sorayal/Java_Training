package playground;

/**
 * Variablen zum Speichern von Daten, die gelesen und geschrieben werden können
 * Variabeldeklaration
 * Mehrere Variablen kompakt deklarieren
 * Lokale Variablen werden nicht automatisch initalisiert!
 * Variabeldeklaration mit Wertinitialisierung
 * Finale Variabeln
 * char und String
 */
public class VariableDeclarations {
    public static void main(String[] args) {
        // byte 1 Byte
        // short 2 Byte
        // int 4 Byte
        // int 8 Byte
        // bigint Referenztyp für sehr grosse Zahlen
        long age = 90L;
        System.out.println(age);

        // Fliesskommatypen
        // float 4 Byte
        // double 8 Byte
        float f = 2345;
        double d = 15.3333;

        // Konstanten werden mit final bezeichnet. Const hat keine Funktion.
        final int _finalInt = 4;

        // Unicode Zeichen 2 Byte
        char sb = 'C';

        // Referenztyp String
        String name = "Sascha";
        System.out.println(name.getBytes());

        // boolean 1 Bit
        boolean snowing = true;

        // Mehrfachdeklaration
        int x = 0,y = 0,z = 0;

        // Finale Variablen. Sie können nach der erstmaligen Initialisierung nicht mehr geändert werden.
        final double PI = 3.1415;
        int alpha = -0x70000000;
        System.out.println(alpha);

    }
}

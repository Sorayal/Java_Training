package io_tools_test;

// Import static spart den Klassennamen beim Aufruf.
import static io_tools.IOTools.*;

public class IOToolsTest {
    public static void main(String[] args) {

        int i, j , k;
        double d;
        char c;
        boolean b;

        // Int-Eingabe ohne Prompt (ohne vorige Ausgabe)
        i = readInteger();

        // Int-Eingabe mit Prompt
        System.out.print("j = ");
        j = readInteger();

        // Vereinfachte Int-Eingabe mit Prompt
        k = readInteger("k = ");

        // Double-Eingabe mit Prompt
        d = readDouble("d = ");

        // Char-Eingabe mit Prompt
        c = readChar("c = ");

        // Boolean-Eingabe mit Prompt
        b = readBoolean("b = ");

        // Testausgaben
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("b = " + b);


    }
}

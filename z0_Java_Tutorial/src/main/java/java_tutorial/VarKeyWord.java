package java_tutorial;

import java.util.ArrayList;

/**
 * Lernziel: Einsatzorte von Schlüsselwort var
 * - local variable type inference
 * var ist ein kontextuelles Schlüsselwort, dass man nur an bestimmten Stellen
 * einsetzen kann.
 */
public class VarKeyWord {
    public static void main(String[] args) {
        int i = 12;
        String s = "Hello";
        double d = 1234.456;
        byte b = 12;
        char c = 'a';

        // mit var gelingt eine bessere Formatierung.
        // Der Compiler schaut auf den Wert, um den Typen festzustellen.
        // Diese Eigenschaft nennt man Type Inference.
        var j = 12;
        var t = "Hello";
        var e = 1234.456;
        var f = 12;
        var a = 'a';

        // Der Name drückt den Typen schon aus.
        var string = "Hallo Welt";

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        // Typ abgekürzt
        var list2 =  new ArrayList<ArrayList<String>>();
    }
}

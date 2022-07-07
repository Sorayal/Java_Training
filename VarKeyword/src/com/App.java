package com;

import java.util.ArrayList;

/**
 * When to use the contextual keyword var
 * local variable type inference
 */

public class App {
    public static void main(String[] args) {
        int i = 12;
        String s = "Hallo";
        double d = 12345.334;
        byte b = 12;
        char c = 'a';

        // type inference
        // Herleitung des Variablentyps,
        // der Compiler schaut auf den Wert und leitet daraus den Typ ab
        var j = 13;
        var str = "Hallo";
        var e = 12345.334;
        var by = 12;
        var ch = 'a';

        // Typlos, funktioniert nicht
        // var n = null;

        // var funktioniert nur bei lokalen Variablen, aber nicht bei
        // Klassen-Variablen oder Parameter

        // var nutzt man gern um lange Typenbezeichnungen abzukürzen
        // ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        var list = new ArrayList<ArrayList<String>>();
    }
}

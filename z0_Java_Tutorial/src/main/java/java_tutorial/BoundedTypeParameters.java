package java_tutorial;

import java.io.Serializable;

/**
 * Lernziel: Typeinschränkungen (Bounded Type Parameters)
 * - Mehrere Typeinschränkungen einsetzen
 *
 * @see Wildcards
 *
 * Bei der ersten generischen Methode lassen sich der String und das Double auf den gemeinsamen
 * Basistypen Object zusammenbringen. Man kann den Compiler auch sagen, welchen gemeinsamen
 * Basistypen bzw. welche gemeinsame Oberklasse verwendet werden soll.
 *
 * Der Vorteil ist, dass man mitteilen kann, in welchem Spektrum sich die eingesetzten Variablen
 * bewegen dürfen. Dadurch findet man auch gemeinsame Methoden, die man einsetzen kann.
 * Das ergibt eine Vereinigungsmenge an möglichen Variablen, die man einsetzen kann.
 */

public class BoundedTypeParameters {

    // Generische statische Methode, die entweder das eine oder andere zurückgibt.
    static <T> T random (T m, T n){
        return Math.random() > 0.5 ? m :n;
    }


    // Typeinschränkung auf Zeichenfolgen. So lässt sich die Length Methode verwenden.
    static <T extends CharSequence> int randomChar (T m, T n){
        return Math.random() > 0.5 ? m.length() :n.length();
    }

    // Typeinschränkung auf Zeichenfolgen und serialisierbare Typen
    // Reihenfolge: Oberklasse steht als Erstes, danach kommen Interfaces
    static <T extends CharSequence & Serializable> int randomCharAndSerializeable (T m, T n){
        return Math.random() > 0.5 ? m.length() :n.length();
    }

    public static void main(String[] args) {
        System.out.println(random("Hello", "World"));

        System.out.println(random("Hello", 12.2));

        System.out.println(randomChar("Hello", "12.2"));
        System.out.println(randomChar("Hello", new StringBuffer()));
    }
}

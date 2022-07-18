package java_tutorial.generics;

/**
 * Compiler und die Java Virtual Machine (JVM) prüfen beide die Typen, aber nur die
 * JVM hat den vollständigen Typ-Überblick. Der Compiler prüft zwar auch Typ und deren
 * Umwandlungen, aber tut das nicht so streng wie die JVM. Dadurch können Fehler durch-
 * rutschen, die die JVM zum Absturz bringen.
 *
 * Die Motivation für Generics ist es, dem Compiler mehr Typinformationen zu geben und
 * so Class-cast-Exceptions zu minimieren.
 */
public class TypUmwandlung {
    public static void main(String[] args) {
        Object o = "String";
        String s = (String)o;

        o = Integer.valueOf(42); // Kann auch mit Autoboxing: Object o = 42;
        // Class Cast exception zur Laufzeit, aber der Compiler weist zur Übersetzungszeit keinen Fehler aus.
        // Integer kann nicht auf String gecastet werden.
        s = (String)o;



    }
}

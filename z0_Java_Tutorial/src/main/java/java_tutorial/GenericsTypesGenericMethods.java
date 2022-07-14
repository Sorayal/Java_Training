package java_tutorial;


import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Generics verstehen
 * - Terminologie
 * - parametrisierten Typ nutzen
 * - generischer Typ bzw. generische Methode schreiben
 * - Wo Generics nicht funktionieren
 *
 * Generics geben die Möglichkeit, den Compiler mehr Typinformationen zu geben.
 * Bei Generics setzt man spitze Klammern <> ein, um den Typen mitzuteilen.
 *
 * Die Nutzung von Raw Types führt schnell zu Typ-Problemen.
 *
 * Viele Schnittstellen und Datenstrukturen sind in der Java Bibliothek als Generics definiert.
 *
 * Generics werden im Bytecode bei den Typen repräsentiert. Doch im Bytecode werden die Typangaben durch
 * Object ersetzt.
 * Dadurch ergeben sich folgende Einschränkungen:
 * - Die Typparameter lassen sich zur Laufzeit nicht miteinander vergleichen.
 * - Instanceof funktioniert ebenso nicht mit Typparametern.
 * - Arrays, auch hier fallen die weiteren Typinformationen zur Laufzeit weg.
 *
 * @see BoundedTypeParameters
 */

public class GenericsTypesGenericMethods {

    // Motivation zu Generics. Gleicher Code (Code Duplikate) auf verschiedene Typen angewandt.
    public static String firstOrElse(List<String> list, String defaultValue){
        if(list == null || list.isEmpty()){
            return defaultValue;
        }
        return list.get(0);
    }

    // Nutzung von Raw Type birgt den großen Nachteil, dass man nie genau weiß, welche Typen sich in
    // der Liste verbergen.
    /*
    public static Object firstOrElse(List<Object> list, Object defaultValue){
        if(list == null || list.isEmpty()){
            return defaultValue;
        }
        return list.get(0);
    }

     */

    public static Point firstOrElse(List<Point> list, Point defaultValue){
        if(list == null || list.isEmpty()){
            return defaultValue;
        }
        return list.get(0);
    }

    // Einsatz von Typvariablen <T>. Vorne wird vorangestellt, also vor den Rückgabetyp,
    // welche generischen Typvariablen zum Einsatz kommen.
    // Generische Methode
    public static <T> T firstOrElse(List<T> list, T defaultValue){
        if(list == null || list.isEmpty()){
            return defaultValue;
        }
        return list.get(0);
    }

    // Geschachtelter Typ: Spezifische Klasse für Object.
    // Die Referenzen, die hier gespeichert werden, sind nicht typisiert.
    static class Pair{
        public final Object first;
        public final Object second;

        Pair(Object first, Object second) {
            this.first = first;
            this.second = second;
        }
    }

    // Geschachtelter Typ: Spezifische Klasse für einen Typ-Parameter.
    // Die Referenzen teilen sich den gleichen Typ.
    static class Pair1 <T>{
        public final T first;
        public final T second;

        Pair1(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    // Geschachtelter Typ: Spezifische Klasse für zwei Typ-Parameter.
    // Die Referenzen haben verschiedene Typen.
    static class Pair2 <T, U>{
        public final T first;
        public final U second;

        Pair2(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }


    public static void main(String[] args) {

        int age;
        double income;
        String name;
        ArrayList<String> names;
        ArrayList<LocalDate> birthdays;

        /*
        Originaltyp (engl. raw type) : Rocket
        parametrisierter Typ (engl. parameterized type : List<String>, List<LocalDate>
        Typargument (engl. actual type parameter) : String, LocalDate
         */

        names = new ArrayList<>();
        names.add("asdasf");
        String s = names.get(0);

        birthdays = new ArrayList<>();
        birthdays.add(LocalDate.now());
        LocalDate localDate = birthdays.get(0);

        // Raw Type, Object wird als Parametertyp verwendet
        ArrayList list = new ArrayList();
        list.add(new Point());
        list.add("adasf");

        // Kann nur Object zurückgeben mangels Typinformationen für den Compiler
        Object o = list.get(0);

        /*
        generischer Typ (engl. generic type) : Pair<T>
        generische Methode (engl. generic method) : <T>firstOrElse
        Typparameter (engl. formal type parameter) : T
         */

        new Pair2<String, Double>("Hallo", 12.33);
        new Pair1<String>("Hallo", "Ola");

        // Test
        Pair2<String, Double> firstPair = new Pair2<>("Hallo", 12.33);
        Pair2<String, Double> secondPair = new Pair2<>("Hallo", 12.33);

        // Problem: Zur Laufzeit lassen sich die Typen nicht prüfen.
        System.out.println(firstPair.getClass() == secondPair.getClass()); // true
        // Man bekommt nur Pair2 als Typ. Die Typparameter in den spitzen Klammern sind nicht verfügbar.
        System.out.println(firstPair.getClass());

        Pair2<String, Double> thirdPair = new Pair2<>("Hallo", 12.33);
        Pair2<Double, String> fourthPair = new Pair2<>(12.33, "Nacht");
        System.out.println(firstPair.getClass() == secondPair.getClass()); // true

        // InstanceOf funktioniert auch nicht
        System.out.println(firstPair instanceof Pair2<String, Double>);

        // Das funktioniert
        System.out.println(firstPair instanceof Pair2);

        // Typumwandlungen gehen nicht.
        Pair2 temp = firstPair;
        Pair2<String, String>temp2 = temp;

        // Rechts steht nur ein einfaches Pair2 Array, es gibt keine weiteren Typinformationen.
        Pair2<String, Double>[] pairs = new Pair2[10];

    }
}

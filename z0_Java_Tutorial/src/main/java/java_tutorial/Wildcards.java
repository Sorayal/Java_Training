package java_tutorial;


import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Wildcards
 * - Bounded Wildcards
 * - Invariant
 * - PECS/LESS-Prinzip
 * Producer extends / consumer super
 * LESS = Lesen = extends / schreiben = super
 *
 * @see LambdaIntroPredicate
 *
 * Generics sind nicht kovariant, sondern invariant.
 * List<Double> ist kein Untertyp von List<Number>
 * Invariant heisst, die Unterklasse unterscheidet sich nicht von der Oberklasse.
 * Kovariant: in Verbungsrichtung (von der Oberklasse zur Unterklasse) - mehr Varianz
 *
 * Kontravariant: gegen die Vererbungsrichtung (von der Unterklasse zur Oberklasse) - weniger Varianz
 */
public class Wildcards {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(2345.345);
        numbers.add(25.35);
        numbers.add(2.34);
        // Problem List of Numbers lässt sich nicht in List of Doubles konvertieren
        System.out.println(sum(numbers));

        // List<Double> ist kein Untertyp von List<Number>
        // List<Number> list = numbers;

    }

    // Generische Variante mit Wildcard, irgendwas, also irgendein Typ wird mit Number
    // erweitert. Hierbei gibt es keinen Rückgriff auf den Typen T, der in der unteren
    // Variante vorhanden war. Die Angabe des Basistyp Number reicht aus.
    // Beispiel:
    // void shuffle (List<?> list) in Collections Interface der Java Bibliothek

    // public static <T> T min(Collection<? extends T> coll, Comparator<? super T>comp)
    // https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html
    // ? super T ist alles, was vererbungstechnisch über den Typparameter T angeordnet ist.
    static double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    // Generische Variante ohne Wildcard
    /*
    static <T extends Number> double sum(List<T> numbers){
        double sum = 0;
        for (T number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    /*
    static double sum(List<Double> numbers){
        double sum = 0;
        for (Double number : numbers){
            sum += number;
        }
        return sum;
    }

     */
}

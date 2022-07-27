package streams.stream_demo;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Object[] words = {" ", '3', null, "2", 1, ""};
        Arrays.stream(words)
                .filter(Objects::nonNull)       // Belasse Nicht-null-Referenzen im Stream
                .map(Objects::toString)         // Konvertiere Objects in Strings
                .map(String::trim)              // Schneide Weißraum ab
                .filter(s -> !s.isEmpty())      // Belasse nichtleere Elemente im Stream
                .map(Integer::parseInt)         // Konvertiere Strings in Ganzzahlen
                .sorted()                       // Sortiere die Ganzzahlen
                .forEach(System.out::println);  // 1 2 3

        Integer x = 5;
        Integer y = 5;
        System.out.println(x == y); // returns false because 5 is not equal to 3



    }
}

package streams.stream_training;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.forEach(number -> {
            System.out.println(number);
            System.out.println(number + 1);
        });
        // Stream consumed here already
        // numbers.forEach(System.out::println);
    }
}

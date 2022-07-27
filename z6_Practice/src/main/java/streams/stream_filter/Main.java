package streams.stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	    // Expression Lambda
        // filtert alle Werte aus, die nicht durch 2 teilbar ohne Rest sind.
        Predicate<Integer> condition = i -> i % 2 == 0;

        numbers.stream().filter(condition).forEach(System.out::println);
    }
}

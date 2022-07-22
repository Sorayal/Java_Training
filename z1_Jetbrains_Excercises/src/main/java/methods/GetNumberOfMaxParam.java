package methods;

import java.util.List;
import java.util.Scanner;

/*
Find the max of three numbers
Here is the method named getNumberOfMaxParam that takes three integer numbers and returns the position of the first maximum in the order of the method parameters.

The method should return number 1, 2 or 3 respectively.

Write just a body of the method.


Sample Input:
12 3 12

Sample Output:
1


 */

public class GetNumberOfMaxParam {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        List<Integer> numbers = List.of(a, b, c);
        return numbers.
                indexOf(numbers.stream()
                        .max(Integer::compare)
                        .orElse(-1)) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}

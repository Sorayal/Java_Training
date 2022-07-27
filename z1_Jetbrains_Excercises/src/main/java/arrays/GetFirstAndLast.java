package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Get first and last elements
Write a method named getFirstAndLast. The method must take an array of ints and return a new array of ints. The returned array must contain two elements: the first and the last elements of the input array.

It is guaranteed that the input array always has at least one element.


Sample Input:
1 2 3 4

Sample Output:
1 4


 */

public class GetFirstAndLast {

    public static int[] getFirstAndLast(int[] numbers) {
        return new int[]{numbers[0], numbers[numbers.length - 1]};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}

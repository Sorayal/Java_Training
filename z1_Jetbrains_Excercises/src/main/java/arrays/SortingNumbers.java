package arrays;

/*
Sorting numbers
Implement a method for sorting a given array of integers in the ascending order.
You can use any algorithm for sorting it.


Sample Input:
3 1 2

Sample Output:
1 2 3



Testcase: 400 1231 2341 123 898 43 123 909 23432 123 090 4535 0 0 1 1
 */


import java.util.Arrays;
import java.util.Scanner;

public class SortingNumbers {
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}

package methods;

import java.util.Scanner;

/*
Sum of numbers in the range
Implement a method sumInRange for calculating the sum of numbers in the range from (inclusive), to (exclusive). Mind the type of the returning value.


Sample Input:
1 2

Sample Output:
1


Sample Input:
5 5

Sample Output:
0


Sample Input:
10 15

Sample Output:
60

 */
public class SumOfNumbersInRange {
    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long result = 0;
        for (int x = from; x < to; x++) {
            result += x;
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}

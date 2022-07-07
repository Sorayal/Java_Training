package for_loop;

import java.util.Scanner;

/*
The sum of integers from a to b
Print the sum of all integers from a to b including both.

It is guaranteed that a < b in all test cases.


Sample Input:
3
22

Sample Output:
250


 */
public class SumOfIntegerFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int result = min;

        for (int i = min + 1; i <= max; i++) {
            result += i;
        }
        System.out.println(result);
    }
}

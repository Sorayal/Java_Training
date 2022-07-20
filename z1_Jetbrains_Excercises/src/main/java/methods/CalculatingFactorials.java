package methods;

import java.util.Scanner;

/*
Calculating factorials
Write a method that calculates the factorial of a given number.

The factorial of n is calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is equal to 1.


Sample Input:
0

Sample Output:
1


Sample Input:
5

Sample Output:
120

 */
public class CalculatingFactorials {
    private static long result = 1;

    // Recursion
    public static long factorial(long n) {
        if (n > 0) {
            result *= n;
            factorial(n - 1);
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }

    /*
    public static long factorial(long n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        }   else {
            return 1;
        }
    }

     */
}

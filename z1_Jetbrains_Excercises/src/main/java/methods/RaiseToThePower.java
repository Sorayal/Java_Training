package methods;

import java.util.Scanner;

/*
Raise to the power
You're given the method power that takes two int numbers n and m. The method should return the value of nm as a long value.

Write a body of the method.


Sample Input:
4 3

Sample Output:
64


Sample Input:
5 0

Sample Output:
1


Sample Input:
10 10

Sample Output:
10000000000

 */
public class RaiseToThePower {
    public static long power(int n, int m) {
        return (long)Math.pow(n, m);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}

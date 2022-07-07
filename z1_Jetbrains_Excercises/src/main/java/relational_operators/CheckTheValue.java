package relational_operators;

import java.util.Scanner;

/*
Check the value
Write a program that reads a value and checks if it is less than 10.

It should print true if it is less than 10 or false otherwise.


Sample Input:
5

Sample Output:
true

 */
public class CheckTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limit = 10;
        boolean isBelowLimit = scanner.nextInt() < limit;
        System.out.println(isBelowLimit);
    }
}

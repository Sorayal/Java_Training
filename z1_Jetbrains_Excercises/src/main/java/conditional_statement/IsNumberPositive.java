package conditional_statement;

import java.util.Scanner;

/*
Check a number is positive
Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.

Do not forget that zero is not a positive number.


Sample Input:
7

Sample Output:
YES


 */
public class IsNumberPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean isPositive = input > 0;
        if (isPositive) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

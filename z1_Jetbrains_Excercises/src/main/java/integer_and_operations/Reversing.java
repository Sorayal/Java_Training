package integer_and_operations;

import java.util.Scanner;

/*
Reversing
Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.


Sample Input:
320

Sample Output:
23


Sample Input:
976

Sample Output:
679


 */
public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }
        System.out.println(result);
    }
}

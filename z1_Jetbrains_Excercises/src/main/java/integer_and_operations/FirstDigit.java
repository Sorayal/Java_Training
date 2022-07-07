package integer_and_operations;

import java.util.Scanner;

/*
First digit
Given a two-digit number. Print its first digit (i.e. the number of tens).


Sample Input:
42

Sample Output:
4

 */
public class FirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number / 10);
    }
}

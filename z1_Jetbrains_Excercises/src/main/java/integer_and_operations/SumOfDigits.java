package integer_and_operations;

import java.util.Scanner;

/*
The sum of digits
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.


Sample Input:
476

Sample Output:
17


 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        final int numberOfDigits = 3;
        final int base = 10;
        int result = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            result += input % base;
            input = input / base;
        }
        System.out.println(result);
    }
}

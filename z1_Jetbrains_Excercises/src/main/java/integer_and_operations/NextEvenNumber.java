package integer_and_operations;

import java.util.Scanner;

/*
Next even number
Given a natural number, not greater than 10000. Output the even number following this number.

Hint


Sample Input:
7

Sample Output:
8


Sample Input:
8

Sample Output:
10

 */
public class NextEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = input + 2;
        if (output % 2 == 0) {
            System.out.println(output);
        } else {
            System.out.println(output - 1);
        }
    }
}

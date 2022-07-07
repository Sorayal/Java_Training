package integer_and_operations;

import java.util.Scanner;

/*
Reversing input numbers
Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.

Hint


Sample Input:
1 2

Sample Output:
2 1

 */
public class ReversingInputNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.printf("%s %s", secondNumber, firstNumber);
    }
}

package branching_statements;

import java.util.Scanner;

/*
Even or odd
Given a sequence of natural numbers. Read numbers from the input, line by line, and for each number print if it is even or odd; if the number 0 is entered, don't print anything, immediately stop reading further numbers and terminate your program.

Input data

A sequence of natural numbers, each number in a new line.

Output data

The sequence of words "even" and "odd". Each word is in a new line.

Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.


Sample Input:
1
2
3
4
0

Sample Output:
odd
even
odd
even
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (0 == input) {
                break;
            }
            System.out.println(0 == input % 2 ? "even" : "odd");
        }
    }
}

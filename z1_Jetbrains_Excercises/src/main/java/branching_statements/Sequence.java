package branching_statements;

/*
The sequence
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.


Sample Input:
7

Sample Output:
1 2 2 3 3 3 4

 */

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumbers = scanner.nextInt();
        int loops = 0;
        exit:
        for (int i = 1; i <= maxNumbers; i++) {
            int counter = i;
            while (counter > 0) {
                System.out.printf("%d ", i);
                counter--;
                loops++;
                if (loops == maxNumbers) {
                    break exit;
                }
            }
        }
    }
}

package while_do_while;

import java.util.Scanner;

/*
Collatz conjecture
Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1. Repeat this operation until we get the number 1 as a result.

For example, if the number n = 17, then the sequence looks as the following:

17 52 26 13 40 20 10 5 16 8 4 2 1
It was proved that such a sequence will stop at number 1 for any initial natural number n up to 2^68.

Output format:
Sequence of integers in a single line, separated by spaces.


Sample Input:
17

Sample Output:
17 52 26 13 40 20 10 5 16 8 4 2 1

 */
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder().append(n);
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            result.append(" ").append(n);
        }
        System.out.println(result);
    }
}

package while_do_while;

import java.util.Scanner;

/*
Squares of natural numbers
Read an integer number N from the input and print all the squares of positive integers:

less than or equal to N,
in ascending order.

Sample Input:
50

Sample Output:
1
4
9
16
25
36
49


Sample Input:
1

Sample Output:
1

 */
public class SquaresOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLimit = scanner.nextInt();
        /*
        int base = 1;
        int square = 1;
        do {
            System.out.println(square);
            base++;
            square = base * base;
        } while (square <= maxLimit);
        */

        for (int i = 1; Math.pow(i, 2) <= maxLimit; i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }
}

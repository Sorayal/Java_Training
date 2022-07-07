package relational_operators;

/*
Check the given numbers are different
Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.

The output should be true or false.


Sample Input:
5 5 9

Sample Output:
false
 */

import java.util.Scanner;

public class GivenNumbersDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean firstPairIsDifferent = a != b;
        boolean secondPairIsDifferent = a != c;
        boolean thirdPairIsDifferent = b != c;

        boolean isDifferent = firstPairIsDifferent && secondPairIsDifferent && thirdPairIsDifferent;
        System.out.println(isDifferent);
    }
}

package relational_operators;

import java.util.Scanner;

/*
Check the sum
Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.

The program must output true or false.


Sample Input:
1 2 3

Sample Output:
false


Sample Input:
4 16 7

Sample Output:
true

 */
public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        final int constraint = 20;

        boolean firstCheck = first + second == constraint;
        boolean secondCheck = first + third == constraint;
        boolean thirdCheck = second + third == constraint;
        boolean isTwenty = firstCheck || secondCheck || thirdCheck;
        System.out.println(isTwenty);
    }
}

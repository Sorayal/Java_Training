package relational_operators;

import java.util.Scanner;

/*
Exactly one parameter is positive
Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).

Otherwise, it should print false.


Sample Input:
1 1 1

Sample Output:
false


Sample Input:
1 0 -1

Sample Output:
true


 */
public class OneParameterPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int limit = 0;
        boolean firstAboveLimit = a > limit && b <= limit && c <= limit;
        boolean secondAboveLimit = b > limit && a <= limit && c <= limit;
        boolean thirdAboveLimit = c > limit && a <= limit && b <= limit;

        System.out.println(firstAboveLimit ^ secondAboveLimit ^ thirdAboveLimit);
    }
}

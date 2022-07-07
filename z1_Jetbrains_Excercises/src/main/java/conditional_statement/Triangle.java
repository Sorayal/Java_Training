package conditional_statement;

import java.util.Scanner;

/*
Triangle
Given three natural numbers A, B, and C. Determine if a triangle with these sides can exist.

If the triangle exists, output the "YES" string; otherwise, output "NO".

A triangle is valid if the sum of its two sides is greater than the third side. If three sides are A, B, and C, then three conditions should be met.

1. A + B > C
2. A + C > B
3. B + C > A



Sample Input:
3
4
5

Sample Output:
YES

 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean theoremIsTrue = a + b > c && a + c > b && b + c > a;
        if (theoremIsTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

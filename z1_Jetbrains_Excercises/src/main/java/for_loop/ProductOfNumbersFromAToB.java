package for_loop;

import java.util.Scanner;

/*
The product of numbers from a to b
Write a program that prints the product of all integer numbers from a to b ( a < b).
Include a and exclude b from the product.


Sample Input:
1 2

Sample Output:
1


Sample Input:
6 14

Sample Output:
51891840


 */
public class ProductOfNumbersFromAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 1;
        for (int i = a; i < b; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}

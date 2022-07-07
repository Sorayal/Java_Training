package integer_and_operations;

import java.util.Scanner;

/*
How many nuts each squirrel will get
N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.

Input data format

There are two positive numbers N and K, each of them is not greater than 10000.


Sample Input:
3
14

Sample Output:
4


 */
public class NutsAndSquirrels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        System.out.println(nuts / squirrels);
    }
}

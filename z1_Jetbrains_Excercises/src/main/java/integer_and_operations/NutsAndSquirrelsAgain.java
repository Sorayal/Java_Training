package integer_and_operations;

import java.util.Scanner;

/*
Squirrels and nuts
N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

Input data format

There are two positive integers N and K, each of them is not greater than 10000.


Sample Input:
3
14

Sample Output:
2


 */
public class NutsAndSquirrelsAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        System.out.println(nuts % squirrels);
    }
}

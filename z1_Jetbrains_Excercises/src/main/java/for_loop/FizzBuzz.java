package for_loop;

import java.util.Scanner;

/*
Fizz Buzz
Fizz Buzz is a classic programming problem. Here is its slightly modified version.

Write a program that takes two integers as the input: the beginning and the end of the interval (both numbers belong to the interval).

The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it; if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.

Output each number or the word on a separate line.


Sample Input:
8 16

Sample Output:
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
 */
public class FizzBuzz {
    private static final int FIZZ = 3;
    private static final int BUZZ = 5;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % FIZZ == ZERO && i % BUZZ == ZERO) {
                System.out.println("FizzBuzz");
            } else if (i % FIZZ == ZERO) {
                System.out.println("Fizz");
            } else if (i % BUZZ == ZERO) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

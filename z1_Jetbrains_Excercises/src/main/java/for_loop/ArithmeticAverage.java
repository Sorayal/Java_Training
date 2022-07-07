package for_loop;

import java.util.Scanner;

/*
Arithmetic average
Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a;b], which are divisible by 3.

In the example below, the arithmetic average is calculated for the numbers on the interval [−5;12]. On this interval, there are 6 numbers divisible by 3, namely: −3,0,3,6,9,12. Their arithmetic average equals 4.5.

The program input contains intervals, which always contain at least one number, which is divisible by 3.

Remember that the int type cannot contain fractions. Use a double variable to store the precise result of the division.


Sample Input:
-5
12

Sample Output:
4.5



 */
public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println(sum / counter);
    }
}

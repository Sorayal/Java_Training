package for_loop;

import java.util.Scanner;

/*
Numbers divisible by six
Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

It is guaranteed that there is always a number divisible by 6 in the sequence.


Sample Input:
10
48
6
42
48
85
82
12
36
58
62

Sample Output:
192

 */
public class NumbersDivisibleBySix {
    static final int SEARCHED = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < elements; i++) {
            int number = scanner.nextInt();
            if (number % SEARCHED == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}

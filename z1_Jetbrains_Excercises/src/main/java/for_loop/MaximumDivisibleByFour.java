package for_loop;

import java.util.Scanner;

/*
Maximum element divisible by four
Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.

As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines). The program should print a single number: the maximum element of the sequence divisible by 4.

Try to solve this problem by using a for-loop.


Sample Input:
12
32
92
98
53
12
36
41
16
81
93
40
11

Sample Output:
92


 */
public class MaximumDivisibleByFour {
    private static final int SEARCHED = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int maximum = 0;
        for (int i = 0; i < elements; i++) {
            int value = scanner.nextInt();
            if (value % SEARCHED == 0 && value > maximum) {
                maximum = value;
            }
        }
        System.out.println(maximum);
    }
}

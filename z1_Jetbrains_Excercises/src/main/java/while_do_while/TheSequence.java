package while_do_while;

/*
The sequence
You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. As input, the program gets the number of elements in the sequence, and then the elements themselves. In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number: the maximum element of the sequence divisible by 4.

Try to solve this problem by using a while-loop.


Sample Input:
8
63
12
10
64
12
36
77
16

Sample Output:
64
 */

import java.util.Scanner;

public class TheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqSize = scanner.nextInt();
        final int requestedDiv = 4;
        int result = 0;

        while (seqSize > 0) {
            int number = scanner.nextInt();
            //result = 0 == number % requestedDiv && number > result ? number : result;
            if (0 == number % requestedDiv && number > result) {
                result = number;
            }
            seqSize--;
        }
        System.out.println(result);
        scanner.close();
    }
}

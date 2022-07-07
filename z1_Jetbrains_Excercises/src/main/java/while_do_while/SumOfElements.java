package while_do_while;

import java.util.Scanner;

/*
The sum of elements
Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.


Sample Input:
3
6
8
0

Sample Output:
17

 */
public class SumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}

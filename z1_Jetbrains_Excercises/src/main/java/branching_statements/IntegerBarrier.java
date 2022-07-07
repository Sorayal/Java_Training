package branching_statements;

/*
The integer barrier
Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:

1) if a new number is 0, the program must stop the loop and output the accumulated sum;

2) if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers and output the value equal to the sum minus 1000.

Note: the input can contain extra numbers. Just ignore them.


Sample Input:
800
101
102
300
0

Sample Output:
3


Sample Input:
103
105
109
0
1000

Sample Output:
317


 */

import java.util.Scanner;

public class IntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int input = scanner.nextInt();
            sum += input;
            if (input == 0) {
                break;
            } else if (sum >= 1000) {
                sum -= 1000;
                break;
            }
        }
        System.out.println(sum);
    }
}

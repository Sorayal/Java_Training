package while_do_while;

import java.util.Scanner;

/*
The length of the sequence
For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).

Don’t read numbers following the number 0.


Sample Input:
1
7
9
0
5

Sample Output:
3

 */
public class LengthOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            counter++;
            input = scanner.nextInt();
        }
        System.out.println(counter);
    }
}

package while_do_while;

import java.util.Scanner;

/*
The largest element of a sequence
Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.

The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.


Sample Input:
1
7
9
0

Sample Output:
9

 */
public class LargestElementOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int maximum = 0;
        do {
            input = scanner.nextInt();
            maximum = Math.max(input, maximum);
        } while (input != 0);
        System.out.println(maximum);
    }


    /*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int maximum = 0;
        do {
            input = scanner.nextInt();
            maximum = input <= maximum ? maximum : input;
        } while (input != 0);
        System.out.println(maximum);
    }
     */

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        int input;
        do {
            input = scanner.nextInt();
            sequence.add(input);
        } while (input != 0);
        System.out.println(Collections.max(sequence));
    }

     */
}

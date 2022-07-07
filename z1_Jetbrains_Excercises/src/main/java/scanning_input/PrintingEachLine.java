package scanning_input;

import java.util.Scanner;

/*
Printing each word in a new line
Write a program that reads five words from the standard input and outputs each word in a new line. The words should be in the same order.


Sample Input:
This Java platform
is adaptive

Sample Output:
This
Java
platform
is
adaptive
 */

public class PrintingEachLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input);
        }
    }
}
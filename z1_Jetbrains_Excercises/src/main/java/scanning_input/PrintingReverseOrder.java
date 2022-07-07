package scanning_input;

import java.util.Scanner;


/*
Print strings in the reverse order
Write a program that reads three strings and outputs them in the reverse order, each in a new line.
Sample Input:
Java
Programming
Language

Sample Output:
Language
Programming
Java
 */
public class PrintingReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();
        String thirdValue = scanner.nextLine();

        System.out.println(thirdValue);
        System.out.println(secondValue);
        System.out.println(firstValue);
    }
}

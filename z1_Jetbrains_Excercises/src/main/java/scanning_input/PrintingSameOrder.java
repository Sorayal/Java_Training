package scanning_input;

import java.util.Scanner;

/*
Printing strings in the same order
Write a program that reads four words and outputs them in the same order, each in a new line.


Sample Input:
Hello
Java
Future programmer

Sample Output:
Hello
Java
Future
programmer
 */
public class PrintingSameOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output;
        while (scanner.hasNext()) {
            output = scanner.next();
            System.out.println(output);
        }
    }
}

package integer_and_operations;

import java.util.Scanner;

/*
Reading integer numbers
Write a program that reads four integer numbers from one line and prints them each in a new line. In the input line numbers are separated by one or more spaces.


Sample Input:
101    102 103  104

Sample Output:
101
102
103
104
 */
public class ReadingIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}

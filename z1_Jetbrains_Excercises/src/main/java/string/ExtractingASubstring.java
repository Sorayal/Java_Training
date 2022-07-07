package string;

import java.util.Scanner;

/*
Extracting a substring
Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.


Sample Input:
Java
0 2

Sample Output:
Jav

 */
public class ExtractingASubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();

        System.out.println(text.substring(lowerBound, upperBound + 1));
    }
}

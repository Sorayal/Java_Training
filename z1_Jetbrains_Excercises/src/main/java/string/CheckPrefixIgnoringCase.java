package string;

import java.util.Scanner;

/*
Check prefix ignoring the case
Write a program that checks if a given string starts with the prefix "J" ignoring the case.

The program should output true or false.


Sample Input:
Java

Sample Output:
true


Sample Input:
Kotlin

Sample Output:
false

 */
public class CheckPrefixIgnoringCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String valueToCheck = "J";
        boolean result = input.toUpperCase().startsWith(valueToCheck);
        System.out.println(result);
    }
}

package string;

import java.util.Scanner;

/*
Comparing strings ignoring whitespaces
Write a program that reads two lines and compares them without whitespaces. The program should print true if both lines are equal, otherwise – false.


Sample Input:
  string
str ing

Sample Output:
true


Sample Input:
string
my string

Sample Output:
false

 */
public class ComparingStringsIgnoringWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String firstStripped = stripWhitespaces(firstInput);
        String secondStripped = stripWhitespaces(secondInput);
        System.out.println(firstStripped.equals(secondStripped));
    }

    public static String stripWhitespaces(String fromString) {
        return fromString.replaceAll("\\s+", "");
    }
}

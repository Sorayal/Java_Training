package switch_statements;

import java.util.Scanner;

/*
From string to a number
Write a program that reads a string from the standard input and outputs the number. A number can be from 1 to 9 (inclusive).


Sample Input:
one

Sample Output:
1


 */

public class FromStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;
            default:
                throw new IllegalArgumentException("Invalid input");
        }

        /*
        Does work stable since Java 17
         switch (input) {
            case "one" -> System.out.println(1);
            case "two" -> System.out.println(2);
            case "three" -> System.out.println(3);
            case "four" ->  System.out.println(4);
            case "five" -> System.out.println(5);
            case "six" -> System.out.println(6);
            case "seven" -> System.out.println(7);
            case "eight" -> System.out.println(8);
            case "nine" -> System.out.println(9);
            default -> throw new IllegalArgumentException("Invalid input");

        }
         */
    }
}

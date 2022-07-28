package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 Count how many times a number occurs
Medium
7743 users solved this problem. Latest completion was less than a minute ago.

Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.
Report a typo

Sample Input 1:

6
1 2 3 4 2 1
2

Sample Output 1:

2

Sample Input 2:

9
1 2 3 4 5 4 3 2 1
7

Sample Output 2:

0
 */
public class CountHowManyTimesNumberOccurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        String input = scanner.nextLine();
        // Split after one or multiple spaces
        String[] given = input.split("\\s+");

        // Double condition to prevent out of bound exception
        for (int i = 0; i < numbers.length && i < given.length; i++) {
            numbers[i] = Integer.parseInt(given[i]);
        }

        int searchedNumber = scanner.nextInt();
        Long counter = Arrays.stream(numbers)
                .filter(number -> number == searchedNumber)
                .count();
        System.out.println(counter);
        scanner.close();
    }
}

package arrays;

import java.util.Scanner;

/*
Check if an array is sorted ascending
Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest number).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single value: true or false.


Sample Input:
4
1 2 3 4

Sample Output:
true


Sample Input:
4
1 2 3 0

Sample Output:
false



 */
public class CheckIfArrayIsSortedASC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        String input = scanner.nextLine();
        // Split after one or multiple spaces
        String[] given = input.split("\\s+");

        // Double condition to prevent out of bound exception
        // if numbers array is smaller, the needless numbers in given won´t be considered
        for (int i = 0; i < numbers.length && i < given.length; i++) {
            numbers[i] = Integer.parseInt(given[i]);
        }
        boolean sorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
        scanner.close();
    }

}

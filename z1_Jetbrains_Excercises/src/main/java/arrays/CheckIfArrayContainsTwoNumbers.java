package arrays;

import java.util.Scanner;

/*
Check if an array contains two numbers
Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each other in the array (in any order).

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.

Sample Input:
3
1 3 2
2 3

Sample Output:
true


Sample Input:
3
2 1 2
2 3

Sample Output:
false


 */
public class CheckIfArrayContainsTwoNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Scanner getScanner() {
        return SCANNER;
    }

    public static void main(String[] args) {
        final int sizeSearched = 2;

        // set size for array of numbers which should be filled
        int size = setSize();
        int[] numbers = new int[size];

        // fill it with actual numbers
        fillArray(numbers);

        // set numbers to search for
        int[] searched = new int[sizeSearched];
        fillArray(searched);

        System.out.println(checkForSearched(searched, numbers));
        SCANNER.close();
    }

    /**
     * Sets the size for the numbers array
     * @return - the size
     */
    public static int setSize() {
        Scanner scanner = getScanner();
        return Integer.parseInt(scanner.nextLine());
    }

    /**
     * Fills the array with numbers from console input
     * @param numbers - the array which should be filled
     */
    public static void fillArray(int[] numbers) {
        Scanner scanner = getScanner();
        String input = scanner.nextLine();
        String[] result = input.split("\\s+");
        for (int i = 0; i < result.length && i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(result[i]);
        }
    }

    /**
     * Searchs for two numbers which should occur to each other in any order
     * @param searched - an array of two numbers as search parameter
     * @param numbers - an array of numbers to check for the numbers which are in searched
     * @return returns true if the numbers occur next to each other in any order, otherwise false
     */
    public static boolean checkForSearched(int[] searched, int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean bothOccur = numbers[i] == searched[0] && numbers[i + 1] == searched[1] ||
                    numbers[i] == searched[1] && numbers[i + 1] == searched[0];
            if (bothOccur) {
                return true;
            }
        }
        return false;
    }
}

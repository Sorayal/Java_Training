package relational_operators;

/*
Is between
        Write a program that reads three integer numbers and prints true if the first number is between the second and the third one (inclusive). Otherwise, it must print false.

        The last two arguments may not be sorted.


        Sample Input:
        3 3 3

        Sample Output:
        true


        Sample Input:
        2 7 9

        Sample Output:
        false


        Sample Input:
        40 100 20

        Sample Output:
        true


        Sample Input:
        2 1 3

        Sample Output:
        true
*/

import java.util.Scanner;

public class IsBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int lowerLimit = second;
        int upperLimit = third;
        if (second > third) {
            lowerLimit = third;
            upperLimit = second;
        }
        System.out.println(numberToCheck >= lowerLimit && numberToCheck <= upperLimit);
    }
}

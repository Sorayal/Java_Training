package relational_operators;

import java.util.Scanner;

/*
Groundhogs at a party
Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups. But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20 Reese's peanut butter cups, inclusive, unless it is the weekend, in which case they will need 15 to 25 Reese's peanut butter cups, inclusive.

Write a Java program that reads two values:

the first is the number of Reese's peanut butter cups;
the second is a boolean representing whether it is the weekend.
The program must print a boolean value that indicates whether the party was successful.


Sample Input:
5 true

Sample Output:
false


Sample Input:
16 false

Sample Output:
true
 */


class GroundHogs {
    private static final int LOWERBNDWEEKEND = 15;
    private static final int UPPERBNDWEEKEND = 25;
    private static final int LOWERBND = 10;
    private static final int UPPERBND = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println(cups <= UPPERBNDWEEKEND && cups >= LOWERBNDWEEKEND);
        } else {
            System.out.println(cups <= UPPERBND && cups >= LOWERBND);
        }
    }
}
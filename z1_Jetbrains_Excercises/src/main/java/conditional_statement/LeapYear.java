package conditional_statement;

import java.util.Scanner;

/*
Leap year
Find whether the given year is a leap year.

Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).

The program should work correctly for the years 1900 ≤ n ≤ 3000.

Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.

It is enough to write a simple conditional statement to solve this task.


Sample Input:
2100

Sample Output:
Regular


Sample Input:
2000

Sample Output:
Leap


 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = checkIfLeap(year);
        System.out.println(isLeap ? "Leap" : "Regular");
    }

    public static boolean checkIfLeap(int year) {
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        boolean isWithinBounds = year >= 1900 && year <= 3000;
        return isLeapYear && isWithinBounds;
    }
}

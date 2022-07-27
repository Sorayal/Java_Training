package leapyear;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = checkIfLeap(year);
        System.out.println(isLeap ? ("Leap") : ("Regular"));
    }

    public static boolean checkIfLeap(int year) {
        boolean isWithinBounds = year >= 1900 && year <= 3000;
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && isWithinBounds;
    }

/*    public static boolean checkIfLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }*/
}

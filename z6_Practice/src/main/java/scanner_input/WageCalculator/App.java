package scanner_input.WageCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your wage per hour:");
        double wagePerHour = input.nextDouble();
        System.out.println("Enter your hours of work");
        int hours = input.nextInt();

        checkForValidValues(wagePerHour, hours);
        double result = calculateWage(wagePerHour, hours);
        System.out.println(result);

        double resultMonth = calculateWagePerMonth(wagePerHour);
        System.out.printf("Wage per month in Germany for 40 hours per week: %.2f Euro", resultMonth);
    }

    public static double calculateWage(double wagePerHour, int hours){
        return  wagePerHour * hours;
    }

    public static void checkForValidValues(double wagePerHour, int hours){
        boolean isBelowZero = wagePerHour < 0 || hours < 0;
        if(isBelowZero){
            throw new IllegalArgumentException("Arguments shouldn´t be below zero");
        }
    }

    public static double calculateWagePerMonth(double wagePerHour){
        int hours = 40;
        double weeksPerMonth = 4.35;
        return wagePerHour * hours * weeksPerMonth;
    }
}

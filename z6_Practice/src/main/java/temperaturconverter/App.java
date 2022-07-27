package temperaturconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        while (true) {
            System.out.print("Welcome to Celsius-Fahrenheit Converter" +
                    "\nEnter the value to convert:");
            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong format");
                scanner.nextLine();
            }
        }
        System.out.println("Enter the number 1, if you want to convert to Celsius " +
                "or number 2 if you want to convert to Fahrenheit");
        int choice = scanner.nextInt();
        if (1 == choice) {
            System.out.printf("The temperature is %.2f Celsius.", convertToCelsius(value));
        } else if (2 == choice) {
            System.out.printf("The temperature is %.2f Fahrenheit.", convertToFahrenheit(value));
        } else {
            throw new IllegalArgumentException("No valid number given.");
        }
    }

    private static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    private static double convertToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}


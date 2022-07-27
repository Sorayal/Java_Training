package scanner_input.input_demo;

/**
 * Lernziel:
 * Ganzzahl einlesen,
 * double einlesen,
 * String einlesen
 * Scanner ist lokalisiert
 * Printf
 */


public class ConsoleInput {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        // Next token, whitespace calls delimiter
        // Takes the next word
        // String name = new java.util.Scanner(System.in).next();
        // Takes the next line
        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("Please enter the number of calories:");
        double kcal = new java.util.Scanner(System.in).nextDouble();
        // Works with Scanner class, so one input channel
        // Careful with exceptions
        // Scanner is with local associated, so you have to use comma
        System.out.println("Please enter the number of products:");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println("Name: " + name);
        // Formatted output
        // %f.2 2 Nachkommastellen, wird korrekt gerundet
        System.out.printf("Gesamtanzahl kcal: %f.2%n", number * kcal);
    }
}

package switches.new_switch;

import java.util.Scanner;

/**
 * New syntax for switch since Java 12
 */
public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druecke a, b oder c!");
        String input = scanner.nextLine();

        switch (input) {
            case "a" -> System.out.println("Abbrechen");
            case "b" -> System.out.println("B gedrueckt!");
            case "c" -> {
                System.out.println("C gedrueckt");
                System.out.println("Ende");
            }
            default -> System.out.println("Kein gueltige Wahl!");

        }
    }
}

package scanner_with_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number);
        try {

        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}

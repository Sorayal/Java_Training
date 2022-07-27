package primcheck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check if its a prim number:");
        try {
            int number = input.nextInt();
            System.out.println(checkIfPrim(number));
        } catch (InputMismatchException e) {
            input.nextLine();
        }
    }

    public static boolean checkIfPrim(int number) {
        boolean isPrim = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrim = false;
                break;
            }
        }
        return isPrim;
    }
}

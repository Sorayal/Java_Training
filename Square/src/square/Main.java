package square;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculates square from 1 to given n
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a number n to calculate square from 1 to n :");
            int n = input.nextInt();
            calculateSquare(n);
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Wrong argument", e);
        }
    }

    public static void calculateSquare(int n) {
        for (int i = 1; i <= n; i = i + 1) {
            String s = "Quadrat(" + i + ") = " + quadrat(i);
            System.out.println(s);
        }
    }

    public static int quadrat(int n) {
        return n * n;
    }
}

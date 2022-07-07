package conditional_statement;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
Conditional statement
Symmetrical number

Given a four-digit number, determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise, output any other integer.


Sample Input 1:

2002
Sample Output 1:

1
Sample Input 2:

2008
Sample Output 2:

37
 */


public class SymmetricalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        boolean isSymmetrical = digits.size() == 4 &&
                Objects.equals(digits.get(0), digits.get(3)) &&
                Objects.equals(digits.get(1), digits.get(2));
        System.out.println(isSymmetrical ? 1 : 0);
    }

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fourDigits = scanner.nextLine();
        String reversed = new StringBuilder(fourDigits).reverse().toString();
        System.out.println(fourDigits.equals(reversed) ? 1 : 2);

        // without StringBuilder below. Use nextInt() instead of nextLine()
        // System.out.println(fourDigits / 100 == (fourDigits % 10) * 10 + fourDigits / 10 % 10 ? 1 : 2);
    }
    */
}

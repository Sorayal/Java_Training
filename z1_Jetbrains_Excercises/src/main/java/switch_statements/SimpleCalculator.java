package switch_statements;

import java.util.Scanner;

/*
A simple calculator
Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.

The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.

The calculator should support:

addition: "+"
subtraction: "-"
integer division: "/"
multiplication: "*"
If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".

If the input operator is not one from the list, the program should output "Unknown operator".

Note: it's recommended to use the switch statement in your solution.


Sample Input:
10000000000 + 20000000000

Sample Output:
30000000000


Sample Input:
3000 / 0

Sample Output:
Division by 0!


Sample Input:
10000 ! 300

Sample Output:
Unknown operator

 */
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitted = input.split(" ");
        long firstNumber = Long.parseLong(splitted[0]);
        char operation = splitted[1].charAt(0);
        long secondNumber = Long.parseLong(splitted[2]);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/':
                if (0 == secondNumber) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber / secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}

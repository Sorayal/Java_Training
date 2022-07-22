package methods.calculator;

/*
Calculator with four methods
In a template below you have a simple calculator that subtracts, sums, divides, and multiplies the two numbers inside the switch statement. Now, we've decided to upgrade it to perform more complex tasks, such as logarithmic functions. For that, separate methods are a better solution. Let's start with decomposing what we have.

Take a look at the template and decompose operations of the calculator into four methods: subtractTwoNumbers(long a, long b) for subtraction, sumTwoNumbers(long a, long b) for adding, divideTwoNumbers(long a, long b) for integer division and multiplyTwoNumbers(long a, long b) for multiplication. Each method should print the result of calculations.

Note that you can't divide by zero. In case your second argument is zero, you should print the "Division by 0!" message.


Sample Input:
1 + 2

Sample Output:
3


Sample Input:
4 / 0

Sample Output:
Division by 0!


 */
public class CalculatorWithFourMethods {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}

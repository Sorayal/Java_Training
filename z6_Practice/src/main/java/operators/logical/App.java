package operators.logical;

public class App {
    public static void main(String[] args) {
        /**
         * Addition to the previous part of operators
         * Abbreviating operators
         */

        // result = result + 1;
        // 1 + 1 = 2
        int result = 1;
        result++;
        System.out.println("result is now: " + result);

        //2 - 1 = 1
        result--;
        System.out.println("result is now: " + result);

        // result = result + 2
        result += 2;
        System.out.println("result is now: " + result);

        // result = result * 10
        result *= 10;
        System.out.println("result is now: " + result);

        // result = result / 3
        result /= 3;
        System.out.println("result is now: " + result);

        // result = result - 2
        result -= 2;
        System.out.println("result is now: " + result);
    }
}

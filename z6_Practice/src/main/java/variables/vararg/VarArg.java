package variables.vararg;

import java.util.Arrays;

/**
 * Varargs is indicated with three dots as parameter.
 * It means variable-length arguments, so you can put in an undefined numbers of arguments of the same type.
 * Varargs have to be always the last parameter at a method with several parameters.
 */
public class VarArg {
    public static void main(String[] args) {
        int[] numbers1 = {};
        int[] numbers2 = {0};
        int[] numbers3 = {2,4,5};
        int[] numbers4 = {4,0,8,9,88,44};
        printNumberOfArguments(numbers1);
        printNumberOfArguments(numbers2);
        printNumberOfArguments(numbers3);
        printNumberOfArguments(numbers4);
        printNumberOfArguments(2,3,5);

        printArguments(numbers3);
        printArguments(numbers4, true, false , true, true);

    }

    public static void printNumberOfArguments(int ... numbers){
        System.out.printf("The length of the array is %d%n", numbers.length);
    }

    public static void printArguments(int[]numbers, boolean ... booleans){
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));
    }
}

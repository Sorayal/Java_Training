package swaptest;

import java.util.Arrays;

public class SwapTest {
    public static void main(String[] args) {
        int[] numbers = {2,3};
        System.out.println(Arrays.toString(numbers)); // before swapping
        swapFirstWithLast(numbers);
        System.out.println(Arrays.toString(numbers)); // after swapping

        int a = 20;
        changeValue(a);
        System.out.println(a);
    }

    // Takes as argument a copy of the reference to the array
    public static void swapFirstWithLast(int[] numbers){
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
    }

    // Takes as argument a copy of the value, so the change stays inside.
    public static void changeValue(int a){
        a = 0;
    }
}

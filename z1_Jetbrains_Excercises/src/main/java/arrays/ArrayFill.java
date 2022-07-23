package arrays;

import java.util.Arrays;

/*
Determine the output
What is the output of the code below?

int[] numbers = { 1, 2, 3, 4, 5 };

Arrays.fill(numbers, 1, 5, 10);

System.out.println(Arrays.toString(numbers));

Select one option from the list:
[1, 10, 10, 10, 10]
[1, 2, 3, 4, 5]
[10, 10, 10, 10, 10]
ArrayIndexOutOfBoundsException
 */
public class ArrayFill {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        Arrays.fill(numbers, 1, 5, 10);
        // toIndex 5 is exclusive, so actually it will fill till index 4

        System.out.println(Arrays.toString(numbers));
    }
}

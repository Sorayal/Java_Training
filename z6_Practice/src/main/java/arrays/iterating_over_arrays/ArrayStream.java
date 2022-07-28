package arrays.iterating_over_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] arr = new int[5];
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));

    }
}

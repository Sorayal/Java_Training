package arrays;

import java.util.Arrays;

/*
Initializing an array of longs
Create an array of longs named longNumbers with three elements 100000000001, 100000000002, 100000000003.

Then output the array.

Use the provided code template.

The long type is used to store big integer values. To indicate a long value, use the L or l literal. Otherwise, it is considered as int.

long twentyTwo = 22L; // L or l is a literal for longs


 */
public class AnArrayOfLongs {
    public static void main(String[] args) {
        long[] longNumbers = {10_000_000_0001L, 100_000_000_002L, 100_000_000_003L};

        System.out.println(Arrays.toString(longNumbers));
    }
}

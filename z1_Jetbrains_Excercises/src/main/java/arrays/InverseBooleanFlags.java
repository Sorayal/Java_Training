package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Inverse boolean flags
Write a body and a parameter of the method inverseFlags. The method must take an array of booleans and negate each of them. Do not make a copy of the parameter, change elements of a passed array.


Sample Input:
true false true

Sample Output:
false true false


 */
public class InverseBooleanFlags {

    public static void inverseFlags(boolean[] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = !flags[i];
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Boolean> booleans = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());
        final boolean[] flags = new boolean[booleans.size()];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = booleans.get(i);
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
    }
}

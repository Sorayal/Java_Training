package string;

import java.util.Scanner;

/*
Replacing 'a' with 'b'
Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

The program should print out the resulting string.


Sample Input:
aaa

Sample Output:
bbb


Sample Input:
bca

Sample Output:
bcb

 */
public class ReplacingAWithB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace('a', 'b'));
    }
}

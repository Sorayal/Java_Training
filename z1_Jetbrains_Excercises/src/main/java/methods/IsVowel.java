package methods;

import java.util.Scanner;
import java.util.Set;

/*
Vowel or not
Implement a method that checks whether a given English letter is a vowel or not. The input may be in any case.

In our case, the letter 'y' is not considered a vowel.

Examples:

isVowel('a') should be true
isVowel('A') should be true
isVowel('b') should be false
 */
public class IsVowel {
    public static boolean isVowel(char ch) {
        Set<Character> vowels = Set.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        return vowels.contains(ch);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}

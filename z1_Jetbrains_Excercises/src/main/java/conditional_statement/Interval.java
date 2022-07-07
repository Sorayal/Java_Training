package conditional_statement;

import java.util.Scanner;

/*
Interval
Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case sensitive).

Notes:

numbers denoted with a parenthesis () are exclusive;
numbers denoted with a square bracket [] are inclusive.

Sample Input:
20

Sample Output:
True


Sample Input:
-20

Sample Output:
False

 */
public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        final int minFirst = -15;
        final int maxFirst = 12;
        final int minSecond = 14;
        final int maxSecond = 17;
        final int minThird = 19;
        final boolean firstConditionTrue = input > minFirst && input <= maxFirst;
        final boolean secondConditionTrue = input > minSecond && input < maxSecond;
        final boolean thirdConditionTrue = input >= minThird;
        final boolean atLeastOneConditionTrue = firstConditionTrue || secondConditionTrue || thirdConditionTrue;

        if (atLeastOneConditionTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

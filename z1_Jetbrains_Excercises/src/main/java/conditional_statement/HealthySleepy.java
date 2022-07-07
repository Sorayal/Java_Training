package conditional_statement;

import java.util.Scanner;

/*
Conditional statement
Healthy sleep Problem of the day

Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

You are given three numbers: A A A, B B B and H H H. According to TV, one should sleep at least A A A hours per day, but no more than B B B hours. H H H is how many hours Ann sleeps.

Task: If Ann sleeps less then A A A hours, print "Deficiency". If she sleeps more than B B B hours, print "Excess". If her sleep fits the recommendations, print "Normal".

Input format: three numbers A A A, B B B, H H H, where A A A is always less than or equal to B B B.

Report a typo

Sample Input 1:

6
10
8

Sample Output 1:

Normal

Sample Input 2:

7
9
10

Sample Output 2:

Excess

Sample Input 3:

7
9
2

Sample Output 3:

Deficiency
 */

public class HealthySleepy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int currentSleep = scanner.nextInt();

        if (currentSleep < minSleep) {
            System.out.println("Deficiency");
        } else if (currentSleep > maxSleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}

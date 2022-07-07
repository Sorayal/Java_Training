package for_loop;

import java.util.Scanner;

/*
Grades
Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.

The program gets number n as the first line of input and then gets the grades themselves, each on a new line.

The program must output four numbers in a single line: the number of D, C, B, and A grades (in that order), separated by blank space characters.


Sample Input:
14
B
A
A
A
A
B
D
D
A
B
C
B
B
A

Sample Output:
2 1 5 6

 */
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTests = scanner.nextInt();
        scanner.nextLine();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 0; i < numberTests; i++) {
            String grade = scanner.nextLine();
            switch (grade) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    throw new IllegalArgumentException("Not a valid grade");

            }
        }
        System.out.printf("%d %d %d %d", countD, countC, countB, countA);
    }
}

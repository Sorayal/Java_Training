package for_loop;

import java.util.Scanner;

/*
Size of parts
A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.


Sample Input:
10
1
-1
1
1
1
1
-1
-1
1
-1

Sample Output:
0 6 4


 */
public class SizeOfParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberParts = scanner.nextInt();
        scanner.nextLine();
        int fixCounter = 0;
        int rejectCounter = 0;
        int readyCounter = 0;

        for (int i = 0; i < numberParts; i++) {
            String size = scanner.nextLine();
            switch (size) {
                case "1":
                    fixCounter++;
                    break;
                case "-1":
                    rejectCounter++;
                    break;
                case "0":
                    readyCounter++;
                    break;
                default:
                    System.out.println("Not a valid size");
                    break;
            }
        }
        System.out.printf("%d %d %d", readyCounter, fixCounter, rejectCounter);
    }
}

package integer_and_operations;

import java.util.Scanner;

/*
Desks
A university has decided to open math courses and equip classrooms for 3 groups with new special desks. The faculty agreed that for the sake of productivity, only two students may share one desk. The enrollment has ended, and now the task is to count the number of desks to order the correct number from the shop. Of course, the university is short of money, so you need to calculate the minimum number of desks. But don't forget that each group will sit in its own classroom!

Input data format

The program receives the input of the three non-negative integers: the number of students in each of the three groups (the numbers are not bigger than 1000).


Sample Input:
20
21
22

Sample Output:
32


Sample Input:
16
18
20

Sample Output:
27

 */
public class Desks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int sumOfDesks = 0;

        sumOfDesks = calculateNumberOfDesks(firstNumber);
        sumOfDesks += calculateNumberOfDesks(secondNumber);
        sumOfDesks += calculateNumberOfDesks(thirdNumber);

        System.out.println(sumOfDesks);
    }

    public static int calculateNumberOfDesks(int students) {
        if (students % 2 == 0) {
            return students / 2;
        } else {
            return students / 2 + 1;
        }
    }
}

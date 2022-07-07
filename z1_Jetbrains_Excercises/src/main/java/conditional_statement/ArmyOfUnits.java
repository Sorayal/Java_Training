package conditional_statement;

import java.util.Scanner;

/*
The army of units
In a computer game, each gamer has an army of units.

Write a program that will classify the army of your enemies corresponding to the following rules:

Units: Category

less than 1: no army

from 1 to 19: pack

from 20 to 249: throng

from 250 to 999: zounds

1000 and more: legion

The program should read the number of units and output the corresponding category.


Sample Input:
5

Sample Output:
pack


Sample Input:
303

Sample Output:
zounds

 */
public class ArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armySize = scanner.nextInt();
        if (armySize < 1) {
            System.out.println("no army");
        } else if (armySize <= 19) {
            System.out.println("pack");
        } else if (armySize <= 249) {
            System.out.println("throng");
        } else if (armySize <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}

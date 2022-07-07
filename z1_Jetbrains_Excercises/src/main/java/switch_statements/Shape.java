package switch_statements;

/*
Shape
Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number). If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".

Note: the output text should exactly match the sample, including letters' case and location of spaces.


Sample Input:
1

Sample Output:
You have chosen a square
 */

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String shapeIntro = "You have chosen a";
        switch (choice) {
            case "1":
                System.out.printf("%s square", shapeIntro);
                break;
            case "2":
                System.out.printf("%s circle", shapeIntro);
                break;
            case "3":
                System.out.printf("%s triangle", shapeIntro);
                break;
            case "4":
                System.out.printf("%s rhombus", shapeIntro);
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}

package switch_statements;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
Floor-space of the room
Citizens of the country named Malevia often experiment with the shapes of their rooms. The rooms can be triangular, rectangular, and round.

Write a program that calculates the floor area of the rooms.

Input data format: The type of the room shape and the relevant parameters.

Output data format: The area of the resulting room.

Note that the value of 3.14 is used instead of the number π in Malevia.

Hint

Input format used by the Malevians:

triangle
a
b
c
where a, b, and c are lengths of the triangle sides.

rectangle
a
b
where a and b are lengths of the rectangle sides.

circle
r
where r is the radius of the circle.

Note that the input values (a, b, c, r) are doubles, and your answer should be too.


Sample Input:
rectangle
4
10

Sample Output:
40.0


Sample Input:
circle
5

Sample Output:
78.5


Sample Input:
triangle
3
3
3

Sample Output:
3.897114317029974

 */
public class FloorSpaceOfTheRoom {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(calculateTriangleArea(a, b, c));
            }
            case "circle" -> {
                double r = scanner.nextDouble();
                System.out.println(calculateCircleArea(r));
            }
            case "rectangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(calculateRectangleArea(a, b));
            }
            default -> System.out.println("Not a valid shape");
        }
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }

}

package java_tutorial;

/**
 * Lernziel:
 * Methoden refactoring, um die nichtfunktionalen Anforderungen
 * wie Lesbarkeit, Wartbarkeit usw. zu erhöhen. Die Funktionalität
 * bleibt davon unbeeinflusst.
 */

public class MethodRefactoring {
    public static void main(String[] args) {
        int stars = 12;
        printStars(stars, '*');

        printStars(34, '*');

        int a = 12;
        int b = 12;
        int area = getArea(a, b);
        System.out.println(area);

        int area_ = a * b;
        int perimeter = 2 * a + 2 * b;

        System.out.println(area_);
        System.out.println(perimeter);
    }

    private static int getArea(int a, int b) {
        return a * b;
    }

    public static void printStars(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.println(c);
        }
    }
}

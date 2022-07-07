package java_tutorial;

/**
 * Lernziel:
 * - Methoden überladen
 * - Default-Werte
 */

public class Methods4 {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(random(10));
        System.out.println(random(100, 200));

        lines(10);
        lines(10, '#');

    }

    // Überladene Methoden
    static double random() {
        return Math.random();
    }

    static double random(double max) {
        return Math.random() * max;
    }

    static double random(double min, double max) {
        return min + Math.random() * (max - min);
    }

    // Optionale Parameter, wird die Methode nur len aufgerufen, wird als Default Wert ein Minuszeichen genommen
    static void lines(int len) {
        lines(len, '-');
    }

    static void lines(int len, char c) {
        for (int i = 0; i < len; i++) {
            System.out.print(c);
        }
    }
}

package java_tutorial;

/**
 * Lernziel:
 * - return
 * - return / Rückgabe
 * - Methoden überladen
 * - Rekursive Methoden
 */
public class Methods3 {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(random(100));
    }

    static double random(int factor) {
        return Math.random() * factor;
    }
}

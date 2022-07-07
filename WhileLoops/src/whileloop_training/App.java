package whileloop_training;

/**
 * - while
 * - Endlosschleife
 * - break und continue
 *
 * - while ist eine kopfgesteuerte Schleife
 * - break bricht eine Schleife ab
 * - continue springt an den Anfang einer Schleife
 */

public class App {
    public static void main(String[] args) {

        // 90 % Wahrscheinlichkeit eines Schleifeneintritts
        while (Math.random() > 0.1) {
            System.out.println("Loop Body");
        }
    }
}

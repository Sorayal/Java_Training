package playground;

/**
 * Lernziel:
 * - If-Else
 * - Dangling-else-Probleme / Zuordnungsproblem
 */
public class IfElseStatement {
    public static void main(String[] args) {
        //boolean isRed = Math.random() > 0.5;
        //boolean isUnderLine = Math.random() > 0.5;
        // Dangling Else Problem
/*        if (isRed) {
            if (isUnderLine) {
                System.out.println("rot");
            } else {
                System.out.println("blau");
            }
        } else {
            System.out.println("is not underlined");
        }*/

        double random = Math.random();
        if (random < 0.3) {
            System.out.println("rot");
        } else if (random < 0.6) {
            System.out.println("grün");
        } else {
            System.out.println("Blau");
        }
    }
}

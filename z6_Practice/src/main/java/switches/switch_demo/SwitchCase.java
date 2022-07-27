package switches.switch_demo;

/**
 * Lernziel:
 * Switch-Case Anweisung lernen
 * - default
 * - Durchfallen
 * - Stack-Case-Labels
 * - Ganzzahlen, Aufzählungstypen, und Strings
 */

public class SwitchCase {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 3); // 0,1,2

        // Enhanced switch
        switch (random) {
            case 0 -> System.out.println("rot");
            case 1 -> System.out.println("grün");
            case 2 -> System.out.println("blau");
        }

        // Konstante
        final int ZERO = 0;

        switch (random) {
            case ZERO:
                System.out.println("rot");
                break;
            case 1:
                System.out.println("grün");
                break;
            case 2:
                System.out.println("blau");
                break;
        }

        String input = "Ice";

        // Zusammenfassen von Cases
        switch (input){
            case "Eis":
            case "Ice":
                System.out.println("Eis");
                break;
            case "Schokolade":
                System.out.println("Schoki");
                break;
            default:
                System.out.println("Etwas anderes. Ist das essbar?");
        }
    }
}

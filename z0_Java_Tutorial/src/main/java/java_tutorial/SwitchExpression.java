package java_tutorial;

/**
 * Lernziel: switch-Ausdruck (ab Java 14)
 * Ausdrücke liefern etwas zurück, Anweisungen nicht
 *
 * yield Schlüsselwort . yield führt zu dem Ausdruck
 */
public class SwitchExpression {
    public static void main(String[] args) {

        String operator = "+";

        // Wird break vergessen, dann fällt es durch bis zum letzten Zweig mit einem break.
        switch (operator) {
            case "+":
                System.out.println("Plus");
                break;
            case "-":
                System.out.println("Minus");
                break;
        }

        // Statt Doppelpunkt Pfeil wie bei Lambda Ausdrücken. Das break kann man dann
        // sparen.
/*        switch (operator) {
            case "+" -> System.out.println("Plus");
            case "-" -> System.out.println("Minus");
            // Mehrere Konstanten lassen sich zusammenfassen.
            case "*", "x" -> System.out.println("Multiplikation");
            case "/" -> System.out.println("Division");
            default -> System.out.println("Unbekannter Operator");

        }*/

        // Zuweisung in eine Variable
        String s = switch (operator) {
            case "+" -> {
                System.out.println("Hier bin ich");
                yield "Plus";}
            case "-" -> "Minus";
            case "*", "x" -> "Multiplikation";
            case "/" -> "Division";
            default -> "Unbekannter Operator";
        };

        System.out.println(s);

    }
}

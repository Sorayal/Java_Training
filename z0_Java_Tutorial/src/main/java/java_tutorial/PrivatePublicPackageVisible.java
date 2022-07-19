package java_tutorial;

import java_tutorial.quote.QuotePrinter;

/**
 * Lernziel:
 * - public, private
 * - Paketsichtbarkeit
 *
 * @see PrivatePublicPackageVisible
 * <p>
 * Wird kein Schlüsselwort für die Sichtbarkeit verwendet, gilt automatisch die Paketsichtbarkeit.
 * <p>
 * public: Klasse oder Methode für jeden sichtbar
 * private: Klasse oder Methode nicht sichtbar bzw. Methode nur innerhalb der Klasse sichtbar.
 * <p>
 * Gilt auch für Felder. Private Klassen sind "autistisch".
 * <p>
 * Paketsichtbarkeit:
 * Klassen, Typen und Eigenschaften (Felder) sind für andere Klassen sichtbar im Paket.
 * Außerhalb des Pakets sind sie nicht sichtbar.
 * <p>
 * Best Practice: Die Sichtbarkeit so klein wie möglich wählen bzw. so gross wie nötig.
 * Man fängt bei private an.
 */
public class PrivatePublicPackageVisible {
    static void main(String[] args) {
        // Line.longLine();
        // Quote.quote();
        QuotePrinter.printQuote();
    }
}

class Line {
    private static void line() {
        System.out.println("---");
    }

    public static void longLine() {
        line();
        line();
    }
}

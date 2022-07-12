package java_tutorial;

// Import-Deklarationen

import java_tutorial.de.tutego.app.MyPackageDeclaration;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.List;

/**
 * Lernziel:
 * - Pakete
 * - Volle Qualifizierung vs. Import-Deklaration
 *
 * @see MyPackageDeclaration
 *
 * <p>
 * Pakete stellen logische Gruppierungen von Klassen dar. So wie Methoden zu Klassen gehören,
 * so gehören Klassen zu Paketen. Sie lassen sich auch als Namensraum betrachten, wobei der eigentliche
 * Namensraum Java für die Standardbibliothek wäre.
 * So werden auch Mehrdeutigkeiten vermieden, die sonst bei gleichnamigen Klassen auftreten könnten.
 * <p>
 * Bei einer vollen Qualifizierung stellt man den Paket- und den Klassennamen vor den Methodenaufruf.
 * Bei einer Import-Deklaration kann diese Vollqualifizierung eingespart werden.
 * Man sollte nach Möglichkeit gezielte Import-Deklarationen verwenden. Das Verwenden von *
 * bindet zu viel ein und erhöht die Gefahr von Konflikten.
 *
 * Der erzeugte Bytecode ist bei beiden Varianten gleich. Import-Deklarationen sind für die
 * Entwickler zur Erleichterung. Für die Laufzeitumgebung JVM ist die volle Qualifizierung notwendig.
 */
public class ImportDeclaration {
    public static void main(String[] args) {

        /*
        // Programm mit vollen Qualifizierungen
        System.out.println("X= ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Y= ");
        int y = new java.util.Scanner(System.in).nextInt();

        java.awt.Point point = new java.awt.Point(x, y);
        // 1. point.x/y=
        // 2. point.setLocation(x,y)
        // 3. Parameteraufruf des Punktkonstruktor

        // Distanzberechnung
        int x1 = 0;
        int x2 = 0;
        System.out.printf("Distanz zu Punkt: (%d:%d) : %f" ,x1, x2, point.distance(x1, x2));
         */

        // Programm mit Import-Deklarationen
        System.out.println("X= ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Y= ");
        int y = new Scanner(System.in).nextInt();

        Point point = new Point(x, y);
        // 1. point.x/y=
        // 2. point.setLocation(x,y)
        // 3. Parameteraufruf des Punktkonstruktor

        // Distanzberechnung
        int x1 = 0;
        int x2 = 0;
        System.out.printf("Distanz zu Punkt: (%d:%d) : %f", x1, x2, point.distance(x1, x2));

        Polygon p = new Polygon();

        // Beispiel-Konflikt bei gleichen Klassennamen
        List l;
        java.awt.List list;

        JOptionPane.showInputDialog("Eingabe");
    }
}

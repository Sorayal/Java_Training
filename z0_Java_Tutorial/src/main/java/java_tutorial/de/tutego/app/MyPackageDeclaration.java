// Package-Deklaration
package java_tutorial.de.tutego.app;

import java_tutorial.PrivatePublicPackageVisible;
import java_tutorial.util.Line;

/**
 * Lernziel:
 * - eigene Pakete deklarieren
 * - Zusammenhang Paket und Verzeichnis
 *
 * @see PrivatePublicPackageVisible
 *
 * Javapakete werden im Dateisystem des OS in Verzeichnissen abgebildet.
 * Namenskonvention für Packages: Reverse Domain Name
 * Beispiel: de.tutego
 *
 * Kompilierter Code befindet sich unter dem target-Verzeichnis.
 */
public class MyPackageDeclaration {
    public static void main(String[] args) {
        // Dies führt automatisch zu einer Import-Deklaration
        Line.line();
    }
}

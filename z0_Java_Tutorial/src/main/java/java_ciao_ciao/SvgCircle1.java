package java_ciao_ciao;

/**
 * 2.1.2 Einen SVG-Kreis auf die Konsole schreiben ★
 * 2.2.1 Auf Variablen zugreifen und Belegung ausgeben ★
 */

public class SvgCircle1 {
    public static void main(String[] args) {
        //System.out.println("<svg height='400' width='1000'><circle cx='100' cy='100' r='50' /></svg>");
        //System.out.printf("<svg height='400' width='1000'><circle cx='100' cy='100' r='50' /></svg>\n");

        System.out.print("<svg height=\"400\" width=\"1000\">\n" +
                "   <circle cx=\"100\" cy=\"100\" r=\"50\" />\n" +
                "</svg>\n");

        int x = 100, y = 110;
        double r = 20.5;

        // Ausgabe mit einer Nachkommastelle für den Radius
        System.out.printf("<svg height=\"400\" width=\"1000\">\n" +
                "   <circle cx=\"%d\" cy=\"%d\" r=\"%.1f\" />\n" +
                "</svg>\n", x, y, r);

    }
}

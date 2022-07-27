package math.math_error;

/**
 * Dieses Beispiel zeigt, wie es beim Cast von Ganzzahl auf Gleitkommazahlen zu Rundungsfehler kommt
 */

public class Rundungsfehler {

    public static void main(String[] args) {
        double erg = 1e300 + 1;
        // '1e300' ist ein double-Literal, '1' ein int-Literal, es wird also
        // implizit gecastet
        // Der Ganzzahl-Wert ist im Vergleich zu dem double-Wert aber so klein,
        // dass er 'unter den Tisch faellt'
        System.out.println( erg          );
        System.out.println( erg == 1e300 );

        // Selbst bei + 1000 ist der Wert immer noch zu klein!
        erg = 1e300 + 1000;
        System.out.println(erg == 1e300);
    }
}

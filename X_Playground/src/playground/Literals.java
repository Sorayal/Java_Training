package playground;

/**
 * Literaltypen
 * Wahrheitswerte: true, false
 * Integrale Literale: '122'
 * Fließkommaliterale: '9.999E-2', '13.578'
 * Zeichenliterale 'Y'
 * String Literale "Endor"
 * null als besonderer Referenztyp
 * @see
 */

public class Literals {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(13456);
        System.out.println(133.667);
        System.out.println(10E10);
        // Ungenauigkeit bei interner Repräsentation bei Fließkommazahlen
        System.out.println(0.1+0.1+0.1);
        System.out.println('a');
        System.out.println("\n");
        System.out.println("b");
        System.out.println("'\"");
        // Hexadezimal
        System.out.println(0x0); // 0
        System.out.println(0x9); // 9
        System.out.println(0xa); // 10
        System.out.println(0xf); // 15
        // Binär
        System.out.println(0b1010);
        System.out.println(0b1010_0001);
        System.out.println(0b1111);

    }
}

package java_tutorial;

/**
 * Zuweisungsoperator in Anweisung und Ausdruck
 * Math.random()
 * Unäres Minus und Plus
 * Arithmetik, Divisionsoperator, Restwertoperator
 * Bitmanipulation
 * Vergleiche
 * Logische Operatoren
 * Kurzschluss
 * Verbundoperator
 * Präfix und Postfix
 * Typumwandlung
 * String Konkatination
 */

public class ExpressionsOperator2 {

    public static void main(String[] args) {
        int age = 20; // Zuweisungsoperator
        System.out.println(age);
        System.out.println(age = 90);

        System.out.println(Math.random()); // Expression
        System.out.println(-(-Math.random())); // 0.0 <= random < 1.0
        System.out.println(Math.random() * 10); // 0.0 <= random < 10.0

        System.out.println(Math.floor(Math.random() * 100 + 1));

        System.out.println(-Math.random()); // Unäres Minus;
        int number = 10_000_000;
        System.out.println(number * 10_000_000); // Overflow

        System.out.println(10.0 / 3); // uses double and gives double back

        // Modulo Operator
        System.out.println("Rest: " + 10 % 3);
        System.out.println("Rest: " + 10.5 % 3);

        // Vergleichsoperatoren
        System.out.println(1 < 2);
        System.out.println(1 > 2);
        System.out.println(1 == 1);
        System.out.println(1 != 2);

        // Error at runtime
        System.out.println(3.3 == 1.1 + 1.1 + 1.1);
        //using delta values to check

        System.out.println("AND");
        System.out.println(true && true); // both need to be true for true
        System.out.println(true && false);

        System.out.println("OR");
        System.out.println(true || true);
        System.out.println(true || false);

        System.out.println("XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Negation
        System.out.println("Negation");
        System.out.println(!true);
        System.out.println(!false);

        // Kurzschluss für die Laufzeitumgebung
        System.out.println(true || true || true);

        // Eins falsch, alles falsch
        System.out.println(true && true && true);

        // Nicht Kurzschluss, die Laufzeitumgebung wird alles auswerten
        System.out.println(true | true | true);
        System.out.println(true & true & true);

        // Binäre Operationen benötigen 2 Operatoren

        double random = Math.random();
        random = random * 10;
        random *= 10; // Kurzschreibweise

        random = random + 1;
        random += 1;
        random++; // Postfix
        ++random; // Prefix


        int width = 100;
        int len = 100;
        System.out.println(width++); // System.out.println(width); width++;
        System.out.println(width);
        System.out.println(++len); // len++; System.out.println(len);
        System.out.println(len);

        // Vorrang des Operators
        System.out.println(1 + 1 * 10); // use brackets to show what will be evaluated first
        System.out.println("\n\n");


        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10
        System.out.println((int) (Math.random() * 11)); // Typanpassung 0 <= random < 10.999999 => 0 .. 10

        int nn = 99;
        System.out.println("Hello " + nn + " Welten");
        System.out.println(2 + "2" + 3 + 4); // careful: Compiler changes to concate mode after "2"
        System.out.println(2 + "2" + (nn + 1)); // fix to stay in addition after concate mode

    }
}

package java_tutorial;

/**
 * Java erlaubt es, Methoden zu überladen.
 * Die Methodennamen bleiben gleich aber die Parameterliste ändert sich.
 * @see <a href="https://docs.oracle.com/en/java/javase/index.html">Java SE Documentation</a>
 * <a href="https://docs.oracle.com/en/java/javase/16/docs/api/index.html">Java SE Documentation</a>
 */
public class OverloadedMethods {
    public static void main(String[] args) {
        // Overloaded method println and print
        System.out.println("Hello Welt");
        System.out.println(123456);
        System.out.print("Hello ");
        System.out.println("Universe");

        // printf - method
        // Zeilenumbruch
        System.out.printf("Hallo%nWelt%n");
        System.out.println("1 + 1 = 2");
        // Format Specifier like %d or %s for strings
        System.out.printf("%d + %d = %d%n", 1, 1, 2);
        String name = "Thomas";
        String date = "20.12.2030";
        int days = 4;

        // Formatted print strings
        System.out.printf("Hallo %s, heute ist der %s, es sind %d Tage vor Weihnachten", name, date, days);
        System.out.printf("%n%s %s %d","Hallo","Welt",2030);
        System.out.printf("%s %s %d", "Peter", "Welt", 2030);
    }
}

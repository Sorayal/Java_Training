package while_loops.do_while;

/**
 * Lernziel:
 * - do-while-Schleife
 * Fußgesteuerte Schleife, gut für Benutzereingaben
 */

public class DoWhileLoop {
    public static void main(String[] args) {
/*        do{
            System.out.println("Rumpf");
        }while(Math.random() > 0.1);

        int input;
        do{
            input = new java.util.Scanner(System.in).nextInt();
            System.out.println(input * 2);
        }while(input != 0);*/

        // Summierung
        int input;
        int summe = 0;
        System.out.println("Summierungsprogramm");
        do{
            System.out.println("Gebe nächste Zahl zum Summieren an: ");
            input = new java.util.Scanner(System.in).nextInt();
            summe += input;
        }while(input != 0);
        System.out.println(summe);
    }
}

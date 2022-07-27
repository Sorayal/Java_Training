package ifelse.if_demo1;

/**
 * Lernziel:
 * If-Bedingungsanweisung
 * If-Else-Statement
 */

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Bitte gib die Länge der ersten Seite an:");
        int seiteA = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte gib die Länge der zweiten Seite an:");
        int seiteB = new java.util.Scanner(System.in).nextInt();
        int flaeche = seiteA * seiteB;
        if(flaeche > 10_000){
            System.out.println(flaeche + " größer als 10.000");
            System.out.println(flaeche + " größer als 10.000");
        }
        else{
            System.out.println(flaeche + " kleiner als 10.000");
        }

//        if(Math.random() > 0.5){
//            System.out.println("Wahr");
//            System.out.println("True");
//        }
    }
}

package minmaxvalue;


import java.util.Scanner;

public class MinMaxValue {


    public static void main(String[] args) {

        //Neues Scannerobject wird kreiert.
        Scanner konsole = new Scanner(System.in);

        int ersteZahl = 0;
        int zweiteZahl = 0;

        //int zahl = 0;

        try {
            String eingabe = konsole.nextLine();

            ersteZahl = Integer.parseInt(eingabe);
            System.out.println("Umwandlung OK");

            eingabe = konsole.nextLine();
            zweiteZahl = Integer.parseInt(eingabe);
            System.out.println("Umwandlung OK");


        }
        //Laufzeitumgebung erzeugt Objekt nfe / Camel Case schreibweise
        catch (NumberFormatException nfe) {
            System.out.println("Fehler..." + nfe.getMessage());
        }
        //wird häufig als letzter Catchfall geführt.
        catch (Exception e) {
            System.out.println("Allgemeiner Fehler..." + e.getMessage());
        }

        //Code wird auf jeden Fall ausgeführt , um zum Beispiel eine Datenbank zu schliessen.
        finally {

        }


        // Für Multiplikation und Division
        try {
            long result = (long) ersteZahl * (long) zweiteZahl;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Result out of Range");
            } else {
                int resultInt = (int) result;
                System.out.println("Das Ergebnis der Multiplikation lautet " + resultInt);
            }

            if (zweiteZahl != 0 || zweiteZahl != -0) {
                System.out.println("Das Ergebnis der Division lautet " + ersteZahl / zweiteZahl);
            } else {
                System.out.println("Invalid Division");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Scanner wird wieder geschlossen, um kein Memoryleak zu verursachen
        konsole.close();

    }

}


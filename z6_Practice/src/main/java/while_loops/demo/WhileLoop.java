package while_loops.demo;

/**
 * Lernziel:
 * - while
 * - Endlosschleife
 * - Kopfgesteuert
 * - break und continue
 *
 * Syntax:
 * while (Bedingung) Anweisung
 */

public class WhileLoop {
    public static void main(String[] args) {
//        while(Math.random() > 0.1){
//            System.out.println("Rumpf");
//        }

        // Wie viele Ziffern hat eine Zahl?
        int number =  1234567;
        int digit = 0;
        while(number > 0){
            digit++;
            number /= 10;
            System.out.println(number);
        }
        System.out.println(digit);

        final int LIMIT = 100;
        int counter = 0;
        while(counter < LIMIT && Math.random() > 0.01){
            //if(counter >= LIMIT){
            //    break;
            //}
            System.out.println("Neue Zahl" + counter);
            counter++;
        }


        int number2 = 234534535;
        while(true){
            if(number2 % 1111 == 0)
                break;
            number2--;
            if(number2 % 2 == 0)
                continue;
            System.out.println(number2);
        }


/*        int number3 = 345354;
        end:
        while(true){
            int lastDigit = number % 10;
            number /= 10;
            switch(lastDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Letzte Ziffer ist kleiner 5");
                    break;
                default:
                    // Zum Ausbrechen aus der Schleife zum Label / Sprungmarke
                    break end;
            }*/

        int number3 = 375354224;
        boolean end = false;
        while(!end){
            int lastDigit = number3 % 10;
            number3 /= 10;
            switch(lastDigit){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Letzte Ziffer ist kleiner 5");
                    break;
                default:
                    // Zum Ausbrechen aus der Schleife zum Label mittels Flags
                    end = true;
            }
        }

        int counterNew = 1;
        while(counterNew < 11){
            System.out.println(counterNew);
            counterNew++;
        }

    }
}

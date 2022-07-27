package while_loops.whileloop_break_case;

public class App {
    public static void main(String[] args) {
/*        int number = 345354;
        end:
        // jump point
        while (true) {
            int lastDigit = number % 10;
            number = number / 10;
            switch (lastDigit) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Last digit is below 5");
                    break;
                default:
                    // System.out.println("Last digit is bigger than 5");
                    break end;
            }
        }*/

        int number = 345354;
        boolean end = false;

        while (!end) {
            int lastDigit = number % 10;
            number = number / 10;
            switch (lastDigit) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Last digit is below 5");
                    break;
                default:
                    // Using flag instead jump points
                    end = true;
            }
        }
    }
}

package while_break;

public class App {
    public static void main(String[] args) {

        int counter = 0;
        final int LIMIT = 100;
        while (Math.random() > 0.01) {
            if (counter >= LIMIT) {
                System.out.println("Limit exceeded!");
                break;
            }
            System.out.println(counter + ".loop Success!");
            counter++;
        }
    }
}

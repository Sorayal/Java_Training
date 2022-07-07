package inner_loop;

public class App {
    public static void main(String[] args) {

        // Works from inner loop to outer loop
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("x= " + x + " y= " + y);
            }
        }
        System.out.println("\n-------------------------\n");
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                // 3 digits width
                System.out.printf("%3d ", x * y);
            }
            // Line feed
            System.out.println();
        }
    }
}

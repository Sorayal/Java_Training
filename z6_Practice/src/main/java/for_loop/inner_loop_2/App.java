package for_loop.inner_loop_2;

public class App {
    private static final String LINE = "\n-------------------------\n";

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = x; y <= 10; y++) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }
        System.out.println(LINE);
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10 + x; y++) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }

        System.out.println(LINE);
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y += x) {
                System.out.printf("%3d ", x * y);
            }
            System.out.println();
        }

        System.out.println(LINE);
        end://Sprungmarke, die anzeigt welche For-Schleife abgebrochen werden soll
        for (int x = 1; x <= 10; x++) {
            for (int y = x; y <= 10; y++) {
                System.out.printf("%3d ", x * y);
                if(x*y==25){
                    break end; // bricht beide Schleifen ab mit Nutzung der Sprungmarke
                }
            }
            System.out.println();
        }
    }
}

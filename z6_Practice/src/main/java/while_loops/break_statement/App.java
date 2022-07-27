package while_loops.break_statement;

public class App {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i * i < 36) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n---------------------------------");
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n---------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                break;
            }
        }
    }
}

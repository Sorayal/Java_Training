package arrays;

public class PrintingNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}

// Prints it 15 times
// 0 1 2 3 0 1 2 3 4 4 0 1 2 3 4
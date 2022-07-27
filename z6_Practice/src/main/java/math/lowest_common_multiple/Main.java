package math.lowest_common_multiple;

public class Main {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 4_000;
        calculateLowestCommonMultiple(a, b);
    }

    public static void calculateLowestCommonMultiple(int a, int b) {
        long ab = (long) a * b;
        for (int i = 1; i <= ab; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.printf("The lowest common multiple is %d", i);
                return;
            }
        }
        System.out.println("No common multiple found.");
    }
}

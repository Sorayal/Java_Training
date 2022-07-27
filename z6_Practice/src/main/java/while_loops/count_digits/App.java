package while_loops.count_digits;

public class App {
    public static void main(String[] args) {
        int numberStart = 1234567;
        int number = numberStart;
        int digit = 0;

        while (number > 0) {
            digit++;
            number /= 10;
            System.out.println(number);
        }
        System.out.println(number);
        System.out.printf("This number %d has %d digits.", numberStart, digit);
    }
}

/*
    int n = ...; // n gets assigned a positive integer number

        int magic = 0;
        while (n > 0) {
        n /= 10;
        magic++;
        }

 */
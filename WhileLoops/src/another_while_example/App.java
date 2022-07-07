package another_while_example;

public class App {
    public static void main(String[] args) {
        int number = 234534535;
        while (true) {
            if (number % 1111 == 0) {
                break;
            }
            number--;
            // if even number than jump to start of while-loop
            if (number % 2 == 0) {
                continue;
            }
            System.out.println(number);
        }

    }
}

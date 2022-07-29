package arrays.generic_arraymethod;

public class Main {
    public static void main(String[] args) {
        Integer[] primes = {2, 3, 5, 7, 11, 13};
        String[] names = {"Julia", "Thomas", "Marta"};
        print(primes);
        System.out.println("\n\n");
        print(names);


    }

    public static <T> void print(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array ist null.");
        }
        for (T element : array) {
            System.out.println(element);
        }
    }
}

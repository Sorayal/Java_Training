package arrays.iterating_over_arrays;

public class CountingChar {
    public static void main(String[] args) {
        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        // Using for-each instead of for (int i = 0; i < characters.length; i++)
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"
    }
}

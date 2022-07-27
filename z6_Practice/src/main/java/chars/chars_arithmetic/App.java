package chars.chars_arithmetic;

public class App {
    public static void main(String[] args) {
        char firstChar = 'a';
        char secondChar = 'A';

        int abstand = firstChar - secondChar;
        System.out.println(abstand);

        boolean isEqual = (firstChar == secondChar)
                || (firstChar == secondChar - abstand)
                || (secondChar == firstChar - abstand);
        System.out.println(isEqual);
    }
}

package variables_init;

public class App {

    public static void main(String[] args) {
        int dogs = 8;
        int cats = 3;

        System.out.println("Dogs: " + dogs);
        System.out.println("Cats: " + cats);

        // now variable dog references to variable cats
        dogs = cats;

        System.out.println("Dogs: " + dogs);
        System.out.println("Cats: " + cats);
    }
}

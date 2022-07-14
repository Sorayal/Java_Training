package instance_of;

public class Main {
    public static void main(String[] args) {
        Main myObj = new Main();
        Student myStudent = new Student();
        // prints true. It checks if the given object is an instance of the Class
        System.out.println(myObj instanceof Main);
        //System.out.println(myStudent instanceof Main);

        String s1 = new String("TUTORIALSPOINT");
        String s2 = new String("TUTORIALSPOINT");
        //Reference comparison
        System.out.println(s1 == s2);
        //Content comparison
        System.out.println(s1.equals(s2));
        // integer-type
        System.out.println(10 == 10);
        // char-type
        System.out.println('a' == 'a');
    }
}


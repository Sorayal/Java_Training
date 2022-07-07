package instance_of;

public class Main {
    public static void main(String[] args) {
        Main myObj = new Main();
        Student myStudent = new Student();
        // prints true. It checks if the given object is an instance of the Class
        System.out.println(myObj instanceof Main);
        //System.out.println(myStudent instanceof Main);
    }
}


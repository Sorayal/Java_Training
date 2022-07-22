package methods;

// Don't delete scanner import
import java.util.Scanner;

/*
Create a full name
In the code template below, you can see a program that creates a full name from the first and last names for several people. Wouldn't it be much easier if we had a method that could do the same?

Your task is to create the method createFullName that takes firstName and lastName (in this order) and returns the full name.


Sample Input:
John
Lennon

Sample Output:
John Lennon

 */
public class CreateAFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // use this program as a source of inspiration for your method

        String firstName1 = scanner.next();
        String lastName1 = scanner.next();
        // System.out.println(firstName1 + " " + lastName1);
        System.out.println(createFullName(firstName1, lastName1));

        String firstName2 = scanner.next();
        String lastName2 = scanner.next();
        // System.out.println(firstName2 + " " + lastName2);
        System.out.println(createFullName(firstName2, lastName2));

        String firstName3 = scanner.next();
        String lastName3 = scanner.next();
        // System.out.println(firstName3 + " " + lastName3);
        System.out.println(createFullName(firstName3, lastName3));
    }

    //implement your method here
    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

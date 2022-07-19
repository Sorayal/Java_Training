package switch_statements;

import java.util.Scanner;

/*
Harry Potter
Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

if it is "gryffindor", output "bravery";
if it is "hufflepuff", output "loyalty";
if it is "slytherin", output "cunning";
if it is "ravenclaw", output "intellect";
otherwise, output "not a valid house".
The problem was taken from the course Introduction to JavaScript and React by Ken McGrady and adapted for our educational platform.


Sample Input:
gryffindor

Sample Output:
bravery

 */
public class HarryPotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "gryffindor" -> System.out.println("bravery");
            case "hufflepuff" -> System.out.println("loyalty");
            case "slytherin" -> System.out.println("cunning");
            case "ravenclaw" -> System.out.println("intellect");
            default -> System.out.println("not a valid house");
        }
    }
}

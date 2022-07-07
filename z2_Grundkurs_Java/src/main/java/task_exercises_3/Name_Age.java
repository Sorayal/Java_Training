package task_exercises_3;

import static io_tools.IOTools.*;

public class Name_Age {
    public static void main(String[] args) {
        String name = readString("Enter your name\n");
        int age = readInteger("Enter your age\n");

        System.out.printf("Your name is %s and your age is %d days.", name, age * 365);
    }
}

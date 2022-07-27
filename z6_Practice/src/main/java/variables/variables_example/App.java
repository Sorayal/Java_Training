package variables.variables_example;

public class App {
    public static void main(String[] args) {
        // Integer variable, datatype + name, the name references to a memory address
        // exists within the method as long the method runs. Will be saved on stack
        // memory, it´s called also primitive variable
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


        // Declaring variable and assign a value to it.
        int cats = 7;
        System.out.printf("Integer max value: %s\n", Integer.MAX_VALUE);
        System.out.printf("Integer min value: %s\n", Integer.MIN_VALUE);

        System.out.println("The number of cats are: " + cats);

        // 16 bit Unicode char
        char a = '\u0061';
        System.out.println(a);


        // Addition
    }
}

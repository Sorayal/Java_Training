package arrays;

/*
Creating arrays
Select four ways to create an array which can be successfully compiled.

Keep in mind, the compilation stage is not the same as the running stage.

This task may need some experiments with code.

Select one or more option from the list:
char[] array = { 'a', 'b', 'c', 'd' };
char[] array = new char[1];
char[] array = new char[0];
char[] array = new char[-1];
char[] array = new char[10000000000000];
 */
public class CreatingArrays {
    public static void main(String[] args) {
        char[] array = new char[-1];
        array[-1] = 'c';
        System.out.println(array[-1]); // NegativeArrayException

    }
}

package oop.overloading.method1;

/**
 * Simple method overloading
 */
public class OverloadingMethod {
    public static void main(String[] args) {

        System.out.println(call(0));
        System.out.println(call(200000000000L));
        System.out.println(call(2));




    }

    public static String call(int input){
        return "This is an Integer: " + input;
    }

    public static String call(short input){
        return "This is a Short: " + input;
    }

    public static String call(long input){
        return "This is a Long: " + input;
    }

    public static int calling(int input){
        return input;
    }

    public static long calling(long input){
        return input;
    }
}

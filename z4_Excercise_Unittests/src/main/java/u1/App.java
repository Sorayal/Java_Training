package u1;

public class App {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(isValid(i));
    }

    public static boolean isValid(int zahl){
        return zahl <= 10;
    }

    public static String helloMessage(){
        return "Hello";
    }
}

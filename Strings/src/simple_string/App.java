package simple_string;

public class App {
    public static void main(String[] args) {
        String str = "Jav";
        str = (str + str.charAt(1)).toLowerCase();
        // Pay attention to the brackets !
        System.out.println(str);


        // Suboperation
        String str2 = "a simple string";

        str2 = str2.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str2);
    }
}

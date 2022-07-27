package generics.practice2;

public class App {
    public static void main(String[] args) {
        String first = "Test";
        double beta = 2.0;
        System.out.println(returnResult(Double.toString(beta)));
        System.out.println(returnResult(first));



    }

    public static <T extends CharSequence> String returnResult(T choice){
        if(choice != null){
            return choice.toString();
        }
        return "Not a valid choice";
    }
}

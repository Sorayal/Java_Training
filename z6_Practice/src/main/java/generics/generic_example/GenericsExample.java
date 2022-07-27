package generics.generic_example;

/**
 * Generics sind Klassen, die mit verschiedenen Typen von Daten (Objekten) arbeiten kann.
 * https://www.programiz.com/java-programming/generics
 */

public class GenericsExample {
    public static void main(String[] args) {
        Generic<Integer>intObject = new Generic<>(99);
        Generic<String>stringObject = new Generic<>("Hello");
        System.out.println("Generic returns: " + intObject.getData());
        System.out.println("Generic 2 returns: " + stringObject.getData());
        
        Generic<String>stringObject2 = new Generic<>("Java Java");
        System.out.println("Generic returns:" + stringObject2.getData());
        int[] array1 = {2,3,4};
        int[] array2 = new int[3];


    }
}

class Generic<T>{
    // Variable of T type
    private final T data;

    public Generic(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
package arrays.arraysize;

public class ArraySize {
    public static void main(String[] args) {
        // Exception VM Limit
        //int[] array = new int[Integer.MAX_VALUE];

        //Exception HeapSpace
        //int[] array = new int[Integer.MAX_VALUE - 5];

        int[] array = new int[Integer.MAX_VALUE / 2];
        System.out.println(array.length);

    }
}


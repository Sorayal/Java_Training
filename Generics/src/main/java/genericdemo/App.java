package genericdemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List newList = new LinkedList<>();
        newList.add(new Integer(1));
        Integer i = (Integer) newList.iterator().next();

        // Generische Liste auf Integer gepolt
        List<Integer> genericList = new LinkedList<>();
        genericList.add(1);
        Integer j = genericList.iterator().next();
    }

    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
/*
    @Test
    public void givenArrayOfIntegers_thanListOfStringReturnedOK() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<String> stringList = fromArrayToList(intArray, Object::toString);

        assertThat(stringList, );
        assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
    }*/
}

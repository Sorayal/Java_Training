package generictest;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(2);
        String s = (String)list.get(0); // Type casting necessary

        List <String> stringList= new ArrayList<String>();
        stringList.add("Test");
        //stringList.add(2); not possible
        s = stringList.get(0);  // No Type casting necessary
    }
}

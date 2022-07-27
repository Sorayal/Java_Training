package equals.equalstest;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        StudentDB fromDB = new StudentDB("Sascha", "Blaubart");
        StudentAPI fromAPI = new StudentAPI("Sascha", "Blaubart");
        StudentAPI fromNull = null;

        boolean isEqual = Objects.equals(fromDB, fromAPI);
        System.out.println(isEqual);
        boolean isEqualName = Objects.equals(fromDB.getLastName(), fromAPI.getLastName());
        System.out.println(isEqualName);
        System.out.println("\n\n");
        System.out.println(fromDB.hashCode());
        System.out.println(fromAPI.hashCode());
        System.out.println("\n\n");
        System.out.println(isEqual && isEqualName);
        //System.out.println("Alter API ist leer? " + fromAPI.getAge());
        if(fromNull == null){
            System.out.println("Oh no: Null!");
        }
    }
}

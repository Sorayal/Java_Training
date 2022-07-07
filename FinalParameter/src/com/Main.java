package com;

public class Main {

    public static void main(String[] args) {

        com.Student firstStudent = new com.Student("Sascha","Bahl");
        System.out.println(firstStudent.getSurname() + " " + firstStudent.getLastName() );
        changeLastName(firstStudent, "Pyri");
        System.out.println(firstStudent.getSurname() + " " + firstStudent.getLastName() );
    }

    // The keyword final prevents here that the parameters can be reassigned again. Without final they can be
    // reassigned with new values. However for objects, it prevents that the pointer to the object will be reassigned.
    // It doesn´t prevent that the object itself will be manipulated.
    private static void changeLastName(final com.Student student, final String newLastName){
        student.setLastName(newLastName);
        //newLastName = "Hallo";
        //student = null
    }
}

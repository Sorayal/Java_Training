package if_else_test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    /**
     * If then is a statement for basic control flow. Here, a condition will be tested before
     * it executes the code below. If the condition test will fail, the control flow will take another path.
     * conditional logic (true or false)
     */
    public static void main(String[] args) throws IllegalAccessException {

        double result = Math.random();
        Boolean isAlien = false;
        if(result < 0.49){
            isAlien = true;
        }

        if(isAlien == false){
            System.out.println("It is not an alien");
        }

        if(Boolean.FALSE.equals(isAlien)){
            System.out.println("It is not an alien");
        }

        // If topScore not equal 100
        int topScore = 100;
        if(topScore != 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        /**
         * && means AND and stops if the first condition is not true. & checks always both conditions are true
         * regardless if the first condition might be not true. & works on the bit level and it´s an more advanced concept.
         */
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than the second top score and less than 100");
        }

        /**
         * OR means only one condition of an expression has to be true. OR is in code || . A bit operator is | .
         */
        if((topScore > 90) || secondTopScore <= 90){
            System.out.println("Either or both conditions are true.");
        }

        int newValue = 50;
        // Careful: Do not assign the value with =
        if(newValue == 50){
            System.out.println("This is an error");
            System.out.println("This is true now.");
        }

        /**
         * NOT Operator is also known as logical complement operator. !true means false, likewise !false means true.
         */
        boolean isCar = false;
        // The following condition is always true.
        if(isCar = true){
            System.out.println("This is not supposed to happen\n\n");
        }

        inspect(JavaTestClass.class);

        JavaTestClass java = new JavaTestClass("hans", "peter", 20);
        Field[] fields = java.getClass().getFields();
        //Method[] methods = java.getClass(java).getDeclaredMethods();

        for (int i = 0; i < fields.length; i++) {

            // get value of the fields
            Object value = fields[i].get(java);

            // print result
            System.out.println("Value of Field "
                    + fields[i].getName()
                    + " is " + value);
        }

        /*
        for (int i = 0; i <methods.length; i++){
            Object value = methods[i].getName();
        }

         */
    }

    static <T> void inspect(Class<T> klazz) {
        Field[] fields = klazz.getDeclaredFields();
        System.out.printf("%d fields:%n", fields.length);
        for (Field field : fields) {
            System.out.printf("%s %s %s%n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(),
                    field.getName()
            );
        }
    }
}

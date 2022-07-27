package strings.control_character;

/**
 * Control characters are \n for next line or \t tabulator
 * to manipulate Strings.
 */
public class App {
    public static void main(String[] args) {
        String text = "\tTo be or not to be\n\tThat is the question.";
        System.out.println(text);

        /*
         *      Select an option:
         *          1. Add an entry
         *          2. View the database
         *          3. Exit
         */
        String output = "\tSelect an option:\n\t\t1. Add an entry\n\t\t2. View the database\n\t\t3. Exit";
        System.out.println(output);

        String option = "Select an option:";
        int first = 1;
        int second = 2;
        int third = 3;
        String entry = ". Add an entry";
        String database = ". View the database";
        String exit = ". Exit";

        // Print multiline
        System.out.println("\t" + option + "\n\t\t" + first + entry + "\n\t\t" + second + database
                + "\n\t\t" + third + exit);

        // Formatted print
        System.out.printf("\t%s\n\t\t%d%s\n\t\t%d%s\n\t\t%d%s", option, first, entry, second, database, third, exit);

        System.out.println("\n\n");
        System.out.println(Menu.getInstance().getMenuText());
    }
}

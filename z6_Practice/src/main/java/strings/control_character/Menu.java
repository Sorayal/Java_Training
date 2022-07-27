package strings.control_character;

public class Menu {
    // Creating a singleton instance
    private static Menu menu = null;
    private String menutext = null;
    final String prompt = "Select an option:";
    final String option1 = "Add an entry";
    final String option2 = "View the database";
    final String option3 = "Exit";

    final int value1 = 1;
    final int value2 = 2;
    final int value3 = 3;

    public Menu() {
        menutext = "\t" + prompt + "\n";
        menutext += "\t\t" + value1 + " ." + option1 + "\n";
        menutext += "\t\t" + value2 + " ." + option2 + "\n";
        menutext += "\t\t" + value3 + " ." + option3 + "\n";
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public String getMenuText() {
        return this.menutext;
    }
}

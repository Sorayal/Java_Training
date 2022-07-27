package dependency_injection.dependency_injection_example;

public class Main {

  public static void main(String[] args) {

    // Create dependent repository for Manager
    Repository mysqlRepo = new MySQLRepository();

    // Creates a new instance of Manager which has the dependency Repository
    Manager manager = new Manager(mysqlRepo);

    // Calls method from manager instance and prints the return value.
    String input = manager.Load();
    System.out.println(input);
  }
}

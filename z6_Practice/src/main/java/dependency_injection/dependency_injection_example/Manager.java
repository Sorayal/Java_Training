package dependency_injection.dependency_injection_example;

import java.util.Locale;

public class Manager {

  /**
   * Binds dependency Repository into Manager
   */
  //private final RepositoryImpl repository;    //Verwendungsabhängigkeit, gegen eine Implementierung
  private final Repository repository;  // Abhängigkeit von einer konkreten Implementierung aufgehoben

  public Manager(Repository repository) {
    //this.repository = new Repository();   // Erzeugungsabhängigkeit
    //this.repository = new MongoRepository();
    //this.repository = new MySQLRepository();   // Austauschbar mit Hilfe des Contracts / Interface
    this.repository = repository; // Erzeugungsabhängigkeit wird herausgenommen
  }

  public String Load() {
    String input = repository.Load();     //Verwendungsabhängigkeit
    return input.toUpperCase(Locale.ROOT);

  }
}

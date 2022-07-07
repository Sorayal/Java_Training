package dependency_injection_example;

public class MySQLRepository implements Repository{

  /**
   * Simulates DB access
   * @return String
   */
  public String Load(){
    return "mysql";
  }
}

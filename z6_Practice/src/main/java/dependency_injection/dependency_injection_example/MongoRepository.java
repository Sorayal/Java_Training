package dependency_injection.dependency_injection_example;

public class MongoRepository implements Repository{

  @Override
  public String Load() {
    return "mongo";
  }
}

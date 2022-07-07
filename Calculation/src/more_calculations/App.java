package more_calculations;

public class App {

  public static void main(String[] args) {
    double personHeight = 1.67;

    // 7 would be magic number here which is not good
    // It´s not clear where 7 would come from or which context
    // it has.
    System.out.println(personHeight * 7);

    int numberOfPeople = 7;
    double totalHeight = personHeight * numberOfPeople;
    double flagPoleHeight = 2.0;
    // Formatted print
    System.out.printf("Total personHeight with %s people is: %s \n", numberOfPeople, totalHeight);
    System.out.printf("The total height plus flag pole height is %s", totalHeight + flagPoleHeight);
  }
}

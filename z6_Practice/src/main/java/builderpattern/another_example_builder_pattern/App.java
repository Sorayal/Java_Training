package builderpattern.another_example_builder_pattern;

public class App {
    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts.Builder(250,8).build();
    }
}

package keyword_final.effectivly_final;

public interface FunctionalInterface {
    void testEffectivelyFinal();

    default void test() {
        int effectivelyFinalInt = 10;
        FunctionalInterface functionalInterface
                = () -> System.out.println("Value of effectively variable is : " + effectivelyFinalInt);
    }
}
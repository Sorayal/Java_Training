package unittest_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * JUnit Jupiter
 * Don´t forget to add the dependency at the build file.
 * https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/
 *
 */

public class ExampleTest {
    @Test
    void shouldShowSimpleAssertion() {
        Assertions.assertEquals(1,1);
        Assertions.assertEquals(1,1);
    }



    @Test
    @DisplayName("This is another simple assertion")
    void anotherSimpleAssertion() {
        Assertions.assertEquals(2.0,4.0,2.0);
    }

    @Test
    @DisplayName("Not implemented Test")
    void shouldCheckItems(){
        fail("Not implemented yet");
    }

    /**
     * Assert multiple values
     */
    @Test
    @DisplayName("Should check all items in the list")
    void shouldCheckAllItemsInTheList() {
        List<Integer> numbers = List.of(2, 3, 5, 1);
        Assertions.assertAll(() -> Assertions.assertEquals(2, numbers.get(0)),
                () -> Assertions.assertEquals(3, numbers.get(1)),
                () -> Assertions.assertEquals(5, numbers.get(2)),
                () -> Assertions.assertEquals(0, numbers.get(3)));
    }

    /**
     * When the criteria is not met, the test will be ignored
     */
    @Test
    @DisplayName("Should only run the test if some criteria are met")
    void shouldOnlyRunTheTestIfSomeCriteriaAreMet() {
        Assumptions.assumeTrue(Fixture.apiVersion() < 10);
        Assertions.assertEquals(1, 1);
    }
}

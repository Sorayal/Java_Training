package u1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AppTest {

    @Nested
    class IntegerIsValid {

        @Test
        void returnFalseForIsValid() {
            // given
            int i = 20;

            // when
            boolean isValid = App.isValid(i);

            // then
            assertFalse(isValid);
        }
    }

    @Nested
    class MessageTest{

        @Test
        void returnHello(){
            // given
            String expected = "Hello";

            // when
            String message = App.helloMessage();

            // then
            assertEquals(expected, message);
        }
    }
}
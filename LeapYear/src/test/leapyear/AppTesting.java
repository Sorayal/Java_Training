package leapyear;

import static leapyear.App.checkIfLeap;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTesting {

    @org.junit.jupiter.api.Test
    void shouldReturnTrueIfLeap() {
        // given
        int year = 2016;

        // when
        boolean result = checkIfLeap(year);

        // then
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnFalseIfNotLeap() {
        // given
        int year2 = 2100;
        int year3 = 1900;

        // when
        boolean result = checkIfLeap(year2);
        boolean result2 = checkIfLeap(year3);

        // then
        assertFalse(result);
        assertFalse(result2);
    }
}
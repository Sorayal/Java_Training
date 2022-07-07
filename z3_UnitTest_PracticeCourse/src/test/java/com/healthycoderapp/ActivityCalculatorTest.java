package com.healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

// Part of TDD - Test Driven Development where unit tests will be written at first to fail
class ActivityCalculatorTest {

    @Test
    void shouldReturnBadWhenAvgBelow20() {
        // given
        int weeklyCardioMin = 40;
        int weeklyWorkouts = 1;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMin, weeklyWorkouts);

        // then
        assertEquals("bad", actual);
    }

    @Test
    void shouldReturnAverageWhenAvgBetween20And40() {
        // given
        int weeklyCardioMin = 40;
        int weeklyWorkouts = 3;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMin, weeklyWorkouts);

        // then
        assertEquals("average", actual);
    }

    @Test
    void shouldReturnGoodWhenAvgAbove40() {
        // given
        int weeklyCardioMin = 40;
        int weeklyWorkouts = 7;

        // when
        String actual = ActivityCalculator.rateActivityLevel(weeklyCardioMin, weeklyWorkouts);

        // then
        assertEquals("good", actual);
    }

    @Test
    void shouldThrowExceptionWHenInputBelowZero() {
        // given
        int weeklyCardioMin = -40;
        int weeklyWorkouts = 7;

        // when
        Executable executable = () -> ActivityCalculator.rateActivityLevel(weeklyCardioMin, weeklyWorkouts);

        // then
        assertThrows(RuntimeException.class, executable);
    }
}
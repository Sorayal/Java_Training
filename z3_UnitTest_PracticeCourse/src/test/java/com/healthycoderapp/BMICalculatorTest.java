package com.healthycoderapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class BMICalculatorTest {

    private String environment = "dev";
    // private String environment = "prod";


    // For starting servers or connections to databases
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all unit tests.");
    }

    // for closing database connections etc.
    @AfterAll
    static void afterAll() {
        System.out.println("After all unit tests.");
    }

    // Nested is a way to organize the test methods better in inner classes
    @Nested
    class isDietRecommendedTests {
        @ParameterizedTest
        @ValueSource(doubles = {89.0, 95.0, 110.0})
            // The values of the value source will be injected there
        void shouldReturnTrueWhenDietIsRecommended(Double coderWeight) {
            // given - Arrange
            // double weight = 89.0;
            double weight = coderWeight;
            double height = 1.72;

            // when - Act
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            // then - Assert
            assertTrue(recommended);

        }

        // Three test cases with comma seperated values
        @ParameterizedTest(name = "weight={0}, height={1}")
        @CsvSource(value = {"89.0, 1.72", "95.0, 1.75 ", "110.0, 1.78"})
        // The values of the value source will be injected there
        void shouldReturnTrueWhenDietIsRecommendedCsv(Double coderWeight, Double coderHeight) {
            // given - Arrange
            // double weight = 89.0;
            double weight = coderWeight;
            double height = coderHeight;

            // when - Act
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            // then - Assert
            assertTrue(recommended);
        }

        // Parameterized tests with external csv file
        @ParameterizedTest(name = "weight={0}, height={1}")
        // Header line should be skipped
        @CsvFileSource(resources = "/diet-recommended-input-data.csv", numLinesToSkip = 1)
        // The values of the value source will be injected there
        void shouldReturnTrueWhenDietIsRecommendedExCsv(Double coderWeight, Double coderHeight) {
            // given - Arrange
            // double weight = 89.0;
            double weight = coderWeight;
            double height = coderHeight;

            // when - Act
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            // then - Assert
            assertTrue(recommended);
        }

        @org.junit.jupiter.api.Test
        void shouldReturnFalseWhenDietIsNotRecommended() {
            // given - Arrange
            double weight = 50.0;
            double height = 1.92;

            // when - Act
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            // then - Assert
            assertFalse(recommended);
        }
    }

    @Nested
    @DisplayName("{{}} sample inner class display name")
    class FindCoderWithWorstBMITests {
        @org.junit.jupiter.api.Test
        @DisabledOnOs(OS.WINDOWS)
        void shouldThrowArithmeticExceptionWhenHeightIsNotValid() {
            // given - Arrange
            double weight = 50.0;
            double height = 0.00;

            // when
            Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

            // then
            assertThrows(ArithmeticException.class, executable);
        }


        @org.junit.jupiter.api.Test
        // Customized Name
        @DisplayName(">>>> sample method display name")
        // Disables unit-test without an error
        @Disabled
        void shouldReturnCoderWithWorstBMIWhenCoderListIsNotEmpty() {
            // given
            List<Coder> coders = new ArrayList<Coder>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.82, 98.0));
            coders.add(new Coder(1.80, 64.7));

            // when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            // then - Combine Asserts to make sure that they are tested as whole
            // it makes no sense to test only for one value
            assertAll(
                    () -> assertEquals(1.82, coderWorstBMI.getHeight()),
                    () -> assertEquals(98.0, coderWorstBMI.getWeight())
            );
        }

        // This test shows if a method is in within a time limit.
        @Test
        void shouldReturnCoderWithWorstBMIIn1MsWhenCoderListHas10000Elements() {
            // given
            // if it´s not true the test will be skipped simply.
            assumeTrue(BMICalculatorTest.this.environment.equals("prod"));
            List<Coder> coders = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                coders.add(new Coder(1.0 + i, 10.0 + i));
            }

            // when
            Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

            // then, no longer than 500 ms
            assertTimeout(Duration.ofMillis(500), executable);
        }

        @org.junit.jupiter.api.Test
        void shouldReturnNullWithWorstBMIWhenCoderListIsEmpty() {
            // given
            List<Coder> coders = new ArrayList<Coder>();

            // when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            // then
            assertNull(coderWorstBMI);
        }
    }

    @Nested
    class GetBMIScoresTests {
        @org.junit.jupiter.api.Test
        void shouldReturnCorrectBMIScoreArrayWhenCoderListIsNotEmpty() {
            // given
            List<Coder> coders = new ArrayList<Coder>();
            coders.add(new Coder(1.80, 60.0));
            coders.add(new Coder(1.82, 98.0));
            coders.add(new Coder(1.82, 64.7));
            double[] expected = {18.52, 29.59, 19.53};

            // when
            double[] bmiScores = BMICalculator.getBMIScores(coders);

            // then - AssertEquals fails because it checks besides values if it would be the same object reference too
            assertArrayEquals(expected, bmiScores);
        }
    }
}
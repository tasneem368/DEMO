package com.scrolltest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CombinedOperationsTest {

    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "-10, -5, -5",
            "10, -5, 15",
            "10.5, 5.2, 5.3",
            "0, 0, 0",
            "5, 10, -5",
            "-5, 10, -15",
            "5, -10, 15",
            "-5, -10, 5"
    })
    public void subtractionOperations(double a, double b, double expected) {
        CombinedOperations operations = new CombinedOperations();
        double tolerance = 0.0001;

        double result = operations.subtract(a, b);
        assertEquals(expected, result, tolerance, a + " - " + b + " should equal " + expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, 8",
            "-5, -3, -8",
            "5, -3, 2",
            "5.5, 3.2, 8.7"
    })
    public void additionOperations(double a, double b, double expected) {
        CombinedOperations operations = new CombinedOperations();

        double result = operations.add(a, b);
        assertEquals(expected, result, a + " + " + b + " should equal " + expected);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 3, 12",
            "-4, -3, 12",
            "4, -3, -12",
            "4.5, 2.0, 9.0"
    })
    public void multiplicationOperations(double a, double b, double expected) {
        CombinedOperations operations = new CombinedOperations();

        double result = operations.multiply(a, b);
        assertEquals(expected, result, a + " * " + b + " should equal " + expected);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "-10, -2, 5",
            "10, -2, -5",
            "10.5, 2.0, 5.25"
    })
    public void divisionOperations(double a, double b, double expected) {
        CombinedOperations operations = new CombinedOperations();

        double result = operations.divide(a, b);
        assertEquals(expected, result, a + " / " + b + " should equal " + expected);
    }

    @Test
    public void divisionByZero() {
        CombinedOperations operations = new CombinedOperations();

        assertThrows(IllegalArgumentException.class, () -> {
            operations.divide(10, 0);
        }, "Division by zero should throw IllegalArgumentException");
    }
}

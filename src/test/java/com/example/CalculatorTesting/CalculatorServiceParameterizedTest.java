package com.example.CalculatorTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "5, 5, 10",
            "10, 5, 15",
            "-5, 5, 0"
    })
    public void testPlus(int num1, int num2, int expected) {
        assertEquals(num1 + " + " + num2 + " = " + expected, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 0",
            "10, 5, 5",
            "-5, 5, -10"
    })
    public void testMinus(int num1, int num2, int expected) {
        assertEquals(num1 + " − " + num2 + " = " + expected, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 25",
            "10, 5, 50",
            "-5, 5, -25"
    })
    public void testMultiply(int num1, int num2, int expected) {
        assertEquals(num1 + " * " + num2 + " = " + expected, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 1",
            "10, 5, 2",
            "-5, 5, -1"
    })
    public void testDivide(int num1, int num2, int expected) {
        assertEquals(num1 + " / " + num2 + " = " + expected, calculatorService.divide(num1, num2));
    }
}

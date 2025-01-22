package com.example.CalculatorTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testPlus() {
        assertEquals("5 + 5 = 10", calculatorService.plus(5, 5));
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            calculatorService.plus(5, null);
        });
    }

    @Test
    public void testMinus() {
        assertEquals("8 − 5 = 3", calculatorService.minus(8, 5));
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            calculatorService.minus(5, null);
        });
    }

    @Test
    public void testMultiply() {
        assertEquals("5 * 5 = 25", calculatorService.multiply(5, 5));
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            calculatorService.multiply(5, null);
        });
    }

    @Test
    public void testDivide() {
        assertEquals("5 / 5 = 1", calculatorService.divide(5, 5));
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            calculatorService.divide(5, null);
        });
    }

    @Test
    public void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(5, 0);
        });
        assertEquals("Делить на 0 нельзя", exception.getMessage());
    }
}

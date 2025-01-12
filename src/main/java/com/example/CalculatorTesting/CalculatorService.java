package com.example.CalculatorTesting;

public class CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введены не все числа.");
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введены не все числа.");
        }
        int result = num1 - num2;
        return num1 + " − " + num2 + " = " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введены не все числа.");
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Введены не все числа");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}

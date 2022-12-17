package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] expression = new String[3];

    public void setExpression(String expression) {
        this.expression = expression.split(" ");
    }

    public int calc() {
        return switch (expression[1].charAt(0)) {
            case '+' -> Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
            case '-' -> Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
            case '*' -> Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
            case '/' -> Integer.parseInt(expression[0]) / Integer.parseInt(expression[2]);
            case '%' -> Integer.parseInt(expression[0]) % Integer.parseInt(expression[2]);
            case '^' -> (int) Math.pow(Integer.parseInt(expression[0]), Integer.parseInt(expression[2]));
            default -> {
                System.out.println("Вам нужен другой калькулятор");
                yield 0;
            }
        };
    }
}
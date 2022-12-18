package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String[] expression = new String[3];

    public static void setExpression(String expression) {
        Calculator.expression = expression.split(" ");
    }

    public static int calc() {
        try {
            if(Integer.parseInt(expression[0]) < 0 || Integer.parseInt(expression[2]) < 0) {
                System.out.println("Вы ввели некорректные данные, отрицательные числа");
                return  0;
            }
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
        } catch (RuntimeException e) {
            System.out.println("Вы ввели некорректные данные. Числа должны быть целыми, между числами " +
                    "и знаком операции необходим пробел");
            return  0;
        }
    }
}
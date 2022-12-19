package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calc(String ex) {
        String[] expression = ex.split(" ");
        try {
            int num1 = Integer.parseInt(expression[0]);
            int num2 = Integer.parseInt(expression[2]);
            if (num1 < 0 || num2 < 0) {
                System.out.println("Вы ввели некорректные данные, отрицательные числа");
                return 0;
            }
            return switch (expression[1].charAt(0)) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default -> {
                    System.out.println("Вам нужен другой калькулятор");
                    yield 0;
                }
            };
        } catch (RuntimeException e) {
            System.out.println("Вы ввели некорректные данные. Числа должны быть целыми, между числами " +
                    "и знаком операции необходим пробел");
            return 0;
        }
    }
}
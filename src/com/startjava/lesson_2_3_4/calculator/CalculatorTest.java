package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение:");
                calculator.setExpression(sc.nextLine());
                System.out.println(calculator.calc());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();
        }
    }
}
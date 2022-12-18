package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner sc = new Scanner(System.in);
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение:");
                System.out.println(Calculator.calc(sc.nextLine()));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = sc.nextLine();
        }
    }
}
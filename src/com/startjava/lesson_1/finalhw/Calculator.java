package com.startjava.lesson_1.finalhw;

public class Calculator {

    public static void main(String[] args) {
        char sign  = '^';
        float num1 = 2;
        float num2 = 3;
        float result = 1;

        if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if(sign == '*') {
            result = num1 * num2;
        } else if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '%') {
            result = num1 % num2;
        } else if(sign == '^') {
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else {
            System.out.println("Вам нужен другой калькулятор");
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
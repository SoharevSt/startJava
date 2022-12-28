package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;

    private int points;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean addNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("Вы ввели число, не входящее в дипазон (0, 100]. Введите число из диапазона.");
            return true;
        }
        numbers[attempt] = number;
        attempt++;
        return false;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints() {
        points++;
    }
}
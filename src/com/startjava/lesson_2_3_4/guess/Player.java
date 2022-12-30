package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int LOWER_RANGE_LIMIT = 1;
    public static final int UPPER_RANGE_LIMIT = 100;
    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;
    private int wins;

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
        if (number < LOWER_RANGE_LIMIT || number > UPPER_RANGE_LIMIT) {
            System.out.println("Вы ввели число, не входящее в диапазон (0, 100]. Введите число из диапазона.");
            return false;
        }
        numbers[attempt] = number;
        attempt++;
        return true;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getWins() {
        return wins;
    }

    public void setWins() {
        wins++;
    }
}
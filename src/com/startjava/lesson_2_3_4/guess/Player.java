package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;

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

    public void addNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clearAttempts(int index) {
        Arrays.fill(numbers, 0, index, 0);
        attempt = 0;
    }
}
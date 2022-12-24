package com.startjava.lesson_2_3_4.guess;

public class Player {

    private final String name;
    private final int[] playerNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public void setPlayerNumber(int playerNumber, int index) {
        playerNumbers[index] = playerNumber;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
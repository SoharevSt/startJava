package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100) + 1;
        player1.resetNumbers(player1.getAttempt());
        player2.resetNumbers(player2.getAttempt());
        player1.setAttempt(0);
        player2.setAttempt(0);
        while (stopAttempt(player2)) {
            System.out.println("Игрок " + player1.getName() + " введите число:");
            int number = sc.nextInt();
            if (checkNumber(player1, number)) {
                break;
            }
            stopAttempt(player1);
            System.out.println("Игрок " + player2.getName() + " введите число:");
            number = sc.nextInt();
            if (checkNumber(player2, number)) {
                break;
            }
        }
    }

    private boolean stopAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            printNumbers(player);
            return false;
        }
        return true;
    }

    private boolean checkNumber(Player player, int number) {
        player.setNumber(number, player.getAttempt());
        player.setAttempt(player.getAttempt() + 1);
        if (number == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c " +
                    player.getAttempt() + " попытки");
            printNumbers();
            return true;
        }
        if (number > secretNumber) {
            System.out.println("Число " + number + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + number + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers() {
        for (int i : player1.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : player2.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void printNumbers(Player player) {
        for (int i : player.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
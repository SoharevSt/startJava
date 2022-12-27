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
        player1.clearAttempts(player1.getAttempt());
        player2.clearAttempts(player2.getAttempt());
        do {
            System.out.println("Игрок " + player1.getName() + " введите число:");
            player1.addNumber(sc.nextInt());
            if (checkNumber(player1)) {
                printNumbers(player1);
                printNumbers(player2);
                break;
            }
            if (hasAttempts(player1)) {
                printNumbers(player1);
            }
            System.out.println("Игрок " + player2.getName() + " введите число:");
            player2.addNumber(sc.nextInt());
            if (checkNumber(player2)) {
                printNumbers(player1);
                printNumbers(player2);
                break;
            }
            if (hasAttempts(player2)) {
                printNumbers(player2);
                break;
            }
        } while (true);
    }

    private boolean hasAttempts(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c " +
                    player.getAttempt() + " попытки");
            return true;
        }
        if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers(Player player) {
        for (int i : player.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
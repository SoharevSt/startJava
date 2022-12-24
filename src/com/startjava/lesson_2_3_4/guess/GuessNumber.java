package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        secretNumber = ((int) (Math.random() * 100) + 1);
        player1.setAttempt(0);
        player2.setAttempt(0);
        while (ifTenAttempt(player2)) {
            System.out.println("Игрок " + player1.getName() + " введите число:");
            int number = sc.nextInt();
            player1.setPlayerNumber(number, player1.getAttempt());
            player1.setAttempt(player1.getAttempt() + 1);
            if (checkNumber(player1, number)) {
                printNumbers();
                break;
            }
            ifTenAttempt(player1);
            System.out.println("Игрок " + player2.getName() + " введите число:");
            number = sc.nextInt();
            player2.setPlayerNumber(number, player2.getAttempt());
            player2.setAttempt(player2.getAttempt() + 1);
            if (checkNumber(player2, number)) {
                printNumbers();
                break;
            }
        }
    }

    private boolean ifTenAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    private boolean checkNumber(Player player, int playerNumber) {
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c " +
                    player.getAttempt() + " попытки");
            return true;
        }
        if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumbers() {
        System.out.print(Arrays.toString(Arrays.copyOf(player1.getPlayerNumbers(), player1.getAttempt())) + "\n");
        System.out.print(Arrays.toString(Arrays.copyOf(player2.getPlayerNumbers(), player2.getAttempt())) + "\n");
        Arrays.fill(player1.getPlayerNumbers(), player1.getAttempt());
        Arrays.fill(player2.getPlayerNumbers(), player2.getAttempt());
    }
}
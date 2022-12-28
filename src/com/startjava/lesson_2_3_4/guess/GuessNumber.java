package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int secretNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void play() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Раунд " + (i + 1));
            selectQueue();
            round();
        }

        if (players[0].getPoints() > players[1].getPoints() && players[0].getPoints() > players[2].getPoints()) {
            System.out.println("Игрок " + players[0].getName() + " победил");
        } else if (players[1].getPoints() > players[0].getPoints() && players[1].getPoints() > players[2].getPoints()) {
            System.out.println("Игрок " + players[1].getName() + " победил");
        } else if (players[2].getPoints() > players[0].getPoints() && players[2].getPoints() > players[1].getPoints()) {
            System.out.println("Игрок " + players[2].getName() + " победил");
        } else {
            System.out.println("Победителей нет");
        }
    }

    private void selectQueue() {
        for (int i = players.length - 1; i >= 0; i--) {
            int random = (int) (Math.random() * players.length);
            Player temp = players[random];
            players[random] = players[i];
            players[i] = temp;
        }
    }

    private void round() {
        Scanner sc = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100) + 1;
        for (Player p : players) {
            p.clearAttempts();
        }
        boolean isWin = false;
        int attempts = 0;
        while (!isWin && attempts < 10) {
            for (Player p : players) {
                do {
                    System.out.println("Игрок " + p.getName() + " введите число:");
                } while (p.addNumber(sc.nextInt()));
                if (checkNumber(p)) {
                    isWin = true;
                    break;
                }
                hasAttempts(p);
            }
            attempts++;
        }
        for (Player p : players) {
            printNumbers(p);
        }
    }

    private void hasAttempts(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
    }

    private boolean checkNumber(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c " +
                    player.getAttempt() + " попытки");
            player.addPoints();
            return true;
        }
        System.out.print("Число " + player.getNumber());
        System.out.println(player.getNumber() > secretNumber ? " больше того, что загадал компьютер" :
                " меньше того, что загадал компьютер");
        return false;
    }

    private void printNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + ": ");
        for (int i : player.getNumbers()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
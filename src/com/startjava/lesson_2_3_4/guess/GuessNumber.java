package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    public static final int ROUNDS = 3;
    private final Player[] players;
    private int secretNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void playGame() {
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Раунд " + (i + 1));
            castLots();
            playRound();
        }
        selectWinner();
    }

    private void castLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            int random = (int) (Math.random() * players.length);
            Player temp = players[random];
            players[random] = players[i];
            players[i] = temp;
        }
    }

    private void playRound() {
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
                } while (!p.addNumber(sc.nextInt()));
                if (checkNumber(p)) {
                    isWin = true;
                    break;
                }
                hasAttempts(p);
            }
            attempts++;
        }
        printNumbers();
    }

    private void selectWinner() {
        Player winner = null;
        for (Player p : players) {
            if (p.getWins() > 1) {
                winner = p;
                break;
            }
        }
        if (winner == null) {
            int num = 0;
            for (Player p : players) {
                if (p.getWins() == 1) {
                    winner = p;
                    num++;
                }
            }
            if (num != 1) {
                winner = null;
            }
        }
        System.out.println(winner == null ? "Победителей нет" : "Игрок " + winner.getName() + " победил");
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
            player.setWins();
            return true;
        }
        System.out.print("Число " + player.getNumber());
        System.out.print(player.getNumber() > secretNumber ? " больше " : " меньше ");
        System.out.println("того, что загадал компьютер");
        return false;
    }

    private void printNumbers() {
        for (Player p : players) {
            System.out.print("Игрок " + p.getName() + ": ");
            for (int i : p.getNumbers()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
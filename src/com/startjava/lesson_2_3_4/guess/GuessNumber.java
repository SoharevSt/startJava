package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private static final int ROUNDS = 3;
    private static final int ATTEMPTS = 10;
    private final Player[] players;
    private int secretNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void gameLaunch() {
        castLots();
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Раунд " + i);
            playRound();
        }
        findWinner();
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int random = (int) (Math.random() * (i + 1));
            Player temp = players[random];
            players[random] = players[i];
            players[i] = temp;
        }
    }

    private void playRound() {
        secretNumber = (int) (Math.random() * 100) + 1;
        for (Player p : players) {
            p.clearAttempts();
        }
        boolean isWin = false;
        int attempts = 0;
        while (!isWin && attempts < ATTEMPTS) {
            for (Player p : players) {
                numberEntry(p);
                if (isGuessed(p)) {
                    isWin = true;
                    break;
                }
                hasAttempts(p);
            }
            attempts++;
        }
        printPlayersAttempts();
    }

    private static void numberEntry(Player p) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Игрок " + p.getName() + " введите число:");
        } while (!p.addNumber(sc.nextInt()));
    }

    private boolean isGuessed(Player player) {
        if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c " +
                    player.getAttempt() + " попытки");
            player.upWins();
            return true;
        }
        System.out.println("Число " + player.getNumber() + (player.getNumber() > secretNumber ? " больше " :
                " меньше ") + "того, что загадал компьютер");
        return false;
    }

    private void hasAttempts(Player player) {
        if (player.getAttempt() == ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
    }

    private void printPlayersAttempts() {
        for (Player p : players) {
            System.out.print("Игрок " + p.getName() + ": ");
            for (int i : p.getNumbers()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private void findWinner() {
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
}
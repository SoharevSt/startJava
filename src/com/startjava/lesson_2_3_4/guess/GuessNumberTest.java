package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Игрок " + (i + 1) + " введите свое имя");
            players[i] = new Player(sc.nextLine());
        }
        System.out.println("У каждого игрока по 10 попыток угадать число");
        GuessNumber guessNumber = new GuessNumber(players);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                guessNumber.play();
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = sc.nextLine();
        }
    }
}
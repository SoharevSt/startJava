package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игрок 1 введите свое имя");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Игрок 2 введите свое имя");
        Player player2 = new Player(sc.nextLine());
        System.out.println("У каждого игрока по 10 попыток угадать число");

        GuessNumber guessNumber = new GuessNumber(player1, player2);
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
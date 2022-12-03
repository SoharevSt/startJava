package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Игрок 1 введите свое имя");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Игрок 2 введите свое имя");
        Player player2 = new Player(sc.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "";
        while (!answer.equals("no")) {
            guessNumber.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]\n");
                answer = sc.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
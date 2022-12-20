package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scn.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scn.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        System.out.println("У каждого игрока по 10 попыток");
        do {
            game.start();
        } while (isNext(scn));
    }

    private static boolean isNext(Scanner scn) {
        String answer;
        do {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = scn.nextLine();
        } while (!"yes".equals(answer) && !"no".equals(answer));
        return "yes".equals(answer);
    }
}
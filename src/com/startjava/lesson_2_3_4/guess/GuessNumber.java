package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private final Player player1;
    private final Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNum = generateRandomNum();
        boolean isEndGame;
        do {
            isEndGame = isGuessed(player1);
            if (!isEndGame) {
                isEndGame = isGuessed(player2);
                if (player1.getNumberAttempt() == 10) {
                    System.out.println("У игрока " + player1.getName() + " закончились попытки");
                    break;
                }
            }
        } while (!isEndGame);
        System.out.println("Игрок " + player1.getName() + " называл числа:");
        printAttemptNumber(player1);
        System.out.println("Игрок " + player2.getName() + " называл числа:");
        printAttemptNumber(player2);
        player1.clearAttempts();
        player2.clearAttempts();

    }

    private int generateRandomNum() {
        secretNum = (int) (Math.random() * END_RANGE + START_RANGE);
        return secretNum;
    }

    private int inputNumber(Player player) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " угадывает число");
        return scn.nextInt();
    }

    private boolean isGuessed(Player player) {
        int playerNum = inputNumber(player);
        player.addAttempt(playerNum);
        if (playerNum == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " c "
                    + player.getNumberAttempt() + " попытки");
            return true;
        }
        if (playerNum > secretNum) {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " меньше того, что загадал компьютер");
        }
        return false;
    }
    public void printAttemptNumber(Player player) {
        for (int number : player.getAttempts()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
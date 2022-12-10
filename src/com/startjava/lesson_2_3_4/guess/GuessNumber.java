package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final int startRange = 1;
    private final int endRange = 100;
    private Player player1;
    private Player player2;
    private int randomNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        randomNum = generateRandomNum();
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

    }

    public void printAttemptNumber(Player player) {
        for (int number : player.getAttempts()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private int generateRandomNum() {
        int difference = endRange - startRange;
        Random random = new Random();
        randomNum = random.nextInt(difference + 1);
        randomNum += startRange;
        return randomNum;
    }

    private int inputNumber(Player player) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " угадывает число");
        return scn.nextInt();
    }

    private boolean isGuessed(Player player) {
        int playerNum = inputNumber(player);
        player.addNextAttempt(playerNum);
        if (playerNum == randomNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " c "
                    + player.getNumberAttempt() + " попытки");
            return true;
        }
        if (playerNum > randomNum) {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " меньше того, что загадал компьютер");
        }
        return false;
    }
}
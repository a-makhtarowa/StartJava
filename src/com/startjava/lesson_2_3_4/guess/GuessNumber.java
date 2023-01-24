package com.startjava.lesson_2_3_4.guess;

import java.util.*;

public class GuessNumber {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private final Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        castLots();
        System.out.println("Порядок играющих определен:");
        for (Player player : players) {
            System.out.print(player.getName() + "; ");
        }
        System.out.println();
            for (int i = 0; i < 3; i++) {
                int secretNumber = generateRandomNumber();
                boolean stopGame = false;
                do {
                    for (Player player : players) {
                        if (player.getNumberAttempt() == 10) {
                            System.out.println("У игрока " + player.getName() + " закончились попытки");
                            stopGame = true;
                            break;
                        }
                        stopGame = isGuessed(player, secretNumber);
                        if (stopGame) {
                            break;
                        }
                    }
                } while (!stopGame);
                for (Player player : players) {
                    System.out.println("Игрок " + player.getName() + " называл числа:");
                    printAttemptNumber(player);
                    player.clearAttempts();
                }
            }
        String nameMaxWinPlayer = players[0].getName();
        int numberMaxWinPlayer = players[0].getNumberWin();
        for (int i = 1; i < players.length; i++) {
            if (numberMaxWinPlayer > players[i].getNumberWin()) {
                numberMaxWinPlayer = players[i].getNumberWin();
                nameMaxWinPlayer = players[i].getName();
            }
        }
        System.out.println("По результатам трех раундов победителем является:");
        System.out.println(nameMaxWinPlayer);
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * END_RANGE + START_RANGE);
    }

    private void castLots() {
        for (int i = 0; i < players.length; i++) {
            int j = (int) (Math.random() * (players.length - 1));
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private boolean isGuessed(Player player, int secretNumber) {
        int playerNum = inputNumber(player);
        if (playerNum == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c "
                    + player.getNumberAttempt() + " попытки");
            player.win();
            return true;
        } else {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    (playerNum > secretNumber ? " больше " : " меньше ") + "того, что загадал компьютер");
            return false;
        }
    }

    private int inputNumber(Player player) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " угадывает число");
        while (true) {
            try {
                int playerNum = scn.nextInt();
                player.setAttempt(playerNum);
                return playerNum;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Введите число еще раз:");
            }
        }
    }

    public void printAttemptNumber(Player player) {
        for (int number : player.getAttempts()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
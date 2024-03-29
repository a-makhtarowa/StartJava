package com.startjava.lesson_2_3_4.guess;

import java.util.*;

public class GuessNumber {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int NUMBER_OF_ATTEMPTS = 10;
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
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int secretNumber = generateSecretNumber();
            boolean finishedGame = false;
            do {
                for (Player player : players) {
                    if (player.getNumberAttempt() == NUMBER_OF_ATTEMPTS) {
                        System.out.println("У игрока " + player.getName() + " закончились попытки");
                        finishedGame = true;
                        break;
                    }
                    finishedGame = isGuessed(player, secretNumber);
                    if (finishedGame) {
                        break;
                    }
                }
            } while (!finishedGame);
            printPlayersNumbers();
            for (Player player : players) {
                player.clearAttempts();
            }
        }
        defineTheWinner();
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private int generateSecretNumber() {
        return (int) (Math.random() * END_RANGE + START_RANGE);
    }

    private int inputNumber(Player player) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " угадывает число");
        while (true) {
            try {
                int playerNum = scn.nextInt();
                player.addAttempt(playerNum);
                return playerNum;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + "Введите число еще раз:");
            }
        }
    }

    private boolean isGuessed(Player player, int secretNumber) {
        int playerNum = inputNumber(player);
        if (playerNum == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " c "
                    + player.getNumberAttempt() + " попытки");
            player.incrementWin();
            return true;
        }
        System.out.println("Ответ неверный. Ваше число " + playerNum +
                (playerNum > secretNumber ? " больше " : " меньше ") + "того, что загадал компьютер");
        return false;

    }


    public void printPlayersNumbers() {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " называл числа:");
            for (int attempt : player.getAttempts()) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }

    private void defineTheWinner() {
        String winnerName = players[0].getName();
        int maxWins = players[0].getNumberWin();
        for (int i = 1; i < players.length; i++) {
            if (maxWins > players[i].getNumberWin()) {
                maxWins = players[i].getNumberWin();
                winnerName = players[i].getName();
            }
        }
        System.out.println("По результатам трех раундов победителем является:" + winnerName);
    }
}
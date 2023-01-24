package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int numberAttempt;
    private int numberWin;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int number) {
        if (number <= 0 || number > 100) {
            throw new RuntimeException("Введенное число не удовлетворяет условию: (0; 100]");
        } else {
            attempts[numberAttempt] = number;
            numberAttempt++;
        }
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberAttempt);
    }

    public int getNumberAttempt() {
        return numberAttempt;
    }

    public void clearAttempts() {
        if (numberAttempt != 0) {
            Arrays.fill(attempts, 0, numberAttempt, 0);
            numberAttempt = 0;
        }
    }

    public int getNumberWin() {
        return numberWin;
    }

    public void win() {
        numberWin++;
    }
}
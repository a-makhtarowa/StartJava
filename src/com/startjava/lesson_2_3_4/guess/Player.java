package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int numberAttempt;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNextAttempt(int number) {
        this.attempts[numberAttempt] = number;
        numberAttempt++;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberAttempt);
    }

    public int getNumberAttempt() {
        return numberAttempt;
    }

    public void reset() {
        if (numberAttempt != 0) {
            Arrays.fill(attempts, 0);
            numberAttempt = 0;
        }
    }
}
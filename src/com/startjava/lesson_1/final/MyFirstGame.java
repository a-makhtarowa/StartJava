package com.startjava.lesson_1.final

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        int randomNum = 19;
        int startRange = 1;
        int endRange = 100;
        int midNum = 0;
        while (midNum != randomNum) {
            midNum = startRange + ((endRange - startRange) / 2);
            if (midNum < randomNum) {
                System.out.println("Число " + midNum + " меньше того, что загадал компьютер");
                startRange = midNum + 1;
            } else if (midNum > randomNum) {
                System.out.println("Число " + midNum + " больше того, что загадал компьютер");
                endRange = midNum - 1;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + midNum);
    }
}
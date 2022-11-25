package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Locale;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 5, 3, 6, 7, 2, 4};
        System.out.println("Исходный массив:");
        printMassiveInt(numbers);
        for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
            int sch = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = sch;
        }
        System.out.println("\nОбратный массив:");
        printMassiveInt(numbers);

        System.out.println("\n2. Вывод произведения элементов массива");
        numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int mult = 1;
        for (int i = 1; i < numbers.length - 1; i++) {
            mult *= numbers[i];
        }
        for (int i = 1; i < numbers.length - 2; i++) {
            System.out.print(numbers[i] + " * ");
        }
        System.out.println(numbers[numbers.length - 2] + " = " + mult);
        System.out.println(numbers[0] + "; " + numbers[numbers.length - 1]);

        System.out.println("3. Удаление элементов массива");
        double[] randomDoubles = new double[15];
        for (int i = 0; i < randomDoubles.length; i++) {
            randomDoubles[i] = Math.random();
            System.out.printf(Locale.US, "%.3f ", randomDoubles[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
        double midNum = randomDoubles[randomDoubles.length / 2];
        for (int i = 0; i < randomDoubles.length; i++) {
            if (randomDoubles[i] > midNum) {
                randomDoubles[i] = 0;
            }
            System.out.printf(Locale.US, "%.3f ", randomDoubles[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        int count = 0;
        for (double number : randomDoubles) {
            if (number == 0) {
                count++;
            }
        }
        System.out.println("\nКоличество обнуленных ячеек - " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrLetters = new char[26];
        char numChar = 65;
        for (int i = 0; i < arrLetters.length; i++) {
            arrLetters[i] = numChar;
            numChar++;
        }
        for (int i = 1; i <= arrLetters.length; i++) {
            for (int j = arrLetters.length - 1; j > arrLetters.length - 1 - i; j--) {
                System.out.print(arrLetters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] randomInts = new int[30];
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = (int) (60 + Math.random() * 40);
        }
        for (int i = 0; i < randomInts.length; i++) {
            for (int j = 0; j < randomInts.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (randomInts[i] == randomInts[j]) {
                        while (randomInts[i] == randomInts[j]) {
                            randomInts[i] = (int) (60 + Math.random() * 40);
                        }
                        j = -1;
                    }
                }
            }
        }
        Arrays.sort(randomInts);
        for (int i = 0; i < randomInts.length; i++) {
            System.out.print(randomInts[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] arrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] arrStringCopy = new String[getLength(arrString)];
        int fromArr = 0;
        int toArr = 0;
        int len = 0;
        for (int i = 0; i < arrString.length; i++) {
            if (!arrString[i].isBlank()) {
                len++;
            } else {
                if (len != 0) {
                    System.arraycopy(arrString, fromArr, arrStringCopy, toArr, len);
                }
                toArr += len;
                fromArr = i + 1;
                len = 0;
            }
        }
        if (len != 0) {
            System.arraycopy(arrString, fromArr, arrStringCopy, toArr, len);
        }
        printMassiveString(arrString);
        System.out.println();
        printMassiveString(arrStringCopy);
    }

    private static void printMassiveInt(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int getLength(String[] arrString) {
        int len = 0;
        for (String text : arrString) {
            if (!text.isBlank()) {
                len++;
            }
        }
        return len;
    }

    private static void printMassiveString(String[] arrString) {
        for (String text : arrString) {
            System.out.print(text);
        }
    }
}

package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] arrInt = {1, 5, 3, 6, 7, 2, 4};
        System.out.println("Исходный массив:");
        printArrayInt(arrInt);
        int len = arrInt.length;
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            int element = arrInt[i];
            arrInt[i] = arrInt[j];
            arrInt[j] = element;
        }
        System.out.println("\nОбратный массив:");
        printArrayInt(arrInt);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        arrInt = new int[10];
        len = arrInt.length;
        for (int i = 0; i < len; i++) {
            arrInt[i] = i;
        }
        int mult = 1;
        for (int i = 0; i < len; i++) {
            mult *= (i != 0 && i != len - 1) ? arrInt[i] : 1;
        }
        for (int i = 1; i < len - 2; i++) {
            System.out.print(arrInt[i] + " * ");
        }
        System.out.print(arrInt[len - 2] + " = " + mult + "\n");
        for (int i = 0; i < len; i++) {
            System.out.print((i == 0 || i == len - 1) ? (arrInt[i] + "; ") : "");
        }

        System.out.println("\n3. Удаление элементов массива");
        double[] arrDouble = new double[15];
        len = arrDouble.length;
        for (int i = 0; i < len; i++) {
            arrDouble[i] = Math.random();
        }
        printArrayDouble(arrDouble);
        System.out.println();
        double midNumber = arrDouble[len / 2];
        for (int i = 0; i < len; i++) {
            if (arrDouble[i] > midNumber) {
                arrDouble[i] = 0;
            }
        }
        printArrayDouble(arrDouble);
        int count = 0;
        for (double number : arrDouble) {
            if (number == 0) {
                count++;
            }
        }
        System.out.println("\nКоличество обнуленных ячеек - " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrLetters = new char[26];
        char numberChar = 65;
        len = arrLetters.length;
        for (int i = 0; i < len; i++) {
            arrLetters[i] = numberChar;
            numberChar++;
        }
        for (int i = 1; i <= len; i++) {
            for (int j = len - 1; j > len - 1 - i; j--) {
                System.out.print(arrLetters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        arrInt = new int[30];
        len = arrInt.length;
        for (int i = 0; i < len; i++) {
            arrInt[i] = (int) (60 + Math.random() * 40);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && arrInt[i] == arrInt[j]) {
                    while (arrInt[i] == arrInt[j]) {
                        arrInt[i] = (int) (60 + Math.random() * 40);
                    }
                    j = -1;
                }
            }
        }
        Arrays.sort(arrInt);
        for (int i = 0; i < len; i++) {
            System.out.print(arrInt[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] arrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] arrStringCopy = new String[getLength(arrString)];
        int lenString = arrString.length;
        int fromArr = 0;
        int toArr = 0;
        len = 0;
        for (int i = 0; i < lenString; i++) {
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
        printArrayString(arrString);
        System.out.println();
        printArrayString(arrStringCopy);
    }

    private static void printArrayDouble(double[] arrDouble) {
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.printf("%.3f ", arrDouble[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private static void printArrayInt(int[] arrInt) {
        for (int number : arrInt) {
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

    private static void printArrayString(String[] arrString) {
        for (String text : arrString) {
            System.out.print(text);
        }
    }
}

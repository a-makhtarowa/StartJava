package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] arrInt = {1, 5, 3, 6, 7, 2, 4};
        System.out.println("Исходный массив:");
        printArrInt(arrInt);
        int len = arrInt.length;
        for (int i = 0; i < len / 2; i++) {
            int element = arrInt[i];
            arrInt[i] = arrInt[--len];
            arrInt[len] = element;
        }
        System.out.println("\nОбратный массив:");
        printArrInt(arrInt);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        arrInt = new int[10];
        len = arrInt.length;
        for (int i = 0; i < len; i++) {
            arrInt[i] = i;
        }
        int mult = 1;
        for (int i = 1; i < len - 1; i++) {
            mult *= arrInt[i];
            System.out.print(arrInt[i] + ((i < len - 2) ? " * " : (" = " + mult)));
        }
        System.out.println("\n" + arrInt[0] + "; " + arrInt[9] + ";");

        System.out.println("\n3. Удаление элементов массива");
        double[] arrDouble = new double[15];
        len = arrDouble.length;
        for (int i = 0; i < len; i++) {
            arrDouble[i] = Math.random();
        }
        printArrDouble(arrDouble);
        double middleNum = arrDouble[len / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arrDouble[i] > middleNum) {
                arrDouble[i] = 0;
                count++;
            }
        }
        printArrDouble(arrDouble);
        System.out.println("\nКоличество обнуленных ячеек - " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 1; i <= len; i++) {
            for (int j = len - 1; j > len - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        arrInt = new int[30];
        len = arrInt.length;
        count = 0;
        while (count < len) {
            int actualNum = (int) (60 + Math.random() * 40);
            boolean unique = false;
            for (int i = 0; i < count; i++) {
                if (arrInt[i] == actualNum) {
                    unique = true;
                    break;
                }
            }
            if (!unique) {
                arrInt[count] = actualNum;
                count++;
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
        String[] srcNum = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] destNum = new String[getLength(srcNum)];
        len = srcNum.length;
        int fromArr = 0;
        int toArr = 0;
        count = 0;
        for (int i = 0; i < len; i++) {
            if (!srcNum[i].isBlank()) {
                count++;
            } else {
                if (count != 0) {
                    System.arraycopy(srcNum, fromArr, destNum, toArr, count);
                }
                toArr += count;
                fromArr = i + 1;
                count = 0;
            }
        }
        if (count != 0) {
            System.arraycopy(srcNum, fromArr, destNum, toArr, count);
        }
        printArrString(srcNum);
        System.out.println();
        printArrString(destNum);
    }

    private static void printArrDouble(double[] arrDouble) {
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.printf("%.3f ", arrDouble[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArrInt(int[] arrInt) {
        for (int num : arrInt) {
            System.out.print(num + " ");
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

    private static void printArrString(String[] arrString) {
        for (String text : arrString) {
            System.out.print(text);
        }
    }
}

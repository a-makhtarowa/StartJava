package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int i = startRange;
        int sumEvenNums = 0;
        int sumOddNums = 0;
        do {
            if (i % 2 == 0) {
                sumEvenNums += i;
            } else {
                sumOddNums += i;
            }
            i++;
        } while (i <= endRange);
        System.out.println("В промежутке [" + startRange + "; " + endRange + "] сумма четных чисел = " + 
                sumEvenNums + ", а нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (num2 > max) {
            max = num2;
        } 
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        for (i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int copyNum1 = num1;
        int sumDigit = 0;
        System.out.println("Исходное число " + num1 + " в обратном порядке - ");
        while (copyNum1 > 0) {
            int nextDigit = copyNum1 % 10;
            sumDigit += nextDigit;
            copyNum1 /= 10;
            System.out.print(nextDigit);
        }
        System.out.println("\nСумма цифр числа - " + sumDigit);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        startRange = 1;
        endRange = 24;
        int count = 0;
        for (i = startRange; i < endRange; i += 2) {
            count++;
            System.out.printf("%2d ", i);
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        if (count != 0) {
            for (i = count; i < 5 ; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num1 = 3141591;
        copyNum1 = num1;
        int countOnes = 0;
        while (copyNum1 > 0) {
            int nextDigit = copyNum1 % 10;
            if (nextDigit == 1) {
                countOnes++;
            }
            copyNum1 /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("Число " + num1 + " содержит " + countOnes + 
                    " (четное) количество единиц");
        } else {
            System.out.println("Число " + num1 + " содержит " + countOnes + 
                    " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        i = 1;
        while (i <= 5) {
            int j = 5;
            while (j >= i) {
                System.out.print('#');
                j--;
            }
            System.out.println();
            i++;
        }

        i = 1;
        do {
            int j = 1;
            int maxI=i;
            if (i <= 3) {
                maxI = i;
            } else {
                maxI = 6 - i;
            }
            do {
                System.out.print('$');
                j++;
            } while (j <= maxI);
            System.out.println();
            i++;
        } while (i <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec  Char");
        for (i = 1; i <= 127; i++) {
            char codeChar = (char) i;
            if ((i >= 0 && i <= 47) && (i % 2 == 1)) {
                System.out.printf("%3d    %c\n", i, codeChar);
            } else if ((i >= 97 && i <= 122) && (i % 2 == 0)) {
                System.out.printf("%3d    %c\n", i, codeChar);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        copyNum1 = num1;
        int reverseNumber = 0;
        while (copyNum1 > 0) {
            int nextDigit = copyNum1 % 10;
            copyNum1 /= 10;
            reverseNumber = reverseNumber * 10 + nextDigit;
        }
        if (num1 == reverseNumber) {
            System.out.println("Число " + num1 + " является палиндромом");
        } else {
            System.out.println("Число " + num1 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 123476;
        copyNum1 = num1;
        int sumFirstThreeNum = 0;
        int sumLastThreeNum = 0;
        count = 0;
        while (copyNum1 > 0) {
            int nextDigit = copyNum1 % 10;
            if (count <= 2) {
                sumFirstThreeNum += nextDigit;
            } else {
                sumLastThreeNum += nextDigit;
            }
            count++;
            copyNum1 /= 10;
        }
        System.out.println("Сумма цифр " + num1 % 1000 + " = " + sumFirstThreeNum);
        System.out.println("Сумма цифр " + num1 / 1000 + " = " + sumLastThreeNum);
        System.out.println(sumFirstThreeNum == sumLastThreeNum ? "Число является счастливым" : 
                "Число не является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println(" |  2  3  4  5  6  7  8  9");
        System.out.println("--------------------------");
        for (i = 1; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.printf("%1d", i);
                    continue;
                }
                if (j == 1) {
                    System.out.print("|");
                    continue;
                }
                System.out.printf("%3d", i * j);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
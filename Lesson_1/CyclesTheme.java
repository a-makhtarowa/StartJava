public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int minNum = -10;
        int maxNum = 21;
        int i = minNum;
        int resultEven = 0;
        int resultOdd = 0;
        do {
            if (i % 2 == 0) {
                resultEven += i;
            } else {
                resultOdd += i;
            }
            i++;
        } while (i <= maxNum);
        System.out.println("В промежутке [" + minNum + "; " + maxNum + "] сумма четных чисел = " + 
                resultEven + ", а нечетных = " + resultOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        maxNum = num1;
        minNum = num1;
        if (maxNum < num2) {
            maxNum = num2;
        } 
        if (maxNum < num3) {
            maxNum = num3;
        }
        if (minNum > num2) {
            minNum = num2;
        }
        if (minNum > num3) {
            minNum = num3;
        }
        for (i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int current = num1;
        int resultSum = 0;
        int reverseNumber = 0;
        while (current > 0) {
            int nextDigit = current % 10;
            resultSum += nextDigit;
            current /= 10;
            reverseNumber = reverseNumber * 10 + nextDigit;
        }
        System.out.println("Исходное число " + num1 + " в обратном порядке - " + reverseNumber + 
                "\nСумма цифр числа - " + resultSum);


        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        minNum = 1;
        maxNum = 24;
        int count = 0;
        for (i = minNum; i < maxNum; i += 2) {
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
        current = num1;
        count = 0;
        while (current > 0) {
            int nextDigit = current % 10;
            if (nextDigit == 1) {
                count++;
            }
            current /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Число " + num1 + " содержит " + count + 
                    " (четное) количество единиц");
        } else {
            System.out.println("Число " + num1 + " содержит " + count + 
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
            do {
                System.out.print('$');
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 3);
        i = 1;
        do {
            int j = 2;
            do {
                System.out.print('$');
                j--;
            } while (j >= i);
            System.out.println();
            i++;
        } while (i <= 2);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec  Char");
        for (i = 1; i <= 127; i++) {
            char codeChar = (char) i;
            if (i >= 0 && i <= 47 && i % 2 == 1) {
            System.out.printf("%3d    %c\n", i, codeChar);
            } else if (i >= 97 && i <= 122 && i % 2 == 0) {
            System.out.printf("%3d    %c\n", i, codeChar);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        current = num1;
        resultSum = 0;
        reverseNumber = 0;
        while (current > 0) {
            int nextDigit = current % 10;
            resultSum += nextDigit;
            current /= 10;
            reverseNumber = reverseNumber * 10 + nextDigit;
        }
        if (num1 == reverseNumber) {
            System.out.println("Число " + num1 + " является палиндромом");
        } else {
            System.out.println("Число " + num1 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 123321;
        current = num1;
        int resultSum1 = 0;
        int resultSum2 = 0;
        count = 0;
        while (current > 0) {
            int nextDigit = current % 10;
            if (count <= 2) {
                resultSum1 += nextDigit;
            } else {
                resultSum2 += nextDigit;
            }
            count++;
            current /= 10;
        }
        System.out.println("Сумма цифр " + num1 % 1000 + " = " + resultSum1);
        System.out.println("Сумма цифр " + num1 / 1000 + " = " + resultSum2);
        System.out.println(resultSum1 == resultSum2 ? "Число является счастливым" : 
                "Число не является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    if (j == 0) {
                        System.out.print("   ");
                        continue;
                    }
                    if (j == 1) {
                        System.out.print("|");
                        continue;
                    }
                    System.out.printf("%3d", j);
                    if (j == 9) {
                        System.out.println();
                    }
                } else if (i == 1) {
                    System.out.print("---");
                    if (j == 9) {
                        System.out.println();
                    }
                } else {
                    if (j == 0) {
                        System.out.printf("%3d", i);
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
}
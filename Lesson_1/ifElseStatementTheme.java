public class ifElseStatementTheme {   
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 11;
        boolean male = true;
        double height = 1.90;
        String name = "Alice";
        if (age > 20) {
                System.out.println("Приключения только начинаются!");
        } else {
                System.out.println("Вы еще слишком молоды для этой фигни");
        }
        if (!male) {
                System.out.println("Вы сегодня отлично выглядите!");
        } else {
                System.out.println("Сэр, мужской туалет направо");
        }
        if (height < 1.80) {
                System.out.println("Вот Ваша стремянка, поверьте, она Вам пригодится");
        } else {
                System.out.println("Мало кто знает, что у высоких людей - воздух чище, а вид " + 
                        "красивее!");
        }
        int firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'M') {
                System.out.println("Эта буква в имени придает вашей натуре мягкость и ранимость");
        } else if (firstNameLetter == 'I') {
                System.out.println("Эта буква вашего имени говорит о вашей склонности к пессимизму");
        } else {
                System.out.println("Однажды я пойму, что ты такое, но не сегодня");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 100;
        int num2 = 200;
        if (num1 > num2) {
                System.out.println("Максимальное число - " + num1 + "\nМинимальное число - " + num2);
        } else if (num2 > num1) {
                System.out.println("Максимальное число - " + num2 + "\nМинимальное число - " + num1);
        } else {
                System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");
        num1 = -1354;
        if (num1 != 0) {
                System.out.println("Ваше число: " + num1);
                if (num1 % 2 == 0) {
                        System.out.println("Введенное число четное");
                } else {
                        System.out.println("Введенное число нечетное");
                }
                if (num1 > 0) {
                        System.out.println("Введенное число положительное");
                } else {
                        System.out.println("Введенное число отрицательное");
                }
        } else {
                System.out.println("Введенное число - ноль");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 345;
        num2 = 678;
        boolean conditionFound = true;
        System.out.println("Исходные числа: num1 = " + num1 + "; " + "num2 = " + num2);
        if (num1 / 100 == num2 / 100) {
                System.out.println("Одинаковые цифры двух чисел - " + (num1 / 100) + 
                        "\nЧисла третьего разряда");
                conditionFound = false;
        } 
        if (num1 % 100 / 10 == num2 % 100 / 10) {
                System.out.println("Одинаковые цифры двух чисел - " + (num1 % 100 / 10) + 
                        "\nЧисла второго разряда");
                conditionFound = false;
        } 
        if (num1 % 10 == num2 % 10) {
                System.out.println("Одинаковые цифры двух чисел - " + (num1 % 10) + 
                        "\nЧисла первого разряда");
                conditionFound = false;
        }
        if (conditionFound) { 
                System.out.println("Одинаковых цифр, стоящих в одном разряде - нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char codeChar = '\u0057';
        if (65 <= codeChar && codeChar <= 90) {
                System.out.println("Введенный символ - большая буква");
        } else if (97 <= codeChar && codeChar <= 122) {
                System.out.println("Введенный символ - маленькая буква");
        } else if (48 <= codeChar && codeChar <= 57) {
                System.out.println("Введенный символ - число");
        } else {
                System.out.println("Введенный символ не число и не буква");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int depositSum = 300_000;
        int depositPс;
        System.out.println("Сумма вклада - " + depositSum);
        if (depositSum < 100_000) {
                depositPс = 5;
        } else if (depositSum >= 100_000 && depositSum < 300_000) {
                depositPс = 7;
        } else {
                depositPс = 10;
        }
        System.out.println("Начисленная сумма по вкладу - " + 
                (double) (depositSum * 0.01 * depositPс));
        System.out.println("Итоговая сумма с процентом - " + (depositSum + 
                        (depositSum * 0.01 * depositPс)));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPc = 59;
        int programmingPc = 91;
        int historyGrade;
        int programmingGrade;
        if (historyPc <= 60) {
                historyGrade = 2;
        } else if (historyPc > 60 && historyPc <= 73) {
                historyGrade = 3;
        } else if (historyPc > 73 && historyPc <= 91) {
                historyGrade = 4;
        } else {
                historyGrade = 5;
        }
        if (programmingPc <= 60) {
                programmingGrade = 2;
        } else if (programmingPc > 60 && programmingPc <= 73) {
                programmingGrade = 3;
        } else if (programmingPc > 73 && programmingPc <= 91) {
                programmingGrade = 4;
        } else {
                programmingGrade = 5;
        }
        System.out.println (historyGrade + " - История\n" + programmingGrade + 
                " - Программирование");
        System.out.println("Средний балл оценок по предметам: " + 
                (double) ((historyGrade + programmingGrade) / 2));
        System.out.println("Средний % по предметам: " + (double) ((historyPc + programmingPc) / 2));

        System.out.println("\n8. Расчет прибыли");
        int rentMonth = 5000;
        int saleMonth = 13000;
        int costPriceMonth = 9000;
        int yearProfit = ((saleMonth - costPriceMonth) - rentMonth) * 12;
        if (yearProfit > 0) {
                System.out.println("Прибыль за год: +" + yearProfit);
        } else {
                System.out.println("Прибыль за год: " + yearProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int withdrawFromAtm = 567;
        int banknotesLeft10 = 5;
        int leftMoney = withdrawFromAtm;
        int count100 = leftMoney / 100;
        leftMoney -= count100 * 100;
        int count10 = leftMoney / 10;
        if (count10 > banknotesLeft10) {
                count10 = banknotesLeft10;
        }
        leftMoney -= count10 * 10;
        int count1 = leftMoney;
        System.out.println("Банкноты номиналом:\n1 - " + count1 + "\n10 - " + count10 + "\n100 - " + 
                count100);
        System.out.println("Общая сумма: " + (count1 + count10 * 10 + count100 * 100));
    }
}
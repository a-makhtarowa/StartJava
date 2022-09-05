public class VariableTheme {   
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numByte = 16;
        short numShort = 64;
        int numInt = 4700;
        long numLong = -1_100_000;
        float numFloat = 2.4f;
        double numDouble = -2.718281;
        char numChar = 'K';
        boolean answer=true;
        System.out.println("Примитивный тип данных byte - " + numByte);
        System.out.println("Примитивный тип данных short - " + numShort);
        System.out.println("Примитивный тип данных int - " + numInt);
        System.out.println("Примитивный тип данных long - " + numLong);
        System.out.println("Примитивный тип данных float - " + numFloat);
        System.out.println("Примитивный тип данных double - " + numDouble);
        System.out.println("Примитивный тип данных char - " + numChar);
        System.out.println("Примитивный тип данных boolean - " + answer);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        double sumPrice = (pricePen + priceBook)*((100.0-discount)/100);
        System.out.println("Сумма скидки при приобретении товаров ручка+книга - " + discount + "%");
        System.out.println("Суммарная стоимость товаров с учетом скидки - " + sumPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        byte incByte = (byte)(maxByte + 1); 
        short incShort = (short)(maxShort + 1);
        int incInt = maxInt + 1;
        long incLong = maxLong + 1;

        byte decByte = (byte)(maxByte - 1); 
        /*возник вопрос: почему при вычитании из максимального значения тоже нужно явно указывать, 
        что значение остается byte или short? ведь по сути эти числа будут входить в диапазон. 
        или я не поняла какой-то загадки?*/
        short decShort = (short)(maxShort - 1);
        int decInt = maxInt - 1;
        long decLong = maxLong - 1;

        System.out.println("Максимальное значение, инкремент и декремент типа byte: " + maxByte + 
            "; " + incByte + "; " + decByte);
        System.out.println("Максимальное значение, инкремент и декремент типа short: " + maxShort + 
            "; " + incShort + "; " + decShort);
        System.out.println("Максимальное значение, инкремент и декремент типа int: " + maxInt + 
            "; " + incInt + "; " + decInt);
        System.out.println("Максимальное значение, инкремент и декремент типа long: " + maxLong + 
            "; " + incLong + "; " + decLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int prom;
        System.out.println("I. Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        prom = num1;
        num1 = num2;
        num2 = prom;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("II. Перестановка значений с помощью арифметических операций");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("III. Перестановка значений с помощью побитовых операций");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 ^ num2; 
        /* вопрос: правильно ли я поняла, что побитовые операции лучше использовать по минимуму, 
        так как при неверно написанном выражении (не учитывая точки следования программы) 
        результат может оказаться непредсказуемым?*/
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char numChar1 = 35;
        char numChar2 = 38;
        char numChar3 = 64;
        char numChar4 = 94;
        char numChar5 = 95;
        System.out.println((int)numChar1 + " - " + numChar1);
        System.out.println((int)numChar2 + " - " + numChar2);
        System.out.println((int)numChar3 + " - " + numChar3);
        System.out.println((int)numChar4 + " - " + numChar4);
        System.out.println((int)numChar5 + " - " + numChar5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        num1 = 123;
        int hundreds = num1 / 100;
        int dozens = (num1 % 100) / 10;
        int units = (num1 % 100) % 10;
        System.out.println("Число " + num1 + "содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(units + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        numChar1 = '/';
        numChar2 = ' ';
        numChar3 = '_';
        numChar4 = '\\';
        numChar5 = '(';
        char numChar6 = ')';
        System.out.println("" + numChar2 + numChar2 + numChar2 + numChar2 + numChar1 + numChar4);
        System.out.println("" + numChar2 + numChar2 + numChar2 + numChar1 + numChar2  + numChar2 + 
            numChar4);
        System.out.println("" + numChar2 + numChar2 + numChar1 + numChar3 + numChar5 + numChar2 + 
            numChar6 + numChar4);
        System.out.println("" + numChar2 + numChar1 + numChar2 + numChar2  + numChar2 + numChar2 + 
            numChar2 + numChar2 + numChar4);
        System.out.println("" + numChar1 + numChar3 + numChar3 + numChar3 + numChar3 + numChar1 + 
            numChar4 + numChar3 + numChar3 + numChar4);

        System.out.println("\n9. Произведение и сумма цифр числа");
        num1 = 345;
        int digit1 = num1 / 100;
        int digit2 = (num1 % 100) / 10;
        int digit3 = (num1 % 100) % 10;
        int sum = digit1 + digit2 + digit3;
        int mult = digit1 * digit2 * digit3;
        System.out.println("Сумма цифр числа " + num1 + " = " + sum);
        System.out.println("Произведение цифр числа " + num1 + " = " + mult);

        System.out.println("\n10. Преобразование секунд");
        int seconds = 86399;
        int hours = seconds / 60 / 60;
        int minutes = seconds % 60;
        int remainingSeconds= (seconds % 60) % 60;
        System.out.println("Точное время: " + hours + ":" + minutes + ":" + remainingSeconds);
    }
}
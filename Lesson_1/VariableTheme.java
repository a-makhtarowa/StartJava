import java.lang.Object;

public class VariableTheme {   
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numByte = (byte) Runtime.getRuntime().availableProcessors();
        short numShort = (short) Runtime.getRuntime().maxMemory();
        int numInt = (int) Runtime.getRuntime().freeMemory();
        long numLong = Runtime.getRuntime().maxMemory();

        float numFloat = (float) Runtime.getRuntime().freeMemory();
        double numDouble = (double) Runtime.getRuntime().maxMemory();
        char numChar = (char) Runtime.getRuntime().availableProcessors();
        boolean answer=Runtime.getRuntime().maxMemory()==1;
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
        double discountPrice = (pricePen + priceBook) * ((100.0 - discount) / 100);
        System.out.println("Сумма скидки при приобретении товаров ручка + книга - " + discount + 
                "%");
        System.out.println("Суммарная стоимость товаров с учетом скидки - " + discountPrice);

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
        System.out.println("Максимальное значение, инкремент и декремент типа byte: " + maxByte + 
                "; " + (byte) (maxByte++) + "; " + (byte) (maxByte--));
        System.out.println("Максимальное значение, инкремент и декремент типа short: " + maxShort + 
                "; " + (short) (maxShort++) + "; " + (short) (maxShort--));
        System.out.println("Максимальное значение, инкремент и декремент типа int: " + maxInt + 
                "; " + (maxInt++) + "; " + (maxInt--));
        System.out.println("Максимальное значение, инкремент и декремент типа long: " + maxLong + 
                "; " + (maxLong++) + "; " + (maxLong--));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int tmp;
        System.out.println("I. Перестановка значений с помощью третьей переменной");
        System.out.println("Исходные значения переменных: num1 = " + num1 + ", num2 = " + num2);
        tmp = num1;
        num1 = num2;
        num2 = tmp;
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
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Новые значения переменных: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println((int) codeChar1 + " - " + codeChar1);
        System.out.println((int) codeChar2 + " - " + codeChar2);
        System.out.println((int) codeChar3 + " - " + codeChar3);
        System.out.println((int) codeChar4 + " - " + codeChar4);
        System.out.println((int) codeChar5 + " - " + codeChar5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        num1 = 123;
        int hundreds = num1 / 100;
        int dozens = (num1 % 100) / 10;
        int ones = num1 % 10;
        System.out.println("Число " + num1 + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(ones + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char forwardSlash = '/';
        char space = ' ';
        char underscore = '_';
        char backSlash = '\\';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("" + space + space + space + space + forwardSlash + backSlash);
        System.out.println("" + space + space + space + forwardSlash + space  + space + 
                backSlash);
        System.out.println("" + space + space + forwardSlash + underscore + openParenthesis + 
                space + closeParenthesis + backSlash);
        System.out.println("" + space + forwardSlash + space + space  + space + space + 
                space + space + backSlash);
        System.out.println("" + forwardSlash + underscore + underscore + underscore + underscore + 
                forwardSlash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        num1 = 345;
        int digit1 = num1 / 100;
        int digit2 = (num1 % 100) / 10;
        int digit3 = num1 % 10;
        int sum = digit1 + digit2 + digit3;
        int mult = digit1 * digit2 * digit3;
        System.out.println("Сумма цифр числа " + num1 + " = " + sum);
        System.out.println("Произведение цифр числа " + num1 + " = " + mult);

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 60 / 60;
        int minutes = totalSeconds % 60;
        int seconds = totalSeconds % 60;
        System.out.println("Точное время: " + hours + ":" + minutes + ":" + seconds);
    }
}
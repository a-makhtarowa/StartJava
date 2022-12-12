package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static void calculate(String expression) {
        try {
            String[] elements = expression.split(" ");
            int num1 = Integer.parseInt(elements[0]);
            char sign = elements[1].charAt(0);
            int num2 = Integer.parseInt(elements[2]);
            if (num1 >= 0 && num2 >= 0) {
                switch (sign) {
                    case '+' -> System.out.println(Math.addExact(num1, num2));
                    case '-' -> System.out.println(Math.subtractExact(num1, num2));
                    case '*' -> System.out.println(Math.multiplyFull(num1, num2));
                    case '/' -> System.out.println(Math.floorDiv(num1, num2));
                    case '^' -> System.out.println((long) Math.pow(num1, num2));
                    case '%' -> System.out.println((long) Math.IEEEremainder(num1, num2));
                    default -> System.out.println("Неизвестная операция");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Выражение не соотвествует условию. Пожалуйста, введите правильное выражение");
        }
    }
}

package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static long calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        int num2 = Integer.parseInt(elements[2]);
        checkNumberIsPositive(num1);
        checkNumberIsPositive(num2);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyFull(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (long) Math.pow(num1, num2);
            case '%' -> (long) Math.IEEEremainder(num1, num2);
            default -> {
                System.out.println("Неизвестная операция");
                yield 0;
            }
        };
    }
    private static void checkNumberIsPositive(int num) {
        if (num <= 0) {
            throw new RuntimeException("Число " + num + " не положительное");
        }
    }
}

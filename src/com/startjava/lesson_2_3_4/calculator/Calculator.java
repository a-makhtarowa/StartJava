package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static long calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        int num2 = Integer.parseInt(elements[2]);
        findException(num1);
        findException(num2);
        switch (sign) {
            case '+' -> {
                return Math.addExact(num1, num2);
            }
            case '-' -> {
                return Math.subtractExact(num1, num2);
            }
            case '*' -> {
                return Math.multiplyFull(num1, num2);
            }
            case '/' -> {
                return Math.floorDiv(num1, num2);
            }
            case '^' -> {
                return (long) Math.pow(num1, num2);
            }
            case '%' -> {
                return (long) Math.IEEEremainder(num1, num2);
            }
            default -> {
                System.out.println("Неизвестная операция");
                return 0;
            }
        }
    }
    private static void findException(int num) {
        if (num <= 0) {
            throw new RuntimeException("Число " + num + " не положительное");
        }
    }
}

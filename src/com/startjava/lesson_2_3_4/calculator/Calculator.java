package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public long calculate() {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        int num2 = Integer.parseInt(elements[2]);
        for (String num:elements) {
            System.out.println(num);
        }
        System.out.println();
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyFull(num1, num2);
            case '/':
                return Math.floorDiv(num1, num2);
            case '^':
                return (long) Math.pow(num1, num2);
            case '%':
                return (long) Math.IEEEremainder(num1, num2);
            default:
                System.out.println("Неизвестная операция");
                return 0;
        }
    }
}

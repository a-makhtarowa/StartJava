package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            inputExpression(scn);
        } while (isNext(scn));
    }

    private static void inputExpression(Scanner scn) {
        Calculator calculator = new Calculator();
        System.out.println("Введите математическое выражение:");
        calculator.setExpression(scn.nextLine());
        System.out.println(calculator.calculate());
    }

    private static boolean isNext(Scanner scn) {
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
        String answer = scn.nextLine();
        while (!"yes".equals(answer) && !"no".equals(answer)) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scn.next();
        }
        return "yes".equals(answer);
    }
}
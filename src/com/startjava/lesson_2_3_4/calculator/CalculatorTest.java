package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            performCalculation(scn);
        } while (isNext(scn));
    }

    private static void performCalculation(Scanner scn) {
        Calculator calculator = new Calculator();
        System.out.println("Введите математическое выражение:");
        System.out.println(calculator.calculate(scn.nextLine()));
    }

    private static boolean isNext(Scanner scn) {
        String answer;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scn.nextLine();
        } while (!"yes".equals(answer) && !"no".equals(answer));
        return "yes".equals(answer);
    }
}
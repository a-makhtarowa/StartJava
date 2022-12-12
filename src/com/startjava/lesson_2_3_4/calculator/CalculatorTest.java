package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            doCalculation(scn);
        } while (isNext(scn));
    }

    private static void doCalculation(Scanner scn) {
        System.out.println("Введите математическое выражение:");
        Calculator.calculate(scn.nextLine());
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
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            printCalculation(scr);
            boolean nextIteration = continueCalculation(scr);
            if (!nextIteration) {
                break;
            }
        }
    }

    public static void printCalculation(Scanner scr) {
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число: ");
        calculator.setNum1(scr.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setSign(scr.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scr.nextInt());
        calculator.calculate();
        System.out.println(calculator.getResult());
    }

    public static boolean continueCalculation(Scanner scr) {
        while (true) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scr.next();
            if ("yes".equals(answer)) {
                return true;
            } else if ("no".equals(answer)) {
                return false;
            } else {
                continue;
            }
        }
    }
}
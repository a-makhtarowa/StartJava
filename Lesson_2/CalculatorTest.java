import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        inputData(scr);
        while (isNext(scr)) {
            inputData(scr);
        }
    }

    private static void inputData(Scanner scr) {
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число: ");
        calculator.setNum1(scr.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setSign(scr.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scr.nextInt());
        System.out.println(calculator.calculate());
    }

    private static boolean isNext(Scanner scr) {
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
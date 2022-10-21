import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            inputExpression(scn);
        } while (isNext());
    }

    private static void inputExpression(Scanner scn) {
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число: ");
        calculator.setNum1(scn.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setSign(scn.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setNum2(scn.nextInt());
        System.out.println(calculator.calculate());
    }

    private static boolean isNext(Scanner scn) {
        System.out.println("Хотите продолжить вычисления? [yes/no]: ");
        String answer = scn.next();
        while (!"yes".equals(answer) && !"no".equals(answer)) {
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scn.next();
        }
        return "yes".equals(answer);
    }
}
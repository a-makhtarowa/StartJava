import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scn.nextLine(), scn);
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scn.nextLine(), scn);
        //inputPlayerName(scn);
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.startGame();
        } while (isNext(scn));
    }

    private static boolean isNext(Scanner scn) {
        System.out.println("Хотите продолжить игру? [yes/no]: ");
        String answer = scn.next();
        while (!"yes".equals(answer) && !"no".equals(answer)) {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = scn.next();
        }
        return "yes".equals(answer);
    }
}
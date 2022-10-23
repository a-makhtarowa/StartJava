import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int randomNum = generateRandomNum();
        boolean isEndGame;
        do {
            isEndGame = isGuessed(randomNum, player1);
            if (!isEndGame) {
                isEndGame = isGuessed(randomNum, player2);
            }
        } while (!isEndGame);
    }

    private int generateRandomNum() {
        int difference = endRange - startRange;
        Random random = new Random();
        int randomNum = random.nextInt(difference + 1);
        randomNum += startRange;
        return randomNum;
    }

    private boolean isGuessed(int randomNum1, Player player) {
        int playerNum = readNextNumber(player);
        if (playerNum == randomNum1) {
            System.out.println("Игрок " + player.getName() + " победил!");
            return true;
        }
        if (playerNum > randomNum1) {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " больше того, что загадал компьютер");
        } else {
            System.out.println("Ответ неверный. Ваше число " + playerNum +
                    " меньше того, что загадал компьютер");
        }
        return false;
    }

    private int readNextNumber(Player player) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " угадывает число");
        return scn.nextInt();
    }
}
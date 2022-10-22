import java.util.Random;

public class GuessNumber {
    private int startRange = 1;
    private int endRange = 100;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int takeCompNum() {
        int difference = endRange - startRange;
        Random random = new Random();
        int randomNum = random.nextInt(difference + 1);
        randomNum += startRange;
        return randomNum;
    }

    private boolean doNextStep(int randomNum1, Player player) {
            int playerNum = player.readNextNumber();
            if (playerNum == randomNum1) {
                System.out.println("Игрок " + player.getName() + " победил!");
                return true;
            } else {
                if (playerNum > randomNum1) {
                    System.out.println("Ответ неверный. Ваше число " + playerNum +
                            " больше того, что загадал компьютер");
                } else {
                    System.out.println("Ответ неверный. Ваше число " + playerNum +
                            " меньше того, что загадал компьютер");
                }
                return false;
            }
    }

    public void startGame() {
        int randomNum = takeCompNum();
        boolean isEndGame;
        do {
            isEndGame = doNextStep(randomNum, player1);
            if (!isEndGame) {
                isEndGame = doNextStep(randomNum, player2);
            }
        } while (!isEndGame);
    }
}
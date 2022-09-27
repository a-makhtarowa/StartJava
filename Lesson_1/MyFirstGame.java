public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Угадай число");
        int randomNum = 63;
        int lowNum = 1;
        int highNum = 100;
        while (lowNum <= highNum) {
            int midNum = lowNum + ((highNum - lowNum) / 2);
            if (midNum < randomNum) {
                System.out.println("Число " + midNum + " меньше того, что загадал компьютер");
                lowNum = midNum + 1;
            } else if (midNum > randomNum) {
                System.out.println("Число " + midNum + " больше того, что загадал компьютер");
                highNum = midNum - 1;
            } else if (midNum == randomNum) {
                System.out.println("Вы победили! Загаданное число: " + midNum);
                break;
            }
        }
    }
}
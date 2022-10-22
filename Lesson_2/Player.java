import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scn;

    public Player(String name, Scanner scn) {
        this.name = name;
        this.scn = scn;
    }

    public String getName() {
        return name;
    }

    public int readNextNumber() {
        System.out.println("Игрок " + name + " угадывает число");
        return scn.nextInt();
    }
}
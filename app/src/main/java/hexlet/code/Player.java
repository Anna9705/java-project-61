package hexlet.code;

import java.util.Scanner;

public class Player {
    private String name;

    Player(String playerName) {
        this.name = playerName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String playerName) {
        this.name = playerName;
    }

    static Player player = new Player("name");

    public static void greetPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.next();
        player.setName(name);
        System.out.println("Hello, " + player.getName() + "!");
    }

    public static void loseMessage() {
        System.out.println("Let's try again, " + player.getName() + "!");
    }

    public static void winMessage() {
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}

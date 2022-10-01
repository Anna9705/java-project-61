package hexlet.code;

import java.util.Scanner;

public final class Player {
    public static String greetPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void loseMessage(String name) {
        System.out.println("Let's try again, " + name + "!");
    }

    public static void winMessage(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}

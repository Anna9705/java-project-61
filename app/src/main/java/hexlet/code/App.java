package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.welcomePlayer;
import hexlet.code.games.EvenCheck;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press  enter\s
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        int choice = in.nextInt();
        switch (choice) {
            case 2:
                EvenCheck.evenCheck();
                break;
            case 1:
                welcomePlayer();
                Player.greetPlayer();
                break;
            default:
                break;
        }
    }
}

package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.welcomePlayer;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int roundsCount = 3;
        System.out.print("""
                Please enter the game number and press  enter\s
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit
                Your choice:\s""");
        int choice = in.nextInt();
        final int even = 2;
        final int calc = 3;
        switch (choice) {
            case calc:
                Calculator.calc(roundsCount);
                break;
            case even:
                EvenCheck.evenCheck(roundsCount);
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

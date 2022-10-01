package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.welcomePlayer;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenCheck;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int roundsCount = 3;
        System.out.print("""
                Please enter the game number and press  enter\s
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        int choice = in.nextInt();
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        switch (choice) {
            case prime:
                Prime.primeGame(roundsCount);
                break;
            case progression:
                Progression.progression(roundsCount);
                break;
            case gcd:
                Gcd.gcdGame(roundsCount);
                break;
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

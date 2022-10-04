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
        System.out.print("""
                Please enter the game number and press enter\s
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String choice = in.next();
        switch (choice) {
            case "6":
                Prime.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "4":
                Gcd.runGame();
                break;
            case "3":
                Calculator.runGame();
                break;
            case "2":
                EvenCheck.runGame();
                break;
            case "1":
                welcomePlayer();
                break;
            case "0":
                break;
            default:
                throw new Error("Not an option");
        }
    }
}

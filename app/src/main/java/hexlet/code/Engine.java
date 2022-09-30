package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.welcomePlayer;

public class Engine {
    public static void gamesEngine(String[][] gameAnswers, String gameRules) {
        welcomePlayer();
        Player.greetPlayer();
        System.out.println(gameRules);
        boolean check = true;
        Scanner in = new Scanner(System.in);
        String playerAnswer;
        for (var i = 0; i <= 2; i++) {
            System.out.println("Question: " + gameAnswers[i][0]);
            System.out.print("Your answer is: ");
            playerAnswer = in.next();
            if (playerAnswer.equals(gameAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                check = false;
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + gameAnswers[i][1] + "'");
                Player.loseMessage();
                break;
            }
        }
        if (check) {
            Player.winMessage();
        }
    }
}

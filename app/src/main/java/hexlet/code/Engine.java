package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void gamesEngine(String[][] gameQAndA, String gameRules) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameRules);
        String playerAnswer;
        for (String[] gameAnswer : gameQAndA) {
            System.out.println("Question: " + gameAnswer[0]);
            System.out.print("Your answer is: ");
            playerAnswer = in.next();
            if (playerAnswer.equals(gameAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + gameAnswer[1] + "'"
                        + "\nLet's try again, " + name + "!");
                return;
            }
        }
        in.close();
        System.out.println("Congratulations, " + name + "!");
    }
}

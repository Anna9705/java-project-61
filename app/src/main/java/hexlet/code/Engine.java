package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void greet() {
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.next();
        System.out.println("Hello, " + name + "!");
    }

    public static String gamesEngine(String[][] gameAnswers, String gameRules) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameRules);
        String playerAnswer;
        for (String[] gameAnswer : gameAnswers) {
            System.out.println("Question: " + gameAnswer[0]);
            System.out.print("Your answer is: ");
            playerAnswer = in.next();
            if (playerAnswer.equals(gameAnswer[1])) {
                System.out.println("Correct!");
            } else {
                return "'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + gameAnswer[1] + "'"
                        + "\nLet's try again, " + name + "!";
            }
        }
        return "Congratulations, " + name + "!";
    }
}

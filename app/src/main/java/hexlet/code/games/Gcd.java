package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Gcd {
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        final int rangeOfRandom = 11;
        for (String[] roundQAndA : gameAnswers) {
            var num1 = Utils.generateNumber(rangeOfRandom) * Utils.generateNumber(rangeOfRandom);
            var num2 = Utils.generateNumber(rangeOfRandom) * Utils.generateNumber(rangeOfRandom);
            roundQAndA[0] = num1 + " " + num2;
            roundQAndA[1] = Integer.toString(Utils.calculateGCD(num1, num2));
        }
        Engine.gamesEngine(gameAnswers, GAME_RULES);
    }
}

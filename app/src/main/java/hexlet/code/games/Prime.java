package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        final int rangeOfRandom = 100;
        for (String[] roundQAndQ : gameAnswers) {
            var number = Utils.generateNumber(rangeOfRandom) + 1;
            roundQAndQ[0] = Integer.toString(number);
            roundQAndQ[1] = (Utils.isPrime(number)) ? "yes" : "no";
        }
        Engine.gamesEngine(gameAnswers, GAME_RULES);
    }
}

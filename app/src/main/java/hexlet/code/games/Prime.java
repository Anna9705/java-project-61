package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int number) {
        for (var i = 2; i < number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        String[][] gameQAndA = new String[ROUNDS_COUNT][2];
        final int rangeOfRandom = 100;
        for (String[] roundQAndQ : gameQAndA) {
            var number = Utils.generateNumber(rangeOfRandom) + 1;
            roundQAndQ[0] = Integer.toString(number);
            roundQAndQ[1] = (isPrime(number)) ? "yes" : "no";
        }
        Engine.gamesEngine(gameQAndA, GAME_RULES);
    }
}

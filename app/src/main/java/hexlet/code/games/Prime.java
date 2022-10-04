package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean primeCheck(int number) {
        if (number <= 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (var i = 2 + 1; i < number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        var random = new Random();
        var number = 0;
        final int rangeOfRandom = 100;
        for (String[] roundQAndQ : gameAnswers) {
            number = random.nextInt(rangeOfRandom) + 1;
            roundQAndQ[0] = Integer.toString(number);
            if (primeCheck(number)) {
                roundQAndQ[1] = "yes";
            } else {
                roundQAndQ[1] = "no";
            }
        }
        System.out.println(Engine.gamesEngine(gameAnswers, GAME_RULES));
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static boolean primeCheck(int number) {
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (var i = 3; i < number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame(int roundsCount) {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameAnswers = new String[roundsCount][2];
        var random = new Random();
        var number = 0;
        final int rangeOfRandom = 100;
        for (var i = 0; i < roundsCount; i++) {
            number = random.nextInt(rangeOfRandom) + 1;
            gameAnswers[i][0] = Integer.toString(number);
            if (primeCheck(number)) {
                gameAnswers[i][1] = "yes";
            } else {
                gameAnswers[i][1] = "no";
            }
        }
        Engine.gamesEngine(gameAnswers, gameRules);
    }
}

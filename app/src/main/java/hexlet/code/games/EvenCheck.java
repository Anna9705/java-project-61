package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenCheck {
    public static void evenCheck() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameAnswers = new String[3][2];
        var random = new Random();
        var number = 0;
        final int rangeOfRandom = 1000;
        for (var i = 0; i <= 2; i++) {
            number = random.nextInt(0, rangeOfRandom);
            gameAnswers[i][0] = Integer.toString(number);
            if (number % 2 == 0) {
                gameAnswers[i][1] = "yes";
            } else {
                gameAnswers[i][1] = "no";
            }
        }
        Engine.gamesEngine(gameAnswers, gameRules);
    }
}
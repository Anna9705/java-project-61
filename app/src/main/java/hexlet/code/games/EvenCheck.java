package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class EvenCheck {
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        var random = new Random();
        var number = 0;
        final int rangeOFRandom = 1000;
        for (String[] roundQAndA : gameAnswers) {
            number = random.nextInt(0, rangeOFRandom);
            roundQAndA[0] = Integer.toString(number);
            if (number % 2 == 0) {
                roundQAndA[1] = "yes";
            } else {
                roundQAndA[1] = "no";
            }
        }
        System.out.println(Engine.gamesEngine(gameAnswers, GAME_RULES));
    }
}

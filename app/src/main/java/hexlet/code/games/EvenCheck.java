package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class EvenCheck {
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] gameQAndA = new String[ROUNDS_COUNT][2];
        final int rangeOFRandom = 1000;
        for (String[] roundQAndA : gameQAndA) {
            var number = Utils.generateNumber(rangeOFRandom);
            roundQAndA[0] = Integer.toString(number);
            roundQAndA[1] = (number % 2 == 0) ? "yes" : "no";
        }
        Engine.gamesEngine(gameQAndA, GAME_RULES);
    }
}

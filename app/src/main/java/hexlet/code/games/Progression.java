package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Progression {
    private static final String GAME_RULES = "What number is missing in the progression?";

    public static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + step * i);
        }
        return progression;
    }

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        final int progressionLength = 10;
        final int rangeOfRandom = 21;
        final int rangeOfProgressionStep = 11;
        String[] progression;
        for (String[] roundQAndA : gameAnswers) {
            var first = Utils.generateNumber(rangeOfRandom);
            var progressionStep =Utils.generateNumber(rangeOfProgressionStep);
            progression = makeProgression(first, progressionStep, progressionLength);
            var missingIndex = Utils.generateNumber(progressionLength);
            roundQAndA[1] = progression[missingIndex];
            progression[missingIndex] = "..";
            roundQAndA[0] = String.join(" ", progression);
        }
        Engine.gamesEngine(gameAnswers, GAME_RULES);
    }
}

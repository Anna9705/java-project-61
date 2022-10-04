package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
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
        var random = new Random();
        var first = 0;
        var progressionStep = 0;
        var missingIndex = 0;
        final int progressionLength = 10;
        final int rangeOfRandom = 21;
        final int rangeOfProgressionStep = 11;
        String[] progression;
        for (String[] roundQAndA : gameAnswers) {
            first = random.nextInt(rangeOfRandom);
            progressionStep = random.nextInt(rangeOfProgressionStep);
            progression = makeProgression(first, progressionStep, progressionLength);
            missingIndex = random.nextInt(progressionLength);
            roundQAndA[1] = progression[missingIndex];
            progression[missingIndex] = "..";
            roundQAndA[0] = String.join(" ", progression);
        }
        System.out.println(Engine.gamesEngine(gameAnswers, GAME_RULES));
    }
}

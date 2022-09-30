package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Progression {
    public static void progression(int roundsCount) {
        String gameRules = "What number is missing in the progression?";
        String[][] gameAnswers = new String[roundsCount][2];
        var random = new Random();
        var num1 = 0;
        var progressionStep = 0;
        var missingIndex = 0;
        final int progressionLength = 10;
        final int rangeOfRandom = 21;
        final int rangeOfProgressionStep = 11;
        for (var i = 0; i < roundsCount; i++) {
            num1 = random.nextInt(rangeOfRandom);
            progressionStep = random.nextInt(rangeOfProgressionStep);
            missingIndex = random.nextInt(progressionLength);
            gameAnswers[i][0] = "";
            for (var n = 0; n < progressionLength; n++) {
                if (n != missingIndex) {
                    gameAnswers[i][0] = gameAnswers[i][0] + num1 + " ";
                } else {
                    gameAnswers[i][0] = gameAnswers[i][0] + ".. ";
                    gameAnswers[i][1] = Integer.toString(num1);
                }
                num1 += progressionStep;
            }
        }
        Engine.gamesEngine(gameAnswers, gameRules);
    }
}

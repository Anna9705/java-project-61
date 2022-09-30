package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Gcd {
    public static int gcdCalc(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcdCalc(num2, num1 % num2);
        }
    }

    public static void gcdGame(int roundsCount) {
        String gameRules = "Find the greatest common divisor of given numbers";
        String[][] gameAnswers = new String[roundsCount][2];
        var random = new Random();
        var num1 = 0;
        var num2 = 0;
        final int rangeOfRandom = 11;
        for (var i = 0; i < roundsCount; i++) {
            num1 = random.nextInt(rangeOfRandom) * random.nextInt(rangeOfRandom);
            num2 = random.nextInt(rangeOfRandom) * random.nextInt(rangeOfRandom);
            gameAnswers[i][0] = num1 + " " + num2;
            gameAnswers[i][1] = Integer.toString(gcdCalc(num1, num2));
        }
        Engine.gamesEngine(gameAnswers, gameRules);
    }
}

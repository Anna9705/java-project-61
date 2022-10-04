package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Gcd {
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static int gcdCalc(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcdCalc(num2, num1 % num2);
        }
    }

    public static void runGame() {
        String[][] gameAnswers = new String[ROUNDS_COUNT][2];
        var random = new Random();
        var num1 = 0;
        var num2 = 0;
        final int rangeOfRandom = 11;
        for (String[] roundQAndA : gameAnswers) {
            num1 = random.nextInt(rangeOfRandom) * random.nextInt(rangeOfRandom);
            num2 = random.nextInt(rangeOfRandom) * random.nextInt(rangeOfRandom);
            roundQAndA[0] = num1 + " " + num2;
            roundQAndA[1] = Integer.toString(gcdCalc(num1, num2));
        }
        System.out.println(Engine.gamesEngine(gameAnswers, GAME_RULES));
    }
}

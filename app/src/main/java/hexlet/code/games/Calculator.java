package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Calculator {
    public static void calc(int roundsCount) {
        String gameRules = "What is the result of the expression?";
        String[][] gameAnswers = new String[roundsCount][2];
        var random = new Random();
        var num1 = 0;
        var num2 = 0;
        var calcMark = 0;
        final int rangeOfRandom = 100;
        final int marksAmount = 3;
        for (var i = 0; i < roundsCount; i++) {
            num1 = random.nextInt(rangeOfRandom);
            num2 = random.nextInt(rangeOfRandom);
            calcMark = random.nextInt(marksAmount + 1);
            switch (calcMark) {
                case 1:
                    gameAnswers[i][0] = num1 + " - " + num2;
                    gameAnswers[i][1] = Integer.toString(num1 - num2);
                    break;
                case 2:
                    gameAnswers[i][0] = num1 + " * " + num2;
                    gameAnswers[i][1] = Integer.toString(num1 * num2);
                    break;
                default:
                    gameAnswers[i][0] = num1 + " + " + num2;
                    gameAnswers[i][1] = Integer.toString(num1 + num2);
                    break;
            }
        }
        Engine.gamesEngine(gameAnswers, gameRules);
    }
}
